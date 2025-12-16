package com.avito.android.remote.model.extended;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.modification.UniversalWidgetFactoidModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetImageWithTextModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetTextModification;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidget.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:)\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/UniversalWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/UniversalWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/UniversalWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/UniversalWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "ChangeVisibilityDialog", "Config", "DeleteSectionDialog", "FactoidCommonConfig", "FactoidConfig", "Field", "FinishEditingDialog", "ImageWithTextConfig", "ImageWithTextFourColumnsConfig", "ImageWithTextFullWidthConfig", "ImageWithTextImgWithTextConfig", "ImageWithTextThreeColumnsConfig", "ImageWithTextTwoColumnsConfig", "OrderedSectionType", "SectionSubtype", "SectionType", "SectionsConfig", "TextBlockConfig", "TextConfig", "TextFullWidthConfig", "UniversalWidgetFactoidItemsCountType", "UniversalWidgetFactoidSection", "UniversalWidgetFactoidSectionBlock", "UniversalWidgetFactoidSectionContent", "UniversalWidgetFactoidType", "UniversalWidgetFieldValue", "UniversalWidgetImageWithTextImageRatio", "UniversalWidgetImageWithTextSection", "UniversalWidgetImageWithTextSectionBlock", "UniversalWidgetImageWithTextSectionContent", "UniversalWidgetImageWithTextType", "UniversalWidgetSectionVisibilityStatus", "UniversalWidgetTextColor", "UniversalWidgetTextPosition", "UniversalWidgetTextPositionImageWithText", "UniversalWidgetTextSection", "UniversalWidgetTextSectionBlock", "UniversalWidgetTextSectionContent", "UniversalWidgetTextTitlePosition", "UniversalWidgetTextType", "UniversalWidgetValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field> fields;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJF\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;", "Landroid/os/Parcelable;", "", "title", "sectionShown", "sectionHidden", "requiredFillingTitle", "requiredFillingDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSectionShown", "getSectionHidden", "getRequiredFillingTitle", "getRequiredFillingDescription", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeVisibilityDialog implements Parcelable {

        @k
        public static final Parcelable.Creator<ChangeVisibilityDialog> CREATOR = new Creator();

        @l
        private final String requiredFillingDescription;

        @l
        private final String requiredFillingTitle;

        @k
        private final String sectionHidden;

        @k
        private final String sectionShown;

        @k
        private final String title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeVisibilityDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ChangeVisibilityDialog createFromParcel(@k Parcel parcel) {
                return new ChangeVisibilityDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ChangeVisibilityDialog[] newArray(int i12) {
                return new ChangeVisibilityDialog[i12];
            }
        }

        public ChangeVisibilityDialog(@k String str, @k String str2, @k String str3, @l String str4, @l String str5) {
            this.title = str;
            this.sectionShown = str2;
            this.sectionHidden = str3;
            this.requiredFillingTitle = str4;
            this.requiredFillingDescription = str5;
        }

        public static /* synthetic */ ChangeVisibilityDialog copy$default(ChangeVisibilityDialog changeVisibilityDialog, String str, String str2, String str3, String str4, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = changeVisibilityDialog.title;
            }
            if ((i12 & 2) != 0) {
                str2 = changeVisibilityDialog.sectionShown;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = changeVisibilityDialog.sectionHidden;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = changeVisibilityDialog.requiredFillingTitle;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                str5 = changeVisibilityDialog.requiredFillingDescription;
            }
            return changeVisibilityDialog.copy(str, str6, str7, str8, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSectionShown() {
            return this.sectionShown;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getSectionHidden() {
            return this.sectionHidden;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getRequiredFillingTitle() {
            return this.requiredFillingTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getRequiredFillingDescription() {
            return this.requiredFillingDescription;
        }

        @k
        public final ChangeVisibilityDialog copy(@k String title, @k String sectionShown, @k String sectionHidden, @l String requiredFillingTitle, @l String requiredFillingDescription) {
            return new ChangeVisibilityDialog(title, sectionShown, sectionHidden, requiredFillingTitle, requiredFillingDescription);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeVisibilityDialog)) {
                return false;
            }
            ChangeVisibilityDialog changeVisibilityDialog = (ChangeVisibilityDialog) other;
            return L.f(this.title, changeVisibilityDialog.title) && L.f(this.sectionShown, changeVisibilityDialog.sectionShown) && L.f(this.sectionHidden, changeVisibilityDialog.sectionHidden) && L.f(this.requiredFillingTitle, changeVisibilityDialog.requiredFillingTitle) && L.f(this.requiredFillingDescription, changeVisibilityDialog.requiredFillingDescription);
        }

        @l
        public final String getRequiredFillingDescription() {
            return this.requiredFillingDescription;
        }

        @l
        public final String getRequiredFillingTitle() {
            return this.requiredFillingTitle;
        }

        @k
        public final String getSectionHidden() {
            return this.sectionHidden;
        }

        @k
        public final String getSectionShown() {
            return this.sectionShown;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(this.title.hashCode() * 31, 31, this.sectionShown), 31, this.sectionHidden);
            String str = this.requiredFillingTitle;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requiredFillingDescription;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeVisibilityDialog(title=");
            sb2.append(this.title);
            sb2.append(", sectionShown=");
            sb2.append(this.sectionShown);
            sb2.append(", sectionHidden=");
            sb2.append(this.sectionHidden);
            sb2.append(", requiredFillingTitle=");
            sb2.append(this.requiredFillingTitle);
            sb2.append(", requiredFillingDescription=");
            return C22026a.c(sb2, this.requiredFillingDescription, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.sectionShown);
            parcel.writeString(this.sectionHidden);
            parcel.writeString(this.requiredFillingTitle);
            parcel.writeString(this.requiredFillingDescription);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001cJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001cJ¶\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001cJ\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b:\u0010\u001eJ \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bG\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bH\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bI\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bL\u0010\u001cR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010*R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010,R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bT\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bU\u0010\u001cR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bV\u0010\u001c¨\u0006W"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$Config;", "Landroid/os/Parcelable;", "", "widgetTitle", "", "sectionsLimit", "sectionsLimitDescription", "createSectionTitle", "saveSectionActionButton", "saveBlockActionButton", "editBlockTitle", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;", "sectionsConfig", "requiredFieldMessage", "", "Lcom/avito/android/remote/model/extended/UniversalWidget$OrderedSectionType;", "addSectionOrder", "Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;", "finishEditingDialog", "Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;", "deleteSectionDialog", "Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;", "changeVisibilityDialog", "editSingleBlockSectionTitle", "editMultiBlockSectionTitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;", "component9", "component10", "()Ljava/util/List;", "component11", "()Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;", "component12", "()Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;", "component13", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;", "component14", "component15", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/UniversalWidget$Config;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetTitle", "I", "getSectionsLimit", "getSectionsLimitDescription", "getCreateSectionTitle", "getSaveSectionActionButton", "getSaveBlockActionButton", "getEditBlockTitle", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;", "getSectionsConfig", "getRequiredFieldMessage", "Ljava/util/List;", "getAddSectionOrder", "Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;", "getFinishEditingDialog", "Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;", "getDeleteSectionDialog", "Lcom/avito/android/remote/model/extended/UniversalWidget$ChangeVisibilityDialog;", "getChangeVisibilityDialog", "getEditSingleBlockSectionTitle", "getEditMultiBlockSectionTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @c("addSectionOrder")
        @k
        private final List<OrderedSectionType> addSectionOrder;

        @c("changeVisibilityDialog")
        @k
        private final ChangeVisibilityDialog changeVisibilityDialog;

        @c("createSectionTitle")
        @k
        private final String createSectionTitle;

        @c("deleteSectionDialog")
        @k
        private final DeleteSectionDialog deleteSectionDialog;

        @c("editBlockTitle")
        @k
        private final String editBlockTitle;

        @c("editMultiBlockSectionTitle")
        @l
        private final String editMultiBlockSectionTitle;

        @c("editSingleBlockSectionTitle")
        @l
        private final String editSingleBlockSectionTitle;

        @c("finishEditingDialog")
        @k
        private final FinishEditingDialog finishEditingDialog;

        @c("requiredFieldMessage")
        @l
        private final String requiredFieldMessage;

        @c("saveBlockActionButton")
        @k
        private final String saveBlockActionButton;

        @c("saveSectionActionButton")
        @k
        private final String saveSectionActionButton;

        @c("sectionsConfig")
        @k
        private final SectionsConfig sectionsConfig;

        @c("sectionsLimit")
        private final int sectionsLimit;

        @c("sectionsLimitDescription")
        @l
        private final String sectionsLimitDescription;

        @c("widgetTitle")
        @l
        private final String widgetTitle;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                SectionsConfig sectionsConfigCreateFromParcel = SectionsConfig.CREATOR.createFromParcel(parcel);
                String string7 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(OrderedSectionType.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Config(string, i12, string2, string3, string4, string5, string6, sectionsConfigCreateFromParcel, string7, arrayList, FinishEditingDialog.CREATOR.createFromParcel(parcel), DeleteSectionDialog.CREATOR.createFromParcel(parcel), ChangeVisibilityDialog.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@l String str, int i12, @l String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k SectionsConfig sectionsConfig, @l String str7, @k List<OrderedSectionType> list, @k FinishEditingDialog finishEditingDialog, @k DeleteSectionDialog deleteSectionDialog, @k ChangeVisibilityDialog changeVisibilityDialog, @l String str8, @l String str9) {
            this.widgetTitle = str;
            this.sectionsLimit = i12;
            this.sectionsLimitDescription = str2;
            this.createSectionTitle = str3;
            this.saveSectionActionButton = str4;
            this.saveBlockActionButton = str5;
            this.editBlockTitle = str6;
            this.sectionsConfig = sectionsConfig;
            this.requiredFieldMessage = str7;
            this.addSectionOrder = list;
            this.finishEditingDialog = finishEditingDialog;
            this.deleteSectionDialog = deleteSectionDialog;
            this.changeVisibilityDialog = changeVisibilityDialog;
            this.editSingleBlockSectionTitle = str8;
            this.editMultiBlockSectionTitle = str9;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getWidgetTitle() {
            return this.widgetTitle;
        }

        @k
        public final List<OrderedSectionType> component10() {
            return this.addSectionOrder;
        }

        @k
        /* renamed from: component11, reason: from getter */
        public final FinishEditingDialog getFinishEditingDialog() {
            return this.finishEditingDialog;
        }

        @k
        /* renamed from: component12, reason: from getter */
        public final DeleteSectionDialog getDeleteSectionDialog() {
            return this.deleteSectionDialog;
        }

        @k
        /* renamed from: component13, reason: from getter */
        public final ChangeVisibilityDialog getChangeVisibilityDialog() {
            return this.changeVisibilityDialog;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final String getEditSingleBlockSectionTitle() {
            return this.editSingleBlockSectionTitle;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final String getEditMultiBlockSectionTitle() {
            return this.editMultiBlockSectionTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSectionsLimit() {
            return this.sectionsLimit;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSectionsLimitDescription() {
            return this.sectionsLimitDescription;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getCreateSectionTitle() {
            return this.createSectionTitle;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getSaveSectionActionButton() {
            return this.saveSectionActionButton;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getSaveBlockActionButton() {
            return this.saveBlockActionButton;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getEditBlockTitle() {
            return this.editBlockTitle;
        }

        @k
        /* renamed from: component8, reason: from getter */
        public final SectionsConfig getSectionsConfig() {
            return this.sectionsConfig;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getRequiredFieldMessage() {
            return this.requiredFieldMessage;
        }

        @k
        public final Config copy(@l String widgetTitle, int sectionsLimit, @l String sectionsLimitDescription, @k String createSectionTitle, @k String saveSectionActionButton, @k String saveBlockActionButton, @k String editBlockTitle, @k SectionsConfig sectionsConfig, @l String requiredFieldMessage, @k List<OrderedSectionType> addSectionOrder, @k FinishEditingDialog finishEditingDialog, @k DeleteSectionDialog deleteSectionDialog, @k ChangeVisibilityDialog changeVisibilityDialog, @l String editSingleBlockSectionTitle, @l String editMultiBlockSectionTitle) {
            return new Config(widgetTitle, sectionsLimit, sectionsLimitDescription, createSectionTitle, saveSectionActionButton, saveBlockActionButton, editBlockTitle, sectionsConfig, requiredFieldMessage, addSectionOrder, finishEditingDialog, deleteSectionDialog, changeVisibilityDialog, editSingleBlockSectionTitle, editMultiBlockSectionTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.widgetTitle, config.widgetTitle) && this.sectionsLimit == config.sectionsLimit && L.f(this.sectionsLimitDescription, config.sectionsLimitDescription) && L.f(this.createSectionTitle, config.createSectionTitle) && L.f(this.saveSectionActionButton, config.saveSectionActionButton) && L.f(this.saveBlockActionButton, config.saveBlockActionButton) && L.f(this.editBlockTitle, config.editBlockTitle) && L.f(this.sectionsConfig, config.sectionsConfig) && L.f(this.requiredFieldMessage, config.requiredFieldMessage) && L.f(this.addSectionOrder, config.addSectionOrder) && L.f(this.finishEditingDialog, config.finishEditingDialog) && L.f(this.deleteSectionDialog, config.deleteSectionDialog) && L.f(this.changeVisibilityDialog, config.changeVisibilityDialog) && L.f(this.editSingleBlockSectionTitle, config.editSingleBlockSectionTitle) && L.f(this.editMultiBlockSectionTitle, config.editMultiBlockSectionTitle);
        }

        @k
        public final List<OrderedSectionType> getAddSectionOrder() {
            return this.addSectionOrder;
        }

        @k
        public final ChangeVisibilityDialog getChangeVisibilityDialog() {
            return this.changeVisibilityDialog;
        }

        @k
        public final String getCreateSectionTitle() {
            return this.createSectionTitle;
        }

        @k
        public final DeleteSectionDialog getDeleteSectionDialog() {
            return this.deleteSectionDialog;
        }

        @k
        public final String getEditBlockTitle() {
            return this.editBlockTitle;
        }

        @l
        public final String getEditMultiBlockSectionTitle() {
            return this.editMultiBlockSectionTitle;
        }

        @l
        public final String getEditSingleBlockSectionTitle() {
            return this.editSingleBlockSectionTitle;
        }

        @k
        public final FinishEditingDialog getFinishEditingDialog() {
            return this.finishEditingDialog;
        }

        @l
        public final String getRequiredFieldMessage() {
            return this.requiredFieldMessage;
        }

        @k
        public final String getSaveBlockActionButton() {
            return this.saveBlockActionButton;
        }

        @k
        public final String getSaveSectionActionButton() {
            return this.saveSectionActionButton;
        }

        @k
        public final SectionsConfig getSectionsConfig() {
            return this.sectionsConfig;
        }

        public final int getSectionsLimit() {
            return this.sectionsLimit;
        }

        @l
        public final String getSectionsLimitDescription() {
            return this.sectionsLimitDescription;
        }

        @l
        public final String getWidgetTitle() {
            return this.widgetTitle;
        }

        public int hashCode() {
            String str = this.widgetTitle;
            int iE2 = r.e(this.sectionsLimit, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.sectionsLimitDescription;
            int iHashCode = (this.sectionsConfig.hashCode() + H.d(H.d(H.d(H.d((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.createSectionTitle), 31, this.saveSectionActionButton), 31, this.saveBlockActionButton), 31, this.editBlockTitle)) * 31;
            String str3 = this.requiredFieldMessage;
            int iHashCode2 = (this.changeVisibilityDialog.hashCode() + ((this.deleteSectionDialog.hashCode() + ((this.finishEditingDialog.hashCode() + H.e((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.addSectionOrder)) * 31)) * 31)) * 31;
            String str4 = this.editSingleBlockSectionTitle;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.editMultiBlockSectionTitle;
            return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(widgetTitle=");
            sb2.append(this.widgetTitle);
            sb2.append(", sectionsLimit=");
            sb2.append(this.sectionsLimit);
            sb2.append(", sectionsLimitDescription=");
            sb2.append(this.sectionsLimitDescription);
            sb2.append(", createSectionTitle=");
            sb2.append(this.createSectionTitle);
            sb2.append(", saveSectionActionButton=");
            sb2.append(this.saveSectionActionButton);
            sb2.append(", saveBlockActionButton=");
            sb2.append(this.saveBlockActionButton);
            sb2.append(", editBlockTitle=");
            sb2.append(this.editBlockTitle);
            sb2.append(", sectionsConfig=");
            sb2.append(this.sectionsConfig);
            sb2.append(", requiredFieldMessage=");
            sb2.append(this.requiredFieldMessage);
            sb2.append(", addSectionOrder=");
            sb2.append(this.addSectionOrder);
            sb2.append(", finishEditingDialog=");
            sb2.append(this.finishEditingDialog);
            sb2.append(", deleteSectionDialog=");
            sb2.append(this.deleteSectionDialog);
            sb2.append(", changeVisibilityDialog=");
            sb2.append(this.changeVisibilityDialog);
            sb2.append(", editSingleBlockSectionTitle=");
            sb2.append(this.editSingleBlockSectionTitle);
            sb2.append(", editMultiBlockSectionTitle=");
            return C22026a.c(sb2, this.editMultiBlockSectionTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.widgetTitle);
            parcel.writeInt(this.sectionsLimit);
            parcel.writeString(this.sectionsLimitDescription);
            parcel.writeString(this.createSectionTitle);
            parcel.writeString(this.saveSectionActionButton);
            parcel.writeString(this.saveBlockActionButton);
            parcel.writeString(this.editBlockTitle);
            this.sectionsConfig.writeToParcel(parcel, flags);
            parcel.writeString(this.requiredFieldMessage);
            Iterator itJ = C0.j(this.addSectionOrder, parcel);
            while (itJ.hasNext()) {
                ((OrderedSectionType) itJ.next()).writeToParcel(parcel, flags);
            }
            this.finishEditingDialog.writeToParcel(parcel, flags);
            this.deleteSectionDialog.writeToParcel(parcel, flags);
            this.changeVisibilityDialog.writeToParcel(parcel, flags);
            parcel.writeString(this.editSingleBlockSectionTitle);
            parcel.writeString(this.editMultiBlockSectionTitle);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;", "Landroid/os/Parcelable;", "", "title", "description", "confirmButton", "dismissButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/UniversalWidget$DeleteSectionDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getConfirmButton", "getDismissButton", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteSectionDialog implements Parcelable {

        @k
        public static final Parcelable.Creator<DeleteSectionDialog> CREATOR = new Creator();

        @k
        private final String confirmButton;

        @k
        private final String description;

        @k
        private final String dismissButton;

        @k
        private final String title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeleteSectionDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeleteSectionDialog createFromParcel(@k Parcel parcel) {
                return new DeleteSectionDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeleteSectionDialog[] newArray(int i12) {
                return new DeleteSectionDialog[i12];
            }
        }

        public DeleteSectionDialog(@k String str, @k String str2, @k String str3, @k String str4) {
            this.title = str;
            this.description = str2;
            this.confirmButton = str3;
            this.dismissButton = str4;
        }

        public static /* synthetic */ DeleteSectionDialog copy$default(DeleteSectionDialog deleteSectionDialog, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = deleteSectionDialog.title;
            }
            if ((i12 & 2) != 0) {
                str2 = deleteSectionDialog.description;
            }
            if ((i12 & 4) != 0) {
                str3 = deleteSectionDialog.confirmButton;
            }
            if ((i12 & 8) != 0) {
                str4 = deleteSectionDialog.dismissButton;
            }
            return deleteSectionDialog.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getConfirmButton() {
            return this.confirmButton;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDismissButton() {
            return this.dismissButton;
        }

        @k
        public final DeleteSectionDialog copy(@k String title, @k String description, @k String confirmButton, @k String dismissButton) {
            return new DeleteSectionDialog(title, description, confirmButton, dismissButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteSectionDialog)) {
                return false;
            }
            DeleteSectionDialog deleteSectionDialog = (DeleteSectionDialog) other;
            return L.f(this.title, deleteSectionDialog.title) && L.f(this.description, deleteSectionDialog.description) && L.f(this.confirmButton, deleteSectionDialog.confirmButton) && L.f(this.dismissButton, deleteSectionDialog.dismissButton);
        }

        @k
        public final String getConfirmButton() {
            return this.confirmButton;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getDismissButton() {
            return this.dismissButton;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.dismissButton.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.confirmButton);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteSectionDialog(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", confirmButton=");
            sb2.append(this.confirmButton);
            sb2.append(", dismissButton=");
            return C22026a.c(sb2, this.dismissButton, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.confirmButton);
            parcel.writeString(this.dismissButton);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J®\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0018J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b4\u0010.J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bF\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010%R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bJ\u0010%R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bK\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010)¨\u0006N"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "threeItemsCountName", "fourItemsCountName", "sectionTitleHint", "", "sectionTitleLimit", "sectionTitleMaxLines", "backgroundColorHint", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockMainTitle", "blockSubtitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getThreeItemsCountName", "getFourItemsCountName", "getSectionTitleHint", "Ljava/lang/Integer;", "getSectionTitleLimit", "getSectionTitleMaxLines", "getBackgroundColorHint", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockMainTitle", "getBlockSubtitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FactoidCommonConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<FactoidCommonConfig> CREATOR = new Creator();

        @c("backgroundColorHint")
        @l
        private final String backgroundColorHint;

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockMainTitle")
        @k
        private final TextBlockConfig blockMainTitle;

        @c("blockSubtitle")
        @k
        private final TextBlockConfig blockSubtitle;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetFactoidModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("fourItemsCountName")
        @l
        private final String fourItemsCountName;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("sectionTitleHint")
        @k
        private final String sectionTitleHint;

        @c("sectionTitleLimit")
        @l
        private final Integer sectionTitleLimit;

        @c("sectionTitleMaxLines")
        @l
        private final Integer sectionTitleMaxLines;

        @c("threeItemsCountName")
        @l
        private final String threeItemsCountName;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FactoidCommonConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FactoidCommonConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(FactoidCommonConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(FactoidCommonConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(FactoidCommonConfig.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string5 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new FactoidCommonConfig(string, image, image2, image3, string2, string3, string4, numValueOf, numValueOf2, string5, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetFactoidModification.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FactoidCommonConfig[] newArray(int i12) {
                return new FactoidCommonConfig[i12];
            }
        }

        public FactoidCommonConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @l String str2, @l String str3, @k String str4, @l Integer num, @l Integer num2, @l String str5, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @k TextBlockConfig textBlockConfig3, @l UniversalWidgetFactoidModification universalWidgetFactoidModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.threeItemsCountName = str2;
            this.fourItemsCountName = str3;
            this.sectionTitleHint = str4;
            this.sectionTitleLimit = num;
            this.sectionTitleMaxLines = num2;
            this.backgroundColorHint = str5;
            this.blockMainTitle = textBlockConfig;
            this.blockSubtitle = textBlockConfig2;
            this.blockDescription = textBlockConfig3;
            this.defaultValue = universalWidgetFactoidModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getBackgroundColorHint() {
            return this.backgroundColorHint;
        }

        @k
        /* renamed from: component11, reason: from getter */
        public final TextBlockConfig getBlockMainTitle() {
            return this.blockMainTitle;
        }

        @k
        /* renamed from: component12, reason: from getter */
        public final TextBlockConfig getBlockSubtitle() {
            return this.blockSubtitle;
        }

        @k
        /* renamed from: component13, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final UniversalWidgetFactoidModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getThreeItemsCountName() {
            return this.threeItemsCountName;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getFourItemsCountName() {
            return this.fourItemsCountName;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @k
        public final FactoidCommonConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @l String threeItemsCountName, @l String fourItemsCountName, @k String sectionTitleHint, @l Integer sectionTitleLimit, @l Integer sectionTitleMaxLines, @l String backgroundColorHint, @k TextBlockConfig blockMainTitle, @k TextBlockConfig blockSubtitle, @k TextBlockConfig blockDescription, @l UniversalWidgetFactoidModification defaultValue) {
            return new FactoidCommonConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, threeItemsCountName, fourItemsCountName, sectionTitleHint, sectionTitleLimit, sectionTitleMaxLines, backgroundColorHint, blockMainTitle, blockSubtitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FactoidCommonConfig)) {
                return false;
            }
            FactoidCommonConfig factoidCommonConfig = (FactoidCommonConfig) other;
            return L.f(this.name, factoidCommonConfig.name) && L.f(this.desktopPreviewImage, factoidCommonConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, factoidCommonConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, factoidCommonConfig.darkMobilePreviewImage) && L.f(this.threeItemsCountName, factoidCommonConfig.threeItemsCountName) && L.f(this.fourItemsCountName, factoidCommonConfig.fourItemsCountName) && L.f(this.sectionTitleHint, factoidCommonConfig.sectionTitleHint) && L.f(this.sectionTitleLimit, factoidCommonConfig.sectionTitleLimit) && L.f(this.sectionTitleMaxLines, factoidCommonConfig.sectionTitleMaxLines) && L.f(this.backgroundColorHint, factoidCommonConfig.backgroundColorHint) && L.f(this.blockMainTitle, factoidCommonConfig.blockMainTitle) && L.f(this.blockSubtitle, factoidCommonConfig.blockSubtitle) && L.f(this.blockDescription, factoidCommonConfig.blockDescription) && L.f(this.defaultValue, factoidCommonConfig.defaultValue);
        }

        @l
        public final String getBackgroundColorHint() {
            return this.backgroundColorHint;
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @k
        public final TextBlockConfig getBlockMainTitle() {
            return this.blockMainTitle;
        }

        @k
        public final TextBlockConfig getBlockSubtitle() {
            return this.blockSubtitle;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetFactoidModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final String getFourItemsCountName() {
            return this.fourItemsCountName;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @l
        public final String getThreeItemsCountName() {
            return this.threeItemsCountName;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iHashCode4 = (iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31;
            String str = this.threeItemsCountName;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fourItemsCountName;
            int iD2 = H.d((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            int iHashCode6 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sectionTitleMaxLines;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.backgroundColorHint;
            int iHashCode8 = (this.blockDescription.hashCode() + ((this.blockSubtitle.hashCode() + ((this.blockMainTitle.hashCode() + ((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31)) * 31;
            UniversalWidgetFactoidModification universalWidgetFactoidModification = this.defaultValue;
            return iHashCode8 + (universalWidgetFactoidModification != null ? universalWidgetFactoidModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "FactoidCommonConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", threeItemsCountName=" + this.threeItemsCountName + ", fourItemsCountName=" + this.fourItemsCountName + ", sectionTitleHint=" + this.sectionTitleHint + ", sectionTitleLimit=" + this.sectionTitleLimit + ", sectionTitleMaxLines=" + this.sectionTitleMaxLines + ", backgroundColorHint=" + this.backgroundColorHint + ", blockMainTitle=" + this.blockMainTitle + ", blockSubtitle=" + this.blockSubtitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.threeItemsCountName);
            parcel.writeString(this.fourItemsCountName);
            parcel.writeString(this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.sectionTitleMaxLines;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeString(this.backgroundColorHint);
            this.blockMainTitle.writeToParcel(parcel, flags);
            this.blockSubtitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetFactoidModification universalWidgetFactoidModification = this.defaultValue;
            if (universalWidgetFactoidModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetFactoidModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;", "commonFactoid", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;)Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidCommonConfig;", "getCommonFactoid", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FactoidConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<FactoidConfig> CREATOR = new Creator();

        @c("commonFactoid")
        @k
        private final FactoidCommonConfig commonFactoid;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FactoidConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FactoidConfig createFromParcel(@k Parcel parcel) {
                return new FactoidConfig(FactoidCommonConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FactoidConfig[] newArray(int i12) {
                return new FactoidConfig[i12];
            }
        }

        public FactoidConfig(@k FactoidCommonConfig factoidCommonConfig) {
            this.commonFactoid = factoidCommonConfig;
        }

        public static /* synthetic */ FactoidConfig copy$default(FactoidConfig factoidConfig, FactoidCommonConfig factoidCommonConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                factoidCommonConfig = factoidConfig.commonFactoid;
            }
            return factoidConfig.copy(factoidCommonConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final FactoidCommonConfig getCommonFactoid() {
            return this.commonFactoid;
        }

        @k
        public final FactoidConfig copy(@k FactoidCommonConfig commonFactoid) {
            return new FactoidConfig(commonFactoid);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FactoidConfig) && L.f(this.commonFactoid, ((FactoidConfig) other).commonFactoid);
        }

        @k
        public final FactoidCommonConfig getCommonFactoid() {
            return this.commonFactoid;
        }

        public int hashCode() {
            return this.commonFactoid.hashCode();
        }

        @k
        public String toString() {
            return "FactoidConfig(commonFactoid=" + this.commonFactoid + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.commonFactoid.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<UniversalWidgetFieldValue> values;

        public Field(@k String str, @l List<UniversalWidgetFieldValue> list) {
            this.name = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field copy$default(Field field, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = field.name;
            }
            if ((i12 & 2) != 0) {
                list = field.values;
            }
            return field.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final List<UniversalWidgetFieldValue> component2() {
            return this.values;
        }

        @k
        public final Field copy(@k String name, @l List<UniversalWidgetFieldValue> values) {
            return new Field(name, values);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return L.f(this.name, field.name) && L.f(this.values, field.values);
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final List<UniversalWidgetFieldValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            List<UniversalWidgetFieldValue> list = this.values;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(name=");
            sb2.append(this.name);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;", "Landroid/os/Parcelable;", "", "title", "description", "saveButton", "dontSaveButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/UniversalWidget$FinishEditingDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getSaveButton", "getDontSaveButton", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishEditingDialog implements Parcelable {

        @k
        public static final Parcelable.Creator<FinishEditingDialog> CREATOR = new Creator();

        @k
        private final String description;

        @k
        private final String dontSaveButton;

        @k
        private final String saveButton;

        @k
        private final String title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FinishEditingDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FinishEditingDialog createFromParcel(@k Parcel parcel) {
                return new FinishEditingDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FinishEditingDialog[] newArray(int i12) {
                return new FinishEditingDialog[i12];
            }
        }

        public FinishEditingDialog(@k String str, @k String str2, @k String str3, @k String str4) {
            this.title = str;
            this.description = str2;
            this.saveButton = str3;
            this.dontSaveButton = str4;
        }

        public static /* synthetic */ FinishEditingDialog copy$default(FinishEditingDialog finishEditingDialog, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = finishEditingDialog.title;
            }
            if ((i12 & 2) != 0) {
                str2 = finishEditingDialog.description;
            }
            if ((i12 & 4) != 0) {
                str3 = finishEditingDialog.saveButton;
            }
            if ((i12 & 8) != 0) {
                str4 = finishEditingDialog.dontSaveButton;
            }
            return finishEditingDialog.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getSaveButton() {
            return this.saveButton;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDontSaveButton() {
            return this.dontSaveButton;
        }

        @k
        public final FinishEditingDialog copy(@k String title, @k String description, @k String saveButton, @k String dontSaveButton) {
            return new FinishEditingDialog(title, description, saveButton, dontSaveButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishEditingDialog)) {
                return false;
            }
            FinishEditingDialog finishEditingDialog = (FinishEditingDialog) other;
            return L.f(this.title, finishEditingDialog.title) && L.f(this.description, finishEditingDialog.description) && L.f(this.saveButton, finishEditingDialog.saveButton) && L.f(this.dontSaveButton, finishEditingDialog.dontSaveButton);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getDontSaveButton() {
            return this.dontSaveButton;
        }

        @k
        public final String getSaveButton() {
            return this.saveButton;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.dontSaveButton.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.saveButton);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FinishEditingDialog(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", saveButton=");
            sb2.append(this.saveButton);
            sb2.append(", dontSaveButton=");
            return C22026a.c(sb2, this.dontSaveButton, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.saveButton);
            parcel.writeString(this.dontSaveButton);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0017¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;", "fullWidth", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;", "twoColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;", "threeColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;", "fourColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;", "imgWithText", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;", "component2", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;", "component3", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;", "component4", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;", "component5", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;", "getFullWidth", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;", "getTwoColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;", "getThreeColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;", "getFourColumns", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;", "getImgWithText", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextConfig> CREATOR = new Creator();

        @c("fourColumns")
        @k
        private final ImageWithTextFourColumnsConfig fourColumns;

        @c("fullWidth")
        @k
        private final ImageWithTextFullWidthConfig fullWidth;

        @c("imgWithText")
        @k
        private final ImageWithTextImgWithTextConfig imgWithText;

        @c("threeColumns")
        @k
        private final ImageWithTextThreeColumnsConfig threeColumns;

        @c("twoColumns")
        @k
        private final ImageWithTextTwoColumnsConfig twoColumns;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextConfig createFromParcel(@k Parcel parcel) {
                return new ImageWithTextConfig(ImageWithTextFullWidthConfig.CREATOR.createFromParcel(parcel), ImageWithTextTwoColumnsConfig.CREATOR.createFromParcel(parcel), ImageWithTextThreeColumnsConfig.CREATOR.createFromParcel(parcel), ImageWithTextFourColumnsConfig.CREATOR.createFromParcel(parcel), ImageWithTextImgWithTextConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextConfig[] newArray(int i12) {
                return new ImageWithTextConfig[i12];
            }
        }

        public ImageWithTextConfig(@k ImageWithTextFullWidthConfig imageWithTextFullWidthConfig, @k ImageWithTextTwoColumnsConfig imageWithTextTwoColumnsConfig, @k ImageWithTextThreeColumnsConfig imageWithTextThreeColumnsConfig, @k ImageWithTextFourColumnsConfig imageWithTextFourColumnsConfig, @k ImageWithTextImgWithTextConfig imageWithTextImgWithTextConfig) {
            this.fullWidth = imageWithTextFullWidthConfig;
            this.twoColumns = imageWithTextTwoColumnsConfig;
            this.threeColumns = imageWithTextThreeColumnsConfig;
            this.fourColumns = imageWithTextFourColumnsConfig;
            this.imgWithText = imageWithTextImgWithTextConfig;
        }

        public static /* synthetic */ ImageWithTextConfig copy$default(ImageWithTextConfig imageWithTextConfig, ImageWithTextFullWidthConfig imageWithTextFullWidthConfig, ImageWithTextTwoColumnsConfig imageWithTextTwoColumnsConfig, ImageWithTextThreeColumnsConfig imageWithTextThreeColumnsConfig, ImageWithTextFourColumnsConfig imageWithTextFourColumnsConfig, ImageWithTextImgWithTextConfig imageWithTextImgWithTextConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                imageWithTextFullWidthConfig = imageWithTextConfig.fullWidth;
            }
            if ((i12 & 2) != 0) {
                imageWithTextTwoColumnsConfig = imageWithTextConfig.twoColumns;
            }
            ImageWithTextTwoColumnsConfig imageWithTextTwoColumnsConfig2 = imageWithTextTwoColumnsConfig;
            if ((i12 & 4) != 0) {
                imageWithTextThreeColumnsConfig = imageWithTextConfig.threeColumns;
            }
            ImageWithTextThreeColumnsConfig imageWithTextThreeColumnsConfig2 = imageWithTextThreeColumnsConfig;
            if ((i12 & 8) != 0) {
                imageWithTextFourColumnsConfig = imageWithTextConfig.fourColumns;
            }
            ImageWithTextFourColumnsConfig imageWithTextFourColumnsConfig2 = imageWithTextFourColumnsConfig;
            if ((i12 & 16) != 0) {
                imageWithTextImgWithTextConfig = imageWithTextConfig.imgWithText;
            }
            return imageWithTextConfig.copy(imageWithTextFullWidthConfig, imageWithTextTwoColumnsConfig2, imageWithTextThreeColumnsConfig2, imageWithTextFourColumnsConfig2, imageWithTextImgWithTextConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final ImageWithTextFullWidthConfig getFullWidth() {
            return this.fullWidth;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ImageWithTextTwoColumnsConfig getTwoColumns() {
            return this.twoColumns;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final ImageWithTextThreeColumnsConfig getThreeColumns() {
            return this.threeColumns;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final ImageWithTextFourColumnsConfig getFourColumns() {
            return this.fourColumns;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final ImageWithTextImgWithTextConfig getImgWithText() {
            return this.imgWithText;
        }

        @k
        public final ImageWithTextConfig copy(@k ImageWithTextFullWidthConfig fullWidth, @k ImageWithTextTwoColumnsConfig twoColumns, @k ImageWithTextThreeColumnsConfig threeColumns, @k ImageWithTextFourColumnsConfig fourColumns, @k ImageWithTextImgWithTextConfig imgWithText) {
            return new ImageWithTextConfig(fullWidth, twoColumns, threeColumns, fourColumns, imgWithText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextConfig)) {
                return false;
            }
            ImageWithTextConfig imageWithTextConfig = (ImageWithTextConfig) other;
            return L.f(this.fullWidth, imageWithTextConfig.fullWidth) && L.f(this.twoColumns, imageWithTextConfig.twoColumns) && L.f(this.threeColumns, imageWithTextConfig.threeColumns) && L.f(this.fourColumns, imageWithTextConfig.fourColumns) && L.f(this.imgWithText, imageWithTextConfig.imgWithText);
        }

        @k
        public final ImageWithTextFourColumnsConfig getFourColumns() {
            return this.fourColumns;
        }

        @k
        public final ImageWithTextFullWidthConfig getFullWidth() {
            return this.fullWidth;
        }

        @k
        public final ImageWithTextImgWithTextConfig getImgWithText() {
            return this.imgWithText;
        }

        @k
        public final ImageWithTextThreeColumnsConfig getThreeColumns() {
            return this.threeColumns;
        }

        @k
        public final ImageWithTextTwoColumnsConfig getTwoColumns() {
            return this.twoColumns;
        }

        public int hashCode() {
            return this.imgWithText.hashCode() + ((this.fourColumns.hashCode() + ((this.threeColumns.hashCode() + ((this.twoColumns.hashCode() + (this.fullWidth.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public String toString() {
            return "ImageWithTextConfig(fullWidth=" + this.fullWidth + ", twoColumns=" + this.twoColumns + ", threeColumns=" + this.threeColumns + ", fourColumns=" + this.fourColumns + ", imgWithText=" + this.imgWithText + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.fullWidth.writeToParcel(parcel, flags);
            this.twoColumns.writeToParcel(parcel, flags);
            this.threeColumns.writeToParcel(parcel, flags);
            this.fourColumns.writeToParcel(parcel, flags);
            this.imgWithText.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J¼\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b6\u00100J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bB\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bC\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bG\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bH\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bI\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bJ\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bK\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010(R\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bN\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010+¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "sectionTitleHint", "", "sectionTitleLimit", "sectionTitleMaxLines", "blockImageTitle", "changeTextColor", "blockImageSizeText11", "blockImageSizeText43", "blockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockTitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component14", "component15", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFourColumnsConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getSectionTitleHint", "Ljava/lang/Integer;", "getSectionTitleLimit", "getSectionTitleMaxLines", "getBlockImageTitle", "getChangeTextColor", "getBlockImageSizeText11", "getBlockImageSizeText43", "getBlockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockTitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextFourColumnsConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextFourColumnsConfig> CREATOR = new Creator();

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockImageSizeText_1_1")
        @l
        private final String blockImageSizeText11;

        @c("blockImageSizeText_3_4")
        @l
        private final String blockImageSizeText34;

        @c("blockImageSizeText_4_3")
        @l
        private final String blockImageSizeText43;

        @c("blockImageTitle")
        @l
        private final String blockImageTitle;

        @c("blockTitle")
        @k
        private final TextBlockConfig blockTitle;

        @c("changeTextColor")
        @l
        private final String changeTextColor;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetImageWithTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("sectionTitleHint")
        @k
        private final String sectionTitleHint;

        @c("sectionTitleLimit")
        @l
        private final Integer sectionTitleLimit;

        @c("sectionTitleMaxLines")
        @l
        private final Integer sectionTitleMaxLines;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextFourColumnsConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextFourColumnsConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(ImageWithTextFourColumnsConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(ImageWithTextFourColumnsConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(ImageWithTextFourColumnsConfig.class.getClassLoader());
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new ImageWithTextFourColumnsConfig(string, image, image2, image3, string2, numValueOf, numValueOf2, string3, string4, string5, string6, string7, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetImageWithTextModification.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextFourColumnsConfig[] newArray(int i12) {
                return new ImageWithTextFourColumnsConfig[i12];
            }
        }

        public ImageWithTextFourColumnsConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @l Integer num, @l Integer num2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.sectionTitleHint = str2;
            this.sectionTitleLimit = num;
            this.sectionTitleMaxLines = num2;
            this.blockImageTitle = str3;
            this.changeTextColor = str4;
            this.blockImageSizeText11 = str5;
            this.blockImageSizeText43 = str6;
            this.blockImageSizeText34 = str7;
            this.blockTitle = textBlockConfig;
            this.blockDescription = textBlockConfig2;
            this.defaultValue = universalWidgetImageWithTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @k
        /* renamed from: component13, reason: from getter */
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @k
        /* renamed from: component14, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @k
        public final ImageWithTextFourColumnsConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String sectionTitleHint, @l Integer sectionTitleLimit, @l Integer sectionTitleMaxLines, @l String blockImageTitle, @l String changeTextColor, @l String blockImageSizeText11, @l String blockImageSizeText43, @l String blockImageSizeText34, @k TextBlockConfig blockTitle, @k TextBlockConfig blockDescription, @l UniversalWidgetImageWithTextModification defaultValue) {
            return new ImageWithTextFourColumnsConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, sectionTitleHint, sectionTitleLimit, sectionTitleMaxLines, blockImageTitle, changeTextColor, blockImageSizeText11, blockImageSizeText43, blockImageSizeText34, blockTitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextFourColumnsConfig)) {
                return false;
            }
            ImageWithTextFourColumnsConfig imageWithTextFourColumnsConfig = (ImageWithTextFourColumnsConfig) other;
            return L.f(this.name, imageWithTextFourColumnsConfig.name) && L.f(this.desktopPreviewImage, imageWithTextFourColumnsConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, imageWithTextFourColumnsConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, imageWithTextFourColumnsConfig.darkMobilePreviewImage) && L.f(this.sectionTitleHint, imageWithTextFourColumnsConfig.sectionTitleHint) && L.f(this.sectionTitleLimit, imageWithTextFourColumnsConfig.sectionTitleLimit) && L.f(this.sectionTitleMaxLines, imageWithTextFourColumnsConfig.sectionTitleMaxLines) && L.f(this.blockImageTitle, imageWithTextFourColumnsConfig.blockImageTitle) && L.f(this.changeTextColor, imageWithTextFourColumnsConfig.changeTextColor) && L.f(this.blockImageSizeText11, imageWithTextFourColumnsConfig.blockImageSizeText11) && L.f(this.blockImageSizeText43, imageWithTextFourColumnsConfig.blockImageSizeText43) && L.f(this.blockImageSizeText34, imageWithTextFourColumnsConfig.blockImageSizeText34) && L.f(this.blockTitle, imageWithTextFourColumnsConfig.blockTitle) && L.f(this.blockDescription, imageWithTextFourColumnsConfig.blockDescription) && L.f(this.defaultValue, imageWithTextFourColumnsConfig.defaultValue);
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @l
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @k
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @l
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iD2 = H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            int iHashCode4 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sectionTitleMaxLines;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.blockImageTitle;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.changeTextColor;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.blockImageSizeText11;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.blockImageSizeText43;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.blockImageSizeText34;
            int iHashCode10 = (this.blockDescription.hashCode() + ((this.blockTitle.hashCode() + ((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            return iHashCode10 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ImageWithTextFourColumnsConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", sectionTitleHint=" + this.sectionTitleHint + ", sectionTitleLimit=" + this.sectionTitleLimit + ", sectionTitleMaxLines=" + this.sectionTitleMaxLines + ", blockImageTitle=" + this.blockImageTitle + ", changeTextColor=" + this.changeTextColor + ", blockImageSizeText11=" + this.blockImageSizeText11 + ", blockImageSizeText43=" + this.blockImageSizeText43 + ", blockImageSizeText34=" + this.blockImageSizeText34 + ", blockTitle=" + this.blockTitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.sectionTitleMaxLines;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeString(this.blockImageTitle);
            parcel.writeString(this.changeTextColor);
            parcel.writeString(this.blockImageSizeText11);
            parcel.writeString(this.blockImageSizeText43);
            parcel.writeString(this.blockImageSizeText34);
            this.blockTitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            if (universalWidgetImageWithTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetImageWithTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b8\u00102J \u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bC\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bD\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bE\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bG\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bJ\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bK\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bL\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bM\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bN\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010*R\u001a\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bQ\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010-¨\u0006T"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "sectionTitleHint", "textPositionIn", "textPositionOut", "", "sectionTitleLimit", "sectionTitleMaxLines", "blockImagesTitle", "changeTextColor", "blockDesktopImageSizeText", "blockMobileImageSizeText", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockTitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component15", "component16", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextFullWidthConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getSectionTitleHint", "getTextPositionIn", "getTextPositionOut", "Ljava/lang/Integer;", "getSectionTitleLimit", "getSectionTitleMaxLines", "getBlockImagesTitle", "getChangeTextColor", "getBlockDesktopImageSizeText", "getBlockMobileImageSizeText", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockTitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextFullWidthConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextFullWidthConfig> CREATOR = new Creator();

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockDesktopImageSizeText")
        @l
        private final String blockDesktopImageSizeText;

        @c("blockImagesTitle")
        @l
        private final String blockImagesTitle;

        @c("blockMobileImageSizeText")
        @l
        private final String blockMobileImageSizeText;

        @c("blockTitle")
        @k
        private final TextBlockConfig blockTitle;

        @c("changeTextColor")
        @l
        private final String changeTextColor;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetImageWithTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("sectionTitleHint")
        @k
        private final String sectionTitleHint;

        @c("sectionTitleLimit")
        @l
        private final Integer sectionTitleLimit;

        @c("sectionTitleMaxLines")
        @l
        private final Integer sectionTitleMaxLines;

        @c("textPositionIn")
        @k
        private final String textPositionIn;

        @c("textPositionOut")
        @k
        private final String textPositionOut;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextFullWidthConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextFullWidthConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(ImageWithTextFullWidthConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(ImageWithTextFullWidthConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(ImageWithTextFullWidthConfig.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new ImageWithTextFullWidthConfig(string, image, image2, image3, string2, string3, string4, numValueOf, numValueOf2, string5, string6, string7, string8, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetImageWithTextModification.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextFullWidthConfig[] newArray(int i12) {
                return new ImageWithTextFullWidthConfig[i12];
            }
        }

        public ImageWithTextFullWidthConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @k String str3, @k String str4, @l Integer num, @l Integer num2, @l String str5, @l String str6, @l String str7, @l String str8, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.sectionTitleHint = str2;
            this.textPositionIn = str3;
            this.textPositionOut = str4;
            this.sectionTitleLimit = num;
            this.sectionTitleMaxLines = num2;
            this.blockImagesTitle = str5;
            this.changeTextColor = str6;
            this.blockDesktopImageSizeText = str7;
            this.blockMobileImageSizeText = str8;
            this.blockTitle = textBlockConfig;
            this.blockDescription = textBlockConfig2;
            this.defaultValue = universalWidgetImageWithTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getBlockImagesTitle() {
            return this.blockImagesTitle;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final String getBlockDesktopImageSizeText() {
            return this.blockDesktopImageSizeText;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final String getBlockMobileImageSizeText() {
            return this.blockMobileImageSizeText;
        }

        @k
        /* renamed from: component14, reason: from getter */
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @k
        /* renamed from: component15, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getTextPositionIn() {
            return this.textPositionIn;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getTextPositionOut() {
            return this.textPositionOut;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @k
        public final ImageWithTextFullWidthConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String sectionTitleHint, @k String textPositionIn, @k String textPositionOut, @l Integer sectionTitleLimit, @l Integer sectionTitleMaxLines, @l String blockImagesTitle, @l String changeTextColor, @l String blockDesktopImageSizeText, @l String blockMobileImageSizeText, @k TextBlockConfig blockTitle, @k TextBlockConfig blockDescription, @l UniversalWidgetImageWithTextModification defaultValue) {
            return new ImageWithTextFullWidthConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, sectionTitleHint, textPositionIn, textPositionOut, sectionTitleLimit, sectionTitleMaxLines, blockImagesTitle, changeTextColor, blockDesktopImageSizeText, blockMobileImageSizeText, blockTitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextFullWidthConfig)) {
                return false;
            }
            ImageWithTextFullWidthConfig imageWithTextFullWidthConfig = (ImageWithTextFullWidthConfig) other;
            return L.f(this.name, imageWithTextFullWidthConfig.name) && L.f(this.desktopPreviewImage, imageWithTextFullWidthConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, imageWithTextFullWidthConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, imageWithTextFullWidthConfig.darkMobilePreviewImage) && L.f(this.sectionTitleHint, imageWithTextFullWidthConfig.sectionTitleHint) && L.f(this.textPositionIn, imageWithTextFullWidthConfig.textPositionIn) && L.f(this.textPositionOut, imageWithTextFullWidthConfig.textPositionOut) && L.f(this.sectionTitleLimit, imageWithTextFullWidthConfig.sectionTitleLimit) && L.f(this.sectionTitleMaxLines, imageWithTextFullWidthConfig.sectionTitleMaxLines) && L.f(this.blockImagesTitle, imageWithTextFullWidthConfig.blockImagesTitle) && L.f(this.changeTextColor, imageWithTextFullWidthConfig.changeTextColor) && L.f(this.blockDesktopImageSizeText, imageWithTextFullWidthConfig.blockDesktopImageSizeText) && L.f(this.blockMobileImageSizeText, imageWithTextFullWidthConfig.blockMobileImageSizeText) && L.f(this.blockTitle, imageWithTextFullWidthConfig.blockTitle) && L.f(this.blockDescription, imageWithTextFullWidthConfig.blockDescription) && L.f(this.defaultValue, imageWithTextFullWidthConfig.defaultValue);
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        public final String getBlockDesktopImageSizeText() {
            return this.blockDesktopImageSizeText;
        }

        @l
        public final String getBlockImagesTitle() {
            return this.blockImagesTitle;
        }

        @l
        public final String getBlockMobileImageSizeText() {
            return this.blockMobileImageSizeText;
        }

        @k
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @l
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @k
        public final String getTextPositionIn() {
            return this.textPositionIn;
        }

        @k
        public final String getTextPositionOut() {
            return this.textPositionOut;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iD2 = H.d(H.d(H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.sectionTitleHint), 31, this.textPositionIn), 31, this.textPositionOut);
            Integer num = this.sectionTitleLimit;
            int iHashCode4 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sectionTitleMaxLines;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.blockImagesTitle;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.changeTextColor;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.blockDesktopImageSizeText;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.blockMobileImageSizeText;
            int iHashCode9 = (this.blockDescription.hashCode() + ((this.blockTitle.hashCode() + ((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            return iHashCode9 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ImageWithTextFullWidthConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", sectionTitleHint=" + this.sectionTitleHint + ", textPositionIn=" + this.textPositionIn + ", textPositionOut=" + this.textPositionOut + ", sectionTitleLimit=" + this.sectionTitleLimit + ", sectionTitleMaxLines=" + this.sectionTitleMaxLines + ", blockImagesTitle=" + this.blockImagesTitle + ", changeTextColor=" + this.changeTextColor + ", blockDesktopImageSizeText=" + this.blockDesktopImageSizeText + ", blockMobileImageSizeText=" + this.blockMobileImageSizeText + ", blockTitle=" + this.blockTitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.sectionTitleHint);
            parcel.writeString(this.textPositionIn);
            parcel.writeString(this.textPositionOut);
            Integer num = this.sectionTitleLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.sectionTitleMaxLines;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeString(this.blockImagesTitle);
            parcel.writeString(this.changeTextColor);
            parcel.writeString(this.blockDesktopImageSizeText);
            parcel.writeString(this.blockMobileImageSizeText);
            this.blockTitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            if (universalWidgetImageWithTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetImageWithTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u008a\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "imageLeftShort", "imageRightShort", "blockImageTitle", "blockImageSizeText43", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockTitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component10", "component11", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextImgWithTextConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getImageLeftShort", "getImageRightShort", "getBlockImageTitle", "getBlockImageSizeText43", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockTitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextImgWithTextConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextImgWithTextConfig> CREATOR = new Creator();

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockImageSizeText_4_3")
        @l
        private final String blockImageSizeText43;

        @c("blockImageTitle")
        @l
        private final String blockImageTitle;

        @c("blockTitle")
        @k
        private final TextBlockConfig blockTitle;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetImageWithTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("imageLeftShort")
        @k
        private final String imageLeftShort;

        @c("imageRightShort")
        @k
        private final String imageRightShort;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextImgWithTextConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextImgWithTextConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(ImageWithTextImgWithTextConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(ImageWithTextImgWithTextConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(ImageWithTextImgWithTextConfig.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new ImageWithTextImgWithTextConfig(string, image, image2, image3, string2, string3, string4, string5, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : UniversalWidgetImageWithTextModification.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextImgWithTextConfig[] newArray(int i12) {
                return new ImageWithTextImgWithTextConfig[i12];
            }
        }

        public ImageWithTextImgWithTextConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @k String str3, @l String str4, @l String str5, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.imageLeftShort = str2;
            this.imageRightShort = str3;
            this.blockImageTitle = str4;
            this.blockImageSizeText43 = str5;
            this.blockTitle = textBlockConfig;
            this.blockDescription = textBlockConfig2;
            this.defaultValue = universalWidgetImageWithTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component10, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getImageLeftShort() {
            return this.imageLeftShort;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getImageRightShort() {
            return this.imageRightShort;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @k
        public final ImageWithTextImgWithTextConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String imageLeftShort, @k String imageRightShort, @l String blockImageTitle, @l String blockImageSizeText43, @k TextBlockConfig blockTitle, @k TextBlockConfig blockDescription, @l UniversalWidgetImageWithTextModification defaultValue) {
            return new ImageWithTextImgWithTextConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, imageLeftShort, imageRightShort, blockImageTitle, blockImageSizeText43, blockTitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextImgWithTextConfig)) {
                return false;
            }
            ImageWithTextImgWithTextConfig imageWithTextImgWithTextConfig = (ImageWithTextImgWithTextConfig) other;
            return L.f(this.name, imageWithTextImgWithTextConfig.name) && L.f(this.desktopPreviewImage, imageWithTextImgWithTextConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, imageWithTextImgWithTextConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, imageWithTextImgWithTextConfig.darkMobilePreviewImage) && L.f(this.imageLeftShort, imageWithTextImgWithTextConfig.imageLeftShort) && L.f(this.imageRightShort, imageWithTextImgWithTextConfig.imageRightShort) && L.f(this.blockImageTitle, imageWithTextImgWithTextConfig.blockImageTitle) && L.f(this.blockImageSizeText43, imageWithTextImgWithTextConfig.blockImageSizeText43) && L.f(this.blockTitle, imageWithTextImgWithTextConfig.blockTitle) && L.f(this.blockDescription, imageWithTextImgWithTextConfig.blockDescription) && L.f(this.defaultValue, imageWithTextImgWithTextConfig.defaultValue);
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @k
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @k
        public final String getImageLeftShort() {
            return this.imageLeftShort;
        }

        @k
        public final String getImageRightShort() {
            return this.imageRightShort;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iD2 = H.d(H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.imageLeftShort), 31, this.imageRightShort);
            String str = this.blockImageTitle;
            int iHashCode4 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.blockImageSizeText43;
            int iHashCode5 = (this.blockDescription.hashCode() + ((this.blockTitle.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            return iHashCode5 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ImageWithTextImgWithTextConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", imageLeftShort=" + this.imageLeftShort + ", imageRightShort=" + this.imageRightShort + ", blockImageTitle=" + this.blockImageTitle + ", blockImageSizeText43=" + this.blockImageSizeText43 + ", blockTitle=" + this.blockTitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.imageLeftShort);
            parcel.writeString(this.imageRightShort);
            parcel.writeString(this.blockImageTitle);
            parcel.writeString(this.blockImageSizeText43);
            this.blockTitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            if (universalWidgetImageWithTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetImageWithTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J¼\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b6\u00100J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bB\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bC\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bG\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bH\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bI\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bJ\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bK\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010(R\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bN\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010+¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "sectionTitleHint", "", "sectionTitleLimit", "sectionTitleMaxLines", "blockImageTitle", "changeTextColor", "blockImageSizeText11", "blockImageSizeText43", "blockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockTitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component14", "component15", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextThreeColumnsConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getSectionTitleHint", "Ljava/lang/Integer;", "getSectionTitleLimit", "getSectionTitleMaxLines", "getBlockImageTitle", "getChangeTextColor", "getBlockImageSizeText11", "getBlockImageSizeText43", "getBlockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockTitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextThreeColumnsConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextThreeColumnsConfig> CREATOR = new Creator();

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockImageSizeText_1_1")
        @l
        private final String blockImageSizeText11;

        @c("blockImageSizeText_3_4")
        @l
        private final String blockImageSizeText34;

        @c("blockImageSizeText_4_3")
        @l
        private final String blockImageSizeText43;

        @c("blockImageTitle")
        @l
        private final String blockImageTitle;

        @c("blockTitle")
        @k
        private final TextBlockConfig blockTitle;

        @c("changeTextColor")
        @l
        private final String changeTextColor;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetImageWithTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("sectionTitleHint")
        @k
        private final String sectionTitleHint;

        @c("sectionTitleLimit")
        @l
        private final Integer sectionTitleLimit;

        @c("sectionTitleMaxLines")
        @l
        private final Integer sectionTitleMaxLines;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextThreeColumnsConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextThreeColumnsConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(ImageWithTextThreeColumnsConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(ImageWithTextThreeColumnsConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(ImageWithTextThreeColumnsConfig.class.getClassLoader());
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new ImageWithTextThreeColumnsConfig(string, image, image2, image3, string2, numValueOf, numValueOf2, string3, string4, string5, string6, string7, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetImageWithTextModification.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextThreeColumnsConfig[] newArray(int i12) {
                return new ImageWithTextThreeColumnsConfig[i12];
            }
        }

        public ImageWithTextThreeColumnsConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @l Integer num, @l Integer num2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.sectionTitleHint = str2;
            this.sectionTitleLimit = num;
            this.sectionTitleMaxLines = num2;
            this.blockImageTitle = str3;
            this.changeTextColor = str4;
            this.blockImageSizeText11 = str5;
            this.blockImageSizeText43 = str6;
            this.blockImageSizeText34 = str7;
            this.blockTitle = textBlockConfig;
            this.blockDescription = textBlockConfig2;
            this.defaultValue = universalWidgetImageWithTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @k
        /* renamed from: component13, reason: from getter */
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @k
        /* renamed from: component14, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @k
        public final ImageWithTextThreeColumnsConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String sectionTitleHint, @l Integer sectionTitleLimit, @l Integer sectionTitleMaxLines, @l String blockImageTitle, @l String changeTextColor, @l String blockImageSizeText11, @l String blockImageSizeText43, @l String blockImageSizeText34, @k TextBlockConfig blockTitle, @k TextBlockConfig blockDescription, @l UniversalWidgetImageWithTextModification defaultValue) {
            return new ImageWithTextThreeColumnsConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, sectionTitleHint, sectionTitleLimit, sectionTitleMaxLines, blockImageTitle, changeTextColor, blockImageSizeText11, blockImageSizeText43, blockImageSizeText34, blockTitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextThreeColumnsConfig)) {
                return false;
            }
            ImageWithTextThreeColumnsConfig imageWithTextThreeColumnsConfig = (ImageWithTextThreeColumnsConfig) other;
            return L.f(this.name, imageWithTextThreeColumnsConfig.name) && L.f(this.desktopPreviewImage, imageWithTextThreeColumnsConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, imageWithTextThreeColumnsConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, imageWithTextThreeColumnsConfig.darkMobilePreviewImage) && L.f(this.sectionTitleHint, imageWithTextThreeColumnsConfig.sectionTitleHint) && L.f(this.sectionTitleLimit, imageWithTextThreeColumnsConfig.sectionTitleLimit) && L.f(this.sectionTitleMaxLines, imageWithTextThreeColumnsConfig.sectionTitleMaxLines) && L.f(this.blockImageTitle, imageWithTextThreeColumnsConfig.blockImageTitle) && L.f(this.changeTextColor, imageWithTextThreeColumnsConfig.changeTextColor) && L.f(this.blockImageSizeText11, imageWithTextThreeColumnsConfig.blockImageSizeText11) && L.f(this.blockImageSizeText43, imageWithTextThreeColumnsConfig.blockImageSizeText43) && L.f(this.blockImageSizeText34, imageWithTextThreeColumnsConfig.blockImageSizeText34) && L.f(this.blockTitle, imageWithTextThreeColumnsConfig.blockTitle) && L.f(this.blockDescription, imageWithTextThreeColumnsConfig.blockDescription) && L.f(this.defaultValue, imageWithTextThreeColumnsConfig.defaultValue);
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @l
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @k
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @l
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iD2 = H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            int iHashCode4 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sectionTitleMaxLines;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.blockImageTitle;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.changeTextColor;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.blockImageSizeText11;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.blockImageSizeText43;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.blockImageSizeText34;
            int iHashCode10 = (this.blockDescription.hashCode() + ((this.blockTitle.hashCode() + ((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            return iHashCode10 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ImageWithTextThreeColumnsConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", sectionTitleHint=" + this.sectionTitleHint + ", sectionTitleLimit=" + this.sectionTitleLimit + ", sectionTitleMaxLines=" + this.sectionTitleMaxLines + ", blockImageTitle=" + this.blockImageTitle + ", changeTextColor=" + this.changeTextColor + ", blockImageSizeText11=" + this.blockImageSizeText11 + ", blockImageSizeText43=" + this.blockImageSizeText43 + ", blockImageSizeText34=" + this.blockImageSizeText34 + ", blockTitle=" + this.blockTitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.sectionTitleMaxLines;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeString(this.blockImageTitle);
            parcel.writeString(this.changeTextColor);
            parcel.writeString(this.blockImageSizeText11);
            parcel.writeString(this.blockImageSizeText43);
            parcel.writeString(this.blockImageSizeText34);
            this.blockTitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            if (universalWidgetImageWithTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetImageWithTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J¼\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b6\u00100J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bB\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bC\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bG\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bH\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bI\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bJ\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bK\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010(R\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bN\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010+¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "sectionTitleHint", "", "sectionTitleLimit", "sectionTitleMaxLines", "blockImageTitle", "changeTextColor", "blockImageSizeText11", "blockImageSizeText43", "blockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "blockTitle", "blockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component14", "component15", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextTwoColumnsConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getSectionTitleHint", "Ljava/lang/Integer;", "getSectionTitleLimit", "getSectionTitleMaxLines", "getBlockImageTitle", "getChangeTextColor", "getBlockImageSizeText11", "getBlockImageSizeText43", "getBlockImageSizeText34", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getBlockTitle", "getBlockDescription", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextTwoColumnsConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageWithTextTwoColumnsConfig> CREATOR = new Creator();

        @c("blockDescription")
        @k
        private final TextBlockConfig blockDescription;

        @c("blockImageSizeText_1_1")
        @l
        private final String blockImageSizeText11;

        @c("blockImageSizeText_3_4")
        @l
        private final String blockImageSizeText34;

        @c("blockImageSizeText_4_3")
        @l
        private final String blockImageSizeText43;

        @c("blockImageTitle")
        @l
        private final String blockImageTitle;

        @c("blockTitle")
        @k
        private final TextBlockConfig blockTitle;

        @c("changeTextColor")
        @l
        private final String changeTextColor;

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetImageWithTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("sectionTitleHint")
        @k
        private final String sectionTitleHint;

        @c("sectionTitleLimit")
        @l
        private final Integer sectionTitleLimit;

        @c("sectionTitleMaxLines")
        @l
        private final Integer sectionTitleMaxLines;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageWithTextTwoColumnsConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextTwoColumnsConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(ImageWithTextTwoColumnsConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(ImageWithTextTwoColumnsConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(ImageWithTextTwoColumnsConfig.class.getClassLoader());
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new ImageWithTextTwoColumnsConfig(string, image, image2, image3, string2, numValueOf, numValueOf2, string3, string4, string5, string6, string7, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetImageWithTextModification.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageWithTextTwoColumnsConfig[] newArray(int i12) {
                return new ImageWithTextTwoColumnsConfig[i12];
            }
        }

        public ImageWithTextTwoColumnsConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @l Integer num, @l Integer num2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.sectionTitleHint = str2;
            this.sectionTitleLimit = num;
            this.sectionTitleMaxLines = num2;
            this.blockImageTitle = str3;
            this.changeTextColor = str4;
            this.blockImageSizeText11 = str5;
            this.blockImageSizeText43 = str6;
            this.blockImageSizeText34 = str7;
            this.blockTitle = textBlockConfig;
            this.blockDescription = textBlockConfig2;
            this.defaultValue = universalWidgetImageWithTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @k
        /* renamed from: component13, reason: from getter */
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @k
        /* renamed from: component14, reason: from getter */
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @k
        public final ImageWithTextTwoColumnsConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String sectionTitleHint, @l Integer sectionTitleLimit, @l Integer sectionTitleMaxLines, @l String blockImageTitle, @l String changeTextColor, @l String blockImageSizeText11, @l String blockImageSizeText43, @l String blockImageSizeText34, @k TextBlockConfig blockTitle, @k TextBlockConfig blockDescription, @l UniversalWidgetImageWithTextModification defaultValue) {
            return new ImageWithTextTwoColumnsConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, sectionTitleHint, sectionTitleLimit, sectionTitleMaxLines, blockImageTitle, changeTextColor, blockImageSizeText11, blockImageSizeText43, blockImageSizeText34, blockTitle, blockDescription, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWithTextTwoColumnsConfig)) {
                return false;
            }
            ImageWithTextTwoColumnsConfig imageWithTextTwoColumnsConfig = (ImageWithTextTwoColumnsConfig) other;
            return L.f(this.name, imageWithTextTwoColumnsConfig.name) && L.f(this.desktopPreviewImage, imageWithTextTwoColumnsConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, imageWithTextTwoColumnsConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, imageWithTextTwoColumnsConfig.darkMobilePreviewImage) && L.f(this.sectionTitleHint, imageWithTextTwoColumnsConfig.sectionTitleHint) && L.f(this.sectionTitleLimit, imageWithTextTwoColumnsConfig.sectionTitleLimit) && L.f(this.sectionTitleMaxLines, imageWithTextTwoColumnsConfig.sectionTitleMaxLines) && L.f(this.blockImageTitle, imageWithTextTwoColumnsConfig.blockImageTitle) && L.f(this.changeTextColor, imageWithTextTwoColumnsConfig.changeTextColor) && L.f(this.blockImageSizeText11, imageWithTextTwoColumnsConfig.blockImageSizeText11) && L.f(this.blockImageSizeText43, imageWithTextTwoColumnsConfig.blockImageSizeText43) && L.f(this.blockImageSizeText34, imageWithTextTwoColumnsConfig.blockImageSizeText34) && L.f(this.blockTitle, imageWithTextTwoColumnsConfig.blockTitle) && L.f(this.blockDescription, imageWithTextTwoColumnsConfig.blockDescription) && L.f(this.defaultValue, imageWithTextTwoColumnsConfig.defaultValue);
        }

        @k
        public final TextBlockConfig getBlockDescription() {
            return this.blockDescription;
        }

        @l
        public final String getBlockImageSizeText11() {
            return this.blockImageSizeText11;
        }

        @l
        public final String getBlockImageSizeText34() {
            return this.blockImageSizeText34;
        }

        @l
        public final String getBlockImageSizeText43() {
            return this.blockImageSizeText43;
        }

        @l
        public final String getBlockImageTitle() {
            return this.blockImageTitle;
        }

        @k
        public final TextBlockConfig getBlockTitle() {
            return this.blockTitle;
        }

        @l
        public final String getChangeTextColor() {
            return this.changeTextColor;
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetImageWithTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getSectionTitleHint() {
            return this.sectionTitleHint;
        }

        @l
        public final Integer getSectionTitleLimit() {
            return this.sectionTitleLimit;
        }

        @l
        public final Integer getSectionTitleMaxLines() {
            return this.sectionTitleMaxLines;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iD2 = H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            int iHashCode4 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sectionTitleMaxLines;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.blockImageTitle;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.changeTextColor;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.blockImageSizeText11;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.blockImageSizeText43;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.blockImageSizeText34;
            int iHashCode10 = (this.blockDescription.hashCode() + ((this.blockTitle.hashCode() + ((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            return iHashCode10 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ImageWithTextTwoColumnsConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", sectionTitleHint=" + this.sectionTitleHint + ", sectionTitleLimit=" + this.sectionTitleLimit + ", sectionTitleMaxLines=" + this.sectionTitleMaxLines + ", blockImageTitle=" + this.blockImageTitle + ", changeTextColor=" + this.changeTextColor + ", blockImageSizeText11=" + this.blockImageSizeText11 + ", blockImageSizeText43=" + this.blockImageSizeText43 + ", blockImageSizeText34=" + this.blockImageSizeText34 + ", blockTitle=" + this.blockTitle + ", blockDescription=" + this.blockDescription + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.sectionTitleHint);
            Integer num = this.sectionTitleLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.sectionTitleMaxLines;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeString(this.blockImageTitle);
            parcel.writeString(this.changeTextColor);
            parcel.writeString(this.blockImageSizeText11);
            parcel.writeString(this.blockImageSizeText43);
            parcel.writeString(this.blockImageSizeText34);
            this.blockTitle.writeToParcel(parcel, flags);
            this.blockDescription.writeToParcel(parcel, flags);
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.defaultValue;
            if (universalWidgetImageWithTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetImageWithTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$OrderedSectionType;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;", "type", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "subtype", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;", "component2", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;)Lcom/avito/android/remote/model/extended/UniversalWidget$OrderedSectionType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;", "getType", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "getSubtype", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderedSectionType implements Parcelable {

        @k
        public static final Parcelable.Creator<OrderedSectionType> CREATOR = new Creator();

        @l
        private final SectionSubtype subtype;

        @l
        private final SectionType type;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderedSectionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OrderedSectionType createFromParcel(@k Parcel parcel) {
                return new OrderedSectionType(parcel.readInt() == 0 ? null : SectionType.valueOf(parcel.readString()), parcel.readInt() != 0 ? SectionSubtype.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OrderedSectionType[] newArray(int i12) {
                return new OrderedSectionType[i12];
            }
        }

        public OrderedSectionType(@l SectionType sectionType, @l SectionSubtype sectionSubtype) {
            this.type = sectionType;
            this.subtype = sectionSubtype;
        }

        public static /* synthetic */ OrderedSectionType copy$default(OrderedSectionType orderedSectionType, SectionType sectionType, SectionSubtype sectionSubtype, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sectionType = orderedSectionType.type;
            }
            if ((i12 & 2) != 0) {
                sectionSubtype = orderedSectionType.subtype;
            }
            return orderedSectionType.copy(sectionType, sectionSubtype);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final SectionType getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final SectionSubtype getSubtype() {
            return this.subtype;
        }

        @k
        public final OrderedSectionType copy(@l SectionType type, @l SectionSubtype subtype) {
            return new OrderedSectionType(type, subtype);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderedSectionType)) {
                return false;
            }
            OrderedSectionType orderedSectionType = (OrderedSectionType) other;
            return this.type == orderedSectionType.type && this.subtype == orderedSectionType.subtype;
        }

        @l
        public final SectionSubtype getSubtype() {
            return this.subtype;
        }

        @l
        public final SectionType getType() {
            return this.type;
        }

        public int hashCode() {
            SectionType sectionType = this.type;
            int iHashCode = (sectionType == null ? 0 : sectionType.hashCode()) * 31;
            SectionSubtype sectionSubtype = this.subtype;
            return iHashCode + (sectionSubtype != null ? sectionSubtype.hashCode() : 0);
        }

        @k
        public String toString() {
            return "OrderedSectionType(type=" + this.type + ", subtype=" + this.subtype + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            SectionType sectionType = this.type;
            if (sectionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sectionType.name());
            }
            SectionSubtype sectionSubtype = this.subtype;
            if (sectionSubtype == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sectionSubtype.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "COMMON_FACTOID", "FULL_WIDTH", "IMAGE_WITH_TEXT", "TWO_COLUMNS", "THREE_COLUMNS", "FOUR_COLUMNS", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SectionSubtype {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ SectionSubtype[] $VALUES;

        @k
        private final String id;

        @c("common_factoid")
        public static final SectionSubtype COMMON_FACTOID = new SectionSubtype("COMMON_FACTOID", 0, "common_factoid");

        @c("full_width")
        public static final SectionSubtype FULL_WIDTH = new SectionSubtype("FULL_WIDTH", 1, "full_width");

        @c("img_with_text")
        public static final SectionSubtype IMAGE_WITH_TEXT = new SectionSubtype("IMAGE_WITH_TEXT", 2, "img_with_text");

        @c("2_columns")
        public static final SectionSubtype TWO_COLUMNS = new SectionSubtype("TWO_COLUMNS", 3, "2_columns");

        @c("3_columns")
        public static final SectionSubtype THREE_COLUMNS = new SectionSubtype("THREE_COLUMNS", 4, "3_columns");

        @c("4_columns")
        public static final SectionSubtype FOUR_COLUMNS = new SectionSubtype("FOUR_COLUMNS", 5, "4_columns");

        private static final /* synthetic */ SectionSubtype[] $values() {
            return new SectionSubtype[]{COMMON_FACTOID, FULL_WIDTH, IMAGE_WITH_TEXT, TWO_COLUMNS, THREE_COLUMNS, FOUR_COLUMNS};
        }

        static {
            SectionSubtype[] sectionSubtypeArr$values = $values();
            $VALUES = sectionSubtypeArr$values;
            $ENTRIES = kotlin.enums.c.a(sectionSubtypeArr$values);
        }

        private SectionSubtype(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<SectionSubtype> getEntries() {
            return $ENTRIES;
        }

        public static SectionSubtype valueOf(String str) {
            return (SectionSubtype) Enum.valueOf(SectionSubtype.class, str);
        }

        public static SectionSubtype[] values() {
            return (SectionSubtype[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$SectionType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "FACTOID", "TEXT", "IMAGE_WITH_TEXT", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SectionType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;

        @k
        private final String id;

        @c("factoid")
        public static final SectionType FACTOID = new SectionType("FACTOID", 0, "factoid");

        @c("text")
        public static final SectionType TEXT = new SectionType("TEXT", 1, "text");

        @c("imageWithText")
        public static final SectionType IMAGE_WITH_TEXT = new SectionType("IMAGE_WITH_TEXT", 2, "imageWithText");

        private static final /* synthetic */ SectionType[] $values() {
            return new SectionType[]{FACTOID, TEXT, IMAGE_WITH_TEXT};
        }

        static {
            SectionType[] sectionTypeArr$values = $values();
            $VALUES = sectionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(sectionTypeArr$values);
        }

        private SectionType(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<SectionType> getEntries() {
            return $ENTRIES;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;", "factoid", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;", "text", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;", "imageWithText", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;", "component2", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;", "component3", "()Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;)Lcom/avito/android/remote/model/extended/UniversalWidget$SectionsConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$FactoidConfig;", "getFactoid", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;", "getText", "Lcom/avito/android/remote/model/extended/UniversalWidget$ImageWithTextConfig;", "getImageWithText", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SectionsConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<SectionsConfig> CREATOR = new Creator();

        @c("factoid")
        @k
        private final FactoidConfig factoid;

        @c("imageWithText")
        @k
        private final ImageWithTextConfig imageWithText;

        @c("text")
        @k
        private final TextConfig text;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SectionsConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SectionsConfig createFromParcel(@k Parcel parcel) {
                return new SectionsConfig(FactoidConfig.CREATOR.createFromParcel(parcel), TextConfig.CREATOR.createFromParcel(parcel), ImageWithTextConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SectionsConfig[] newArray(int i12) {
                return new SectionsConfig[i12];
            }
        }

        public SectionsConfig(@k FactoidConfig factoidConfig, @k TextConfig textConfig, @k ImageWithTextConfig imageWithTextConfig) {
            this.factoid = factoidConfig;
            this.text = textConfig;
            this.imageWithText = imageWithTextConfig;
        }

        public static /* synthetic */ SectionsConfig copy$default(SectionsConfig sectionsConfig, FactoidConfig factoidConfig, TextConfig textConfig, ImageWithTextConfig imageWithTextConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                factoidConfig = sectionsConfig.factoid;
            }
            if ((i12 & 2) != 0) {
                textConfig = sectionsConfig.text;
            }
            if ((i12 & 4) != 0) {
                imageWithTextConfig = sectionsConfig.imageWithText;
            }
            return sectionsConfig.copy(factoidConfig, textConfig, imageWithTextConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final FactoidConfig getFactoid() {
            return this.factoid;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final TextConfig getText() {
            return this.text;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final ImageWithTextConfig getImageWithText() {
            return this.imageWithText;
        }

        @k
        public final SectionsConfig copy(@k FactoidConfig factoid, @k TextConfig text, @k ImageWithTextConfig imageWithText) {
            return new SectionsConfig(factoid, text, imageWithText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionsConfig)) {
                return false;
            }
            SectionsConfig sectionsConfig = (SectionsConfig) other;
            return L.f(this.factoid, sectionsConfig.factoid) && L.f(this.text, sectionsConfig.text) && L.f(this.imageWithText, sectionsConfig.imageWithText);
        }

        @k
        public final FactoidConfig getFactoid() {
            return this.factoid;
        }

        @k
        public final ImageWithTextConfig getImageWithText() {
            return this.imageWithText;
        }

        @k
        public final TextConfig getText() {
            return this.text;
        }

        public int hashCode() {
            return this.imageWithText.hashCode() + ((this.text.hashCode() + (this.factoid.hashCode() * 31)) * 31);
        }

        @k
        public String toString() {
            return "SectionsConfig(factoid=" + this.factoid + ", text=" + this.text + ", imageWithText=" + this.imageWithText + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.factoid.writeToParcel(parcel, flags);
            this.text.writeToParcel(parcel, flags);
            this.imageWithText.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b\t\u0010\u0013¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "Landroid/os/Parcelable;", "", "title", "hint", "", "limit", "lineLimit", "", "isRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getHint", "Ljava/lang/Integer;", "getLimit", "getLineLimit", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextBlockConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<TextBlockConfig> CREATOR = new Creator();

        @c("hint")
        @l
        private final String hint;

        @c("isRequired")
        @l
        private final Boolean isRequired;

        @c("limit")
        @l
        private final Integer limit;

        @c("lineLimit")
        @l
        private final Integer lineLimit;

        @c("title")
        @l
        private final String title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBlockConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextBlockConfig createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TextBlockConfig(string, string2, numValueOf, numValueOf2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextBlockConfig[] newArray(int i12) {
                return new TextBlockConfig[i12];
            }
        }

        public TextBlockConfig(@l String str, @l String str2, @l Integer num, @l Integer num2, @l Boolean bool) {
            this.title = str;
            this.hint = str2;
            this.limit = num;
            this.lineLimit = num2;
            this.isRequired = bool;
        }

        public static /* synthetic */ TextBlockConfig copy$default(TextBlockConfig textBlockConfig, String str, String str2, Integer num, Integer num2, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textBlockConfig.title;
            }
            if ((i12 & 2) != 0) {
                str2 = textBlockConfig.hint;
            }
            String str3 = str2;
            if ((i12 & 4) != 0) {
                num = textBlockConfig.limit;
            }
            Integer num3 = num;
            if ((i12 & 8) != 0) {
                num2 = textBlockConfig.lineLimit;
            }
            Integer num4 = num2;
            if ((i12 & 16) != 0) {
                bool = textBlockConfig.isRequired;
            }
            return textBlockConfig.copy(str, str3, num3, num4, bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getLineLimit() {
            return this.lineLimit;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        @k
        public final TextBlockConfig copy(@l String title, @l String hint, @l Integer limit, @l Integer lineLimit, @l Boolean isRequired) {
            return new TextBlockConfig(title, hint, limit, lineLimit, isRequired);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextBlockConfig)) {
                return false;
            }
            TextBlockConfig textBlockConfig = (TextBlockConfig) other;
            return L.f(this.title, textBlockConfig.title) && L.f(this.hint, textBlockConfig.hint) && L.f(this.limit, textBlockConfig.limit) && L.f(this.lineLimit, textBlockConfig.lineLimit) && L.f(this.isRequired, textBlockConfig.isRequired);
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @l
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        public final Integer getLineLimit() {
            return this.lineLimit;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.hint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.limit;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lineLimit;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.isRequired;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @l
        public final Boolean isRequired() {
            return this.isRequired;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TextBlockConfig(title=");
            sb2.append(this.title);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", limit=");
            sb2.append(this.limit);
            sb2.append(", lineLimit=");
            sb2.append(this.lineLimit);
            sb2.append(", isRequired=");
            return C0.g(sb2, this.isRequired, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.hint);
            Integer num = this.limit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.lineLimit;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Boolean bool = this.isRequired;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;", "fullWidth", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;)Lcom/avito/android/remote/model/extended/UniversalWidget$TextConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;", "getFullWidth", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<TextConfig> CREATOR = new Creator();

        @c("fullWidth")
        @k
        private final TextFullWidthConfig fullWidth;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextConfig createFromParcel(@k Parcel parcel) {
                return new TextConfig(TextFullWidthConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextConfig[] newArray(int i12) {
                return new TextConfig[i12];
            }
        }

        public TextConfig(@k TextFullWidthConfig textFullWidthConfig) {
            this.fullWidth = textFullWidthConfig;
        }

        public static /* synthetic */ TextConfig copy$default(TextConfig textConfig, TextFullWidthConfig textFullWidthConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textFullWidthConfig = textConfig.fullWidth;
            }
            return textConfig.copy(textFullWidthConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final TextFullWidthConfig getFullWidth() {
            return this.fullWidth;
        }

        @k
        public final TextConfig copy(@k TextFullWidthConfig fullWidth) {
            return new TextConfig(fullWidth);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextConfig) && L.f(this.fullWidth, ((TextConfig) other).fullWidth);
        }

        @k
        public final TextFullWidthConfig getFullWidth() {
            return this.fullWidth;
        }

        public int hashCode() {
            return this.fullWidth.hashCode();
        }

        @k
        public String toString() {
            return "TextConfig(fullWidth=" + this.fullWidth + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.fullWidth.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0086\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "desktopPreviewImage", "mobilePreviewImage", "darkMobilePreviewImage", "textPositionSelectorTitle", "textPositionLeft", "textPositionRight", "textPositionUp", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "title", "text", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "component10", "component11", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;)Lcom/avito/android/remote/model/extended/UniversalWidget$TextFullWidthConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getDesktopPreviewImage", "getMobilePreviewImage", "getDarkMobilePreviewImage", "getTextPositionSelectorTitle", "getTextPositionLeft", "getTextPositionRight", "getTextPositionUp", "Lcom/avito/android/remote/model/extended/UniversalWidget$TextBlockConfig;", "getTitle", "getText", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "getDefaultValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextFullWidthConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<TextFullWidthConfig> CREATOR = new Creator();

        @c("darkMobilePreviewImage")
        @l
        private final Image darkMobilePreviewImage;

        @c("defaultValue")
        @l
        private final UniversalWidgetTextModification defaultValue;

        @c("desktopPreviewImage")
        @l
        private final Image desktopPreviewImage;

        @c("mobilePreviewImage")
        @l
        private final Image mobilePreviewImage;

        @c("name")
        @k
        private final String name;

        @c("text")
        @k
        private final TextBlockConfig text;

        @c("textPositionLeft")
        @k
        private final String textPositionLeft;

        @c("textPositionRight")
        @k
        private final String textPositionRight;

        @c("textPositionSelectorTitle")
        @k
        private final String textPositionSelectorTitle;

        @c("textPositionUp")
        @k
        private final String textPositionUp;

        @c("title")
        @k
        private final TextBlockConfig title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextFullWidthConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextFullWidthConfig createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(TextFullWidthConfig.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(TextFullWidthConfig.class.getClassLoader());
                Image image3 = (Image) parcel.readParcelable(TextFullWidthConfig.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Parcelable.Creator<TextBlockConfig> creator = TextBlockConfig.CREATOR;
                return new TextFullWidthConfig(string, image, image2, image3, string2, string3, string4, string5, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : UniversalWidgetTextModification.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextFullWidthConfig[] newArray(int i12) {
                return new TextFullWidthConfig[i12];
            }
        }

        public TextFullWidthConfig(@k String str, @l Image image, @l Image image2, @l Image image3, @k String str2, @k String str3, @k String str4, @k String str5, @k TextBlockConfig textBlockConfig, @k TextBlockConfig textBlockConfig2, @l UniversalWidgetTextModification universalWidgetTextModification) {
            this.name = str;
            this.desktopPreviewImage = image;
            this.mobilePreviewImage = image2;
            this.darkMobilePreviewImage = image3;
            this.textPositionSelectorTitle = str2;
            this.textPositionLeft = str3;
            this.textPositionRight = str4;
            this.textPositionUp = str5;
            this.title = textBlockConfig;
            this.text = textBlockConfig2;
            this.defaultValue = universalWidgetTextModification;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component10, reason: from getter */
        public final TextBlockConfig getText() {
            return this.text;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final UniversalWidgetTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getTextPositionSelectorTitle() {
            return this.textPositionSelectorTitle;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getTextPositionLeft() {
            return this.textPositionLeft;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getTextPositionRight() {
            return this.textPositionRight;
        }

        @k
        /* renamed from: component8, reason: from getter */
        public final String getTextPositionUp() {
            return this.textPositionUp;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final TextBlockConfig getTitle() {
            return this.title;
        }

        @k
        public final TextFullWidthConfig copy(@k String name, @l Image desktopPreviewImage, @l Image mobilePreviewImage, @l Image darkMobilePreviewImage, @k String textPositionSelectorTitle, @k String textPositionLeft, @k String textPositionRight, @k String textPositionUp, @k TextBlockConfig title, @k TextBlockConfig text, @l UniversalWidgetTextModification defaultValue) {
            return new TextFullWidthConfig(name, desktopPreviewImage, mobilePreviewImage, darkMobilePreviewImage, textPositionSelectorTitle, textPositionLeft, textPositionRight, textPositionUp, title, text, defaultValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFullWidthConfig)) {
                return false;
            }
            TextFullWidthConfig textFullWidthConfig = (TextFullWidthConfig) other;
            return L.f(this.name, textFullWidthConfig.name) && L.f(this.desktopPreviewImage, textFullWidthConfig.desktopPreviewImage) && L.f(this.mobilePreviewImage, textFullWidthConfig.mobilePreviewImage) && L.f(this.darkMobilePreviewImage, textFullWidthConfig.darkMobilePreviewImage) && L.f(this.textPositionSelectorTitle, textFullWidthConfig.textPositionSelectorTitle) && L.f(this.textPositionLeft, textFullWidthConfig.textPositionLeft) && L.f(this.textPositionRight, textFullWidthConfig.textPositionRight) && L.f(this.textPositionUp, textFullWidthConfig.textPositionUp) && L.f(this.title, textFullWidthConfig.title) && L.f(this.text, textFullWidthConfig.text) && L.f(this.defaultValue, textFullWidthConfig.defaultValue);
        }

        @l
        public final Image getDarkMobilePreviewImage() {
            return this.darkMobilePreviewImage;
        }

        @l
        public final UniversalWidgetTextModification getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final Image getDesktopPreviewImage() {
            return this.desktopPreviewImage;
        }

        @l
        public final Image getMobilePreviewImage() {
            return this.mobilePreviewImage;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final TextBlockConfig getText() {
            return this.text;
        }

        @k
        public final String getTextPositionLeft() {
            return this.textPositionLeft;
        }

        @k
        public final String getTextPositionRight() {
            return this.textPositionRight;
        }

        @k
        public final String getTextPositionSelectorTitle() {
            return this.textPositionSelectorTitle;
        }

        @k
        public final String getTextPositionUp() {
            return this.textPositionUp;
        }

        @k
        public final TextBlockConfig getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Image image = this.desktopPreviewImage;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.mobilePreviewImage;
            int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.darkMobilePreviewImage;
            int iHashCode4 = (this.text.hashCode() + ((this.title.hashCode() + H.d(H.d(H.d(H.d((iHashCode3 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.textPositionSelectorTitle), 31, this.textPositionLeft), 31, this.textPositionRight), 31, this.textPositionUp)) * 31)) * 31;
            UniversalWidgetTextModification universalWidgetTextModification = this.defaultValue;
            return iHashCode4 + (universalWidgetTextModification != null ? universalWidgetTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "TextFullWidthConfig(name=" + this.name + ", desktopPreviewImage=" + this.desktopPreviewImage + ", mobilePreviewImage=" + this.mobilePreviewImage + ", darkMobilePreviewImage=" + this.darkMobilePreviewImage + ", textPositionSelectorTitle=" + this.textPositionSelectorTitle + ", textPositionLeft=" + this.textPositionLeft + ", textPositionRight=" + this.textPositionRight + ", textPositionUp=" + this.textPositionUp + ", title=" + this.title + ", text=" + this.text + ", defaultValue=" + this.defaultValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.desktopPreviewImage, flags);
            parcel.writeParcelable(this.mobilePreviewImage, flags);
            parcel.writeParcelable(this.darkMobilePreviewImage, flags);
            parcel.writeString(this.textPositionSelectorTitle);
            parcel.writeString(this.textPositionLeft);
            parcel.writeString(this.textPositionRight);
            parcel.writeString(this.textPositionUp);
            this.title.writeToParcel(parcel, flags);
            this.text.writeToParcel(parcel, flags);
            UniversalWidgetTextModification universalWidgetTextModification = this.defaultValue;
            if (universalWidgetTextModification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalWidgetTextModification.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "THREE_COLUMNS", "FOUR_COLUMNS", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetFactoidItemsCountType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetFactoidItemsCountType[] $VALUES;

        @k
        private final String id;

        @c("3_columns")
        public static final UniversalWidgetFactoidItemsCountType THREE_COLUMNS = new UniversalWidgetFactoidItemsCountType("THREE_COLUMNS", 0, "3_columns");

        @c("4_columns")
        public static final UniversalWidgetFactoidItemsCountType FOUR_COLUMNS = new UniversalWidgetFactoidItemsCountType("FOUR_COLUMNS", 1, "4_columns");

        private static final /* synthetic */ UniversalWidgetFactoidItemsCountType[] $values() {
            return new UniversalWidgetFactoidItemsCountType[]{THREE_COLUMNS, FOUR_COLUMNS};
        }

        static {
            UniversalWidgetFactoidItemsCountType[] universalWidgetFactoidItemsCountTypeArr$values = $values();
            $VALUES = universalWidgetFactoidItemsCountTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetFactoidItemsCountTypeArr$values);
        }

        private UniversalWidgetFactoidItemsCountType(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetFactoidItemsCountType> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetFactoidItemsCountType valueOf(String str) {
            return (UniversalWidgetFactoidItemsCountType) Enum.valueOf(UniversalWidgetFactoidItemsCountType.class, str);
        }

        public static UniversalWidgetFactoidItemsCountType[] values() {
            return (UniversalWidgetFactoidItemsCountType[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSection;", "", "type", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidType;", "content", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionContent;", "(Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidType;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionContent;)V", "getContent", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionContent;", "getType", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidType;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetFactoidSection {

        @c("content")
        @k
        private final UniversalWidgetFactoidSectionContent content;

        @c("type")
        @l
        private final UniversalWidgetFactoidType type;

        public UniversalWidgetFactoidSection(@l UniversalWidgetFactoidType universalWidgetFactoidType, @k UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent) {
            this.type = universalWidgetFactoidType;
            this.content = universalWidgetFactoidSectionContent;
        }

        public static /* synthetic */ UniversalWidgetFactoidSection copy$default(UniversalWidgetFactoidSection universalWidgetFactoidSection, UniversalWidgetFactoidType universalWidgetFactoidType, UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalWidgetFactoidType = universalWidgetFactoidSection.type;
            }
            if ((i12 & 2) != 0) {
                universalWidgetFactoidSectionContent = universalWidgetFactoidSection.content;
            }
            return universalWidgetFactoidSection.copy(universalWidgetFactoidType, universalWidgetFactoidSectionContent);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalWidgetFactoidType getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetFactoidSectionContent getContent() {
            return this.content;
        }

        @k
        public final UniversalWidgetFactoidSection copy(@l UniversalWidgetFactoidType type, @k UniversalWidgetFactoidSectionContent content) {
            return new UniversalWidgetFactoidSection(type, content);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetFactoidSection)) {
                return false;
            }
            UniversalWidgetFactoidSection universalWidgetFactoidSection = (UniversalWidgetFactoidSection) other;
            return this.type == universalWidgetFactoidSection.type && L.f(this.content, universalWidgetFactoidSection.content);
        }

        @k
        public final UniversalWidgetFactoidSectionContent getContent() {
            return this.content;
        }

        @l
        public final UniversalWidgetFactoidType getType() {
            return this.type;
        }

        public int hashCode() {
            UniversalWidgetFactoidType universalWidgetFactoidType = this.type;
            return this.content.hashCode() + ((universalWidgetFactoidType == null ? 0 : universalWidgetFactoidType.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "UniversalWidgetFactoidSection(type=" + this.type + ", content=" + this.content + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionBlock;", "", "isEmpty", "", "blockModerationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "title", "", "titleModerationStatus", "subtitle", "subtitleModerationStatus", "description", "descriptionModerationStatus", "(ZLcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getBlockModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getDescription", "()Ljava/lang/String;", "getDescriptionModerationStatus", "()Z", "getSubtitle", "getSubtitleModerationStatus", "getTitle", "getTitleModerationStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetFactoidSectionBlock {

        @c("blockModerationStatus")
        @l
        private final FieldModerationStatus blockModerationStatus;

        @c("description")
        @l
        private final String description;

        @c("descriptionModerationStatus")
        @l
        private final FieldModerationStatus descriptionModerationStatus;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtitleModerationStatus")
        @l
        private final FieldModerationStatus subtitleModerationStatus;

        @c("title")
        @l
        private final String title;

        @c("titleModerationStatus")
        @l
        private final FieldModerationStatus titleModerationStatus;

        public UniversalWidgetFactoidSectionBlock(boolean z12, @l FieldModerationStatus fieldModerationStatus, @l String str, @l FieldModerationStatus fieldModerationStatus2, @l String str2, @l FieldModerationStatus fieldModerationStatus3, @l String str3, @l FieldModerationStatus fieldModerationStatus4) {
            this.isEmpty = z12;
            this.blockModerationStatus = fieldModerationStatus;
            this.title = str;
            this.titleModerationStatus = fieldModerationStatus2;
            this.subtitle = str2;
            this.subtitleModerationStatus = fieldModerationStatus3;
            this.description = str3;
            this.descriptionModerationStatus = fieldModerationStatus4;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final FieldModerationStatus getSubtitleModerationStatus() {
            return this.subtitleModerationStatus;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @k
        public final UniversalWidgetFactoidSectionBlock copy(boolean isEmpty, @l FieldModerationStatus blockModerationStatus, @l String title, @l FieldModerationStatus titleModerationStatus, @l String subtitle, @l FieldModerationStatus subtitleModerationStatus, @l String description, @l FieldModerationStatus descriptionModerationStatus) {
            return new UniversalWidgetFactoidSectionBlock(isEmpty, blockModerationStatus, title, titleModerationStatus, subtitle, subtitleModerationStatus, description, descriptionModerationStatus);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetFactoidSectionBlock)) {
                return false;
            }
            UniversalWidgetFactoidSectionBlock universalWidgetFactoidSectionBlock = (UniversalWidgetFactoidSectionBlock) other;
            return this.isEmpty == universalWidgetFactoidSectionBlock.isEmpty && L.f(this.blockModerationStatus, universalWidgetFactoidSectionBlock.blockModerationStatus) && L.f(this.title, universalWidgetFactoidSectionBlock.title) && L.f(this.titleModerationStatus, universalWidgetFactoidSectionBlock.titleModerationStatus) && L.f(this.subtitle, universalWidgetFactoidSectionBlock.subtitle) && L.f(this.subtitleModerationStatus, universalWidgetFactoidSectionBlock.subtitleModerationStatus) && L.f(this.description, universalWidgetFactoidSectionBlock.description) && L.f(this.descriptionModerationStatus, universalWidgetFactoidSectionBlock.descriptionModerationStatus);
        }

        @l
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final FieldModerationStatus getSubtitleModerationStatus() {
            return this.subtitleModerationStatus;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEmpty) * 31;
            FieldModerationStatus fieldModerationStatus = this.blockModerationStatus;
            int iHashCode2 = (iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus2 = this.titleModerationStatus;
            int iHashCode4 = (iHashCode3 + (fieldModerationStatus2 == null ? 0 : fieldModerationStatus2.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus3 = this.subtitleModerationStatus;
            int iHashCode6 = (iHashCode5 + (fieldModerationStatus3 == null ? 0 : fieldModerationStatus3.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus4 = this.descriptionModerationStatus;
            return iHashCode7 + (fieldModerationStatus4 != null ? fieldModerationStatus4.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @k
        public String toString() {
            return "UniversalWidgetFactoidSectionBlock(isEmpty=" + this.isEmpty + ", blockModerationStatus=" + this.blockModerationStatus + ", title=" + this.title + ", titleModerationStatus=" + this.titleModerationStatus + ", subtitle=" + this.subtitle + ", subtitleModerationStatus=" + this.subtitleModerationStatus + ", description=" + this.description + ", descriptionModerationStatus=" + this.descriptionModerationStatus + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionContent;", "", "isVisibleByUser", "", "itemsCountType", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "sectionTitle", "", "sectionTitleModerationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "isEmpty", "blocks", "", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSectionBlock;", "(ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;ZLjava/util/List;)V", "getBlocks", "()Ljava/util/List;", "()Z", "getItemsCountType", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "getSectionTitle", "()Ljava/lang/String;", "getSectionTitleModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetFactoidSectionContent {

        @c("blocks")
        @l
        private final List<UniversalWidgetFactoidSectionBlock> blocks;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("isVisibleByUser")
        private final boolean isVisibleByUser;

        @c("itemsCountType")
        @l
        private final UniversalWidgetFactoidItemsCountType itemsCountType;

        @c("sectionTitle")
        @l
        private final String sectionTitle;

        @c("sectionTitleModerationStatus")
        @l
        private final FieldModerationStatus sectionTitleModerationStatus;

        public UniversalWidgetFactoidSectionContent(boolean z12, @l UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType, @l String str, @l FieldModerationStatus fieldModerationStatus, boolean z13, @l List<UniversalWidgetFactoidSectionBlock> list) {
            this.isVisibleByUser = z12;
            this.itemsCountType = universalWidgetFactoidItemsCountType;
            this.sectionTitle = str;
            this.sectionTitleModerationStatus = fieldModerationStatus;
            this.isEmpty = z13;
            this.blocks = list;
        }

        public static /* synthetic */ UniversalWidgetFactoidSectionContent copy$default(UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent, boolean z12, UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType, String str, FieldModerationStatus fieldModerationStatus, boolean z13, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = universalWidgetFactoidSectionContent.isVisibleByUser;
            }
            if ((i12 & 2) != 0) {
                universalWidgetFactoidItemsCountType = universalWidgetFactoidSectionContent.itemsCountType;
            }
            UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType2 = universalWidgetFactoidItemsCountType;
            if ((i12 & 4) != 0) {
                str = universalWidgetFactoidSectionContent.sectionTitle;
            }
            String str2 = str;
            if ((i12 & 8) != 0) {
                fieldModerationStatus = universalWidgetFactoidSectionContent.sectionTitleModerationStatus;
            }
            FieldModerationStatus fieldModerationStatus2 = fieldModerationStatus;
            if ((i12 & 16) != 0) {
                z13 = universalWidgetFactoidSectionContent.isEmpty;
            }
            boolean z14 = z13;
            if ((i12 & 32) != 0) {
                list = universalWidgetFactoidSectionContent.blocks;
            }
            return universalWidgetFactoidSectionContent.copy(z12, universalWidgetFactoidItemsCountType2, str2, fieldModerationStatus2, z14, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisibleByUser() {
            return this.isVisibleByUser;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetFactoidItemsCountType getItemsCountType() {
            return this.itemsCountType;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSectionTitle() {
            return this.sectionTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final FieldModerationStatus getSectionTitleModerationStatus() {
            return this.sectionTitleModerationStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        public final List<UniversalWidgetFactoidSectionBlock> component6() {
            return this.blocks;
        }

        @k
        public final UniversalWidgetFactoidSectionContent copy(boolean isVisibleByUser, @l UniversalWidgetFactoidItemsCountType itemsCountType, @l String sectionTitle, @l FieldModerationStatus sectionTitleModerationStatus, boolean isEmpty, @l List<UniversalWidgetFactoidSectionBlock> blocks) {
            return new UniversalWidgetFactoidSectionContent(isVisibleByUser, itemsCountType, sectionTitle, sectionTitleModerationStatus, isEmpty, blocks);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetFactoidSectionContent)) {
                return false;
            }
            UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent = (UniversalWidgetFactoidSectionContent) other;
            return this.isVisibleByUser == universalWidgetFactoidSectionContent.isVisibleByUser && this.itemsCountType == universalWidgetFactoidSectionContent.itemsCountType && L.f(this.sectionTitle, universalWidgetFactoidSectionContent.sectionTitle) && L.f(this.sectionTitleModerationStatus, universalWidgetFactoidSectionContent.sectionTitleModerationStatus) && this.isEmpty == universalWidgetFactoidSectionContent.isEmpty && L.f(this.blocks, universalWidgetFactoidSectionContent.blocks);
        }

        @l
        public final List<UniversalWidgetFactoidSectionBlock> getBlocks() {
            return this.blocks;
        }

        @l
        public final UniversalWidgetFactoidItemsCountType getItemsCountType() {
            return this.itemsCountType;
        }

        @l
        public final String getSectionTitle() {
            return this.sectionTitle;
        }

        @l
        public final FieldModerationStatus getSectionTitleModerationStatus() {
            return this.sectionTitleModerationStatus;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isVisibleByUser) * 31;
            UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType = this.itemsCountType;
            int iHashCode2 = (iHashCode + (universalWidgetFactoidItemsCountType == null ? 0 : universalWidgetFactoidItemsCountType.hashCode())) * 31;
            String str = this.sectionTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus = this.sectionTitleModerationStatus;
            int i12 = r.i((iHashCode3 + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode())) * 31, 31, this.isEmpty);
            List<UniversalWidgetFactoidSectionBlock> list = this.blocks;
            return i12 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        public final boolean isVisibleByUser() {
            return this.isVisibleByUser;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetFactoidSectionContent(isVisibleByUser=");
            sb2.append(this.isVisibleByUser);
            sb2.append(", itemsCountType=");
            sb2.append(this.itemsCountType);
            sb2.append(", sectionTitle=");
            sb2.append(this.sectionTitle);
            sb2.append(", sectionTitleModerationStatus=");
            sb2.append(this.sectionTitleModerationStatus);
            sb2.append(", isEmpty=");
            sb2.append(this.isEmpty);
            sb2.append(", blocks=");
            return H.p(sb2, this.blocks, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "COMMON_FACTOID", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetFactoidType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetFactoidType[] $VALUES;

        @c("common_factoid")
        public static final UniversalWidgetFactoidType COMMON_FACTOID = new UniversalWidgetFactoidType("COMMON_FACTOID", 0, "common_factoid");

        @k
        private final String id;

        private static final /* synthetic */ UniversalWidgetFactoidType[] $values() {
            return new UniversalWidgetFactoidType[]{COMMON_FACTOID};
        }

        static {
            UniversalWidgetFactoidType[] universalWidgetFactoidTypeArr$values = $values();
            $VALUES = universalWidgetFactoidTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetFactoidTypeArr$values);
        }

        private UniversalWidgetFactoidType(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetFactoidType> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetFactoidType valueOf(String str) {
            return (UniversalWidgetFactoidType) Enum.valueOf(UniversalWidgetFactoidType.class, str);
        }

        public static UniversalWidgetFactoidType[] values() {
            return (UniversalWidgetFactoidType[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFieldValue;", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "value", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetValue;", "valueId", "", "(Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetValue;Ljava/lang/String;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetFieldValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @l
        private final UniversalWidgetValue value;

        @c("valueId")
        @k
        private final String valueId;

        public UniversalWidgetFieldValue(@l FieldModerationStatus fieldModerationStatus, @l UniversalWidgetValue universalWidgetValue, @k String str) {
            this.status = fieldModerationStatus;
            this.value = universalWidgetValue;
            this.valueId = str;
        }

        public static /* synthetic */ UniversalWidgetFieldValue copy$default(UniversalWidgetFieldValue universalWidgetFieldValue, FieldModerationStatus fieldModerationStatus, UniversalWidgetValue universalWidgetValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fieldModerationStatus = universalWidgetFieldValue.status;
            }
            if ((i12 & 2) != 0) {
                universalWidgetValue = universalWidgetFieldValue.value;
            }
            if ((i12 & 4) != 0) {
                str = universalWidgetFieldValue.valueId;
            }
            return universalWidgetFieldValue.copy(fieldModerationStatus, universalWidgetValue, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetValue getValue() {
            return this.value;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        public final UniversalWidgetFieldValue copy(@l FieldModerationStatus status, @l UniversalWidgetValue value, @k String valueId) {
            return new UniversalWidgetFieldValue(status, value, valueId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetFieldValue)) {
                return false;
            }
            UniversalWidgetFieldValue universalWidgetFieldValue = (UniversalWidgetFieldValue) other;
            return L.f(this.status, universalWidgetFieldValue.status) && L.f(this.value, universalWidgetFieldValue.value) && L.f(this.valueId, universalWidgetFieldValue.valueId);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        public final UniversalWidgetValue getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            FieldModerationStatus fieldModerationStatus = this.status;
            int iHashCode = (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode()) * 31;
            UniversalWidgetValue universalWidgetValue = this.value;
            return this.valueId.hashCode() + ((iHashCode + (universalWidgetValue != null ? universalWidgetValue.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetFieldValue(status=");
            sb2.append(this.status);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.valueId, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ONE_TO_ONE", "FOUR_TO_THREE", "THREE_TO_FOUR", "FIX", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetImageWithTextImageRatio {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetImageWithTextImageRatio[] $VALUES;

        @k
        private final String id;

        @c("1_1")
        public static final UniversalWidgetImageWithTextImageRatio ONE_TO_ONE = new UniversalWidgetImageWithTextImageRatio("ONE_TO_ONE", 0, "1_1");

        @c("4_3")
        public static final UniversalWidgetImageWithTextImageRatio FOUR_TO_THREE = new UniversalWidgetImageWithTextImageRatio("FOUR_TO_THREE", 1, "4_3");

        @c("3_4")
        public static final UniversalWidgetImageWithTextImageRatio THREE_TO_FOUR = new UniversalWidgetImageWithTextImageRatio("THREE_TO_FOUR", 2, "3_4");

        @c("fix")
        public static final UniversalWidgetImageWithTextImageRatio FIX = new UniversalWidgetImageWithTextImageRatio("FIX", 3, "fix");

        private static final /* synthetic */ UniversalWidgetImageWithTextImageRatio[] $values() {
            return new UniversalWidgetImageWithTextImageRatio[]{ONE_TO_ONE, FOUR_TO_THREE, THREE_TO_FOUR, FIX};
        }

        static {
            UniversalWidgetImageWithTextImageRatio[] universalWidgetImageWithTextImageRatioArr$values = $values();
            $VALUES = universalWidgetImageWithTextImageRatioArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetImageWithTextImageRatioArr$values);
        }

        private UniversalWidgetImageWithTextImageRatio(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetImageWithTextImageRatio> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetImageWithTextImageRatio valueOf(String str) {
            return (UniversalWidgetImageWithTextImageRatio) Enum.valueOf(UniversalWidgetImageWithTextImageRatio.class, str);
        }

        public static UniversalWidgetImageWithTextImageRatio[] values() {
            return (UniversalWidgetImageWithTextImageRatio[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSection;", "", "type", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextType;", "content", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionContent;", "(Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextType;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionContent;)V", "getContent", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionContent;", "getType", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextType;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetImageWithTextSection {

        @c("content")
        @k
        private final UniversalWidgetImageWithTextSectionContent content;

        @c("type")
        @l
        private final UniversalWidgetImageWithTextType type;

        public UniversalWidgetImageWithTextSection(@l UniversalWidgetImageWithTextType universalWidgetImageWithTextType, @k UniversalWidgetImageWithTextSectionContent universalWidgetImageWithTextSectionContent) {
            this.type = universalWidgetImageWithTextType;
            this.content = universalWidgetImageWithTextSectionContent;
        }

        public static /* synthetic */ UniversalWidgetImageWithTextSection copy$default(UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, UniversalWidgetImageWithTextType universalWidgetImageWithTextType, UniversalWidgetImageWithTextSectionContent universalWidgetImageWithTextSectionContent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalWidgetImageWithTextType = universalWidgetImageWithTextSection.type;
            }
            if ((i12 & 2) != 0) {
                universalWidgetImageWithTextSectionContent = universalWidgetImageWithTextSection.content;
            }
            return universalWidgetImageWithTextSection.copy(universalWidgetImageWithTextType, universalWidgetImageWithTextSectionContent);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalWidgetImageWithTextType getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetImageWithTextSectionContent getContent() {
            return this.content;
        }

        @k
        public final UniversalWidgetImageWithTextSection copy(@l UniversalWidgetImageWithTextType type, @k UniversalWidgetImageWithTextSectionContent content) {
            return new UniversalWidgetImageWithTextSection(type, content);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetImageWithTextSection)) {
                return false;
            }
            UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection = (UniversalWidgetImageWithTextSection) other;
            return this.type == universalWidgetImageWithTextSection.type && L.f(this.content, universalWidgetImageWithTextSection.content);
        }

        @k
        public final UniversalWidgetImageWithTextSectionContent getContent() {
            return this.content;
        }

        @l
        public final UniversalWidgetImageWithTextType getType() {
            return this.type;
        }

        public int hashCode() {
            UniversalWidgetImageWithTextType universalWidgetImageWithTextType = this.type;
            return this.content.hashCode() + ((universalWidgetImageWithTextType == null ? 0 : universalWidgetImageWithTextType.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "UniversalWidgetImageWithTextSection(type=" + this.type + ", content=" + this.content + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÌ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionBlock;", "", "isEmpty", "", "blockModerationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "title", "", "titleModerationStatus", "description", "descriptionModerationStatus", "image", "Lcom/avito/android/remote/model/Image;", "imageId", "", "imageModerationStatus", "desktopImage", "desktopImageId", "desktopImageModerationStatus", "mobileImage", "mobileImageId", "mobileImageModerationStatus", "textColor", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "(ZLcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;)V", "getBlockModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getDescription", "()Ljava/lang/String;", "getDescriptionModerationStatus", "getDesktopImage", "()Lcom/avito/android/remote/model/Image;", "getDesktopImageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDesktopImageModerationStatus", "getImage", "getImageId", "getImageModerationStatus", "()Z", "getMobileImage", "getMobileImageId", "getMobileImageModerationStatus", "getTextColor", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "getTitle", "getTitleModerationStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;)Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionBlock;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetImageWithTextSectionBlock {

        @c("blockModerationStatus")
        @l
        private final FieldModerationStatus blockModerationStatus;

        @c("description")
        @l
        private final String description;

        @c("descriptionModerationStatus")
        @l
        private final FieldModerationStatus descriptionModerationStatus;

        @c("desktopImage")
        @l
        private final Image desktopImage;

        @c("desktopImageId")
        @l
        private final Long desktopImageId;

        @c("desktopImageModerationStatus")
        @l
        private final FieldModerationStatus desktopImageModerationStatus;

        @c("image")
        @l
        private final Image image;

        @c("imageId")
        @l
        private final Long imageId;

        @c("imageModerationStatus")
        @l
        private final FieldModerationStatus imageModerationStatus;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("mobileImage")
        @l
        private final Image mobileImage;

        @c("mobileImageId")
        @l
        private final Long mobileImageId;

        @c("mobileImageModerationStatus")
        @l
        private final FieldModerationStatus mobileImageModerationStatus;

        @c("textColor")
        @l
        private final UniversalWidgetTextColor textColor;

        @c("title")
        @l
        private final String title;

        @c("titleModerationStatus")
        @l
        private final FieldModerationStatus titleModerationStatus;

        public UniversalWidgetImageWithTextSectionBlock(boolean z12, @l FieldModerationStatus fieldModerationStatus, @l String str, @l FieldModerationStatus fieldModerationStatus2, @l String str2, @l FieldModerationStatus fieldModerationStatus3, @l Image image, @l Long l12, @l FieldModerationStatus fieldModerationStatus4, @l Image image2, @l Long l13, @l FieldModerationStatus fieldModerationStatus5, @l Image image3, @l Long l14, @l FieldModerationStatus fieldModerationStatus6, @l UniversalWidgetTextColor universalWidgetTextColor) {
            this.isEmpty = z12;
            this.blockModerationStatus = fieldModerationStatus;
            this.title = str;
            this.titleModerationStatus = fieldModerationStatus2;
            this.description = str2;
            this.descriptionModerationStatus = fieldModerationStatus3;
            this.image = image;
            this.imageId = l12;
            this.imageModerationStatus = fieldModerationStatus4;
            this.desktopImage = image2;
            this.desktopImageId = l13;
            this.desktopImageModerationStatus = fieldModerationStatus5;
            this.mobileImage = image3;
            this.mobileImageId = l14;
            this.mobileImageModerationStatus = fieldModerationStatus6;
            this.textColor = universalWidgetTextColor;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Image getDesktopImage() {
            return this.desktopImage;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final Long getDesktopImageId() {
            return this.desktopImageId;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final FieldModerationStatus getDesktopImageModerationStatus() {
            return this.desktopImageModerationStatus;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final Image getMobileImage() {
            return this.mobileImage;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final Long getMobileImageId() {
            return this.mobileImageId;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final FieldModerationStatus getMobileImageModerationStatus() {
            return this.mobileImageModerationStatus;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final UniversalWidgetTextColor getTextColor() {
            return this.textColor;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Long getImageId() {
            return this.imageId;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final FieldModerationStatus getImageModerationStatus() {
            return this.imageModerationStatus;
        }

        @k
        public final UniversalWidgetImageWithTextSectionBlock copy(boolean isEmpty, @l FieldModerationStatus blockModerationStatus, @l String title, @l FieldModerationStatus titleModerationStatus, @l String description, @l FieldModerationStatus descriptionModerationStatus, @l Image image, @l Long imageId, @l FieldModerationStatus imageModerationStatus, @l Image desktopImage, @l Long desktopImageId, @l FieldModerationStatus desktopImageModerationStatus, @l Image mobileImage, @l Long mobileImageId, @l FieldModerationStatus mobileImageModerationStatus, @l UniversalWidgetTextColor textColor) {
            return new UniversalWidgetImageWithTextSectionBlock(isEmpty, blockModerationStatus, title, titleModerationStatus, description, descriptionModerationStatus, image, imageId, imageModerationStatus, desktopImage, desktopImageId, desktopImageModerationStatus, mobileImage, mobileImageId, mobileImageModerationStatus, textColor);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetImageWithTextSectionBlock)) {
                return false;
            }
            UniversalWidgetImageWithTextSectionBlock universalWidgetImageWithTextSectionBlock = (UniversalWidgetImageWithTextSectionBlock) other;
            return this.isEmpty == universalWidgetImageWithTextSectionBlock.isEmpty && L.f(this.blockModerationStatus, universalWidgetImageWithTextSectionBlock.blockModerationStatus) && L.f(this.title, universalWidgetImageWithTextSectionBlock.title) && L.f(this.titleModerationStatus, universalWidgetImageWithTextSectionBlock.titleModerationStatus) && L.f(this.description, universalWidgetImageWithTextSectionBlock.description) && L.f(this.descriptionModerationStatus, universalWidgetImageWithTextSectionBlock.descriptionModerationStatus) && L.f(this.image, universalWidgetImageWithTextSectionBlock.image) && L.f(this.imageId, universalWidgetImageWithTextSectionBlock.imageId) && L.f(this.imageModerationStatus, universalWidgetImageWithTextSectionBlock.imageModerationStatus) && L.f(this.desktopImage, universalWidgetImageWithTextSectionBlock.desktopImage) && L.f(this.desktopImageId, universalWidgetImageWithTextSectionBlock.desktopImageId) && L.f(this.desktopImageModerationStatus, universalWidgetImageWithTextSectionBlock.desktopImageModerationStatus) && L.f(this.mobileImage, universalWidgetImageWithTextSectionBlock.mobileImage) && L.f(this.mobileImageId, universalWidgetImageWithTextSectionBlock.mobileImageId) && L.f(this.mobileImageModerationStatus, universalWidgetImageWithTextSectionBlock.mobileImageModerationStatus) && this.textColor == universalWidgetImageWithTextSectionBlock.textColor;
        }

        @l
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @l
        public final Image getDesktopImage() {
            return this.desktopImage;
        }

        @l
        public final Long getDesktopImageId() {
            return this.desktopImageId;
        }

        @l
        public final FieldModerationStatus getDesktopImageModerationStatus() {
            return this.desktopImageModerationStatus;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final Long getImageId() {
            return this.imageId;
        }

        @l
        public final FieldModerationStatus getImageModerationStatus() {
            return this.imageModerationStatus;
        }

        @l
        public final Image getMobileImage() {
            return this.mobileImage;
        }

        @l
        public final Long getMobileImageId() {
            return this.mobileImageId;
        }

        @l
        public final FieldModerationStatus getMobileImageModerationStatus() {
            return this.mobileImageModerationStatus;
        }

        @l
        public final UniversalWidgetTextColor getTextColor() {
            return this.textColor;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEmpty) * 31;
            FieldModerationStatus fieldModerationStatus = this.blockModerationStatus;
            int iHashCode2 = (iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus2 = this.titleModerationStatus;
            int iHashCode4 = (iHashCode3 + (fieldModerationStatus2 == null ? 0 : fieldModerationStatus2.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus3 = this.descriptionModerationStatus;
            int iHashCode6 = (iHashCode5 + (fieldModerationStatus3 == null ? 0 : fieldModerationStatus3.hashCode())) * 31;
            Image image = this.image;
            int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
            Long l12 = this.imageId;
            int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus4 = this.imageModerationStatus;
            int iHashCode9 = (iHashCode8 + (fieldModerationStatus4 == null ? 0 : fieldModerationStatus4.hashCode())) * 31;
            Image image2 = this.desktopImage;
            int iHashCode10 = (iHashCode9 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Long l13 = this.desktopImageId;
            int iHashCode11 = (iHashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus5 = this.desktopImageModerationStatus;
            int iHashCode12 = (iHashCode11 + (fieldModerationStatus5 == null ? 0 : fieldModerationStatus5.hashCode())) * 31;
            Image image3 = this.mobileImage;
            int iHashCode13 = (iHashCode12 + (image3 == null ? 0 : image3.hashCode())) * 31;
            Long l14 = this.mobileImageId;
            int iHashCode14 = (iHashCode13 + (l14 == null ? 0 : l14.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus6 = this.mobileImageModerationStatus;
            int iHashCode15 = (iHashCode14 + (fieldModerationStatus6 == null ? 0 : fieldModerationStatus6.hashCode())) * 31;
            UniversalWidgetTextColor universalWidgetTextColor = this.textColor;
            return iHashCode15 + (universalWidgetTextColor != null ? universalWidgetTextColor.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @k
        public String toString() {
            return "UniversalWidgetImageWithTextSectionBlock(isEmpty=" + this.isEmpty + ", blockModerationStatus=" + this.blockModerationStatus + ", title=" + this.title + ", titleModerationStatus=" + this.titleModerationStatus + ", description=" + this.description + ", descriptionModerationStatus=" + this.descriptionModerationStatus + ", image=" + this.image + ", imageId=" + this.imageId + ", imageModerationStatus=" + this.imageModerationStatus + ", desktopImage=" + this.desktopImage + ", desktopImageId=" + this.desktopImageId + ", desktopImageModerationStatus=" + this.desktopImageModerationStatus + ", mobileImage=" + this.mobileImage + ", mobileImageId=" + this.mobileImageId + ", mobileImageModerationStatus=" + this.mobileImageModerationStatus + ", textColor=" + this.textColor + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionContent;", "", "isVisibleByUser", "", "imgRatio", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "textPosition", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "textPositionImageWithText", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "sectionTitle", "", "sectionTitleModerationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "isEmpty", "blocks", "", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSectionBlock;", "(ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;ZLjava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getImgRatio", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "()Z", "getSectionTitle", "()Ljava/lang/String;", "getSectionTitleModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getTextPosition", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "getTextPositionImageWithText", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetImageWithTextSectionContent {

        @c("blocks")
        @l
        private final List<UniversalWidgetImageWithTextSectionBlock> blocks;

        @c("imgRatio")
        @l
        private final UniversalWidgetImageWithTextImageRatio imgRatio;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("isVisibleByUser")
        private final boolean isVisibleByUser;

        @c("sectionTitle")
        @l
        private final String sectionTitle;

        @c("sectionTitleModerationStatus")
        @l
        private final FieldModerationStatus sectionTitleModerationStatus;

        @c("textPosition")
        @l
        private final UniversalWidgetTextPosition textPosition;

        @c("textPositionImageWithText")
        @l
        private final UniversalWidgetTextPositionImageWithText textPositionImageWithText;

        public UniversalWidgetImageWithTextSectionContent(boolean z12, @l UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio, @l UniversalWidgetTextPosition universalWidgetTextPosition, @l UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText, @l String str, @l FieldModerationStatus fieldModerationStatus, boolean z13, @l List<UniversalWidgetImageWithTextSectionBlock> list) {
            this.isVisibleByUser = z12;
            this.imgRatio = universalWidgetImageWithTextImageRatio;
            this.textPosition = universalWidgetTextPosition;
            this.textPositionImageWithText = universalWidgetTextPositionImageWithText;
            this.sectionTitle = str;
            this.sectionTitleModerationStatus = fieldModerationStatus;
            this.isEmpty = z13;
            this.blocks = list;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisibleByUser() {
            return this.isVisibleByUser;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetImageWithTextImageRatio getImgRatio() {
            return this.imgRatio;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalWidgetTextPosition getTextPosition() {
            return this.textPosition;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalWidgetTextPositionImageWithText getTextPositionImageWithText() {
            return this.textPositionImageWithText;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getSectionTitle() {
            return this.sectionTitle;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final FieldModerationStatus getSectionTitleModerationStatus() {
            return this.sectionTitleModerationStatus;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        public final List<UniversalWidgetImageWithTextSectionBlock> component8() {
            return this.blocks;
        }

        @k
        public final UniversalWidgetImageWithTextSectionContent copy(boolean isVisibleByUser, @l UniversalWidgetImageWithTextImageRatio imgRatio, @l UniversalWidgetTextPosition textPosition, @l UniversalWidgetTextPositionImageWithText textPositionImageWithText, @l String sectionTitle, @l FieldModerationStatus sectionTitleModerationStatus, boolean isEmpty, @l List<UniversalWidgetImageWithTextSectionBlock> blocks) {
            return new UniversalWidgetImageWithTextSectionContent(isVisibleByUser, imgRatio, textPosition, textPositionImageWithText, sectionTitle, sectionTitleModerationStatus, isEmpty, blocks);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetImageWithTextSectionContent)) {
                return false;
            }
            UniversalWidgetImageWithTextSectionContent universalWidgetImageWithTextSectionContent = (UniversalWidgetImageWithTextSectionContent) other;
            return this.isVisibleByUser == universalWidgetImageWithTextSectionContent.isVisibleByUser && this.imgRatio == universalWidgetImageWithTextSectionContent.imgRatio && this.textPosition == universalWidgetImageWithTextSectionContent.textPosition && this.textPositionImageWithText == universalWidgetImageWithTextSectionContent.textPositionImageWithText && L.f(this.sectionTitle, universalWidgetImageWithTextSectionContent.sectionTitle) && L.f(this.sectionTitleModerationStatus, universalWidgetImageWithTextSectionContent.sectionTitleModerationStatus) && this.isEmpty == universalWidgetImageWithTextSectionContent.isEmpty && L.f(this.blocks, universalWidgetImageWithTextSectionContent.blocks);
        }

        @l
        public final List<UniversalWidgetImageWithTextSectionBlock> getBlocks() {
            return this.blocks;
        }

        @l
        public final UniversalWidgetImageWithTextImageRatio getImgRatio() {
            return this.imgRatio;
        }

        @l
        public final String getSectionTitle() {
            return this.sectionTitle;
        }

        @l
        public final FieldModerationStatus getSectionTitleModerationStatus() {
            return this.sectionTitleModerationStatus;
        }

        @l
        public final UniversalWidgetTextPosition getTextPosition() {
            return this.textPosition;
        }

        @l
        public final UniversalWidgetTextPositionImageWithText getTextPositionImageWithText() {
            return this.textPositionImageWithText;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isVisibleByUser) * 31;
            UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio = this.imgRatio;
            int iHashCode2 = (iHashCode + (universalWidgetImageWithTextImageRatio == null ? 0 : universalWidgetImageWithTextImageRatio.hashCode())) * 31;
            UniversalWidgetTextPosition universalWidgetTextPosition = this.textPosition;
            int iHashCode3 = (iHashCode2 + (universalWidgetTextPosition == null ? 0 : universalWidgetTextPosition.hashCode())) * 31;
            UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText = this.textPositionImageWithText;
            int iHashCode4 = (iHashCode3 + (universalWidgetTextPositionImageWithText == null ? 0 : universalWidgetTextPositionImageWithText.hashCode())) * 31;
            String str = this.sectionTitle;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus = this.sectionTitleModerationStatus;
            int i12 = r.i((iHashCode5 + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode())) * 31, 31, this.isEmpty);
            List<UniversalWidgetImageWithTextSectionBlock> list = this.blocks;
            return i12 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        public final boolean isVisibleByUser() {
            return this.isVisibleByUser;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetImageWithTextSectionContent(isVisibleByUser=");
            sb2.append(this.isVisibleByUser);
            sb2.append(", imgRatio=");
            sb2.append(this.imgRatio);
            sb2.append(", textPosition=");
            sb2.append(this.textPosition);
            sb2.append(", textPositionImageWithText=");
            sb2.append(this.textPositionImageWithText);
            sb2.append(", sectionTitle=");
            sb2.append(this.sectionTitle);
            sb2.append(", sectionTitleModerationStatus=");
            sb2.append(this.sectionTitleModerationStatus);
            sb2.append(", isEmpty=");
            sb2.append(this.isEmpty);
            sb2.append(", blocks=");
            return H.p(sb2, this.blocks, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "FULL_WIDTH", "IMG_WITH_TEXT", "TWO_COLUMNS", "THREE_COLUMNS", "FOUR_COLUMNS", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetImageWithTextType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetImageWithTextType[] $VALUES;

        @k
        private final String id;

        @c("full_width")
        public static final UniversalWidgetImageWithTextType FULL_WIDTH = new UniversalWidgetImageWithTextType("FULL_WIDTH", 0, "full_width");

        @c("img_with_text")
        public static final UniversalWidgetImageWithTextType IMG_WITH_TEXT = new UniversalWidgetImageWithTextType("IMG_WITH_TEXT", 1, "img_with_text");

        @c("2_columns")
        public static final UniversalWidgetImageWithTextType TWO_COLUMNS = new UniversalWidgetImageWithTextType("TWO_COLUMNS", 2, "2_columns");

        @c("3_columns")
        public static final UniversalWidgetImageWithTextType THREE_COLUMNS = new UniversalWidgetImageWithTextType("THREE_COLUMNS", 3, "3_columns");

        @c("4_columns")
        public static final UniversalWidgetImageWithTextType FOUR_COLUMNS = new UniversalWidgetImageWithTextType("FOUR_COLUMNS", 4, "4_columns");

        private static final /* synthetic */ UniversalWidgetImageWithTextType[] $values() {
            return new UniversalWidgetImageWithTextType[]{FULL_WIDTH, IMG_WITH_TEXT, TWO_COLUMNS, THREE_COLUMNS, FOUR_COLUMNS};
        }

        static {
            UniversalWidgetImageWithTextType[] universalWidgetImageWithTextTypeArr$values = $values();
            $VALUES = universalWidgetImageWithTextTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetImageWithTextTypeArr$values);
        }

        private UniversalWidgetImageWithTextType(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetImageWithTextType> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetImageWithTextType valueOf(String str) {
            return (UniversalWidgetImageWithTextType) Enum.valueOf(UniversalWidgetImageWithTextType.class, str);
        }

        public static UniversalWidgetImageWithTextType[] values() {
            return (UniversalWidgetImageWithTextType[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetSectionVisibilityStatus;", "Landroid/os/Parcelable;", "", "isVisibleInBx", "canChangeVisibility", "requiredFilling", "", "title", "description", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(ZZZLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetSectionVisibilityStatus;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getCanChangeVisibility", "getRequiredFilling", "Ljava/lang/String;", "getTitle", "getDescription", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetSectionVisibilityStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<UniversalWidgetSectionVisibilityStatus> CREATOR = new Creator();

        @c("canChangeVisibility")
        private final boolean canChangeVisibility;

        @c("description")
        @l
        private final String description;

        @c("isVisibleInBx")
        private final boolean isVisibleInBx;

        @c("requiredFilling")
        private final boolean requiredFilling;

        @c("title")
        @l
        private final String title;

        /* compiled from: UniversalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UniversalWidgetSectionVisibilityStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UniversalWidgetSectionVisibilityStatus createFromParcel(@k Parcel parcel) {
                return new UniversalWidgetSectionVisibilityStatus(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UniversalWidgetSectionVisibilityStatus[] newArray(int i12) {
                return new UniversalWidgetSectionVisibilityStatus[i12];
            }
        }

        public UniversalWidgetSectionVisibilityStatus(boolean z12, boolean z13, boolean z14, @l String str, @l String str2) {
            this.isVisibleInBx = z12;
            this.canChangeVisibility = z13;
            this.requiredFilling = z14;
            this.title = str;
            this.description = str2;
        }

        public static /* synthetic */ UniversalWidgetSectionVisibilityStatus copy$default(UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, boolean z12, boolean z13, boolean z14, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = universalWidgetSectionVisibilityStatus.isVisibleInBx;
            }
            if ((i12 & 2) != 0) {
                z13 = universalWidgetSectionVisibilityStatus.canChangeVisibility;
            }
            boolean z15 = z13;
            if ((i12 & 4) != 0) {
                z14 = universalWidgetSectionVisibilityStatus.requiredFilling;
            }
            boolean z16 = z14;
            if ((i12 & 8) != 0) {
                str = universalWidgetSectionVisibilityStatus.title;
            }
            String str3 = str;
            if ((i12 & 16) != 0) {
                str2 = universalWidgetSectionVisibilityStatus.description;
            }
            return universalWidgetSectionVisibilityStatus.copy(z12, z15, z16, str3, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisibleInBx() {
            return this.isVisibleInBx;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanChangeVisibility() {
            return this.canChangeVisibility;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequiredFilling() {
            return this.requiredFilling;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        public final UniversalWidgetSectionVisibilityStatus copy(boolean isVisibleInBx, boolean canChangeVisibility, boolean requiredFilling, @l String title, @l String description) {
            return new UniversalWidgetSectionVisibilityStatus(isVisibleInBx, canChangeVisibility, requiredFilling, title, description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetSectionVisibilityStatus)) {
                return false;
            }
            UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus = (UniversalWidgetSectionVisibilityStatus) other;
            return this.isVisibleInBx == universalWidgetSectionVisibilityStatus.isVisibleInBx && this.canChangeVisibility == universalWidgetSectionVisibilityStatus.canChangeVisibility && this.requiredFilling == universalWidgetSectionVisibilityStatus.requiredFilling && L.f(this.title, universalWidgetSectionVisibilityStatus.title) && L.f(this.description, universalWidgetSectionVisibilityStatus.description);
        }

        public final boolean getCanChangeVisibility() {
            return this.canChangeVisibility;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        public final boolean getRequiredFilling() {
            return this.requiredFilling;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i12 = r.i(r.i(Boolean.hashCode(this.isVisibleInBx) * 31, 31, this.canChangeVisibility), 31, this.requiredFilling);
            String str = this.title;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean isVisibleInBx() {
            return this.isVisibleInBx;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetSectionVisibilityStatus(isVisibleInBx=");
            sb2.append(this.isVisibleInBx);
            sb2.append(", canChangeVisibility=");
            sb2.append(this.canChangeVisibility);
            sb2.append(", requiredFilling=");
            sb2.append(this.requiredFilling);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", description=");
            return C22026a.c(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isVisibleInBx ? 1 : 0);
            parcel.writeInt(this.canChangeVisibility ? 1 : 0);
            parcel.writeInt(this.requiredFilling ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "BLACK", "WHITE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetTextColor {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetTextColor[] $VALUES;

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final UniversalWidgetTextColor BLACK = new UniversalWidgetTextColor("BLACK", 0, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);

        @c("white")
        public static final UniversalWidgetTextColor WHITE = new UniversalWidgetTextColor("WHITE", 1, "white");

        @k
        private final String id;

        private static final /* synthetic */ UniversalWidgetTextColor[] $values() {
            return new UniversalWidgetTextColor[]{BLACK, WHITE};
        }

        static {
            UniversalWidgetTextColor[] universalWidgetTextColorArr$values = $values();
            $VALUES = universalWidgetTextColorArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetTextColorArr$values);
        }

        private UniversalWidgetTextColor(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetTextColor> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetTextColor valueOf(String str) {
            return (UniversalWidgetTextColor) Enum.valueOf(UniversalWidgetTextColor.class, str);
        }

        public static UniversalWidgetTextColor[] values() {
            return (UniversalWidgetTextColor[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "IN", "OUT", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetTextPosition {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetTextPosition[] $VALUES;

        /* renamed from: IN, reason: collision with root package name */
        @c("in")
        public static final UniversalWidgetTextPosition f253843IN = new UniversalWidgetTextPosition("IN", 0, "in");

        @c("out")
        public static final UniversalWidgetTextPosition OUT = new UniversalWidgetTextPosition("OUT", 1, "out");

        @k
        private final String id;

        private static final /* synthetic */ UniversalWidgetTextPosition[] $values() {
            return new UniversalWidgetTextPosition[]{f253843IN, OUT};
        }

        static {
            UniversalWidgetTextPosition[] universalWidgetTextPositionArr$values = $values();
            $VALUES = universalWidgetTextPositionArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetTextPositionArr$values);
        }

        private UniversalWidgetTextPosition(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetTextPosition> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetTextPosition valueOf(String str) {
            return (UniversalWidgetTextPosition) Enum.valueOf(UniversalWidgetTextPosition.class, str);
        }

        public static UniversalWidgetTextPosition[] values() {
            return (UniversalWidgetTextPosition[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "IMAGE_FIRST", "TEXT_FIRST", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetTextPositionImageWithText {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetTextPositionImageWithText[] $VALUES;

        @c("imageFirst")
        public static final UniversalWidgetTextPositionImageWithText IMAGE_FIRST = new UniversalWidgetTextPositionImageWithText("IMAGE_FIRST", 0, "imageFirst");

        @c("textFirst")
        public static final UniversalWidgetTextPositionImageWithText TEXT_FIRST = new UniversalWidgetTextPositionImageWithText("TEXT_FIRST", 1, "textFirst");

        @k
        private final String id;

        private static final /* synthetic */ UniversalWidgetTextPositionImageWithText[] $values() {
            return new UniversalWidgetTextPositionImageWithText[]{IMAGE_FIRST, TEXT_FIRST};
        }

        static {
            UniversalWidgetTextPositionImageWithText[] universalWidgetTextPositionImageWithTextArr$values = $values();
            $VALUES = universalWidgetTextPositionImageWithTextArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetTextPositionImageWithTextArr$values);
        }

        private UniversalWidgetTextPositionImageWithText(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetTextPositionImageWithText> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetTextPositionImageWithText valueOf(String str) {
            return (UniversalWidgetTextPositionImageWithText) Enum.valueOf(UniversalWidgetTextPositionImageWithText.class, str);
        }

        public static UniversalWidgetTextPositionImageWithText[] values() {
            return (UniversalWidgetTextPositionImageWithText[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSection;", "", "type", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextType;", "content", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionContent;", "(Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextType;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionContent;)V", "getContent", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionContent;", "getType", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextType;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetTextSection {

        @c("content")
        @k
        private final UniversalWidgetTextSectionContent content;

        @c("type")
        @l
        private final UniversalWidgetTextType type;

        public UniversalWidgetTextSection(@l UniversalWidgetTextType universalWidgetTextType, @k UniversalWidgetTextSectionContent universalWidgetTextSectionContent) {
            this.type = universalWidgetTextType;
            this.content = universalWidgetTextSectionContent;
        }

        public static /* synthetic */ UniversalWidgetTextSection copy$default(UniversalWidgetTextSection universalWidgetTextSection, UniversalWidgetTextType universalWidgetTextType, UniversalWidgetTextSectionContent universalWidgetTextSectionContent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalWidgetTextType = universalWidgetTextSection.type;
            }
            if ((i12 & 2) != 0) {
                universalWidgetTextSectionContent = universalWidgetTextSection.content;
            }
            return universalWidgetTextSection.copy(universalWidgetTextType, universalWidgetTextSectionContent);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalWidgetTextType getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetTextSectionContent getContent() {
            return this.content;
        }

        @k
        public final UniversalWidgetTextSection copy(@l UniversalWidgetTextType type, @k UniversalWidgetTextSectionContent content) {
            return new UniversalWidgetTextSection(type, content);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetTextSection)) {
                return false;
            }
            UniversalWidgetTextSection universalWidgetTextSection = (UniversalWidgetTextSection) other;
            return this.type == universalWidgetTextSection.type && L.f(this.content, universalWidgetTextSection.content);
        }

        @k
        public final UniversalWidgetTextSectionContent getContent() {
            return this.content;
        }

        @l
        public final UniversalWidgetTextType getType() {
            return this.type;
        }

        public int hashCode() {
            UniversalWidgetTextType universalWidgetTextType = this.type;
            return this.content.hashCode() + ((universalWidgetTextType == null ? 0 : universalWidgetTextType.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "UniversalWidgetTextSection(type=" + this.type + ", content=" + this.content + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionBlock;", "", "isEmpty", "", "blockModerationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "title", "", "titleModerationStatus", "description", "descriptionModerationStatus", "(ZLcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getBlockModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getDescription", "()Ljava/lang/String;", "getDescriptionModerationStatus", "()Z", "getTitle", "getTitleModerationStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetTextSectionBlock {

        @c("blockModerationStatus")
        @l
        private final FieldModerationStatus blockModerationStatus;

        @c("description")
        @l
        private final String description;

        @c("descriptionModerationStatus")
        @l
        private final FieldModerationStatus descriptionModerationStatus;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("title")
        @l
        private final String title;

        @c("titleModerationStatus")
        @l
        private final FieldModerationStatus titleModerationStatus;

        public UniversalWidgetTextSectionBlock(boolean z12, @l FieldModerationStatus fieldModerationStatus, @l String str, @l FieldModerationStatus fieldModerationStatus2, @l String str2, @l FieldModerationStatus fieldModerationStatus3) {
            this.isEmpty = z12;
            this.blockModerationStatus = fieldModerationStatus;
            this.title = str;
            this.titleModerationStatus = fieldModerationStatus2;
            this.description = str2;
            this.descriptionModerationStatus = fieldModerationStatus3;
        }

        public static /* synthetic */ UniversalWidgetTextSectionBlock copy$default(UniversalWidgetTextSectionBlock universalWidgetTextSectionBlock, boolean z12, FieldModerationStatus fieldModerationStatus, String str, FieldModerationStatus fieldModerationStatus2, String str2, FieldModerationStatus fieldModerationStatus3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = universalWidgetTextSectionBlock.isEmpty;
            }
            if ((i12 & 2) != 0) {
                fieldModerationStatus = universalWidgetTextSectionBlock.blockModerationStatus;
            }
            FieldModerationStatus fieldModerationStatus4 = fieldModerationStatus;
            if ((i12 & 4) != 0) {
                str = universalWidgetTextSectionBlock.title;
            }
            String str3 = str;
            if ((i12 & 8) != 0) {
                fieldModerationStatus2 = universalWidgetTextSectionBlock.titleModerationStatus;
            }
            FieldModerationStatus fieldModerationStatus5 = fieldModerationStatus2;
            if ((i12 & 16) != 0) {
                str2 = universalWidgetTextSectionBlock.description;
            }
            String str4 = str2;
            if ((i12 & 32) != 0) {
                fieldModerationStatus3 = universalWidgetTextSectionBlock.descriptionModerationStatus;
            }
            return universalWidgetTextSectionBlock.copy(z12, fieldModerationStatus4, str3, fieldModerationStatus5, str4, fieldModerationStatus3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @k
        public final UniversalWidgetTextSectionBlock copy(boolean isEmpty, @l FieldModerationStatus blockModerationStatus, @l String title, @l FieldModerationStatus titleModerationStatus, @l String description, @l FieldModerationStatus descriptionModerationStatus) {
            return new UniversalWidgetTextSectionBlock(isEmpty, blockModerationStatus, title, titleModerationStatus, description, descriptionModerationStatus);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetTextSectionBlock)) {
                return false;
            }
            UniversalWidgetTextSectionBlock universalWidgetTextSectionBlock = (UniversalWidgetTextSectionBlock) other;
            return this.isEmpty == universalWidgetTextSectionBlock.isEmpty && L.f(this.blockModerationStatus, universalWidgetTextSectionBlock.blockModerationStatus) && L.f(this.title, universalWidgetTextSectionBlock.title) && L.f(this.titleModerationStatus, universalWidgetTextSectionBlock.titleModerationStatus) && L.f(this.description, universalWidgetTextSectionBlock.description) && L.f(this.descriptionModerationStatus, universalWidgetTextSectionBlock.descriptionModerationStatus);
        }

        @l
        public final FieldModerationStatus getBlockModerationStatus() {
            return this.blockModerationStatus;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final FieldModerationStatus getDescriptionModerationStatus() {
            return this.descriptionModerationStatus;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final FieldModerationStatus getTitleModerationStatus() {
            return this.titleModerationStatus;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEmpty) * 31;
            FieldModerationStatus fieldModerationStatus = this.blockModerationStatus;
            int iHashCode2 = (iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus2 = this.titleModerationStatus;
            int iHashCode4 = (iHashCode3 + (fieldModerationStatus2 == null ? 0 : fieldModerationStatus2.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FieldModerationStatus fieldModerationStatus3 = this.descriptionModerationStatus;
            return iHashCode5 + (fieldModerationStatus3 != null ? fieldModerationStatus3.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @k
        public String toString() {
            return "UniversalWidgetTextSectionBlock(isEmpty=" + this.isEmpty + ", blockModerationStatus=" + this.blockModerationStatus + ", title=" + this.title + ", titleModerationStatus=" + this.titleModerationStatus + ", description=" + this.description + ", descriptionModerationStatus=" + this.descriptionModerationStatus + ')';
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionContent;", "", "isVisibleByUser", "", "titlePosition", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "isEmpty", "blocks", "", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSectionBlock;", "(ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;ZLjava/util/List;)V", "getBlocks", "()Ljava/util/List;", "()Z", "getTitlePosition", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetTextSectionContent {

        @c("blocks")
        @l
        private final List<UniversalWidgetTextSectionBlock> blocks;

        @c("isEmpty")
        private final boolean isEmpty;

        @c("isVisibleByUser")
        private final boolean isVisibleByUser;

        @c("titlePosition")
        @l
        private final UniversalWidgetTextTitlePosition titlePosition;

        public UniversalWidgetTextSectionContent(boolean z12, @l UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition, boolean z13, @l List<UniversalWidgetTextSectionBlock> list) {
            this.isVisibleByUser = z12;
            this.titlePosition = universalWidgetTextTitlePosition;
            this.isEmpty = z13;
            this.blocks = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UniversalWidgetTextSectionContent copy$default(UniversalWidgetTextSectionContent universalWidgetTextSectionContent, boolean z12, UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition, boolean z13, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = universalWidgetTextSectionContent.isVisibleByUser;
            }
            if ((i12 & 2) != 0) {
                universalWidgetTextTitlePosition = universalWidgetTextSectionContent.titlePosition;
            }
            if ((i12 & 4) != 0) {
                z13 = universalWidgetTextSectionContent.isEmpty;
            }
            if ((i12 & 8) != 0) {
                list = universalWidgetTextSectionContent.blocks;
            }
            return universalWidgetTextSectionContent.copy(z12, universalWidgetTextTitlePosition, z13, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisibleByUser() {
            return this.isVisibleByUser;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetTextTitlePosition getTitlePosition() {
            return this.titlePosition;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @l
        public final List<UniversalWidgetTextSectionBlock> component4() {
            return this.blocks;
        }

        @k
        public final UniversalWidgetTextSectionContent copy(boolean isVisibleByUser, @l UniversalWidgetTextTitlePosition titlePosition, boolean isEmpty, @l List<UniversalWidgetTextSectionBlock> blocks) {
            return new UniversalWidgetTextSectionContent(isVisibleByUser, titlePosition, isEmpty, blocks);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetTextSectionContent)) {
                return false;
            }
            UniversalWidgetTextSectionContent universalWidgetTextSectionContent = (UniversalWidgetTextSectionContent) other;
            return this.isVisibleByUser == universalWidgetTextSectionContent.isVisibleByUser && this.titlePosition == universalWidgetTextSectionContent.titlePosition && this.isEmpty == universalWidgetTextSectionContent.isEmpty && L.f(this.blocks, universalWidgetTextSectionContent.blocks);
        }

        @l
        public final List<UniversalWidgetTextSectionBlock> getBlocks() {
            return this.blocks;
        }

        @l
        public final UniversalWidgetTextTitlePosition getTitlePosition() {
            return this.titlePosition;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isVisibleByUser) * 31;
            UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition = this.titlePosition;
            int i12 = r.i((iHashCode + (universalWidgetTextTitlePosition == null ? 0 : universalWidgetTextTitlePosition.hashCode())) * 31, 31, this.isEmpty);
            List<UniversalWidgetTextSectionBlock> list = this.blocks;
            return i12 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        public final boolean isVisibleByUser() {
            return this.isVisibleByUser;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetTextSectionContent(isVisibleByUser=");
            sb2.append(this.isVisibleByUser);
            sb2.append(", titlePosition=");
            sb2.append(this.titlePosition);
            sb2.append(", isEmpty=");
            sb2.append(this.isEmpty);
            sb2.append(", blocks=");
            return H.p(sb2, this.blocks, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "UP", "LEFT", "RIGHT", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetTextTitlePosition {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetTextTitlePosition[] $VALUES;

        @k
        private final String id;

        /* renamed from: UP, reason: collision with root package name */
        @c(ServiceTypeKt.SERVICE_PUSHUP)
        public static final UniversalWidgetTextTitlePosition f253846UP = new UniversalWidgetTextTitlePosition("UP", 0, ServiceTypeKt.SERVICE_PUSHUP);

        @c("left")
        public static final UniversalWidgetTextTitlePosition LEFT = new UniversalWidgetTextTitlePosition("LEFT", 1, "left");

        @c("right")
        public static final UniversalWidgetTextTitlePosition RIGHT = new UniversalWidgetTextTitlePosition("RIGHT", 2, "right");

        private static final /* synthetic */ UniversalWidgetTextTitlePosition[] $values() {
            return new UniversalWidgetTextTitlePosition[]{f253846UP, LEFT, RIGHT};
        }

        static {
            UniversalWidgetTextTitlePosition[] universalWidgetTextTitlePositionArr$values = $values();
            $VALUES = universalWidgetTextTitlePositionArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetTextTitlePositionArr$values);
        }

        private UniversalWidgetTextTitlePosition(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetTextTitlePosition> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetTextTitlePosition valueOf(String str) {
            return (UniversalWidgetTextTitlePosition) Enum.valueOf(UniversalWidgetTextTitlePosition.class, str);
        }

        public static UniversalWidgetTextTitlePosition[] values() {
            return (UniversalWidgetTextTitlePosition[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "FULL_WIDTH", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniversalWidgetTextType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UniversalWidgetTextType[] $VALUES;

        @c("full_width")
        public static final UniversalWidgetTextType FULL_WIDTH = new UniversalWidgetTextType("FULL_WIDTH", 0, "full_width");

        @k
        private final String id;

        private static final /* synthetic */ UniversalWidgetTextType[] $values() {
            return new UniversalWidgetTextType[]{FULL_WIDTH};
        }

        static {
            UniversalWidgetTextType[] universalWidgetTextTypeArr$values = $values();
            $VALUES = universalWidgetTextTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(universalWidgetTextTypeArr$values);
        }

        private UniversalWidgetTextType(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static kotlin.enums.a<UniversalWidgetTextType> getEntries() {
            return $ENTRIES;
        }

        public static UniversalWidgetTextType valueOf(String str) {
            return (UniversalWidgetTextType) Enum.valueOf(UniversalWidgetTextType.class, str);
        }

        public static UniversalWidgetTextType[] values() {
            return (UniversalWidgetTextType[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: UniversalWidget.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetValue;", "", "visibilityStatus", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetSectionVisibilityStatus;", "factoid", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSection;", "text", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSection;", "imageWithText", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSection;", "(Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetSectionVisibilityStatus;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSection;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSection;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSection;)V", "getFactoid", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidSection;", "getImageWithText", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextSection;", "getText", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextSection;", "getVisibilityStatus", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetSectionVisibilityStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetValue {

        @c("factoid")
        @l
        private final UniversalWidgetFactoidSection factoid;

        @c("imageWithText")
        @l
        private final UniversalWidgetImageWithTextSection imageWithText;

        @c("text")
        @l
        private final UniversalWidgetTextSection text;

        @c("visibilityStatus")
        @k
        private final UniversalWidgetSectionVisibilityStatus visibilityStatus;

        public UniversalWidgetValue(@k UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, @l UniversalWidgetFactoidSection universalWidgetFactoidSection, @l UniversalWidgetTextSection universalWidgetTextSection, @l UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection) {
            this.visibilityStatus = universalWidgetSectionVisibilityStatus;
            this.factoid = universalWidgetFactoidSection;
            this.text = universalWidgetTextSection;
            this.imageWithText = universalWidgetImageWithTextSection;
        }

        public static /* synthetic */ UniversalWidgetValue copy$default(UniversalWidgetValue universalWidgetValue, UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, UniversalWidgetFactoidSection universalWidgetFactoidSection, UniversalWidgetTextSection universalWidgetTextSection, UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalWidgetSectionVisibilityStatus = universalWidgetValue.visibilityStatus;
            }
            if ((i12 & 2) != 0) {
                universalWidgetFactoidSection = universalWidgetValue.factoid;
            }
            if ((i12 & 4) != 0) {
                universalWidgetTextSection = universalWidgetValue.text;
            }
            if ((i12 & 8) != 0) {
                universalWidgetImageWithTextSection = universalWidgetValue.imageWithText;
            }
            return universalWidgetValue.copy(universalWidgetSectionVisibilityStatus, universalWidgetFactoidSection, universalWidgetTextSection, universalWidgetImageWithTextSection);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalWidgetSectionVisibilityStatus getVisibilityStatus() {
            return this.visibilityStatus;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetFactoidSection getFactoid() {
            return this.factoid;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalWidgetTextSection getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalWidgetImageWithTextSection getImageWithText() {
            return this.imageWithText;
        }

        @k
        public final UniversalWidgetValue copy(@k UniversalWidgetSectionVisibilityStatus visibilityStatus, @l UniversalWidgetFactoidSection factoid, @l UniversalWidgetTextSection text, @l UniversalWidgetImageWithTextSection imageWithText) {
            return new UniversalWidgetValue(visibilityStatus, factoid, text, imageWithText);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UniversalWidgetValue)) {
                return false;
            }
            UniversalWidgetValue universalWidgetValue = (UniversalWidgetValue) other;
            return L.f(this.visibilityStatus, universalWidgetValue.visibilityStatus) && L.f(this.factoid, universalWidgetValue.factoid) && L.f(this.text, universalWidgetValue.text) && L.f(this.imageWithText, universalWidgetValue.imageWithText);
        }

        @l
        public final UniversalWidgetFactoidSection getFactoid() {
            return this.factoid;
        }

        @l
        public final UniversalWidgetImageWithTextSection getImageWithText() {
            return this.imageWithText;
        }

        @l
        public final UniversalWidgetTextSection getText() {
            return this.text;
        }

        @k
        public final UniversalWidgetSectionVisibilityStatus getVisibilityStatus() {
            return this.visibilityStatus;
        }

        public int hashCode() {
            int iHashCode = this.visibilityStatus.hashCode() * 31;
            UniversalWidgetFactoidSection universalWidgetFactoidSection = this.factoid;
            int iHashCode2 = (iHashCode + (universalWidgetFactoidSection == null ? 0 : universalWidgetFactoidSection.hashCode())) * 31;
            UniversalWidgetTextSection universalWidgetTextSection = this.text;
            int iHashCode3 = (iHashCode2 + (universalWidgetTextSection == null ? 0 : universalWidgetTextSection.hashCode())) * 31;
            UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection = this.imageWithText;
            return iHashCode3 + (universalWidgetImageWithTextSection != null ? universalWidgetImageWithTextSection.hashCode() : 0);
        }

        @k
        public String toString() {
            return "UniversalWidgetValue(visibilityStatus=" + this.visibilityStatus + ", factoid=" + this.factoid + ", text=" + this.text + ", imageWithText=" + this.imageWithText + ')';
        }
    }

    public UniversalWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalWidget copy$default(UniversalWidget universalWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = universalWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = universalWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = universalWidget.widgetName;
        }
        return universalWidget.copy(config, list, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> component2() {
        return this.fields;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final UniversalWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new UniversalWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidget)) {
            return false;
        }
        UniversalWidget universalWidget = (UniversalWidget) other;
        return L.f(this.config, universalWidget.config) && L.f(this.fields, universalWidget.fields) && L.f(this.widgetName, universalWidget.widgetName);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> getFields() {
        return this.fields;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        List<Field> list = this.fields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.widgetName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
