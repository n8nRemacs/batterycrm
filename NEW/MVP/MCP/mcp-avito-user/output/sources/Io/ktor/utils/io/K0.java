package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {168}, m = "writeLong$suspendImpl", n = {"$this", "l"}, s = {"L$0", "J$0"})
/* loaded from: classes8.dex */
final class K0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400659q;

    /* renamed from: r, reason: collision with root package name */
    public long f400660r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400662t;

    /* renamed from: u, reason: collision with root package name */
    public int f400663u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400662t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400661s = obj;
        this.f400663u |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.s0(this.f400662t, 0L, this);
    }
}
