package com.avito.android.silent_update_deeplinks.permissions;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.silent_update.permissions.SilentUpdatePermissions;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SilentUpdatePermissionsDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/d;", "LJu/c$b;", "a", "b", "Lcom/avito/android/silent_update_deeplinks/permissions/d$a;", "Lcom/avito/android/silent_update_deeplinks/permissions/d$b;", "_avito_silent-update-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d extends InterfaceC14249c.b {

    /* compiled from: SilentUpdatePermissionsDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/d$a;", "Lcom/avito/android/silent_update_deeplinks/permissions/d;", "<init>", "()V", "_avito_silent-update-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f283753b = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2096633375;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SilentUpdatePermissionsDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/d$b;", "Lcom/avito/android/silent_update_deeplinks/permissions/d;", "_avito_silent-update-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SilentUpdatePermissions f283754b;

        public b(@k SilentUpdatePermissions silentUpdatePermissions) {
            this.f283754b = silentUpdatePermissions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f283754b, ((b) obj).f283754b);
        }

        public final int hashCode() {
            return this.f283754b.hashCode();
        }

        @k
        public final String toString() {
            return "Success(permissionsResult=" + this.f283754b + ')';
        }
    }
}
