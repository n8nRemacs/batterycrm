package s40;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OfflineInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ls40/b;", "", "a", "b", "Ls40/b$a;", "Ls40/b$b;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC47995b {

    /* compiled from: OfflineInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls40/b$a;", "Ls40/b;", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s40.b$a */
    public static final /* data */ class a implements InterfaceC47995b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f437464a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 353484267;
        }

        @k
        public final String toString() {
            return "Disabled";
        }
    }

    /* compiled from: OfflineInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls40/b$b;", "Ls40/b;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s40.b$b, reason: collision with other inner class name */
    public static final class C12608b implements InterfaceC47995b {

        /* renamed from: a, reason: collision with root package name */
        public final long f437465a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47994a f437466b;

        public C12608b(long j12, @k C47994a c47994a) {
            this.f437465a = j12;
            this.f437466b = c47994a;
        }

        public /* synthetic */ C12608b(long j12, C47994a c47994a, int i12, C42822w c42822w) {
            this(j12, (i12 & 2) != 0 ? new C47994a(null, null, 3, null) : c47994a);
        }
    }
}
