package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {180}, m = "writeDouble$suspendImpl", n = {"$this", "d"}, s = {"L$0", "D$0"})
/* loaded from: classes8.dex */
final class E0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400603q;

    /* renamed from: r, reason: collision with root package name */
    public int f400604r;

    public E0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400603q = obj;
        this.f400604r |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        throw null;
    }
}
