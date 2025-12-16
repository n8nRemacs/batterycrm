package com.avito.android.iac_dialer_ui.pub.util;

import Y41.l;
import Y41.p;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: KeepScreenOn.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: KeepScreenOn.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f167760l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(1);
            this.f167760l = view;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            View view = this.f167760l;
            view.setKeepScreenOn(true);
            return new com.avito.android.iac_dialer_ui.pub.util.b(view);
        }
    }

    /* compiled from: KeepScreenOn.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            c.a(a12, C22066f2.a(1));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.l A a12, int i12) {
        B bE2 = a12.E(-1247611730);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C22187u0.a(G0.f406611a, new a((View) bE2.o(AndroidCompositionLocals_androidKt.f41073f)), bE2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(2);
        }
    }
}
