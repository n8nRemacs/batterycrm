package com.avito.android.profile.edit;

import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.profile.edit.y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C33344y implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f222303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f222304c;

    public /* synthetic */ C33344y(EditProfilePresenterImpl editProfilePresenterImpl, int i12) {
        this.f222303b = i12;
        this.f222304c = editProfilePresenterImpl;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f222303b) {
            case 0:
                EditProfilePresenterImpl editProfilePresenterImpl = this.f222304c;
                S s5 = editProfilePresenterImpl.f221967i;
                if (s5 != null) {
                    s5.c();
                }
                editProfilePresenterImpl.f();
                break;
            default:
                this.f222304c.f();
                break;
        }
    }
}
