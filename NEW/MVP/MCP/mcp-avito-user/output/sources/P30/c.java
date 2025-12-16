package P30;

import Y61.k;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionHelperImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LP30/c;", "Ldagger/internal/h;", "LP30/b;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f12806c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w f12807a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<C> f12808b;

    /* compiled from: NotificationPermissionHelperImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP30/c$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k w wVar, @k Provider provider) {
        this.f12807a = wVar;
        this.f12808b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f12807a.get();
        C c12 = this.f12808b.get();
        f12806c.getClass();
        return new b(uVar, c12);
    }
}
