package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class O<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.f f410820q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410821r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410822s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410823t;

    /* renamed from: u, reason: collision with root package name */
    public int f410824u;

    public O() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410823t = obj;
        this.f410824u = (this.f410824u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410824u;
        K0 k02 = null;
        if (i12 == 0) {
            C42729a0.b(obj);
            new l0.f();
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC43125y interfaceC43125y = this.f410822s;
            K0 k03 = this.f410821r;
            l0.f fVar = this.f410820q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    interfaceC43125y.next();
                    fVar.f406840b++;
                    this.f410820q = fVar;
                    this.f410821r = k03;
                    this.f410822s = interfaceC43125y;
                    this.f410824u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return Boxing.boxInt(fVar.f406840b);
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
