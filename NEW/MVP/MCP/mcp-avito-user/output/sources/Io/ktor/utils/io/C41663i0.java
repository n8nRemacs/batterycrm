package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {673}, m = "discardSuspend", n = {"this", "max", "discarded"}, s = {"L$0", "J$0", "J$1"})
/* renamed from: io.ktor.utils.io.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41663i0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401002q;

    /* renamed from: r, reason: collision with root package name */
    public long f401003r;

    /* renamed from: s, reason: collision with root package name */
    public long f401004s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401005t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401006u;

    /* renamed from: v, reason: collision with root package name */
    public int f401007v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41663i0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401006u = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401005t = obj;
        this.f401007v |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        return this.f401006u.T(0L, 0L, this);
    }
}
