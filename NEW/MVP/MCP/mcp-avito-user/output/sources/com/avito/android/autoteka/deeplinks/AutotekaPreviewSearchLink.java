package com.avito.android.autoteka.deeplinks;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AutotekaPreviewSearchLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AutotekaPreviewSearchLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutotekaPreviewSearchLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AutotekaPreviewSearchDetails f96230b;

    /* compiled from: AutotekaPreviewSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaPreviewSearchLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaPreviewSearchLink createFromParcel(Parcel parcel) {
            return new AutotekaPreviewSearchLink(AutotekaPreviewSearchDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaPreviewSearchLink[] newArray(int i12) {
            return new AutotekaPreviewSearchLink[i12];
        }
    }

    /* compiled from: AutotekaPreviewSearchLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b$a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b$b;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: AutotekaPreviewSearchLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b$a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b;", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f96231b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1768266209;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: AutotekaPreviewSearchLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b$b;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink$b;", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2846b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C2846b f96232b = new C2846b();

            public C2846b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C2846b);
            }

            public final int hashCode() {
                return 987670618;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AutotekaPreviewSearchLink(@k AutotekaPreviewSearchDetails autotekaPreviewSearchDetails) {
        this.f96230b = autotekaPreviewSearchDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96230b.writeToParcel(parcel, i12);
    }
}
