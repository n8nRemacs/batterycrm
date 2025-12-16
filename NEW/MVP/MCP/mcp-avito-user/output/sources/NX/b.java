package Nx;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StringsProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNx/b;", "LNx/a;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements InterfaceC14620a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f11874a;

    @Inject
    public b(@k Context context) {
        this.f11874a = context;
    }

    @Override // Nx.InterfaceC14620a
    @k
    public final String a() {
        return this.f11874a.getString(R.string.re_early_access_bundles_divider);
    }

    @Override // Nx.InterfaceC14620a
    @k
    public final String b(@k String str, @k String str2) {
        return this.f11874a.getString(R.string.re_early_access_package_price, str, str2);
    }
}
