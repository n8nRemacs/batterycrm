package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {2, 2, 2, 2, 5, 5}, l = {1790, 1792, 1797, 1802, 1804, 1808}, m = "lookAheadSuspend$suspendImpl", n = {"$this", "visitor", "result", "this_$iv", "$this", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* renamed from: io.ktor.utils.io.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41656g<R> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400951q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400952r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f400953s;

    /* renamed from: t, reason: collision with root package name */
    public C41619a f400954t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f400955u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400956v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f400957w;

    /* renamed from: x, reason: collision with root package name */
    public int f400958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41656g(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400957w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400956v = obj;
        this.f400958x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.c0(this.f400957w, null, this);
    }
}
