package com.avito.android.profile.user_profile.cards.passport;

import Ua0.InterfaceC15503a;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.j;
import com.avito.android.profile.user_profile.cards.l;
import com.avito.android.profile.user_profile.cards.m;
import com.avito.android.profile.user_profile.cards.n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/i;", "Lcom/avito/android/profile/user_profile/cards/passport/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/a;", "Lcom/avito/android/profile/user_profile/cards/h;", "Lcom/avito/android/profile/user_profile/cards/j;", "Lcom/avito/android/profile/user_profile/cards/e;", "Lcom/avito/android/profile/user_profile/cards/m;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h, com.avito.android.profile.user_profile.cards.a, com.avito.android.profile.user_profile.cards.h, j, com.avito.android.profile.user_profile.cards.e, m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.cards.b f225146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.cards.i f225147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f225148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.cards.g f225149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f225150f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.component.user_hat.h f225151g;

    public i(@k View view, @k l41.g<com.avito.android.component.user_hat.e> gVar) {
        super(view);
        this.f225146b = new com.avito.android.profile.user_profile.cards.b(view);
        this.f225147c = new com.avito.android.profile.user_profile.cards.i(view);
        this.f225148d = new l(view);
        this.f225149e = new com.avito.android.profile.user_profile.cards.g(view);
        View viewFindViewById = view.findViewById(R.id.user_hat);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225150f = new n(new com.avito.android.component.user_hat.d(viewFindViewById));
        View viewFindViewById2 = view.findViewById(R.id.user_hat);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225151g = new com.avito.android.component.user_hat.h(viewFindViewById2, gVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void B8() {
        this.f225150f.B8();
    }

    @Override // com.avito.android.profile.user_profile.cards.j
    public final void FT() {
        this.f225148d.FT();
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void J(@Y61.l String str) {
        this.f225150f.J(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.passport.h
    public final void R50(@k ArrayList arrayList) {
        com.avito.android.component.user_hat.h hVar = this.f225151g;
        ((com.avito.konveyor.adapter.h) hVar.f125309c.getValue()).f338510e = new UV0.c(arrayList);
        ((com.avito.konveyor.adapter.j) hVar.f125310d.getValue()).notifyDataSetChanged();
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void S2(@Y61.l String str, @Y61.l Float f12) {
        this.f225150f.S2(str, f12);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void SL(@k String str) {
        this.f225150f.SL(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void Y70(@k Y41.a<G0> aVar) {
        this.f225150f.Y70(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void bQ(@Y61.l String str) {
        this.f225147c.bQ(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void c00(@k String str) {
        this.f225146b.c00(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void eB(@k String str, @Y61.l String str2) {
        this.f225150f.eB(str, str2);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jm() {
        this.f225146b.jm();
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jx() {
        this.f225146b.jx();
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void lx(@k String str, @k String str2) {
        this.f225146b.lx(str, str2);
    }

    @Override // com.avito.android.profile.user_profile.cards.e
    public final void o60() {
        this.f225149e.o60();
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void sC(@Y61.l String str) {
        this.f225147c.sC(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.j
    public final void sZ(@k ReputationAndRatingCard reputationAndRatingCard, @k Y41.l<? super InterfaceC15503a, G0> lVar) {
        this.f225148d.sZ(reputationAndRatingCard, lVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.e
    public final void zP(@k DeliveryRestrictionCard deliveryRestrictionCard, @k Y41.l<? super DeepLink, G0> lVar) {
        this.f225149e.zP(deliveryRestrictionCard, lVar);
    }
}
