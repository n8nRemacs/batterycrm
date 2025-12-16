package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/W0;", "", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface W0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f400795a = a.f400796a;

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/W0$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f400796a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C<X> f400797b = C42727D.c(C11422a.f400798l);

        /* compiled from: ByteReadChannelJVM.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/X;", "invoke", "()Lio/ktor/utils/io/X;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: io.ktor.utils.io.W0$a$a, reason: collision with other inner class name */
        public static final class C11422a extends kotlin.jvm.internal.N implements Y41.a<X> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11422a f400798l = new C11422a();

            public C11422a() {
                super(0);
            }

            @Override // Y41.a
            public final X invoke() {
                C41619a c41619aA = C41620a0.a();
                c41619aA.h(null);
                return c41619aA;
            }
        }
    }

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
    }

    @Y61.l
    Object A(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object C(long j12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object E(int i12, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object H(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object I(long j12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object J(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object K(@Y61.k byte[] bArr, int i12, @Y61.k ContinuationImpl continuationImpl);

    boolean f(@Y61.l Throwable th2);

    @Y61.l
    Throwable g();

    int i();

    @Y61.l
    Object j(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object m(int i12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object n(@Y61.k Continuation<? super Byte> continuation);

    @Y61.l
    Object p(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k Continuation<? super Integer> continuation);

    boolean r();

    @Y61.l
    Object s(@Y61.k ByteBuffer byteBuffer, long j12, long j13, long j14, @Y61.k Continuation continuation);

    @Y61.l
    Object v(@Y61.k Continuation continuation);

    @Y61.l
    Object w(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl);

    boolean x();
}
