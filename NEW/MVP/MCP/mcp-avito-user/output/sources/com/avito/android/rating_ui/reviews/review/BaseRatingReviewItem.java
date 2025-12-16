package com.avito.android.rating_ui.reviews.review;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: BaseRatingReviewItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "ReviewAction", "ReviewAnswer", "ReviewStatus", "ReviewTextSection", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class BaseRatingReviewItem implements com.avito.conveyor_item.a, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f250224b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f250225c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f250226d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f250227e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f250228f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ReviewStatus f250229g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f250230h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AttributedText f250231i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Float f250232j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f250233k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f250234l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f250235m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final List<TnsGalleryImage> f250236n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<ReviewTextSection> f250237o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final ReviewAnswer f250238p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final List<ReviewAction> f250239q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final RatingItemsMarginHorizontal f250240r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Parcelable f250241s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f250242t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f250243u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f250244v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f250245w;

    /* compiled from: BaseRatingReviewItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction;", "Landroid/os/Parcelable;", "Button", "ButtonType", "ConfirmDialog", "ReviewActionType", "ReviewActionValue", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ReviewAction implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ReviewAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ReviewActionType f250246b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ReviewActionValue f250247c;

        /* compiled from: BaseRatingReviewItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$Button;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f250248b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final ButtonType f250249c;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), ButtonType.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@Y61.k String str, @Y61.k ButtonType buttonType) {
                this.f250248b = str;
                this.f250249c = buttonType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.f250248b, button.f250248b) && this.f250249c == button.f250249c;
            }

            public final int hashCode() {
                return this.f250249c.hashCode() + (this.f250248b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Button(text=" + this.f250248b + ", type=" + this.f250249c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f250248b);
                this.f250249c.writeToParcel(parcel, i12);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ButtonType;", "", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class ButtonType implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<ButtonType> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final ButtonType f250250b;

            /* renamed from: c, reason: collision with root package name */
            public static final ButtonType f250251c;

            /* renamed from: d, reason: collision with root package name */
            public static final ButtonType f250252d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ButtonType[] f250253e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f250254f;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ButtonType> {
                @Override // android.os.Parcelable.Creator
                public final ButtonType createFromParcel(Parcel parcel) {
                    return ButtonType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ButtonType[] newArray(int i12) {
                    return new ButtonType[i12];
                }
            }

            static {
                ButtonType buttonType = new ButtonType("POSITIVE", 0);
                f250250b = buttonType;
                ButtonType buttonType2 = new ButtonType("NEGATIVE", 1);
                f250251c = buttonType2;
                ButtonType buttonType3 = new ButtonType("NEUTRAL", 2);
                f250252d = buttonType3;
                ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
                f250253e = buttonTypeArr;
                f250254f = kotlin.enums.c.a(buttonTypeArr);
                CREATOR = new a();
            }

            public ButtonType() {
                throw null;
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) f250253e.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(name());
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ConfirmDialog;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConfirmDialog implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<ConfirmDialog> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f250255b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f250256c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final ArrayList f250257d;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ConfirmDialog> {
                @Override // android.os.Parcelable.Creator
                public final ConfirmDialog createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new ConfirmDialog(string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final ConfirmDialog[] newArray(int i12) {
                    return new ConfirmDialog[i12];
                }
            }

            public ConfirmDialog(@Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
                this.f250255b = str;
                this.f250256c = str2;
                this.f250257d = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmDialog)) {
                    return false;
                }
                ConfirmDialog confirmDialog = (ConfirmDialog) obj;
                return L.f(this.f250255b, confirmDialog.f250255b) && L.f(this.f250256c, confirmDialog.f250256c) && this.f250257d.equals(confirmDialog.f250257d);
            }

            public final int hashCode() {
                return this.f250257d.hashCode() + H.d(this.f250255b.hashCode() * 31, 31, this.f250256c);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ConfirmDialog(title=");
                sb2.append(this.f250255b);
                sb2.append(", text=");
                sb2.append(this.f250256c);
                sb2.append(", buttons=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f250257d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f250255b);
                parcel.writeString(this.f250256c);
                Iterator itZ = com.avito.android.actions_sheet.a.z(this.f250257d, parcel);
                while (itZ.hasNext()) {
                    ((Button) itZ.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionType;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ReviewActionType {

            /* renamed from: b, reason: collision with root package name */
            public static final ReviewActionType f250258b;

            /* renamed from: c, reason: collision with root package name */
            public static final ReviewActionType f250259c;

            /* renamed from: d, reason: collision with root package name */
            public static final ReviewActionType f250260d;

            /* renamed from: e, reason: collision with root package name */
            public static final ReviewActionType f250261e;

            /* renamed from: f, reason: collision with root package name */
            public static final ReviewActionType f250262f;

            /* renamed from: g, reason: collision with root package name */
            public static final ReviewActionType f250263g;

            /* renamed from: h, reason: collision with root package name */
            public static final ReviewActionType f250264h;

            /* renamed from: i, reason: collision with root package name */
            public static final ReviewActionType f250265i;

            /* renamed from: j, reason: collision with root package name */
            public static final ReviewActionType f250266j;

            /* renamed from: k, reason: collision with root package name */
            public static final /* synthetic */ ReviewActionType[] f250267k;

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f250268l;

            static {
                ReviewActionType reviewActionType = new ReviewActionType("ANSWER", 0);
                f250258b = reviewActionType;
                ReviewActionType reviewActionType2 = new ReviewActionType("REMOVE_ANSWER", 1);
                f250259c = reviewActionType2;
                ReviewActionType reviewActionType3 = new ReviewActionType("REMOVE_REVIEW", 2);
                f250260d = reviewActionType3;
                ReviewActionType reviewActionType4 = new ReviewActionType("REMOVE_BUYER_REVIEW", 3);
                f250261e = reviewActionType4;
                ReviewActionType reviewActionType5 = new ReviewActionType("LINK", 4);
                f250262f = reviewActionType5;
                ReviewActionType reviewActionType6 = new ReviewActionType("NETWORK_REQUEST", 5);
                f250263g = reviewActionType6;
                ReviewActionType reviewActionType7 = new ReviewActionType("BOTTOM_SHEET", 6);
                f250264h = reviewActionType7;
                ReviewActionType reviewActionType8 = new ReviewActionType("TEXT_SHEET", 7);
                f250265i = reviewActionType8;
                ReviewActionType reviewActionType9 = new ReviewActionType("INFO", 8);
                f250266j = reviewActionType9;
                ReviewActionType[] reviewActionTypeArr = {reviewActionType, reviewActionType2, reviewActionType3, reviewActionType4, reviewActionType5, reviewActionType6, reviewActionType7, reviewActionType8, reviewActionType9};
                f250267k = reviewActionTypeArr;
                f250268l = kotlin.enums.c.a(reviewActionTypeArr);
            }

            public ReviewActionType() {
                throw null;
            }

            public static ReviewActionType valueOf(String str) {
                return (ReviewActionType) Enum.valueOf(ReviewActionType.class, str);
            }

            public static ReviewActionType[] values() {
                return (ReviewActionType[]) f250267k.clone();
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue;", "Landroid/os/Parcelable;", "ReviewActionAnswerLengthValidation", "ReviewActionInfoButton", "ReviewActionInfoButtons", "ReviewActionValueButton", "ReviewActionValueParam", "ReviewActionValueValidation", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ReviewActionValue implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<ReviewActionValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f250269b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f250270c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f250271d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final ReviewActionValueParam f250272e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final List<ReviewAction> f250273f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final ArrayList f250274g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.l
            public final ReviewActionValueButton f250275h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.l
            public final String f250276i;

            /* renamed from: j, reason: collision with root package name */
            @Y61.l
            public final DeepLink f250277j;

            /* renamed from: k, reason: collision with root package name */
            @Y61.l
            public final DeepLink f250278k;

            /* renamed from: l, reason: collision with root package name */
            @Y61.l
            public final ReviewActionAnswerLengthValidation f250279l;

            /* renamed from: m, reason: collision with root package name */
            @Y61.l
            public final ConfirmDialog f250280m;

            /* renamed from: n, reason: collision with root package name */
            @Y61.l
            public final AttributedText f250281n;

            /* renamed from: o, reason: collision with root package name */
            @Y61.l
            public final ReviewActionInfoButtons f250282o;

            /* compiled from: BaseRatingReviewItem.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionAnswerLengthValidation;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ReviewActionAnswerLengthValidation implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionAnswerLengthValidation> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final int f250283b;

                /* renamed from: c, reason: collision with root package name */
                public final int f250284c;

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionAnswerLengthValidation> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionAnswerLengthValidation createFromParcel(Parcel parcel) {
                        return new ReviewActionAnswerLengthValidation(parcel.readInt(), parcel.readInt());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionAnswerLengthValidation[] newArray(int i12) {
                        return new ReviewActionAnswerLengthValidation[i12];
                    }
                }

                public ReviewActionAnswerLengthValidation(int i12, int i13) {
                    this.f250283b = i12;
                    this.f250284c = i13;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionAnswerLengthValidation)) {
                        return false;
                    }
                    ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = (ReviewActionAnswerLengthValidation) obj;
                    return this.f250283b == reviewActionAnswerLengthValidation.f250283b && this.f250284c == reviewActionAnswerLengthValidation.f250284c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f250284c) + (Integer.hashCode(this.f250283b) * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ReviewActionAnswerLengthValidation(min=");
                    sb2.append(this.f250283b);
                    sb2.append(", max=");
                    return androidx.appcompat.app.r.t(sb2, this.f250284c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(this.f250283b);
                    parcel.writeInt(this.f250284c);
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionInfoButton;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ReviewActionInfoButton implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionInfoButton> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f250285b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final DeepLink f250286c;

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionInfoButton> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionInfoButton createFromParcel(Parcel parcel) {
                        return new ReviewActionInfoButton(parcel.readString(), (DeepLink) parcel.readParcelable(ReviewActionInfoButton.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionInfoButton[] newArray(int i12) {
                        return new ReviewActionInfoButton[i12];
                    }
                }

                public ReviewActionInfoButton(@Y61.l String str, @Y61.l DeepLink deepLink) {
                    this.f250285b = str;
                    this.f250286c = deepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionInfoButton)) {
                        return false;
                    }
                    ReviewActionInfoButton reviewActionInfoButton = (ReviewActionInfoButton) obj;
                    return L.f(this.f250285b, reviewActionInfoButton.f250285b) && L.f(this.f250286c, reviewActionInfoButton.f250286c);
                }

                public final int hashCode() {
                    String str = this.f250285b;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    DeepLink deepLink = this.f250286c;
                    return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ReviewActionInfoButton(title=");
                    sb2.append(this.f250285b);
                    sb2.append(", link=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.f250286c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeString(this.f250285b);
                    parcel.writeParcelable(this.f250286c, i12);
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionInfoButtons;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ReviewActionInfoButtons implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionInfoButtons> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final ReviewActionInfoButton f250287b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final ReviewActionInfoButton f250288c;

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionInfoButtons> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionInfoButtons createFromParcel(Parcel parcel) {
                        return new ReviewActionInfoButtons(parcel.readInt() == 0 ? null : ReviewActionInfoButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ReviewActionInfoButton.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionInfoButtons[] newArray(int i12) {
                        return new ReviewActionInfoButtons[i12];
                    }
                }

                public ReviewActionInfoButtons(@Y61.l ReviewActionInfoButton reviewActionInfoButton, @Y61.l ReviewActionInfoButton reviewActionInfoButton2) {
                    this.f250287b = reviewActionInfoButton;
                    this.f250288c = reviewActionInfoButton2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionInfoButtons)) {
                        return false;
                    }
                    ReviewActionInfoButtons reviewActionInfoButtons = (ReviewActionInfoButtons) obj;
                    return L.f(this.f250287b, reviewActionInfoButtons.f250287b) && L.f(this.f250288c, reviewActionInfoButtons.f250288c);
                }

                public final int hashCode() {
                    ReviewActionInfoButton reviewActionInfoButton = this.f250287b;
                    int iHashCode = (reviewActionInfoButton == null ? 0 : reviewActionInfoButton.hashCode()) * 31;
                    ReviewActionInfoButton reviewActionInfoButton2 = this.f250288c;
                    return iHashCode + (reviewActionInfoButton2 != null ? reviewActionInfoButton2.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    return "ReviewActionInfoButtons(primary=" + this.f250287b + ", secondary=" + this.f250288c + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    ReviewActionInfoButton reviewActionInfoButton = this.f250287b;
                    if (reviewActionInfoButton == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        reviewActionInfoButton.writeToParcel(parcel, i12);
                    }
                    ReviewActionInfoButton reviewActionInfoButton2 = this.f250288c;
                    if (reviewActionInfoButton2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        reviewActionInfoButton2.writeToParcel(parcel, i12);
                    }
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionValueButton;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ReviewActionValueButton implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionValueButton> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final ReviewActionValueParam f250289b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final String f250290c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final String f250291d;

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionValueButton> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueButton createFromParcel(Parcel parcel) {
                        return new ReviewActionValueButton(parcel.readInt() == 0 ? null : ReviewActionValueParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueButton[] newArray(int i12) {
                        return new ReviewActionValueButton[i12];
                    }
                }

                public ReviewActionValueButton(@Y61.l ReviewActionValueParam reviewActionValueParam, @Y61.l String str, @Y61.l String str2) {
                    this.f250289b = reviewActionValueParam;
                    this.f250290c = str;
                    this.f250291d = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionValueButton)) {
                        return false;
                    }
                    ReviewActionValueButton reviewActionValueButton = (ReviewActionValueButton) obj;
                    return L.f(this.f250289b, reviewActionValueButton.f250289b) && L.f(this.f250290c, reviewActionValueButton.f250290c) && L.f(this.f250291d, reviewActionValueButton.f250291d);
                }

                public final int hashCode() {
                    ReviewActionValueParam reviewActionValueParam = this.f250289b;
                    int iHashCode = (reviewActionValueParam == null ? 0 : reviewActionValueParam.hashCode()) * 31;
                    String str = this.f250290c;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f250291d;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ReviewActionValueButton(params=");
                    sb2.append(this.f250289b);
                    sb2.append(", title=");
                    sb2.append(this.f250290c);
                    sb2.append(", urlPath=");
                    return C22026a.c(sb2, this.f250291d, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    ReviewActionValueParam reviewActionValueParam = this.f250289b;
                    if (reviewActionValueParam == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        reviewActionValueParam.writeToParcel(parcel, i12);
                    }
                    parcel.writeString(this.f250290c);
                    parcel.writeString(this.f250291d);
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionValueParam;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ReviewActionValueParam implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionValueParam> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Integer f250292b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final Integer f250293c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final Integer f250294d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.l
                public final String f250295e;

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionValueParam> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueParam createFromParcel(Parcel parcel) {
                        return new ReviewActionValueParam(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueParam[] newArray(int i12) {
                        return new ReviewActionValueParam[i12];
                    }
                }

                public ReviewActionValueParam(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str) {
                    this.f250292b = num;
                    this.f250293c = num2;
                    this.f250294d = num3;
                    this.f250295e = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionValueParam)) {
                        return false;
                    }
                    ReviewActionValueParam reviewActionValueParam = (ReviewActionValueParam) obj;
                    return L.f(this.f250292b, reviewActionValueParam.f250292b) && L.f(this.f250293c, reviewActionValueParam.f250293c) && L.f(this.f250294d, reviewActionValueParam.f250294d) && L.f(this.f250295e, reviewActionValueParam.f250295e);
                }

                public final int hashCode() {
                    Integer num = this.f250292b;
                    int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Integer num2 = this.f250293c;
                    int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.f250294d;
                    int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    String str = this.f250295e;
                    return iHashCode3 + (str != null ? str.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ReviewActionValueParam(reviewId=");
                    sb2.append(this.f250292b);
                    sb2.append(", typeId=");
                    sb2.append(this.f250293c);
                    sb2.append(", appealType=");
                    sb2.append(this.f250294d);
                    sb2.append(", text=");
                    return C22026a.c(sb2, this.f250295e, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    Integer num = this.f250292b;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    Integer num2 = this.f250293c;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                    Integer num3 = this.f250294d;
                    if (num3 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                    }
                    parcel.writeString(this.f250295e);
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionValueValidation;", "Landroid/os/Parcelable;", "ReviewActionValueValidationRule", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class ReviewActionValueValidation implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<ReviewActionValueValidation> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Integer f250296b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final String f250297c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final Integer f250298d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.l
                public final ReviewActionValueValidationRule f250299e;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction$ReviewActionValue$ReviewActionValueValidation$ReviewActionValueValidationRule;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class ReviewActionValueValidationRule {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ReviewActionValueValidationRule f250300b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ReviewActionValueValidationRule[] f250301c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final /* synthetic */ kotlin.enums.a f250302d;

                    static {
                        ReviewActionValueValidationRule reviewActionValueValidationRule = new ReviewActionValueValidationRule("LENGTH", 0);
                        f250300b = reviewActionValueValidationRule;
                        ReviewActionValueValidationRule[] reviewActionValueValidationRuleArr = {reviewActionValueValidationRule};
                        f250301c = reviewActionValueValidationRuleArr;
                        f250302d = kotlin.enums.c.a(reviewActionValueValidationRuleArr);
                    }

                    public ReviewActionValueValidationRule() {
                        throw null;
                    }

                    public static ReviewActionValueValidationRule valueOf(String str) {
                        return (ReviewActionValueValidationRule) Enum.valueOf(ReviewActionValueValidationRule.class, str);
                    }

                    public static ReviewActionValueValidationRule[] values() {
                        return (ReviewActionValueValidationRule[]) f250301c.clone();
                    }
                }

                /* compiled from: BaseRatingReviewItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReviewActionValueValidation> {
                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueValidation createFromParcel(Parcel parcel) {
                        return new ReviewActionValueValidation(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ReviewActionValueValidationRule.valueOf(parcel.readString()) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReviewActionValueValidation[] newArray(int i12) {
                        return new ReviewActionValueValidation[i12];
                    }
                }

                public ReviewActionValueValidation(@Y61.l Integer num, @Y61.l String str, @Y61.l Integer num2, @Y61.l ReviewActionValueValidationRule reviewActionValueValidationRule) {
                    this.f250296b = num;
                    this.f250297c = str;
                    this.f250298d = num2;
                    this.f250299e = reviewActionValueValidationRule;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReviewActionValueValidation)) {
                        return false;
                    }
                    ReviewActionValueValidation reviewActionValueValidation = (ReviewActionValueValidation) obj;
                    return L.f(this.f250296b, reviewActionValueValidation.f250296b) && L.f(this.f250297c, reviewActionValueValidation.f250297c) && L.f(this.f250298d, reviewActionValueValidation.f250298d) && this.f250299e == reviewActionValueValidation.f250299e;
                }

                public final int hashCode() {
                    Integer num = this.f250296b;
                    int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                    String str = this.f250297c;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num2 = this.f250298d;
                    int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    ReviewActionValueValidationRule reviewActionValueValidationRule = this.f250299e;
                    return iHashCode3 + (reviewActionValueValidationRule != null ? reviewActionValueValidationRule.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    return "ReviewActionValueValidation(max=" + this.f250296b + ", message=" + this.f250297c + ", min=" + this.f250298d + ", rule=" + this.f250299e + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    Integer num = this.f250296b;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    parcel.writeString(this.f250297c);
                    Integer num2 = this.f250298d;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                    ReviewActionValueValidationRule reviewActionValueValidationRule = this.f250299e;
                    if (reviewActionValueValidationRule == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(reviewActionValueValidationRule.name());
                    }
                }
            }

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewActionValue> {
                @Override // android.os.Parcelable.Creator
                public final ReviewActionValue createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    ReviewActionValueParam reviewActionValueParamCreateFromParcel = parcel.readInt() == 0 ? null : ReviewActionValueParam.CREATOR.createFromParcel(parcel);
                    int iC2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iC3 = 0;
                        while (iC3 != i12) {
                            iC3 = com.avito.android.actions_sheet.a.c(ReviewAction.CREATOR, parcel, arrayList, iC3, 1);
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i13);
                        while (iC2 != i13) {
                            iC2 = com.avito.android.actions_sheet.a.c(ReviewActionValueValidation.CREATOR, parcel, arrayList3, iC2, 1);
                        }
                        arrayList2 = arrayList3;
                    }
                    return new ReviewActionValue(string, string2, string3, reviewActionValueParamCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : ReviewActionValueButton.CREATOR.createFromParcel(parcel), parcel.readString(), (DeepLink) parcel.readParcelable(ReviewActionValue.class.getClassLoader()), (DeepLink) parcel.readParcelable(ReviewActionValue.class.getClassLoader()), parcel.readInt() == 0 ? null : ReviewActionAnswerLengthValidation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConfirmDialog.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ReviewActionValue.class.getClassLoader()), parcel.readInt() != 0 ? ReviewActionInfoButtons.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final ReviewActionValue[] newArray(int i12) {
                    return new ReviewActionValue[i12];
                }
            }

            public ReviewActionValue(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l ReviewActionValueParam reviewActionValueParam, @Y61.l List list, @Y61.l ArrayList arrayList, @Y61.l ReviewActionValueButton reviewActionValueButton, @Y61.l String str4, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.l ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation, @Y61.l ConfirmDialog confirmDialog, @Y61.l AttributedText attributedText, @Y61.l ReviewActionInfoButtons reviewActionInfoButtons) {
                this.f250269b = str;
                this.f250270c = str2;
                this.f250271d = str3;
                this.f250272e = reviewActionValueParam;
                this.f250273f = list;
                this.f250274g = arrayList;
                this.f250275h = reviewActionValueButton;
                this.f250276i = str4;
                this.f250277j = deepLink;
                this.f250278k = deepLink2;
                this.f250279l = reviewActionAnswerLengthValidation;
                this.f250280m = confirmDialog;
                this.f250281n = attributedText;
                this.f250282o = reviewActionInfoButtons;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReviewActionValue)) {
                    return false;
                }
                ReviewActionValue reviewActionValue = (ReviewActionValue) obj;
                return L.f(this.f250269b, reviewActionValue.f250269b) && L.f(this.f250270c, reviewActionValue.f250270c) && L.f(this.f250271d, reviewActionValue.f250271d) && L.f(this.f250272e, reviewActionValue.f250272e) && L.f(this.f250273f, reviewActionValue.f250273f) && L.f(this.f250274g, reviewActionValue.f250274g) && L.f(this.f250275h, reviewActionValue.f250275h) && L.f(this.f250276i, reviewActionValue.f250276i) && L.f(this.f250277j, reviewActionValue.f250277j) && L.f(this.f250278k, reviewActionValue.f250278k) && L.f(this.f250279l, reviewActionValue.f250279l) && L.f(this.f250280m, reviewActionValue.f250280m) && L.f(this.f250281n, reviewActionValue.f250281n) && L.f(this.f250282o, reviewActionValue.f250282o);
            }

            public final int hashCode() {
                int iHashCode = this.f250269b.hashCode() * 31;
                String str = this.f250270c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f250271d;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                ReviewActionValueParam reviewActionValueParam = this.f250272e;
                int iHashCode4 = (iHashCode3 + (reviewActionValueParam == null ? 0 : reviewActionValueParam.hashCode())) * 31;
                List<ReviewAction> list = this.f250273f;
                int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                ArrayList arrayList = this.f250274g;
                int iHashCode6 = (iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
                ReviewActionValueButton reviewActionValueButton = this.f250275h;
                int iHashCode7 = (iHashCode6 + (reviewActionValueButton == null ? 0 : reviewActionValueButton.hashCode())) * 31;
                String str3 = this.f250276i;
                int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                DeepLink deepLink = this.f250277j;
                int iHashCode9 = (iHashCode8 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                DeepLink deepLink2 = this.f250278k;
                int iHashCode10 = (iHashCode9 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
                ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = this.f250279l;
                int iHashCode11 = (iHashCode10 + (reviewActionAnswerLengthValidation == null ? 0 : reviewActionAnswerLengthValidation.hashCode())) * 31;
                ConfirmDialog confirmDialog = this.f250280m;
                int iHashCode12 = (iHashCode11 + (confirmDialog == null ? 0 : confirmDialog.hashCode())) * 31;
                AttributedText attributedText = this.f250281n;
                int iHashCode13 = (iHashCode12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                ReviewActionInfoButtons reviewActionInfoButtons = this.f250282o;
                return iHashCode13 + (reviewActionInfoButtons != null ? reviewActionInfoButtons.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "ReviewActionValue(title=" + this.f250269b + ", placeholder=" + this.f250270c + ", urlPath=" + this.f250271d + ", params=" + this.f250272e + ", actions=" + this.f250273f + ", validations=" + this.f250274g + ", button=" + this.f250275h + ", header=" + this.f250276i + ", analyticsAction=" + this.f250277j + ", link=" + this.f250278k + ", lengthValidation=" + this.f250279l + ", confirmation=" + this.f250280m + ", content=" + this.f250281n + ", infoButtons=" + this.f250282o + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f250269b);
                parcel.writeString(this.f250270c);
                parcel.writeString(this.f250271d);
                ReviewActionValueParam reviewActionValueParam = this.f250272e;
                if (reviewActionValueParam == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    reviewActionValueParam.writeToParcel(parcel, i12);
                }
                List<ReviewAction> list = this.f250273f;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((ReviewAction) itA.next()).writeToParcel(parcel, i12);
                    }
                }
                ArrayList arrayList = this.f250274g;
                if (arrayList == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
                    while (itY.hasNext()) {
                        ((ReviewActionValueValidation) itY.next()).writeToParcel(parcel, i12);
                    }
                }
                ReviewActionValueButton reviewActionValueButton = this.f250275h;
                if (reviewActionValueButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    reviewActionValueButton.writeToParcel(parcel, i12);
                }
                parcel.writeString(this.f250276i);
                parcel.writeParcelable(this.f250277j, i12);
                parcel.writeParcelable(this.f250278k, i12);
                ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = this.f250279l;
                if (reviewActionAnswerLengthValidation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    reviewActionAnswerLengthValidation.writeToParcel(parcel, i12);
                }
                ConfirmDialog confirmDialog = this.f250280m;
                if (confirmDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    confirmDialog.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.f250281n, i12);
                ReviewActionInfoButtons reviewActionInfoButtons = this.f250282o;
                if (reviewActionInfoButtons == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    reviewActionInfoButtons.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewAction> {
            @Override // android.os.Parcelable.Creator
            public final ReviewAction createFromParcel(Parcel parcel) {
                return new ReviewAction(parcel.readInt() == 0 ? null : ReviewActionType.valueOf(parcel.readString()), ReviewActionValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewAction[] newArray(int i12) {
                return new ReviewAction[i12];
            }
        }

        public ReviewAction(@Y61.l ReviewActionType reviewActionType, @Y61.k ReviewActionValue reviewActionValue) {
            this.f250246b = reviewActionType;
            this.f250247c = reviewActionValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewAction)) {
                return false;
            }
            ReviewAction reviewAction = (ReviewAction) obj;
            return this.f250246b == reviewAction.f250246b && L.f(this.f250247c, reviewAction.f250247c);
        }

        public final int hashCode() {
            ReviewActionType reviewActionType = this.f250246b;
            return this.f250247c.hashCode() + ((reviewActionType == null ? 0 : reviewActionType.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ReviewAction(type=" + this.f250246b + ", value=" + this.f250247c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ReviewActionType reviewActionType = this.f250246b;
            if (reviewActionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(reviewActionType.name());
            }
            this.f250247c.writeToParcel(parcel, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseRatingReviewItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewStatus;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final ReviewStatus f250323b;

        /* renamed from: c, reason: collision with root package name */
        public static final ReviewStatus f250324c;

        /* renamed from: d, reason: collision with root package name */
        public static final ReviewStatus f250325d;

        /* renamed from: e, reason: collision with root package name */
        public static final ReviewStatus f250326e;

        /* renamed from: f, reason: collision with root package name */
        public static final ReviewStatus f250327f;

        /* renamed from: g, reason: collision with root package name */
        public static final ReviewStatus f250328g;

        /* renamed from: h, reason: collision with root package name */
        public static final ReviewStatus f250329h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ ReviewStatus[] f250330i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f250331j;

        static {
            ReviewStatus reviewStatus = new ReviewStatus("NONE", 0);
            f250323b = reviewStatus;
            ReviewStatus reviewStatus2 = new ReviewStatus("PUBLISHED", 1);
            f250324c = reviewStatus2;
            ReviewStatus reviewStatus3 = new ReviewStatus("DECLINED", 2);
            f250325d = reviewStatus3;
            ReviewStatus reviewStatus4 = new ReviewStatus("MODERATION", 3);
            f250326e = reviewStatus4;
            ReviewStatus reviewStatus5 = new ReviewStatus("APPROVED", 4);
            f250327f = reviewStatus5;
            ReviewStatus reviewStatus6 = new ReviewStatus("ARBITRAGE_PENDING", 5);
            f250328g = reviewStatus6;
            ReviewStatus reviewStatus7 = new ReviewStatus("ARBITRAGE_DECLINED", 6);
            f250329h = reviewStatus7;
            ReviewStatus[] reviewStatusArr = {reviewStatus, reviewStatus2, reviewStatus3, reviewStatus4, reviewStatus5, reviewStatus6, reviewStatus7};
            f250330i = reviewStatusArr;
            f250331j = kotlin.enums.c.a(reviewStatusArr);
        }

        public ReviewStatus() {
            throw null;
        }

        public static ReviewStatus valueOf(String str) {
            return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
        }

        public static ReviewStatus[] values() {
            return (ReviewStatus[]) f250330i.clone();
        }
    }

    public BaseRatingReviewItem() {
        throw null;
    }

    public BaseRatingReviewItem(Long l12, Image image, String str, String str2, String str3, ReviewStatus reviewStatus, String str4, AttributedText attributedText, Float f12, String str5, String str6, String str7, List list, List list2, ReviewAnswer reviewAnswer, List list3, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, Parcelable parcelable, boolean z12, boolean z13, boolean z14, Map map, int i12, C42822w c42822w) {
        String str8 = (i12 & 16) != 0 ? null : str3;
        Parcelable parcelable2 = (i12 & 262144) != 0 ? null : parcelable;
        boolean z15 = (i12 & 524288) != 0 ? true : z12;
        boolean z16 = (i12 & 1048576) != 0 ? false : z13;
        Map map2 = (i12 & 4194304) == 0 ? map : null;
        this.f250224b = l12;
        this.f250225c = image;
        this.f250226d = str;
        this.f250227e = str2;
        this.f250228f = str8;
        this.f250229g = reviewStatus;
        this.f250230h = str4;
        this.f250231i = attributedText;
        this.f250232j = f12;
        this.f250233k = str5;
        this.f250234l = str6;
        this.f250235m = str7;
        this.f250236n = list;
        this.f250237o = list2;
        this.f250238p = reviewAnswer;
        this.f250239q = list3;
        this.f250240r = ratingItemsMarginHorizontal;
        this.f250241s = parcelable2;
        this.f250242t = z15;
        this.f250243u = z16;
        this.f250244v = z14;
        this.f250245w = map2;
    }

    /* renamed from: A1, reason: from getter */
    public boolean getF250242t() {
        return this.f250242t;
    }

    @Y61.l
    /* renamed from: B0, reason: from getter */
    public ReviewAnswer getF250238p() {
        return this.f250238p;
    }

    @Y61.l
    /* renamed from: L, reason: from getter */
    public AttributedText getF250231i() {
        return this.f250231i;
    }

    @Y61.l
    /* renamed from: P1, reason: from getter */
    public String getF250233k() {
        return this.f250233k;
    }

    @Y61.k
    /* renamed from: Q1, reason: from getter */
    public ReviewStatus getF250229g() {
        return this.f250229g;
    }

    @Y61.l
    /* renamed from: W, reason: from getter */
    public String getF250235m() {
        return this.f250235m;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public RatingItemsMarginHorizontal getF250240r() {
        return this.f250240r;
    }

    @Y61.l
    public Map<String, Object> f() {
        return this.f250245w;
    }

    @Y61.l
    /* renamed from: g0, reason: from getter */
    public String getF250234l() {
        return this.f250234l;
    }

    @Y61.l
    public List<ReviewAction> getActions() {
        return this.f250239q;
    }

    @Y61.l
    /* renamed from: getAvatar, reason: from getter */
    public Image getF250225c() {
        return this.f250225c;
    }

    @Override // TV0.a
    public long getId() {
        return getF231743e().hashCode();
    }

    @Y61.l
    public List<TnsGalleryImage> getImages() {
        return this.f250236n;
    }

    @Y61.l
    /* renamed from: getName, reason: from getter */
    public String getF250226d() {
        return this.f250226d;
    }

    @Y61.l
    /* renamed from: getRated, reason: from getter */
    public String getF250227e() {
        return this.f250227e;
    }

    @Y61.l
    /* renamed from: getReviewId, reason: from getter */
    public Long getF250224b() {
        return this.f250224b;
    }

    @Y61.l
    /* renamed from: getScore, reason: from getter */
    public Float getF250232j() {
        return this.f250232j;
    }

    @Y61.l
    /* renamed from: getStatusText, reason: from getter */
    public String getF250230h() {
        return this.f250230h;
    }

    @Y61.l
    public List<ReviewTextSection> getTextSections() {
        return this.f250237o;
    }

    /* renamed from: q1, reason: from getter */
    public boolean getF250243u() {
        return this.f250243u;
    }

    @Y61.l
    /* renamed from: w1, reason: from getter */
    public String getF250228f() {
        return this.f250228f;
    }

    /* renamed from: y, reason: from getter */
    public boolean getF250244v() {
        return this.f250244v;
    }

    /* compiled from: BaseRatingReviewItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewTextSection;", "Landroid/os/Parcelable;", "BorderRadius", "Highlight", "HighlightedText", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ReviewTextSection implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ReviewTextSection> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f250332b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f250333c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<HighlightedText> f250334d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f250335e;

        /* compiled from: BaseRatingReviewItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewTextSection$BorderRadius;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BorderRadius implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<BorderRadius> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f250336b;

            /* renamed from: c, reason: collision with root package name */
            public final int f250337c;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BorderRadius> {
                @Override // android.os.Parcelable.Creator
                public final BorderRadius createFromParcel(Parcel parcel) {
                    return new BorderRadius(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final BorderRadius[] newArray(int i12) {
                    return new BorderRadius[i12];
                }
            }

            public BorderRadius(int i12, int i13) {
                this.f250336b = i12;
                this.f250337c = i13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BorderRadius)) {
                    return false;
                }
                BorderRadius borderRadius = (BorderRadius) obj;
                return this.f250336b == borderRadius.f250336b && this.f250337c == borderRadius.f250337c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f250337c) + (Integer.hashCode(this.f250336b) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BorderRadius(left=");
                sb2.append(this.f250336b);
                sb2.append(", right=");
                return androidx.appcompat.app.r.t(sb2, this.f250337c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.f250336b);
                parcel.writeInt(this.f250337c);
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewTextSection$Highlight;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Highlight implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<Highlight> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final UniversalColor f250338b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final BorderRadius f250339c;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Highlight> {
                @Override // android.os.Parcelable.Creator
                public final Highlight createFromParcel(Parcel parcel) {
                    return new Highlight((UniversalColor) parcel.readParcelable(Highlight.class.getClassLoader()), BorderRadius.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Highlight[] newArray(int i12) {
                    return new Highlight[i12];
                }
            }

            public Highlight(@Y61.k UniversalColor universalColor, @Y61.k BorderRadius borderRadius) {
                this.f250338b = universalColor;
                this.f250339c = borderRadius;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) obj;
                return L.f(this.f250338b, highlight.f250338b) && L.f(this.f250339c, highlight.f250339c);
            }

            public final int hashCode() {
                return this.f250339c.hashCode() + (this.f250338b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Highlight(background=" + this.f250338b + ", borderRadius=" + this.f250339c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f250338b, i12);
                this.f250339c.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewTextSection$HighlightedText;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HighlightedText implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<HighlightedText> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f250340b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Highlight f250341c;

            /* compiled from: BaseRatingReviewItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<HighlightedText> {
                @Override // android.os.Parcelable.Creator
                public final HighlightedText createFromParcel(Parcel parcel) {
                    return new HighlightedText(parcel.readString(), parcel.readInt() == 0 ? null : Highlight.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final HighlightedText[] newArray(int i12) {
                    return new HighlightedText[i12];
                }
            }

            public HighlightedText(@Y61.k String str, @Y61.l Highlight highlight) {
                this.f250340b = str;
                this.f250341c = highlight;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HighlightedText)) {
                    return false;
                }
                HighlightedText highlightedText = (HighlightedText) obj;
                return L.f(this.f250340b, highlightedText.f250340b) && L.f(this.f250341c, highlightedText.f250341c);
            }

            public final int hashCode() {
                int iHashCode = this.f250340b.hashCode() * 31;
                Highlight highlight = this.f250341c;
                return iHashCode + (highlight == null ? 0 : highlight.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "HighlightedText(text=" + this.f250340b + ", highlight=" + this.f250341c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f250340b);
                Highlight highlight = this.f250341c;
                if (highlight == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    highlight.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewTextSection> {
            @Override // android.os.Parcelable.Creator
            public final ReviewTextSection createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(HighlightedText.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ReviewTextSection(string, string2, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewTextSection[] newArray(int i12) {
                return new ReviewTextSection[i12];
            }
        }

        public ReviewTextSection(@Y61.l String str, @Y61.l String str2, @Y61.l List<HighlightedText> list, boolean z12) {
            this.f250332b = str;
            this.f250333c = str2;
            this.f250334d = list;
            this.f250335e = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewTextSection)) {
                return false;
            }
            ReviewTextSection reviewTextSection = (ReviewTextSection) obj;
            return L.f(this.f250332b, reviewTextSection.f250332b) && L.f(this.f250333c, reviewTextSection.f250333c) && L.f(this.f250334d, reviewTextSection.f250334d) && this.f250335e == reviewTextSection.f250335e;
        }

        public final int hashCode() {
            String str = this.f250332b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f250333c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<HighlightedText> list = this.f250334d;
            return Boolean.hashCode(this.f250335e) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewTextSection(title=");
            sb2.append(this.f250332b);
            sb2.append(", text=");
            sb2.append(this.f250333c);
            sb2.append(", highlightedText=");
            sb2.append(this.f250334d);
            sb2.append(", textExpanded=");
            return androidx.appcompat.app.r.x(sb2, this.f250335e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f250332b);
            parcel.writeString(this.f250333c);
            List<HighlightedText> list = this.f250334d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((HighlightedText) itA.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeInt(this.f250335e ? 1 : 0);
        }

        public /* synthetic */ ReviewTextSection(String str, String str2, List list, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? false : z12);
        }
    }

    /* compiled from: BaseRatingReviewItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAnswer;", "Landroid/os/Parcelable;", "ReviewAnswerStatus", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ReviewAnswer implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ReviewAnswer> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f250303b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f250304c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f250305d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f250306e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f250307f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final ReviewAnswerStatus f250308g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f250309h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f250310i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final String f250311j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final List<TnsGalleryImage> f250312k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f250313l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final DeepLink f250314m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final List<ReviewAction> f250315n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f250316o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public Parcelable f250317p;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAnswer$ReviewAnswerStatus;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ReviewAnswerStatus {

            /* renamed from: b, reason: collision with root package name */
            public static final ReviewAnswerStatus f250318b;

            /* renamed from: c, reason: collision with root package name */
            public static final ReviewAnswerStatus f250319c;

            /* renamed from: d, reason: collision with root package name */
            public static final ReviewAnswerStatus f250320d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ReviewAnswerStatus[] f250321e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f250322f;

            static {
                ReviewAnswerStatus reviewAnswerStatus = new ReviewAnswerStatus("MODERATION", 0);
                f250318b = reviewAnswerStatus;
                ReviewAnswerStatus reviewAnswerStatus2 = new ReviewAnswerStatus("ACTIVE", 1);
                f250319c = reviewAnswerStatus2;
                ReviewAnswerStatus reviewAnswerStatus3 = new ReviewAnswerStatus("DECLINED", 2);
                f250320d = reviewAnswerStatus3;
                ReviewAnswerStatus[] reviewAnswerStatusArr = {reviewAnswerStatus, reviewAnswerStatus2, reviewAnswerStatus3};
                f250321e = reviewAnswerStatusArr;
                f250322f = kotlin.enums.c.a(reviewAnswerStatusArr);
            }

            public ReviewAnswerStatus() {
                throw null;
            }

            public static ReviewAnswerStatus valueOf(String str) {
                return (ReviewAnswerStatus) Enum.valueOf(ReviewAnswerStatus.class, str);
            }

            public static ReviewAnswerStatus[] values() {
                return (ReviewAnswerStatus[]) f250321e.clone();
            }
        }

        /* compiled from: BaseRatingReviewItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewAnswer> {
            @Override // android.os.Parcelable.Creator
            public final ReviewAnswer createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                DeepLink deepLink;
                boolean z12;
                ArrayList arrayList2;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Image image = (Image) parcel.readParcelable(ReviewAnswer.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ReviewAnswerStatus reviewAnswerStatusValueOf = parcel.readInt() == 0 ? null : ReviewAnswerStatus.valueOf(parcel.readString());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ReviewAnswer.class, parcel, arrayList, iL2, 1);
                    }
                }
                boolean z13 = parcel.readInt() != 0;
                DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ReviewAnswer.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z12 = z13;
                    deepLink = deepLink2;
                    arrayList2 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    deepLink = deepLink2;
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(ReviewAction.CREATOR, parcel, arrayList3, iC2, 1);
                        i13 = i13;
                        z13 = z13;
                    }
                    z12 = z13;
                    arrayList2 = arrayList3;
                }
                return new ReviewAnswer(lValueOf, image, string, string2, string3, reviewAnswerStatusValueOf, string4, string5, string6, arrayList, z12, deepLink, arrayList2, parcel.readInt() != 0, parcel.readParcelable(ReviewAnswer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewAnswer[] newArray(int i12) {
                return new ReviewAnswer[i12];
            }
        }

        public ReviewAnswer(@Y61.l Long l12, @Y61.l Image image, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l ReviewAnswerStatus reviewAnswerStatus, @Y61.l String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l List<TnsGalleryImage> list, boolean z12, @Y61.l DeepLink deepLink, @Y61.l List<ReviewAction> list2, boolean z13, @Y61.l Parcelable parcelable) {
            this.f250303b = l12;
            this.f250304c = image;
            this.f250305d = str;
            this.f250306e = str2;
            this.f250307f = str3;
            this.f250308g = reviewAnswerStatus;
            this.f250309h = str4;
            this.f250310i = str5;
            this.f250311j = str6;
            this.f250312k = list;
            this.f250313l = z12;
            this.f250314m = deepLink;
            this.f250315n = list2;
            this.f250316o = z13;
            this.f250317p = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewAnswer)) {
                return false;
            }
            ReviewAnswer reviewAnswer = (ReviewAnswer) obj;
            return L.f(this.f250303b, reviewAnswer.f250303b) && L.f(this.f250304c, reviewAnswer.f250304c) && L.f(this.f250305d, reviewAnswer.f250305d) && L.f(this.f250306e, reviewAnswer.f250306e) && L.f(this.f250307f, reviewAnswer.f250307f) && this.f250308g == reviewAnswer.f250308g && L.f(this.f250309h, reviewAnswer.f250309h) && L.f(this.f250310i, reviewAnswer.f250310i) && L.f(this.f250311j, reviewAnswer.f250311j) && L.f(this.f250312k, reviewAnswer.f250312k) && this.f250313l == reviewAnswer.f250313l && L.f(this.f250314m, reviewAnswer.f250314m) && L.f(this.f250315n, reviewAnswer.f250315n) && this.f250316o == reviewAnswer.f250316o && L.f(this.f250317p, reviewAnswer.f250317p);
        }

        public final int hashCode() {
            Long l12 = this.f250303b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Image image = this.f250304c;
            int iD2 = H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f250305d);
            String str = this.f250306e;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f250307f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ReviewAnswerStatus reviewAnswerStatus = this.f250308g;
            int iHashCode4 = (iHashCode3 + (reviewAnswerStatus == null ? 0 : reviewAnswerStatus.hashCode())) * 31;
            String str3 = this.f250309h;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f250310i;
            int iD3 = H.d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f250311j);
            List<TnsGalleryImage> list = this.f250312k;
            int i12 = androidx.appcompat.app.r.i((iD3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f250313l);
            DeepLink deepLink = this.f250314m;
            int iHashCode6 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            List<ReviewAction> list2 = this.f250315n;
            int i13 = androidx.appcompat.app.r.i((iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f250316o);
            Parcelable parcelable = this.f250317p;
            return i13 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewAnswer(answerId=");
            sb2.append(this.f250303b);
            sb2.append(", avatar=");
            sb2.append(this.f250304c);
            sb2.append(", name=");
            sb2.append(this.f250305d);
            sb2.append(", rated=");
            sb2.append(this.f250306e);
            sb2.append(", caption=");
            sb2.append(this.f250307f);
            sb2.append(", status=");
            sb2.append(this.f250308g);
            sb2.append(", statusText=");
            sb2.append(this.f250309h);
            sb2.append(", rejectMessage=");
            sb2.append(this.f250310i);
            sb2.append(", text=");
            sb2.append(this.f250311j);
            sb2.append(", images=");
            sb2.append(this.f250312k);
            sb2.append(", isShop=");
            sb2.append(this.f250313l);
            sb2.append(", link=");
            sb2.append(this.f250314m);
            sb2.append(", actions=");
            sb2.append(this.f250315n);
            sb2.append(", textExpanded=");
            sb2.append(this.f250316o);
            sb2.append(", imagesGalleryState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f250317p, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.f250303b;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.f250304c, i12);
            parcel.writeString(this.f250305d);
            parcel.writeString(this.f250306e);
            parcel.writeString(this.f250307f);
            ReviewAnswerStatus reviewAnswerStatus = this.f250308g;
            if (reviewAnswerStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(reviewAnswerStatus.name());
            }
            parcel.writeString(this.f250309h);
            parcel.writeString(this.f250310i);
            parcel.writeString(this.f250311j);
            List<TnsGalleryImage> list = this.f250312k;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            parcel.writeInt(this.f250313l ? 1 : 0);
            parcel.writeParcelable(this.f250314m, i12);
            List<ReviewAction> list2 = this.f250315n;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((ReviewAction) itA2.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeInt(this.f250316o ? 1 : 0);
            parcel.writeParcelable(this.f250317p, i12);
        }

        public /* synthetic */ ReviewAnswer(Long l12, Image image, String str, String str2, String str3, ReviewAnswerStatus reviewAnswerStatus, String str4, String str5, String str6, List list, boolean z12, DeepLink deepLink, List list2, boolean z13, Parcelable parcelable, int i12, C42822w c42822w) {
            this(l12, image, str, str2, str3, reviewAnswerStatus, str4, str5, str6, list, z12, deepLink, list2, (i12 & 8192) != 0 ? false : z13, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : parcelable);
        }
    }
}
