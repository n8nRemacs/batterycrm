package ru.cyberity.log;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: LoggerExtensions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b\"#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/cyberity/log/a;", "", "tag", "message", "", "throwable", "Lkotlin/G0;", "b", "(Lru/cyberity/log/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "SEVERITY_LETTER", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    private static final Map<Integer, String> f436071a = P0.g(new Q(6, "E"), new Q(5, "W"), new Q(3, "D"), new Q(4, "I"), new Q(2, "V"));

    @k
    public static final Map<Integer, String> a() {
        return f436071a;
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = "";
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        b(aVar, str, str2, th2);
    }

    public static /* synthetic */ void c(a aVar, String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = "";
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        c(aVar, str, str2, th2);
    }

    public static final void b(@k a aVar, @k String str, @k String str2, @l Throwable th2) {
        aVar.a(LoggerType.KIBANA).e(str, str2, th2);
    }

    public static final void c(@k a aVar, @k String str, @k String str2, @l Throwable th2) {
        aVar.a(LoggerType.KIBANA).i(str, str2, th2);
    }
}
