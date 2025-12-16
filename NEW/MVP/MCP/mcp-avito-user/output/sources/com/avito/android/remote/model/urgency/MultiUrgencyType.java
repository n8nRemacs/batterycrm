package com.avito.android.remote.model.urgency;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MultiUrgencyBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/urgency/MultiUrgencyType;", "Landroid/os/Parcelable;", "", "urgencyId", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "<init>", "(JLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getUrgencyId", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultiUrgencyType implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiUrgencyType> CREATOR = new Creator();

    @c("subtitle")
    @k
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    @c("id")
    private final long urgencyId;

    /* compiled from: MultiUrgencyBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiUrgencyType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyType createFromParcel(@k Parcel parcel) {
            return new MultiUrgencyType(parcel.readLong(), (AttributedText) parcel.readParcelable(MultiUrgencyType.class.getClassLoader()), (AttributedText) parcel.readParcelable(MultiUrgencyType.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyType[] newArray(int i12) {
            return new MultiUrgencyType[i12];
        }
    }

    public MultiUrgencyType(long j12, @k AttributedText attributedText, @k AttributedText attributedText2) {
        this.urgencyId = j12;
        this.title = attributedText;
        this.subtitle = attributedText2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public final long getUrgencyId() {
        return this.urgencyId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.urgencyId);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
    }
}
