package com.avito.android.profile.edit;

import android.content.Intent;
import android.view.View;
import com.avito.android.profile.edit.EditProfileActivity;
import com.avito.android.profile.edit.S;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile.edit.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33345z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f222305b;

    public C33345z(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f222305b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Intent intentA;
        EditProfileItem editProfileItem = (EditProfileItem) obj;
        EditProfilePresenterImpl editProfilePresenterImpl = this.f222305b;
        editProfilePresenterImpl.getClass();
        if (editProfileItem instanceof SubLocationItem) {
            if (editProfilePresenterImpl.f221966h != null) {
                editProfilePresenterImpl.f221960b.c();
                NameIdEntity nameIdEntity = ((SubLocationItem) editProfileItem).f222265e;
                return;
            }
            return;
        }
        if (editProfileItem instanceof LocationItem) {
            EditProfileActivity editProfileActivity = editProfilePresenterImpl.f221966h;
            if (editProfileActivity != null) {
                EditProfileItem editProfileItemA = com.avito.android.profile.edit.refactoring.adapter.e.a(1L, editProfilePresenterImpl.f221968j);
                if (editProfileItemA == null) {
                    throw new IllegalArgumentException();
                }
                Location location = ((LocationItem) editProfileItemA).f222256c;
                com.avito.android.location_list.C c12 = editProfileActivity.f221949p;
                editProfileActivity.startActivityForResult((c12 != null ? c12 : null).a(location), 1);
                return;
            }
            return;
        }
        if (editProfileItem instanceof AvatarItem) {
            if (((AvatarItem) editProfileItem).f222247c != null) {
                S s5 = editProfilePresenterImpl.f221967i;
                if (s5 != null) {
                    editProfilePresenterImpl.h(s5, true);
                    return;
                }
                return;
            }
            S s12 = editProfilePresenterImpl.f221967i;
            if (s12 != null) {
                editProfilePresenterImpl.f221970l = false;
                View view = s12.f222004i;
                view.animate().setDuration(200L).alpha(0.0f).setListener(new S.a(view));
            }
            EditProfileActivity editProfileActivity2 = editProfilePresenterImpl.f221966h;
            if (editProfileActivity2 != null) {
                int i12 = EditProfileActivity.a.f221958a[editProfileActivity2.f221957x.ordinal()];
                if (i12 == 1) {
                    InterfaceC33312a interfaceC33312a = editProfileActivity2.f221952s;
                    intentA = (interfaceC33312a != null ? interfaceC33312a : null).a();
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC33312a interfaceC33312a2 = editProfileActivity2.f221952s;
                    intentA = (interfaceC33312a2 != null ? interfaceC33312a2 : null).c();
                }
                try {
                    C35974x2.d(intentA);
                    editProfileActivity2.startActivityForResult(intentA, 3);
                } catch (Exception e12) {
                    V2.f318762a.a(EditProfileActivity.class.getName(), "", e12);
                }
            }
            editProfilePresenterImpl.f221959a.c(new com.avito.android.analytics.event.F(3L));
        }
    }
}
