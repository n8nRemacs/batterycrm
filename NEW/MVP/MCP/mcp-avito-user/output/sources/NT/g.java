package nt;

import com.avito.android.currency.CurrencyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import jJ.InterfaceC42261a;
import java.text.NumberFormat;
import java.util.Currency;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CurrencyFormatterImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnt/g;", "Lnt/f;", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C44474a f419209a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f419210b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42261a f419211c;

    @Inject
    public g(@Y61.k C44474a c44474a, @Y61.k d dVar, @Y61.k InterfaceC42261a interfaceC42261a) {
        this.f419209a = c44474a;
        this.f419210b = dVar;
        this.f419211c = interfaceC42261a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // nt.f
    @Y61.k
    public final String a(int i12) {
        CurrencyCode currencyCodeA = this.f419209a.a();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(this.f419211c.P4());
        c cVar = (c) this.f419210b.f419207a.get(currencyCodeA);
        if (cVar == null) {
            cVar = new c(false, 1, null);
        }
        currencyInstance.setCurrency(Currency.getInstance(currencyCodeA.f131086b));
        if (!cVar.f419206a) {
            currencyInstance.setMaximumFractionDigits(0);
            currencyInstance.setMinimumFractionDigits(0);
        }
        return currencyInstance.format(Integer.valueOf(i12));
    }

    @Override // nt.f
    @Y61.k
    public final String g0() {
        CurrencyCode currencyCodeA = this.f419209a.a();
        return Currency.getInstance(currencyCodeA.f131086b).getSymbol(this.f419211c.P4());
    }
}
