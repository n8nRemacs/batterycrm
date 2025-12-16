package com.avito.android.messenger.channels.filter;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsFilterDialogBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/filter/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f187151H = 0;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f187152E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f187153F;

    /* renamed from: G, reason: collision with root package name */
    public SegmentedControl f187154G;

    /* compiled from: ChannelsFilterDialogBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            d dVar = (d) this.receiver;
            int i12 = d.f187151H;
            dVar.getClass();
            View viewFindViewById = view.findViewById(R.id.chats_filter_control);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.segmented_control.SegmentedControl");
            }
            SegmentedControl segmentedControl = (SegmentedControl) viewFindViewById;
            segmentedControl.q(dVar.f187152E ? 1 : 0, C42745f0.U(segmentedControl.getContext().getString(R.string.messenger_filter_all), segmentedControl.getContext().getString(R.string.messenger_filter_unread)));
            segmentedControl.setOnSegmentClickListener(new e(dVar));
            dVar.f187154G = segmentedControl;
            ((Button) view.findViewById(R.id.chats_filter_select_button)).setOnClickListener(new com.avito.android.imv_similiar_adverts.h(dVar, 29));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelsFilterDialogBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            SegmentedControl segmentedControl = dVar.f187154G;
            if (segmentedControl == null) {
                segmentedControl = null;
            }
            SegmentedControl.t(segmentedControl, 0, true, 4);
            dVar.x(false);
            dVar.w(false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, boolean z12, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        super(context, 0, 2, null);
        this.f187152E = z12;
        this.f187153F = lVar;
        C(R.layout.chat_list_filter_sheet, new a(1, this, d.class, "createView", "createView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        L(context.getString(R.string.messenger_filter_title), context.getString(R.string.messenger_filter_reset), true, true);
        P(new b());
        x(z12);
        w(z12);
    }
}
