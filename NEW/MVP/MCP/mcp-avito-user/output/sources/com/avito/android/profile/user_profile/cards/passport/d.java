package com.avito.android.profile.user_profile.cards.passport;

import Ua0.InterfaceC15503a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f225139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f225140m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, DeepLink deepLink) {
        super(0);
        this.f225139l = fVar;
        this.f225140m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f225139l.f225142b.invoke(new InterfaceC15503a.l(this.f225140m));
        return G0.f406611a;
    }
}
