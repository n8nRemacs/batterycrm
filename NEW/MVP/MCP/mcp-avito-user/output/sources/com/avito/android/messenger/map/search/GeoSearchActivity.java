package com.avito.android.messenger.map.search;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/map/search/GeoSearchActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class GeoSearchActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f196483m = new a(null);

    /* compiled from: GeoSearchActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/map/search/GeoSearchActivity$a;", "", "<init>", "()V", "", "KEY_CENTER_POINT", "Ljava/lang/String;", "KEY_CHANNEL_ID", "KEY_INITIAL_QUERY", "KEY_ITEM_LOCATION", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        Bundle extras = getIntent().getExtras();
        String string2 = extras != null ? extras.getString("channel_id") : null;
        if (string2 == null) {
            finish();
            return;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null || (string = extras2.getString("initial_query")) == null) {
            string = "";
        }
        Bundle extras3 = getIntent().getExtras();
        GeoPoint geoPoint = extras3 != null ? (GeoPoint) extras3.getParcelable("center_point") : null;
        Bundle extras4 = getIntent().getExtras();
        GeoPoint geoPoint2 = extras4 != null ? (GeoPoint) extras4.getParcelable("item_location") : null;
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            GeoSearchFragment.f196484B0.getClass();
            GeoSearchFragment geoSearchFragment = new GeoSearchFragment();
            C35966w1.a(geoSearchFragment, 4, new C32530a(string2, string, geoPoint, geoPoint2));
            hE2.j(R.id.fragment_container, geoSearchFragment, "GeoSearchFragment", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, android.app.Activity
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        K2.c(this);
        onBackPressed();
        return true;
    }
}
