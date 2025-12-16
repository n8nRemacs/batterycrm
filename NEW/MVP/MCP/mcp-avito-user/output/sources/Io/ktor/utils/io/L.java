package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1123, 1125}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class L extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400665q;

    /* renamed from: r, reason: collision with root package name */
    public C41628a f400666r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400667s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400668t;

    /* renamed from: u, reason: collision with root package name */
    public int f400669u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400668t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400667s = obj;
        this.f400669u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400668t.W0(null, this);
    }
}
