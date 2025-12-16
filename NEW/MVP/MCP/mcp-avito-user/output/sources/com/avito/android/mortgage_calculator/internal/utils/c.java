package com.avito.android.mortgage_calculator.internal.utils;

import Y61.k;
import java.text.DecimalFormat;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PercentUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-calculator_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f204813a = C42727D.c(a.f204814l);

    /* compiled from: PercentUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DecimalFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f204814l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DecimalFormat invoke() {
            return new DecimalFormat("##.#");
        }
    }

    @k
    public static final String a(float f12) {
        return ((DecimalFormat) f204813a.getValue()).format(f12).replace('.', ',').concat("%");
    }
}
