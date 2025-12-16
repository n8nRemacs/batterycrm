package com.avito.android.paid_services_impl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.adjust.sdk.Constants;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.M;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.paid_services_impl.di.a;
import com.avito.android.util.C35967w2;
import com.avito.android.util.V2;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import w50.InterfaceC49447a;

/* compiled from: PaidServicesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/paid_services_impl/PaidServicesActivity;", "Lcom/avito/android/ui/activity/a;", "Lw50/a;", "Lv50/f;", "Lv50/e;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Trivial]"})
/* loaded from: classes15.dex */
public final class PaidServicesActivity extends com.avito.android.ui.activity.a implements InterfaceC49447a, v50.f, v50.e, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public M f210631m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f210632n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public B50.a f210633o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public PaidServicesResultRepository f210634p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public v50.d f210635q;

    /* compiled from: PaidServicesActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/paid_services_impl/PaidServicesActivity$a;", "", "<init>", "()V", "", "KEY_DEEPLINK", "Ljava/lang/String;", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // v50.f
    @Y61.k
    public final PaidServicesResultRepository W0() {
        PaidServicesResultRepository paidServicesResultRepository = this.f210634p;
        if (paidServicesResultRepository != null) {
            return paidServicesResultRepository;
        }
        return null;
    }

    public final void a2() {
        if (C35967w2.a(getIntent()) instanceof CalledFrom.Push) {
            M m12 = this.f210631m;
            if (m12 == null) {
                m12 = null;
            }
            Intent intentA = L.a.a(m12, null, 3);
            V2 v22 = V2.f318762a;
            try {
                startActivity(intentA);
            } catch (Exception e12) {
                v22.f(e12);
            }
        }
    }

    public final void b2(Intent intent, boolean z12) {
        DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra(Constants.DEEPLINK, DeepLink.class) : intent.getParcelableExtra(Constants.DEEPLINK));
        if (deepLink != null) {
            B50.a aVar = this.f210633o;
            if (aVar == null) {
                aVar = null;
            }
            Fragment fragmentA = aVar.a(deepLink);
            if (fragmentA == null) {
                V2.f318762a.c("PaidServicesActivity", "retrieveFragment: compositeFragmentFactory returned null. Have you provided fragment factory for the screen?", null);
                return;
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, fragmentA, null);
            if (z12) {
                hE2.c(fragmentA.getClass().getCanonicalName());
            }
            hE2.f();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        int i12;
        if (getSupportFragmentManager().L() == 0) {
            Intent intent = this.f304538c;
            if (intent != null) {
                V2 v22 = V2.f318762a;
                try {
                    startActivity(intent);
                } catch (Exception e12) {
                    v22.f(e12);
                }
            }
            a2();
            PaidServicesResultRepository paidServicesResultRepository = this.f210634p;
            if (paidServicesResultRepository == null) {
                paidServicesResultRepository = null;
            }
            int iOrdinal = paidServicesResultRepository.getF210652a().ordinal();
            if (iOrdinal == 0) {
                i12 = -1;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 0;
            }
            setResult(i12);
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Ml().a(cv.c.c(this)).a(this);
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        v50.d dVar = this.f210635q;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a();
        if (bundle == null) {
            b2(getIntent(), false);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        b2(intent, extras != null ? extras.getBoolean("need_add_to_back_stack", true) : true);
    }

    @Override // w50.InterfaceC49447a
    public final void r1() {
        int i12;
        PaidServicesResultRepository paidServicesResultRepository = this.f210634p;
        if (paidServicesResultRepository == null) {
            paidServicesResultRepository = null;
        }
        int iOrdinal = paidServicesResultRepository.getF210652a().ordinal();
        if (iOrdinal == 0) {
            i12 = -1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 0;
        }
        setResult(i12);
        Intent intent = this.f304538c;
        if (intent != null) {
            intent.getBooleanExtra("supports_nested_intent", false);
        }
        Intent[] intentArr = (Intent[]) C42756l.B(new Intent[]{this.f304538c, null}).toArray(new Intent[0]);
        if (intentArr.length != 0) {
            Intent[] intentArr2 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            V2 v22 = V2.f318762a;
            try {
                startActivities(intentArr2);
            } catch (Exception e12) {
                v22.f(e12);
            }
        }
        a2();
        finish();
    }

    @Override // v50.e
    @Y61.k
    public final v50.d u1() {
        v50.d dVar = this.f210635q;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
