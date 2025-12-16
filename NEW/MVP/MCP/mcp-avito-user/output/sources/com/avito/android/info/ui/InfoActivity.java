package com.avito.android.info.ui;

import android.os.Bundle;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.info.di.b;
import com.avito.android.util.L5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/info/ui/InfoActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/info/ui/j;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InfoActivity extends com.avito.android.ui.activity.a implements j, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public c f170952m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f170953n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public String f170954o = "";

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public String f170955p = "";

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z12 = true;
        if (extras != null) {
            this.f170954o = extras.getString("path");
            this.f170955p = extras.getString("title");
            if (this.f170954o.length() != 0) {
                z12 = false;
            }
        }
        b.a aVarA = com.avito.android.info.di.a.a();
        aVarA.d((com.avito.android.info.di.c) C29972i.a(C29972i.b(this), com.avito.android.info.di.c.class));
        aVarA.a(this.f170955p);
        aVarA.b(this.f170954o);
        aVarA.c(bundle);
        aVarA.build().a(this);
        setContentView(R.layout.info);
        View viewFindViewById = findViewById(android.R.id.content);
        c cVar = this.f170952m;
        if (cVar == null) {
            cVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f170953n;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        m mVar = new m(viewFindViewById, cVar, interfaceC28373a);
        c cVar2 = this.f170952m;
        (cVar2 != null ? cVar2 : null).d(mVar);
        if (z12) {
            L5.a(this, R.string.unknown_server_error, 0);
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        c cVar = this.f170952m;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c cVar = this.f170952m;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        c cVar = this.f170952m;
        if (cVar == null) {
            cVar = null;
        }
        cVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        c cVar = this.f170952m;
        if (cVar == null) {
            cVar = null;
        }
        cVar.c0();
        super.onStop();
    }
}
