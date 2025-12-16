package com.avito.android.bxcontent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bxcontent.BxContentFragment;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: BxContentActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/BxContentActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/bottom_navigation/V;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes12.dex */
public final class BxContentActivity extends com.avito.android.ui.activity.a implements com.avito.android.bottom_navigation.V, InterfaceC28477j.a {

    /* compiled from: BxContentActivity.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/BxContentActivity$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: BxContentActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentActivity$b", "Lcom/avito/android/bottom_navigation/U;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.bottom_navigation.U {
        public b() {
        }

        @Override // com.avito.android.bottom_navigation.U
        public final void E1() {
            BxContentActivity.this.finish();
        }
    }

    @Override // com.avito.android.bottom_navigation.V
    @Y61.k
    public final com.avito.android.bottom_navigation.U J0() {
        return new b();
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.overlay_fragment_container;
    }

    public final void a2() {
        Intent intent = getIntent();
        BxContentArguments bxContentArguments = (BxContentArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("arguments", BxContentArguments.class) : intent.getParcelableExtra("arguments"));
        if (bxContentArguments == null) {
            throw new RuntimeException("arguments was not passed to " + this);
        }
        Bundle extras = getIntent().getExtras();
        TreeClickStreamParent treeClickStreamParent = extras != null ? (TreeClickStreamParent) extras.getParcelable("treeAnalyticsParent") : null;
        if (bxContentArguments.f108866e == null && treeClickStreamParent != null) {
            bxContentArguments = new BxContentArguments(bxContentArguments.f108863b, bxContentArguments.f108864c, bxContentArguments.f108865d, treeClickStreamParent, bxContentArguments.f108867f, bxContentArguments.f108868g, bxContentArguments.f108869h, bxContentArguments.f108870i, bxContentArguments.f108871j, bxContentArguments.f108872k, bxContentArguments.f108873l, bxContentArguments.f108874m, bxContentArguments.f108875n, bxContentArguments.f108876o, bxContentArguments.f108877p, bxContentArguments.f108878q, bxContentArguments.f108879r, bxContentArguments.f108880s, bxContentArguments.f108881t, bxContentArguments.f108882u, bxContentArguments.f108883v, bxContentArguments.f108884w, bxContentArguments.f108885x);
        }
        BxContentFragment bxContentFragmentB = BxContentFragment.C28907a.b(BxContentFragment.f108886v5, bxContentArguments);
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, bxContentFragmentB, null);
        hE2.h();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && (fragment instanceof com.avito.android.ui.fragments.c)) {
                break;
            }
        }
        com.avito.android.ui.fragments.c cVar = (com.avito.android.ui.fragments.c) (next instanceof com.avito.android.ui.fragments.c ? next : null);
        if (cVar == null || !cVar.i0()) {
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a2();
    }
}
