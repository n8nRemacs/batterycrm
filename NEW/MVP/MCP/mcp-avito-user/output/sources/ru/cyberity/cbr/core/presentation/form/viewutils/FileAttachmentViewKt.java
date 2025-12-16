package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;

/* compiled from: FileAttachmentView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$FileAttachment;", "item", "", "aValue", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$FileAttachment;Ljava/lang/String;)V", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FileAttachmentViewKt {
    public static final void setValueFromItem(@k CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView, @k FormItem.FileAttachment fileAttachment, @l String str) {
        if (str != null) {
            cBRApplicantDataFileFieldView.setFiles(Collections.singletonList(new CBRApplicantDataFileFieldView.Attachment(str, str, fileAttachment.getPreviewUrl())));
        }
        if (fileAttachment.getValue() == null) {
            cBRApplicantDataFileFieldView.setFiles(C42784z0.f406748b);
        }
        cBRApplicantDataFileFieldView.setShowPickFile(cBRApplicantDataFileFieldView.getFiles().isEmpty());
    }
}
