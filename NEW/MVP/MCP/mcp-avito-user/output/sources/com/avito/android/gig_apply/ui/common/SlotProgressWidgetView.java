package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AbstractC22450a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import pH.C46960h;

/* compiled from: SlotProgressWidget.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/SlotProgressWidgetView;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotProgressWidgetView extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f159906j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N0 f159907k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<u> f159908l;

    /* renamed from: m, reason: collision with root package name */
    public long f159909m;

    /* renamed from: n, reason: collision with root package name */
    public long f159910n;

    /* renamed from: o, reason: collision with root package name */
    public long f159911o;

    /* compiled from: SlotProgressWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            SlotProgressWidgetView.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    public /* synthetic */ SlotProgressWidgetView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(277246414);
        p.c((u) ((C22082i3) this.f159908l).getF42167b(), bE2, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12);
        }
    }

    public final void j(@Y61.k C46960h c46960h) {
        this.f159909m = c46960h.f428349c;
        this.f159910n = c46960h.f428350d;
        this.f159911o = c46960h.f428351e;
        InterfaceC22204y1<u> interfaceC22204y1 = this.f159908l;
        C22082i3 c22082i3 = (C22082i3) interfaceC22204y1;
        c22082i3.setValue(new u(c46960h.f428347a, c46960h.f428348b, 0.0f, 4, null));
        k();
        N0 n02 = this.f159907k;
        if (n02 == null || !((AbstractC43075a) n02).isActive()) {
            this.f159907k = C43259k.d(this.f159906j, null, null, new s(this, null), 3);
        }
    }

    public final void k() {
        long j12 = this.f159910n;
        long j13 = this.f159909m;
        float f12 = (this.f159911o - j13) / (j12 - j13);
        InterfaceC22204y1<u> interfaceC22204y1 = this.f159908l;
        u uVar = (u) ((C22082i3) interfaceC22204y1).getF42167b();
        String str = uVar.f159978a;
        String str2 = uVar.f159979b;
        uVar.getClass();
        ((C22082i3) interfaceC22204y1).setValue(new u(str, str2, f12));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N0 n02 = this.f159907k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }

    @X41.j
    public SlotProgressWidgetView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f159906j = U.a(K.f411877a);
        this.f159908l = C22126m3.g(new u(null, null, 0.0f, 7, null));
    }
}
