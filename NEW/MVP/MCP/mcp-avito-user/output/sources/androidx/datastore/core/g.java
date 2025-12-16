package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/datastore/core/g;", "T", "", "<init>", "()V", "a", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f45419a = new a(null);

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/g$a;", "", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:25:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008d -> B:25:0x006d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object a(androidx.datastore.core.g.a r5, java.util.List r6, androidx.datastore.core.k r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof androidx.datastore.core.e
                if (r0 == 0) goto L16
                r0 = r8
                androidx.datastore.core.e r0 = (androidx.datastore.core.e) r0
                int r1 = r0.f45409u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f45409u = r1
                goto L1b
            L16:
                androidx.datastore.core.e r0 = new androidx.datastore.core.e
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f45407s
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r0.f45409u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L47
                if (r1 == r3) goto L3f
                if (r1 != r2) goto L37
                java.util.Iterator r6 = r0.f45406r
                java.io.Serializable r7 = r0.f45405q
                kotlin.jvm.internal.l0$h r7 = (kotlin.jvm.internal.l0.h) r7
                kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L35
                goto L6d
            L35:
                r5 = move-exception
                goto L86
            L37:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3f:
                java.io.Serializable r6 = r0.f45405q
                java.util.List r6 = (java.util.List) r6
                kotlin.C42729a0.b(r5)
                goto L61
            L47:
                kotlin.C42729a0.b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                androidx.datastore.core.f r1 = new androidx.datastore.core.f
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f45405q = r5
                r0.f45409u = r3
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L60
                goto L9b
            L60:
                r6 = r5
            L61:
                kotlin.jvm.internal.l0$h r5 = new kotlin.jvm.internal.l0$h
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6d:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L93
                java.lang.Object r5 = r6.next()
                Y41.l r5 = (Y41.l) r5
                r0.f45405q = r7     // Catch: java.lang.Throwable -> L35
                r0.f45406r = r6     // Catch: java.lang.Throwable -> L35
                r0.f45409u = r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                if (r5 != r8) goto L6d
                goto L9b
            L86:
                T r1 = r7.f406842b
                if (r1 != 0) goto L8d
                r7.f406842b = r5
                goto L6d
            L8d:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.C42833p.a(r1, r5)
                goto L6d
            L93:
                T r5 = r7.f406842b
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L9c
                kotlin.G0 r8 = kotlin.G0.f406611a
            L9b:
                return r8
            L9c:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.g.a.a(androidx.datastore.core.g$a, java.util.List, androidx.datastore.core.k, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        public a() {
        }
    }
}
