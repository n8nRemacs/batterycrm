package com.avito.android.advert.item.marketplace_stocks;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.remote.marketplace.MarketplaceStocks;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MarketplaceStocksView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/marketplace_stocks/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/marketplace_stocks/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f77607b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f77608c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77609d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AnimationView f77610e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProgressBar f77611f;

    /* compiled from: MarketplaceStocksView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77612a;

        static {
            int[] iArr = new int[MarketplaceStocks.Alignment.values().length];
            try {
                iArr[MarketplaceStocks.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketplaceStocks.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f77612a = iArr;
        }
    }

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f77607b = view;
        this.f77608c = aVar;
        View viewFindViewById = view.findViewById(R.id.marketplace_stocks_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77609d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.marketplace_stocks_animation_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
        }
        this.f77610e = (AnimationView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.marketplace_stocks_progress_bar_static);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
        }
        this.f77611f = (ProgressBar) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.marketplace_stocks.f
    public final void mM(@k MarketplaceStocks marketplaceStocks) {
        String valueDark;
        MarketplaceStocks.Description description = marketplaceStocks.getDescription();
        MarketplaceStocks.Description.Text text = description != null ? description.getText() : null;
        MarketplaceStocks.Description description2 = marketplaceStocks.getDescription();
        MarketplaceStocks.Description.AnimationUrl animationUrl = description2 != null ? description2.getAnimationUrl() : null;
        AnimationView animationView = this.f77610e;
        TextView textView = this.f77609d;
        if (text == null) {
            D6.w(textView);
            D6.w(animationView);
            D6.w(this.f77611f);
            return;
        }
        textView.setTextAppearance(com.avito.android.lib.util.f.r(textView.getContext(), text.getStyle()));
        MarketplaceStocks.Alignment alignment = text.getAlignment();
        int i12 = alignment == null ? -1 : a.f77612a[alignment.ordinal()];
        textView.setGravity(i12 != 1 ? i12 != 2 ? 8388611 : 8388613 : 1);
        j.a(textView, text.getAttributedText(), this.f77608c);
        if (animationUrl != null) {
            if (com.avito.android.lib.util.darkTheme.c.b(this.f77607b.getContext()) || (valueDark = animationUrl.getValueDark()) == null) {
                valueDark = animationUrl.getValue();
            }
            animationView.setAnimationData(new AnimationView.a.e(valueDark, null, null, 6, null));
            animationView.setLoadingStateListener(new h(this));
        }
    }
}
