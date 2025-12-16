package nt;

import com.avito.android.currency.CurrencyCode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CurrencyCodeProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnt/a;", "", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44474a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f419202a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f419203b = P0.g(new Q("RU", CurrencyCode.f131082c), new Q("UZ", CurrencyCode.f131083d));

    @Inject
    public C44474a(@Y61.k k kVar) {
        this.f419202a = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Y61.k
    public final CurrencyCode a() {
        String str = this.f419202a.f419216a.d() ? "RU" : "UZ";
        CurrencyCode currencyCode = (CurrencyCode) this.f419203b.get(str);
        if (currencyCode != null) {
            return currencyCode;
        }
        throw new IllegalStateException("No currency mapping found for region=".concat(str).toString());
    }
}
