package com.avito.android.recall_me.presentation;

import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import zi0.InterfaceC50571a;
import zi0.InterfaceC50573c;

/* compiled from: RecallMeViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzi0/a$a;", "action", "Lio/reactivex/rxjava3/core/E;", "Lzi0/c;", "apply", "(Lzi0/a$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f251870b;

    public A(I i12) {
        this.f251870b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list;
        InterfaceC50571a.C12967a c12967a = (InterfaceC50571a.C12967a) obj;
        RecallMeFormState recallMeFormState = c12967a.f444177b;
        if (recallMeFormState == null) {
            recallMeFormState = new RecallMeFormState(null, null, 3, null);
        }
        I i12 = this.f251870b;
        i12.f251888S = recallMeFormState;
        InterfaceC50573c value = i12.f251885P.getValue();
        InterfaceC50573c.C12969c c12969c = value instanceof InterfaceC50573c.C12969c ? (InterfaceC50573c.C12969c) value : null;
        if (c12969c == null || (list = c12969c.f444192a) == null) {
            list = C42784z0.f406748b;
        }
        if (O2.a(list)) {
            return io.reactivex.rxjava3.core.z.c0(InterfaceC50573c.a.f444190a);
        }
        RecallMeParams recallMeParams = c12967a.f444176a;
        return i12.f251879J.b(recallMeParams.f251909b, recallMeParams.f251911d).F().K(new w(i12)).d0(new x(i12)).d0(y.f252035b).j0(i12.f251881L.e()).m0(new z(i12));
    }
}
