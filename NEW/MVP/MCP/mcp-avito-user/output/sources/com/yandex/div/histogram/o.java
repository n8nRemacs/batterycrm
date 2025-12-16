package com.yandex.div.histogram;

import com.yandex.div.histogram.b;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import t21.InterfaceC48467b;

/* compiled from: HistogramConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/o;", "Lcom/yandex/div/histogram/r;", "a", "b", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public interface o extends r {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final b f370020a;

    /* compiled from: HistogramConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/histogram/o$a;", "", "<init>", "()V", "Lcom/yandex/div/histogram/o;", "DEFAULT", "Lcom/yandex/div/histogram/o;", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f370021a = 0;

        static {
            new a();
        }
    }

    /* compiled from: HistogramConfiguration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/histogram/o$b;", "Lcom/yandex/div/histogram/o;", "<init>", "()V", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class b implements o {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Provider<i> f370022b = new h(C10923b.f370027b);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Provider<com.yandex.div.histogram.b> f370023c = new h(a.f370026l);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Provider<w> f370024d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Provider<v> f370025e;

        /* compiled from: HistogramConfiguration.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/histogram/b;", "invoke", "()Lcom/yandex/div/histogram/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends N implements Y41.a<com.yandex.div.histogram.b> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f370026l = new a();

            public a() {
                super(0);
            }

            @Override // Y41.a
            public final com.yandex.div.histogram.b invoke() {
                return new b.a();
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.histogram.o$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C10923b extends H implements Y41.a<t> {

            /* renamed from: b, reason: collision with root package name */
            public static final C10923b f370027b = new C10923b();

            public C10923b() {
                super(0, t.class, "<init>", "<init>()V", 0);
            }

            @Override // Y41.a
            public final t invoke() {
                return new t();
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class c extends C42801a implements Y41.a<v> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f370028b = new c();

            public c() {
                super(0, v.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
            }

            @Override // Y41.a
            public final v invoke() {
                return new v(null, null, null, null, 15, null);
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class d extends H implements Y41.a<com.yandex.div.histogram.d> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f370029b = new d();

            public d() {
                super(0, com.yandex.div.histogram.d.class, "<init>", "<init>()V", 0);
            }

            @Override // Y41.a
            public final com.yandex.div.histogram.d invoke() {
                return new com.yandex.div.histogram.d();
            }
        }

        public b() {
            new h(d.f370029b);
            this.f370025e = new h(c.f370028b);
        }

        @Override // com.yandex.div.histogram.o
        @Y61.k
        public final Provider<com.yandex.div.histogram.b> a() {
            return this.f370023c;
        }

        @Override // com.yandex.div.histogram.r
        @Y61.k
        public final Provider<v> b() {
            return this.f370025e;
        }

        @Override // com.yandex.div.histogram.o
        @Y61.k
        public final Provider<i> c() {
            return this.f370022b;
        }
    }

    static {
        int i12 = a.f370021a;
        f370020a = new b();
    }

    @Y61.k
    Provider<com.yandex.div.histogram.b> a();

    @Y61.k
    Provider<i> c();
}
