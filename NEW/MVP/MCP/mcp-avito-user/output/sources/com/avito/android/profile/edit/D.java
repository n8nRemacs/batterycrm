package com.avito.android.profile.edit;

import android.content.Intent;
import android.view.View;
import com.avito.android.profile.edit.EditProfileActivity;
import com.avito.android.profile.edit.S;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221943b;

    public D(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f221943b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Intent intentA;
        EditProfilePresenterImpl editProfilePresenterImpl = this.f221943b;
        S s5 = editProfilePresenterImpl.f221967i;
        if (s5 != null) {
            editProfilePresenterImpl.f221970l = false;
            View view = s5.f222004i;
            view.animate().setDuration(200L).alpha(0.0f).setListener(new S.a(view));
        }
        EditProfileActivity editProfileActivity = editProfilePresenterImpl.f221966h;
        if (editProfileActivity != null) {
            int i12 = EditProfileActivity.a.f221958a[editProfileActivity.f221957x.ordinal()];
            if (i12 == 1) {
                InterfaceC33312a interfaceC33312a = editProfileActivity.f221952s;
                intentA = (interfaceC33312a != null ? interfaceC33312a : null).a();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC33312a interfaceC33312a2 = editProfileActivity.f221952s;
                intentA = (interfaceC33312a2 != null ? interfaceC33312a2 : null).c();
            }
            try {
                C35974x2.d(intentA);
                editProfileActivity.startActivityForResult(intentA, 3);
            } catch (Exception e12) {
                V2.f318762a.a(EditProfileActivity.class.getName(), "", e12);
            }
        }
        editProfilePresenterImpl.f221959a.c(new com.avito.android.analytics.event.F(3L));
    }
}
