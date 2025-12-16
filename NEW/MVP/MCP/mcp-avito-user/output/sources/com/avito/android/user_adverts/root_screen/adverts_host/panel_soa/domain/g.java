package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SoaPriceFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/g;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f313469a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f313470b;

    /* compiled from: SoaPriceFormatter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/g$a;", "", "<init>", "()V", "", "ONE_BILLION", "D", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SoaPriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f313471l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Locale locale) {
            super(0);
            this.f313471l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(this.f313471l);
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                decimalFormat.setGroupingSize(3);
                decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                decimalFormat.applyPattern("#.#");
            }
            numberFormat.setGroupingUsed(true);
            return numberFormat;
        }
    }

    /* compiled from: SoaPriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f313472l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Locale locale) {
            super(0);
            this.f313472l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(this.f313472l);
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                decimalFormat.setGroupingSize(3);
                decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
            }
            numberFormat.setGroupingUsed(true);
            return numberFormat;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k Locale locale) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f313469a = C42727D.b(lazyThreadSafetyMode, new c(locale));
        this.f313470b = C42727D.b(lazyThreadSafetyMode, new b(locale));
    }
}
