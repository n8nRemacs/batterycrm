package o40;

import Y61.k;
import Y61.l;
import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import com.avito.android.offlinization.beduin.analytics.PatternCacheStartResult;
import kotlin.Metadata;

/* compiled from: BeduinPatternCacheMetrics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo40/a;", "", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC44578a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C12163a f419362a = C12163a.f419363a;

    /* compiled from: BeduinPatternCacheMetrics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o40.a$b */
    public static final class b {
        public static /* synthetic */ void a(InterfaceC44578a interfaceC44578a, String str, String str2, boolean z12, BeduinPatternCacheErrorType beduinPatternCacheErrorType, int i12) {
            String str3 = (i12 & 4) != 0 ? null : "aep";
            if ((i12 & 8) != 0) {
                z12 = false;
            }
            interfaceC44578a.b(str, str2, str3, z12, (i12 & 32) != 0 ? null : beduinPatternCacheErrorType);
        }

        public static /* synthetic */ void b(InterfaceC44578a interfaceC44578a, String str, String str2, Long l12, int i12) {
            BeduinPatternCacheErrorType beduinPatternCacheErrorType = BeduinPatternCacheErrorType.f208518f;
            if ((i12 & 32) != 0) {
                beduinPatternCacheErrorType = null;
            }
            interfaceC44578a.a(str, str2, l12, beduinPatternCacheErrorType);
        }
    }

    void a(@k String str, @l String str2, @l Long l12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType);

    void b(@k String str, @l String str2, @l String str3, boolean z12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType);

    void c(@k PatternCacheStartResult patternCacheStartResult);

    /* compiled from: BeduinPatternCacheMetrics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo40/a$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o40.a$a, reason: collision with other inner class name */
    public static final class C12163a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C12163a f419363a = new C12163a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12164a f419364b = new C12164a();

        /* compiled from: BeduinPatternCacheMetrics.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o40/a$a$a", "Lo40/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: o40.a$a$a, reason: collision with other inner class name */
        public static final class C12164a implements InterfaceC44578a {
            @Override // o40.InterfaceC44578a
            public final void c(@k PatternCacheStartResult patternCacheStartResult) {
            }

            @Override // o40.InterfaceC44578a
            public final void a(@k String str, @l String str2, @l Long l12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
            }

            @Override // o40.InterfaceC44578a
            public final void b(@k String str, @l String str2, @l String str3, boolean z12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
            }
        }
    }
}
