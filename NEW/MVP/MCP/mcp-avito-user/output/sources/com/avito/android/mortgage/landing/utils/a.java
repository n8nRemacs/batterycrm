package com.avito.android.mortgage.landing.utils;

import Y61.k;
import java.text.DecimalFormat;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f200327a = C42727D.c(C5922a.f200328l);

    /* compiled from: TextUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.utils.a$a, reason: collision with other inner class name */
    public static final class C5922a extends N implements Y41.a<DecimalFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5922a f200328l = new C5922a();

        public C5922a() {
            super(0);
        }

        @Override // Y41.a
        public final DecimalFormat invoke() {
            return new DecimalFormat("##.#");
        }
    }

    @k
    public static final String a(double d12) {
        return ((DecimalFormat) f200327a.getValue()).format(d12).replace('.', ',').concat("%");
    }
}
