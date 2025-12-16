package ru.cyberity.cbr.core;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: CBRSdkLog.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/a;", "", "<init>", "()V", "", "tag", "message", "", "exception", "Lkotlin/G0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f432517a = new a();

    private a() {
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        aVar.a(str, str2, th2);
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        aVar.b(str, str2, th2);
    }

    public final void a(@k String tag, @k String message, @l Throwable exception) {
        ru.cyberity.log.a.f436064a.a("CyberitySdk").e(tag, message, exception);
    }

    public final void b(@k String tag, @k String message, @l Throwable exception) {
        ru.cyberity.log.a.f436064a.a("CyberitySdk").d(tag, message, exception);
    }
}
