package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {2055}, m = "readUTF8Line$suspendImpl", n = {"sb"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class C extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public StringBuilder f400568q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41619a f400570s;

    /* renamed from: t, reason: collision with root package name */
    public int f400571t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400570s = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400569r = obj;
        this.f400571t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.w0(this.f400570s, 0, this);
    }
}
