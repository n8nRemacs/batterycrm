package com.avito.android.login_suggests_impl;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoginSuggestsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.login_suggests_impl.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31606a extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LoginSuggestsActivity f182862l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31606a(LoginSuggestsActivity loginSuggestsActivity) {
        super(1);
        this.f182862l = loginSuggestsActivity;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        LoginSuggestsActivity loginSuggestsActivity = this.f182862l;
        m mVar = loginSuggestsActivity.f182851o;
        if (mVar == null) {
            mVar = null;
        }
        com.avito.konveyor.adapter.a aVar = loginSuggestsActivity.f182849m;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = loginSuggestsActivity.f182850n;
        mVar.a(new A(view2, aVar2 != null ? aVar2 : null, aVar));
        return G0.f406611a;
    }
}
