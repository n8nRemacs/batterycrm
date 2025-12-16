package I30;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationManagerModule_ProvideNotificationManagerProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LI30/b;", "Ldagger/internal/h;", "LI30/d;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7907b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f7908a;

    /* compiled from: NotificationManagerModule_ProvideNotificationManagerProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI30/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k I30.a aVar, @k f fVar) {
        this.f7908a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f7908a.get();
        f7907b.getClass();
        return eVar;
    }
}
