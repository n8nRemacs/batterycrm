package ru.cyberity.cbr.core.data.source.dynamic;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SuspendableFlow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"", "Lru/cyberity/cbr/core/data/source/dynamic/f;", "flows", "Lkotlin/G0;", "b", "([Lru/cyberity/cbr/core/data/source/dynamic/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g {

    /* compiled from: SuspendableFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.SuspendableFlowKt", f = "SuspendableFlow.kt", i = {0}, l = {56}, m = "resumeAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433860a;

        /* renamed from: b, reason: collision with root package name */
        int f433861b;

        /* renamed from: c, reason: collision with root package name */
        int f433862c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f433863d;

        /* renamed from: e, reason: collision with root package name */
        int f433864e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433863d = obj;
            this.f433864e |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.a(null, this);
        }
    }

    /* compiled from: SuspendableFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.SuspendableFlowKt", f = "SuspendableFlow.kt", i = {0}, l = {52}, m = "suspendAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433865a;

        /* renamed from: b, reason: collision with root package name */
        int f433866b;

        /* renamed from: c, reason: collision with root package name */
        int f433867c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f433868d;

        /* renamed from: e, reason: collision with root package name */
        int f433869e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433868d = obj;
            this.f433869e |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k ru.cyberity.cbr.core.data.source.dynamic.f<?>[] r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.dynamic.g.a
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.data.source.dynamic.g$a r0 = (ru.cyberity.cbr.core.data.source.dynamic.g.a) r0
            int r1 = r0.f433864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433864e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.g$a r0 = new ru.cyberity.cbr.core.data.source.dynamic.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f433863d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433864e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f433862c
            int r2 = r0.f433861b
            java.lang.Object r4 = r0.f433860a
            ru.cyberity.cbr.core.data.source.dynamic.f[] r4 = (ru.cyberity.cbr.core.data.source.dynamic.f[]) r4
            kotlin.C42729a0.b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.C42729a0.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f433860a = r7
            r0.f433861b = r2
            r0.f433862c = r6
            r0.f433864e = r3
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.g.a(ru.cyberity.cbr.core.data.source.dynamic.f[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k ru.cyberity.cbr.core.data.source.dynamic.f<?>[] r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.dynamic.g.b
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.data.source.dynamic.g$b r0 = (ru.cyberity.cbr.core.data.source.dynamic.g.b) r0
            int r1 = r0.f433869e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433869e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.g$b r0 = new ru.cyberity.cbr.core.data.source.dynamic.g$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f433868d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433869e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f433867c
            int r2 = r0.f433866b
            java.lang.Object r4 = r0.f433865a
            ru.cyberity.cbr.core.data.source.dynamic.f[] r4 = (ru.cyberity.cbr.core.data.source.dynamic.f[]) r4
            kotlin.C42729a0.b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.C42729a0.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f433865a = r7
            r0.f433866b = r2
            r0.f433867c = r6
            r0.f433869e = r3
            java.lang.Object r4 = r4.b(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.g.b(ru.cyberity.cbr.core.data.source.dynamic.f[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
