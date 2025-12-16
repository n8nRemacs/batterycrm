package com.avito.android.advert.item.cv_state;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.util.p6;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;
import kotlin.collections.J0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvStateView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/cv_state/h;", "Lcom/avito/android/advert/item/cv_state/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f75070f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f75071b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Banner f75072c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public FlexboxLayout f75073d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f75074e;

    public h(@k View view) {
        super(view);
        this.f75071b = (ViewGroup) view.findViewById(R.id.cv_state_promo_block_container);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.cv_state.g
    public final void rW(@k String str, @k String str2, @k List<CvStateType> list, @k Y41.l<? super CvStateType, G0> lVar) {
        FlexboxLayout flexboxLayout;
        if (list.isEmpty()) {
            return;
        }
        if (this.f75072c == null || (flexboxLayout = this.f75073d) == null || list.size() != flexboxLayout.getChildCount()) {
            int i12 = (list.size() == 1 && L.f(((CvStateType) C42745f0.E(list)).getSlug(), "in_search")) ? R.attr.bannerGreen : list.size() == 1 ? R.attr.bannerBlue : R.attr.bannerWarmgray;
            ViewGroup viewGroup = this.f75071b;
            Banner banner = new Banner(viewGroup.getContext(), null, i12, 0, 10, null);
            banner.setClipChildren(false);
            banner.setClipToPadding(false);
            banner.setTitleTextAppearance(R.style.Re23_Text_H30);
            this.f75072c = banner;
            banner.setContentView(LayoutInflater.from(banner.getThemedContext()).inflate(R.layout.advert_details_cv_state_promoblock_content, (ViewGroup) null));
            this.f75073d = (FlexboxLayout) banner.findViewById(R.id.cv_state_buttons_container);
            this.f75074e = (TextView) banner.findViewById(R.id.cv_state_subtitle);
            FlexboxLayout flexboxLayout2 = this.f75073d;
            if (flexboxLayout2 != null) {
                Context themedContext = banner.getThemedContext();
                flexboxLayout2.removeAllViews();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(themedContext);
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    layoutInflaterFrom.inflate(R.layout.advert_details_cv_state_button, (ViewGroup) flexboxLayout2, true);
                }
            }
            viewGroup.removeAllViews();
            viewGroup.addView(banner);
        }
        Banner banner2 = this.f75072c;
        if (banner2 != null) {
            banner2.setTitle(str);
        }
        TextView textView = this.f75074e;
        if (textView != null) {
            textView.setText(str2);
        }
        FlexboxLayout flexboxLayout3 = this.f75073d;
        if (flexboxLayout3 != null) {
            J0 j02 = new J0(new p6(flexboxLayout3));
            while (j02.f406646b.hasNext()) {
                H0 h02 = (H0) j02.next();
                View view = (View) h02.f406644b;
                if (view instanceof Button) {
                    int i14 = h02.f406643a;
                    com.avito.android.lib.design.button.b.a((Button) view, list.get(i14).getTitle(), false);
                    view.setOnClickListener(new C(lVar, list, i14, 2));
                }
            }
        }
    }
}
