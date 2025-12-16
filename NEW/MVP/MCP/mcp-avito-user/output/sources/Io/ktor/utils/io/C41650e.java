package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1702}, m = "discardSuspend", n = {"this", "discarded", "max"}, s = {"L$0", "L$1", "J$0"})
/* renamed from: io.ktor.utils.io.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41650e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400936q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f400937r;

    /* renamed from: s, reason: collision with root package name */
    public long f400938s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400939t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C41619a f400940u;

    /* renamed from: v, reason: collision with root package name */
    public int f400941v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41650e(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400940u = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400939t = obj;
        this.f400941v |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400940u.Y(0L, 0L, this);
    }
}
