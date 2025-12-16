package com.avito.android.profile.user_profile.cards.promoBanner;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.PromoBanner;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.PromoBanner f225246l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f225247m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardItem.PromoBanner promoBanner, e eVar) {
        super(0);
        this.f225246l = promoBanner;
        this.f225247m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PromoBanner.ClickAction clickAction = this.f225246l.f224497h;
        if (clickAction != null) {
            e eVar = this.f225247m;
            eVar.f225249c.invoke(new InterfaceC15503a.r(clickAction));
        }
        return G0.f406611a;
    }
}
