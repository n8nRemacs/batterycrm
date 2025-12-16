package com.avito.android.confirm_documents_bottom_sheet;

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

/* compiled from: ConfirmDocumentsBottomSheetDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ConfirmDocumentsBottomSheetDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ConfirmDocumentsBottomSheetDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f125503b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f125504c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f125505d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f125506e;

    /* compiled from: ConfirmDocumentsBottomSheetDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmDocumentsBottomSheetDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmDocumentsBottomSheetDeeplink createFromParcel(Parcel parcel) {
            return new ConfirmDocumentsBottomSheetDeeplink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmDocumentsBottomSheetDeeplink[] newArray(int i12) {
            return new ConfirmDocumentsBottomSheetDeeplink[i12];
        }
    }

    /* compiled from: ConfirmDocumentsBottomSheetDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink$b$a;", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: ConfirmDocumentsBottomSheetDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink$b$a;", "Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink$b;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f125507b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1105611280;
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

    public ConfirmDocumentsBottomSheetDeeplink(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f125503b = str;
        this.f125504c = str2;
        this.f125505d = str3;
        this.f125506e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f125503b);
        parcel.writeString(this.f125504c);
        parcel.writeString(this.f125505d);
        parcel.writeString(this.f125506e);
    }
}
