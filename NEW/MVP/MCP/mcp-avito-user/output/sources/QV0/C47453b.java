package qv0;

import Y61.k;
import android.content.Context;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesRealtySheetPriceStringProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqv0/b;", "Lqv0/a;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47453b implements InterfaceC47452a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DecimalFormat f429505a;

    /* compiled from: ServicesRealtySheetPriceStringProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqv0/b$a;", "", "<init>", "()V", "", "LINK_COLOR_KEY", "Ljava/lang/String;", "STATISTIC_KEY", "", "UNB_SP", "C", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qv0.b$a */
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

    public C47453b(@k Context context) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        decimalFormat.setGroupingSize(3);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("ru", "RU")));
        this.f429505a = decimalFormat;
    }
}
