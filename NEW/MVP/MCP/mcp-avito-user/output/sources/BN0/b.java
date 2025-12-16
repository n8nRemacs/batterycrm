package BN0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.virtual_deal_room.client_edit.analytics.FieldChange;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import com.avito.android.virtual_deal_room.client_edit.mvi.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: ClientEditAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBN0/b;", "LBN0/a;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f1369a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ClientEditArguments f1370b;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k ClientEditArguments clientEditArguments) {
        this.f1369a = interfaceC28373a;
        this.f1370b = clientEditArguments;
    }

    public static FieldChange c(String str, String str2) {
        return L.f(str, str2) ? FieldChange.f326134e : (C43066x.K(str) || !C43066x.K(str2)) ? FieldChange.f326132c : FieldChange.f326133d;
    }

    @Override // BN0.a
    public final void a(@k String str, @k String str2, @k String str3, @k String str4, @k String str5) {
        ClientEditArguments clientEditArguments = this.f1370b;
        this.f1369a.c(new AN0.a(clientEditArguments.f326195h, c(str, clientEditArguments.f326190c), c(str2, clientEditArguments.f326191d), c(str3, clientEditArguments.f326192e), c(m.a(str4), clientEditArguments.f326193f), c(str5, clientEditArguments.f326194g)));
    }

    @Override // BN0.a
    public final void b() {
        this.f1369a.c(new com.avito.android.analytics.provider.clickstream.b(12966, 0));
    }
}
