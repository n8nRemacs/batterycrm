package com.avito.android.profile.edit;

import com.avito.android.analytics.event.C28445v0;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221983b;

    public F(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f221983b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        EditProfilePresenterImpl editProfilePresenterImpl = this.f221983b;
        List<? extends EditProfileItem> list = editProfilePresenterImpl.f221968j;
        if (list == null) {
            return;
        }
        S s5 = editProfilePresenterImpl.f221967i;
        if (s5 != null) {
            s5.a();
        }
        I0 i0J0 = editProfilePresenterImpl.f221960b.g(list).j0(editProfilePresenterImpl.f221965g.e());
        I i12 = new I(editProfilePresenterImpl);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = i0J0.J(interfaceC43543a, i12);
        C33344y c33344y = new C33344y(editProfilePresenterImpl, 0);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        editProfilePresenterImpl.f221972n.b(pJ2.H(gVar, gVar, interfaceC43543a, c33344y).t0(new J(editProfilePresenterImpl)));
        List<? extends EditProfileItem> list2 = editProfilePresenterImpl.f221968j;
        AvatarItem avatarItem = list2 != null ? (AvatarItem) com.avito.android.profile.edit.refactoring.adapter.e.a(3L, list2) : null;
        if (avatarItem != null ? avatarItem.f222248d : false) {
            editProfilePresenterImpl.f221959a.c(new C28445v0(2L));
        }
    }
}
