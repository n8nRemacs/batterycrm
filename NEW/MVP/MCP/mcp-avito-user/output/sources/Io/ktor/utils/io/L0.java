package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41641n;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {186}, m = "writePacket$suspendImpl", n = {"$this", "packet"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class L0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400670q;

    /* renamed from: r, reason: collision with root package name */
    public C41641n f400671r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400672s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400673t;

    /* renamed from: u, reason: collision with root package name */
    public int f400674u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400673t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400672s = obj;
        this.f400674u |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.t0(this.f400673t, null, this);
    }
}
