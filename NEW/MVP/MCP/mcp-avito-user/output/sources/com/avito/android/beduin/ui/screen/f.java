package com.avito.android.beduin.ui.screen;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;

/* compiled from: ScreenRootViewModelFactoryProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/f;", "Landroidx/lifecycle/P0$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f104116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeduinScreenRootOpenParams f104117b;

    public f(g gVar, BeduinScreenRootOpenParams beduinScreenRootOpenParams) {
        this.f104116a = gVar;
        this.f104117b = beduinScreenRootOpenParams;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        g gVar = this.f104116a;
        return new e(gVar.f104393a, this.f104117b);
    }
}
