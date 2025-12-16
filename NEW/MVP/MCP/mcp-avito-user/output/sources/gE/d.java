package Ge;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_loans_cabinet.AutoLoansCabinetActivity;
import com.avito.android.auto_loans_cabinet.InterfaceC28699d;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoLoanCabinetPageIntentFactoryImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe/d;", "Lcom/avito/android/auto_loans_cabinet/d;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements InterfaceC28699d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f6628a;

    @Inject
    public d(@k Application application) {
        this.f6628a = application;
    }

    @Override // com.avito.android.auto_loans_cabinet.InterfaceC28699d
    @k
    public final Intent a() {
        return new Intent(this.f6628a, (Class<?>) AutoLoansCabinetActivity.class);
    }
}
