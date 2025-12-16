package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AutoSelectConfirmationLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AutoSelectConfirmationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectConfirmationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AutoSelectContactConfirmation f133032b;

    /* compiled from: AutoSelectConfirmationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectConfirmationLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationLink createFromParcel(Parcel parcel) {
            return new AutoSelectConfirmationLink(AutoSelectContactConfirmation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationLink[] newArray(int i12) {
            return new AutoSelectConfirmationLink[i12];
        }
    }

    /* compiled from: AutoSelectConfirmationLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AutoSelectConfirmationLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink$b$a;", "Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133033b = new a();

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

    public AutoSelectConfirmationLink(@Y61.k AutoSelectContactConfirmation autoSelectContactConfirmation) {
        this.f133032b = autoSelectContactConfirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoSelectConfirmationLink) && kotlin.jvm.internal.L.f(this.f133032b, ((AutoSelectConfirmationLink) obj).f133032b);
    }

    public final int hashCode() {
        return this.f133032b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AutoSelectConfirmationLink(content=" + this.f133032b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133032b.writeToParcel(parcel, i12);
    }
}
