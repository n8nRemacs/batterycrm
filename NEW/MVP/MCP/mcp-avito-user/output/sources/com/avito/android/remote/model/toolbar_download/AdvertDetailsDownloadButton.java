package com.avito.android.remote.model.toolbar_download;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDownloadButton.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadButton;", "Landroid/os/Parcelable;", "", "type", "icon", "title", "handlerMob", ConstraintKt.WARNING, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getIcon", "getTitle", "getHandlerMob", "getWarning", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsDownloadButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsDownloadButton> CREATOR = new Creator();

    @c("handlerMob")
    @l
    private final String handlerMob;

    @c("icon")
    @l
    private final String icon;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final String type;

    @c(ConstraintKt.WARNING)
    @l
    private final String warning;

    /* compiled from: AdvertDetailsDownloadButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsDownloadButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsDownloadButton createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsDownloadButton(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsDownloadButton[] newArray(int i12) {
            return new AdvertDetailsDownloadButton[i12];
        }
    }

    public AdvertDetailsDownloadButton() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AdvertDetailsDownloadButton copy$default(AdvertDetailsDownloadButton advertDetailsDownloadButton, String str, String str2, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertDetailsDownloadButton.type;
        }
        if ((i12 & 2) != 0) {
            str2 = advertDetailsDownloadButton.icon;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = advertDetailsDownloadButton.title;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = advertDetailsDownloadButton.handlerMob;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            str5 = advertDetailsDownloadButton.warning;
        }
        return advertDetailsDownloadButton.copy(str, str6, str7, str8, str5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getHandlerMob() {
        return this.handlerMob;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    @k
    public final AdvertDetailsDownloadButton copy(@l String type, @l String icon, @l String title, @l String handlerMob, @l String warning) {
        return new AdvertDetailsDownloadButton(type, icon, title, handlerMob, warning);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsDownloadButton)) {
            return false;
        }
        AdvertDetailsDownloadButton advertDetailsDownloadButton = (AdvertDetailsDownloadButton) other;
        return L.f(this.type, advertDetailsDownloadButton.type) && L.f(this.icon, advertDetailsDownloadButton.icon) && L.f(this.title, advertDetailsDownloadButton.title) && L.f(this.handlerMob, advertDetailsDownloadButton.handlerMob) && L.f(this.warning, advertDetailsDownloadButton.warning);
    }

    @l
    public final String getHandlerMob() {
        return this.handlerMob;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.handlerMob;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.warning;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDownloadButton(type=");
        sb2.append(this.type);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", handlerMob=");
        sb2.append(this.handlerMob);
        sb2.append(", warning=");
        return C22026a.c(sb2, this.warning, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeString(this.handlerMob);
        parcel.writeString(this.warning);
    }

    public AdvertDetailsDownloadButton(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.type = str;
        this.icon = str2;
        this.title = str3;
        this.handlerMob = str4;
        this.warning = str5;
    }

    public /* synthetic */ AdvertDetailsDownloadButton(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5);
    }
}
