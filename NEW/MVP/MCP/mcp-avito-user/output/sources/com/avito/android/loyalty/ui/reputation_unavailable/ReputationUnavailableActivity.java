package com.avito.android.loyalty.ui.reputation_unavailable;

import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.b;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationUnavailableActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/reputation_unavailable/ReputationUnavailableActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReputationUnavailableActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: ReputationUnavailableActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ReputationUnavailableActivity.this.onBackPressed();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_reputation_unavailable;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ((NavBar) findViewById(R.id.reputation_unavailable_navbar)).setState(new com.avito.android.lib.design.nav_bar.a(null, new a(), false, null, null, null, null, 125, null));
        ((ContentPlaceholder) findViewById(R.id.reputation_unavailable_content)).setState(new WU.a(Integer.valueOf(R.drawable.reputation_unavailable), b.c(R.string.reputation_unavailable_title, new Serializable[0]), b.c(R.string.reputation_unavailable_body, new Serializable[0]), b.a(), null));
    }
}
