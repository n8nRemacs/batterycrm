package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {162}, m = "writeInt$suspendImpl", n = {"$this", "i"}, s = {"L$0", "I$0"})
/* loaded from: classes8.dex */
final class J0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400648q;

    /* renamed from: r, reason: collision with root package name */
    public int f400649r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400650s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400651t;

    /* renamed from: u, reason: collision with root package name */
    public int f400652u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400651t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400650s = obj;
        this.f400652u |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.r0(this.f400651t, 0, this);
    }
}
