package com.avito.android.rating_form.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "RatingFormStepProgress", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RatingFormArguments f248744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f248745c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final StepIdentifier f248746d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f248747e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248748f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f248749g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f248750h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f248751i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Screen f248752j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f248753k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f248754l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final RatingFormStepProgress f248755m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f248756n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f248743o = new a(null);

    @k
    public static final Parcelable.Creator<RatingFormState> CREATOR = new b();

    /* compiled from: RatingFormState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress;", "Landroid/os/Parcelable;", "Empty", "Progress", "Title", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Empty;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Progress;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Title;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RatingFormStepProgress extends Parcelable {

        /* compiled from: RatingFormState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Empty;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Empty implements RatingFormStepProgress {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Empty f248757b = new Empty();

            @k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* compiled from: RatingFormState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Empty.f248757b;
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return 608588129;
            }

            @k
            public final String toString() {
                return "Empty";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: RatingFormState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Progress;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Progress implements RatingFormStepProgress {

            @k
            public static final Parcelable.Creator<Progress> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final float f248758b;

            /* compiled from: RatingFormState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Progress> {
                @Override // android.os.Parcelable.Creator
                public final Progress createFromParcel(Parcel parcel) {
                    return new Progress(parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Progress[] newArray(int i12) {
                    return new Progress[i12];
                }
            }

            public Progress(float f12) {
                this.f248758b = f12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Progress) && Float.compare(this.f248758b, ((Progress) obj).f248758b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f248758b);
            }

            @k
            public final String toString() {
                return r.k(')', this.f248758b, new StringBuilder("Progress(progress="));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeFloat(this.f248758b);
            }
        }

        /* compiled from: RatingFormState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress$Title;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState$RatingFormStepProgress;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Title implements RatingFormStepProgress {

            @k
            public static final Parcelable.Creator<Title> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f248759b;

            /* compiled from: RatingFormState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Title> {
                @Override // android.os.Parcelable.Creator
                public final Title createFromParcel(Parcel parcel) {
                    return new Title(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Title[] newArray(int i12) {
                    return new Title[i12];
                }
            }

            public Title(@k String str) {
                this.f248759b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Title) && L.f(this.f248759b, ((Title) obj).f248759b);
            }

            public final int hashCode() {
                return this.f248759b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Title(title="), this.f248759b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f248759b);
            }
        }
    }

    /* compiled from: RatingFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormState$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RatingFormState> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormState createFromParcel(Parcel parcel) {
            return new RatingFormState((RatingFormArguments) parcel.readParcelable(RatingFormState.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : StepIdentifier.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RatingFormState.class.getClassLoader()), parcel.readInt() != 0 ? Screen.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readInt() != 0, (RatingFormStepProgress) parcel.readParcelable(RatingFormState.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormState[] newArray(int i12) {
            return new RatingFormState[i12];
        }
    }

    public RatingFormState(@k RatingFormArguments ratingFormArguments, int i12, @l StepIdentifier stepIdentifier, @l String str, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink, @l Screen screen, boolean z12, boolean z13, @k RatingFormStepProgress ratingFormStepProgress, @l String str5) {
        this.f248744b = ratingFormArguments;
        this.f248745c = i12;
        this.f248746d = stepIdentifier;
        this.f248747e = str;
        this.f248748f = str2;
        this.f248749g = str3;
        this.f248750h = str4;
        this.f248751i = deepLink;
        this.f248752j = screen;
        this.f248753k = z12;
        this.f248754l = z13;
        this.f248755m = ratingFormStepProgress;
        this.f248756n = str5;
    }

    public static RatingFormState a(RatingFormState ratingFormState, RatingFormArguments ratingFormArguments, int i12, StepIdentifier stepIdentifier, String str, String str2, String str3, String str4, DeepLink deepLink, Screen screen, boolean z12, boolean z13, RatingFormStepProgress ratingFormStepProgress, String str5, int i13) {
        RatingFormArguments ratingFormArguments2 = (i13 & 1) != 0 ? ratingFormState.f248744b : ratingFormArguments;
        int i14 = (i13 & 2) != 0 ? ratingFormState.f248745c : i12;
        StepIdentifier stepIdentifier2 = (i13 & 4) != 0 ? ratingFormState.f248746d : stepIdentifier;
        String str6 = (i13 & 8) != 0 ? ratingFormState.f248747e : str;
        String str7 = (i13 & 16) != 0 ? ratingFormState.f248748f : str2;
        String str8 = (i13 & 32) != 0 ? ratingFormState.f248749g : str3;
        String str9 = (i13 & 64) != 0 ? ratingFormState.f248750h : str4;
        DeepLink deepLink2 = (i13 & 128) != 0 ? ratingFormState.f248751i : deepLink;
        Screen screen2 = (i13 & 256) != 0 ? ratingFormState.f248752j : screen;
        boolean z14 = (i13 & 512) != 0 ? ratingFormState.f248753k : z12;
        boolean z15 = (i13 & 1024) != 0 ? ratingFormState.f248754l : z13;
        RatingFormStepProgress ratingFormStepProgress2 = (i13 & 2048) != 0 ? ratingFormState.f248755m : ratingFormStepProgress;
        String str10 = (i13 & 4096) != 0 ? ratingFormState.f248756n : str5;
        ratingFormState.getClass();
        return new RatingFormState(ratingFormArguments2, i14, stepIdentifier2, str6, str7, str8, str9, deepLink2, screen2, z14, z15, ratingFormStepProgress2, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormState)) {
            return false;
        }
        RatingFormState ratingFormState = (RatingFormState) obj;
        return L.f(this.f248744b, ratingFormState.f248744b) && this.f248745c == ratingFormState.f248745c && L.f(this.f248746d, ratingFormState.f248746d) && L.f(this.f248747e, ratingFormState.f248747e) && L.f(this.f248748f, ratingFormState.f248748f) && L.f(this.f248749g, ratingFormState.f248749g) && L.f(this.f248750h, ratingFormState.f248750h) && L.f(this.f248751i, ratingFormState.f248751i) && this.f248752j == ratingFormState.f248752j && this.f248753k == ratingFormState.f248753k && this.f248754l == ratingFormState.f248754l && L.f(this.f248755m, ratingFormState.f248755m) && L.f(this.f248756n, ratingFormState.f248756n);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f248745c, this.f248744b.hashCode() * 31, 31);
        StepIdentifier stepIdentifier = this.f248746d;
        int iHashCode = (iE2 + (stepIdentifier == null ? 0 : stepIdentifier.hashCode())) * 31;
        String str = this.f248747e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248748f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248749g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f248750h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.f248751i;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Screen screen = this.f248752j;
        int iHashCode7 = (this.f248755m.hashCode() + r.i(r.i((iHashCode6 + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.f248753k), 31, this.f248754l)) * 31;
        String str5 = this.f248756n;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormState(formArguments=");
        sb2.append(this.f248744b);
        sb2.append(", draftId=");
        sb2.append(this.f248745c);
        sb2.append(", stepIdentifier=");
        sb2.append(this.f248746d);
        sb2.append(", suffix=");
        sb2.append(this.f248747e);
        sb2.append(", title=");
        sb2.append(this.f248748f);
        sb2.append(", message=");
        sb2.append(this.f248749g);
        sb2.append(", buttonText=");
        sb2.append(this.f248750h);
        sb2.append(", buttonUrl=");
        sb2.append(this.f248751i);
        sb2.append(", screen=");
        sb2.append(this.f248752j);
        sb2.append(", isLoading=");
        sb2.append(this.f248753k);
        sb2.append(", error=");
        sb2.append(this.f248754l);
        sb2.append(", progress=");
        sb2.append(this.f248755m);
        sb2.append(", publishedRatingUserKey=");
        return C22026a.c(sb2, this.f248756n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f248744b, i12);
        parcel.writeInt(this.f248745c);
        StepIdentifier stepIdentifier = this.f248746d;
        if (stepIdentifier == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stepIdentifier.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f248747e);
        parcel.writeString(this.f248748f);
        parcel.writeString(this.f248749g);
        parcel.writeString(this.f248750h);
        parcel.writeParcelable(this.f248751i, i12);
        Screen screen = this.f248752j;
        if (screen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screen.name());
        }
        parcel.writeInt(this.f248753k ? 1 : 0);
        parcel.writeInt(this.f248754l ? 1 : 0);
        parcel.writeParcelable(this.f248755m, i12);
        parcel.writeString(this.f248756n);
    }
}
