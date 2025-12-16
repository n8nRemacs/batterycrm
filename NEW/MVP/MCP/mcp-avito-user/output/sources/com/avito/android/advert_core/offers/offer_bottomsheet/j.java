package com.avito.android.advert_core.offers.offer_bottomsheet;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OffersBottomSheetDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/j;", "Lcom/avito/android/advert_core/offers/offer_bottomsheet/h;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83884f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f83885a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<J9.a, G0> f83886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewPager f83887c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PageIndicatorRe23 f83888d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f83889e;

    /* compiled from: OffersBottomSheetDialogView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/j$a;", "", "<init>", "()V", "", "DEFAULT_BUTTON_STYLE", "Ljava/lang/String;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k View view, @Y61.k Y41.l<? super J9.a, G0> lVar) {
        this.f83885a = view;
        this.f83886b = lVar;
        View viewFindViewById = view.findViewById(R.id.offers_bottom_sheet_view_pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        this.f83887c = (ViewPager) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.offers_bottom_sheet_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23");
        }
        this.f83888d = (PageIndicatorRe23) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.offers_bottom_sheet_call_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f83889e = (Button) viewFindViewById3;
    }
}
