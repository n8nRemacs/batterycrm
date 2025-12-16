package com.avito.android.beduin.common.component.radio_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRadioGroupModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010&J \u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b?\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\b\n\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bC\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010$R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010&R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bH\u0010&¨\u0006I"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/Option;", "Landroid/os/Parcelable;", "", "id", "title", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "secondSubtitle", "", "isEnabled", "Lcom/avito/android/beduin/common/component/radio_group/RadioButtonTitleIcon;", "titleIconButton", "attributedSubtitle", "Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;", "titleBadge", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "Lcom/avito/android/beduin_models/BeduinModel;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/radio_group/RadioButtonTitleIcon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/beduin/common/component/radio_group/RadioButtonTitleIcon;", "component8", "component9", "()Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;", "component10", "()Ljava/util/List;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/radio_group/RadioButtonTitleIcon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/radio_group/Option;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "getSecondSubtitle", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/radio_group/RadioButtonTitleIcon;", "getTitleIconButton", "getAttributedSubtitle", "Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;", "getTitleBadge", "Ljava/util/List;", "getOnSelectActions", "getContent", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Option implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Option> CREATOR = new a();

    @Y61.l
    private final AttributedText attributedSubtitle;

    @Y61.l
    private final AttributedText attributedTitle;

    @Y61.l
    private final List<BeduinModel> content;

    @Y61.l
    private final String id;

    @Y61.l
    private final Boolean isEnabled;

    @Y61.l
    private final List<BeduinAction> onSelectActions;

    @Y61.l
    private final AttributedText secondSubtitle;

    @Y61.l
    private final String subtitle;

    @Y61.l
    private final String title;

    @Y61.l
    private final RadioButtonBadge titleBadge;

    @Y61.l
    private final RadioButtonTitleIcon titleIconButton;

    /* compiled from: BeduinRadioGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Option> {
        @Override // android.os.Parcelable.Creator
        public final Option createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Option.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Option.class.getClassLoader());
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            RadioButtonTitleIcon radioButtonTitleIconCreateFromParcel = parcel.readInt() == 0 ? null : RadioButtonTitleIcon.CREATOR.createFromParcel(parcel);
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(Option.class.getClassLoader());
            RadioButtonBadge radioButtonBadgeCreateFromParcel = parcel.readInt() == 0 ? null : RadioButtonBadge.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList2, iL3, 1);
                }
            }
            return new Option(string, string2, string3, attributedText, attributedText2, boolValueOf, radioButtonTitleIconCreateFromParcel, attributedText3, radioButtonBadgeCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Option[] newArray(int i12) {
            return new Option[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Option(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l Boolean bool, @Y61.l RadioButtonTitleIcon radioButtonTitleIcon, @Y61.l AttributedText attributedText3, @Y61.l RadioButtonBadge radioButtonBadge, @Y61.l List<? extends BeduinAction> list, @Y61.l List<? extends BeduinModel> list2) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.attributedTitle = attributedText;
        this.secondSubtitle = attributedText2;
        this.isEnabled = bool;
        this.titleIconButton = radioButtonTitleIcon;
        this.attributedSubtitle = attributedText3;
        this.titleBadge = radioButtonBadge;
        this.onSelectActions = list;
        this.content = list2;
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<BeduinAction> component10() {
        return this.onSelectActions;
    }

    @Y61.l
    public final List<BeduinModel> component11() {
        return this.content;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getSecondSubtitle() {
        return this.secondSubtitle;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final RadioButtonTitleIcon getTitleIconButton() {
        return this.titleIconButton;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final RadioButtonBadge getTitleBadge() {
        return this.titleBadge;
    }

    @Y61.k
    public final Option copy(@Y61.l String id2, @Y61.l String title, @Y61.l String subtitle, @Y61.l AttributedText attributedTitle, @Y61.l AttributedText secondSubtitle, @Y61.l Boolean isEnabled, @Y61.l RadioButtonTitleIcon titleIconButton, @Y61.l AttributedText attributedSubtitle, @Y61.l RadioButtonBadge titleBadge, @Y61.l List<? extends BeduinAction> onSelectActions, @Y61.l List<? extends BeduinModel> content) {
        return new Option(id2, title, subtitle, attributedTitle, secondSubtitle, isEnabled, titleIconButton, attributedSubtitle, titleBadge, onSelectActions, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Option)) {
            return false;
        }
        Option option = (Option) other;
        return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.subtitle, option.subtitle) && L.f(this.attributedTitle, option.attributedTitle) && L.f(this.secondSubtitle, option.secondSubtitle) && L.f(this.isEnabled, option.isEnabled) && L.f(this.titleIconButton, option.titleIconButton) && L.f(this.attributedSubtitle, option.attributedSubtitle) && L.f(this.titleBadge, option.titleBadge) && L.f(this.onSelectActions, option.onSelectActions) && L.f(this.content, option.content);
    }

    @Y61.l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @Y61.l
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @Y61.l
    public final List<BeduinModel> getContent() {
        return this.content;
    }

    @Y61.l
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<BeduinAction> getOnSelectActions() {
        return this.onSelectActions;
    }

    @Y61.l
    public final AttributedText getSecondSubtitle() {
        return this.secondSubtitle;
    }

    @Y61.l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    public final RadioButtonBadge getTitleBadge() {
        return this.titleBadge;
    }

    @Y61.l
    public final RadioButtonTitleIcon getTitleIconButton() {
        return this.titleIconButton;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.attributedTitle;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.secondSubtitle;
        int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        RadioButtonTitleIcon radioButtonTitleIcon = this.titleIconButton;
        int iHashCode7 = (iHashCode6 + (radioButtonTitleIcon == null ? 0 : radioButtonTitleIcon.hashCode())) * 31;
        AttributedText attributedText3 = this.attributedSubtitle;
        int iHashCode8 = (iHashCode7 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        RadioButtonBadge radioButtonBadge = this.titleBadge;
        int iHashCode9 = (iHashCode8 + (radioButtonBadge == null ? 0 : radioButtonBadge.hashCode())) * 31;
        List<BeduinAction> list = this.onSelectActions;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.content;
        return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Option(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedTitle=");
        sb2.append(this.attributedTitle);
        sb2.append(", secondSubtitle=");
        sb2.append(this.secondSubtitle);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", titleIconButton=");
        sb2.append(this.titleIconButton);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", titleBadge=");
        sb2.append(this.titleBadge);
        sb2.append(", onSelectActions=");
        sb2.append(this.onSelectActions);
        sb2.append(", content=");
        return H.p(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedTitle, flags);
        parcel.writeParcelable(this.secondSubtitle, flags);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        RadioButtonTitleIcon radioButtonTitleIcon = this.titleIconButton;
        if (radioButtonTitleIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radioButtonTitleIcon.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.attributedSubtitle, flags);
        RadioButtonBadge radioButtonBadge = this.titleBadge;
        if (radioButtonBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radioButtonBadge.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onSelectActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinModel> list2 = this.content;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
