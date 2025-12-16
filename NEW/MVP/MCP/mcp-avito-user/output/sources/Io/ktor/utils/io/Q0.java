package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {112, 113}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class Q0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N0 f400732q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400733r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400734s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N0 f400735t;

    /* renamed from: u, reason: collision with root package name */
    public int f400736u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(N0 n02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400735t = n02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400734s = obj;
        this.f400736u |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = N0.f400700m;
        return this.f400735t.w0(null, this);
    }
}
