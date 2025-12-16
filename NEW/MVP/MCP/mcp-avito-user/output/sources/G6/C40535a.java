package g6;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.mortgage_calculator.MortgageCalculatorItem;
import com.avito.android.advert.item.mortgage_calculator.c;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg6/a;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40535a extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f396285e;

    @Inject
    public C40535a(@k c cVar) {
        super(true, false, 0.0f, 0L, 12, null);
        this.f396285e = cVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof MortgageCalculatorItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f396285e.c4();
    }
}
