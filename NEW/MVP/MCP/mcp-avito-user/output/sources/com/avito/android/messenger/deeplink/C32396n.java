package com.avito.android.messenger.deeplink;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.ChannelCallLink;
import kotlin.Metadata;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32396n extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32402q f195531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f195532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32396n(C32402q c32402q, DialogInterface dialogInterface) {
        super(0);
        this.f195531l = c32402q;
        this.f195532m = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C32394m c32394m = new C32394m(this.f195532m);
        C32402q c32402q = this.f195531l;
        c32402q.getClass();
        c32394m.invoke();
        c32402q.j(ChannelCallLink.b.a.f133095b);
        return kotlin.G0.f406611a;
    }
}
