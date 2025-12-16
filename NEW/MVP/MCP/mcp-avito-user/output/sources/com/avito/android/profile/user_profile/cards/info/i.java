package com.avito.android.profile.user_profile.cards.info;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.user_hat.j;
import com.avito.android.profile.user_profile.cards.m;
import com.avito.android.profile.user_profile.cards.n;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InfoCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/info/i;", "Lcom/avito/android/profile/user_profile/cards/info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/a;", "Lcom/avito/android/profile/user_profile/cards/h;", "Lcom/avito/android/profile/user_profile/cards/m;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h, com.avito.android.profile.user_profile.cards.a, com.avito.android.profile.user_profile.cards.h, m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.cards.b f224998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.cards.i f224999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f225000d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f225001e;

    /* compiled from: InfoCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225002l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225002l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225002l.invoke();
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f224998b = new com.avito.android.profile.user_profile.cards.b(view);
        this.f224999c = new com.avito.android.profile.user_profile.cards.i(view);
        View viewFindViewById = view.findViewById(R.id.user_hat);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225000d = new n(new com.avito.android.component.user_hat.d(viewFindViewById));
        View viewFindViewById2 = view.findViewById(R.id.user_hat);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225001e = new j(viewFindViewById2);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void B8() {
        this.f225000d.B8();
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void J(@l String str) {
        this.f225000d.J(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void S2(@l String str, @l Float f12) {
        this.f225000d.S2(str, f12);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void SL(@k String str) {
        this.f225000d.SL(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void Y70(@k Y41.a<G0> aVar) {
        this.f225000d.Y70(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void bQ(@l String str) {
        this.f224999c.bQ(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void c00(@k String str) {
        this.f224998b.c00(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void eB(@k String str, @l String str2) {
        this.f225000d.eB(str, str2);
    }

    @Override // com.avito.android.profile.user_profile.cards.info.h
    public final void g40(@l Avatar avatar) {
        Image image;
        j jVar = this.f225001e;
        jVar.getClass();
        if (avatar == null || (image = avatar.getImage()) == null) {
            return;
        }
        com.avito.android.component.user_hat.b.a(jVar.f125360a, com.avito.android.image_loader.b.b(image), avatar.getShape() == AvatarShape.CIRCLE, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jm() {
        this.f224998b.jm();
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jx() {
        this.f224998b.jx();
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void lx(@k String str, @k String str2) {
        this.f224998b.lx(str, str2);
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void sC(@l String str) {
        this.f224999c.sC(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.info.h
    public final void zX(@k Y41.a<G0> aVar) {
        this.f225001e.f125360a.setOnClickListener(new com.avito.android.calltracking.item.m(29, new a(aVar)));
    }
}
