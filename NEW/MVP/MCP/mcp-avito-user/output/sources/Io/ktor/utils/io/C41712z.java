package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2236}, m = "readSuspendImpl", n = {"this", "size"}, s = {"L$0", "I$0"})
/* renamed from: io.ktor.utils.io.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41712z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401372q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401373r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41619a f401374s;

    /* renamed from: t, reason: collision with root package name */
    public int f401375t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41712z(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401374s = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401373r = obj;
        this.f401375t |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f401374s.u0(0, this);
    }
}
