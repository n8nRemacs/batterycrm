package com.yandex.div.core;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivCreationTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/Q;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Q {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f367255f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final AtomicBoolean f367256g = new AtomicBoolean(true);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final AtomicBoolean f367257h = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    public final long f367258a;

    /* renamed from: b, reason: collision with root package name */
    public long f367259b = -1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f367260c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f367261d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f367262e;

    /* compiled from: DivCreationTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/Q$a;", "", "<init>", "()V", "", "INVALID_TIME", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdContextCreate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdViewCreate", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Q(long j12) {
        this.f367258a = j12;
        this.f367261d = f367256g.compareAndSet(true, false) ? "Cold" : "Cool";
        this.f367262e = new AtomicBoolean(true);
    }
}
