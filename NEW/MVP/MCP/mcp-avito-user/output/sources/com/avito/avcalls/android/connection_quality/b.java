package com.avito.avcalls.android.connection_quality;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.x1;

/* compiled from: ConnectionQualityDetector.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/connection_quality/b;", "Lcom/avito/avcalls/android/connection_quality/a;", "Lcom/avito/avcalls/android/connection_quality/d;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a, d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Z1<ConnectionQualityStatus> f331682a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43238h f331683b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public N0 f331684c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43197r1 f331685d;

    /* compiled from: ConnectionQualityDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.connection_quality.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C10308b {
        static {
            int[] iArr = new int[ConnectionQualityStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConnectionQualityStatus connectionQualityStatus = ConnectionQualityStatus.f331677b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ConnectionQualityStatus connectionQualityStatus2 = ConnectionQualityStatus.f331677b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ConnectionQualityDetector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.connection_quality.ConnectionQualityDetectorImpl$postStatus$1", f = "ConnectionQualityDetector.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331686q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f331687r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f331688s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f331687r = j12;
            this.f331688s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(this.f331687r, this.f331688s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331686q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f331686q = 1;
                if (C43131e0.b(this.f331687r, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f331688s.f331682a.K5(ConnectionQualityStatus.f331677b);
            return G0.f406611a;
        }
    }

    public b(@k com.avito.avcalls.android.utils.coroutines.c cVar) {
        Z1<ConnectionQualityStatus> z1A = p2.a(ConnectionQualityStatus.f331677b);
        this.f331682a = z1A;
        this.f331683b = U.a(cVar.f332438d.plus(x1.a("ConnectionQualityDetectorRelease")));
        this.f331685d = new C43197r1(new com.avito.avcalls.android.connection_quality.c(2, null), z1A);
    }

    public final void a(ConnectionQualityStatus connectionQualityStatus) {
        long j12;
        N0 n02 = this.f331684c;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f331682a.K5(connectionQualityStatus);
        int iOrdinal = connectionQualityStatus.ordinal();
        if (iOrdinal != 0) {
            j12 = 30000;
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            j12 = 0;
        }
        if (j12 > 0) {
            this.f331684c = C43259k.d(this.f331683b, null, null, new c(j12, this, null), 3);
        }
    }

    @Override // com.avito.avcalls.android.connection_quality.d
    @k
    /* renamed from: getStatus, reason: from getter */
    public final C43197r1 getF331685d() {
        return this.f331685d;
    }
}
