package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41640m;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {800}, m = "readPacketSuspend", n = {"this", "builder", "buffer", "remaining"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: io.ktor.utils.io.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41700v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401317q;

    /* renamed from: r, reason: collision with root package name */
    public C41640m f401318r;

    /* renamed from: s, reason: collision with root package name */
    public ByteBuffer f401319s;

    /* renamed from: t, reason: collision with root package name */
    public int f401320t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f401321u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C41619a f401322v;

    /* renamed from: w, reason: collision with root package name */
    public int f401323w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41700v(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401322v = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401321u = obj;
        this.f401323w |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f401322v.r0(0, null, null, this);
    }
}
