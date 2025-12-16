package Kh0;

import Y61.k;
import Y61.l;
import com.avito.android.util.InterfaceC35945t1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: RatingCounterTextFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKh0/a;", "Lcom/avito/android/util/t1;", "", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14315a implements InterfaceC35945t1<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final NumberFormat f9619a;

    public C14315a() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            decimalFormat.setGroupingSize(3);
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(' ');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        numberFormat.setGroupingUsed(true);
        this.f9619a = numberFormat;
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@l Integer num) {
        Object bVar;
        if (num == null) {
            return "";
        }
        try {
            int i12 = Z.f406624c;
            bVar = this.f9619a.format(num);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) != null) {
            bVar = num.toString();
        }
        return (String) bVar;
    }
}
