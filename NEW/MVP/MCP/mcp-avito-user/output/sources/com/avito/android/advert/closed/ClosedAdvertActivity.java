package com.avito.android.advert.closed;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.advert.closed.ClosedAdvertFragment;
import com.avito.android.advert.item.ClosedAdvertArguments;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ClosedAdvertActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/closed/ClosedAdvertActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClosedAdvertActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f68833m = new a(null);

    /* compiled from: ClosedAdvertActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/closed/ClosedAdvertActivity$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("subtitle");
            Serializable serializableExtra = getIntent().getSerializableExtra("bottom_navigation_space");
            BottomNavigationSpace bottomNavigationSpace = serializableExtra instanceof BottomNavigationSpace ? (BottomNavigationSpace) serializableExtra : null;
            if (bottomNavigationSpace == null) {
                bottomNavigationSpace = BottomNavigationSpace.f107065b;
            }
            ClosedAdvertFragment.a aVar = ClosedAdvertFragment.f68834x0;
            ClosedAdvertArguments closedAdvertArguments = new ClosedAdvertArguments(stringExtra, bottomNavigationSpace);
            aVar.getClass();
            ClosedAdvertFragment closedAdvertFragmentA = ClosedAdvertFragment.a.a(closedAdvertArguments);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, closedAdvertFragmentA, "ClosedAdvertFragment", 1);
            hE2.e();
        }
    }
}
