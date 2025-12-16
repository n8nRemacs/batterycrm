package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media.C;
import j.N;
import java.util.Objects;

/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes.dex */
class F implements C.a {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f47008c = C.f47003b;

    /* renamed from: a, reason: collision with root package name */
    public Context f47009a;

    /* renamed from: b, reason: collision with root package name */
    public ContentResolver f47010b;

    /* compiled from: MediaSessionManagerImplBase.java */
    public static class a implements C.c {

        /* renamed from: a, reason: collision with root package name */
        public final String f47011a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47012b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47013c;

        public a(String str, int i12, int i13) {
            this.f47011a = str;
            this.f47012b = i12;
            this.f47013c = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i12 = this.f47013c;
            String str = this.f47011a;
            int i13 = this.f47012b;
            return (i13 < 0 || aVar.f47012b < 0) ? TextUtils.equals(str, aVar.f47011a) && i12 == aVar.f47013c : TextUtils.equals(str, aVar.f47011a) && i13 == aVar.f47012b && i12 == aVar.f47013c;
        }

        public final int hashCode() {
            return Objects.hash(this.f47011a, Integer.valueOf(this.f47013c));
        }
    }

    @Override // androidx.media.C.a
    public boolean a(@N a aVar) {
        try {
            if (this.f47009a.getPackageManager().getApplicationInfo(aVar.f47011a, 0) == null) {
                return false;
            }
            if (!b(aVar, "android.permission.STATUS_BAR_SERVICE") && !b(aVar, "android.permission.MEDIA_CONTENT_CONTROL") && aVar.f47013c != 1000) {
                String string = Settings.Secure.getString(this.f47010b, "enabled_notification_listeners");
                if (string == null) {
                    return false;
                }
                for (String str : string.split(":")) {
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                    if (componentNameUnflattenFromString == null || !componentNameUnflattenFromString.getPackageName().equals(aVar.f47011a)) {
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f47008c) {
                aVar.getClass();
            }
            return false;
        }
    }

    public final boolean b(a aVar, String str) {
        int i12 = aVar.f47012b;
        return i12 < 0 ? this.f47009a.getPackageManager().checkPermission(str, aVar.f47011a) == 0 : this.f47009a.checkPermission(str, i12, aVar.f47013c) == 0;
    }
}
