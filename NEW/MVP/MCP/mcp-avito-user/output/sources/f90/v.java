package f90;

import com.avito.android.remote.model.Session;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefSessionStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/v;", "Lf90/h;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements InterfaceC40259h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395706a;

    @Inject
    public v(@Y61.k AK0.l lVar) {
        this.f395706a = lVar;
    }

    @Override // f90.InterfaceC40259h
    @Y61.l
    public final Session a() {
        AK0.l lVar = this.f395706a;
        String string = lVar.getString("session", null);
        if (string == null) {
            return null;
        }
        String string2 = lVar.getString("refresh_token", null);
        String string3 = lVar.getString("push_token", null);
        if (string.length() > 0) {
            return new Session(string, string2, string3);
        }
        return null;
    }

    @Override // f90.InterfaceC40259h
    public final void b(@Y61.k Session session) {
        this.f395706a.getF316a().edit().putString("session", session.getAccessToken()).putString("push_token", session.getPhash()).putString("refresh_token", session.getRefreshToken()).apply();
    }

    @Override // f90.InterfaceC40259h
    public final void c() {
        this.f395706a.getF316a().edit().remove("session").remove("signature").remove("push_token").remove("refresh_token").apply();
    }
}
