package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {2374}, m = "peekTo-lBXzO7A$suspendImpl", n = {"bytesCopied"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41659h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.f f400969q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400970r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41619a f400971s;

    /* renamed from: t, reason: collision with root package name */
    public int f400972t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41659h(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400971s = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400970r = obj;
        this.f400972t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.d0(this.f400971s, null, 0L, 0L, 0L, this);
    }
}
