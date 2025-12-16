package com.avito.android.mortgage.document_upload.mvi;

import androidx.compose.runtime.internal.P;
import c00.InterfaceC26916b;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import d00.C39479c;
import f00.C40196c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentUploadReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lf00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<DocumentUploadInternalAction, C40196c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.document_upload.mvi.builder.a f199438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC26916b f199439c;

    @Inject
    public k(@Y61.k com.avito.android.mortgage.document_upload.mvi.builder.a aVar, @Y61.k InterfaceC26916b interfaceC26916b) {
        this.f199438b = aVar;
        this.f199439c = interfaceC26916b;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40196c a(DocumentUploadInternalAction documentUploadInternalAction, C40196c c40196c) {
        String str;
        DocumentUploadInternalAction documentUploadInternalAction2 = documentUploadInternalAction;
        C40196c c40196cA = c40196c;
        boolean z12 = documentUploadInternalAction2 instanceof DocumentUploadInternalAction.FileUpdated;
        List<C39479c> list = c40196cA.f395542b;
        if (z12) {
            DocumentUploadInternalAction.FileUpdated fileUpdated = (DocumentUploadInternalAction.FileUpdated) documentUploadInternalAction2;
            List<C39479c> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (C39479c c39479c : list2) {
                long j12 = c39479c.f393604a;
                C39479c c39479c2 = fileUpdated.f199409b;
                if (j12 == c39479c2.f393604a) {
                    c39479c = c39479c2;
                }
                arrayList.add(c39479c);
            }
            c40196cA = C40196c.a(c40196cA, arrayList, null, false, false, null, null, null, 1572862);
        } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.FilesAdded) {
            c40196cA = C40196c.a(C40196c.a(c40196cA, C42745f0.h0(((DocumentUploadInternalAction.FilesAdded) documentUploadInternalAction2).f199412b, list), null, false, false, null, null, null, 2097150), null, null, false, false, null, null, null, 1835007);
        } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.LocalFileDeleted) {
            DocumentUploadInternalAction.LocalFileDeleted localFileDeleted = (DocumentUploadInternalAction.LocalFileDeleted) documentUploadInternalAction2;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((C39479c) obj).f393604a != localFileDeleted.f199415b) {
                    arrayList2.add(obj);
                }
            }
            c40196cA = C40196c.a(c40196cA, arrayList2, null, false, false, null, null, null, 2097150);
        } else {
            boolean z13 = documentUploadInternalAction2 instanceof DocumentUploadInternalAction.RemoteFileDeleteFailed;
            Set<String> set = c40196cA.f395558r;
            if (z13) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, b1.e(set, ((DocumentUploadInternalAction.RemoteFileDeleteFailed) documentUploadInternalAction2).f199421b), null, null, 2031615);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.RemoteFileDeleteStarted) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, b1.i(set, ((DocumentUploadInternalAction.RemoteFileDeleteStarted) documentUploadInternalAction2).f199423b), null, null, 2031615);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.RemoteFileDeleted) {
                DocumentUploadInternalAction.RemoteFileDeleted remoteFileDeleted = (DocumentUploadInternalAction.RemoteFileDeleted) documentUploadInternalAction2;
                List<RemoteValidFile> list3 = c40196cA.f395543c;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = list3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = remoteFileDeleted.f199424b;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!L.f(((RemoteValidFile) next).getId(), str)) {
                        arrayList3.add(next);
                    }
                }
                c40196cA = C40196c.a(c40196cA, null, arrayList3, false, false, b1.e(set, str), null, null, 2031613);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.NavigateBack) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, null, null, null, 2097143);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.NavigationStarted) {
                c40196cA = C40196c.a(c40196cA, null, null, ((DocumentUploadInternalAction.NavigationStarted) documentUploadInternalAction2).f199418b, true, null, null, null, 2097139);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.OpenNextStepScreen ? true : documentUploadInternalAction2 instanceof DocumentUploadInternalAction.OpenPreviousStepScreen ? true : documentUploadInternalAction2 instanceof DocumentUploadInternalAction.NavigationFailure) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, null, null, null, 2097139);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.AddPhotoClick) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, null, ((DocumentUploadInternalAction.AddPhotoClick) documentUploadInternalAction2).f199407b, null, 1572863);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.AddFilesClick) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, null, ((DocumentUploadInternalAction.AddFilesClick) documentUploadInternalAction2).f199406b, null, 1572863);
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.ResetProcessId) {
                c40196cA = C40196c.a(c40196cA, null, null, false, false, null, null, null, 1572863);
            }
        }
        C40196c c40196cA2 = this.f199438b.a(c40196cA);
        this.f199439c.a(documentUploadInternalAction2, c40196cA2);
        return c40196cA2;
    }
}
