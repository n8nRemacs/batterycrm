package kotlinx.coroutines.reactive;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.channels.K0;

/* compiled from: Channel.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.reactive.ChannelKt", f = "Channel.kt", i = {0, 0}, l = {115}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class f<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f411990q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f411991r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f411992s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411993t;

    /* renamed from: u, reason: collision with root package name */
    public int f411994u;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411993t = obj;
        this.f411994u = (this.f411994u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411994u;
        if (i12 == 0) {
            C42729a0.b(obj);
            new D();
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC43125y interfaceC43125y = this.f411992s;
        K0 k02 = this.f411991r;
        Y41.l lVar = this.f411990q;
        try {
            C42729a0.b(obj);
            while (((Boolean) obj).booleanValue()) {
                lVar.invoke(interfaceC43125y.next());
                this.f411990q = lVar;
                this.f411991r = k02;
                this.f411992s = interfaceC43125y;
                this.f411994u = 1;
                obj = interfaceC43125y.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            G0 g02 = G0.f406611a;
            k02.c(null);
            return G0.f406611a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlinx.coroutines.channels.D.a(k02, th2);
                throw th3;
            }
        }
    }
}
