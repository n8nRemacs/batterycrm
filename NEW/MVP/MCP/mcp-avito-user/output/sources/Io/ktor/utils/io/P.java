package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41641n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 1}, l = {1742, 1744}, m = "writePacketSuspend", n = {"this", "packet", "packet"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes8.dex */
final class P extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400714q;

    /* renamed from: r, reason: collision with root package name */
    public C41641n f400715r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400717t;

    /* renamed from: u, reason: collision with root package name */
    public int f400718u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400717t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400716s = obj;
        this.f400718u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400717t.b1(null, this);
    }
}
