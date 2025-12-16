package com.avito.android.advert.deeplinks;

import com.avito.android.advert.deeplinks.a;
import com.avito.android.advert.item.safedeal.X;
import kotlin.Metadata;

/* compiled from: AddItemToCartDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/safedeal/a;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/safedeal/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f69008b;

    public e(a aVar) {
        this.f69008b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.remote.safedeal.a aVar = (com.avito.android.remote.safedeal.a) obj;
        a.AbstractC2158a.b bVar = new a.AbstractC2158a.b(aVar);
        a aVar2 = this.f69008b;
        X xA2 = aVar2.f68890n.a(aVar, null, null);
        if (xA2 instanceof X.a) {
            aVar2.i(bVar, aVar2.f68885i, ((X.a) xA2).f78777a);
        } else if (xA2 instanceof X.b) {
            aVar2.f68891o.R(((X.b) xA2).f78778a, com.avito.android.deeplink_handler.view.b.f134588l);
            aVar2.j(bVar);
        } else if (xA2 == null) {
            aVar2.j(bVar);
        }
    }
}
