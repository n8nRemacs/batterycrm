package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {585}, m = "readFullySuspend", n = {"this", "dst", "copied"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: io.ktor.utils.io.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41686q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401255q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401256r;

    /* renamed from: s, reason: collision with root package name */
    public int f401257s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401258t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C41619a f401259u;

    /* renamed from: v, reason: collision with root package name */
    public int f401260v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41686q(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401259u = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401258t = obj;
        this.f401260v |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f401259u.p0(null, 0, this);
    }
}
