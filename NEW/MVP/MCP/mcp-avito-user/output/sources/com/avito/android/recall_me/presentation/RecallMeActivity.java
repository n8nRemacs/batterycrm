package com.avito.android.recall_me.presentation;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.recall_me.presentation.RecallMeFragment;
import com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment;
import com.avito.android.util.C35739a;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recall_me/presentation/RecallMeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f251897n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f251898m = C35961v3.a(this);

    /* compiled from: RecallMeActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/recall_me/presentation/RecallMeActivity$a;", "", "<init>", "()V", "", "EXTRA_MVI", "Ljava/lang/String;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int L1() {
        return R.id.recall_me_fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.recall_me_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Bundle extras = getIntent().getExtras();
        f251897n.getClass();
        if (extras != null ? extras.getBoolean("RecallMeMvi", false) : false) {
            D6.w(toolbar);
            AbstractC19927a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.k();
                return;
            }
            return;
        }
        C35739a.f318787a.getClass();
        C35739a.a(this, toolbar);
        AbstractC19927a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(true);
        }
        AbstractC19927a supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.t();
        }
        P5.d(toolbar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        RecallMeFragment recallMeFragment;
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            Bundle extras = getIntent().getExtras();
            f251897n.getClass();
            boolean z12 = extras != null ? extras.getBoolean("RecallMeMvi", false) : false;
            ?? r22 = this.f251898m;
            if (z12) {
                RecallMeFragment.a aVar = com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment.f252076r0;
                Object obj = (RecallMeParams) r22.getValue();
                aVar.getClass();
                com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment recallMeFragment2 = new com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment();
                recallMeFragment2.f252081q0.setValue(recallMeFragment2, com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment.f252077s0[0], obj);
                recallMeFragment = recallMeFragment2;
            } else {
                RecallMeFragment.a aVar2 = RecallMeFragment.f251899v0;
                RecallMeParams recallMeParams = (RecallMeParams) r22.getValue();
                aVar2.getClass();
                RecallMeFragment recallMeFragment3 = new RecallMeFragment();
                recallMeFragment3.f251907t0.setValue(recallMeFragment3, RecallMeFragment.f251900w0[0], recallMeParams);
                recallMeFragment = recallMeFragment3;
            }
            hE2.n(R.id.recall_me_fragment_container, recallMeFragment, null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, android.app.Activity
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            K2.c(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
