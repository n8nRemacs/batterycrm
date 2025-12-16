package ru.cyberity.input.tools.logs;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import ru.cyberity.log.b;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/tools/logs/a;", "", "<init>", "()V", "", "msg", "", "throwable", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f436058a = new a();

    private a() {
    }

    public final void a(@k String msg, @l Throwable throwable) {
        if (throwable == null) {
            b.b(ru.cyberity.log.a.f436064a, "Fingerprint", msg, null, 4, null);
        } else {
            b.b(ru.cyberity.log.a.f436064a, "Fingerprint", msg, throwable);
        }
    }
}
