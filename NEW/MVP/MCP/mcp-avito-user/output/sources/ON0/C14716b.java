package On0;

import Y61.k;
import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SingleTimeDeeplinkCacheImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOn0/b;", "LOn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: On0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14716b implements InterfaceC14715a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12515a;

    @Inject
    public C14716b(@k Application application) {
        this.f12515a = application.getSharedPreferences("SingleTimeSharedPreferences", 0);
    }

    @Override // On0.InterfaceC14715a
    public final boolean a(@k String str) {
        return this.f12515a.getBoolean(str, false);
    }

    @Override // On0.InterfaceC14715a
    public final void b(@k String str) {
        this.f12515a.edit().putBoolean(str, true).apply();
    }
}
