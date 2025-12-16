package com.avito.android.remote.model.domoteka_report_teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Theme;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DomotekaReportTeaser.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b.\u0010\u0011R\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b/\u0010\u000f¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/domoteka_report_teaser/DomotekaReportTeaser;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/search/Theme;", "_theme", "", "Lcom/avito/android/remote/model/domoteka_report_teaser/Info;", "insights", "Lcom/avito/android/remote/model/domoteka_report_teaser/Action;", "actions", "hint", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Theme;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component2", "()Lcom/avito/android/remote/model/search/Theme;", "component1", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Theme;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/domoteka_report_teaser/DomotekaReportTeaser;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/search/Theme;", "Ljava/util/List;", "getInsights", "getActions", "getHint", "getTheme", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DomotekaReportTeaser implements Parcelable {

    @k
    public static final Parcelable.Creator<DomotekaReportTeaser> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final Theme _theme;

    @c("actions")
    @l
    private final List<Action> actions;

    @c("hint")
    @l
    private final String hint;

    @c("infoList")
    @l
    private final List<Info> insights;

    @c("title")
    @k
    private final String title;

    /* compiled from: DomotekaReportTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DomotekaReportTeaser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DomotekaReportTeaser createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Info.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(Action.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new DomotekaReportTeaser(string, themeValueOf, arrayList, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DomotekaReportTeaser[] newArray(int i12) {
            return new DomotekaReportTeaser[i12];
        }
    }

    public DomotekaReportTeaser(@k String str, @l Theme theme, @l List<Info> list, @l List<Action> list2, @l String str2) {
        this.title = str;
        this._theme = theme;
        this.insights = list;
        this.actions = list2;
        this.hint = str2;
    }

    /* renamed from: component2, reason: from getter */
    private final Theme get_theme() {
        return this._theme;
    }

    public static /* synthetic */ DomotekaReportTeaser copy$default(DomotekaReportTeaser domotekaReportTeaser, String str, Theme theme, List list, List list2, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = domotekaReportTeaser.title;
        }
        if ((i12 & 2) != 0) {
            theme = domotekaReportTeaser._theme;
        }
        Theme theme2 = theme;
        if ((i12 & 4) != 0) {
            list = domotekaReportTeaser.insights;
        }
        List list3 = list;
        if ((i12 & 8) != 0) {
            list2 = domotekaReportTeaser.actions;
        }
        List list4 = list2;
        if ((i12 & 16) != 0) {
            str2 = domotekaReportTeaser.hint;
        }
        return domotekaReportTeaser.copy(str, theme2, list3, list4, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<Info> component3() {
        return this.insights;
    }

    @l
    public final List<Action> component4() {
        return this.actions;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @k
    public final DomotekaReportTeaser copy(@k String title, @l Theme _theme, @l List<Info> insights, @l List<Action> actions, @l String hint) {
        return new DomotekaReportTeaser(title, _theme, insights, actions, hint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomotekaReportTeaser)) {
            return false;
        }
        DomotekaReportTeaser domotekaReportTeaser = (DomotekaReportTeaser) other;
        return L.f(this.title, domotekaReportTeaser.title) && this._theme == domotekaReportTeaser._theme && L.f(this.insights, domotekaReportTeaser.insights) && L.f(this.actions, domotekaReportTeaser.actions) && L.f(this.hint, domotekaReportTeaser.hint);
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final List<Info> getInsights() {
        return this.insights;
    }

    @k
    public final Theme getTheme() {
        Theme theme = this._theme;
        return theme == null ? Theme.AVITO_RE_23 : theme;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Theme theme = this._theme;
        int iHashCode2 = (iHashCode + (theme == null ? 0 : theme.hashCode())) * 31;
        List<Info> list = this.insights;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Action> list2 = this.actions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.hint;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DomotekaReportTeaser(title=");
        sb2.append(this.title);
        sb2.append(", _theme=");
        sb2.append(this._theme);
        sb2.append(", insights=");
        sb2.append(this.insights);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.hint, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Theme theme = this._theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        List<Info> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Info) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Action> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Action) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.hint);
    }
}
