package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {599}, m = "next", n = {"$this"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.channels.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43126z<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f411041q;

    /* renamed from: r, reason: collision with root package name */
    public int f411042r;

    public C43126z() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411041q = obj;
        this.f411042r = (this.f411042r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411042r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f411042r = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        if (((Boolean) obj).booleanValue()) {
            throw null;
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
