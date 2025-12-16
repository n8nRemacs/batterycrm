package com.avito.android.authorization.select_social;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.select_social.di.b;
import com.avito.android.authorization.select_social.g;
import com.avito.android.di.C29972i;
import com.avito.android.social.M;
import com.avito.android.social.SocialType;
import com.avito.android.util.G;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectSocialActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/select_social/SelectSocialActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/authorization/select_social/g$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectSocialActivity extends com.avito.android.ui.activity.a implements g.b, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l90.o f94466m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public g f94467n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f94468o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f94469p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public M f94470q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f94471r;

    public final void a2() {
        InterfaceC28373a interfaceC28373a = this.f94471r;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        Intent intentPutExtra = Zd.n.b(this, interfaceC28373a).putExtra("result", -1);
        intentPutExtra.setFlags(603979776);
        startActivity(intentPutExtra);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        SocialType socialType;
        if (i12 != 1) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        if (i13 != -1) {
            if (i13 == 0) {
                g gVar = this.f94467n;
                (gVar != null ? gVar : null).a();
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                g gVar2 = this.f94467n;
                (gVar2 != null ? gVar2 : null).c();
                return;
            }
        }
        String stringExtra = intent != null ? intent.getStringExtra("extra_social_email") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra("extra_social_token") : null;
        if (intent != null) {
            socialType = (SocialType) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_social_type", SocialType.class) : intent.getParcelableExtra("extra_social_type"));
        } else {
            socialType = null;
        }
        String stringExtra3 = intent != null ? intent.getStringExtra("extra_social_user") : null;
        g gVar3 = this.f94467n;
        if (gVar3 == null) {
            gVar3 = null;
        }
        M m12 = this.f94470q;
        gVar3.e((m12 != null ? m12 : null).d(socialType), stringExtra2, stringExtra, stringExtra3);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.authorization.select_social.di.a.a();
        com.avito.android.authorization.select_social.di.c cVar = (com.avito.android.authorization.select_social.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.select_social.di.c.class);
        Resources resources = getResources();
        Kundle kundleA = bundle != null ? G.a(bundle, "presenter_state") : null;
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("social");
        if (parcelableArrayListExtra == null) {
            throw new IllegalStateException("Social list mustn't be null");
        }
        String stringExtra = getIntent().getStringExtra("suggest_key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVarA.a(cVar, cv.c.a(this), resources, kundleA, parcelableArrayListExtra, stringExtra).a(this);
        super.onCreate(bundle);
        setContentView(R.layout.select_social_activity);
        g gVar = this.f94467n;
        if (gVar == null) {
            gVar = null;
        }
        View viewFindViewById = findViewById(android.R.id.content);
        com.avito.konveyor.adapter.a aVar = this.f94468o;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f94469p;
        gVar.d(new s(viewFindViewById, aVar2 != null ? aVar2 : null, aVar));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        g gVar = this.f94467n;
        if (gVar == null) {
            gVar = null;
        }
        gVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g gVar = this.f94467n;
        if (gVar == null) {
            gVar = null;
        }
        G.c(bundle, "presenter_state", gVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        g gVar = this.f94467n;
        if (gVar == null) {
            gVar = null;
        }
        gVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        g gVar = this.f94467n;
        if (gVar == null) {
            gVar = null;
        }
        gVar.c0();
        super.onStop();
    }
}
