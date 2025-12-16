package com.avito.android.analytics.clickstream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickStreamSender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/clickstream/H;", "", "a", "c", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface H {

    /* compiled from: ClickStreamSender.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$a;", "", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        LinkedHashMap a();
    }

    /* compiled from: ClickStreamSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: ClickStreamSender.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/analytics/clickstream/H$c$a;", "Lcom/avito/android/analytics/clickstream/H$c$b;", "Lcom/avito/android/analytics/clickstream/H$c$c;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: ClickStreamSender.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$c$a;", "Lcom/avito/android/analytics/clickstream/H$c;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f89747a;

            public a(@Y61.k Throwable th2) {
                super(null);
                this.f89747a = th2;
            }
        }

        /* compiled from: ClickStreamSender.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$c$b;", "Lcom/avito/android/analytics/clickstream/H$c;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {
            public b(@Y61.k ArrayList arrayList) {
                super(null);
            }
        }

        /* compiled from: ClickStreamSender.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$c$c;", "Lcom/avito/android/analytics/clickstream/H$c;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.analytics.clickstream.H$c$c, reason: collision with other inner class name */
        public static final class C2665c extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f89748a;

            public C2665c(@Y61.k Throwable th2) {
                super(null);
                this.f89748a = th2;
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.W a(boolean z12);
}
