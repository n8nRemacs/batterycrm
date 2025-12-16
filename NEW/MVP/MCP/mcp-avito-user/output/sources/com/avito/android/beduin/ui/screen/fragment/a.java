package com.avito.android.beduin.ui.screen.fragment;

import com.avito.android.analytics.screens.s;
import com.avito.android.beduin.di.InterfaceC28862y;
import com.avito.android.beduin.di.screen.b;
import com.avito.android.beduin.ui.screen.perf.BaseBeduinScreen;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBaseScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Lcom/avito/android/beduin/di/screen/b;", "invoke", "()Lcom/avito/android/beduin/di/screen/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<com.avito.android.beduin.di.screen.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseScreenFragment<i> f104146l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BeduinBaseScreenFragment<i> beduinBaseScreenFragment) {
        super(0);
        this.f104146l = beduinBaseScreenFragment;
    }

    @Override // Y41.a
    public final com.avito.android.beduin.di.screen.b invoke() {
        b.a aVarA = com.avito.android.beduin.di.screen.p.a();
        BeduinBaseScreenFragment<i> beduinBaseScreenFragment = this.f104146l;
        return aVarA.a((InterfaceC28862y) C29972i.a(C29972i.b(beduinBaseScreenFragment), InterfaceC28862y.class), (com.avito.android.beduin.di.screen.c) C29972i.a(C29972i.b(beduinBaseScreenFragment), com.avito.android.beduin.di.screen.c.class), (InterfaceC30106l7) C29972i.a(C29972i.b(beduinBaseScreenFragment), InterfaceC30106l7.class), cv.c.b(beduinBaseScreenFragment), (com.avito.android.universal_map.j) C29972i.a(C29972i.b(beduinBaseScreenFragment), com.avito.android.universal_map.j.class), new BaseBeduinScreen(beduinBaseScreenFragment.s5().f104143c), s.c(beduinBaseScreenFragment));
    }
}
