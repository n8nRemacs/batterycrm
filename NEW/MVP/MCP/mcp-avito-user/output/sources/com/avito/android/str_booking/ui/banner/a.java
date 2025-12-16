package com.avito.android.str_booking.ui.banner;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.str_booking.ui.ScreenType;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingBannerBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/banner/a;", "LTV0/b;", "Lcom/avito/android/str_booking/ui/banner/i;", "Lcom/avito/android/str_booking/ui/banner/c;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<i, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f285919a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f285920b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f285921c;

    /* compiled from: StrBookingBannerBlueprint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.ui.banner.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8561a {
        static {
            int[] iArr = new int[ScreenType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenType.a aVar = ScreenType.f285864b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: StrBookingBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/str_booking/ui/banner/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/str_booking/ui/banner/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<ViewGroup, View, j> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f285920b);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.util.text.a aVar, @k @Named("screen_type") ScreenType screenType) {
        int i12;
        this.f285919a = dVar;
        this.f285920b = aVar;
        int iOrdinal = screenType.ordinal();
        if (iOrdinal == 0) {
            i12 = R.layout.str_booking_banner_item;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.layout.str_booking_banner_seller_item;
        }
        this.f285921c = new g.a<>(i12, new b());
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f285919a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f285921c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
