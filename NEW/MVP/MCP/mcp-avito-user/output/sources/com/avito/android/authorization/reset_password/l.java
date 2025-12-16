package com.avito.android.authorization.reset_password;

import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.reset_password.k;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f94184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f94185c;

    public /* synthetic */ l(s sVar, int i12) {
        this.f94184b = i12;
        this.f94185c = sVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        s sVar = this.f94185c;
        switch (this.f94184b) {
            case 0:
                B b12 = sVar.f94199h;
                if (b12 != null) {
                    b12.a();
                    break;
                }
                break;
            default:
                AuthSource authSource = AuthSource.f92694c;
                ResetPasswordActivity resetPasswordActivity = sVar.f94200i;
                if (resetPasswordActivity != null) {
                    k.a.C2792a.a(resetPasswordActivity, "restore_auth", 2);
                    break;
                }
                break;
        }
    }
}
