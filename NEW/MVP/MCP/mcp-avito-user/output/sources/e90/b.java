package E90;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProGeoBannerStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LE90/b;", "LE90/a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements E90.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f3806a;

    /* compiled from: ProfileProGeoBannerStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE90/b$a;", "", "<init>", "()V", "", "PREF_CLOSED_KEY", "Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k l lVar) {
        this.f3806a = lVar;
    }

    @Override // E90.a
    public final boolean a(@k String str) {
        return L.f(this.f3806a.getString("profile_pro_storage_geo_banner_closed_key"), str);
    }

    @Override // E90.a
    public final void b(@k String str) {
        this.f3806a.getF316a().edit().putString("profile_pro_storage_geo_banner_closed_key", str).apply();
    }

    @Override // E90.a
    public final void clear() {
        this.f3806a.getF316a().edit().remove("profile_pro_storage_geo_banner_closed_key").apply();
    }
}
