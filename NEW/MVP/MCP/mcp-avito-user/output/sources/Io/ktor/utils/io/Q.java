package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {940, 940, 940, 2426, 2481, 940, 940, 2508}, m = "writeShort$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "s", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "s", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "s"}, s = {"L$0", "L$1", "S$0", "L$0", "L$1", "L$2", "S$0", "I$0", "L$0", "L$1", "S$0"})
/* loaded from: classes8.dex */
final class Q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public short f400724q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400725r;

    /* renamed from: s, reason: collision with root package name */
    public C41619a f400726s;

    /* renamed from: t, reason: collision with root package name */
    public ByteBuffer f400727t;

    /* renamed from: u, reason: collision with root package name */
    public int f400728u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400729v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C41619a f400730w;

    /* renamed from: x, reason: collision with root package name */
    public int f400731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400730w = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400729v = obj;
        this.f400731x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.c1(this.f400730w, (short) 0, this);
    }
}
