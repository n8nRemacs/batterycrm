package ru.cyberity.cbr.core.common;

import kotlin.Metadata;

/* compiled from: GcTrigger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/common/c0;", "", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface c0 {

    /* compiled from: GcTrigger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/common/c0$a;", "Lru/cyberity/cbr/core/common/c0;", "<init>", "()V", "Lkotlin/G0;", "b", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f432656a = new a();

        private a() {
        }

        private final void b() throws InterruptedException {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                throw new AssertionError();
            }
        }

        public void a() throws InterruptedException {
            Runtime.getRuntime().gc();
            b();
            System.runFinalization();
        }
    }
}
