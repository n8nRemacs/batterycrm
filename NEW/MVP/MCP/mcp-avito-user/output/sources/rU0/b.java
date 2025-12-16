package RU0;

import Y61.k;
import androidx.compose.foundation.H;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Log.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRU0/b;", "LRU0/c;", "<init>", "()V", "logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f14467a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static c f14468b = d.f14472a;

    /* renamed from: c, reason: collision with root package name */
    public static int f14469c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static String f14470d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f14471e;

    static {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        f14469c = 0;
        f14470d = "BDUI";
    }

    @Override // RU0.c
    @InterfaceC42830m
    public final void b(@k String str, @k String str2) {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        if (2 >= f14469c) {
            c cVar = f14468b;
            StringBuilder sb2 = new StringBuilder();
            f14467a.getClass();
            cVar.b(H.o(sb2, f14470d, ':', str), str2);
        }
    }

    @Override // RU0.c
    @InterfaceC42830m
    public final void d(@k String str, @k String str2) {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        if (1 >= f14469c) {
            c cVar = f14468b;
            StringBuilder sb2 = new StringBuilder();
            f14467a.getClass();
            cVar.d(H.o(sb2, f14470d, ':', str), str2);
        }
    }

    @Override // RU0.c
    @InterfaceC42830m
    public final void e(@k String str, @k String str2) {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        if (3 >= f14469c) {
            c cVar = f14468b;
            StringBuilder sb2 = new StringBuilder();
            f14467a.getClass();
            cVar.e(H.o(sb2, f14470d, ':', str), str2);
        }
    }

    @Override // RU0.c
    @InterfaceC42830m
    public final void f(@k String str, @k String str2) {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        if (f14469c <= 0) {
            c cVar = f14468b;
            StringBuilder sb2 = new StringBuilder();
            f14467a.getClass();
            cVar.d(H.o(sb2, f14470d, ':', str), str2);
        }
    }

    @Override // RU0.c
    @InterfaceC42830m
    public final void e(@k String str, @k String str2, @k Throwable th2) {
        LogLevel[] logLevelArr = LogLevel.f337864b;
        if (4 >= f14469c) {
            c cVar = f14468b;
            StringBuilder sb2 = new StringBuilder();
            f14467a.getClass();
            cVar.e(H.o(sb2, f14470d, ':', str), str2, th2);
        }
    }
}
