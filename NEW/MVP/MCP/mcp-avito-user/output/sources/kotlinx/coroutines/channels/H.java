package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channels.common.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {82}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class H<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f410796q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410797r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410798s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410799t;

    /* renamed from: u, reason: collision with root package name */
    public int f410800u;

    public H() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410799t = obj;
        this.f410800u = (this.f410800u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410800u;
        K0 k02 = null;
        if (i12 == 0) {
            C42729a0.b(obj);
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC43125y interfaceC43125y = this.f410798s;
            K0 k03 = this.f410797r;
            Y41.l lVar = this.f410796q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    lVar.invoke(interfaceC43125y.next());
                    this.f410796q = lVar;
                    this.f410797r = k03;
                    this.f410798s = interfaceC43125y;
                    this.f410800u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return kotlin.G0.f406611a;
            } catch (Throwable th3) {
                th = th3;
                k02 = k03;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            D.a(k02, th);
            throw th4;
        }
    }
}
