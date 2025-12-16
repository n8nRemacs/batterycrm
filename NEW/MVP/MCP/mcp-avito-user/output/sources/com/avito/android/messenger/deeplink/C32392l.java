package com.avito.android.messenger.deeplink;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deep_linking.links.PhoneLink;
import kotlin.Metadata;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32392l extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32402q f195523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f195524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f195525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32392l(C32402q c32402q, String str, DialogInterface dialogInterface) {
        super(0);
        this.f195523l = c32402q;
        this.f195524m = str;
        this.f195525n = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C32390k c32390k = new C32390k(this.f195525n);
        C32402q c32402q = this.f195523l;
        c32402q.getClass();
        c32390k.invoke();
        c32402q.i(ChannelCallLink.b.c.f133097b, c32402q.f195545i, new PhoneLink.Call(this.f195524m, null, 2, null));
        return kotlin.G0.f406611a;
    }
}
