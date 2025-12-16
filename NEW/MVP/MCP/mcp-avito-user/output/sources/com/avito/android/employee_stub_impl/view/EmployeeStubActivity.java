package com.avito.android.employee_stub_impl.view;

import Y61.k;
import Y61.l;
import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.employee_stub_public.EmployeeStubData;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EmployeeStubActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/employee_stub_impl/view/EmployeeStubActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmployeeStubActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f147599m = new a(null);

    /* compiled from: EmployeeStubActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/employee_stub_impl/view/EmployeeStubActivity$a;", "", "<init>", "()V", "", "KEY_EXTRA_EMPLOYEE_STUB_DATA", "Ljava/lang/String;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final void a2(Intent intent, Bundle bundle) {
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_extra_for_employee_stub_data", EmployeeStubData.FromDeeplink.class) : intent.getParcelableExtra("key_extra_for_employee_stub_data");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EmployeeStubData.FromDeeplink fromDeeplink = (EmployeeStubData.FromDeeplink) parcelableExtra;
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            EmployeeStubFragment.f147600s0.getClass();
            EmployeeStubFragment employeeStubFragment = new EmployeeStubFragment();
            employeeStubFragment.setArguments(C22777e.b(new Q("key_bundle_for_employee_stub_data", fromDeeplink)));
            hE2.n(R.id.content, employeeStubFragment, null);
            hE2.f();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        a2(getIntent(), bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent, null);
    }
}
