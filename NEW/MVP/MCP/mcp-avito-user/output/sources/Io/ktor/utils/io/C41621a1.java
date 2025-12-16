package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelKt", f = "ByteReadChannel.kt", i = {0}, l = {261}, m = "copyAndClose", n = {"dst"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41621a1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f400838q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400839r;

    /* renamed from: s, reason: collision with root package name */
    public int f400840s;

    public C41621a1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400839r = obj;
        this.f400840s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41627c1.a(null, null, 0L, this);
    }
}
