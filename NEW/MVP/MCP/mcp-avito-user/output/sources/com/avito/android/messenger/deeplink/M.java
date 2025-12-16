package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.Metadata;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f195365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CreateChannelLink f195366m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f195367n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C c12, CreateChannelLink createChannelLink, String str) {
        super(0);
        this.f195365l = c12;
        this.f195366m = createChannelLink;
        this.f195367n = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        final C c12 = this.f195365l;
        CreateChannelLink createChannelLink = this.f195366m;
        final String str = createChannelLink.f133130b;
        io.reactivex.rxjava3.internal.operators.observable.T tA2 = ru.avito.messenger.G0.a(c12.f195299k);
        InterfaceC35745a5 interfaceC35745a5 = c12.f195301m;
        final io.reactivex.rxjava3.internal.operators.single.S s5 = tA2.s(interfaceC35745a5.c());
        final String str2 = createChannelLink.f133133e;
        final String str3 = createChannelLink.f133136h;
        final String str4 = this.f195367n;
        c12.f195304p.b(A1.e(new C42007e(new l41.s() { // from class: com.avito.android.messenger.deeplink.B
            @Override // l41.s
            public final Object get() {
                io.reactivex.rxjava3.subjects.h hVar = new io.reactivex.rxjava3.subjects.h();
                io.reactivex.rxjava3.subjects.h hVar2 = new io.reactivex.rxjava3.subjects.h();
                C c13 = c12;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                hVar.n(new I(c13, str5, str6, str7)).n(new J(c13, str4, str7)).a(hVar2);
                s5.a(hVar);
                return new C42017o(hVar2, new com.avito.android.advert_core.task.a(10));
            }
        }).z(interfaceC35745a5.a()).s(interfaceC35745a5.e()), new K(c12, createChannelLink), new L(c12, createChannelLink)));
        return kotlin.G0.f406611a;
    }
}
