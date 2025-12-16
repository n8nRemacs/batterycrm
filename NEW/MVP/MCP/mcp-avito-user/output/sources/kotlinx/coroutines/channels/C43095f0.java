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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {517}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: kotlinx.coroutines.channels.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43095f0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.f f410892q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410893r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410894s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410895t;

    /* renamed from: u, reason: collision with root package name */
    public int f410896u;

    public C43095f0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410895t = obj;
        this.f410896u = (this.f410896u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410896u;
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
            InterfaceC43125y interfaceC43125y = this.f410894s;
            K0 k03 = this.f410893r;
            l0.f fVar = this.f410892q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    if (kotlin.jvm.internal.L.f(null, interfaceC43125y.next())) {
                        Integer numBoxInt = Boxing.boxInt(fVar.f406840b);
                        k03.c(null);
                        return numBoxInt;
                    }
                    fVar.f406840b++;
                    this.f410892q = fVar;
                    this.f410893r = k03;
                    this.f410894s = interfaceC43125y;
                    this.f410896u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return Boxing.boxInt(-1);
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
