package c6;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.B;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.C35793f6;
import com.avito.android.util.Kundle;
import d6.C39510a;
import d6.C39511b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageCalculationAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc6/b;", "Lc6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC26946a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57639b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f57640c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f57641d;

    @Inject
    public b(@k @InterfaceC30174s String str, @k InterfaceC28373a interfaceC28373a, @k C35793f6 c35793f6, @l @B Kundle kundle) {
        String strG;
        this.f57639b = str;
        this.f57640c = interfaceC28373a;
        this.f57641d = (kundle == null || (strG = kundle.g("key_session")) == null) ? c35793f6.a() : strG;
    }

    @Override // c6.InterfaceC26946a
    public final void C(@k String str) {
        this.f57640c.c(new C39510a(this.f57639b, str, this.f57641d));
    }

    @Override // com.avito.android.Y
    @k
    /* renamed from: a, reason: from getter */
    public final String getF57641d() {
        return this.f57641d;
    }

    @Override // c6.InterfaceC26946a
    public final void b(@k String str) {
        this.f57640c.c(new C39511b(this.f57639b, str, this.f57641d));
    }
}
