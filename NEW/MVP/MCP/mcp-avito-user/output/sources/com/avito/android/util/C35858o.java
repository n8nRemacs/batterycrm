package com.avito.android.util;

import com.avito.android.remote.model.AdvertPrice;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertPriceFormatter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/o;", "Lcom/avito/android/util/t1;", "Lcom/avito/android/remote/model/AdvertPrice;", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35858o implements InterfaceC35945t1<AdvertPrice> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f318938a;

    /* compiled from: AdvertPriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f318939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale) {
            super(0);
            this.f318939l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(this.f318939l);
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
    public C35858o(@Y61.k Locale locale) {
        this.f318938a = C42727D.b(LazyThreadSafetyMode.f406615c, new a(locale));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r1 = ((java.text.Format) r4.f318938a.getValue()).format(java.lang.Long.valueOf(java.lang.Long.parseLong(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
    
        r1 = c(r5);
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.util.InterfaceC35945t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.avito.android.remote.model.AdvertPrice r5) {
        /*
            r4 = this;
            com.avito.android.remote.model.AdvertPrice r5 = (com.avito.android.remote.model.AdvertPrice) r5
            java.lang.String r0 = ""
            if (r5 != 0) goto L7
            goto L3f
        L7:
            java.lang.String r1 = r4.c(r5)
            if (r1 != 0) goto Le
            goto L3f
        Le:
            r0 = 0
        Lf:
            int r2 = r1.length()     // Catch: java.lang.Exception -> L37
            if (r0 >= r2) goto L23
            char r2 = r1.charAt(r0)     // Catch: java.lang.Exception -> L37
            boolean r2 = java.lang.Character.isDigit(r2)     // Catch: java.lang.Exception -> L37
            if (r2 != 0) goto L20
            goto L37
        L20:
            int r0 = r0 + 1
            goto Lf
        L23:
            java.lang.Object r0 = r4.f318938a     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L37
            java.text.Format r0 = (java.text.Format) r0     // Catch: java.lang.Exception -> L37
            long r2 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L37
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r0.format(r2)     // Catch: java.lang.Exception -> L37
        L37:
            java.lang.String r5 = r5.getMetric()
            java.lang.String r0 = r4.b(r5, r1)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.C35858o.a(java.lang.Object):java.lang.String");
    }

    @Y61.k
    public String b(@Y61.l String str, @Y61.k String str2) {
        return (str == null || C43066x.K(str)) ? str2 : androidx.compose.foundation.H.i(' ', str2, str);
    }

    @Y61.l
    public String c(@Y61.k AdvertPrice advertPrice) {
        return advertPrice.getValue();
    }
}
