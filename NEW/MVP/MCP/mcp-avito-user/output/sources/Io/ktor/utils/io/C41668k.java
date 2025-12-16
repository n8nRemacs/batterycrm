package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {737, 741}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
/* renamed from: io.ktor.utils.io.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41668k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401173q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401174r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401175s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f401176t;

    /* renamed from: u, reason: collision with root package name */
    public int f401177u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41668k(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401176t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401175s = obj;
        this.f401177u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f401176t.l0(null, this);
    }
}
