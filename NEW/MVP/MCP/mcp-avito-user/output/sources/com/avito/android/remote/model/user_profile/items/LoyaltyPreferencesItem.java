package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.DeeplinkAction;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: LoyaltyPreferencesItem.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/LoyaltyPreferencesItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "subtitle", "Lcom/avito/android/remote/model/DeeplinkAction;", "action", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/DeeplinkAction;", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getTag", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoyaltyPreferencesItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<LoyaltyPreferencesItem> CREATOR = new Creator();

    @c("action")
    @k
    private final DeeplinkAction action;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("tag")
    @l
    private final String tag;

    @c("title")
    @k
    private final String title;

    /* compiled from: LoyaltyPreferencesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyPreferencesItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LoyaltyPreferencesItem createFromParcel(@k Parcel parcel) {
            return new LoyaltyPreferencesItem(parcel.readString(), parcel.readString(), (DeeplinkAction) parcel.readParcelable(LoyaltyPreferencesItem.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LoyaltyPreferencesItem[] newArray(int i12) {
            return new LoyaltyPreferencesItem[i12];
        }
    }

    public LoyaltyPreferencesItem(@k String str, @l String str2, @k DeeplinkAction deeplinkAction, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.action = deeplinkAction;
        this.tag = str3;
    }

    @k
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTag() {
        return this.tag;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.tag);
    }
}
