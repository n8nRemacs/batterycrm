package jB0;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.info.TariffCpxInfoActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB0/b;", "LjB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC42230a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f405510a;

    @Inject
    public b(@k Context context) {
        this.f405510a = context;
    }

    @Override // jB0.InterfaceC42230a
    @k
    public final Intent a() {
        return new Intent(this.f405510a, (Class<?>) TariffCpxInfoActivity.class);
    }
}
