package com.avito.android.profile_settings_basic;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvatarInteractorResultEvents.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_basic/d;", "", "a", "b", "c", "Lcom/avito/android/profile_settings_basic/d$a;", "Lcom/avito/android/profile_settings_basic/d$b;", "Lcom/avito/android/profile_settings_basic/d$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_basic.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33459d {

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/d$a;", "Lcom/avito/android/profile_settings_basic/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.d$a */
    public static final /* data */ class a implements InterfaceC33459d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f228735a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f228736b;

        public a(@Y61.k Throwable th2, boolean z12) {
            this.f228735a = th2;
            this.f228736b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f228735a, aVar.f228735a) && this.f228736b == aVar.f228736b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f228736b) + (this.f228735a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarDeletionFailure(error=");
            sb2.append(this.f228735a);
            sb2.append(", isPublic=");
            return androidx.appcompat.app.r.x(sb2, this.f228736b, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/d$b;", "Lcom/avito/android/profile_settings_basic/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.d$b */
    public static final /* data */ class b implements InterfaceC33459d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f228737a;

        public b(boolean z12) {
            this.f228737a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f228737a == ((b) obj).f228737a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f228737a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("AvatarDeletionStarted(isPublic="), this.f228737a, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/d$c;", "Lcom/avito/android/profile_settings_basic/d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.d$c */
    public static final /* data */ class c implements InterfaceC33459d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f228738a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1751178697;
        }

        @Y61.k
        public final String toString() {
            return "AvatarDeletionSuccess";
        }
    }
}
