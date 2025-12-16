package com.avito.android.competitor_analytics.util;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.domain.model.ChartType;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: ChartHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/util/a;", "", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleDateFormat f124905a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDateFormat f124906b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NumberFormat f124907c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NumberFormat f124908d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NumberFormat f124909e;

    /* compiled from: ChartHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.util.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3714a {
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChartType chartType = ChartType.f124330b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ChartType chartType2 = ChartType.f124330b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChartType chartType3 = ChartType.f124330b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a() {
        Locale locale = Locale.getDefault();
        this.f124905a = new SimpleDateFormat("d MMMM yyyy", locale);
        this.f124906b = new SimpleDateFormat("d", locale);
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            decimalFormat.getDecimalFormatSymbols().setGroupingSeparator(' ');
            decimalFormat.getDecimalFormatSymbols().setDecimalSeparator(',');
            decimalFormat.applyPattern("#,##0");
        }
        this.f124907c = numberFormat;
        NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
        if (numberFormat2 instanceof DecimalFormat) {
            DecimalFormat decimalFormat2 = (DecimalFormat) numberFormat2;
            decimalFormat2.getDecimalFormatSymbols().setGroupingSeparator(' ');
            decimalFormat2.getDecimalFormatSymbols().setDecimalSeparator(',');
            decimalFormat2.applyPattern("#,##0.0");
        }
        this.f124908d = numberFormat2;
        NumberFormat numberFormat3 = NumberFormat.getInstance(locale);
        if (numberFormat3 instanceof DecimalFormat) {
            DecimalFormat decimalFormat3 = (DecimalFormat) numberFormat3;
            decimalFormat3.getDecimalFormatSymbols().setGroupingSeparator(' ');
            decimalFormat3.getDecimalFormatSymbols().setDecimalSeparator(',');
            decimalFormat3.applyPattern("#,##0.00");
        }
        this.f124909e = numberFormat3;
    }

    public final String a(float f12, ChartType chartType, String str, Map<Integer, String> map) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        boolean z12 = chartType == ChartType.f124331c;
        if (f12 < 1000.0f) {
            int i12 = (int) f12;
            if (!z12) {
                str = "";
            }
            return i12 + str;
        }
        NumberFormat numberFormat = this.f124908d;
        NumberFormat numberFormat2 = this.f124907c;
        if (f12 < 1000000.0f) {
            if (z12) {
                strValueOf3 = numberFormat2.format(Float.valueOf(f12));
            } else {
                float f13 = f12 / 1000.0f;
                strValueOf3 = f13 % ((float) 1) == 0.0f ? String.valueOf((int) f13) : numberFormat.format(Float.valueOf(f13));
            }
            if (!z12 && (str = map.get(1000)) == null) {
                str = "";
            }
            return r.q(strValueOf3, str);
        }
        if (f12 < 1.0E9f) {
            if (z12) {
                strValueOf2 = numberFormat2.format(Float.valueOf(f12));
            } else {
                float f14 = f12 / 1000000.0f;
                strValueOf2 = f14 % ((float) 1) == 0.0f ? String.valueOf((int) f14) : numberFormat.format(Float.valueOf(f14));
            }
            if (!z12 && (str = map.get(1000000)) == null) {
                str = "";
            }
            return r.q(strValueOf2, str);
        }
        if (z12) {
            strValueOf = numberFormat2.format(Float.valueOf(f12));
        } else {
            float f15 = f12 / 1.0E9f;
            strValueOf = f15 % ((float) 1) == 0.0f ? String.valueOf((int) f15) : numberFormat.format(Float.valueOf(f15));
        }
        if (!z12 && (str = map.get(Integer.valueOf(Http2Connection.DEGRADED_PONG_TIMEOUT_NS))) == null) {
            str = "";
        }
        return r.q(strValueOf, str);
    }

    public final String b(float f12, ChartType chartType, String str) {
        int iOrdinal = chartType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return this.f124908d.format(Float.valueOf(f12)) + str;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return this.f124907c.format(Float.valueOf(f12));
            }
        }
        return this.f124909e.format(Float.valueOf(f12)) + str;
    }
}
