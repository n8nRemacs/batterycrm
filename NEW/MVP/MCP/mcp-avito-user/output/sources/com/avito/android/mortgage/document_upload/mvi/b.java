package com.avito.android.mortgage.document_upload.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.deeplink.MortgageDocumentRequirementsLink;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import d00.C39479c;
import e00.C39840a;
import f00.C40196c;
import f00.InterfaceC40194a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DocumentUploadActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lf00/a;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lf00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40194a, DocumentUploadInternalAction, C40196c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.document_upload.interactor.f f199398a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.document_upload.interactor.k f199399b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f199400c;

    @Inject
    public b(@Y61.k com.avito.android.mortgage.document_upload.interactor.f fVar, @Y61.k com.avito.android.mortgage.document_upload.interactor.k kVar, @Y61.k com.avito.android.mortgage.util.d dVar) {
        this.f199398a = fVar;
        this.f199399b = kVar;
        this.f199400c = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DocumentUploadInternalAction> b(InterfaceC40194a interfaceC40194a, C40196c c40196c) {
        C43210w c43210w;
        InterfaceC40194a interfaceC40194a2 = interfaceC40194a;
        C40196c c40196c2 = c40196c;
        Object obj = null;
        if (interfaceC40194a2 instanceof InterfaceC40194a.C11119a) {
            return C43175k.G(new a(this, c40196c2, interfaceC40194a2, null));
        }
        boolean z12 = interfaceC40194a2 instanceof InterfaceC40194a.f;
        List<C39479c> list = c40196c2.f395542b;
        if (z12) {
            C39840a c39840a = ((InterfaceC40194a.f) interfaceC40194a2).f395528a;
            boolean z13 = c39840a.f394250h;
            com.avito.android.mortgage.document_upload.interactor.f fVar = this.f199398a;
            String str = c40196c2.f395553m;
            String str2 = c40196c2.f395552l;
            if (!z13) {
                if (!c39840a.f394251i) {
                    return C43175k.w();
                }
                String str3 = c39840a.f394243a;
                return str3 == null ? C43175k.w() : fVar.d(str3, str2, str);
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(String.valueOf(((C39479c) next).f393604a), c39840a.f394244b)) {
                    obj = next;
                    break;
                }
            }
            C39479c c39479c = (C39479c) obj;
            return c39479c == null ? C43175k.w() : fVar.c(c39479c, str2, str);
        }
        boolean z14 = interfaceC40194a2 instanceof InterfaceC40194a.j;
        com.avito.android.mortgage.document_upload.interactor.k kVar = this.f199399b;
        if (z14) {
            return kVar.c(c40196c2);
        }
        if (interfaceC40194a2 instanceof InterfaceC40194a.i) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (L.f(String.valueOf(((C39479c) next2).f393604a), ((InterfaceC40194a.i) interfaceC40194a2).f395531a.f394244b)) {
                    obj = next2;
                    break;
                }
            }
            C39479c c39479c2 = (C39479c) obj;
            if (c39479c2 == null) {
                return C43175k.w();
            }
            return this.f199398a.e(c39479c2, c40196c2.f395552l, c40196c2.f395553m, c40196c2.f395554n, c40196c2.f395561u);
        }
        if (interfaceC40194a2 instanceof InterfaceC40194a.d) {
            return kVar.b(c40196c2, ((InterfaceC40194a.d) interfaceC40194a2).f395526a);
        }
        if (interfaceC40194a2 instanceof InterfaceC40194a.e) {
            c43210w = new C43210w(DocumentUploadInternalAction.CloseAllDocumentsScreens.f199408b);
        } else {
            boolean z15 = interfaceC40194a2 instanceof InterfaceC40194a.b;
            com.avito.android.mortgage.util.d dVar = this.f199400c;
            if (z15) {
                dVar.getClass();
                c43210w = new C43210w(new DocumentUploadInternalAction.AddFilesClick(com.avito.android.mortgage.util.d.a()));
            } else if (interfaceC40194a2 instanceof InterfaceC40194a.c) {
                dVar.getClass();
                c43210w = new C43210w(new DocumentUploadInternalAction.AddPhotoClick(com.avito.android.mortgage.util.d.a()));
            } else {
                if (interfaceC40194a2 instanceof InterfaceC40194a.h) {
                    DeepLink mortgageDocumentRequirementsLink = ((InterfaceC40194a.h) interfaceC40194a2).f395530a;
                    if (mortgageDocumentRequirementsLink instanceof MortgageDocumentRequirementsLink) {
                        MortgageDocumentRequirementsLink mortgageDocumentRequirementsLink2 = (MortgageDocumentRequirementsLink) mortgageDocumentRequirementsLink;
                        mortgageDocumentRequirementsLink = new MortgageDocumentRequirementsLink(mortgageDocumentRequirementsLink2.f198699b, mortgageDocumentRequirementsLink2.f198700c, c40196c2.f395555o);
                    }
                    return new C43210w(new DocumentUploadInternalAction.HandleDeeplink(mortgageDocumentRequirementsLink));
                }
                if (!(interfaceC40194a2 instanceof InterfaceC40194a.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(DocumentUploadInternalAction.ResetProcessId.f199425b);
            }
        }
        return c43210w;
    }
}
