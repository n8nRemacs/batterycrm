package com.avito.android.social_management;

import com.avito.android.social_management.adapter.SocialItem;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: SocialManagementPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SocialItem f284725c;

    public x(t tVar, SocialItem socialItem) {
        this.f284724b = tVar;
        this.f284725c = socialItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String type = ((SocialItem.Connected) this.f284725c).f284478c.getType();
        t tVar = this.f284724b;
        tVar.f284716t = true;
        I0 i0J0 = tVar.f284697a.d(type).j0(tVar.f284707k.e());
        H h12 = new H(tVar);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = i0J0.J(interfaceC43543a, h12);
        C35051s c35051s = new C35051s(tVar, 0);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        tVar.f284712p.b(com.avito.android.analytics.screens.utils.D.b(pJ2.H(gVar, gVar, interfaceC43543a, c35051s), tVar.f284709m, "deleteSocialAttempt", new I(tVar, type), new J(tVar), 4));
    }
}
