package com.avito.android.advertising.ui;

import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.window.layout.p;
import com.avito.android.R;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: AdViewUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/ui/h;", "", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h f88704a = new h();

    /* compiled from: AdViewUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BannerPageSource.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BannerPageSource bannerPageSource = BannerPageSource.f87777c;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BannerPageSource bannerPageSource2 = BannerPageSource.f87777c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: AdViewUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28345a f88705l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f88706m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, InterfaceC28345a interfaceC28345a) {
            super(0);
            this.f88705l = interfaceC28345a;
            this.f88706m = view;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.f88704a.getClass();
            p.f55345a.getClass();
            Rect rectC = p.a.a().b(this.f88706m.getContext()).f55343a.c();
            this.f88705l.setArea((int) (((r1.getMeasuredHeight() * r1.getMeasuredWidth()) / (rectC.height() * rectC.width())) * 100.0f));
            return G0.f406611a;
        }
    }

    public static void a(@Y61.k View view, @Y61.k BannerPageSource bannerPageSource) {
        Integer numValueOf;
        int iOrdinal = bannerPageSource.ordinal();
        int iB2 = 0;
        if (iOrdinal != 1) {
            numValueOf = null;
            if (iOrdinal != 4 && iOrdinal != 6) {
                iB2 = y6.b(8);
            }
        } else {
            numValueOf = Integer.valueOf(y6.b(16));
            iB2 = y6.b(0);
        }
        D6.b(view, Integer.valueOf(iB2), Integer.valueOf(numValueOf != null ? numValueOf.intValue() : iB2), Integer.valueOf(iB2), Integer.valueOf(numValueOf != null ? numValueOf.intValue() : iB2));
    }

    public static void b(@Y61.k View view, @Y61.k InterfaceC28345a interfaceC28345a) {
        if (interfaceC28345a.getArea() == -1) {
            D6.l(true, view, new b(view, interfaceC28345a));
        }
    }

    @Y61.k
    public static String c(@Y61.k Resources resources, @l String str, @l String str2, boolean z12) {
        return (str == null || str.length() == 0) ? z12 ? resources.getString(R.string.advertising_badge_empty) : "" : z12 ? (str2 == null || str2.length() == 0) ? resources.getString(R.string.advertising_badge_format, str) : resources.getString(R.string.advertising_badge_format_with_adge, str, str2) : str;
    }

    public static /* synthetic */ String d(h hVar, Resources resources, String str, String str2, int i12) throws Resources.NotFoundException {
        if ((i12 & 2) != 0) {
            str = resources.getString(R.string.advertising_badge_name);
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        hVar.getClass();
        return c(resources, str, str2, true);
    }

    @l
    public static Integer e(@InterfaceC42150f int i12, @Y61.k Context context) {
        int iJ2 = C35835l0.j(i12, context);
        Integer numValueOf = Integer.valueOf(iJ2);
        if (iJ2 != 0) {
            return numValueOf;
        }
        return null;
    }

    @Y61.k
    public static Rect f(@Y61.k Resources resources, @Y61.k BannerPageSource bannerPageSource) throws Resources.NotFoundException {
        if (bannerPageSource == BannerPageSource.f87783i) {
            return d.f88703a;
        }
        BannerPageSource bannerPageSource2 = BannerPageSource.f87778d;
        int iB2 = bannerPageSource == bannerPageSource2 ? 0 : y6.b(4);
        int iB3 = bannerPageSource != bannerPageSource2 ? y6.b(3) : 0;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad_grid_margin);
        int iB4 = y6.b(4) + dimensionPixelOffset;
        int i12 = dimensionPixelOffset + iB2;
        return new Rect(iB4, i12, iB4, iB3 + i12);
    }

    @l
    public static String g(@l String str, @l String str2) {
        if (str == null) {
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        Character chP = C43066x.P(str);
        if (chP != null && !C43044a.d(chP.charValue())) {
            sb2.append(' ');
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static void h(@Y61.k TextView textView, boolean z12) {
        Context context = textView.getContext();
        textView.setPadding(0, 0, 0, 0);
        textView.setBackground(z12 ? androidx.core.content.d.getDrawable(context, R.drawable.ad_install_bg) : null);
        textView.setTextColor(androidx.core.content.d.getColor(context, R.color.ad_call_to_action));
    }

    public static void i(boolean z12, @Y61.k View view, @Y61.k ForegroundFrameLayout foregroundFrameLayout, @l ForegroundRelativeLayout foregroundRelativeLayout) {
        Context context = view.getContext();
        view.setBackground(androidx.core.content.d.getDrawable(context, R.drawable.serp_card_background));
        if (foregroundRelativeLayout != null) {
            foregroundRelativeLayout.setForegroundDrawable(androidx.core.content.d.getDrawable(context, R.drawable.design_system_list_left_rounding));
        }
        foregroundFrameLayout.setForegroundDrawable(androidx.core.content.d.getDrawable(context, z12 ? R.drawable.list_advert_image_foreground_solid : R.drawable.grid_advert_image_foreground));
    }

    public static void j(@Y61.k TextView textView, boolean z12) {
        textView.setTextSize(0, textView.getResources().getDimension(z12 ? R.dimen.ad_big_title_text_size : R.dimen.ad_title_text_size));
    }
}
