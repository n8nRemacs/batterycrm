package com.avito.android.extended_profile_ui_components.universal_widget;

import K51.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bJ\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "Lkotlin/G0;", "action", "setOnRemoveClickListener", "(LY41/a;)V", "ContentState", "LayoutState", "SkeletonType", "TextPaddings", "UniversalWidgetBlockState", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetBlockView extends ConstraintLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f153458m = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f153459b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f153460c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f153461d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f153462e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f153463f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f153464g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f153465h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f153466i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SimpleDraweeView f153467j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final FrameLayout f153468k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ImageView f153469l;

    /* compiled from: UniversalWidgetBlockView.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$ContentState;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentState implements Parcelable {

        @k
        public static final Parcelable.Creator<ContentState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SkeletonType f153470b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f153471c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f153472d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f153473e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f153474f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f153475g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Integer f153476h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final LayoutState.TextColor f153477i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Integer f153478j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Image f153479k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Uri f153480l;

        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContentState> {
            @Override // android.os.Parcelable.Creator
            public final ContentState createFromParcel(Parcel parcel) {
                return new ContentState(parcel.readInt() == 0 ? null : SkeletonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), LayoutState.TextColor.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Image) parcel.readParcelable(ContentState.class.getClassLoader()), (Uri) parcel.readParcelable(ContentState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ContentState[] newArray(int i12) {
                return new ContentState[i12];
            }
        }

        public ContentState() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentState)) {
                return false;
            }
            ContentState contentState = (ContentState) obj;
            return this.f153470b == contentState.f153470b && L.f(this.f153471c, contentState.f153471c) && L.f(this.f153472d, contentState.f153472d) && L.f(this.f153473e, contentState.f153473e) && L.f(this.f153474f, contentState.f153474f) && L.f(this.f153475g, contentState.f153475g) && L.f(this.f153476h, contentState.f153476h) && this.f153477i == contentState.f153477i && L.f(this.f153478j, contentState.f153478j) && L.f(this.f153479k, contentState.f153479k) && L.f(this.f153480l, contentState.f153480l);
        }

        public final int hashCode() {
            SkeletonType skeletonType = this.f153470b;
            int iHashCode = (skeletonType == null ? 0 : skeletonType.hashCode()) * 31;
            String str = this.f153471c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f153472d;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f153473e;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.f153474f;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.f153475g;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num3 = this.f153476h;
            int iHashCode7 = (this.f153477i.hashCode() + ((iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31)) * 31;
            Integer num4 = this.f153478j;
            int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Image image = this.f153479k;
            int iHashCode9 = (iHashCode8 + (image == null ? 0 : image.hashCode())) * 31;
            Uri uri = this.f153480l;
            return iHashCode9 + (uri != null ? uri.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentState(skeletonType=");
            sb2.append(this.f153470b);
            sb2.append(", title=");
            sb2.append(this.f153471c);
            sb2.append(", titleMaxLines=");
            sb2.append(this.f153472d);
            sb2.append(", subtitle=");
            sb2.append(this.f153473e);
            sb2.append(", subtitleMaxLines=");
            sb2.append(this.f153474f);
            sb2.append(", description=");
            sb2.append(this.f153475g);
            sb2.append(", descriptionMaxLines=");
            sb2.append(this.f153476h);
            sb2.append(", textColor=");
            sb2.append(this.f153477i);
            sb2.append(", backgroundColor=");
            sb2.append(this.f153478j);
            sb2.append(", image=");
            sb2.append(this.f153479k);
            sb2.append(", selectedImage=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f153480l, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            SkeletonType skeletonType = this.f153470b;
            if (skeletonType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(skeletonType.name());
            }
            parcel.writeString(this.f153471c);
            Integer num = this.f153472d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f153473e);
            Integer num2 = this.f153474f;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeString(this.f153475g);
            Integer num3 = this.f153476h;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            parcel.writeString(this.f153477i.name());
            Integer num4 = this.f153478j;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num4);
            }
            parcel.writeParcelable(this.f153479k, i12);
            parcel.writeParcelable(this.f153480l, i12);
        }

        public ContentState(@l SkeletonType skeletonType, @l String str, @l Integer num, @l String str2, @l Integer num2, @l String str3, @l Integer num3, @k LayoutState.TextColor textColor, @InterfaceC42158n @l Integer num4, @l Image image, @l Uri uri) {
            this.f153470b = skeletonType;
            this.f153471c = str;
            this.f153472d = num;
            this.f153473e = str2;
            this.f153474f = num2;
            this.f153475g = str3;
            this.f153476h = num3;
            this.f153477i = textColor;
            this.f153478j = num4;
            this.f153479k = image;
            this.f153480l = uri;
        }

        public /* synthetic */ ContentState(SkeletonType skeletonType, String str, Integer num, String str2, Integer num2, String str3, Integer num3, LayoutState.TextColor textColor, Integer num4, Image image, Uri uri, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : skeletonType, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? Integer.MAX_VALUE : num, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? Integer.MAX_VALUE : num2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? Integer.MAX_VALUE : num3, (i12 & 128) != 0 ? LayoutState.TextColor.f153493d : textColor, (i12 & 256) != 0 ? null : num4, (i12 & 512) != 0 ? null : image, (i12 & 1024) == 0 ? uri : null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetBlockView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$SkeletonType;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SkeletonType {

        /* renamed from: b, reason: collision with root package name */
        public static final SkeletonType f153500b;

        /* renamed from: c, reason: collision with root package name */
        public static final SkeletonType f153501c;

        /* renamed from: d, reason: collision with root package name */
        public static final SkeletonType f153502d;

        /* renamed from: e, reason: collision with root package name */
        public static final SkeletonType f153503e;

        /* renamed from: f, reason: collision with root package name */
        public static final SkeletonType f153504f;

        /* renamed from: g, reason: collision with root package name */
        public static final SkeletonType f153505g;

        /* renamed from: h, reason: collision with root package name */
        public static final SkeletonType f153506h;

        /* renamed from: i, reason: collision with root package name */
        public static final SkeletonType f153507i;

        /* renamed from: j, reason: collision with root package name */
        public static final SkeletonType f153508j;

        /* renamed from: k, reason: collision with root package name */
        public static final SkeletonType f153509k;

        /* renamed from: l, reason: collision with root package name */
        public static final SkeletonType f153510l;

        /* renamed from: m, reason: collision with root package name */
        public static final SkeletonType f153511m;

        /* renamed from: n, reason: collision with root package name */
        public static final SkeletonType f153512n;

        /* renamed from: o, reason: collision with root package name */
        public static final SkeletonType f153513o;

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ SkeletonType[] f153514p;

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153515q;

        static {
            SkeletonType skeletonType = new SkeletonType("FACTOID", 0);
            f153500b = skeletonType;
            SkeletonType skeletonType2 = new SkeletonType("TEXT_TITLE_LEFT", 1);
            f153501c = skeletonType2;
            SkeletonType skeletonType3 = new SkeletonType("TEXT_TITLE_RIGHT", 2);
            f153502d = skeletonType3;
            SkeletonType skeletonType4 = new SkeletonType("TEXT_TITLE_UP", 3);
            f153503e = skeletonType4;
            SkeletonType skeletonType5 = new SkeletonType("IMG_WITH_TEXT_IN_1_1", 4);
            f153504f = skeletonType5;
            SkeletonType skeletonType6 = new SkeletonType("IMG_WITH_TEXT_IN_4_3", 5);
            f153505g = skeletonType6;
            SkeletonType skeletonType7 = new SkeletonType("IMG_WITH_TEXT_IN_3_4", 6);
            f153506h = skeletonType7;
            SkeletonType skeletonType8 = new SkeletonType("IMG_WITH_TEXT_IN_WIDE", 7);
            f153507i = skeletonType8;
            SkeletonType skeletonType9 = new SkeletonType("IMG_WITH_TEXT_OUT_1_1", 8);
            f153508j = skeletonType9;
            SkeletonType skeletonType10 = new SkeletonType("IMG_WITH_TEXT_OUT_4_3", 9);
            f153509k = skeletonType10;
            SkeletonType skeletonType11 = new SkeletonType("IMG_WITH_TEXT_OUT_3_4", 10);
            f153510l = skeletonType11;
            SkeletonType skeletonType12 = new SkeletonType("IMG_WITH_TEXT_OUT_WIDE", 11);
            f153511m = skeletonType12;
            SkeletonType skeletonType13 = new SkeletonType("IMG_WITH_TEXT_IMG_START", 12);
            f153512n = skeletonType13;
            SkeletonType skeletonType14 = new SkeletonType("IMG_WITH_TEXT_TEXT_START", 13);
            f153513o = skeletonType14;
            SkeletonType[] skeletonTypeArr = {skeletonType, skeletonType2, skeletonType3, skeletonType4, skeletonType5, skeletonType6, skeletonType7, skeletonType8, skeletonType9, skeletonType10, skeletonType11, skeletonType12, skeletonType13, skeletonType14};
            f153514p = skeletonTypeArr;
            f153515q = kotlin.enums.c.a(skeletonTypeArr);
        }

        public SkeletonType() {
            throw null;
        }

        public static SkeletonType valueOf(String str) {
            return (SkeletonType) Enum.valueOf(SkeletonType.class, str);
        }

        public static SkeletonType[] values() {
            return (SkeletonType[]) f153514p.clone();
        }
    }

    /* compiled from: UniversalWidgetBlockView.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$TextPaddings;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextPaddings implements Parcelable {

        @k
        public static final Parcelable.Creator<TextPaddings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f153516b;

        /* renamed from: c, reason: collision with root package name */
        public final int f153517c;

        /* renamed from: d, reason: collision with root package name */
        public final int f153518d;

        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextPaddings> {
            @Override // android.os.Parcelable.Creator
            public final TextPaddings createFromParcel(Parcel parcel) {
                return new TextPaddings(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final TextPaddings[] newArray(int i12) {
                return new TextPaddings[i12];
            }
        }

        public TextPaddings(int i12, int i13, int i14) {
            this.f153516b = i12;
            this.f153517c = i13;
            this.f153518d = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextPaddings)) {
                return false;
            }
            TextPaddings textPaddings = (TextPaddings) obj;
            return this.f153516b == textPaddings.f153516b && this.f153517c == textPaddings.f153517c && this.f153518d == textPaddings.f153518d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f153518d) + r.e(this.f153517c, Integer.hashCode(this.f153516b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextPaddings(top=");
            sb2.append(this.f153516b);
            sb2.append(", horizontal=");
            sb2.append(this.f153517c);
            sb2.append(", bottom=");
            return r.t(sb2, this.f153518d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f153516b);
            parcel.writeInt(this.f153517c);
            parcel.writeInt(this.f153518d);
        }
    }

    /* compiled from: UniversalWidgetBlockView.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$UniversalWidgetBlockState;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetBlockState implements Parcelable {

        @k
        public static final Parcelable.Creator<UniversalWidgetBlockState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContentState f153519b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final LayoutState f153520c;

        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UniversalWidgetBlockState> {
            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetBlockState createFromParcel(Parcel parcel) {
                return new UniversalWidgetBlockState(ContentState.CREATOR.createFromParcel(parcel), LayoutState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetBlockState[] newArray(int i12) {
                return new UniversalWidgetBlockState[i12];
            }
        }

        public UniversalWidgetBlockState(@k ContentState contentState, @k LayoutState layoutState) {
            this.f153519b = contentState;
            this.f153520c = layoutState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalWidgetBlockState)) {
                return false;
            }
            UniversalWidgetBlockState universalWidgetBlockState = (UniversalWidgetBlockState) obj;
            return L.f(this.f153519b, universalWidgetBlockState.f153519b) && L.f(this.f153520c, universalWidgetBlockState.f153520c);
        }

        public final int hashCode() {
            return this.f153520c.hashCode() + (this.f153519b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "UniversalWidgetBlockState(contentState=" + this.f153519b + ", layoutState=" + this.f153520c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f153519b.writeToParcel(parcel, i12);
            this.f153520c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: UniversalWidgetBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutState.TextPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutState.TextPosition textPosition = LayoutState.TextPosition.f153496b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SkeletonType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SkeletonType skeletonType = SkeletonType.f153500b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SkeletonType skeletonType2 = SkeletonType.f153500b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SkeletonType skeletonType3 = SkeletonType.f153500b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SkeletonType skeletonType4 = SkeletonType.f153500b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                SkeletonType skeletonType5 = SkeletonType.f153500b;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                SkeletonType skeletonType6 = SkeletonType.f153500b;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                SkeletonType skeletonType7 = SkeletonType.f153500b;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                SkeletonType skeletonType8 = SkeletonType.f153500b;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                SkeletonType skeletonType9 = SkeletonType.f153500b;
                iArr2[9] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                SkeletonType skeletonType10 = SkeletonType.f153500b;
                iArr2[10] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                SkeletonType skeletonType11 = SkeletonType.f153500b;
                iArr2[11] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                SkeletonType skeletonType12 = SkeletonType.f153500b;
                iArr2[12] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                SkeletonType skeletonType13 = SkeletonType.f153500b;
                iArr2[13] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr3 = new int[LayoutState.TextColor.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                LayoutState.TextColor textColor = LayoutState.TextColor.f153491b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                LayoutState.TextColor textColor2 = LayoutState.TextColor.f153491b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    @j
    public UniversalWidgetBlockView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void h(TextView textView, LayoutState.TextColor textColor) {
        int iOrdinal = textColor.ordinal();
        if (iOrdinal == 0) {
            textView.setTextColor(C35835l0.d(R.attr.constantBlack, textView.getContext()));
        } else if (iOrdinal == 1) {
            textView.setTextColor(C35835l0.d(R.attr.constantWhite, textView.getContext()));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
        }
    }

    public final void g(@k UniversalWidgetBlockState universalWidgetBlockState) {
        int i12;
        LayoutState layoutState = universalWidgetBlockState.f153520c;
        Integer num = layoutState.f153481b;
        TextView textView = this.f153461d;
        if (num != null) {
            textView.setTextAppearance(C35835l0.j(num.intValue(), getContext()));
        }
        TextView textView2 = this.f153462e;
        Integer num2 = layoutState.f153482c;
        if (num2 != null) {
            textView2.setTextAppearance(C35835l0.j(num2.intValue(), getContext()));
        }
        TextView textView3 = this.f153463f;
        Integer num3 = layoutState.f153483d;
        if (num3 != null) {
            textView3.setTextAppearance(C35835l0.j(num3.intValue(), getContext()));
        }
        textView2.setPadding(textView2.getPaddingLeft(), layoutState.f153484e, textView2.getPaddingRight(), textView2.getPaddingBottom());
        SimpleDraweeView simpleDraweeView = this.f153467j;
        float f12 = layoutState.f153486g;
        simpleDraweeView.setAspectRatio(f12);
        v.a(simpleDraweeView, layoutState.f153489j);
        boolean z12 = false;
        ContentState contentState = universalWidgetBlockState.f153519b;
        boolean z13 = layoutState.f153487h;
        D6.G(this.f153464g, z13 && contentState.f153470b == null);
        boolean z14 = z13 && contentState.f153470b == null;
        View view = this.f153465h;
        D6.G(view, z14);
        D6.G(this.f153466i, layoutState.f153488i);
        int iOrdinal = layoutState.f153485f.ordinal();
        ViewGroup viewGroup = this.f153460c;
        if (iOrdinal == 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f44199k = -1;
            bVar.f44197j = simpleDraweeView.getId();
            bVar.f44203m = simpleDraweeView.getId();
            viewGroup.setLayoutParams(bVar);
        } else if (iOrdinal == 1) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f44199k = simpleDraweeView.getId();
            bVar2.f44197j = -1;
            bVar2.f44203m = -1;
            viewGroup.setLayoutParams(bVar2);
            LayoutState.TextColor textColor = LayoutState.TextColor.f153493d;
            h(textView, textColor);
            h(textView2, textColor);
            h(textView3, textColor);
        }
        TextPaddings textPaddings = layoutState.f153490k;
        int i13 = textPaddings.f153516b;
        int i14 = textPaddings.f153517c;
        viewGroup.setPadding(i14, i13, i14, textPaddings.f153518d);
        SkeletonType skeletonType = contentState.f153470b;
        FrameLayout frameLayout = this.f153468k;
        if (skeletonType != null) {
            D6.w(simpleDraweeView);
            D6.w(textView);
            D6.w(textView2);
            D6.w(textView3);
            switch (skeletonType.ordinal()) {
                case 0:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_factoid;
                    break;
                case 1:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_text_title_left;
                    break;
                case 2:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_text_title_right;
                    break;
                case 3:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_text_title_up;
                    break;
                case 4:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_in_1_1;
                    break;
                case 5:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_in_4_3;
                    break;
                case 6:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_in_3_4;
                    break;
                case 7:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_in_wide;
                    break;
                case 8:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_out_1_1;
                    break;
                case 9:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_out_4_3;
                    break;
                case 10:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_out_3_4;
                    break;
                case 11:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_out_wide;
                    break;
                case 12:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_image_start;
                    break;
                case 13:
                    i12 = R.drawable.ic_universal_widget_block_skeleton_img_with_text_text_start;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.f153469l.setImageResource(i12);
            D6.H(frameLayout);
            ((ConstraintLayout.b) frameLayout.getLayoutParams()).f44161H = "W,1:" + f12;
            return;
        }
        D6.w(frameLayout);
        String str = contentState.f153471c;
        I5.a(textView, str, false);
        Integer num4 = contentState.f153472d;
        textView.setMaxLines(num4 != null ? num4.intValue() : Integer.MAX_VALUE);
        LayoutState.TextColor textColor2 = contentState.f153477i;
        h(textView, textColor2);
        String str2 = contentState.f153473e;
        I5.a(textView2, str2, false);
        Integer num5 = contentState.f153474f;
        textView2.setMaxLines(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
        h(textView2, textColor2);
        String str3 = contentState.f153475g;
        I5.a(textView3, str3, false);
        Integer num6 = contentState.f153476h;
        textView3.setMaxLines(num6 != null ? num6.intValue() : Integer.MAX_VALUE);
        h(textView3, textColor2);
        if ((str != null && str.length() != 0) || ((str2 != null && str2.length() != 0) || (str3 != null && str3.length() != 0))) {
            z12 = true;
        }
        D6.G(viewGroup, z12);
        SimpleDraweeView simpleDraweeView2 = this.f153467j;
        Uri uri = contentState.f153480l;
        if (uri != null) {
            C35949t5.c(simpleDraweeView2, new p(uri), null, null, null, 14);
            D6.H(simpleDraweeView2);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.f44203m = simpleDraweeView2.getId();
            view.setLayoutParams(bVar3);
            return;
        }
        Image image = contentState.f153479k;
        if (image != null) {
            C35949t5.c(this.f153467j, com.avito.android.image_loader.b.b(image), null, null, null, 14);
            D6.H(simpleDraweeView2);
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
            bVar4.f44203m = simpleDraweeView2.getId();
            view.setLayoutParams(bVar4);
            return;
        }
        Integer num7 = contentState.f153478j;
        if (num7 == null) {
            C35949t5.c(simpleDraweeView2, null, null, null, null, 14);
            D6.w(simpleDraweeView2);
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
            bVar5.f44203m = this.f153459b.getId();
            view.setLayoutParams(bVar5);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView2);
        Resources resources = getResources();
        int iIntValue = num7.intValue();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        aVarA.f169484b = new ImageRequest.d.a(new ColorDrawable(resources.getColor(iIntValue, null)), null);
        aVarA.f169494l = true;
        aVarA.c();
        D6.H(simpleDraweeView2);
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar6 = (ConstraintLayout.b) layoutParams6;
        bVar6.f44203m = simpleDraweeView2.getId();
        view.setLayoutParams(bVar6);
    }

    public final void i() {
        C35949t5.a(this.f153467j).b();
    }

    public final void setOnRemoveClickListener(@k Y41.a<G0> action) {
        this.f153466i.setOnClickListener(new h(20, action));
    }

    public UniversalWidgetBlockView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.extended_profile_universal_widget_block, this);
        this.f153459b = (ViewGroup) findViewById(R.id.extended_profile_universal_widget_block_container);
        this.f153460c = (ViewGroup) findViewById(R.id.extended_profile_universal_widget_block_text_container);
        this.f153461d = (TextView) findViewById(R.id.extended_profile_universal_widget_block_title);
        this.f153462e = (TextView) findViewById(R.id.extended_profile_universal_widget_block_subtitle);
        this.f153463f = (TextView) findViewById(R.id.extended_profile_universal_widget_block_description);
        this.f153464g = findViewById(R.id.extended_profile_universal_widget_block_error_overlay);
        this.f153465h = findViewById(R.id.extended_profile_universal_widget_block_error_icon);
        this.f153466i = findViewById(R.id.extended_profile_universal_widget_remove_block);
        this.f153467j = (SimpleDraweeView) findViewById(R.id.extended_profile_universal_widget_block_image);
        this.f153468k = (FrameLayout) findViewById(R.id.extended_profile_universal_widget_block_skeleton);
        this.f153469l = (ImageView) findViewById(R.id.extended_profile_universal_widget_block_skeleton_image);
    }

    /* compiled from: UniversalWidgetBlockView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$LayoutState;", "Landroid/os/Parcelable;", "TextColor", "TextPosition", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LayoutState implements Parcelable {

        @k
        public static final Parcelable.Creator<LayoutState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f153481b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f153482c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f153483d;

        /* renamed from: e, reason: collision with root package name */
        public final int f153484e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final TextPosition f153485f;

        /* renamed from: g, reason: collision with root package name */
        public final float f153486g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f153487h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f153488i;

        /* renamed from: j, reason: collision with root package name */
        public final int f153489j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final TextPaddings f153490k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$LayoutState$TextColor;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TextColor {

            /* renamed from: b, reason: collision with root package name */
            public static final TextColor f153491b;

            /* renamed from: c, reason: collision with root package name */
            public static final TextColor f153492c;

            /* renamed from: d, reason: collision with root package name */
            public static final TextColor f153493d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ TextColor[] f153494e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f153495f;

            static {
                TextColor textColor = new TextColor("BLACK", 0);
                f153491b = textColor;
                TextColor textColor2 = new TextColor("WHITE", 1);
                f153492c = textColor2;
                TextColor textColor3 = new TextColor("SYSTEM_TEXT", 2);
                f153493d = textColor3;
                TextColor[] textColorArr = {textColor, textColor2, textColor3};
                f153494e = textColorArr;
                f153495f = kotlin.enums.c.a(textColorArr);
            }

            public TextColor() {
                throw null;
            }

            public static TextColor valueOf(String str) {
                return (TextColor) Enum.valueOf(TextColor.class, str);
            }

            public static TextColor[] values() {
                return (TextColor[]) f153494e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetBlockView$LayoutState$TextPosition;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TextPosition {

            /* renamed from: b, reason: collision with root package name */
            public static final TextPosition f153496b;

            /* renamed from: c, reason: collision with root package name */
            public static final TextPosition f153497c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ TextPosition[] f153498d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f153499e;

            static {
                TextPosition textPosition = new TextPosition("TEXT_IN", 0);
                f153496b = textPosition;
                TextPosition textPosition2 = new TextPosition("TEXT_OUT", 1);
                f153497c = textPosition2;
                TextPosition[] textPositionArr = {textPosition, textPosition2};
                f153498d = textPositionArr;
                f153499e = kotlin.enums.c.a(textPositionArr);
            }

            public TextPosition() {
                throw null;
            }

            public static TextPosition valueOf(String str) {
                return (TextPosition) Enum.valueOf(TextPosition.class, str);
            }

            public static TextPosition[] values() {
                return (TextPosition[]) f153498d.clone();
            }
        }

        /* compiled from: UniversalWidgetBlockView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LayoutState> {
            @Override // android.os.Parcelable.Creator
            public final LayoutState createFromParcel(Parcel parcel) {
                return new LayoutState(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), TextPosition.valueOf(parcel.readString()), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), TextPaddings.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutState[] newArray(int i12) {
                return new LayoutState[i12];
            }
        }

        public LayoutState(@InterfaceC42150f @l Integer num, @InterfaceC42150f @l Integer num2, @InterfaceC42150f @l Integer num3, int i12, @k TextPosition textPosition, float f12, boolean z12, boolean z13, int i13, @k TextPaddings textPaddings) {
            this.f153481b = num;
            this.f153482c = num2;
            this.f153483d = num3;
            this.f153484e = i12;
            this.f153485f = textPosition;
            this.f153486g = f12;
            this.f153487h = z12;
            this.f153488i = z13;
            this.f153489j = i13;
            this.f153490k = textPaddings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutState)) {
                return false;
            }
            LayoutState layoutState = (LayoutState) obj;
            return L.f(this.f153481b, layoutState.f153481b) && L.f(this.f153482c, layoutState.f153482c) && L.f(this.f153483d, layoutState.f153483d) && this.f153484e == layoutState.f153484e && this.f153485f == layoutState.f153485f && Float.compare(this.f153486g, layoutState.f153486g) == 0 && this.f153487h == layoutState.f153487h && this.f153488i == layoutState.f153488i && this.f153489j == layoutState.f153489j && L.f(this.f153490k, layoutState.f153490k);
        }

        public final int hashCode() {
            Integer num = this.f153481b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f153482c;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f153483d;
            return this.f153490k.hashCode() + r.e(this.f153489j, r.i(r.i(r.d(this.f153486g, (this.f153485f.hashCode() + r.e(this.f153484e, (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31)) * 31, 31), 31, this.f153487h), 31, this.f153488i), 31);
        }

        @k
        public final String toString() {
            return "LayoutState(titleTextAppearance=" + this.f153481b + ", subtitleTextAppearance=" + this.f153482c + ", descriptionTextAppearance=" + this.f153483d + ", subtitleTopPadding=" + this.f153484e + ", textPosition=" + this.f153485f + ", ratio=" + this.f153486g + ", withErrorOverlay=" + this.f153487h + ", withRemoveButton=" + this.f153488i + ", imageCornerRadius=" + this.f153489j + ", textPaddings=" + this.f153490k + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Integer num = this.f153481b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f153482c;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Integer num3 = this.f153483d;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            parcel.writeInt(this.f153484e);
            parcel.writeString(this.f153485f.name());
            parcel.writeFloat(this.f153486g);
            parcel.writeInt(this.f153487h ? 1 : 0);
            parcel.writeInt(this.f153488i ? 1 : 0);
            parcel.writeInt(this.f153489j);
            this.f153490k.writeToParcel(parcel, i12);
        }

        public /* synthetic */ LayoutState(Integer num, Integer num2, Integer num3, int i12, TextPosition textPosition, float f12, boolean z12, boolean z13, int i13, TextPaddings textPaddings, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, i12, (i14 & 16) != 0 ? TextPosition.f153497c : textPosition, f12, z12, z13, i13, textPaddings);
        }
    }
}
