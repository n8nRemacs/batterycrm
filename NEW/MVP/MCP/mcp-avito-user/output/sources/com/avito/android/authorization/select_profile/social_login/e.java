package com.avito.android.authorization.select_profile.social_login;

import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f94387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f94388c;

    public /* synthetic */ e(j jVar, int i12) {
        this.f94387b = i12;
        this.f94388c = jVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f94387b) {
            case 0:
                p pVar = this.f94388c.f94404l;
                if (pVar != null) {
                    pVar.a();
                    break;
                }
                break;
            case 1:
                p pVar2 = this.f94388c.f94404l;
                if (pVar2 != null) {
                    pVar2.a();
                    break;
                }
                break;
            default:
                SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment = this.f94388c.f94405m;
                if (socialRegistrationSuggestsFragment != null) {
                    socialRegistrationSuggestsFragment.r5();
                    break;
                }
                break;
        }
    }
}
