package com.avito.android.rating_ui.lmm_summary;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BaseRatingLLMSummaryItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "Button", "FeedbackSent", "Section", "Title", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class BaseRatingLLMSummaryItem implements com.avito.conveyor_item.a, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Title f250053b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<Section> f250054c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Button> f250055d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FeedbackSent f250056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f250057f;

    /* compiled from: BaseRatingLLMSummaryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem$Button;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f250058b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f250059c;

        /* compiled from: BaseRatingLLMSummaryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@l String str, @l DeepLink deepLink) {
            this.f250058b = str;
            this.f250059c = deepLink;
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
            return L.f(this.f250058b, button.f250058b) && L.f(this.f250059c, button.f250059c);
        }

        public final int hashCode() {
            String str = this.f250058b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.f250059c;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f250058b);
            sb2.append(", action=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f250059c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250058b);
            parcel.writeParcelable(this.f250059c, i12);
        }
    }

    /* compiled from: BaseRatingLLMSummaryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem$FeedbackSent;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeedbackSent implements Parcelable {

        @k
        public static final Parcelable.Creator<FeedbackSent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f250060b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f250061c;

        /* compiled from: BaseRatingLLMSummaryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FeedbackSent> {
            @Override // android.os.Parcelable.Creator
            public final FeedbackSent createFromParcel(Parcel parcel) {
                return new FeedbackSent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FeedbackSent[] newArray(int i12) {
                return new FeedbackSent[i12];
            }
        }

        public FeedbackSent(@l String str, @l String str2) {
            this.f250060b = str;
            this.f250061c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackSent)) {
                return false;
            }
            FeedbackSent feedbackSent = (FeedbackSent) obj;
            return L.f(this.f250060b, feedbackSent.f250060b) && L.f(this.f250061c, feedbackSent.f250061c);
        }

        public final int hashCode() {
            String str = this.f250060b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f250061c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FeedbackSent(title=");
            sb2.append(this.f250060b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f250061c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250060b);
            parcel.writeString(this.f250061c);
        }
    }

    /* compiled from: BaseRatingLLMSummaryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem$Section;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Section implements Parcelable {

        @k
        public static final Parcelable.Creator<Section> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f250062b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f250063c;

        /* compiled from: BaseRatingLLMSummaryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Section> {
            @Override // android.os.Parcelable.Creator
            public final Section createFromParcel(Parcel parcel) {
                return new Section(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Section[] newArray(int i12) {
                return new Section[i12];
            }
        }

        public Section(@l String str, @l String str2) {
            this.f250062b = str;
            this.f250063c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return L.f(this.f250062b, section.f250062b) && L.f(this.f250063c, section.f250063c);
        }

        public final int hashCode() {
            String str = this.f250062b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f250063c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Section(title=");
            sb2.append(this.f250062b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f250063c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250062b);
            parcel.writeString(this.f250063c);
        }
    }

    /* compiled from: BaseRatingLLMSummaryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem$Title;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Title implements Parcelable {

        @k
        public static final Parcelable.Creator<Title> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f250064b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f250065c;

        /* compiled from: BaseRatingLLMSummaryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                return new Title(parcel.readString(), (DeepLink) parcel.readParcelable(Title.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i12) {
                return new Title[i12];
            }
        }

        public Title(@l String str, @l DeepLink deepLink) {
            this.f250064b = str;
            this.f250065c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return L.f(this.f250064b, title.f250064b) && L.f(this.f250065c, title.f250065c);
        }

        @l
        /* renamed from: getText, reason: from getter */
        public final String getF250064b() {
            return this.f250064b;
        }

        public final int hashCode() {
            String str = this.f250064b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.f250065c;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Title(text=");
            sb2.append(this.f250064b);
            sb2.append(", action=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f250065c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250064b);
            parcel.writeParcelable(this.f250065c, i12);
        }
    }

    public BaseRatingLLMSummaryItem(@k Title title, @l List<Section> list, @l List<Button> list2, @k FeedbackSent feedbackSent, boolean z12) {
        this.f250053b = title;
        this.f250054c = list;
        this.f250055d = list2;
        this.f250056e = feedbackSent;
        this.f250057f = z12;
    }

    public void A1() {
        this.f250057f = false;
    }

    @k
    /* renamed from: L, reason: from getter */
    public FeedbackSent getF250070k() {
        return this.f250056e;
    }

    @l
    public List<Section> W() {
        return this.f250054c;
    }

    @l
    public List<Button> f() {
        return this.f250055d;
    }

    /* renamed from: g0, reason: from getter */
    public boolean getF250071l() {
        return this.f250057f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF85003b() {
        return getF236852b().hashCode();
    }

    @k
    /* renamed from: q1, reason: from getter */
    public Title getF250067h() {
        return this.f250053b;
    }
}
