package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0005²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/android/safety/safety_settings/mvi/entity/a;", "Lkotlin/G0;", "onPositiveButtonClicked", "latestOnAction", "_avito_safety_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {

    /* compiled from: SafetySettingsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257927l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257928m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC49362a> f257929n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, InterfaceC43160i<? extends InterfaceC49362a> interfaceC43160i) {
            super(2);
            this.f257927l = lVar;
            this.f257928m = bVar;
            this.f257929n = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(a13);
                Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar = this.f257927l;
                com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(-720181897, new C34462w(lVar), a13), null, uVarA, null, null, null, androidx.compose.runtime.internal.r.c(1825794816, new C34464y(lVar, this.f257928m, this.f257929n, uVarA), a13), a13, 12582960, 117);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafetySettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257930l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC49362a> f257931m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257932n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.avito.android.safety.safety_settings.mvi.entity.b bVar, InterfaceC43160i<? extends InterfaceC49362a> interfaceC43160i, Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar, int i12) {
            super(2);
            this.f257930l = bVar;
            this.f257931m = interfaceC43160i;
            this.f257932n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar = this.f257932n;
            z.a(this.f257930l, this.f257931m, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.safety.safety_settings.mvi.entity.b bVar, @Y61.k InterfaceC43160i<? extends InterfaceC49362a> interfaceC43160i, @Y61.k Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(12914712);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1945580109, new a(lVar, bVar, interfaceC43160i), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(bVar, interfaceC43160i, lVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r26, Y41.l r27, androidx.compose.runtime.A r28, androidx.compose.ui.v r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.ui.z.b(int, Y41.l, androidx.compose.runtime.A, androidx.compose.ui.v, java.lang.String):void");
    }

    public static final void c(Y41.l lVar, List list, boolean z12, T1 t12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(428749500);
        w0 w0Var = (w0) com.avito.android.analytics.screens.compose.s.b(C34460u.f257900l, bE2);
        C22187u0.d(new C34453m(list, z12, w0Var, null), bE2, list);
        C20650b.a(R1.h(vVar, t12), w0Var, null, false, null, null, null, false, null, new C34458s(lVar, list), bE2, 0, 508);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C34459t(lVar, list, z12, t12, vVar, i12);
        }
    }
}
