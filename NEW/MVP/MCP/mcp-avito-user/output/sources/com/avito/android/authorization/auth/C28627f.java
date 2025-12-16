package com.avito.android.authorization.auth;

import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.authorization.auth.AuthFragment;
import kotlin.G0;
import kotlin.Metadata;
import qK0.C47313c;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.auth.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28627f extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f93015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f93016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f93017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f93018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28627f(View view, com.avito.android.lib.design.bottom_sheet.d dVar, FrameLayout frameLayout, AuthFragment authFragment) {
        super(1);
        this.f93015l = view;
        this.f93016m = dVar;
        this.f93017n = frameLayout;
        this.f93018o = authFragment;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        h0 h0Var = new h0(view, this.f93015l, this.f93016m, this.f93017n);
        AuthFragment.a aVar = AuthFragment.f92815O0;
        AuthFragment authFragment = this.f93018o;
        C47313c c47313c = authFragment.f92823G0;
        kotlin.reflect.n<Object> nVar = AuthFragment.f92816P0[0];
        c47313c.b(authFragment, h0Var);
        InterfaceC28644x interfaceC28644x = authFragment.f92836y0;
        if (interfaceC28644x == null) {
            interfaceC28644x = null;
        }
        interfaceC28644x.e(h0Var);
        return G0.f406611a;
    }
}
