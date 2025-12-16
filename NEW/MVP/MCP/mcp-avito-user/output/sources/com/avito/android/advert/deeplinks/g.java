package com.avito.android.advert.deeplinks;

import com.avito.android.advert.deeplinks.a;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;

/* compiled from: AddItemToCartDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f69010b;

    public g(a aVar) {
        this.f69010b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        a aVar = this.f69010b;
        a.i.C4057a.d(aVar.f68883g, InterfaceC35741a1.a.a(aVar.f68886j, th2, null, f.f69009l, 2), null, null, new f.c(th2), 0, null, null, null, 2030);
        aVar.j(a.AbstractC2158a.C2159a.f68893b);
    }
}
