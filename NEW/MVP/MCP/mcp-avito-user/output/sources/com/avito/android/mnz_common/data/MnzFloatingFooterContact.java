package com.avito.android.mnz_common.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooter.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "Landroid/os/Parcelable;", "", "count", "", "progress", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "iconName", "Lcom/avito/android/remote/model/UniversalColor;", "progressColor", "<init>", "(IFLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "I", "getCount", "()I", "F", "d", "()F", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "e", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MnzFloatingFooterContact implements Parcelable {

    @k
    public static final Parcelable.Creator<MnzFloatingFooterContact> CREATOR = new a();

    @c("count")
    private final int count;

    @c("icon")
    @l
    private final String iconName;

    @c("progress")
    private final float progress;

    @c("progressColor")
    @l
    private final UniversalColor progressColor;

    @c("text")
    @l
    private final AttributedText text;

    /* compiled from: MnzFloatingFooter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MnzFloatingFooterContact> {
        @Override // android.os.Parcelable.Creator
        public final MnzFloatingFooterContact createFromParcel(Parcel parcel) {
            return new MnzFloatingFooterContact(parcel.readInt(), parcel.readFloat(), (AttributedText) parcel.readParcelable(MnzFloatingFooterContact.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(MnzFloatingFooterContact.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MnzFloatingFooterContact[] newArray(int i12) {
            return new MnzFloatingFooterContact[i12];
        }
    }

    public MnzFloatingFooterContact(int i12, float f12, @l AttributedText attributedText, @l String str, @l UniversalColor universalColor) {
        this.count = i12;
        this.progress = f12;
        this.text = attributedText;
        this.iconName = str;
        this.progressColor = universalColor;
    }

    public static MnzFloatingFooterContact a(MnzFloatingFooterContact mnzFloatingFooterContact, AttributedText attributedText, String str, UniversalColor universalColor) {
        int i12 = mnzFloatingFooterContact.count;
        float f12 = mnzFloatingFooterContact.progress;
        mnzFloatingFooterContact.getClass();
        return new MnzFloatingFooterContact(i12, f12, attributedText, str, universalColor);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* renamed from: d, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final UniversalColor getProgressColor() {
        return this.progressColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MnzFloatingFooterContact)) {
            return false;
        }
        MnzFloatingFooterContact mnzFloatingFooterContact = (MnzFloatingFooterContact) obj;
        return this.count == mnzFloatingFooterContact.count && Float.compare(this.progress, mnzFloatingFooterContact.progress) == 0 && L.f(this.text, mnzFloatingFooterContact.text) && L.f(this.iconName, mnzFloatingFooterContact.iconName) && L.f(this.progressColor, mnzFloatingFooterContact.progressColor);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int iD2 = r.d(this.progress, Integer.hashCode(this.count) * 31, 31);
        AttributedText attributedText = this.text;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.iconName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.progressColor;
        return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzFloatingFooterContact(count=");
        sb2.append(this.count);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", progressColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.progressColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.count);
        parcel.writeFloat(this.progress);
        parcel.writeParcelable(this.text, i12);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.progressColor, i12);
    }

    public /* synthetic */ MnzFloatingFooterContact(int i12, float f12, AttributedText attributedText, String str, UniversalColor universalColor, int i13, C42822w c42822w) {
        this(i12, f12, (i13 & 4) != 0 ? null : attributedText, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : universalColor);
    }
}
