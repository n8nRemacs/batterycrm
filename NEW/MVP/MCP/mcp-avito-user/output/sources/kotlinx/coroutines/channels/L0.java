package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {380}, m = "receiveOrNull", n = {}, s = {})
/* loaded from: classes8.dex */
final class L0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f410815q;

    /* renamed from: r, reason: collision with root package name */
    public int f410816r;

    public L0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        L0<E> l02;
        this.f410815q = obj;
        int i12 = this.f410816r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f410816r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f410816r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            l02 = this;
        } else {
            l02 = new L0<>(this);
        }
        Object obj2 = l02.f410815q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = l02.f410816r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            l02.f410816r = 1;
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return B.c(((B) obj2).f410774a);
    }
}
