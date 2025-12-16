package com.avito.android.arch.mvi.log;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/log/g;", "", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class g {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f91991f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final g f91992g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final g f91993h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final g f91994i;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LogLevel f91995a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LogVerbosity f91996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LogVerbosity f91997c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LogVerbosity f91998d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LogVerbosity f91999e;

    /* compiled from: LogParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/log/g$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        LogLevel logLevel = LogLevel.f91962b;
        LogVerbosity logVerbosity = LogVerbosity.f91967b;
        f91992g = new g(logLevel, logVerbosity, logVerbosity, logVerbosity, logVerbosity);
        LogLevel logLevel2 = LogLevel.f91963c;
        LogVerbosity logVerbosity2 = LogVerbosity.f91968c;
        LogVerbosity logVerbosity3 = LogVerbosity.f91969d;
        f91993h = new g(logLevel2, logVerbosity2, logVerbosity3, logVerbosity2, logVerbosity);
        f91994i = new g(LogLevel.f91964d, logVerbosity3, logVerbosity3, logVerbosity3, logVerbosity3);
    }

    public g(@k LogLevel logLevel, @k LogVerbosity logVerbosity, @k LogVerbosity logVerbosity2, @k LogVerbosity logVerbosity3, @k LogVerbosity logVerbosity4) {
        this.f91995a = logLevel;
        this.f91996b = logVerbosity;
        this.f91997c = logVerbosity2;
        this.f91998d = logVerbosity3;
        this.f91999e = logVerbosity4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f91995a == gVar.f91995a && this.f91996b == gVar.f91996b && this.f91997c == gVar.f91997c && this.f91998d == gVar.f91998d && this.f91999e == gVar.f91999e;
    }

    public final int hashCode() {
        return this.f91999e.hashCode() + ((this.f91998d.hashCode() + ((this.f91997c.hashCode() + ((this.f91996b.hashCode() + (this.f91995a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "LogParams(level=" + this.f91995a + ", actionsLogParams=" + this.f91996b + ", internalLogParams=" + this.f91997c + ", eventsLogParams=" + this.f91998d + ", featureLogParams=" + this.f91999e + ')';
    }

    public /* synthetic */ g(LogLevel logLevel, LogVerbosity logVerbosity, LogVerbosity logVerbosity2, LogVerbosity logVerbosity3, LogVerbosity logVerbosity4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? LogLevel.f91962b : logLevel, logVerbosity, logVerbosity2, logVerbosity3, logVerbosity4);
    }
}
