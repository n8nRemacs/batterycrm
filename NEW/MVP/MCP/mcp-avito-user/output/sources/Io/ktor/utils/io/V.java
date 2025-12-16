package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {1537, 1549}, m = "writeWhileSuspend", n = {"this", "block", "continueWriting", "this_$iv", "current$iv", "capacity$iv", "capacity", "dst", "$this$writeWhileSuspend_u24lambda_u2497", "before$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0"})
/* loaded from: classes8.dex */
final class V extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f400777A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C41619a f400778B;

    /* renamed from: C, reason: collision with root package name */
    public int f400779C;

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400780q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f400781r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f400782s;

    /* renamed from: t, reason: collision with root package name */
    public C41619a f400783t;

    /* renamed from: u, reason: collision with root package name */
    public C41619a f400784u;

    /* renamed from: v, reason: collision with root package name */
    public io.ktor.utils.io.internal.l f400785v;

    /* renamed from: w, reason: collision with root package name */
    public io.ktor.utils.io.internal.l f400786w;

    /* renamed from: x, reason: collision with root package name */
    public ByteBuffer f400787x;

    /* renamed from: y, reason: collision with root package name */
    public C41619a f400788y;

    /* renamed from: z, reason: collision with root package name */
    public long f400789z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400778B = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400777A = obj;
        this.f400779C |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400778B.i1(null, this);
    }
}
