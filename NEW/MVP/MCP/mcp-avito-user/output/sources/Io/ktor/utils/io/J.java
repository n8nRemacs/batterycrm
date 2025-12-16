package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {936, 936, 936, 2426, 2481, 936, 936, 2508}, m = "writeByte$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "b", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "b", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "b"}, s = {"L$0", "L$1", "B$0", "L$0", "L$1", "L$2", "B$0", "I$0", "L$0", "L$1", "B$0"})
/* loaded from: classes8.dex */
final class J extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public byte f400640q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400641r;

    /* renamed from: s, reason: collision with root package name */
    public C41619a f400642s;

    /* renamed from: t, reason: collision with root package name */
    public ByteBuffer f400643t;

    /* renamed from: u, reason: collision with root package name */
    public int f400644u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400645v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f400646w;

    /* renamed from: x, reason: collision with root package name */
    public int f400647x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400646w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400645v = obj;
        this.f400647x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.V0(this.f400646w, (byte) 0, this);
    }
}
