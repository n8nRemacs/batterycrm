package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DetailsSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/Footer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Footer implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Footer> CREATOR = new a();

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final AttributedText text;

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Footer> {
        @Override // android.os.Parcelable.Creator
        public final Footer createFromParcel(Parcel parcel) {
            return new Footer((AttributedText) parcel.readParcelable(Footer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Footer[] newArray(int i12) {
            return new Footer[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Footer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Footer) && kotlin.jvm.internal.L.f(this.text, ((Footer) obj).text);
    }

    public final int hashCode() {
        AttributedText attributedText = this.text;
        if (attributedText == null) {
            return 0;
        }
        return attributedText.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("Footer(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
    }

    public Footer(@Y61.l AttributedText attributedText) {
        this.text = attributedText;
    }

    public /* synthetic */ Footer(AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText);
    }
}
