package com.avito.android.cpx_promo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35945t1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PriceFormatter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/b;", "Lcom/avito/android/util/t1;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class b implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f126802a;

    /* compiled from: PriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f126803l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale) {
            super(0);
            this.f126803l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(this.f126803l);
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                decimalFormat.setGroupingSize(3);
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
            numberFormat.setGroupingUsed(true);
            return numberFormat;
        }
    }

    @Inject
    public b(@k Locale locale) {
        this.f126802a = C42727D.b(LazyThreadSafetyMode.f406615c, new a(locale));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.util.InterfaceC35945t1
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@l Long l12) {
        if (l12 == null) {
            return "";
        }
        return ((Format) this.f126802a.getValue()).format(l12) + " ₽";
    }
}
