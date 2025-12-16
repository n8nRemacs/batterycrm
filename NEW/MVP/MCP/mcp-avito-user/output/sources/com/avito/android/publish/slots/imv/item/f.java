package com.avito.android.publish.slots.imv.item;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.category_parameters.slot.imv.NotificationInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstantMarketValueView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/imv/item/f;", "Lcom/avito/android/publish/slots/imv/item/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f244280g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f244281b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f244282c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f244283d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f244284e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ShimmerLayout f244285f;

    /* compiled from: InstantMarketValueView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f244286a;

        static {
            int[] iArr = new int[NotificationInfo.Type.values().length];
            try {
                iArr[NotificationInfo.Type.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f244286a = iArr;
        }
    }

    public f(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f244281b = view;
        this.f244282c = aVar;
        this.f244283d = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.instant_market_value_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f244284e = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.instant_market_value_skeleton);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f244285f = (ShimmerLayout) viewFindViewById2;
    }

    @Override // com.avito.android.publish.slots.imv.item.e
    public final void Af() {
        this.f244284e.removeAllViews();
    }

    @Override // com.avito.android.publish.slots.imv.item.e
    public final void MN(@k l lVar, @k List list) {
        OffsetLayout offsetLayout = new OffsetLayout(this.f244281b.getContext());
        D6.f(offsetLayout, 0, y6.b(8), 0, 0, 13);
        int iB2 = y6.b(8);
        int iB3 = y6.b(8);
        offsetLayout.f181410b = iB2;
        offsetLayout.f181411c = iB3;
        offsetLayout.requestLayout();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BubbleInfo bubbleInfo = (BubbleInfo) it.next();
            Button button = (Button) this.f244283d.inflate(R.layout.publish_market_value_bubble_item, (ViewGroup) null, false);
            button.setText(bubbleInfo.getText());
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(lVar, bubbleInfo, this, 11));
            offsetLayout.addView(button);
        }
        this.f244284e.addView(offsetLayout);
    }

    @Override // com.avito.android.publish.slots.imv.item.e
    public final void NV(@k AttributedText attributedText) {
        TextView textView = (TextView) this.f244283d.inflate(R.layout.publish_market_value_description_item, (ViewGroup) null, false);
        textView.setText(this.f244282c.c(this.f244281b.getContext(), attributedText));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f244284e.addView(textView);
    }

    @Override // com.avito.android.publish.slots.imv.item.e
    public final void YX(@k NotificationInfo notificationInfo) {
        AlertBanner alertBanner = (AlertBanner) this.f244283d.inflate(R.layout.publish_market_value_notification_item, (ViewGroup) null, false);
        alertBanner.getContent().a(notificationInfo.getText());
        NotificationInfo.Type type = notificationInfo.getType();
        if ((type == null ? -1 : a.f244286a[type.ordinal()]) == 1) {
            AlertBanner.h(alertBanner, R.attr.alertBannerWarning);
            alertBanner.getContent().b(C35835l0.h(R.attr.ic_attentionRound20, this.f244281b.getContext()));
        } else {
            AlertBanner.h(alertBanner, R.attr.alertBannerDefault);
            alertBanner.getContent().b(null);
        }
        this.f244284e.addView(alertBanner);
        D6.c(alertBanner, null, Integer.valueOf(y6.b(8)), null, Integer.valueOf(y6.b(8)), 5);
    }

    @Override // com.avito.android.publish.slots.imv.item.e
    public final void u5(boolean z12) {
        this.f244284e.setVisibility(!z12 ? 0 : 8);
        this.f244285f.setVisibility(z12 ? 0 : 8);
    }
}
