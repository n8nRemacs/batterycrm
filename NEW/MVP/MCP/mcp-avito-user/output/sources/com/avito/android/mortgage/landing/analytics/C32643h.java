package com.avito.android.mortgage.landing.analytics;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LandingAnalyticsHandler.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.landing.analytics.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32643h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f199526a = C42727D.c(a.f199527l);

    /* compiled from: LandingAnalyticsHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.analytics.h$a */
    public static final class a extends N implements Y41.a<DecimalFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f199527l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DecimalFormat invoke() {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            return new DecimalFormat("#.0", decimalFormatSymbols);
        }
    }
}
