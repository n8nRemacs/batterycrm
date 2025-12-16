package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221940b;

    public B(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f221940b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        A a12 = new A((EditProfileItem) obj);
        EditProfilePresenterImpl editProfilePresenterImpl = this.f221940b;
        List<? extends EditProfileItem> list = editProfilePresenterImpl.f221968j;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            a12.invoke(arrayList);
            if (!arrayList.equals(list)) {
                editProfilePresenterImpl.g(arrayList);
            }
        }
        editProfilePresenterImpl.f221969k = true;
        editProfilePresenterImpl.f();
    }
}
