package com.avito.android.photo_permission;

import android.view.View;
import com.avito.android.photo_permission.PhotoPermissionDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f218734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoPermissionDialogFragment f218735c;

    public /* synthetic */ g(PhotoPermissionDialogFragment photoPermissionDialogFragment, int i12) {
        this.f218734b = i12;
        this.f218735c = photoPermissionDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PhotoPermissionDialogFragment photoPermissionDialogFragment = this.f218735c;
        switch (this.f218734b) {
            case 0:
                PhotoPermissionDialogFragment.a aVar = PhotoPermissionDialogFragment.f218699t0;
                photoPermissionDialogFragment.h5();
                break;
            case 1:
                PhotoPermissionDialogFragment.a aVar2 = PhotoPermissionDialogFragment.f218699t0;
                photoPermissionDialogFragment.g5();
                break;
            case 2:
                PhotoPermissionDialogFragment.a aVar3 = PhotoPermissionDialogFragment.f218699t0;
                photoPermissionDialogFragment.h5();
                break;
            default:
                PhotoPermissionDialogFragment.a aVar4 = PhotoPermissionDialogFragment.f218699t0;
                photoPermissionDialogFragment.g5();
                break;
        }
    }
}
