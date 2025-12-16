package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {313}, m = "readByteSlow", n = {"this"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41678n0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401216q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401218s;

    /* renamed from: t, reason: collision with root package name */
    public int f401219t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41678n0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401218s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401217r = obj;
        this.f401219t |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        return this.f401218s.b0(this);
    }
}
