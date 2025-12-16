package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {68}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class U<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public int f410839q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410840r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410841s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410842t;

    /* renamed from: u, reason: collision with root package name */
    public int f410843u;

    public U() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410842t = obj;
        this.f410843u = (this.f410843u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410843u;
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
            int i13 = this.f410839q;
            InterfaceC43125y interfaceC43125y = this.f410841s;
            K0 k03 = this.f410840r;
            try {
                C42729a0.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    Object next = interfaceC43125y.next();
                    int i14 = i13 + 1;
                    if (i13 == 0) {
                        k03.c(null);
                        return next;
                    }
                    this.f410840r = k03;
                    this.f410841s = interfaceC43125y;
                    this.f410839q = i14;
                    this.f410843u = 1;
                    obj = interfaceC43125y.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i13 = i14;
                }
                throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index 0.");
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
