package com.avito.android.advert.item.mortgage_snippet;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageSnippetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/mortgage_snippet/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/mortgage_snippet/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f77705b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f77706c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ShimmerFrameLayout f77707d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f77708e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f77709f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f77710g;

    public h(@k View view) {
        super(view);
        this.f77705b = (TextView) view.findViewById(R.id.title);
        this.f77706c = (TextView) view.findViewById(R.id.payment_text);
        this.f77707d = (ShimmerFrameLayout) view.findViewById(R.id.payment_text_shimmer);
        this.f77708e = (TextView) view.findViewById(R.id.action);
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f77709f = (ImageView) viewFindViewById;
        this.itemView.setOnClickListener(new B(this, 3));
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.g
    public final void U(@k Y41.a<G0> aVar) {
        this.f77710g = aVar;
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.g
    public final void b(@l String str) {
        TextView textView = this.f77705b;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    @Override // com.avito.android.advert.item.mortgage_snippet.g
    public final void k00(@l String str, boolean z12) {
        ShimmerFrameLayout shimmerFrameLayout = this.f77707d;
        TextView textView = this.f77706c;
        if (str == null || str.length() == 0) {
            if (textView != null) {
                D6.w(textView);
            }
            D6.H(shimmerFrameLayout);
            return;
        }
        D6.w(shimmerFrameLayout);
        String strE = str;
        if (z12) {
            strE = FV.a.f4720a.e(str, this.itemView.getContext(), R.attr.textIconChevronRight, y6.b(3));
        }
        if (textView != null) {
            I5.a(textView, strE, false);
        }
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.g
    public final void oa(@l String str) {
        TextView textView = this.f77708e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.g
    public final void setImage(int i12) {
        this.f77709f.setImageResource(i12);
    }
}
