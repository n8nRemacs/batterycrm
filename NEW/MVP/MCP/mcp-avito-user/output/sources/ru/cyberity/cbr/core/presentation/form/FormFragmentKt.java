package ru.cyberity.cbr.core.presentation.form;

import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FormFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "getFieldId", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)Lru/cyberity/cbr/core/presentation/form/FieldId;", "fieldId", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldId getFieldId(FormItem formItem) {
        String sectionId = formItem.getSectionId();
        if (sectionId == null) {
            sectionId = "";
        }
        String id2 = formItem.getItem().getId();
        return new FieldId(sectionId, id2 != null ? id2 : "");
    }
}
