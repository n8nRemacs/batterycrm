package com.avito.android.profile.edit;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.avito.android.CalledFrom;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.profile.edit.InterfaceC33343x;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.profile.edit.di.InterfaceC33317b;
import com.avito.android.profile.edit.di.InterfaceC33318c;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Location;
import com.avito.android.util.C35967w2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditProfileActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/edit/EditProfileActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/profile/edit/x$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EditProfileActivity extends com.avito.android.ui.activity.a implements InterfaceC33343x.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC33343x f221946m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC33315d f221947n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public V f221948o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.location_list.C f221949p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_confirmation.P f221950q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public l90.o f221951r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC33312a f221952s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f221953t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f221954u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f221955v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public CalledFrom f221956w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public AvatarShape f221957x = AvatarShape.CIRCLE;

    /* compiled from: EditProfileActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221958a;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f221958a = iArr;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.edit_profile;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        this.f221956w = C35967w2.a(getIntent());
        String stringExtra = getIntent().getStringExtra("avatar_shape_type");
        AvatarShape avatarShapeValueOf = stringExtra != null ? AvatarShape.valueOf(stringExtra) : null;
        if (avatarShapeValueOf == null) {
            avatarShapeValueOf = AvatarShape.CIRCLE;
        }
        this.f221957x = avatarShapeValueOf;
        Kundle kundleA = bundle != null ? com.avito.android.util.G.a(bundle, "edit_profile_presenter") : null;
        Kundle kundleA2 = bundle != null ? com.avito.android.util.G.a(bundle, "location_interactor") : null;
        Kundle kundleA3 = bundle != null ? com.avito.android.util.G.a(bundle, "edit_profile_interactor") : null;
        InterfaceC33317b.a aVarA = C33316a.a();
        aVarA.e((InterfaceC33318c) C29972i.a(C29972i.b(this), InterfaceC33318c.class));
        aVarA.b(this);
        aVarA.d(kundleA);
        aVarA.c(kundleA2);
        aVarA.f(kundleA3);
        aVarA.a(new com.google.gson.d().a());
        aVarA.build().a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Location location;
        if (i13 != -1) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        if (i12 == 1) {
            if (intent == null) {
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                location = (Location) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("location", Location.class) : extras.getParcelable("location"));
            } else {
                location = null;
            }
            InterfaceC33343x interfaceC33343x = this.f221946m;
            (interfaceC33343x != null ? interfaceC33343x : null).e(location);
            return;
        }
        if (i12 != 3) {
            return;
        }
        InterfaceC33312a interfaceC33312a = this.f221952s;
        if (interfaceC33312a == null) {
            interfaceC33312a = null;
        }
        Uri uriB = interfaceC33312a.b(intent);
        if (uriB != null) {
            InterfaceC33343x interfaceC33343x2 = this.f221946m;
            (interfaceC33343x2 != null ? interfaceC33343x2 : null).b(uriB);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        interfaceC33343x.i0();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        ViewGroup viewGroup = (ViewGroup) K1();
        com.avito.konveyor.adapter.j jVar = this.f221953t;
        if (jVar == null) {
            jVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f221954u;
        interfaceC33343x.c(new S(viewGroup, jVar, interfaceC28373a != null ? interfaceC28373a : null));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        interfaceC33343x.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        com.avito.android.util.G.c(bundle, "edit_profile_presenter", interfaceC33343x.d0());
        V v12 = this.f221948o;
        if (v12 == null) {
            v12 = null;
        }
        com.avito.android.util.G.c(bundle, "location_interactor", v12.d0());
        InterfaceC33315d interfaceC33315d = this.f221947n;
        com.avito.android.util.G.c(bundle, "edit_profile_interactor", (interfaceC33315d != null ? interfaceC33315d : null).d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        interfaceC33343x.a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC33343x interfaceC33343x = this.f221946m;
        if (interfaceC33343x == null) {
            interfaceC33343x = null;
        }
        interfaceC33343x.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
