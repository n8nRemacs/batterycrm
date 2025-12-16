package OI0;

import android.content.Context;
import android.content.Intent;
import com.avito.android.user_adverts.root_screen.adverts_host.C35564b;
import com.avito.android.user_adverts_filters.host.d;
import i.AbstractC41201a;
import kotlin.Metadata;

/* compiled from: UserAdvertsFiltersRequestLauncher.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LOI0/c;", "Li/a;", "Lcom/avito/android/user_adverts_filters/host/d$a;", "Lcom/avito/android/user_adverts_filters/host/d$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends AbstractC41201a<d.a, d.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35564b f12168b;

    public c(C35564b c35564b) {
        this.f12168b = c35564b;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, d.a aVar) {
        return ((com.avito.android.user_adverts_filters.host.d) this.f12168b.get()).a(aVar);
    }

    @Override // i.AbstractC41201a
    public final d.b parseResult(int i12, Intent intent) {
        return ((com.avito.android.user_adverts_filters.host.d) this.f12168b.get()).b(i12, intent);
    }
}
