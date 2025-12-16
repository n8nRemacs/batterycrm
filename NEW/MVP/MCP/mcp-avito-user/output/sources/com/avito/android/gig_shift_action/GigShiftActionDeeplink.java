package com.avito.android.gig_shift_action;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: GigShiftActionDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigShiftActionDeeplink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<GigShiftActionDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160386b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f160387c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f160388d;

    /* compiled from: GigShiftActionDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftActionDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftActionDeeplink createFromParcel(Parcel parcel) {
            return new GigShiftActionDeeplink(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftActionDeeplink[] newArray(int i12) {
            return new GigShiftActionDeeplink[i12];
        }
    }

    /* compiled from: GigShiftActionDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$a;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$b;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$c;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$d;", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: GigShiftActionDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$a;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f160389b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1764761990;
            }

            @k
            public final String toString() {
                return "OpenBarcodeScanner";
            }
        }

        /* compiled from: GigShiftActionDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$b;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b;", "LJu/c$b;", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.gig_shift_action.GigShiftActionDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4686b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f160390b;

            public C4686b(@k DeepLink deepLink) {
                super(null);
                this.f160390b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4686b) && L.f(this.f160390b, ((C4686b) obj).f160390b);
            }

            public final int hashCode() {
                return this.f160390b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f160390b, ')');
            }
        }

        /* compiled from: GigShiftActionDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$c;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b;", "LJu/c$b;", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f160391b;

            public c(@k DeepLink deepLink) {
                super(null);
                this.f160391b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f160391b, ((c) obj).f160391b);
            }

            public final int hashCode() {
                return this.f160391b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenRating(deepLink="), this.f160391b, ')');
            }
        }

        /* compiled from: GigShiftActionDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b$d;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_gig_shift-action_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f160392b = new d();

            public d() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1854420207;
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

    public /* synthetic */ GigShiftActionDeeplink(boolean z12, String str, boolean z13, int i12, C42822w c42822w) {
        this(z12, str, (i12 & 4) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f160386b ? 1 : 0);
        parcel.writeString(this.f160387c);
        parcel.writeInt(this.f160388d ? 1 : 0);
    }

    public GigShiftActionDeeplink(boolean z12, @l String str, boolean z13) {
        this.f160386b = z12;
        this.f160387c = str;
        this.f160388d = z13;
    }
}
