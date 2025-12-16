package ru.cyberity.cbr.presentation.screen.questionnary.model;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.presentation.form.FieldId;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: CBRQuestionnaireViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\u0003\u001a\u00020\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "fieldId", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "a", "", "b", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;)Z", "allItemsLoaded", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)Lru/cyberity/cbr/core/presentation/form/FieldId;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(HostViewModel.Page page) {
        List<FormItem> items = page.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            loop0: for (FormItem formItem : items) {
                if (formItem instanceof FormItem.FileAttachment) {
                    FormItem.FileAttachment fileAttachment = (FormItem.FileAttachment) formItem;
                    FormItem.ItemState fileState = fileAttachment.getFileState();
                    FormItem.ItemState itemState = FormItem.ItemState.DEFAULT;
                    if (fileState != itemState || fileAttachment.getState() != itemState) {
                        return false;
                    }
                } else if (formItem instanceof FormItem.MultiFileAttachments) {
                    FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) formItem;
                    List<FormItem.ItemState> fileStates = multiFileAttachments.getFileStates();
                    if (!(fileStates instanceof Collection) || !fileStates.isEmpty()) {
                        Iterator<T> it = fileStates.iterator();
                        while (it.hasNext()) {
                            if (((FormItem.ItemState) it.next()) == FormItem.ItemState.LOADING) {
                                break loop0;
                            }
                        }
                    }
                    if (multiFileAttachments.getState() != FormItem.ItemState.DEFAULT) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final FormItem a(@k List<HostViewModel.Page> list, @k FieldId fieldId) {
        FormItem formItem;
        Iterator<HostViewModel.Page> it = list.iterator();
        do {
            formItem = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = it.next().getItems().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (L.f(a((FormItem) next), fieldId)) {
                    formItem = next;
                    break;
                }
            }
            formItem = formItem;
        } while (formItem == null);
        return formItem;
    }

    @k
    public static final FieldId a(@k FormItem formItem) {
        String sectionId = formItem.getSectionId();
        if (sectionId == null) {
            sectionId = "";
        }
        String id2 = formItem.getItem().getId();
        return new FieldId(sectionId, id2 != null ? id2 : "");
    }
}
