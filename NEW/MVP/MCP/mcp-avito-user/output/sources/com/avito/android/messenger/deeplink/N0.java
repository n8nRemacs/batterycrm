package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.SendMessageByItemLink;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.Metadata;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O0 f195379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SendMessageByItemLink f195380m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(O0 o02, SendMessageByItemLink sendMessageByItemLink) {
        super(0);
        this.f195379l = o02;
        this.f195380m = sendMessageByItemLink;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        O0 o02 = this.f195379l;
        SendMessageByItemLink sendMessageByItemLink = this.f195380m;
        o02.f195395n.b(A1.e(O0.k(o02, sendMessageByItemLink.f133650b, sendMessageByItemLink.f133651c, sendMessageByItemLink.f133652d), new L0(o02, sendMessageByItemLink), new M0(o02)));
        return kotlin.G0.f406611a;
    }
}
