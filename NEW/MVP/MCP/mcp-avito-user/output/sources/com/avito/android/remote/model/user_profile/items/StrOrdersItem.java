package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StrOrdersItem.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/StrOrdersItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "subtitle", "", "isActionRequired", "Lcom/avito/android/remote/model/user_profile/items/StrOrdersItemAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/user_profile/items/StrOrdersItemAction;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Z", "()Z", "Lcom/avito/android/remote/model/user_profile/items/StrOrdersItemAction;", "getAction", "()Lcom/avito/android/remote/model/user_profile/items/StrOrdersItemAction;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrOrdersItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<StrOrdersItem> CREATOR = new Creator();

    @c("action")
    @k
    private final StrOrdersItemAction action;

    @c("isActionRequired")
    private final boolean isActionRequired;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersItem createFromParcel(@k Parcel parcel) {
            return new StrOrdersItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, StrOrdersItemAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersItem[] newArray(int i12) {
            return new StrOrdersItem[i12];
        }
    }

    public StrOrdersItem(@k String str, @l String str2, boolean z12, @k StrOrdersItemAction strOrdersItemAction) {
        this.title = str;
        this.subtitle = str2;
        this.isActionRequired = z12;
        this.action = strOrdersItemAction;
    }

    @k
    public final StrOrdersItemAction getAction() {
        return this.action;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: isActionRequired, reason: from getter */
    public final boolean getIsActionRequired() {
        return this.isActionRequired;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.isActionRequired ? 1 : 0);
        this.action.writeToParcel(parcel, flags);
    }
}
