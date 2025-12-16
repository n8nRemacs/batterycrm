package I30;

import Y61.k;
import com.avito.android.notification.s;
import com.avito.android.notification.t;
import com.avito.android.notification.u;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationManagerModule_ProvideNotificationSettingsTrackerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LI30/c;", "Ldagger/internal/h;", "Lcom/avito/android/notification/s;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<s> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7909b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f7910a;

    /* compiled from: NotificationManagerModule_ProvideNotificationSettingsTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI30/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k I30.a aVar, @k u uVar) {
        this.f7910a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = (t) this.f7910a.get();
        f7909b.getClass();
        return tVar;
    }
}
