package com.avito.android.passport.profiles_list;

import android.content.DialogInterface;
import com.avito.android.passport.profiles_list.PassportProfilesListActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f213746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PassportProfilesListActivity f213747c;

    public /* synthetic */ a(PassportProfilesListActivity passportProfilesListActivity, int i12) {
        this.f213746b = i12;
        this.f213747c = passportProfilesListActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        PassportProfilesListActivity passportProfilesListActivity = this.f213747c;
        switch (this.f213746b) {
            case 0:
                PassportProfilesListActivity.a aVar = PassportProfilesListActivity.f213728u;
                passportProfilesListActivity.finish();
                break;
            default:
                PassportProfilesListActivity.a aVar2 = PassportProfilesListActivity.f213728u;
                passportProfilesListActivity.finish();
                break;
        }
    }
}
