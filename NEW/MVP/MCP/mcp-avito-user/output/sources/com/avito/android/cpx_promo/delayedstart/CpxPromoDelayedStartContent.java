package com.avito.android.cpx_promo.delayedstart;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CpxPromoDelayedStartContent.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/CpxPromoDelayedStartContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoButton;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoButton;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoButton;", "c", "()Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoButton;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoDelayedStartContent implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxPromoDelayedStartContent> CREATOR = new a();

    @com.google.gson.annotations.c("button")
    @k
    private final CpxPromoButton button;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    /* compiled from: CpxPromoDelayedStartContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoDelayedStartContent> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartContent createFromParcel(Parcel parcel) {
            return new CpxPromoDelayedStartContent((AttributedText) parcel.readParcelable(CpxPromoDelayedStartContent.class.getClassLoader()), (AttributedText) parcel.readParcelable(CpxPromoDelayedStartContent.class.getClassLoader()), CpxPromoButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartContent[] newArray(int i12) {
            return new CpxPromoDelayedStartContent[i12];
        }
    }

    public CpxPromoDelayedStartContent(@k AttributedText attributedText, @k AttributedText attributedText2, @k CpxPromoButton cpxPromoButton) {
        this.title = attributedText;
        this.description = attributedText2;
        this.button = cpxPromoButton;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final CpxPromoButton getButton() {
        return this.button;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        this.button.writeToParcel(parcel, i12);
    }
}
