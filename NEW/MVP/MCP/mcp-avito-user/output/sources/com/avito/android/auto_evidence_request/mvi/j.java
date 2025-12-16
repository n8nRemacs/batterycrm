package com.avito.android.auto_evidence_request.mvi;

import Ce.C13296d;
import Ce.InterfaceC13295c;
import com.avito.android.arch.mvi.u;
import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.ImageUpload;
import com.avito.android.remote.model.ImageUploadPending;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoEvidenceRequestReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_evidence_request/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LCe/c;", "LCe/d;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<InterfaceC13295c, C13296d> {
    @Inject
    public j() {
    }

    public static boolean b(List list) {
        List<com.avito.conveyor_item.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (com.avito.conveyor_item.a aVar : list2) {
            if ((aVar instanceof com.avito.android.auto_evidence_request.items.upload_file_form_item.c) && (((com.avito.android.auto_evidence_request.items.upload_file_form_item.c) aVar).f95205h instanceof q.c)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList c(List list, String str, q qVar) {
        List<TV0.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TV0.a aVarA : list2) {
            if (aVarA instanceof com.avito.android.auto_evidence_request.items.upload_file_form_item.c) {
                com.avito.android.auto_evidence_request.items.upload_file_form_item.c cVar = (com.avito.android.auto_evidence_request.items.upload_file_form_item.c) aVarA;
                if (L.f(cVar.f95201d, str)) {
                    aVarA = com.avito.android.auto_evidence_request.items.upload_file_form_item.c.a(cVar, qVar, null, null, null, null, null, 57279);
                }
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13296d a(InterfaceC13295c interfaceC13295c, C13296d c13296d) {
        List<ImageUpload> list;
        InterfaceC13295c interfaceC13295c2 = interfaceC13295c;
        C13296d c13296d2 = c13296d;
        boolean z12 = interfaceC13295c2 instanceof InterfaceC13295c.s;
        List<com.avito.conveyor_item.a> list2 = c13296d2.f2565a;
        if (z12) {
            InterfaceC13295c.s sVar = (InterfaceC13295c.s) interfaceC13295c2;
            return C13296d.a(c13296d2, sVar.f2559a, sVar.f2560b, b(list2), sVar.f2561c, false, sVar.f2562d.f95284a, false, null, 160);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.g) {
            InterfaceC13295c.g gVar = (InterfaceC13295c.g) interfaceC13295c2;
            List<com.avito.conveyor_item.a> list3 = list2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (TV0.a aVarA : list3) {
                if (aVarA instanceof com.avito.android.auto_evidence_request.items.upload_file_form_item.c) {
                    com.avito.android.auto_evidence_request.items.upload_file_form_item.c cVar = (com.avito.android.auto_evidence_request.items.upload_file_form_item.c) aVarA;
                    if (L.f(cVar.f95201d, gVar.f2537a)) {
                        aVarA = com.avito.android.auto_evidence_request.items.upload_file_form_item.c.a(cVar, null, null, null, gVar.f2538b, null, null, 57343);
                    }
                }
                arrayList.add(aVarA);
            }
            return C13296d.a(c13296d2, arrayList, null, b(arrayList), null, false, null, false, null, 506);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.r) {
            return C13296d.a(c13296d2, null, null, false, null, true, null, false, null, 495);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.d) {
            return C13296d.a(c13296d2, null, null, false, null, false, null, false, null, 239);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.l) {
            InterfaceC13295c.l lVar = (InterfaceC13295c.l) interfaceC13295c2;
            ArrayList arrayListC = c(list2, lVar.f2547b, lVar.f2546a);
            return C13296d.a(c13296d2, arrayListC, null, b(arrayListC), null, false, null, false, null, 506);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.m) {
            InterfaceC13295c.m mVar = (InterfaceC13295c.m) interfaceC13295c2;
            List<com.avito.conveyor_item.a> list4 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
            for (TV0.a aVarA2 : list4) {
                if (aVarA2 instanceof com.avito.android.auto_evidence_request.items.upload_file_form_item.c) {
                    com.avito.android.auto_evidence_request.items.upload_file_form_item.c cVar2 = (com.avito.android.auto_evidence_request.items.upload_file_form_item.c) aVarA2;
                    if (L.f(cVar2.f95201d, mVar.f2549b)) {
                        q.d dVar = mVar.f2548a;
                        ImageUpload imageUpload = (dVar == null || (list = dVar.f216339a) == null) ? null : (ImageUpload) C42745f0.E(list);
                        ImageUploadPending imageUploadPending = imageUpload instanceof ImageUploadPending ? (ImageUploadPending) imageUpload : null;
                        aVarA2 = com.avito.android.auto_evidence_request.items.upload_file_form_item.c.a(cVar2, dVar, null, imageUploadPending != null ? Long.valueOf(imageUploadPending.getId()) : null, null, null, null, 57023);
                    }
                }
                arrayList2.add(aVarA2);
            }
            return C13296d.a(c13296d2, arrayList2, null, b(arrayList2), null, false, null, false, null, 506);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.n) {
            InterfaceC13295c.n nVar = (InterfaceC13295c.n) interfaceC13295c2;
            ArrayList arrayListC2 = c(list2, nVar.f2551b, nVar.f2550a);
            return C13296d.a(c13296d2, arrayListC2, null, b(arrayListC2), null, false, null, false, null, 506);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.C0118c) {
            return C13296d.a(c13296d2, null, null, true, null, false, null, false, null, 379);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.h) {
            return C13296d.a(c13296d2, null, null, false, null, false, null, true, null, 379);
        }
        if (!(interfaceC13295c2 instanceof InterfaceC13295c.o)) {
            return interfaceC13295c2 instanceof InterfaceC13295c.f ? C13296d.a(c13296d2, c(list2, ((InterfaceC13295c.f) interfaceC13295c2).f2536b, null), null, false, null, false, null, false, null, 506) : interfaceC13295c2 instanceof InterfaceC13295c.e ? C13296d.a(c13296d2, c(list2, ((InterfaceC13295c.e) interfaceC13295c2).f2534b, null), null, false, null, false, null, false, null, 506) : interfaceC13295c2 instanceof InterfaceC13295c.q ? C13296d.a(c13296d2, null, null, false, null, false, null, false, ((InterfaceC13295c.q) interfaceC13295c2).f2557a, 255) : c13296d2;
        }
        InterfaceC13295c.o oVar = (InterfaceC13295c.o) interfaceC13295c2;
        List<com.avito.conveyor_item.a> list5 = list2;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list5, 10));
        for (TV0.a aVarA3 : list5) {
            if (aVarA3 instanceof com.avito.android.auto_evidence_request.items.upload_file_form_item.c) {
                com.avito.android.auto_evidence_request.items.upload_file_form_item.c cVar3 = (com.avito.android.auto_evidence_request.items.upload_file_form_item.c) aVarA3;
                if (L.f(cVar3.f95201d, oVar.f2553b)) {
                    aVarA3 = com.avito.android.auto_evidence_request.items.upload_file_form_item.c.a(cVar3, null, oVar.f2552a, null, null, oVar.f2554c, oVar.f2555d, 16255);
                }
            }
            arrayList3.add(aVarA3);
        }
        return C13296d.a(c13296d2, arrayList3, null, false, null, false, null, false, null, 510);
    }
}
