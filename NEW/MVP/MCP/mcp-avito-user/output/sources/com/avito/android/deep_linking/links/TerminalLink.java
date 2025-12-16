package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TerminalLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/TerminalLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class TerminalLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TerminalLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133710b;

    /* compiled from: TerminalLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TerminalLink> {
        @Override // android.os.Parcelable.Creator
        public final TerminalLink createFromParcel(Parcel parcel) {
            return new TerminalLink((DeepLink) parcel.readParcelable(TerminalLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TerminalLink[] newArray(int i12) {
            return new TerminalLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TerminalLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133710b, i12);
    }

    public /* synthetic */ TerminalLink(DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink);
    }

    public TerminalLink(@Y61.l DeepLink deepLink) {
        this.f133710b = deepLink;
    }
}
