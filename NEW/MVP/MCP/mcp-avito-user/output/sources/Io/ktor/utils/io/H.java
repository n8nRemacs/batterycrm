package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1072, 1074, 1076}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class H extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400619q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400620r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400621s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400622t;

    /* renamed from: u, reason: collision with root package name */
    public int f400623u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C41619a c41619a, Continuation<? super H> continuation) {
        super(continuation);
        this.f400622t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400621s = obj;
        this.f400623u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400622t.U0(null, this);
    }
}
