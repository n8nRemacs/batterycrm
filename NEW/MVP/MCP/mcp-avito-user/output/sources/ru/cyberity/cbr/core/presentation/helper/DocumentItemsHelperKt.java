package ru.cyberity.cbr.core.presentation.helper;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.ApplicantStatus;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.ReviewAnswerType;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewItem;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo;
import ru.cyberity.cbr.core.widget.CBRStepState;

/* compiled from: DocumentItemsHelper.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0019\u001a\u00020\u0016*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "applicantStatus", "", "isTemporaryDeclined", "Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;", "params", "", "scene", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewItem;", "viewItemForDocument", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "getPOAGEOPrompt", "Lru/cyberity/cbr/core/data/model/Document$b$b;", "getRejectedStatus", "(Lru/cyberity/cbr/core/data/model/Document$b$b;)Ljava/lang/CharSequence;", "rejectedStatus", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getStepState", "(Lru/cyberity/cbr/core/data/model/Document;)Lru/cyberity/cbr/core/widget/CBRStepState;", "stepState", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class DocumentItemsHelperKt {

    /* compiled from: DocumentItemsHelper.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApplicantStatus.values().length];
            iArr[ApplicantStatus.Reviewing.ordinal()] = 1;
            iArr[ApplicantStatus.Submitting.ordinal()] = 2;
            iArr[ApplicantStatus.Reviewed.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final CharSequence getPOAGEOPrompt(c.C12476c c12476c, Document document, g gVar) {
        g.c.a aVarA;
        boolean z12 = (gVar == null || (aVarA = gVar.a(document.getType())) == null || !aVarA.t()) ? false : true;
        String value = document.getType().getValue();
        u0 u0Var = u0.f406856a;
        String str = String.format("cbr_step_%s_prompt", Arrays.copyOf(new Object[]{value}, 1));
        return c12476c.a(z12 ? String.format("cbr_step_%s_geolocation_prompt", Arrays.copyOf(new Object[]{value}, 1)) : str, str, "sns_step_defaults_prompt");
    }

    private static final CharSequence getRejectedStatus(Document.b.C12444b c12444b) {
        String strSubstring;
        String moderationComment = c12444b.getModerationComment();
        if (moderationComment == null) {
            return null;
        }
        int length = moderationComment.length();
        while (true) {
            length--;
            if (-1 >= length) {
                strSubstring = "";
                break;
            }
            if (moderationComment.charAt(length) != '\n') {
                strSubstring = moderationComment.substring(0, length + 1);
                break;
            }
        }
        return C43066x.A0(strSubstring).toString();
    }

    private static final CBRStepState getStepState(Document document) {
        if (!document.isSubmitted()) {
            return CBRStepState.INIT;
        }
        Document.b.C12444b review = document.getReview();
        if ((review != null ? review.getAnswer() : null) == ReviewAnswerType.Red) {
            return CBRStepState.REJECTED;
        }
        Document.b.C12444b review2 = document.getReview();
        return (review2 != null ? review2.getAnswer() : null) == ReviewAnswerType.Green ? CBRStepState.APPROVED : document.isRejected() ? CBRStepState.REJECTED : document.isApproved() ? CBRStepState.APPROVED : document.isSubmitted() ? CBRStepState.PENDING : document.isReviewing() ? CBRStepState.PENDING : CBRStepState.INIT;
    }

    @k
    public static final CBRDocumentViewItem viewItemForDocument(@k c.C12476c c12476c, @k Document document, @k ApplicantStatus applicantStatus, boolean z12, @k DocumentItemsParams documentItemsParams, @l String str) {
        CharSequence charSequenceA;
        CharSequence rejectedStatus;
        int i12 = WhenMappings.$EnumSwitchMapping$0[applicantStatus.ordinal()];
        CBRStepState stepState = i12 != 1 ? i12 != 2 ? (i12 == 3 && !document.isSubmitted() && z12) ? CBRStepState.REJECTED : getStepState(document) : !document.isSubmitted() ? CBRStepState.INIT : CBRStepState.PENDING : CBRStepState.PENDING;
        CharSequence charSequenceA2 = document.getType().a(c12476c);
        if (stepState == CBRStepState.PENDING) {
            charSequenceA = c12476c.a("sns_iddoc_status_reviewing");
        } else if (stepState == CBRStepState.REJECTED && !document.isSubmitted()) {
            charSequenceA = c12476c.a("sns_iddoc_status_notSubmitted");
        } else if (document.isRejected()) {
            Document.b.C12444b review = document.getReview();
            if (review == null || (rejectedStatus = getRejectedStatus(review)) == null) {
                charSequenceA = c12476c.a("sns_iddoc_status_declined");
                if (charSequenceA == null) {
                    charSequenceA = "Rejected";
                }
            } else {
                charSequenceA = rejectedStatus;
            }
        } else if (document.isApproved()) {
            charSequenceA = c12476c.a("sns_iddoc_status_approved");
        } else if (document.isReviewing() || document.isSubmitted()) {
            charSequenceA = c12476c.a("sns_iddoc_status_submitted");
        } else if (document.getType().h()) {
            charSequenceA = getPOAGEOPrompt(c12476c, document, documentItemsParams.getApplicant());
        } else {
            List<g.c.a> listG = documentItemsParams.getApplicant().getRequiredIdDocs().g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (L.f(((g.c.a) obj).getIdDocSetType(), document.getType())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42745f0.h(((g.c.a) it.next()).q(), arrayList2);
            }
            String strO = C42745f0.O(arrayList2, ", ", null, null, new DocumentItemsHelperKt$viewItemForDocument$docTypes$3(c12476c), 30);
            charSequenceA = (!L.f(str, "videoident") || C43066x.K(strO)) ? document.getType().a(c12476c, null).toString() : C43066x.a0(document.getType().a(c12476c, str).toString(), "{doctypes}", strO, false);
        }
        return new CBRDocumentViewItem(stepState, charSequenceA2, charSequenceA, stepState == CBRStepState.REJECTED, new CBRDocumentViewTypeInfo(CBRDocumentViewTypeInfo.Type.DOCUMENT, document));
    }

    public static /* synthetic */ CBRDocumentViewItem viewItemForDocument$default(c.C12476c c12476c, Document document, ApplicantStatus applicantStatus, boolean z12, DocumentItemsParams documentItemsParams, String str, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            str = null;
        }
        return viewItemForDocument(c12476c, document, applicantStatus, z13, documentItemsParams, str);
    }
}
