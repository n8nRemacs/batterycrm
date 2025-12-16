package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {944, 944, 944, 2426, 2481, 944, 944, 2508}, m = "writeInt$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "i", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "i", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "i"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class N extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public int f400692q;

    /* renamed from: r, reason: collision with root package name */
    public int f400693r;

    /* renamed from: s, reason: collision with root package name */
    public Object f400694s;

    /* renamed from: t, reason: collision with root package name */
    public C41619a f400695t;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f400696u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400697v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f400698w;

    /* renamed from: x, reason: collision with root package name */
    public int f400699x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400698w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400697v = obj;
        this.f400699x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.Z0(this.f400698w, 0, this);
    }
}
