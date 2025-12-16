package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {150}, m = "writeByte$suspendImpl", n = {"$this", "b"}, s = {"L$0", "B$0"})
/* loaded from: classes8.dex */
final class D0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400589q;

    /* renamed from: r, reason: collision with root package name */
    public byte f400590r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400591s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400592t;

    /* renamed from: u, reason: collision with root package name */
    public int f400593u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400592t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400591s = obj;
        this.f400593u |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.o0(this.f400592t, (byte) 0, this);
    }
}
