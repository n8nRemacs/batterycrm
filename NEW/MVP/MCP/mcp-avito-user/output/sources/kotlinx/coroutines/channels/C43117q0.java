package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, 182}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: kotlinx.coroutines.channels.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43117q0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public K0 f410976q;

    /* renamed from: r, reason: collision with root package name */
    public Object f410977r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f410978s;

    /* renamed from: t, reason: collision with root package name */
    public int f410979t;

    public C43117q0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        K0 k02;
        this.f410978s = obj;
        this.f410979t = (this.f410979t | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410979t;
        K0 k03 = null;
        if (i12 != 0) {
            if (i12 == 1) {
                InterfaceC43125y interfaceC43125y = (InterfaceC43125y) this.f410977r;
                K0 k04 = this.f410976q;
                try {
                    C42729a0.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        k04.c(null);
                        return null;
                    }
                    Object next = interfaceC43125y.next();
                    this.f410976q = k04;
                    this.f410977r = next;
                    this.f410979t = 2;
                    Object objA = interfaceC43125y.a(this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = next;
                    obj = objA;
                    k02 = k04;
                } catch (Throwable th2) {
                    th = th2;
                    k03 = k04;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f410977r;
                k02 = this.f410976q;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    k03 = k02;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                k02.c(null);
                return null;
            }
            k02.c(null);
            return obj2;
        }
        C42729a0.b(obj);
        try {
            throw null;
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            throw th;
        } catch (Throwable th5) {
            D.a(k03, th);
            throw th5;
        }
    }
}
