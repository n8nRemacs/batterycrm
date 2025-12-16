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

/* compiled from: SlotPaymentInfoWidgetView.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/SlotPaymentInfoWidgetView;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotPaymentInfoWidgetView extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<t> f159901j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f159902k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f159903l;

    /* compiled from: SlotPaymentInfoWidgetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                SlotPaymentInfoWidgetView slotPaymentInfoWidgetView = SlotPaymentInfoWidgetView.this;
                i.c((t) ((C22082i3) slotPaymentInfoWidgetView.f159901j).getF42167b(), slotPaymentInfoWidgetView.f159902k, slotPaymentInfoWidgetView.f159903l, a13, 8, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SlotPaymentInfoWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            SlotPaymentInfoWidgetView.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    public /* synthetic */ SlotPaymentInfoWidgetView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(135056405);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1988288592, new a(), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    @X41.j
    public SlotPaymentInfoWidgetView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.f159901j = C22126m3.g(new t(null, null, null, null, 15, null));
    }
}
