package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class E5<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f34661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, kotlin.G0> f34662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC21692l2 f34663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f34664e;

    /* JADX WARN: Multi-variable type inference failed */
    public E5(androidx.compose.foundation.lazy.w0 w0Var, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2) {
        this.f34661b = w0Var;
        this.f34662c = lVar;
        this.f34663d = abstractC21692l2;
        this.f34664e = lVar2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        ((Number) obj).intValue();
        androidx.compose.foundation.lazy.w0 w0Var = this.f34661b;
        int iH2 = w0Var.h() / 12;
        int iH3 = (w0Var.h() % 12) + 1;
        this.f34662c.invoke(Boxing.boxLong(this.f34663d.e(this.f34664e.f406905b + iH2, iH3).f37014e));
        return kotlin.G0.f406611a;
    }
}
