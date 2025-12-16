package OI0;

import Zd.InterfaceC19542a;
import android.content.Context;
import android.content.Intent;
import com.avito.android.authorization.AuthSource;
import com.avito.android.user_adverts.root_screen.adverts_host.C35564b;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAdvertsAuthRequestLauncher.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LOI0/a;", "Li/a;", "Lkotlin/G0;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC41201a<G0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35564b f12167b;

    public a(C35564b c35564b) {
        this.f12167b = c35564b;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        Intent intentA = ((InterfaceC19542a) this.f12167b.get()).a(AuthSource.f92698e);
        intentA.setFlags(603979776);
        return intentA;
    }

    @Override // i.AbstractC41201a
    public final Boolean parseResult(int i12, Intent intent) {
        return Boolean.valueOf(i12 == -1);
    }
}
