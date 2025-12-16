package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0, 0}, l = {555}, m = "readFullySuspend", n = {"this", "dst", "offset", "length", "written"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
/* renamed from: io.ktor.utils.io.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41692s0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401286q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f401287r;

    /* renamed from: s, reason: collision with root package name */
    public int f401288s;

    /* renamed from: t, reason: collision with root package name */
    public int f401289t;

    /* renamed from: u, reason: collision with root package name */
    public int f401290u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f401291v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401292w;

    /* renamed from: x, reason: collision with root package name */
    public int f401293x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41692s0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401292w = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401291v = obj;
        this.f401293x |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        return this.f401292w.e0(null, 0, 0, this);
    }
}
