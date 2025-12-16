package com.avito.android.autoteka.presentation.previewsearch.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewSearchAction.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "Landroid/os/Parcelable;", "ClickToPurchase", "HideKeyboard", "NavigateToExample", "OpenPhotoGallery", "RestorePreviousState", "RetrySearchPreview", "SearchPreview", "ShowInstructionDialog", "ShowKeyboardIfNeed", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ClickToPurchase;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$HideKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$NavigateToExample;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$OpenPhotoGallery;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$RestorePreviousState;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$RetrySearchPreview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$SearchPreview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ShowInstructionDialog;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ShowKeyboardIfNeed;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaPreviewSearchAction extends Parcelable {

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ClickToPurchase;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickToPurchase implements AutotekaPreviewSearchAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClickToPurchase f97609b = new ClickToPurchase();

        @k
        public static final Parcelable.Creator<ClickToPurchase> CREATOR = new a();

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClickToPurchase> {
            @Override // android.os.Parcelable.Creator
            public final ClickToPurchase createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ClickToPurchase.f97609b;
            }

            @Override // android.os.Parcelable.Creator
            public final ClickToPurchase[] newArray(int i12) {
                return new ClickToPurchase[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClickToPurchase);
        }

        public final int hashCode() {
            return 294450350;
        }

        @k
        public final String toString() {
            return "ClickToPurchase";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$HideKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements AutotekaPreviewSearchAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f97610b = new HideKeyboard();

        @k
        public static final Parcelable.Creator<HideKeyboard> CREATOR = new a();

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HideKeyboard> {
            @Override // android.os.Parcelable.Creator
            public final HideKeyboard createFromParcel(Parcel parcel) {
                parcel.readInt();
                return HideKeyboard.f97610b;
            }

            @Override // android.os.Parcelable.Creator
            public final HideKeyboard[] newArray(int i12) {
                return new HideKeyboard[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 38628127;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$NavigateToExample;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToExample implements AutotekaPreviewSearchAction {

        @k
        public static final Parcelable.Creator<NavigateToExample> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f97611b;

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NavigateToExample> {
            @Override // android.os.Parcelable.Creator
            public final NavigateToExample createFromParcel(Parcel parcel) {
                return new NavigateToExample((Uri) parcel.readParcelable(NavigateToExample.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NavigateToExample[] newArray(int i12) {
                return new NavigateToExample[i12];
            }
        }

        public NavigateToExample(@k Uri uri) {
            this.f97611b = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToExample) && L.f(this.f97611b, ((NavigateToExample) obj).f97611b);
        }

        public final int hashCode() {
            return this.f97611b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("NavigateToExample(uri="), this.f97611b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f97611b, i12);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$OpenPhotoGallery;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhotoGallery implements AutotekaPreviewSearchAction {

        @k
        public static final Parcelable.Creator<OpenPhotoGallery> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Image f97612b;

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenPhotoGallery> {
            @Override // android.os.Parcelable.Creator
            public final OpenPhotoGallery createFromParcel(Parcel parcel) {
                return new OpenPhotoGallery((Image) parcel.readParcelable(OpenPhotoGallery.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenPhotoGallery[] newArray(int i12) {
                return new OpenPhotoGallery[i12];
            }
        }

        public OpenPhotoGallery(@k Image image) {
            this.f97612b = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPhotoGallery) && L.f(this.f97612b, ((OpenPhotoGallery) obj).f97612b);
        }

        public final int hashCode() {
            return this.f97612b.hashCode();
        }

        @k
        public final String toString() {
            return c.o(new StringBuilder("OpenPhotoGallery(image="), this.f97612b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f97612b, i12);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$RestorePreviousState;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RestorePreviousState implements AutotekaPreviewSearchAction {

        @k
        public static final Parcelable.Creator<RestorePreviousState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f97613b;

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestorePreviousState> {
            @Override // android.os.Parcelable.Creator
            public final RestorePreviousState createFromParcel(Parcel parcel) {
                return new RestorePreviousState(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RestorePreviousState[] newArray(int i12) {
                return new RestorePreviousState[i12];
            }
        }

        public RestorePreviousState(@l String str) {
            this.f97613b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestorePreviousState) && L.f(this.f97613b, ((RestorePreviousState) obj).f97613b);
        }

        public final int hashCode() {
            String str = this.f97613b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RestorePreviousState(searchKey="), this.f97613b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f97613b);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$RetrySearchPreview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RetrySearchPreview implements AutotekaPreviewSearchAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RetrySearchPreview f97614b = new RetrySearchPreview();

        @k
        public static final Parcelable.Creator<RetrySearchPreview> CREATOR = new a();

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RetrySearchPreview> {
            @Override // android.os.Parcelable.Creator
            public final RetrySearchPreview createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RetrySearchPreview.f97614b;
            }

            @Override // android.os.Parcelable.Creator
            public final RetrySearchPreview[] newArray(int i12) {
                return new RetrySearchPreview[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RetrySearchPreview);
        }

        public final int hashCode() {
            return 1246357134;
        }

        @k
        public final String toString() {
            return "RetrySearchPreview";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$SearchPreview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchPreview implements AutotekaPreviewSearchAction {

        @k
        public static final Parcelable.Creator<SearchPreview> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97615b;

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchPreview> {
            @Override // android.os.Parcelable.Creator
            public final SearchPreview createFromParcel(Parcel parcel) {
                return new SearchPreview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SearchPreview[] newArray(int i12) {
                return new SearchPreview[i12];
            }
        }

        public SearchPreview(@k String str) {
            this.f97615b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchPreview) && L.f(this.f97615b, ((SearchPreview) obj).f97615b);
        }

        public final int hashCode() {
            return this.f97615b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchPreview(searchKey="), this.f97615b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f97615b);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ShowInstructionDialog;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInstructionDialog implements AutotekaPreviewSearchAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowInstructionDialog f97616b = new ShowInstructionDialog();

        @k
        public static final Parcelable.Creator<ShowInstructionDialog> CREATOR = new a();

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructionDialog> {
            @Override // android.os.Parcelable.Creator
            public final ShowInstructionDialog createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShowInstructionDialog.f97616b;
            }

            @Override // android.os.Parcelable.Creator
            public final ShowInstructionDialog[] newArray(int i12) {
                return new ShowInstructionDialog[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowInstructionDialog);
        }

        public final int hashCode() {
            return -360699165;
        }

        @k
        public final String toString() {
            return "ShowInstructionDialog";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutotekaPreviewSearchAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction$ShowKeyboardIfNeed;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowKeyboardIfNeed implements AutotekaPreviewSearchAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowKeyboardIfNeed f97617b = new ShowKeyboardIfNeed();

        @k
        public static final Parcelable.Creator<ShowKeyboardIfNeed> CREATOR = new a();

        /* compiled from: AutotekaPreviewSearchAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowKeyboardIfNeed> {
            @Override // android.os.Parcelable.Creator
            public final ShowKeyboardIfNeed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShowKeyboardIfNeed.f97617b;
            }

            @Override // android.os.Parcelable.Creator
            public final ShowKeyboardIfNeed[] newArray(int i12) {
                return new ShowKeyboardIfNeed[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowKeyboardIfNeed);
        }

        public final int hashCode() {
            return -1647095347;
        }

        @k
        public final String toString() {
            return "ShowKeyboardIfNeed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
