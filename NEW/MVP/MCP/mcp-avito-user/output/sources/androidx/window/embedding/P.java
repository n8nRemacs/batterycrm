package androidx.window.embedding;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SplitController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/embedding/P;", "", "a", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55220a = 0;

    /* compiled from: SplitController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/P$a;", "", "<init>", "()V", "", "sDebug", "Z", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SplitController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/P$b;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final b f55221b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final b f55222c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final b f55223d;

        /* renamed from: a, reason: collision with root package name */
        public final int f55224a;

        /* compiled from: SplitController.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/embedding/P$b$a;", "", "<init>", "()V", "Landroidx/window/embedding/P$b;", "SPLIT_AVAILABLE", "Landroidx/window/embedding/P$b;", "SPLIT_ERROR_PROPERTY_NOT_DECLARED", "SPLIT_UNAVAILABLE", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
            f55221b = new b(0);
            f55222c = new b(1);
            f55223d = new b(2);
        }

        public b(int i12) {
            this.f55224a = i12;
        }

        @Y61.k
        public final String toString() {
            int i12 = this.f55224a;
            return i12 != 0 ? i12 != 1 ? i12 != 2 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
        }
    }

    static {
        new a(null);
    }
}
