package com.avito.android.advert.badge_details;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.badge_details.h;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/badge_details/BadgeDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/advert/badge_details/h$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BadgeDetailsActivity extends com.avito.android.ui.activity.a implements h.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public h f68760m;

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_badge_details;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("objectId");
        if (stringExtra == null) {
            throw new RuntimeException("objectId must be set");
        }
        String stringExtra2 = getIntent().getStringExtra("objectEntity");
        if (stringExtra2 == null) {
            throw new RuntimeException("objectEntity id must be set");
        }
        com.avito.android.advert.badge_details.di.e.a().a(getIntent().getIntExtra("badgeId", -1), stringExtra, stringExtra2, bundle != null ? G.a(bundle, "presenterState") : null, getResources(), (com.avito.android.advert.badge_details.di.b) C29972i.a(C29972i.b(this), com.avito.android.advert.badge_details.di.b.class), cv.c.a(this)).a(this);
    }

    public final void a2(@Y61.k String str) {
        Intent intent = new Intent();
        intent.putExtra("message", str);
        setResult(-1, intent);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        s sVar = new s(K1());
        h hVar = this.f68760m;
        if (hVar == null) {
            hVar = null;
        }
        hVar.b(sVar);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h hVar = this.f68760m;
        if (hVar == null) {
            hVar = null;
        }
        G.c(bundle, "presenterState", hVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        h hVar = this.f68760m;
        if (hVar == null) {
            hVar = null;
        }
        hVar.a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        super.onStop();
        h hVar = this.f68760m;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c0();
    }
}
