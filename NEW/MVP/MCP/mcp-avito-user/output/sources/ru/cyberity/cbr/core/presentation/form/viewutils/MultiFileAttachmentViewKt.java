package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.math.b;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;

/* compiled from: MultiFileAttachmentView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "item", "", "", "aValues", "Lkotlin/G0;", "setValuesFromQuestionnaire", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;Ljava/util/List;)V", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "", "isRequired", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;)Z", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiFileAttachmentViewKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isRequired(@Y61.k ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView r8, @Y61.k ru.cyberity.cbr.core.presentation.form.model.FormItem.MultiFileAttachments r9) {
        /*
            ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView r8 = (ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView) r8
            java.util.List r8 = r8.getFiles()
            boolean r8 = r8.isEmpty()
            ru.cyberity.cbr.core.data.source.applicant.remote.h r0 = r9.getItem()
            ru.cyberity.cbr.core.data.model.q r0 = ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt.getFieldFormat(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L44
            boolean r3 = r0 instanceof ru.cyberity.cbr.core.data.model.q.d
            if (r3 == 0) goto L2a
            r3 = r0
            ru.cyberity.cbr.core.data.model.q$d r3 = (ru.cyberity.cbr.core.data.model.q.d) r3
            ru.cyberity.cbr.core.data.source.applicant.remote.g r3 = r3.getValue()
            double r3 = r3.getMin()
            int r3 = (int) r3
            if (r3 <= 0) goto L2a
            r3 = r2
            goto L2b
        L2a:
            r3 = r1
        L2b:
            boolean r4 = r0 instanceof ru.cyberity.cbr.core.data.model.q.j
            if (r4 == 0) goto L3d
            ru.cyberity.cbr.core.data.model.q$j r0 = (ru.cyberity.cbr.core.data.model.q.j) r0
            double r4 = r0.getValue()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r3 != 0) goto L42
            if (r0 == 0) goto L44
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r1
        L45:
            boolean r9 = r9.isRequired()
            if (r9 != 0) goto L4f
            if (r8 != 0) goto L50
            if (r0 == 0) goto L50
        L4f:
            r1 = r2
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.form.viewutils.MultiFileAttachmentViewKt.isRequired(ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView, ru.cyberity.cbr.core.presentation.form.model.FormItem$MultiFileAttachments):boolean");
    }

    public static final void setValuesFromQuestionnaire(@k CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView, @k FormItem.MultiFileAttachments multiFileAttachments, @l List<String> list) {
        if (list != null) {
            List<String> list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (String str : list2) {
                    Map<String, String> previewUrls = multiFileAttachments.getPreviewUrls();
                    arrayList.add(new CBRApplicantDataFileFieldView.Attachment(str, str, previewUrls != null ? previewUrls.get(str) : null));
                }
                cBRApplicantDataFileFieldView.setFiles(arrayList);
            }
        }
        if (list == null) {
            cBRApplicantDataFileFieldView.setFiles(C42784z0.f406748b);
        }
        q fieldFormat = QuestionnaireResponseExtensionsKt.getFieldFormat(multiFileAttachments.getItem());
        cBRApplicantDataFileFieldView.setShowPickFile((fieldFormat instanceof q.h ? b.a(((q.h) fieldFormat).getValue() - ((double) cBRApplicantDataFileFieldView.getFiles().size())) : fieldFormat instanceof q.d ? b.a(((q.d) fieldFormat).getValue().getMax() - ((double) cBRApplicantDataFileFieldView.getFiles().size())) : Integer.MAX_VALUE) > 0);
    }
}
