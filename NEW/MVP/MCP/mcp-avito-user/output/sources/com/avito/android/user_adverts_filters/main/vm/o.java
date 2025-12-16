package com.avito.android.user_adverts_filters.main.vm;

import androidx.view.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rJ0.InterfaceC47555b;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrJ0/b;", "event", "Lkotlin/G0;", "emit", "(LrJ0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316454b;

    public o(h hVar) {
        this.f316454b = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC47555b interfaceC47555b = (InterfaceC47555b) obj;
        boolean z12 = interfaceC47555b instanceof InterfaceC47555b.a;
        h hVar = this.f316454b;
        if (z12) {
            C43259k.d(N0.a(hVar), null, null, new k(hVar, null), 3);
        } else if (interfaceC47555b instanceof InterfaceC47555b.C12369b) {
            C43259k.d(N0.a(hVar), null, null, new l(hVar, null, interfaceC47555b), 3);
        } else if (interfaceC47555b instanceof InterfaceC47555b.d) {
            C43259k.d(N0.a(hVar), null, null, new m(hVar, null, interfaceC47555b), 3);
        } else if (interfaceC47555b instanceof InterfaceC47555b.c) {
            C43259k.d(N0.a(hVar), null, null, new n(hVar, null, interfaceC47555b), 3);
        }
        return G0.f406611a;
    }
}
