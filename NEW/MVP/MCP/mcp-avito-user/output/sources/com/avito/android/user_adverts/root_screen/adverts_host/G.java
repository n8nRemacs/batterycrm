package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import PI0.a;
import PI0.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPI0/b;", "infoState", "Lkotlin/G0;", "emit", "(LPI0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class G<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f312234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312235c;

    public G(UserAdvertsHostFragment userAdvertsHostFragment, InterfaceC50474d interfaceC50474d) {
        this.f312234b = interfaceC50474d;
        this.f312235c = userAdvertsHostFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        PI0.b bVar = (PI0.b) obj;
        if (!(bVar instanceof b.a) && (bVar instanceof b.C0840b)) {
            this.f312234b.accept(new a.l(a.C0839a.f12953a));
            UserAdvertsHostFragment.G5(this.f312235c, ((b.C0840b) bVar).f12956a);
        }
        return G0.f406611a;
    }
}
