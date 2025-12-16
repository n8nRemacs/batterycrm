package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GeoMarketReport.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010(R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u00100R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010,¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/GeoMarketReport;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/GeoMarketReport$Insight;", "insights", "Lcom/avito/android/remote/model/ButtonAction;", "button", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/ButtonAction;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;)Lcom/avito/android/remote/model/GeoMarketReport;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Ljava/util/List;", "getInsights", "setInsights", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "setButton", "(Lcom/avito/android/remote/model/ButtonAction;)V", "getButtons", "setButtons", "Insight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoMarketReport implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoMarketReport> CREATOR = new Creator();

    @c("button")
    @l
    private ButtonAction button;

    @c("buttons")
    @l
    private List<ButtonAction> buttons;

    @c("insights")
    @l
    private List<Insight> insights;

    @c("title")
    @l
    private String title;

    /* compiled from: GeoMarketReport.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoMarketReport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoMarketReport createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Insight.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            ButtonAction buttonActionCreateFromParcel = parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(ButtonAction.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new GeoMarketReport(string, arrayList, buttonActionCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoMarketReport[] newArray(int i12) {
            return new GeoMarketReport[i12];
        }
    }

    /* compiled from: GeoMarketReport.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/GeoMarketReport$Insight;", "Landroid/os/Parcelable;", "", "icon", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/GeoMarketReport$Insight;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Insight implements Parcelable {

        @k
        public static final Parcelable.Creator<Insight> CREATOR = new Creator();

        @c("icon")
        @l
        private final String icon;

        @c("text")
        @l
        private final String text;

        /* compiled from: GeoMarketReport.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Insight> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Insight createFromParcel(@k Parcel parcel) {
                return new Insight(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Insight[] newArray(int i12) {
                return new Insight[i12];
            }
        }

        public Insight(@l String str, @l String str2) {
            this.icon = str;
            this.text = str2;
        }

        public static /* synthetic */ Insight copy$default(Insight insight, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = insight.icon;
            }
            if ((i12 & 2) != 0) {
                str2 = insight.text;
            }
            return insight.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final Insight copy(@l String icon, @l String text) {
            return new Insight(icon, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insight)) {
                return false;
            }
            Insight insight = (Insight) other;
            return L.f(this.icon, insight.icon) && L.f(this.text, insight.text);
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.icon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Insight(icon=");
            sb2.append(this.icon);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.icon);
            parcel.writeString(this.text);
        }
    }

    public GeoMarketReport() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeoMarketReport copy$default(GeoMarketReport geoMarketReport, String str, List list, ButtonAction buttonAction, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoMarketReport.title;
        }
        if ((i12 & 2) != 0) {
            list = geoMarketReport.insights;
        }
        if ((i12 & 4) != 0) {
            buttonAction = geoMarketReport.button;
        }
        if ((i12 & 8) != 0) {
            list2 = geoMarketReport.buttons;
        }
        return geoMarketReport.copy(str, list, buttonAction, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<Insight> component2() {
        return this.insights;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final List<ButtonAction> component4() {
        return this.buttons;
    }

    @k
    public final GeoMarketReport copy(@l String title, @l List<Insight> insights, @l ButtonAction button, @l List<ButtonAction> buttons) {
        return new GeoMarketReport(title, insights, button, buttons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoMarketReport)) {
            return false;
        }
        GeoMarketReport geoMarketReport = (GeoMarketReport) other;
        return L.f(this.title, geoMarketReport.title) && L.f(this.insights, geoMarketReport.insights) && L.f(this.button, geoMarketReport.button) && L.f(this.buttons, geoMarketReport.buttons);
    }

    @l
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final List<ButtonAction> getButtons() {
        return this.buttons;
    }

    @l
    public final List<Insight> getInsights() {
        return this.insights;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Insight> list = this.insights;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonAction buttonAction = this.button;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        List<ButtonAction> list2 = this.buttons;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setButton(@l ButtonAction buttonAction) {
        this.button = buttonAction;
    }

    public final void setButtons(@l List<ButtonAction> list) {
        this.buttons = list;
    }

    public final void setInsights(@l List<Insight> list) {
        this.insights = list;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoMarketReport(title=");
        sb2.append(this.title);
        sb2.append(", insights=");
        sb2.append(this.insights);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<Insight> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Insight) itA.next()).writeToParcel(parcel, flags);
            }
        }
        ButtonAction buttonAction = this.button;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        List<ButtonAction> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((ButtonAction) itA2.next()).writeToParcel(parcel, flags);
        }
    }

    public GeoMarketReport(@l String str, @l List<Insight> list, @l ButtonAction buttonAction, @l List<ButtonAction> list2) {
        this.title = str;
        this.insights = list;
        this.button = buttonAction;
        this.buttons = list2;
    }

    public /* synthetic */ GeoMarketReport(String str, List list, ButtonAction buttonAction, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : buttonAction, (i12 & 8) != 0 ? null : list2);
    }
}
