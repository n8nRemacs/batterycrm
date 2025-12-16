package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {81}, m = "awaitAtLeastNBytesAvailableForWrite$ktor_io", n = {"this", "count"}, s = {"L$0", "I$0"})
/* renamed from: io.ktor.utils.io.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41648d0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400931q;

    /* renamed from: r, reason: collision with root package name */
    public int f400932r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400933s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400934t;

    /* renamed from: u, reason: collision with root package name */
    public int f400935u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41648d0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400934t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400933s = obj;
        this.f400935u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400934t.P(0, this);
    }
}
