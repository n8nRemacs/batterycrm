package com.avito.android.remote.model.basic;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvatarUploadResult.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/basic/AvatarUploadResult;", "", "avatar", "Lcom/avito/android/remote/model/basic/AvatarUploadResult$AvatarValue;", "newActions", "", "Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Lcom/avito/android/remote/model/basic/AvatarUploadResult$AvatarValue;Ljava/util/List;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getAvatar", "()Lcom/avito/android/remote/model/basic/AvatarUploadResult$AvatarValue;", "getNewActions", "()Ljava/util/List;", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "AvatarValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvatarUploadResult {

    @c("avatar")
    @l
    private final AvatarValue avatar;

    @c("newActions")
    @l
    private final List<BasicInfoWidgetAvatarAction> newActions;

    @c("status")
    @l
    private final FieldModerationStatus status;

    /* compiled from: AvatarUploadResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/basic/AvatarUploadResult$AvatarValue;", "", "image", "Lcom/avito/android/remote/model/Image;", "(Lcom/avito/android/remote/model/Image;)V", "getImage", "()Lcom/avito/android/remote/model/Image;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarValue {

        @c("image")
        @l
        private final Image image;

        public AvatarValue(@l Image image) {
            this.image = image;
        }

        public static /* synthetic */ AvatarValue copy$default(AvatarValue avatarValue, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = avatarValue.image;
            }
            return avatarValue.copy(image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final AvatarValue copy(@l Image image) {
            return new AvatarValue(image);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AvatarValue) && L.f(this.image, ((AvatarValue) other).image);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            Image image = this.image;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @k
        public String toString() {
            return AK.c.o(new StringBuilder("AvatarValue(image="), this.image, ')');
        }
    }

    public AvatarUploadResult(@l AvatarValue avatarValue, @l List<BasicInfoWidgetAvatarAction> list, @l FieldModerationStatus fieldModerationStatus) {
        this.avatar = avatarValue;
        this.newActions = list;
        this.status = fieldModerationStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarUploadResult copy$default(AvatarUploadResult avatarUploadResult, AvatarValue avatarValue, List list, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avatarValue = avatarUploadResult.avatar;
        }
        if ((i12 & 2) != 0) {
            list = avatarUploadResult.newActions;
        }
        if ((i12 & 4) != 0) {
            fieldModerationStatus = avatarUploadResult.status;
        }
        return avatarUploadResult.copy(avatarValue, list, fieldModerationStatus);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AvatarValue getAvatar() {
        return this.avatar;
    }

    @l
    public final List<BasicInfoWidgetAvatarAction> component2() {
        return this.newActions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FieldModerationStatus getStatus() {
        return this.status;
    }

    @k
    public final AvatarUploadResult copy(@l AvatarValue avatar, @l List<BasicInfoWidgetAvatarAction> newActions, @l FieldModerationStatus status) {
        return new AvatarUploadResult(avatar, newActions, status);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarUploadResult)) {
            return false;
        }
        AvatarUploadResult avatarUploadResult = (AvatarUploadResult) other;
        return L.f(this.avatar, avatarUploadResult.avatar) && L.f(this.newActions, avatarUploadResult.newActions) && L.f(this.status, avatarUploadResult.status);
    }

    @l
    public final AvatarValue getAvatar() {
        return this.avatar;
    }

    @l
    public final List<BasicInfoWidgetAvatarAction> getNewActions() {
        return this.newActions;
    }

    @l
    public final FieldModerationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        AvatarValue avatarValue = this.avatar;
        int iHashCode = (avatarValue == null ? 0 : avatarValue.hashCode()) * 31;
        List<BasicInfoWidgetAvatarAction> list = this.newActions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        FieldModerationStatus fieldModerationStatus = this.status;
        return iHashCode2 + (fieldModerationStatus != null ? fieldModerationStatus.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AvatarUploadResult(avatar=" + this.avatar + ", newActions=" + this.newActions + ", status=" + this.status + ')';
    }
}
