package AW;

import Y61.k;
import Y61.l;
import com.avito.android.log.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pc1.b;

/* compiled from: TimberLogger.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAW/f;", "LAW/b;", "<init>", "()V", "_common_logger_util-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f435b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f434a = new f();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static LogLevel f436c = LogLevel.f182840c;

    @Override // AW.b
    public final void a(@k String str, @k String str2, @k Throwable th2) {
        LogLevel logLevel = LogLevel.f182840c;
        if (6 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.f(th2, str2, new Object[0]);
        }
    }

    @Override // AW.b
    public final void c(@k String str, @k String str2, @l Throwable th2) {
        LogLevel logLevel = LogLevel.f182840c;
        if (3 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.c(th2, str2, new Object[0]);
        }
    }

    @Override // AW.b
    public final void g(@k String str, @k String str2) {
        LogLevel logLevel = LogLevel.f182840c;
        if (4 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.h(null, str2, new Object[0]);
        }
    }

    @Override // AW.b
    public final void h(@k String str, @k Throwable th2, @k Y41.a<String> aVar) {
        LogLevel logLevel = LogLevel.f182840c;
        if (6 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.f(th2, aVar.invoke(), new Object[0]);
        }
    }

    @Override // AW.b
    public final void i(@k String str, @k String str2, @l Throwable th2) {
        LogLevel logLevel = LogLevel.f182840c;
        if (2 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.l(th2, str2, new Object[0]);
        }
    }

    @Override // AW.b
    public final void j(@k String str, @k String str2, @l Throwable th2) {
        LogLevel logLevel = LogLevel.f182840c;
        if (5 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.n(th2, str2, new Object[0]);
        }
    }

    @Override // AW.b
    public final void k(@k String str, @k Y41.a aVar) {
        LogLevel logLevel = LogLevel.f182840c;
        if (3 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.c(null, (String) aVar.invoke(), new Object[0]);
        }
    }

    @Override // AW.b
    public final void l(@k String str, @l Throwable th2, @k Y41.a<String> aVar) {
        LogLevel logLevel = LogLevel.f182840c;
        if (4 >= f436c.f182845b) {
            b.C12280b c12280b = pc1.b.f428696a;
            c12280b.p(str);
            c12280b.h(th2, aVar.invoke(), new Object[0]);
        }
    }
}
