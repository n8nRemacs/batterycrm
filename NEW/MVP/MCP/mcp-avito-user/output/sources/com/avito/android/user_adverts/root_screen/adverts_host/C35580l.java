package com.avito.android.user_adverts.root_screen.adverts_host;

import android.view.View;
import androidx.view.C22984Q;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import kotlin.Metadata;
import zI0.C50473c;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h;", "invoke", "()Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35580l extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f313105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f313106m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f313107n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35580l(UserAdvertsHostFragment userAdvertsHostFragment, View view, InterfaceC50474d interfaceC50474d) {
        super(0);
        this.f313105l = userAdvertsHostFragment;
        this.f313106m = view;
        this.f313107n = interfaceC50474d;
    }

    @Override // Y41.a
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h invoke() {
        UserAdvertsHostFragment userAdvertsHostFragment = this.f313105l;
        h.c cVar = userAdvertsHostFragment.f312306P0;
        if (cVar == null) {
            cVar = null;
        }
        return cVar.a(this.f313106m, C50473c.a(this.f313107n.getState().getValue()), C22984Q.a(userAdvertsHostFragment.getViewLifecycleOwner()), userAdvertsHostFragment);
    }
}
