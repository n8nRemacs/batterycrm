package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelJVMKt", f = "ByteReadChannelJVM.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {309, 312}, m = "copyToImpl", n = {"$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "size"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1"})
/* loaded from: classes8.dex */
final class X0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W0 f400802q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC41649d1 f400803r;

    /* renamed from: s, reason: collision with root package name */
    public io.ktor.utils.io.core.internal.b f400804s;

    /* renamed from: t, reason: collision with root package name */
    public long f400805t;

    /* renamed from: u, reason: collision with root package name */
    public long f400806u;

    /* renamed from: v, reason: collision with root package name */
    public int f400807v;

    /* renamed from: w, reason: collision with root package name */
    public int f400808w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f400809x;

    /* renamed from: y, reason: collision with root package name */
    public int f400810y;

    public X0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400809x = obj;
        this.f400810y |= BeduinInputModel.MIN_TEXT_VERSION;
        return Z0.b(null, null, 0L, this);
    }
}
