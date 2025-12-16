package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class L<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f410810q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410811r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410812s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410813t;

    /* renamed from: u, reason: collision with root package name */
    public int f410814u;

    public L() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410813t = obj;
        this.f410814u = (this.f410814u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410814u;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC43125y interfaceC43125y = this.f410812s;
        K0 k02 = this.f410811r;
        Y41.l lVar = this.f410810q;
        try {
            C42729a0.b(obj);
            while (((Boolean) obj).booleanValue()) {
                lVar.invoke(interfaceC43125y.next());
                this.f410810q = lVar;
                this.f410811r = k02;
                this.f410812s = interfaceC43125y;
                this.f410814u = 1;
                obj = interfaceC43125y.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            k02.c(null);
            return kotlin.G0.f406611a;
        } catch (Throwable th2) {
            k02.c(null);
            throw th2;
        }
    }
}
