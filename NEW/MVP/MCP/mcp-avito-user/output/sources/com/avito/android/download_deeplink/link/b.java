package com.avito.android.download_deeplink.link;

import Ju.AbstractC14250d;
import com.avito.android.download_deeplink.link.d;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DownloadFileLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$b;", "status", "Lkotlin/G0;", "emit", "(Lcom/avito/android/download_deeplink/link/d$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f144914b;

    public b(a aVar) {
        this.f144914b = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        d.b bVar = (d.b) obj;
        boolean zF2 = L.f(bVar, d.b.c.f144925a);
        a aVar = this.f144914b;
        if (zF2) {
            aVar.j(AbstractC14250d.c.f9171c);
        } else if (bVar instanceof d.b.a) {
            V2.f318762a.d("DownloadFileLinkAsyncHandler", "Download failed, error code: " + ((d.b.a) bVar).f144923a);
            aVar.j(AbstractC14250d.b.f9170c);
        }
        return G0.f406611a;
    }
}
