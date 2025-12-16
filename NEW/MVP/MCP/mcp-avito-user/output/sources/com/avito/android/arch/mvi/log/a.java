package com.avito.android.arch.mvi.log;

import Y61.k;
import com.avito.android.arch.mvi.log.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: FeatureLogger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/log/a;", "", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: FeatureLogger.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/arch/mvi/log/a$a;", "Lcom/avito/android/arch/mvi/log/a;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.arch.mvi.log.a$a, reason: collision with other inner class name */
    public static final class C2710a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AW.b f91972a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f91973b;

        /* compiled from: FeatureLogger.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.arch.mvi.log.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2711a {
            static {
                int[] iArr = new int[LogVerbosity.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    LogVerbosity logVerbosity = LogVerbosity.f91967b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                int[] iArr2 = new int[LogLevel.values().length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    LogLevel logLevel = LogLevel.f91962b;
                    iArr2[1] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    LogLevel logLevel2 = LogLevel.f91962b;
                    iArr2[2] = 3;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* compiled from: FeatureLogger.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.arch.mvi.log.a$a$b */
        public static final class b extends N implements Y41.a<String> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ f f91975m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ T f91976n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, T t12) {
                super(0);
                this.f91975m = fVar;
                this.f91976n = t12;
            }

            @Override // Y41.a
            public final String invoke() {
                C2710a c2710a = C2710a.this;
                f fVar = this.f91975m;
                LogVerbosity logVerbosityE = c2710a.e(fVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2710a.d(fVar));
                int iOrdinal = logVerbosityE.ordinal();
                Object obj = this.f91976n;
                if (iOrdinal == 0) {
                    sb2.append(" > " + obj);
                } else if (iOrdinal == 1) {
                    sb2.append(" > ".concat(obj.getClass().getSimpleName()));
                }
                return sb2.toString();
            }
        }

        /* compiled from: FeatureLogger.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.arch.mvi.log.a$a$c */
        public static final class c extends N implements Y41.a<String> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ f f91978m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f fVar) {
                super(0);
                this.f91978m = fVar;
            }

            @Override // Y41.a
            public final String invoke() {
                return C2710a.this.d(this.f91978m);
            }
        }

        public C2710a() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.arch.mvi.log.a
        public final void a(@k String str, @k f fVar, @k Throwable th2) {
            this.f91972a.a(str, fVar.getF91990a(), th2);
        }

        @Override // com.avito.android.arch.mvi.log.a
        public final <T> void b(@k String str, @k f fVar, @k T t12) {
            f(str, fVar, new b(fVar, t12));
        }

        @Override // com.avito.android.arch.mvi.log.a
        public final void c(@k String str, @k f fVar) {
            f(str, fVar, new c(fVar));
        }

        public final String d(f fVar) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.getF91990a());
            if (this.f91973b.f91995a == LogLevel.f91962b) {
                sb2.append(" [" + Thread.currentThread().getName() + ']');
            }
            return sb2.toString();
        }

        public final LogVerbosity e(f fVar) {
            boolean z12 = fVar instanceof f.a;
            g gVar = this.f91973b;
            if (z12) {
                return gVar.f91996b;
            }
            if (fVar instanceof f.c) {
                return gVar.f91997c;
            }
            if (fVar instanceof f.b) {
                return gVar.f91998d;
            }
            if (fVar instanceof f.d) {
                return gVar.f91999e;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void f(String str, f fVar, Y41.a<String> aVar) {
            if (e(fVar) != LogVerbosity.f91969d) {
                int iOrdinal = this.f91973b.f91995a.ordinal();
                AW.b bVar = this.f91972a;
                if (iOrdinal == 0) {
                    bVar.k(str, aVar);
                } else {
                    if (iOrdinal != 1) {
                        return;
                    }
                    bVar.l(str, null, aVar);
                }
            }
        }

        public C2710a(@k AW.b bVar, @k g gVar) {
            this.f91972a = bVar;
            this.f91973b = gVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C2710a(AW.b bVar, g gVar, int i12, C42822w c42822w) {
            bVar = (i12 & 1) != 0 ? AW.d.f431a : bVar;
            if ((i12 & 2) != 0) {
                g.f91991f.getClass();
                gVar = g.f91992g;
            }
            this(bVar, gVar);
        }
    }

    void a(@k String str, @k f fVar, @k Throwable th2);

    <T> void b(@k String str, @k f fVar, @k T t12);

    void c(@k String str, @k f fVar);
}
