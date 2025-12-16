package com.avito.android.profile_settings_basic;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvatarInteractorResultEvents.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile_settings_basic/j;", "", "a", "b", "c", "d", "Lcom/avito/android/profile_settings_basic/j$a;", "Lcom/avito/android/profile_settings_basic/j$b;", "Lcom/avito/android/profile_settings_basic/j$c;", "Lcom/avito/android/profile_settings_basic/j$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_basic.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33465j {

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/j$a;", "Lcom/avito/android/profile_settings_basic/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.j$a */
    public static final /* data */ class a implements InterfaceC33465j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f228849a;

        public a(@Y61.k Uri uri) {
            this.f228849a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f228849a, ((a) obj).f228849a);
        }

        public final int hashCode() {
            return this.f228849a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarUploadCancel(avatarUri="), this.f228849a, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/j$b;", "Lcom/avito/android/profile_settings_basic/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.j$b */
    public static final /* data */ class b implements InterfaceC33465j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f228850a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f228851b;

        public b(@Y61.k Uri uri, @Y61.k Throwable th2) {
            this.f228850a = th2;
            this.f228851b = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f228850a, bVar.f228850a) && L.f(this.f228851b, bVar.f228851b);
        }

        public final int hashCode() {
            return this.f228851b.hashCode() + (this.f228850a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarUploadFailure(error=");
            sb2.append(this.f228850a);
            sb2.append(", avatarUri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f228851b, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/j$c;", "Lcom/avito/android/profile_settings_basic/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.j$c */
    public static final /* data */ class c implements InterfaceC33465j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f228852a;

        public c(@Y61.k Uri uri) {
            this.f228852a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f228852a, ((c) obj).f228852a);
        }

        public final int hashCode() {
            return this.f228852a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarUploadStarted(newImageUri="), this.f228852a, ')');
        }
    }

    /* compiled from: AvatarInteractorResultEvents.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/j$d;", "Lcom/avito/android/profile_settings_basic/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.j$d */
    public static final /* data */ class d implements InterfaceC33465j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f228853a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<BasicInfoItem.AvatarAction> f228854b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ModerationStatus f228855c;

        public d(@Y61.l Image image, @Y61.k List<BasicInfoItem.AvatarAction> list, @Y61.l ModerationStatus moderationStatus) {
            this.f228853a = image;
            this.f228854b = list;
            this.f228855c = moderationStatus;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f228853a, dVar.f228853a) && L.f(this.f228854b, dVar.f228854b) && L.f(this.f228855c, dVar.f228855c);
        }

        public final int hashCode() {
            Image image = this.f228853a;
            int iE2 = androidx.compose.foundation.H.e((image == null ? 0 : image.hashCode()) * 31, 31, this.f228854b);
            ModerationStatus moderationStatus = this.f228855c;
            return iE2 + (moderationStatus != null ? moderationStatus.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvatarUploadSuccess(avatar=" + this.f228853a + ", newActions=" + this.f228854b + ", status=" + this.f228855c + ')';
        }
    }
}
