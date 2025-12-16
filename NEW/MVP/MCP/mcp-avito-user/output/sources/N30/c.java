package N30;

import Y61.k;
import android.content.SharedPreferences;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionInfoScreenStatusStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LN30/c;", "Ldagger/internal/h;", "LN30/b;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11182b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<SharedPreferences> f11183a;

    /* compiled from: NotificationPermissionInfoScreenStatusStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LN30/c$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<SharedPreferences> provider) {
        this.f11183a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SharedPreferences sharedPreferences = this.f11183a.get();
        f11182b.getClass();
        return new b(sharedPreferences);
    }
}
