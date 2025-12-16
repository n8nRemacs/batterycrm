package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class u0<E, C extends Collection<? super E>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Collection f410997q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410998r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410999s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411000t;

    /* renamed from: u, reason: collision with root package name */
    public int f411001u;

    public u0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411000t = obj;
        this.f411001u = (this.f411001u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411001u;
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
            InterfaceC43125y interfaceC43125y = this.f410999s;
            K0 k03 = this.f410998r;
            Collection collection = this.f410997q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    collection.add(interfaceC43125y.next());
                    this.f410997q = collection;
                    this.f410998r = k03;
                    this.f410999s = interfaceC43125y;
                    this.f411001u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return collection;
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
