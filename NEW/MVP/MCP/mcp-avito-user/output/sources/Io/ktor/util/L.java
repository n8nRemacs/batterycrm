package io.ktor.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deflater.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0}, l = {52}, m = "deflateWhile", n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class L extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f400402q;

    /* renamed from: r, reason: collision with root package name */
    public Deflater f400403r;

    /* renamed from: s, reason: collision with root package name */
    public ByteBuffer f400404s;

    /* renamed from: t, reason: collision with root package name */
    public Y41.a f400405t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f400406u;

    /* renamed from: v, reason: collision with root package name */
    public int f400407v;

    public L() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400406u = obj;
        this.f400407v |= BeduinInputModel.MIN_TEXT_VERSION;
        return Q.a(null, null, null, null, this);
    }
}
