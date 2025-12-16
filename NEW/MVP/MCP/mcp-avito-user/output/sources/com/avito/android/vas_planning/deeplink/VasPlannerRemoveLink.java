package com.avito.android.vas_planning.deeplink;

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

/* compiled from: VasPlannerRemoveLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasPlannerRemoveLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VasPlannerRemoveLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322251b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f322252c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f322253d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f322254e;

    /* compiled from: VasPlannerRemoveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlannerRemoveLink> {
        @Override // android.os.Parcelable.Creator
        public final VasPlannerRemoveLink createFromParcel(Parcel parcel) {
            return new VasPlannerRemoveLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlannerRemoveLink[] newArray(int i12) {
            return new VasPlannerRemoveLink[i12];
        }
    }

    /* compiled from: VasPlannerRemoveLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b$a;", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b$b;", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: VasPlannerRemoveLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b$a;", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b;", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f322255b;

            public a(@l String str) {
                super(null);
                this.f322255b = str;
            }
        }

        /* compiled from: VasPlannerRemoveLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b$b;", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b;", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink$b$b, reason: collision with other inner class name */
        public static final class C9962b extends b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f322256b;

            public C9962b(@l String str) {
                super(null);
                this.f322256b = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public VasPlannerRemoveLink(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f322251b = str;
        this.f322252c = str2;
        this.f322253d = str3;
        this.f322254e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322251b);
        parcel.writeString(this.f322252c);
        parcel.writeString(this.f322253d);
        parcel.writeString(this.f322254e);
    }
}
