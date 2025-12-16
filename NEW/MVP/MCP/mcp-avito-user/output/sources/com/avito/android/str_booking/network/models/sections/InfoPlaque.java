package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoSection.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/InfoPlaque;", "Landroid/os/Parcelable;", "Lcom/avito/android/str_booking/network/models/sections/PlaqueAction;", "action", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "Lcom/avito/android/str_booking/network/models/sections/PlaqueIcon;", "icon", "<init>", "(Lcom/avito/android/str_booking/network/models/sections/PlaqueAction;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/str_booking/network/models/sections/PlaqueIcon;)V", "Lcom/avito/android/str_booking/network/models/sections/PlaqueAction;", "c", "()Lcom/avito/android/str_booking/network/models/sections/PlaqueAction;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/str_booking/network/models/sections/PlaqueIcon;", "e", "()Lcom/avito/android/str_booking/network/models/sections/PlaqueIcon;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPlaque implements Parcelable {

    @k
    public static final Parcelable.Creator<InfoPlaque> CREATOR = new a();

    @c("action")
    @l
    private final PlaqueAction action;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("content")
    @l
    private final AttributedText content;

    @c("icon")
    @l
    private final PlaqueIcon icon;

    /* compiled from: InfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoPlaque> {
        @Override // android.os.Parcelable.Creator
        public final InfoPlaque createFromParcel(Parcel parcel) {
            return new InfoPlaque(parcel.readInt() == 0 ? null : PlaqueAction.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(InfoPlaque.class.getClassLoader()), (AttributedText) parcel.readParcelable(InfoPlaque.class.getClassLoader()), parcel.readInt() != 0 ? PlaqueIcon.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoPlaque[] newArray(int i12) {
            return new InfoPlaque[i12];
        }
    }

    public InfoPlaque(@l PlaqueAction plaqueAction, @l UniversalColor universalColor, @l AttributedText attributedText, @l PlaqueIcon plaqueIcon) {
        this.action = plaqueAction;
        this.backgroundColor = universalColor;
        this.content = attributedText;
        this.icon = plaqueIcon;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final PlaqueAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final PlaqueIcon getIcon() {
        return this.icon;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoPlaque)) {
            return false;
        }
        InfoPlaque infoPlaque = (InfoPlaque) obj;
        return L.f(this.action, infoPlaque.action) && L.f(this.backgroundColor, infoPlaque.backgroundColor) && L.f(this.content, infoPlaque.content) && L.f(this.icon, infoPlaque.icon);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int hashCode() {
        PlaqueAction plaqueAction = this.action;
        int iHashCode = (plaqueAction == null ? 0 : plaqueAction.hashCode()) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        AttributedText attributedText = this.content;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        PlaqueIcon plaqueIcon = this.icon;
        return iHashCode3 + (plaqueIcon != null ? plaqueIcon.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InfoPlaque(action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", content=" + this.content + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        PlaqueAction plaqueAction = this.action;
        if (plaqueAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            plaqueAction.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.backgroundColor, i12);
        parcel.writeParcelable(this.content, i12);
        PlaqueIcon plaqueIcon = this.icon;
        if (plaqueIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            plaqueIcon.writeToParcel(parcel, i12);
        }
    }
}
