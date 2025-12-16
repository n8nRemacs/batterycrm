package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1080, 1082, 1084}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class I extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400632q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.utils.io.core.internal.b f400633r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400634s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400635t;

    /* renamed from: u, reason: collision with root package name */
    public int f400636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C41619a c41619a, Continuation<? super I> continuation) {
        super(continuation);
        this.f400635t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400634s = obj;
        this.f400636u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400635t.T0(null, this);
    }
}
