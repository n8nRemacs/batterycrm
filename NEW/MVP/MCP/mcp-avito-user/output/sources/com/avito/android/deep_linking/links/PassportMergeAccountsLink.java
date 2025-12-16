package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PassportMergeAccountsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportMergeAccountsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133538b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportMergeAccountsLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsLink createFromParcel(Parcel parcel) {
            return new PassportMergeAccountsLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsLink[] newArray(int i12) {
            return new PassportMergeAccountsLink[i12];
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b$a;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b$a;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f133539b;

            public a() {
                this(false, 1, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f133539b == ((a) obj).f133539b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f133539b);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("Cancelled(closedByCross="), this.f133539b, ')');
            }

            public a(boolean z12) {
                this.f133539b = z12;
            }

            public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? false : z12);
            }
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b$b;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.PassportMergeAccountsLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4011b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final PrintableText f133540b;

            public C4011b(@Y61.l PrintableText printableText) {
                this.f133540b = printableText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4011b) && kotlin.jvm.internal.L.f(this.f133540b, ((C4011b) obj).f133540b);
            }

            public final int hashCode() {
                PrintableText printableText = this.f133540b;
                if (printableText == null) {
                    return 0;
                }
                return printableText.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.m(new StringBuilder("Success(mergeSuccessText="), this.f133540b, ')');
            }
        }
    }

    public PassportMergeAccountsLink() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133538b ? 1 : 0);
    }

    public PassportMergeAccountsLink(boolean z12) {
        this.f133538b = z12;
    }

    public /* synthetic */ PassportMergeAccountsLink(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
