package com.avito.android.profile_settings_basic;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvatarInteractorResultEvents.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_basic/k;", "", "a", "b", "c", "Lcom/avito/android/profile_settings_basic/k$a;", "Lcom/avito/android/profile_settings_basic/k$b;", "Lcom/avito/android/profile_settings_basic/k$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_basic.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33466k {

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/k$a;", "Lcom/avito/android/profile_settings_basic/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.k$a */
    public static final /* data */ class a implements InterfaceC33466k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f228856a;

        public a(@Y61.k Throwable th2) {
            this.f228856a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f228856a, ((a) obj).f228856a);
        }

        public final int hashCode() {
            return this.f228856a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("AvatarsDeletionFailure(error="), this.f228856a, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/k$b;", "Lcom/avito/android/profile_settings_basic/k;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.k$b */
    public static final /* data */ class b implements InterfaceC33466k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f228857a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -948421993;
        }

        @Y61.k
        public final String toString() {
            return "AvatarsDeletionStarted";
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/k$c;", "Lcom/avito/android/profile_settings_basic/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.k$c */
    public static final /* data */ class c implements InterfaceC33466k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f228858a;

        public c(@Y61.l Image image) {
            this.f228858a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f228858a, ((c) obj).f228858a);
        }

        public final int hashCode() {
            Image image = this.f228858a;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("AvatarsDeletionSuccess(newAvatarImage="), this.f228858a, ')');
        }
    }
}
