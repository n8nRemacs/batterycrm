package com.avito.android.remote.model.common.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationIconItem.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationIconItem;", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "", "icon", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/common/items/VerificationIconItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getBody", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationIconItem implements VerificationListItem {

    @k
    public static final Parcelable.Creator<VerificationIconItem> CREATOR = new Creator();

    @c("body")
    @l
    private final AttributedText body;

    @c("icon")
    @k
    private final String icon;

    @c("title")
    @k
    private final String title;

    /* compiled from: VerificationIconItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationIconItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationIconItem createFromParcel(@k Parcel parcel) {
            return new VerificationIconItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(VerificationIconItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationIconItem[] newArray(int i12) {
            return new VerificationIconItem[i12];
        }
    }

    public VerificationIconItem(@k String str, @k String str2, @l AttributedText attributedText) {
        this.icon = str;
        this.title = str2;
        this.body = attributedText;
    }

    public static /* synthetic */ VerificationIconItem copy$default(VerificationIconItem verificationIconItem, String str, String str2, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationIconItem.icon;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationIconItem.title;
        }
        if ((i12 & 4) != 0) {
            attributedText = verificationIconItem.body;
        }
        return verificationIconItem.copy(str, str2, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final VerificationIconItem copy(@k String icon, @k String title, @l AttributedText body) {
        return new VerificationIconItem(icon, title, body);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationIconItem)) {
            return false;
        }
        VerificationIconItem verificationIconItem = (VerificationIconItem) other;
        return L.f(this.icon, verificationIconItem.icon) && L.f(this.title, verificationIconItem.title) && L.f(this.body, verificationIconItem.body);
    }

    @l
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.icon.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.body;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationIconItem(icon=");
        sb2.append(this.icon);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        return a.w(sb2, this.body, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.body, flags);
    }
}
