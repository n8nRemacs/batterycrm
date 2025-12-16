package com.avito.android.permissions;

import com.avito.android.permissions.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PermissionStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/permissions/H;", "Lcom/avito/android/permissions/G;", "a", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f215102a;

    /* compiled from: PermissionStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/permissions/H$a;", "", "<init>", "()V", "", "TYPE_WAS_PERMISSION_FOREVER_DENIED", "Ljava/lang/String;", "TYPE_WAS_SHOULD_SHOW_RATIONALE_TRUE", "WAS_CAMERA_PERMISSION_ASKED", "WAS_CAMERA_PERMISSION_FOREVER_DENIED", "WAS_MIC_PERMISSION_ASKED", "WAS_MIC_PERMISSION_FOREVER_DENIED", "WAS_NOTIFICATION_PERMISSION_FOREVER_DENIED", "WAS_READ_PHONE_STATE_PERMISSION_FOREVER_DENIED", "WAS_STORAGE_PERMISSION_ASKED", "WAS_STORAGE_PERMISSION_FOREVER_DENIED", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public H(@Y61.k AK0.l lVar) {
        this.f215102a = lVar;
    }

    public static String q(String str, String str2) {
        return "permission_storage_" + str + '_' + str2;
    }

    @Override // com.avito.android.permissions.G
    public final boolean a() {
        return this.f215102a.getBoolean("was_camera_permission_asked", false);
    }

    @Override // com.avito.android.permissions.G
    public final void b(boolean z12) {
        AK0.l lVar = this.f215102a;
        lVar.putBoolean("was_mic_permission_forever_denied", z12);
        lVar.putBoolean(q("android.permission.RECORD_AUDIO", "wasPermissionForeverDenied"), z12);
    }

    @Override // com.avito.android.permissions.G
    public final void c() {
        this.f215102a.putBoolean("was_storage_permission_asked", true);
    }

    @Override // com.avito.android.permissions.G
    public final boolean d() {
        return this.f215102a.getBoolean("was_storage_permission_asked", false);
    }

    @Override // com.avito.android.permissions.G
    public final void e(boolean z12) {
        AK0.l lVar = this.f215102a;
        lVar.putBoolean("was_storage_permission_forever_denied", z12);
        t.f215141z.getClass();
        lVar.putBoolean(q(t.a.f215143b, "wasPermissionForeverDenied"), z12);
    }

    @Override // com.avito.android.permissions.G
    public final void f() {
        this.f215102a.putBoolean("was_mic_permission_asked", true);
    }

    @Override // com.avito.android.permissions.G
    public final boolean g() {
        return this.f215102a.getBoolean("was_storage_permission_forever_denied", false);
    }

    @Override // com.avito.android.permissions.G
    public final boolean h(@Y61.k String str) {
        return this.f215102a.getBoolean(q(str, "wasShouldShowRationaleTrue"), false);
    }

    @Override // com.avito.android.permissions.G
    public final void i(@Y61.k String str, boolean z12) {
        if (str.equals("android.permission.RECORD_AUDIO")) {
            b(z12);
        } else if (str.equals("android.permission.CAMERA")) {
            p(z12);
        } else {
            t.f215141z.getClass();
            if (str.equals(t.a.f215143b)) {
                e(z12);
            }
        }
        this.f215102a.putBoolean(q(str, "wasPermissionForeverDenied"), z12);
    }

    @Override // com.avito.android.permissions.G
    public final boolean j(@Y61.k String str) {
        if (str.equals("android.permission.RECORD_AUDIO")) {
            return m();
        }
        if (str.equals("android.permission.CAMERA")) {
            return o();
        }
        t.f215141z.getClass();
        if (str.equals(t.a.f215143b)) {
            return g();
        }
        return this.f215102a.getBoolean(q(str, "wasPermissionForeverDenied"), false);
    }

    @Override // com.avito.android.permissions.G
    @Y61.l
    public final Boolean k() {
        AK0.l lVar = this.f215102a;
        if (lVar.contains("WAS_NOTIFICATION_PERMISSION_FOREVER_DENIED")) {
            return Boolean.valueOf(lVar.getBoolean("was_notification_permission_forever_denied", false));
        }
        return null;
    }

    @Override // com.avito.android.permissions.G
    public final void l(@Y61.k String str, boolean z12) {
        this.f215102a.putBoolean(q(str, "wasShouldShowRationaleTrue"), z12);
    }

    @Override // com.avito.android.permissions.G
    public final boolean m() {
        return this.f215102a.getBoolean("was_mic_permission_forever_denied", false);
    }

    @Override // com.avito.android.permissions.G
    public final void n() {
        this.f215102a.putBoolean("was_camera_permission_asked", true);
    }

    @Override // com.avito.android.permissions.G
    public final boolean o() {
        return this.f215102a.getBoolean("was_camera_permission_forever_denied", false);
    }

    @Override // com.avito.android.permissions.G
    public final void p(boolean z12) {
        AK0.l lVar = this.f215102a;
        lVar.putBoolean("was_camera_permission_forever_denied", z12);
        lVar.putBoolean(q("android.permission.CAMERA", "wasPermissionForeverDenied"), z12);
    }
}
