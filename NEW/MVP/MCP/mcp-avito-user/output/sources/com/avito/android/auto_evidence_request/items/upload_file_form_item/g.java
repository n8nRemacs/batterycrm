package com.avito.android.auto_evidence_request.items.upload_file_form_item;

import Ce.InterfaceC13293a;
import android.net.Uri;
import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.validation.Error;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UploadFileFormPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/g;", "LTV0/d;", "Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/i;", "Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements TV0.d<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13293a, G0> f95218b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC13293a, G0> lVar) {
        this.f95218b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        iVar.yg(cVar);
        Uri uri = cVar.f95206i;
        if (uri != null) {
            iVar.KI(uri);
        }
        iVar.HU(cVar.f95213p);
        iVar.XM(cVar.f95214q);
        iVar.yP(new d(this), cVar);
        iVar.An(cVar.f95212o);
        q qVar = cVar.f95205h;
        if (qVar instanceof q.d) {
            iVar.UH(cVar.f95207j, cVar.f95210m, cVar.f95201d, new e(this));
            return;
        }
        if (qVar instanceof q.c) {
            q.c cVar2 = (q.c) qVar;
            if (cVar2.f216338a.isEmpty()) {
                return;
            }
            Object objG = C42745f0.G(cVar2.f216338a);
            ImageUploadResult imageUploadResult = objG instanceof ImageUploadResult ? (ImageUploadResult) objG : null;
            iVar.D00(imageUploadResult != null ? imageUploadResult.getUploadId() : null, cVar.f95211n, cVar.f95201d, cVar.f95207j, new f(this));
            return;
        }
        if (!(qVar instanceof q.a)) {
            iVar.O8();
            return;
        }
        List<Error> list = cVar.f95204g;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((Error) next).getType(), "network")) {
                        break;
                    }
                }
            }
            Error error = (Error) next;
            if (error != null) {
                message = error.getMessage();
            }
        }
        iVar.QN(message);
    }
}
