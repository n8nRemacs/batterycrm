package com.yandex.div.histogram;

import android.os.SystemClock;
import j.K;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Div2ViewHistogramReporter.kt */
@K
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/histogram/e;", "", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.yandex.div.histogram.reporter.a> f369999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<v> f370000b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f370001c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f370002d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Long f370003e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Long f370004f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Long f370005g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Long f370006h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Long f370007i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Long f370008j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Long f370009k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f370010l = C42727D.b(LazyThreadSafetyMode.f406616d, a.f370011b);

    /* compiled from: Div2ViewHistogramReporter.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.a<D21.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f370011b = new a();

        public a() {
            super(0, D21.a.class, "<init>", "<init>()V", 0);
        }

        @Override // Y41.a
        public final D21.a invoke() {
            return new D21.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Y41.a<? extends com.yandex.div.histogram.reporter.a> aVar, @Y61.k Y41.a<v> aVar2) {
        this.f369999a = aVar;
        this.f370000b = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final D21.a a() {
        return (D21.a) this.f370010l.getValue();
    }

    public final void b() {
        long jUptimeMillis;
        long jLongValue;
        Long l12 = this.f370003e;
        Long l13 = this.f370004f;
        Long l14 = this.f370005g;
        D21.a aVarA = a();
        if (l12 == null) {
            int i12 = com.yandex.div.internal.n.f370123a;
        } else {
            if (l13 != null && l14 != null) {
                jUptimeMillis = l13.longValue() + (SystemClock.uptimeMillis() - l14.longValue());
                jLongValue = l12.longValue();
            } else if (l13 == null && l14 == null) {
                jUptimeMillis = SystemClock.uptimeMillis();
                jLongValue = l12.longValue();
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
            }
            long j12 = jUptimeMillis - jLongValue;
            aVarA.f2859a = j12;
            com.yandex.div.histogram.reporter.a.a(this.f369999a.invoke(), "Div.Binding", j12, this.f370001c, null, null, 24);
        }
        this.f370003e = null;
        this.f370004f = null;
        this.f370005g = null;
    }

    public final void c() {
        Long l12 = this.f370009k;
        if (l12 != null) {
            a().f2863e += SystemClock.uptimeMillis() - l12.longValue();
        }
        if (this.f370002d) {
            D21.a aVarA = a();
            com.yandex.div.histogram.reporter.a aVarInvoke = this.f369999a.invoke();
            v vVarInvoke = this.f370000b.invoke();
            com.yandex.div.histogram.reporter.a.a(aVarInvoke, "Div.Render.Total", aVarA.f2863e + Math.max(aVarA.f2859a, aVarA.f2860b) + aVarA.f2861c + aVarA.f2862d, this.f370001c, null, vVarInvoke.f370040d, 8);
            com.yandex.div.histogram.reporter.a.a(aVarInvoke, "Div.Render.Measure", aVarA.f2861c, this.f370001c, null, vVarInvoke.f370037a, 8);
            com.yandex.div.histogram.reporter.a.a(aVarInvoke, "Div.Render.Layout", aVarA.f2862d, this.f370001c, null, vVarInvoke.f370038b, 8);
            com.yandex.div.histogram.reporter.a.a(aVarInvoke, "Div.Render.Draw", aVarA.f2863e, this.f370001c, null, vVarInvoke.f370039c, 8);
        }
        this.f370002d = false;
        this.f370008j = null;
        this.f370007i = null;
        this.f370009k = null;
        D21.a aVarA2 = a();
        aVarA2.f2861c = 0L;
        aVarA2.f2862d = 0L;
        aVarA2.f2863e = 0L;
        aVarA2.f2859a = 0L;
        aVarA2.f2860b = 0L;
    }
}
