package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "result", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class F<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f312233b;

    public F(InterfaceC50474d interfaceC50474d) {
        this.f312233b = interfaceC50474d;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j jVar = (com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j) obj;
        boolean z12 = jVar instanceof j.a;
        InterfaceC50474d interfaceC50474d = this.f312233b;
        if (z12) {
            interfaceC50474d.accept(new a.d(((j.a) jVar).f312676a));
        } else if (jVar instanceof j.b) {
            interfaceC50474d.accept(new a.e(((j.b) jVar).f312677a));
        }
        return G0.f406611a;
    }
}
