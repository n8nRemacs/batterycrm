package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class v0<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Map f411021q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f411022r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f411023s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411024t;

    /* renamed from: u, reason: collision with root package name */
    public int f411025u;

    public v0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411024t = obj;
        this.f411025u = (this.f411025u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411025u;
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
            InterfaceC43125y interfaceC43125y = this.f411023s;
            K0 k03 = this.f411022r;
            Map map = this.f411021q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    kotlin.Q q12 = (kotlin.Q) interfaceC43125y.next();
                    map.put(q12.f406619b, q12.f406620c);
                    this.f411021q = map;
                    this.f411022r = k03;
                    this.f411023s = interfaceC43125y;
                    this.f411025u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return map;
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
