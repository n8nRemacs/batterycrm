package Wa0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.util.InterfaceC35945t1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletBalanceFormatter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LWa0/d;", "Lcom/avito/android/util/t1;", "LWa0/d$b;", "a", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements InterfaceC35945t1<b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Locale f17954a;

    /* compiled from: WalletBalanceFormatter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LWa0/d$a;", "", "<init>", "()V", "", "CURRENCY_BONUS", "Ljava/lang/String;", "CURRENCY_RUBLE", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WalletBalanceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWa0/d$b;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BigInteger f17955a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17956b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17957c;

        public b(@k BigInteger bigInteger, @k String str, int i12) {
            this.f17955a = bigInteger;
            this.f17956b = str;
            this.f17957c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17955a.equals(bVar.f17955a) && this.f17956b.equals(bVar.f17956b) && this.f17957c == bVar.f17957c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f17957c) + H.d(this.f17955a.hashCode() * 31, 31, this.f17956b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WalletBalanceFormattingData(amount=");
            sb2.append(this.f17955a);
            sb2.append(", currencySymbol=");
            sb2.append(this.f17956b);
            sb2.append(", maxFractionDigits=");
            return r.t(sb2, this.f17957c, ')');
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k Locale locale) {
        this.f17954a = locale;
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 == null) {
            return "";
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(100L);
        BigInteger bigInteger = bVar2.f17955a;
        BigInteger bigIntegerDivide = bigInteger.divide(bigIntegerValueOf);
        boolean zF2 = L.f(bigInteger.mod(BigInteger.valueOf(100L)), BigInteger.ZERO);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(this.f17954a);
        decimalFormat.setGroupingSize(3);
        int i12 = bVar2.f17957c;
        decimalFormat.setMinimumFractionDigits(zF2 ? 0 : i12);
        decimalFormat.setMaximumFractionDigits(i12);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setGroupingUsed(true);
        StringBuilder sbB = C22491k0.b(decimalFormat.format(!zF2 ? new BigDecimal(bigInteger).divide(new BigDecimal(100)) : new BigDecimal(bigIntegerDivide)), (char) 160);
        sbB.append(bVar2.f17956b);
        return sbB.toString();
    }
}
