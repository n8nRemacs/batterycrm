package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsingLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/common/view/e;", "Landroidx/compose/ui/input/nestedscroll/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f120723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f120724c;

    public e(InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12) {
        this.f120723b = interfaceC22192v1;
        this.f120724c = interfaceC22192v12;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        int i13 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i13) >= 0.0f) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        InterfaceC22192v1 interfaceC22192v1 = this.f120723b;
        float f12 = interfaceC22192v1.f();
        InterfaceC22192v1 interfaceC22192v12 = this.f120724c;
        if (f12 != (-interfaceC22192v12.f())) {
            return f.b(interfaceC22192v1, interfaceC22192v12, Float.intBitsToFloat(i13));
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        int i13 = (int) (4294967295L & j13);
        if (Float.intBitsToFloat(i13) <= 0.0f) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        InterfaceC22192v1 interfaceC22192v1 = this.f120723b;
        if (interfaceC22192v1.f() != 0.0f) {
            return f.b(interfaceC22192v1, this.f120724c, Float.intBitsToFloat(i13));
        }
        l0.g.f413384b.getClass();
        return 0L;
    }
}
