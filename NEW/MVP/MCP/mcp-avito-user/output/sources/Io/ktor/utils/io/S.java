package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1439, 1441}, m = "writeSuspend", n = {"this", "src", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class S extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400744q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f400745r;

    /* renamed from: s, reason: collision with root package name */
    public int f400746s;

    /* renamed from: t, reason: collision with root package name */
    public int f400747t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f400748u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C41619a f400749v;

    /* renamed from: w, reason: collision with root package name */
    public int f400750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400749v = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400748u = obj;
        this.f400750w |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400749v.e1(null, 0, 0, this);
    }
}
