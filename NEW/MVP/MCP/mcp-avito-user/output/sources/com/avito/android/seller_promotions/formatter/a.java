package com.avito.android.seller_promotions.formatter;

import Y61.k;
import Y61.l;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/formatter/a;", "Lcom/avito/android/util/t1;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC35945t1<Double> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f267753a;

    /* compiled from: PriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_promotions.formatter.a$a, reason: collision with other inner class name */
    public static final class C8005a extends N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f267754l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8005a(Locale locale) {
            super(0);
            this.f267754l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(this.f267754l);
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
    public a(@k Locale locale) {
        this.f267753a = C42727D.b(LazyThreadSafetyMode.f406615c, new C8005a(locale));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.util.InterfaceC35945t1
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@l Double d12) {
        if (d12 == null) {
            return "";
        }
        return ((Format) this.f267753a.getValue()).format(d12) + " ₽";
    }
}
