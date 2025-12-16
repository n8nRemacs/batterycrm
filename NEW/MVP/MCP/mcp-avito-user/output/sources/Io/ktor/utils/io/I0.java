package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {JfifUtil.MARKER_SOS}, m = "writeFully-JT6ljtQ$suspendImpl", n = {"$this", "memory", "endIndex", "currentIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class I0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400637q;

    /* renamed from: r, reason: collision with root package name */
    public int f400638r;

    public I0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400637q = obj;
        this.f400638r |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        throw null;
    }
}
