package I30;

import Y61.k;
import com.avito.android.notification.l;
import com.avito.android.notification.m;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationManagerProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI30/e;", "LI30/d;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f7911a;

    @Inject
    public e(@k m mVar) {
        this.f7911a = mVar;
    }

    @Override // I30.d
    public final boolean a(@k String str) {
        return l.a(this.f7911a.b(), str);
    }

    @Override // I30.d
    public final boolean b() {
        return this.f7911a.b().f44481b.areNotificationsEnabled();
    }
}
