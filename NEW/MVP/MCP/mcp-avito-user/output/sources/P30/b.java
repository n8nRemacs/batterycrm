package P30;

import Y61.k;
import Y61.l;
import android.annotation.TargetApi;
import com.avito.android.permissions.u;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationPermissionHelper.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP30/b;", "LP30/a;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f12804a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C f12805b;

    @Inject
    public b(@k u uVar, @k C c12) {
        this.f12804a = uVar;
        this.f12805b = c12;
    }

    @Override // P30.a
    @TargetApi(33)
    public final boolean a() {
        return this.f12805b.j() < 33 || this.f12804a.b("android.permission.POST_NOTIFICATIONS");
    }

    @Override // P30.a
    @l
    @TargetApi(33)
    public final String b() {
        if (this.f12805b.j() >= 33) {
            return "android.permission.POST_NOTIFICATIONS";
        }
        return null;
    }
}
