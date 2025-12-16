package com.avito.android.profile.user_profile;

import Ua0.InterfaceC15504b;
import Zd.InterfaceC19542a;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.profile.PhotoPickerContract;
import com.avito.android.profile.SelectAvatarActionDialog;
import com.avito.android.profile.user_profile.UserProfileFragment;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;

/* compiled from: UserProfileView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class B extends H implements Y41.l<InterfaceC15504b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC15504b interfaceC15504b) {
        boolean zBooleanValue;
        InterfaceC15504b interfaceC15504b2 = interfaceC15504b;
        D d12 = (D) this.receiver;
        d12.getClass();
        boolean z12 = interfaceC15504b2 instanceof InterfaceC15504b.a;
        UserProfileFragment userProfileFragment = d12.f224199c;
        if (z12) {
            L l12 = userProfileFragment.f224215B0;
            if (l12 == null) {
                l12 = null;
            }
            userProfileFragment.startActivity(L.a.a(l12, null, 3).addFlags(268468224));
            ActivityC22955m activityC22955mL1 = userProfileFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.C1131b) {
            userProfileFragment.getClass();
            new SelectAvatarActionDialog().show(userProfileFragment.getChildFragmentManager(), "AVATAR_PICKER");
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.c) {
            androidx.view.result.h<AvatarShape> hVar = userProfileFragment.f224234U0;
            ((InterfaceC15504b.c) interfaceC15504b2).getClass();
            hVar.b(null);
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.d) {
            InterfaceC15504b.d dVar = (InterfaceC15504b.d) interfaceC15504b2;
            InterfaceC30751h interfaceC30751h = userProfileFragment.f224241y0;
            userProfileFragment.startActivity((interfaceC30751h != null ? interfaceC30751h : null).a(dVar.f16477a));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.g) {
            InterfaceC15504b.g gVar = (InterfaceC15504b.g) interfaceC15504b2;
            l90.c cVar = userProfileFragment.f224227N0;
            userProfileFragment.f224235V0.b(new PhotoPickerContract.Args(cVar != null ? cVar : null, gVar.f16480a));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.h) {
            InterfaceC15504b.h hVar2 = (InterfaceC15504b.h) interfaceC15504b2;
            com.avito.android.profile_settings.b bVar = userProfileFragment.f224218E0;
            if (bVar == null) {
                bVar = null;
            }
            hVar2.getClass();
            userProfileFragment.startActivity(bVar.b(null, "avatar", null));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.k) {
            userProfileFragment.getClass();
            userProfileFragment.f224233T0.b(G0.f406611a);
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.l) {
            InterfaceC19542a interfaceC19542a = userProfileFragment.f224240x0;
            userProfileFragment.startActivity((interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92696d).addFlags(603979776));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.f) {
            A30.b bVar2 = userProfileFragment.f224214A0;
            userProfileFragment.startActivity((bVar2 != null ? bVar2 : null).a());
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.i) {
            com.avito.android.settings.b bVar3 = userProfileFragment.f224242z0;
            userProfileFragment.startActivity((bVar3 != null ? bVar3 : null).b(userProfileFragment.q5()));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.j) {
            InterfaceC15504b.j jVar = (InterfaceC15504b.j) interfaceC15504b2;
            InterfaceC35845m2 interfaceC35845m2 = userProfileFragment.f224217D0;
            userProfileFragment.startActivity(Intent.createChooser((interfaceC35845m2 != null ? interfaceC35845m2 : null).d(jVar.f16483b, jVar.f16482a), userProfileFragment.getString(R.string.menu_share)));
        } else if (interfaceC15504b2 instanceof InterfaceC15504b.m) {
            com.avito.android.component.snackbar.h.c(d12.f224198b, ((InterfaceC15504b.m) interfaceC15504b2).f16486a, 0, null, null, null, null, 254);
        } else {
            if (interfaceC15504b2 instanceof InterfaceC15504b.n) {
                throw null;
            }
            if (interfaceC15504b2 instanceof InterfaceC15504b.o) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, d12.f224198b, com.avito.android.printable_text.b.f(((InterfaceC15504b.o) interfaceC15504b2).f16487a), null, null, null, null, 0, null, null, false, false, null, null, 4094);
            } else if (interfaceC15504b2 instanceof InterfaceC15504b.e) {
                com.avito.android.bottom_navigation.space.a aVar = userProfileFragment.f224216C0;
                if (aVar == null) {
                    aVar = null;
                }
                BottomNavigationSpace bottomNavigationSpaceN = aVar.n();
                int i12 = bottomNavigationSpaceN == null ? -1 : UserProfileFragment.a.f224243a[bottomNavigationSpaceN.ordinal()];
                if (i12 == -1 || i12 == 1) {
                    zBooleanValue = false;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gD.f fVar = userProfileFragment.f224219F0;
                    if (fVar == null) {
                        fVar = null;
                    }
                    fVar.getClass();
                    kotlin.reflect.n<Object> nVar = gD.f.f396389r[14];
                    zBooleanValue = ((Boolean) fVar.f396403o.a().invoke()).booleanValue();
                }
                if (zBooleanValue) {
                    L l13 = userProfileFragment.f224215B0;
                    userProfileFragment.startActivity((l13 != null ? l13 : null).b());
                } else {
                    L l14 = userProfileFragment.f224215B0;
                    if (l14 == null) {
                        l14 = null;
                    }
                    Intent intentA = L.a.a(l14, null, 3);
                    intentA.setFlags(603979776);
                    userProfileFragment.startActivity(intentA);
                    ActivityC22955m activityC22955mL12 = userProfileFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.onBackPressed();
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
