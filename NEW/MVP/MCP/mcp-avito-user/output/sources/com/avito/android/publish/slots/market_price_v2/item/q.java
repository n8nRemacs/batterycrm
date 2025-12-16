package com.avito.android.publish.slots.market_price_v2.item;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MarketPriceV2View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/market_price_v2/item/q;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/market_price_v2/item/p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q extends com.avito.konveyor.adapter.b implements p {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f244589b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f244590c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f244591d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f244592e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f244593f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f244594g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f244595h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Context f244596i;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f244597b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f244598c;

        public a(Y41.a aVar, View view) {
            this.f244597b = aVar;
            this.f244598c = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f244597b.invoke();
            this.f244598c.removeOnLayoutChangeListener(this);
        }
    }

    public q(@Y61.k View view) {
        super(view);
        this.f244589b = (TextView) view.findViewById(R.id.market_price_description);
        this.f244590c = (TextView) view.findViewById(R.id.market_price_highlighted_text);
        this.f244591d = (TextView) view.findViewById(R.id.market_price_badge_text);
        TextView textView = (TextView) view.findViewById(R.id.market_price_details);
        this.f244592e = textView;
        this.f244593f = (LinearLayout) view.findViewById(R.id.notices_container);
        this.f244594g = (TextView) view.findViewById(R.id.callout);
        this.f244595h = (TextView) view.findViewById(R.id.market_price_comment_title);
        this.f244596i = view.getContext();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void BC(@Y61.l String str) {
        I5.a(this.f244590c, str, false);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void Bx() {
        LinearLayout linearLayout = this.f244593f;
        linearLayout.removeAllViews();
        D6.w(linearLayout);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void PR(@Y61.l CharSequence charSequence) {
        I5.a(this.f244591d, charSequence, false);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void TS(@Y61.l Integer num, @Y61.k String str) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f244596i);
        LinearLayout linearLayout = this.f244593f;
        LinearLayout linearLayout2 = (LinearLayout) layoutInflaterFrom.inflate(R.layout.market_price_notice, (ViewGroup) linearLayout, false);
        ((TextView) linearLayout2.findViewById(R.id.notice)).setText(str);
        if (num != null) {
            View viewFindViewById = linearLayout2.findViewById(R.id.mark);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(num.intValue());
            viewFindViewById.setBackground(shapeDrawable);
            D6.H(viewFindViewById);
        }
        linearLayout.addView(linearLayout2);
        D6.H(linearLayout);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void bY(@Y61.l String str) {
        I5.a(this.f244595h, str, false);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void dl(@Y61.k CharSequence charSequence) {
        this.f244589b.setText(charSequence);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF244596i() {
        return this.f244596i;
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void rk(@Y61.l String str) {
        I5.a(this.f244594g, str, false);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.p
    public final void zE(@Y61.l CharSequence charSequence, @Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f244592e;
        I5.a(textView, charSequence, false);
        if (aVar != null) {
            textView.addOnLayoutChangeListener(new a(aVar, textView));
        }
    }
}
