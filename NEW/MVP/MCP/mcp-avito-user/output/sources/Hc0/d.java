package hC0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.info.TariffCptInfoActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhC0/d;", "LhC0/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f397103a;

    @Inject
    public d(@k Context context) {
        this.f397103a = context;
    }

    @Override // hC0.c
    @k
    public final Intent a(@l String str) {
        return com.avito.android.tariff_cpt.configure.b.c(this.f397103a, str);
    }

    @Override // hC0.c
    @k
    public final Intent b(@l String str) {
        return com.avito.android.tariff_cpt.configure.b.d(this.f397103a, str);
    }

    @Override // hC0.c
    @k
    public final Intent c(@l String str, @l String str2) {
        return com.avito.android.tariff_cpt.configure.b.a(this.f397103a, str, str2);
    }

    @Override // hC0.c
    @k
    public final Intent d(@k String str) {
        return com.avito.android.tariff_cpt.configure.b.b(this.f397103a, str);
    }

    @Override // hC0.c
    @k
    public final Intent e(@l String str) {
        Intent intent = new Intent(this.f397103a, (Class<?>) TariffCptInfoActivity.class);
        intent.putExtra("tariff_cpt_extra_remote_context", str);
        return intent;
    }
}
