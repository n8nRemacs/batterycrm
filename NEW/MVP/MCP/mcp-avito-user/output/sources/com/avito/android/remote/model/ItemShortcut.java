package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/ItemShortcut;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "iconUri", "", "title", AddressParameter.TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ItemShortcut;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getIconUri", "Ljava/lang/String;", "getTitle", "getAddress", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemShortcut implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemShortcut> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("iconUri")
    @k
    private final Uri iconUri;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemShortcut> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemShortcut createFromParcel(@k Parcel parcel) {
            return new ItemShortcut((Uri) parcel.readParcelable(ItemShortcut.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemShortcut[] newArray(int i12) {
            return new ItemShortcut[i12];
        }
    }

    public ItemShortcut(@k Uri uri, @k String str, @k String str2) {
        this.iconUri = uri;
        this.title = str;
        this.address = str2;
    }

    public static /* synthetic */ ItemShortcut copy$default(ItemShortcut itemShortcut, Uri uri, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = itemShortcut.iconUri;
        }
        if ((i12 & 2) != 0) {
            str = itemShortcut.title;
        }
        if ((i12 & 4) != 0) {
            str2 = itemShortcut.address;
        }
        return itemShortcut.copy(uri, str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Uri getIconUri() {
        return this.iconUri;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    public final ItemShortcut copy(@k Uri iconUri, @k String title, @k String address) {
        return new ItemShortcut(iconUri, title, address);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemShortcut)) {
            return false;
        }
        ItemShortcut itemShortcut = (ItemShortcut) other;
        return L.f(this.iconUri, itemShortcut.iconUri) && L.f(this.title, itemShortcut.title) && L.f(this.address, itemShortcut.address);
    }

    @k
    public final String getAddress() {
        return this.address;
    }

    @k
    public final Uri getIconUri() {
        return this.iconUri;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.address.hashCode() + H.d(this.iconUri.hashCode() * 31, 31, this.title);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ItemShortcut(iconUri=");
        sb2.append(this.iconUri);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", address=");
        return C22026a.c(sb2, this.address, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.iconUri, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
    }
}
