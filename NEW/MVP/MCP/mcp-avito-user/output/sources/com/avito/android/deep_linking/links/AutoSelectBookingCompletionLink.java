package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.models.AutoSelectConfirmationDialogContentDto;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AutoSelectBookingCompletionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AutoSelectBookingCompletionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectBookingCompletionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AutoSelectConfirmationDialogContentDto f133030c;

    /* compiled from: AutoSelectBookingCompletionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectBookingCompletionLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectBookingCompletionLink createFromParcel(Parcel parcel) {
            return new AutoSelectBookingCompletionLink(parcel.readString(), AutoSelectConfirmationDialogContentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectBookingCompletionLink[] newArray(int i12) {
            return new AutoSelectBookingCompletionLink[i12];
        }
    }

    /* compiled from: AutoSelectBookingCompletionLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AutoSelectBookingCompletionLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink$b$a;", "Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133031b = new a();

            public a() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AutoSelectBookingCompletionLink(@Y61.k String str, @Y61.k AutoSelectConfirmationDialogContentDto autoSelectConfirmationDialogContentDto) {
        this.f133029b = str;
        this.f133030c = autoSelectConfirmationDialogContentDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectBookingCompletionLink)) {
            return false;
        }
        AutoSelectBookingCompletionLink autoSelectBookingCompletionLink = (AutoSelectBookingCompletionLink) obj;
        return kotlin.jvm.internal.L.f(this.f133029b, autoSelectBookingCompletionLink.f133029b) && kotlin.jvm.internal.L.f(this.f133030c, autoSelectBookingCompletionLink.f133030c);
    }

    public final int hashCode() {
        return this.f133030c.hashCode() + (this.f133029b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "AutoSelectBookingCompletionLink(itemId=" + this.f133029b + ", content=" + this.f133030c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133029b);
        this.f133030c.writeToParcel(parcel, i12);
    }
}
