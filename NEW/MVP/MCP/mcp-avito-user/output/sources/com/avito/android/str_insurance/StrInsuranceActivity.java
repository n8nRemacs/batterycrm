package com.avito.android.str_insurance;

import Xy0.h;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.str_insurance.di.b;
import com.avito.android.str_insurance.di.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/str_insurance/di/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrInsuranceActivity extends com.avito.android.ui.activity.a implements K<b>, InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f288539o = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public h f288540m;

    /* renamed from: n, reason: collision with root package name */
    public b f288541n;

    /* compiled from: StrInsuranceActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceActivity$a;", "", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        Intent intent = getIntent();
        InsuranceData insuranceData = (InsuranceData) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_insurance_data", InsuranceData.class) : intent.getParcelableExtra("key_insurance_data"));
        if (insuranceData == null) {
            throw new IllegalStateException("data should not be null");
        }
        b bVarA = com.avito.android.str_insurance.di.a.a().a((c) C29972i.a(C29972i.b(this), c.class), cv.c.a(this), this, insuranceData);
        bVarA.Nd(this);
        this.f288541n = bVarA;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            h hVar = this.f288540m;
            if (hVar == null) {
                hVar = null;
            }
            hVar.b();
        }
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        b bVar = this.f288541n;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
