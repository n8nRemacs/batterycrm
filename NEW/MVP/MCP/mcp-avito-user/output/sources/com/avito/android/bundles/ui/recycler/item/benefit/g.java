package com.avito.android.bundles.ui.recycler.item.benefit;

import Dk.C13408a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bundles.remote.model.BenefitIconName;
import com.avito.android.bundles.ui.recycler.item.benefit.a;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48063a;

/* compiled from: BundleBenefitItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/benefit/g;", "Lcom/avito/android/bundles/ui/recycler/item/benefit/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f108374b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f108375c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f108376d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Drawable f108377e;

    /* compiled from: BundleBenefitItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f108379m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f108379m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g gVar = g.this;
            gVar.itemView.setPressed(true);
            gVar.itemView.setPressed(false);
            Y41.a<G0> aVar = this.f108379m;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f108374b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108375c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon_arrow);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f108376d = viewFindViewById3;
        this.f108377e = C35835l0.h(android.R.attr.selectableItemBackground, view.getContext());
    }

    @Override // com.avito.android.bundles.ui.recycler.item.benefit.f
    public final void Em(@l C13408a c13408a) {
        BenefitIconName benefitIconName = c13408a != null ? c13408a.f3412a : null;
        ImageView imageView = this.f108374b;
        if (c13408a == null || benefitIconName == null) {
            D6.w(imageView);
            return;
        }
        D6.H(imageView);
        if (a.C3244a.f108368a[benefitIconName.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageResource(R.drawable.ic_checkmark_16);
        imageView.setColorFilter(C48063a.f437606a.a(this.itemView.getContext(), c13408a.f3413b));
    }

    @Override // com.avito.android.bundles.ui.recycler.item.benefit.f
    public final void a(@l Y41.a<G0> aVar) {
        this.itemView.setBackground(this.f108377e);
        D6.a(new a(aVar), this.itemView);
        this.itemView.setEnabled(true);
        D6.H(this.f108376d);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.benefit.f
    public final void fA(@k String str, @l Dk.b bVar) {
        G0 g02;
        TextView textView = this.f108375c;
        if (bVar != null) {
            String title = bVar.getTitle();
            int iD2 = C35835l0.d(R.attr.constantWhite, textView.getContext());
            int iD3 = C35835l0.d(R.attr.red, textView.getContext());
            BadgeView badgeView = new BadgeView(textView.getContext(), null, 0, 0, 14, null);
            badgeView.setTextColor(iD2);
            badgeView.setBackgroundColor(iD3);
            Context context = textView.getContext();
            badgeView.setText(title);
            badgeView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(badgeView.getMeasuredWidth(), badgeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            badgeView.layout(0, 0, badgeView.getMeasuredWidth(), badgeView.getMeasuredHeight());
            badgeView.draw(canvas);
            String strA0 = C43066x.a0(C43066x.a0("$\\text $\\badgeText", "$\\text", str, false), "$\\badgeText", title, false);
            int I12 = C43066x.I(strA0, title, 0, false, 6);
            int length = title.length() + I12;
            SpannableString spannableString = new SpannableString(strA0);
            spannableString.setSpan(new y(context, bitmapCreateBitmap), I12, length, 33);
            textView.setText(spannableString);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.bundles.ui.recycler.item.benefit.f
    public final void t3() {
        this.itemView.setBackground(null);
        D6.a(null, this.itemView);
        this.itemView.setEnabled(false);
        D6.g(this.f108376d);
    }
}
