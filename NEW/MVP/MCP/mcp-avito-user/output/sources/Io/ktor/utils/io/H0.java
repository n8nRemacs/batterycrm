package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {204}, m = "writeFully$suspendImpl", n = {"$this", "src", "currentIndex", "endIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class H0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400624q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f400625r;

    /* renamed from: s, reason: collision with root package name */
    public int f400626s;

    /* renamed from: t, reason: collision with root package name */
    public int f400627t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f400628u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400629v;

    /* renamed from: w, reason: collision with root package name */
    public int f400630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400629v = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400628u = obj;
        this.f400630w |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.q0(this.f400629v, null, 0, 0, this);
    }
}
