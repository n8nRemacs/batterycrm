package com.avito.android.help_center.help_center_articles;

import android.os.Bundle;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.help_center_articles.di.e;
import com.avito.android.help_center.help_center_articles.e;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterArticlesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/help_center/help_center_articles/HelpCenterArticlesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/help_center/help_center_articles/e$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpCenterArticlesActivity extends com.avito.android.ui.activity.a implements e.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public e f161677m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f161678n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f161679o;

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        e eVar = this.f161677m;
        if (eVar == null) {
            eVar = null;
        }
        if (eVar.a()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.help_center_articles_fragment);
        String stringExtra = getIntent().getStringExtra("key_articleId");
        String stringExtra2 = getIntent().getStringExtra("key_theme");
        String stringExtra3 = getIntent().getStringExtra("key_advertisement_id");
        String stringExtra4 = getIntent().getStringExtra("key_context_id");
        e.a aVarA = com.avito.android.help_center.help_center_articles.di.d.a();
        aVarA.d((com.avito.android.help_center.help_center_articles.di.f) C29972i.a(C29972i.b(this), com.avito.android.help_center.help_center_articles.di.f.class));
        aVarA.e(stringExtra);
        aVarA.a(stringExtra2);
        aVarA.b(stringExtra3);
        aVarA.c(stringExtra4);
        aVarA.build().a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        InterfaceC28373a interfaceC28373a = this.f161679o;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        q qVar = new q(viewGroup, interfaceC28373a);
        e eVar = this.f161677m;
        (eVar != null ? eVar : null).b(qVar);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        e eVar = this.f161677m;
        if (eVar == null) {
            eVar = null;
        }
        eVar.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        e eVar = this.f161677m;
        if (eVar == null) {
            eVar = null;
        }
        eVar.c(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        e eVar = this.f161677m;
        if (eVar == null) {
            eVar = null;
        }
        eVar.c0();
        super.onStop();
    }
}
