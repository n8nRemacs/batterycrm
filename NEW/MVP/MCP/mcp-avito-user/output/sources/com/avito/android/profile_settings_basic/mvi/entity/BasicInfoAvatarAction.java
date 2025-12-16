package com.avito.android.profile_settings_basic.mvi.entity;

import K51.d;
import Qb0.InterfaceC14878a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BasicProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction;", "LQb0/a;", "Landroid/os/Parcelable;", "DeleteAvatarImage", "OpenAvatarPicker", "Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction$DeleteAvatarImage;", "Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction$OpenAvatarPicker;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BasicInfoAvatarAction extends InterfaceC14878a, Parcelable {

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction$DeleteAvatarImage;", "Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DeleteAvatarImage implements BasicInfoAvatarAction {

        @k
        public static final Parcelable.Creator<DeleteAvatarImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f228875b;

        /* compiled from: BasicProfileSettingsAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeleteAvatarImage> {
            @Override // android.os.Parcelable.Creator
            public final DeleteAvatarImage createFromParcel(Parcel parcel) {
                return new DeleteAvatarImage(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteAvatarImage[] newArray(int i12) {
                return new DeleteAvatarImage[i12];
            }
        }

        public DeleteAvatarImage(boolean z12) {
            this.f228875b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteAvatarImage) && this.f228875b == ((DeleteAvatarImage) obj).f228875b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f228875b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("DeleteAvatarImage(isPublic="), this.f228875b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f228875b ? 1 : 0);
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction$OpenAvatarPicker;", "Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class OpenAvatarPicker implements BasicInfoAvatarAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAvatarPicker f228876b = new OpenAvatarPicker();

        @k
        public static final Parcelable.Creator<OpenAvatarPicker> CREATOR = new a();

        /* compiled from: BasicProfileSettingsAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenAvatarPicker> {
            @Override // android.os.Parcelable.Creator
            public final OpenAvatarPicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenAvatarPicker.f228876b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAvatarPicker[] newArray(int i12) {
                return new OpenAvatarPicker[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
