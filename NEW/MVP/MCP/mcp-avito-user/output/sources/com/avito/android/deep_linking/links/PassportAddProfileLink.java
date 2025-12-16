package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAddProfileLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PassportAddProfileLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportAddProfileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133526b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportAddProfileLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportAddProfileLink createFromParcel(Parcel parcel) {
            return new PassportAddProfileLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PassportAddProfileLink[] newArray(int i12) {
            return new PassportAddProfileLink[i12];
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b;", "LJu/c$b;", "a", "b", "c", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$a;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$b;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$a;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133527b = new a();
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$b;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.PassportAddProfileLink$b$b, reason: collision with other inner class name */
        public static final class C4010b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4010b f133528b = new C4010b();
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b$c;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final PrintableText f133529b;

            public c(@Y61.l PrintableText printableText) {
                this.f133529b = printableText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f133529b, ((c) obj).f133529b);
            }

            public final int hashCode() {
                PrintableText printableText = this.f133529b;
                if (printableText == null) {
                    return 0;
                }
                return printableText.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.m(new StringBuilder("MergeSuccess(mergeSuccessText="), this.f133529b, ')');
            }
        }
    }

    public PassportAddProfileLink() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassportAddProfileLink) && this.f133526b == ((PassportAddProfileLink) obj).f133526b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133526b);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("PassportAddProfileLink(showOnboarding="), this.f133526b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133526b ? 1 : 0);
    }

    public /* synthetic */ PassportAddProfileLink(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public PassportAddProfileLink(boolean z12) {
        this.f133526b = z12;
    }
}
