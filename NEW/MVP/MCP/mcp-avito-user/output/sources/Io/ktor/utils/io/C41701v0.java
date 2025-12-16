package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41640m;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {459}, m = "readPacketSuspend", n = {"this", "builder", "remaining"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: io.ktor.utils.io.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41701v0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401324q;

    /* renamed from: r, reason: collision with root package name */
    public C41640m f401325r;

    /* renamed from: s, reason: collision with root package name */
    public int f401326s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401327t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401328u;

    /* renamed from: v, reason: collision with root package name */
    public int f401329v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41701v0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401328u = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401327t = obj;
        this.f401329v |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        return this.f401328u.h0(null, 0, this);
    }
}
