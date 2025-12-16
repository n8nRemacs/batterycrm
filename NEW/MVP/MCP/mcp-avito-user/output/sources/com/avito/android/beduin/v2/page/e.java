package com.avito.android.beduin.v2.page;

import android.os.Bundle;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.v2.page.ForcedTheme;
import kotlin.Metadata;

/* compiled from: BaseBeduinV2PageActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/e;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/beduin/v2/page/i;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class e extends com.avito.android.ui.activity.a implements i, InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return a2().c();
    }

    @Y61.k
    public abstract l a2();

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ForcedTheme.a aVar = ForcedTheme.f104800c;
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("forced_theme") : null;
        aVar.getClass();
        ForcedTheme forcedThemeA = ForcedTheme.a.a(string);
        if (forcedThemeA == null) {
            if (bundle == null) {
                a2().a(getIntent(), getSupportFragmentManager());
            }
        } else {
            if (com.avito.android.lib.util.darkTheme.c.a(this) && forcedThemeA == ForcedTheme.f104801d) {
                getDelegate().E(1);
                return;
            }
            if (!com.avito.android.lib.util.darkTheme.c.a(this) && forcedThemeA == ForcedTheme.f104802e) {
                getDelegate().E(2);
            } else if (getSupportFragmentManager().P().isEmpty()) {
                a2().a(getIntent(), getSupportFragmentManager());
            }
        }
    }

    @Override // com.avito.android.beduin.v2.page.i
    public final void w1() {
        a2().b(this);
    }
}
