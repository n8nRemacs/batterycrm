package com.akita.compose.component.bottom_sheet.internal;

import Y41.p;
import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.window.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/internal/l;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/window/I;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class l extends AbstractC22450a implements I {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Window f60631j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f60632k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f60633l;

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            l.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    public l(@Y61.k Context context, @Y61.k Window window) {
        super(context, null, 0, 6, null);
        this.f60631j = window;
        k.f60628a.getClass();
        this.f60632k = C22126m3.g(k.f60629b);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l A a12, int i12) {
        B bE2 = a12.E(-632555625);
        ((p) ((C22082i3) this.f60632k).getF42167b()).invoke(bE2, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF35296q() {
        return this.f60633l;
    }

    @Override // androidx.compose.ui.window.I
    @Y61.k
    /* renamed from: getWindow, reason: from getter */
    public final Window getF43016j() {
        return this.f60631j;
    }
}
