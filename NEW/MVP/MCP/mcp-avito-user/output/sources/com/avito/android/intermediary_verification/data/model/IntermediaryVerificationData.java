package com.avito.android.intermediary_verification.data.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationData;", "Landroid/os/Parcelable;", "Benefit", "Button", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IntermediaryVerificationData implements Parcelable {

    @k
    public static final Parcelable.Creator<IntermediaryVerificationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173090b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f173091c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f173092d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Object f173093e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f173094f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f173095g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f173096h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f173097i;

    /* compiled from: IntermediaryVerificationData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationData$Benefit;", "Landroid/os/Parcelable;", "IconType", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Benefit implements Parcelable {

        @k
        public static final Parcelable.Creator<Benefit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f173098b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f173099c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final IconType f173100d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IntermediaryVerificationData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationData$Benefit$IconType;", "", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IconType {

            /* renamed from: b, reason: collision with root package name */
            public static final IconType f173101b;

            /* renamed from: c, reason: collision with root package name */
            public static final IconType f173102c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ IconType[] f173103d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f173104e;

            static {
                IconType iconType = new IconType("VAS", 0);
                f173101b = iconType;
                IconType iconType2 = new IconType("ITEM_RICH", 1);
                f173102c = iconType2;
                IconType[] iconTypeArr = {iconType, iconType2};
                f173103d = iconTypeArr;
                f173104e = c.a(iconTypeArr);
            }

            public IconType() {
                throw null;
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) f173103d.clone();
            }
        }

        /* compiled from: IntermediaryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Benefit> {
            @Override // android.os.Parcelable.Creator
            public final Benefit createFromParcel(Parcel parcel) {
                return new Benefit(parcel.readString(), parcel.readString(), IconType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Benefit[] newArray(int i12) {
                return new Benefit[i12];
            }
        }

        public Benefit(@k String str, @k String str2, @k IconType iconType) {
            this.f173098b = str;
            this.f173099c = str2;
            this.f173100d = iconType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) obj;
            return L.f(this.f173098b, benefit.f173098b) && L.f(this.f173099c, benefit.f173099c) && this.f173100d == benefit.f173100d;
        }

        public final int hashCode() {
            return this.f173100d.hashCode() + H.d(this.f173098b.hashCode() * 31, 31, this.f173099c);
        }

        @k
        public final String toString() {
            return "Benefit(title=" + this.f173098b + ", description=" + this.f173099c + ", iconType=" + this.f173100d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f173098b);
            parcel.writeString(this.f173099c);
            parcel.writeString(this.f173100d.name());
        }
    }

    /* compiled from: IntermediaryVerificationData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationData$Button;", "Landroid/os/Parcelable;", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f173105b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f173106c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f173107d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f173108e;

        /* compiled from: IntermediaryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button((DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@l DeepLink deepLink, @k String str, @k String str2, boolean z12) {
            this.f173105b = str;
            this.f173106c = deepLink;
            this.f173107d = str2;
            this.f173108e = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f173105b, button.f173105b) && L.f(this.f173106c, button.f173106c) && L.f(this.f173107d, button.f173107d) && this.f173108e == button.f173108e;
        }

        public final int hashCode() {
            int iHashCode = this.f173105b.hashCode() * 31;
            DeepLink deepLink = this.f173106c;
            return Boolean.hashCode(this.f173108e) + H.d((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f173107d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f173105b);
            sb2.append(", deeplink=");
            sb2.append(this.f173106c);
            sb2.append(", style=");
            sb2.append(this.f173107d);
            sb2.append(", enabled=");
            return r.x(sb2, this.f173108e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f173105b);
            parcel.writeParcelable(this.f173106c, i12);
            parcel.writeString(this.f173107d);
            parcel.writeInt(this.f173108e ? 1 : 0);
        }
    }

    /* compiled from: IntermediaryVerificationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntermediaryVerificationData> {
        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(IntermediaryVerificationData.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new IntermediaryVerificationData(string, attributedText, string2, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationData[] newArray(int i12) {
            return new IntermediaryVerificationData[i12];
        }
    }

    public IntermediaryVerificationData(@k String str, @k AttributedText attributedText, @l String str2, @l List<Benefit> list, @k Button button, @k Button button2, @l String str3, @l String str4) {
        this.f173090b = str;
        this.f173091c = attributedText;
        this.f173092d = str2;
        this.f173093e = list;
        this.f173094f = button;
        this.f173095g = button2;
        this.f173096h = str3;
        this.f173097i = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntermediaryVerificationData)) {
            return false;
        }
        IntermediaryVerificationData intermediaryVerificationData = (IntermediaryVerificationData) obj;
        return L.f(this.f173090b, intermediaryVerificationData.f173090b) && L.f(this.f173091c, intermediaryVerificationData.f173091c) && L.f(this.f173092d, intermediaryVerificationData.f173092d) && L.f(this.f173093e, intermediaryVerificationData.f173093e) && L.f(this.f173094f, intermediaryVerificationData.f173094f) && L.f(this.f173095g, intermediaryVerificationData.f173095g) && L.f(this.f173096h, intermediaryVerificationData.f173096h) && L.f(this.f173097i, intermediaryVerificationData.f173097i);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f173090b.hashCode() * 31, 31, this.f173091c);
        String str = this.f173092d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f173093e;
        int iHashCode2 = (this.f173095g.hashCode() + ((this.f173094f.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f173096h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173097i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntermediaryVerificationData(title=");
        sb2.append(this.f173090b);
        sb2.append(", description=");
        sb2.append(this.f173091c);
        sb2.append(", benefitsHeader=");
        sb2.append(this.f173092d);
        sb2.append(", benefits=");
        sb2.append(this.f173093e);
        sb2.append(", submitButton=");
        sb2.append(this.f173094f);
        sb2.append(", leaveButton=");
        sb2.append(this.f173095g);
        sb2.append(", bottomText=");
        sb2.append(this.f173096h);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f173097i, ')');
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173090b);
        parcel.writeParcelable(this.f173091c, i12);
        parcel.writeString(this.f173092d);
        ?? r02 = this.f173093e;
        if (r02 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                ((Benefit) it.next()).writeToParcel(parcel, i12);
            }
        }
        this.f173094f.writeToParcel(parcel, i12);
        this.f173095g.writeToParcel(parcel, i12);
        parcel.writeString(this.f173096h);
        parcel.writeString(this.f173097i);
    }
}
