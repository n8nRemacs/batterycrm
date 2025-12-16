package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i2;", "", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface i2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f411430a = a.f411431a;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/i2$a;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f411431a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final i2 f411432b = new k2();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final i2 f411433c = new l2();

        @Y61.k
        public static i2 a(long j12, long j13) {
            return new m2(j12, j13);
        }

        public static i2 b(a aVar, long j12, int i12) {
            if ((i12 & 1) != 0) {
                j12 = 0;
            }
            long j13 = (i12 & 2) != 0 ? Long.MAX_VALUE : 0L;
            aVar.getClass();
            return new m2(j12, j13);
        }
    }

    @Y61.k
    InterfaceC43160i<SharingCommand> a(@Y61.k n2<Integer> n2Var);
}
