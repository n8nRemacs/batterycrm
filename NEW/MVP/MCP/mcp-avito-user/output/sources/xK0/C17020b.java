package Xk0;

import Y61.k;
import com.avito.android.remote.R0;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileApi_Module_ProvideProfileApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXk0/b;", "Ldagger/internal/h;", "Lcom/avito/android/remote/profile/generated/api/ProfileApi;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xk0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17020b implements h<ProfileApi> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f19051b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f19052a;

    /* compiled from: ProfileApi_Module_ProvideProfileApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXk0/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xk0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C17020b(@k f fVar) {
        this.f19052a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19052a.get();
        f19051b.getClass();
        C17019a.f19050a.getClass();
        ProfileApi profileApi = (ProfileApi) r02.create(ProfileApi.class);
        t.b(profileApi, "Cannot return null from a non-@Nullable @Provides method");
        return profileApi;
    }
}
