package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoSection.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/InfoContent;", "Landroid/os/Parcelable;", "", "header", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "Lcom/avito/android/str_booking/network/models/sections/InfoPlaque;", "infoPlaques", "Lcom/avito/android/str_booking/network/models/common/Button;", "buttons", "", "collapsed", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/ParametrizedEvent;", "onExpandEvent", "isCollapsible", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/ParametrizedEvent;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "e", "Lcom/avito/android/remote/model/ParametrizedEvent;", "h", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "i", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoContent implements Parcelable {

    @k
    public static final Parcelable.Creator<InfoContent> CREATOR = new a();

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("collapsed")
    @l
    private final Boolean collapsed;

    @c("description")
    @l
    private final AttributedText description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final List<AttributedText> disclaimer;

    @c("header")
    @l
    private final String header;

    @c("infoPlaques")
    @l
    private final List<InfoPlaque> infoPlaques;

    @c("isCollapsible")
    @l
    private final Boolean isCollapsible;

    @c("onExpandEvent")
    @l
    private final ParametrizedEvent onExpandEvent;

    /* compiled from: InfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoContent> {
        @Override // android.os.Parcelable.Creator
        public final InfoContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InfoContent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(InfoPlaque.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
                }
            }
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                int iL2 = 0;
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(InfoContent.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new InfoContent(string, attributedText, arrayList, arrayList2, boolValueOf, arrayList3, (ParametrizedEvent) parcel.readParcelable(InfoContent.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final InfoContent[] newArray(int i12) {
            return new InfoContent[i12];
        }
    }

    public InfoContent(@l String str, @l AttributedText attributedText, @l List<InfoPlaque> list, @l List<Button> list2, @l Boolean bool, @l List<AttributedText> list3, @l ParametrizedEvent parametrizedEvent, @l Boolean bool2) {
        this.header = str;
        this.description = attributedText;
        this.infoPlaques = list;
        this.buttons = list2;
        this.collapsed = bool;
        this.disclaimer = list3;
        this.onExpandEvent = parametrizedEvent;
        this.isCollapsible = bool2;
    }

    @l
    public final List<Button> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getCollapsed() {
        return this.collapsed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<AttributedText> e() {
        return this.disclaimer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoContent)) {
            return false;
        }
        InfoContent infoContent = (InfoContent) obj;
        return L.f(this.header, infoContent.header) && L.f(this.description, infoContent.description) && L.f(this.infoPlaques, infoContent.infoPlaques) && L.f(this.buttons, infoContent.buttons) && L.f(this.collapsed, infoContent.collapsed) && L.f(this.disclaimer, infoContent.disclaimer) && L.f(this.onExpandEvent, infoContent.onExpandEvent) && L.f(this.isCollapsible, infoContent.isCollapsible);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    public final List<InfoPlaque> g() {
        return this.infoPlaques;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final ParametrizedEvent getOnExpandEvent() {
        return this.onExpandEvent;
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<InfoPlaque> list = this.infoPlaques;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Button> list2 = this.buttons;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.collapsed;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AttributedText> list3 = this.disclaimer;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onExpandEvent;
        int iHashCode7 = (iHashCode6 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        Boolean bool2 = this.isCollapsible;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsCollapsible() {
        return this.isCollapsible;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoContent(header=");
        sb2.append(this.header);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", infoPlaques=");
        sb2.append(this.infoPlaques);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", collapsed=");
        sb2.append(this.collapsed);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", onExpandEvent=");
        sb2.append(this.onExpandEvent);
        sb2.append(", isCollapsible=");
        return C0.g(sb2, this.isCollapsible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        parcel.writeParcelable(this.description, i12);
        List<InfoPlaque> list = this.infoPlaques;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((InfoPlaque) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<Button> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                Button button = (Button) itA2.next();
                if (button == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    button.writeToParcel(parcel, i12);
                }
            }
        }
        Boolean bool = this.collapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<AttributedText> list3 = this.disclaimer;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.onExpandEvent, i12);
        Boolean bool2 = this.isCollapsible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
