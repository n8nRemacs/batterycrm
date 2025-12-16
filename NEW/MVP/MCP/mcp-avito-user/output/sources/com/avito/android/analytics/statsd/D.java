package com.avito.android.analytics.statsd;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: StatsdEventValidator.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_analytics-statsd_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f91026a = C42727D.c(a.f91027l);

    /* compiled from: StatsdEventValidator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/p;", "invoke", "()Lkotlin/text/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<C43059p> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f91027l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C43059p invoke() {
            return new C43059p("\\W+");
        }
    }

    @Y61.k
    public static final String a(@Y61.k String str) {
        return androidx.compose.foundation.H.k("\\W", str, "_");
    }
}
