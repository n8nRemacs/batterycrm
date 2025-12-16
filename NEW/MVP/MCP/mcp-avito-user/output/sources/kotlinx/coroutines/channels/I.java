package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channels.common.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {112}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
/* loaded from: classes8.dex */
final class I<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public List f410801q;

    /* renamed from: r, reason: collision with root package name */
    public List f410802r;

    /* renamed from: s, reason: collision with root package name */
    public K0 f410803s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC43125y f410804t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f410805u;

    /* renamed from: v, reason: collision with root package name */
    public int f410806v;

    public I() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410805u = obj;
        this.f410806v = (this.f410806v | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410806v;
        K0 k02 = null;
        if (i12 == 0) {
            C42729a0.b(obj);
            C42745f0.t();
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC43125y interfaceC43125y = this.f410804t;
            K0 k03 = this.f410803s;
            List list = this.f410802r;
            List list2 = this.f410801q;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    list.add(interfaceC43125y.next());
                    this.f410801q = list2;
                    this.f410802r = list;
                    this.f410803s = k03;
                    this.f410804t = interfaceC43125y;
                    this.f410806v = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                k03.c(null);
                return C42745f0.p(list2);
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
