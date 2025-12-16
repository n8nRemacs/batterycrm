package com.avito.android.extended_profile_ui_components.universal_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: UniversalWidgetSectionModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0014"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel;", "", "<init>", "()V", "Block", "FactoidBlock", "FactoidItemsCountType", "FactoidSection", "ImageWithTextBlock", "ImageWithTextImageRatio", "ImageWithTextSection", "ImageWithTextType", "Section", "a", "TextBlock", "TextColor", "TextPosition", "TextPositionImageWithText", "TextSection", "TextTitlePosition", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UniversalWidgetSectionModel {

    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Block;", "Landroid/os/Parcelable;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidBlock;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextBlock;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextBlock;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Block extends Parcelable {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidItemsCountType;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FactoidItemsCountType implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final FactoidItemsCountType f153553b;

        /* renamed from: c, reason: collision with root package name */
        public static final FactoidItemsCountType f153554c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FactoidItemsCountType[] f153555d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153556e;

        static {
            FactoidItemsCountType factoidItemsCountType = new FactoidItemsCountType("THREE_COLUMNS", 0);
            f153553b = factoidItemsCountType;
            FactoidItemsCountType factoidItemsCountType2 = new FactoidItemsCountType("FOUR_COLUMNS", 1);
            f153554c = factoidItemsCountType2;
            FactoidItemsCountType[] factoidItemsCountTypeArr = {factoidItemsCountType, factoidItemsCountType2};
            f153555d = factoidItemsCountTypeArr;
            f153556e = kotlin.enums.c.a(factoidItemsCountTypeArr);
        }

        public FactoidItemsCountType() {
            throw null;
        }

        public static FactoidItemsCountType valueOf(String str) {
            return (FactoidItemsCountType) Enum.valueOf(FactoidItemsCountType.class, str);
        }

        public static FactoidItemsCountType[] values() {
            return (FactoidItemsCountType[]) f153555d.clone();
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidSection;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Section;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FactoidSection extends Section {

        @k
        public static final Parcelable.Creator<FactoidSection> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final FactoidItemsCountType f153557c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f153558d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f153559e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f153560f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f153561g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<FactoidBlock> f153562h;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FactoidSection> {
            @Override // android.os.Parcelable.Creator
            public final FactoidSection createFromParcel(Parcel parcel) {
                FactoidItemsCountType factoidItemsCountTypeValueOf = FactoidItemsCountType.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(FactoidBlock.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new FactoidSection(factoidItemsCountTypeValueOf, string, string2, numValueOf, z12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final FactoidSection[] newArray(int i12) {
                return new FactoidSection[i12];
            }
        }

        public /* synthetic */ FactoidSection(FactoidItemsCountType factoidItemsCountType, String str, String str2, Integer num, boolean z12, List list, int i12, C42822w c42822w) {
            this(factoidItemsCountType, str, (i12 & 4) != 0 ? null : str2, num, z12, list);
        }

        public static FactoidSection d(FactoidSection factoidSection, FactoidItemsCountType factoidItemsCountType, String str, List list, int i12) {
            if ((i12 & 1) != 0) {
                factoidItemsCountType = factoidSection.f153557c;
            }
            FactoidItemsCountType factoidItemsCountType2 = factoidItemsCountType;
            if ((i12 & 2) != 0) {
                str = factoidSection.f153558d;
            }
            String str2 = str;
            String str3 = factoidSection.f153559e;
            Integer num = factoidSection.f153560f;
            boolean z12 = factoidSection.f153561g;
            if ((i12 & 32) != 0) {
                list = factoidSection.f153562h;
            }
            factoidSection.getClass();
            return new FactoidSection(factoidItemsCountType2, str2, str3, num, z12, list);
        }

        @Override // com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section
        @k
        public final List<FactoidBlock> c() {
            return this.f153562h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FactoidSection)) {
                return false;
            }
            FactoidSection factoidSection = (FactoidSection) obj;
            return this.f153557c == factoidSection.f153557c && L.f(this.f153558d, factoidSection.f153558d) && L.f(this.f153559e, factoidSection.f153559e) && L.f(this.f153560f, factoidSection.f153560f) && this.f153561g == factoidSection.f153561g && L.f(this.f153562h, factoidSection.f153562h);
        }

        public final int hashCode() {
            int iHashCode = this.f153557c.hashCode() * 31;
            String str = this.f153558d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f153559e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f153560f;
            return this.f153562h.hashCode() + r.i((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f153561g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FactoidSection(itemsCountType=");
            sb2.append(this.f153557c);
            sb2.append(", sectionTitle=");
            sb2.append(this.f153558d);
            sb2.append(", sectionTitleError=");
            sb2.append(this.f153559e);
            sb2.append(", sectionTitleMaxLines=");
            sb2.append(this.f153560f);
            sb2.append(", isEmpty=");
            sb2.append(this.f153561g);
            sb2.append(", blocks=");
            return H.p(sb2, this.f153562h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f153557c.name());
            parcel.writeString(this.f153558d);
            parcel.writeString(this.f153559e);
            Integer num = this.f153560f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.f153561g ? 1 : 0);
            Iterator itJ = C0.j(this.f153562h, parcel);
            while (itJ.hasNext()) {
                ((FactoidBlock) itJ.next()).writeToParcel(parcel, i12);
            }
        }

        public FactoidSection(@k FactoidItemsCountType factoidItemsCountType, @l String str, @l String str2, @l Integer num, boolean z12, @k List<FactoidBlock> list) {
            super(list, null);
            this.f153557c = factoidItemsCountType;
            this.f153558d = str;
            this.f153559e = str2;
            this.f153560f = num;
            this.f153561g = z12;
            this.f153562h = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextImageRatio;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageWithTextImageRatio implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final ImageWithTextImageRatio f153584b;

        /* renamed from: c, reason: collision with root package name */
        public static final ImageWithTextImageRatio f153585c;

        /* renamed from: d, reason: collision with root package name */
        public static final ImageWithTextImageRatio f153586d;

        /* renamed from: e, reason: collision with root package name */
        public static final ImageWithTextImageRatio f153587e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ImageWithTextImageRatio[] f153588f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153589g;

        static {
            ImageWithTextImageRatio imageWithTextImageRatio = new ImageWithTextImageRatio("ONE_TO_ONE", 0);
            f153584b = imageWithTextImageRatio;
            ImageWithTextImageRatio imageWithTextImageRatio2 = new ImageWithTextImageRatio("FOUR_TO_THREE", 1);
            f153585c = imageWithTextImageRatio2;
            ImageWithTextImageRatio imageWithTextImageRatio3 = new ImageWithTextImageRatio("THREE_TO_FOUR", 2);
            f153586d = imageWithTextImageRatio3;
            ImageWithTextImageRatio imageWithTextImageRatio4 = new ImageWithTextImageRatio("FIX", 3);
            f153587e = imageWithTextImageRatio4;
            ImageWithTextImageRatio[] imageWithTextImageRatioArr = {imageWithTextImageRatio, imageWithTextImageRatio2, imageWithTextImageRatio3, imageWithTextImageRatio4};
            f153588f = imageWithTextImageRatioArr;
            f153589g = kotlin.enums.c.a(imageWithTextImageRatioArr);
        }

        public ImageWithTextImageRatio() {
            throw null;
        }

        public static ImageWithTextImageRatio valueOf(String str) {
            return (ImageWithTextImageRatio) Enum.valueOf(ImageWithTextImageRatio.class, str);
        }

        public static ImageWithTextImageRatio[] values() {
            return (ImageWithTextImageRatio[]) f153588f.clone();
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextSection;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Section;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextSection extends Section {

        @k
        public static final Parcelable.Creator<ImageWithTextSection> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ImageWithTextType f153590c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ImageWithTextImageRatio f153591d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final TextPosition f153592e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final TextPositionImageWithText f153593f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f153594g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f153595h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f153596i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f153597j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final List<ImageWithTextBlock> f153598k;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageWithTextSection> {
            @Override // android.os.Parcelable.Creator
            public final ImageWithTextSection createFromParcel(Parcel parcel) {
                ImageWithTextType imageWithTextTypeValueOf = ImageWithTextType.valueOf(parcel.readString());
                ImageWithTextImageRatio imageWithTextImageRatioValueOf = ImageWithTextImageRatio.valueOf(parcel.readString());
                TextPosition textPositionValueOf = TextPosition.valueOf(parcel.readString());
                TextPositionImageWithText textPositionImageWithTextValueOf = parcel.readInt() == 0 ? null : TextPositionImageWithText.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ImageWithTextBlock.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ImageWithTextSection(imageWithTextTypeValueOf, imageWithTextImageRatioValueOf, textPositionValueOf, textPositionImageWithTextValueOf, string, string2, numValueOf, z12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ImageWithTextSection[] newArray(int i12) {
                return new ImageWithTextSection[i12];
            }
        }

        public /* synthetic */ ImageWithTextSection(ImageWithTextType imageWithTextType, ImageWithTextImageRatio imageWithTextImageRatio, TextPosition textPosition, TextPositionImageWithText textPositionImageWithText, String str, String str2, Integer num, boolean z12, List list, int i12, C42822w c42822w) {
            this(imageWithTextType, imageWithTextImageRatio, textPosition, textPositionImageWithText, str, (i12 & 32) != 0 ? null : str2, num, z12, list);
        }

        public static ImageWithTextSection d(ImageWithTextSection imageWithTextSection, ImageWithTextImageRatio imageWithTextImageRatio, TextPosition textPosition, TextPositionImageWithText textPositionImageWithText, String str, List list, int i12) {
            ImageWithTextType imageWithTextType = imageWithTextSection.f153590c;
            ImageWithTextImageRatio imageWithTextImageRatio2 = (i12 & 2) != 0 ? imageWithTextSection.f153591d : imageWithTextImageRatio;
            TextPosition textPosition2 = (i12 & 4) != 0 ? imageWithTextSection.f153592e : textPosition;
            TextPositionImageWithText textPositionImageWithText2 = (i12 & 8) != 0 ? imageWithTextSection.f153593f : textPositionImageWithText;
            String str2 = (i12 & 16) != 0 ? imageWithTextSection.f153594g : str;
            String str3 = imageWithTextSection.f153595h;
            Integer num = imageWithTextSection.f153596i;
            boolean z12 = imageWithTextSection.f153597j;
            List list2 = (i12 & 256) != 0 ? imageWithTextSection.f153598k : list;
            imageWithTextSection.getClass();
            return new ImageWithTextSection(imageWithTextType, imageWithTextImageRatio2, textPosition2, textPositionImageWithText2, str2, str3, num, z12, list2);
        }

        @Override // com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section
        @k
        public final List<ImageWithTextBlock> c() {
            return this.f153598k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageWithTextSection)) {
                return false;
            }
            ImageWithTextSection imageWithTextSection = (ImageWithTextSection) obj;
            return this.f153590c == imageWithTextSection.f153590c && this.f153591d == imageWithTextSection.f153591d && this.f153592e == imageWithTextSection.f153592e && this.f153593f == imageWithTextSection.f153593f && L.f(this.f153594g, imageWithTextSection.f153594g) && L.f(this.f153595h, imageWithTextSection.f153595h) && L.f(this.f153596i, imageWithTextSection.f153596i) && this.f153597j == imageWithTextSection.f153597j && L.f(this.f153598k, imageWithTextSection.f153598k);
        }

        public final int hashCode() {
            int iHashCode = (this.f153592e.hashCode() + ((this.f153591d.hashCode() + (this.f153590c.hashCode() * 31)) * 31)) * 31;
            TextPositionImageWithText textPositionImageWithText = this.f153593f;
            int iHashCode2 = (iHashCode + (textPositionImageWithText == null ? 0 : textPositionImageWithText.hashCode())) * 31;
            String str = this.f153594g;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f153595h;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f153596i;
            return this.f153598k.hashCode() + r.i((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f153597j);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageWithTextSection(type=");
            sb2.append(this.f153590c);
            sb2.append(", imgRatio=");
            sb2.append(this.f153591d);
            sb2.append(", textPosition=");
            sb2.append(this.f153592e);
            sb2.append(", textPositionImageWithText=");
            sb2.append(this.f153593f);
            sb2.append(", sectionTitle=");
            sb2.append(this.f153594g);
            sb2.append(", sectionTitleError=");
            sb2.append(this.f153595h);
            sb2.append(", sectionTitleMaxLines=");
            sb2.append(this.f153596i);
            sb2.append(", isEmpty=");
            sb2.append(this.f153597j);
            sb2.append(", blocks=");
            return H.p(sb2, this.f153598k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f153590c.name());
            parcel.writeString(this.f153591d.name());
            parcel.writeString(this.f153592e.name());
            TextPositionImageWithText textPositionImageWithText = this.f153593f;
            if (textPositionImageWithText == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(textPositionImageWithText.name());
            }
            parcel.writeString(this.f153594g);
            parcel.writeString(this.f153595h);
            Integer num = this.f153596i;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.f153597j ? 1 : 0);
            Iterator itJ = C0.j(this.f153598k, parcel);
            while (itJ.hasNext()) {
                ((ImageWithTextBlock) itJ.next()).writeToParcel(parcel, i12);
            }
        }

        public ImageWithTextSection(@k ImageWithTextType imageWithTextType, @k ImageWithTextImageRatio imageWithTextImageRatio, @k TextPosition textPosition, @l TextPositionImageWithText textPositionImageWithText, @l String str, @l String str2, @l Integer num, boolean z12, @k List<ImageWithTextBlock> list) {
            super(list, null);
            this.f153590c = imageWithTextType;
            this.f153591d = imageWithTextImageRatio;
            this.f153592e = textPosition;
            this.f153593f = textPositionImageWithText;
            this.f153594g = str;
            this.f153595h = str2;
            this.f153596i = num;
            this.f153597j = z12;
            this.f153598k = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextType;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageWithTextType {

        /* renamed from: b, reason: collision with root package name */
        public static final ImageWithTextType f153599b;

        /* renamed from: c, reason: collision with root package name */
        public static final ImageWithTextType f153600c;

        /* renamed from: d, reason: collision with root package name */
        public static final ImageWithTextType f153601d;

        /* renamed from: e, reason: collision with root package name */
        public static final ImageWithTextType f153602e;

        /* renamed from: f, reason: collision with root package name */
        public static final ImageWithTextType f153603f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ImageWithTextType[] f153604g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153605h;

        static {
            ImageWithTextType imageWithTextType = new ImageWithTextType("FULL_WIDTH", 0);
            f153599b = imageWithTextType;
            ImageWithTextType imageWithTextType2 = new ImageWithTextType("IMG_WITH_TEXT", 1);
            f153600c = imageWithTextType2;
            ImageWithTextType imageWithTextType3 = new ImageWithTextType("TWO_COLUMNS", 2);
            f153601d = imageWithTextType3;
            ImageWithTextType imageWithTextType4 = new ImageWithTextType("THREE_COLUMNS", 3);
            f153602e = imageWithTextType4;
            ImageWithTextType imageWithTextType5 = new ImageWithTextType("FOUR_COLUMNS", 4);
            f153603f = imageWithTextType5;
            ImageWithTextType[] imageWithTextTypeArr = {imageWithTextType, imageWithTextType2, imageWithTextType3, imageWithTextType4, imageWithTextType5};
            f153604g = imageWithTextTypeArr;
            f153605h = kotlin.enums.c.a(imageWithTextTypeArr);
        }

        public ImageWithTextType() {
            throw null;
        }

        public static ImageWithTextType valueOf(String str) {
            return (ImageWithTextType) Enum.valueOf(ImageWithTextType.class, str);
        }

        public static ImageWithTextType[] values() {
            return (ImageWithTextType[]) f153604g.clone();
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Section;", "Landroid/os/Parcelable;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidSection;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextSection;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextSection;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Section implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Block> f153606b;

        public Section() {
            throw null;
        }

        public Section(List list, C42822w c42822w) {
            this.f153606b = list;
        }

        @k
        public List<Block> c() {
            return this.f153606b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextColor;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextColor {

        /* renamed from: b, reason: collision with root package name */
        public static final TextColor f153615b;

        /* renamed from: c, reason: collision with root package name */
        public static final TextColor f153616c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TextColor[] f153617d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153618e;

        static {
            TextColor textColor = new TextColor("BLACK", 0);
            f153615b = textColor;
            TextColor textColor2 = new TextColor("WHITE", 1);
            f153616c = textColor2;
            TextColor[] textColorArr = {textColor, textColor2};
            f153617d = textColorArr;
            f153618e = kotlin.enums.c.a(textColorArr);
        }

        public TextColor() {
            throw null;
        }

        public static TextColor valueOf(String str) {
            return (TextColor) Enum.valueOf(TextColor.class, str);
        }

        public static TextColor[] values() {
            return (TextColor[]) f153617d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextPosition;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextPosition implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final TextPosition f153619b;

        /* renamed from: c, reason: collision with root package name */
        public static final TextPosition f153620c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TextPosition[] f153621d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153622e;

        static {
            TextPosition textPosition = new TextPosition("IN", 0);
            f153619b = textPosition;
            TextPosition textPosition2 = new TextPosition("OUT", 1);
            f153620c = textPosition2;
            TextPosition[] textPositionArr = {textPosition, textPosition2};
            f153621d = textPositionArr;
            f153622e = kotlin.enums.c.a(textPositionArr);
        }

        public TextPosition() {
            throw null;
        }

        public static TextPosition valueOf(String str) {
            return (TextPosition) Enum.valueOf(TextPosition.class, str);
        }

        public static TextPosition[] values() {
            return (TextPosition[]) f153621d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextPositionImageWithText;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextPositionImageWithText implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final TextPositionImageWithText f153623b;

        /* renamed from: c, reason: collision with root package name */
        public static final TextPositionImageWithText f153624c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TextPositionImageWithText[] f153625d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153626e;

        static {
            TextPositionImageWithText textPositionImageWithText = new TextPositionImageWithText("IMG_START", 0);
            f153623b = textPositionImageWithText;
            TextPositionImageWithText textPositionImageWithText2 = new TextPositionImageWithText("TEXT_START", 1);
            f153624c = textPositionImageWithText2;
            TextPositionImageWithText[] textPositionImageWithTextArr = {textPositionImageWithText, textPositionImageWithText2};
            f153625d = textPositionImageWithTextArr;
            f153626e = kotlin.enums.c.a(textPositionImageWithTextArr);
        }

        public TextPositionImageWithText() {
            throw null;
        }

        public static TextPositionImageWithText valueOf(String str) {
            return (TextPositionImageWithText) Enum.valueOf(TextPositionImageWithText.class, str);
        }

        public static TextPositionImageWithText[] values() {
            return (TextPositionImageWithText[]) f153625d.clone();
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextSection;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Section;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextSection extends Section {

        @k
        public static final Parcelable.Creator<TextSection> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @l
        public final TextTitlePosition f153627c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f153628d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<TextBlock> f153629e;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextSection> {
            @Override // android.os.Parcelable.Creator
            public final TextSection createFromParcel(Parcel parcel) {
                TextTitlePosition textTitlePositionValueOf = parcel.readInt() == 0 ? null : TextTitlePosition.valueOf(parcel.readString());
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(TextBlock.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new TextSection(textTitlePositionValueOf, z12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final TextSection[] newArray(int i12) {
                return new TextSection[i12];
            }
        }

        public TextSection(@l TextTitlePosition textTitlePosition, boolean z12, @k List<TextBlock> list) {
            super(list, null);
            this.f153627c = textTitlePosition;
            this.f153628d = z12;
            this.f153629e = list;
        }

        public static TextSection d(TextSection textSection, TextTitlePosition textTitlePosition, List list, int i12) {
            if ((i12 & 1) != 0) {
                textTitlePosition = textSection.f153627c;
            }
            boolean z12 = textSection.f153628d;
            if ((i12 & 4) != 0) {
                list = textSection.f153629e;
            }
            textSection.getClass();
            return new TextSection(textTitlePosition, z12, list);
        }

        @Override // com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section
        @k
        public final List<TextBlock> c() {
            return this.f153629e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSection)) {
                return false;
            }
            TextSection textSection = (TextSection) obj;
            return this.f153627c == textSection.f153627c && this.f153628d == textSection.f153628d && L.f(this.f153629e, textSection.f153629e);
        }

        public final int hashCode() {
            TextTitlePosition textTitlePosition = this.f153627c;
            return this.f153629e.hashCode() + r.i((textTitlePosition == null ? 0 : textTitlePosition.hashCode()) * 31, 31, this.f153628d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextSection(titlePosition=");
            sb2.append(this.f153627c);
            sb2.append(", isEmpty=");
            sb2.append(this.f153628d);
            sb2.append(", blocks=");
            return H.p(sb2, this.f153629e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            TextTitlePosition textTitlePosition = this.f153627c;
            if (textTitlePosition == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(textTitlePosition.name());
            }
            parcel.writeInt(this.f153628d ? 1 : 0);
            Iterator itJ = C0.j(this.f153629e, parcel);
            while (itJ.hasNext()) {
                ((TextBlock) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextTitlePosition;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextTitlePosition implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final TextTitlePosition f153630b;

        /* renamed from: c, reason: collision with root package name */
        public static final TextTitlePosition f153631c;

        /* renamed from: d, reason: collision with root package name */
        public static final TextTitlePosition f153632d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TextTitlePosition[] f153633e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153634f;

        static {
            TextTitlePosition textTitlePosition = new TextTitlePosition("UP", 0);
            f153630b = textTitlePosition;
            TextTitlePosition textTitlePosition2 = new TextTitlePosition("LEFT", 1);
            f153631c = textTitlePosition2;
            TextTitlePosition textTitlePosition3 = new TextTitlePosition("RIGHT", 2);
            f153632d = textTitlePosition3;
            TextTitlePosition[] textTitlePositionArr = {textTitlePosition, textTitlePosition2, textTitlePosition3};
            f153633e = textTitlePositionArr;
            f153634f = kotlin.enums.c.a(textTitlePositionArr);
        }

        public TextTitlePosition() {
            throw null;
        }

        public static TextTitlePosition valueOf(String str) {
            return (TextTitlePosition) Enum.valueOf(TextTitlePosition.class, str);
        }

        public static TextTitlePosition[] values() {
            return (TextTitlePosition[]) f153633e.clone();
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidItemsCountType;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextImageRatio;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextPosition;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextPositionImageWithText;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextTitlePosition;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public /* synthetic */ UniversalWidgetSectionModel(C42822w c42822w) {
        this();
    }

    public UniversalWidgetSectionModel() {
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$TextBlock;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Block;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextBlock implements Block {

        @k
        public static final Parcelable.Creator<TextBlock> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153607b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f153608c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f153609d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f153610e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f153611f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f153612g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f153613h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f153614i;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextBlock> {
            @Override // android.os.Parcelable.Creator
            public final TextBlock createFromParcel(Parcel parcel) {
                return new TextBlock(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final TextBlock[] newArray(int i12) {
                return new TextBlock[i12];
            }
        }

        public TextBlock(boolean z12, boolean z13, @l String str, @l String str2, @l Integer num, @l String str3, @l String str4, @l Integer num2) {
            this.f153607b = z12;
            this.f153608c = z13;
            this.f153609d = str;
            this.f153610e = str2;
            this.f153611f = num;
            this.f153612g = str3;
            this.f153613h = str4;
            this.f153614i = num2;
        }

        public static TextBlock a(TextBlock textBlock, boolean z12, String str, String str2, int i12) {
            if ((i12 & 1) != 0) {
                z12 = textBlock.f153607b;
            }
            boolean z13 = z12;
            boolean z14 = (i12 & 2) != 0 ? textBlock.f153608c : false;
            if ((i12 & 4) != 0) {
                str = textBlock.f153609d;
            }
            String str3 = str;
            String str4 = (i12 & 8) != 0 ? textBlock.f153610e : null;
            Integer num = textBlock.f153611f;
            if ((i12 & 32) != 0) {
                str2 = textBlock.f153612g;
            }
            String str5 = str2;
            String str6 = (i12 & 64) != 0 ? textBlock.f153613h : null;
            Integer num2 = textBlock.f153614i;
            textBlock.getClass();
            return new TextBlock(z13, z14, str3, str4, num, str5, str6, num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextBlock)) {
                return false;
            }
            TextBlock textBlock = (TextBlock) obj;
            return this.f153607b == textBlock.f153607b && this.f153608c == textBlock.f153608c && L.f(this.f153609d, textBlock.f153609d) && L.f(this.f153610e, textBlock.f153610e) && L.f(this.f153611f, textBlock.f153611f) && L.f(this.f153612g, textBlock.f153612g) && L.f(this.f153613h, textBlock.f153613h) && L.f(this.f153614i, textBlock.f153614i);
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f153607b) * 31, 31, this.f153608c);
            String str = this.f153609d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f153610e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f153611f;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f153612g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f153613h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.f153614i;
            return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextBlock(isEmpty=");
            sb2.append(this.f153607b);
            sb2.append(", hasError=");
            sb2.append(this.f153608c);
            sb2.append(", title=");
            sb2.append(this.f153609d);
            sb2.append(", titleError=");
            sb2.append(this.f153610e);
            sb2.append(", titleMaxLines=");
            sb2.append(this.f153611f);
            sb2.append(", description=");
            sb2.append(this.f153612g);
            sb2.append(", descriptionError=");
            sb2.append(this.f153613h);
            sb2.append(", descriptionMaxLines=");
            return s.j(sb2, this.f153614i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f153607b ? 1 : 0);
            parcel.writeInt(this.f153608c ? 1 : 0);
            parcel.writeString(this.f153609d);
            parcel.writeString(this.f153610e);
            Integer num = this.f153611f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f153612g);
            parcel.writeString(this.f153613h);
            Integer num2 = this.f153614i;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }

        public /* synthetic */ TextBlock(boolean z12, boolean z13, String str, String str2, Integer num, String str3, String str4, Integer num2, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13, str, (i12 & 8) != 0 ? null : str2, num, str3, (i12 & 64) != 0 ? null : str4, num2);
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$FactoidBlock;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Block;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FactoidBlock implements Block {

        @k
        public static final Parcelable.Creator<FactoidBlock> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153542b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f153543c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f153544d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f153545e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f153546f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f153547g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f153548h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f153549i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f153550j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f153551k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Integer f153552l;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FactoidBlock> {
            @Override // android.os.Parcelable.Creator
            public final FactoidBlock createFromParcel(Parcel parcel) {
                return new FactoidBlock(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final FactoidBlock[] newArray(int i12) {
                return new FactoidBlock[i12];
            }
        }

        public FactoidBlock(boolean z12, boolean z13, @l String str, @l String str2, @l Integer num, @l String str3, @l String str4, @l Integer num2, @l String str5, @l String str6, @l Integer num3) {
            this.f153542b = z12;
            this.f153543c = z13;
            this.f153544d = str;
            this.f153545e = str2;
            this.f153546f = num;
            this.f153547g = str3;
            this.f153548h = str4;
            this.f153549i = num2;
            this.f153550j = str5;
            this.f153551k = str6;
            this.f153552l = num3;
        }

        public static FactoidBlock a(FactoidBlock factoidBlock, boolean z12, String str, String str2, String str3, int i12) {
            boolean z13 = (i12 & 1) != 0 ? factoidBlock.f153542b : z12;
            boolean z14 = (i12 & 2) != 0 ? factoidBlock.f153543c : false;
            String str4 = (i12 & 4) != 0 ? factoidBlock.f153544d : str;
            String str5 = (i12 & 8) != 0 ? factoidBlock.f153545e : null;
            Integer num = factoidBlock.f153546f;
            String str6 = (i12 & 32) != 0 ? factoidBlock.f153547g : str2;
            String str7 = (i12 & 64) != 0 ? factoidBlock.f153548h : null;
            Integer num2 = factoidBlock.f153549i;
            String str8 = (i12 & 256) != 0 ? factoidBlock.f153550j : str3;
            String str9 = (i12 & 512) != 0 ? factoidBlock.f153551k : null;
            Integer num3 = factoidBlock.f153552l;
            factoidBlock.getClass();
            return new FactoidBlock(z13, z14, str4, str5, num, str6, str7, num2, str8, str9, num3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FactoidBlock)) {
                return false;
            }
            FactoidBlock factoidBlock = (FactoidBlock) obj;
            return this.f153542b == factoidBlock.f153542b && this.f153543c == factoidBlock.f153543c && L.f(this.f153544d, factoidBlock.f153544d) && L.f(this.f153545e, factoidBlock.f153545e) && L.f(this.f153546f, factoidBlock.f153546f) && L.f(this.f153547g, factoidBlock.f153547g) && L.f(this.f153548h, factoidBlock.f153548h) && L.f(this.f153549i, factoidBlock.f153549i) && L.f(this.f153550j, factoidBlock.f153550j) && L.f(this.f153551k, factoidBlock.f153551k) && L.f(this.f153552l, factoidBlock.f153552l);
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f153542b) * 31, 31, this.f153543c);
            String str = this.f153544d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f153545e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f153546f;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f153547g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f153548h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.f153549i;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str5 = this.f153550j;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f153551k;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.f153552l;
            return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FactoidBlock(isEmpty=");
            sb2.append(this.f153542b);
            sb2.append(", hasError=");
            sb2.append(this.f153543c);
            sb2.append(", title=");
            sb2.append(this.f153544d);
            sb2.append(", titleError=");
            sb2.append(this.f153545e);
            sb2.append(", titleMaxLines=");
            sb2.append(this.f153546f);
            sb2.append(", subtitle=");
            sb2.append(this.f153547g);
            sb2.append(", subtitleError=");
            sb2.append(this.f153548h);
            sb2.append(", subtitleMaxLines=");
            sb2.append(this.f153549i);
            sb2.append(", description=");
            sb2.append(this.f153550j);
            sb2.append(", descriptionError=");
            sb2.append(this.f153551k);
            sb2.append(", descriptionMaxLines=");
            return s.j(sb2, this.f153552l, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f153542b ? 1 : 0);
            parcel.writeInt(this.f153543c ? 1 : 0);
            parcel.writeString(this.f153544d);
            parcel.writeString(this.f153545e);
            Integer num = this.f153546f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f153547g);
            parcel.writeString(this.f153548h);
            Integer num2 = this.f153549i;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeString(this.f153550j);
            parcel.writeString(this.f153551k);
            Integer num3 = this.f153552l;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
        }

        public /* synthetic */ FactoidBlock(boolean z12, boolean z13, String str, String str2, Integer num, String str3, String str4, Integer num2, String str5, String str6, Integer num3, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13, str, (i12 & 8) != 0 ? null : str2, num, str3, (i12 & 64) != 0 ? null : str4, num2, str5, (i12 & 512) != 0 ? null : str6, num3);
        }
    }

    /* compiled from: UniversalWidgetSectionModel.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextBlock;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$Block;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageWithTextBlock implements Block {

        @k
        public static final Parcelable.Creator<ImageWithTextBlock> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153563b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f153564c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f153565d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f153566e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f153567f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f153568g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f153569h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f153570i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Image f153571j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Long f153572k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final String f153573l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Uri f153574m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Image f153575n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final Long f153576o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final String f153577p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final Uri f153578q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final Image f153579r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final Long f153580s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final String f153581t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final Uri f153582u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final TextColor f153583v;

        /* compiled from: UniversalWidgetSectionModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageWithTextBlock> {
            @Override // android.os.Parcelable.Creator
            public final ImageWithTextBlock createFromParcel(Parcel parcel) {
                return new ImageWithTextBlock(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Image) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (Uri) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), (Image) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (Uri) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), (Image) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (Uri) parcel.readParcelable(ImageWithTextBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : TextColor.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageWithTextBlock[] newArray(int i12) {
                return new ImageWithTextBlock[i12];
            }
        }

        public ImageWithTextBlock(boolean z12, boolean z13, @l String str, @l String str2, @l Integer num, @l String str3, @l String str4, @l Integer num2, @l Image image, @l Long l12, @l String str5, @l Uri uri, @l Image image2, @l Long l13, @l String str6, @l Uri uri2, @l Image image3, @l Long l14, @l String str7, @l Uri uri3, @l TextColor textColor) {
            this.f153563b = z12;
            this.f153564c = z13;
            this.f153565d = str;
            this.f153566e = str2;
            this.f153567f = num;
            this.f153568g = str3;
            this.f153569h = str4;
            this.f153570i = num2;
            this.f153571j = image;
            this.f153572k = l12;
            this.f153573l = str5;
            this.f153574m = uri;
            this.f153575n = image2;
            this.f153576o = l13;
            this.f153577p = str6;
            this.f153578q = uri2;
            this.f153579r = image3;
            this.f153580s = l14;
            this.f153581t = str7;
            this.f153582u = uri3;
            this.f153583v = textColor;
        }

        public static ImageWithTextBlock a(ImageWithTextBlock imageWithTextBlock, boolean z12, String str, String str2, Image image, Long l12, String str3, Uri uri, Image image2, Long l13, Uri uri2, Image image3, Long l14, Uri uri3, TextColor textColor, int i12) {
            boolean z13 = (i12 & 1) != 0 ? imageWithTextBlock.f153563b : z12;
            boolean z14 = (i12 & 2) != 0 ? imageWithTextBlock.f153564c : false;
            String str4 = (i12 & 4) != 0 ? imageWithTextBlock.f153565d : str;
            String str5 = (i12 & 8) != 0 ? imageWithTextBlock.f153566e : null;
            Integer num = imageWithTextBlock.f153567f;
            String str6 = (i12 & 32) != 0 ? imageWithTextBlock.f153568g : str2;
            String str7 = (i12 & 64) != 0 ? imageWithTextBlock.f153569h : null;
            Integer num2 = imageWithTextBlock.f153570i;
            Image image4 = (i12 & 256) != 0 ? imageWithTextBlock.f153571j : image;
            Long l15 = (i12 & 512) != 0 ? imageWithTextBlock.f153572k : l12;
            String str8 = (i12 & 1024) != 0 ? imageWithTextBlock.f153573l : str3;
            Uri uri4 = (i12 & 2048) != 0 ? imageWithTextBlock.f153574m : uri;
            Image image5 = (i12 & 4096) != 0 ? imageWithTextBlock.f153575n : image2;
            Long l16 = (i12 & 8192) != 0 ? imageWithTextBlock.f153576o : l13;
            String str9 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? imageWithTextBlock.f153577p : null;
            Uri uri5 = (32768 & i12) != 0 ? imageWithTextBlock.f153578q : uri2;
            Image image6 = (65536 & i12) != 0 ? imageWithTextBlock.f153579r : image3;
            Long l17 = (131072 & i12) != 0 ? imageWithTextBlock.f153580s : l14;
            String str10 = (262144 & i12) != 0 ? imageWithTextBlock.f153581t : null;
            Uri uri6 = (524288 & i12) != 0 ? imageWithTextBlock.f153582u : uri3;
            TextColor textColor2 = (i12 & 1048576) != 0 ? imageWithTextBlock.f153583v : textColor;
            imageWithTextBlock.getClass();
            return new ImageWithTextBlock(z13, z14, str4, str5, num, str6, str7, num2, image4, l15, str8, uri4, image5, l16, str9, uri5, image6, l17, str10, uri6, textColor2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageWithTextBlock)) {
                return false;
            }
            ImageWithTextBlock imageWithTextBlock = (ImageWithTextBlock) obj;
            return this.f153563b == imageWithTextBlock.f153563b && this.f153564c == imageWithTextBlock.f153564c && L.f(this.f153565d, imageWithTextBlock.f153565d) && L.f(this.f153566e, imageWithTextBlock.f153566e) && L.f(this.f153567f, imageWithTextBlock.f153567f) && L.f(this.f153568g, imageWithTextBlock.f153568g) && L.f(this.f153569h, imageWithTextBlock.f153569h) && L.f(this.f153570i, imageWithTextBlock.f153570i) && L.f(this.f153571j, imageWithTextBlock.f153571j) && L.f(this.f153572k, imageWithTextBlock.f153572k) && L.f(this.f153573l, imageWithTextBlock.f153573l) && L.f(this.f153574m, imageWithTextBlock.f153574m) && L.f(this.f153575n, imageWithTextBlock.f153575n) && L.f(this.f153576o, imageWithTextBlock.f153576o) && L.f(this.f153577p, imageWithTextBlock.f153577p) && L.f(this.f153578q, imageWithTextBlock.f153578q) && L.f(this.f153579r, imageWithTextBlock.f153579r) && L.f(this.f153580s, imageWithTextBlock.f153580s) && L.f(this.f153581t, imageWithTextBlock.f153581t) && L.f(this.f153582u, imageWithTextBlock.f153582u) && this.f153583v == imageWithTextBlock.f153583v;
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f153563b) * 31, 31, this.f153564c);
            String str = this.f153565d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f153566e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f153567f;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f153568g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f153569h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.f153570i;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Image image = this.f153571j;
            int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
            Long l12 = this.f153572k;
            int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str5 = this.f153573l;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Uri uri = this.f153574m;
            int iHashCode10 = (iHashCode9 + (uri == null ? 0 : uri.hashCode())) * 31;
            Image image2 = this.f153575n;
            int iHashCode11 = (iHashCode10 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Long l13 = this.f153576o;
            int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str6 = this.f153577p;
            int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Uri uri2 = this.f153578q;
            int iHashCode14 = (iHashCode13 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Image image3 = this.f153579r;
            int iHashCode15 = (iHashCode14 + (image3 == null ? 0 : image3.hashCode())) * 31;
            Long l14 = this.f153580s;
            int iHashCode16 = (iHashCode15 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str7 = this.f153581t;
            int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Uri uri3 = this.f153582u;
            int iHashCode18 = (iHashCode17 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
            TextColor textColor = this.f153583v;
            return iHashCode18 + (textColor != null ? textColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ImageWithTextBlock(isEmpty=" + this.f153563b + ", hasError=" + this.f153564c + ", title=" + this.f153565d + ", titleError=" + this.f153566e + ", titleMaxLines=" + this.f153567f + ", description=" + this.f153568g + ", descriptionError=" + this.f153569h + ", descriptionMaxLines=" + this.f153570i + ", image=" + this.f153571j + ", imageId=" + this.f153572k + ", imageError=" + this.f153573l + ", selectedImage=" + this.f153574m + ", desktopImage=" + this.f153575n + ", desktopImageId=" + this.f153576o + ", desktopImageError=" + this.f153577p + ", selectedDesktopImage=" + this.f153578q + ", mobileImage=" + this.f153579r + ", mobileImageId=" + this.f153580s + ", mobileImageError=" + this.f153581t + ", selectedMobileImage=" + this.f153582u + ", textColor=" + this.f153583v + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f153563b ? 1 : 0);
            parcel.writeInt(this.f153564c ? 1 : 0);
            parcel.writeString(this.f153565d);
            parcel.writeString(this.f153566e);
            Integer num = this.f153567f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f153568g);
            parcel.writeString(this.f153569h);
            Integer num2 = this.f153570i;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeParcelable(this.f153571j, i12);
            Long l12 = this.f153572k;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f153573l);
            parcel.writeParcelable(this.f153574m, i12);
            parcel.writeParcelable(this.f153575n, i12);
            Long l13 = this.f153576o;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.f153577p);
            parcel.writeParcelable(this.f153578q, i12);
            parcel.writeParcelable(this.f153579r, i12);
            Long l14 = this.f153580s;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l14);
            }
            parcel.writeString(this.f153581t);
            parcel.writeParcelable(this.f153582u, i12);
            TextColor textColor = this.f153583v;
            if (textColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(textColor.name());
            }
        }

        public /* synthetic */ ImageWithTextBlock(boolean z12, boolean z13, String str, String str2, Integer num, String str3, String str4, Integer num2, Image image, Long l12, String str5, Uri uri, Image image2, Long l13, String str6, Uri uri2, Image image3, Long l14, String str7, Uri uri3, TextColor textColor, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13, str, (i12 & 8) != 0 ? null : str2, num, str3, (i12 & 64) != 0 ? null : str4, num2, image, (i12 & 512) != 0 ? null : l12, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) != 0 ? null : uri, (i12 & 4096) != 0 ? null : image2, (i12 & 8192) != 0 ? null : l13, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6, (32768 & i12) != 0 ? null : uri2, (65536 & i12) != 0 ? null : image3, (131072 & i12) != 0 ? null : l14, (262144 & i12) != 0 ? null : str7, (i12 & 524288) != 0 ? null : uri3, textColor);
        }
    }
}
