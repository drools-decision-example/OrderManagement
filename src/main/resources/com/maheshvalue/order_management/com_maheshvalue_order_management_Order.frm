{"id":"17661778-10f2-40e0-8907-1004daf38da7","name":"com_maheshvalue_order_management_Order","model":{"source":"INTERNAL","className":"com.maheshvalue.order_management.Order","name":"Order","properties":[{"name":"supplierName","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"supplierName"},{"name":"field-placeHolder","value":"supplierName"}]}},{"name":"orderType","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"orderType"},{"name":"field-placeHolder","value":"orderType"}]}},{"name":"orderQty","typeInfo":{"type":"BASE","className":"java.lang.Integer","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"orderQty"},{"name":"field-placeHolder","value":"orderQty"}]}},{"name":"orderCode","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"orderCode"},{"name":"field-placeHolder","value":"orderCode"}]}},{"name":"supplierCode","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"supplierCode"},{"name":"field-placeHolder","value":"supplierCode"}]}},{"name":"orderDate","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"orderDate"},{"name":"field-placeHolder","value":"orderDate"}]}},{"name":"orderTotal","typeInfo":{"type":"BASE","className":"java.lang.Integer","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"orderTotal"},{"name":"field-placeHolder","value":"orderTotal"}]}}],"formModelType":"org.kie.workbench.common.forms.data.modeller.model.DataObjectFormModel"},"fields":[{"maxLength":100,"placeHolder":"supplierName","id":"field_2110468906042197E12","name":"supplierName","label":"supplierName","required":false,"readOnly":false,"validateOnChange":true,"binding":"supplierName","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"orderType","id":"field_444097142091241E11","name":"orderType","label":"orderType","required":false,"readOnly":false,"validateOnChange":true,"binding":"orderType","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"placeHolder":"orderQty","maxLength":100,"id":"field_050261963287779E12","name":"orderQty","label":"orderQty","required":false,"readOnly":false,"validateOnChange":true,"binding":"orderQty","standaloneClassName":"java.lang.Integer","code":"IntegerBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.integerBox.definition.IntegerBoxFieldDefinition"},{"maxLength":100,"placeHolder":"orderCode","id":"field_028437913727026E11","name":"orderCode","label":"orderCode","required":false,"readOnly":false,"validateOnChange":true,"binding":"orderCode","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"supplierCode","id":"field_481154290555671E11","name":"supplierCode","label":"supplierCode","required":false,"readOnly":false,"validateOnChange":true,"binding":"supplierCode","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"orderDate","id":"field_420056849480082E11","name":"orderDate","label":"orderDate","required":false,"readOnly":false,"validateOnChange":true,"binding":"orderDate","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"placeHolder":"orderTotal","maxLength":100,"id":"field_5569879651021118E12","name":"orderTotal","label":"orderTotal","required":false,"readOnly":false,"validateOnChange":true,"binding":"orderTotal","standaloneClassName":"java.lang.Integer","code":"IntegerBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.integerBox.definition.IntegerBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_2110468906042197E12","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_444097142091241E11","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_050261963287779E12","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_028437913727026E11","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_481154290555671E11","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_420056849480082E11","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_5569879651021118E12","form_id":"17661778-10f2-40e0-8907-1004daf38da7"},"parts":[]}]}]}]}}