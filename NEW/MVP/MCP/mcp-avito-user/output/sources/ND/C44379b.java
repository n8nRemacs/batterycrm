package nd;

import Y61.k;
import android.app.Application;
import kotlin.Metadata;

/* compiled from: ApplicationInfoProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnd/b;", "Lnd/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C44379b implements InterfaceC44378a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f415219a;

    public C44379b(@k Application application) {
        this.f415219a = application;
    }

    @Override // nd.InterfaceC44378a
    public final int a() {
        try {
            return this.f415219a.getApplicationContext().getPackageManager().getPackageInfo("ru.sberbankmobile", 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // nd.InterfaceC44378a
    public final boolean b(@k String str) {
        try {
            this.f415219a.getApplicationContext().getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
