package com.avito.android.sbc.confirm;

import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.m;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.g;
import com.avito.android.paid_services.routing.ProgressState;
import kotlin.Metadata;

/* compiled from: ConfirmDiscountDispatchTariffSuccessActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/confirm/ConfirmDiscountDispatchTariffSuccessActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfirmDiscountDispatchTariffSuccessActivity extends m implements InterfaceC28477j.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f259148b = 0;

    /* compiled from: ConfirmDiscountDispatchTariffSuccessActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProgressState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressState progressState = ProgressState.f210623b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        CreateDiscountDispatchTariffSuccessArgs createDiscountDispatchTariffSuccessArgs = (CreateDiscountDispatchTariffSuccessArgs) getIntent().getParcelableExtra("args_key");
        if (createDiscountDispatchTariffSuccessArgs != null) {
            g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this, new c(createDiscountDispatchTariffSuccessArgs, this)));
        } else {
            if (isFinishing()) {
                return;
            }
            finish();
        }
    }
}
