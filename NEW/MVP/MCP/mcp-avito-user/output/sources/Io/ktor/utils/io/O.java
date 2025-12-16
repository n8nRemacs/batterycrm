package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {948, 948, 948, 2426, 2481, 948, 948, 2508}, m = "writeLong$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "l", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "l", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "l"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "J$0"})
/* loaded from: classes8.dex */
final class O extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public long f400706q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400707r;

    /* renamed from: s, reason: collision with root package name */
    public C41619a f400708s;

    /* renamed from: t, reason: collision with root package name */
    public ByteBuffer f400709t;

    /* renamed from: u, reason: collision with root package name */
    public int f400710u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400711v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f400712w;

    /* renamed from: x, reason: collision with root package name */
    public int f400713x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400712w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400711v = obj;
        this.f400713x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.a1(this.f400712w, 0L, this);
    }
}
