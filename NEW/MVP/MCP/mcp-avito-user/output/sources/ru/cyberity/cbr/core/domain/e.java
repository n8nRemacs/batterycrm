package ru.cyberity.cbr.core.domain;

import kotlin.Metadata;

/* compiled from: CBRFaceDetector.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/domain/e;", "", "<init>", "()V", "", "tag", "message", "", "exception", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f433935a = new e();

    private e() {
    }

    public static /* synthetic */ void a(e eVar, String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        eVar.a(str, str2, th2);
    }

    public final void a(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable exception) {
        ru.cyberity.log.a.f436064a.a("FaceDetector").d(tag, message, exception);
    }
}
