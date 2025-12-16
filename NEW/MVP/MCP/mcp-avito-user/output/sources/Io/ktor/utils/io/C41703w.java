package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41640m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0}, l = {2093}, m = "readRemainingSuspend", n = {"this", "builder$iv", "remaining", "$this$writeWhile$iv", "tail$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: io.ktor.utils.io.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41703w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401338q;

    /* renamed from: r, reason: collision with root package name */
    public C41640m f401339r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f401340s;

    /* renamed from: t, reason: collision with root package name */
    public io.ktor.utils.io.core.E f401341t;

    /* renamed from: u, reason: collision with root package name */
    public io.ktor.utils.io.core.internal.b f401342u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f401343v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f401344w;

    /* renamed from: x, reason: collision with root package name */
    public int f401345x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41703w(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401344w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401343v = obj;
        this.f401345x |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f401344w.s0(0L, this);
    }
}
