package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1422}, m = "writeFullySuspend", n = {"this", "src", "currentOffset", "currentLength"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class M extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400675q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f400676r;

    /* renamed from: s, reason: collision with root package name */
    public int f400677s;

    /* renamed from: t, reason: collision with root package name */
    public int f400678t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f400679u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C41619a f400680v;

    /* renamed from: w, reason: collision with root package name */
    public int f400681w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400680v = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400679u = obj;
        this.f400681w |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400680v.X0(null, 0, 0, this);
    }
}
