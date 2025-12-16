package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyImvBody.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/RealtyImvBody;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "descriptionExpandLink", SearchParamsConverterKt.EXPANDED, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescriptionExpandLink", "getExpanded", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyImvBody implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyImvBody> CREATOR = new Creator();

    @c("description")
    @k
    private final AttributedText description;

    @c("descriptionExpandLink")
    @k
    private final AttributedText descriptionExpandLink;

    @c(SearchParamsConverterKt.EXPANDED)
    @k
    private final AttributedText expanded;

    @c("title")
    @k
    private final String title;

    /* compiled from: RealtyImvBody.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyImvBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvBody createFromParcel(@k Parcel parcel) {
            return new RealtyImvBody(parcel.readString(), (AttributedText) parcel.readParcelable(RealtyImvBody.class.getClassLoader()), (AttributedText) parcel.readParcelable(RealtyImvBody.class.getClassLoader()), (AttributedText) parcel.readParcelable(RealtyImvBody.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvBody[] newArray(int i12) {
            return new RealtyImvBody[i12];
        }
    }

    public RealtyImvBody(@k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @k AttributedText attributedText3) {
        this.title = str;
        this.description = attributedText;
        this.descriptionExpandLink = attributedText2;
        this.expanded = attributedText3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final AttributedText getDescriptionExpandLink() {
        return this.descriptionExpandLink;
    }

    @k
    public final AttributedText getExpanded() {
        return this.expanded;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, flags);
        parcel.writeParcelable(this.descriptionExpandLink, flags);
        parcel.writeParcelable(this.expanded, flags);
    }
}
