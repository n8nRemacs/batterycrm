package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.Metadata;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f195330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CreateChannelLink f195331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C c12, CreateChannelLink createChannelLink) {
        super(0);
        this.f195330l = c12;
        this.f195331m = createChannelLink;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C c12 = this.f195330l;
        c12.f195304p.b(A1.e(ru.avito.messenger.G0.a(c12.f195299k).s(c12.f195301m.c()).n(new D(c12, this.f195331m)), E.f195322l, F.f195324l));
        return kotlin.G0.f406611a;
    }
}
