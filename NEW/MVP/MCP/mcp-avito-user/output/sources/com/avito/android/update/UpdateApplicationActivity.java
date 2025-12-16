package com.avito.android.update;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.update.c;
import com.avito.android.update.di.b;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UpdateApplicationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/update/UpdateApplicationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/update/c$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateApplicationActivity extends com.avito.android.ui.activity.a implements c.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f306637m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public c f306638n;

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.update.di.a.a();
        aVarA.a((com.avito.android.update.di.c) C29972i.a(C29972i.b(this), com.avito.android.update.di.c.class));
        aVarA.build().a(this);
        setContentView(R.layout.update_application_screen);
        c cVar = this.f306638n;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(new i(findViewById(android.R.id.content)));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        c cVar = this.f306638n;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        c cVar = this.f306638n;
        if (cVar == null) {
            cVar = null;
        }
        cVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        c cVar = this.f306638n;
        if (cVar == null) {
            cVar = null;
        }
        cVar.c0();
        super.onStop();
    }
}
