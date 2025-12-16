package com.avito.android.sbc.create.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchArg.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg;", "Landroid/os/Parcelable;", "SbcConfiguratorArgs", "SbcVasFlowConfiguratorArgs", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg$SbcConfiguratorArgs;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg$SbcVasFlowConfiguratorArgs;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CreateDiscountDispatchArg extends Parcelable {

    /* compiled from: CreateDiscountDispatchArg.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg$SbcVasFlowConfiguratorArgs;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SbcVasFlowConfiguratorArgs implements CreateDiscountDispatchArg {

        @k
        public static final Parcelable.Creator<SbcVasFlowConfiguratorArgs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259609b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f259610c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f259611d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f259612e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final DeepLink f259613f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f259614g;

        /* compiled from: CreateDiscountDispatchArg.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbcVasFlowConfiguratorArgs> {
            @Override // android.os.Parcelable.Creator
            public final SbcVasFlowConfiguratorArgs createFromParcel(Parcel parcel) {
                return new SbcVasFlowConfiguratorArgs((DeepLink) parcel.readParcelable(SbcVasFlowConfiguratorArgs.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SbcVasFlowConfiguratorArgs[] newArray(int i12) {
                return new SbcVasFlowConfiguratorArgs[i12];
            }
        }

        public SbcVasFlowConfiguratorArgs(@k DeepLink deepLink, @k String str, @k String str2, @k String str3, @l String str4, boolean z12) {
            this.f259609b = str;
            this.f259610c = str2;
            this.f259611d = z12;
            this.f259612e = str3;
            this.f259613f = deepLink;
            this.f259614g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbcVasFlowConfiguratorArgs)) {
                return false;
            }
            SbcVasFlowConfiguratorArgs sbcVasFlowConfiguratorArgs = (SbcVasFlowConfiguratorArgs) obj;
            return L.f(this.f259609b, sbcVasFlowConfiguratorArgs.f259609b) && L.f(this.f259610c, sbcVasFlowConfiguratorArgs.f259610c) && this.f259611d == sbcVasFlowConfiguratorArgs.f259611d && L.f(this.f259612e, sbcVasFlowConfiguratorArgs.f259612e) && L.f(this.f259613f, sbcVasFlowConfiguratorArgs.f259613f) && L.f(this.f259614g, sbcVasFlowConfiguratorArgs.f259614g);
        }

        @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF259609b() {
            return this.f259609b;
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f259613f, H.d(r.i(H.d(this.f259609b.hashCode() * 31, 31, this.f259610c), 31, this.f259611d), 31, this.f259612e), 31);
            String str = this.f259614g;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbcVasFlowConfiguratorArgs(itemId=");
            sb2.append(this.f259609b);
            sb2.append(", checkoutContext=");
            sb2.append(this.f259610c);
            sb2.append(", closable=");
            sb2.append(this.f259611d);
            sb2.append(", currentFlow=");
            sb2.append(this.f259612e);
            sb2.append(", skipDispatchLink=");
            sb2.append(this.f259613f);
            sb2.append(", emptyActionTitle=");
            return C22026a.c(sb2, this.f259614g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f259609b);
            parcel.writeString(this.f259610c);
            parcel.writeInt(this.f259611d ? 1 : 0);
            parcel.writeString(this.f259612e);
            parcel.writeParcelable(this.f259613f, i12);
            parcel.writeString(this.f259614g);
        }
    }

    @k
    /* renamed from: getItemId */
    String getF259609b();

    /* compiled from: CreateDiscountDispatchArg.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg$SbcConfiguratorArgs;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchArg;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SbcConfiguratorArgs implements CreateDiscountDispatchArg {

        @k
        public static final Parcelable.Creator<SbcConfiguratorArgs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259606b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f259607c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f259608d;

        /* compiled from: CreateDiscountDispatchArg.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbcConfiguratorArgs> {
            @Override // android.os.Parcelable.Creator
            public final SbcConfiguratorArgs createFromParcel(Parcel parcel) {
                return new SbcConfiguratorArgs(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SbcConfiguratorArgs[] newArray(int i12) {
                return new SbcConfiguratorArgs[i12];
            }
        }

        public SbcConfiguratorArgs(@k String str, @l String str2, @l String str3) {
            this.f259606b = str;
            this.f259607c = str2;
            this.f259608d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbcConfiguratorArgs)) {
                return false;
            }
            SbcConfiguratorArgs sbcConfiguratorArgs = (SbcConfiguratorArgs) obj;
            return L.f(this.f259606b, sbcConfiguratorArgs.f259606b) && L.f(this.f259607c, sbcConfiguratorArgs.f259607c) && L.f(this.f259608d, sbcConfiguratorArgs.f259608d);
        }

        @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF259609b() {
            return this.f259606b;
        }

        public final int hashCode() {
            int iHashCode = this.f259606b.hashCode() * 31;
            String str = this.f259607c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f259608d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbcConfiguratorArgs(itemId=");
            sb2.append(this.f259606b);
            sb2.append(", action=");
            sb2.append(this.f259607c);
            sb2.append(", from=");
            return C22026a.c(sb2, this.f259608d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f259606b);
            parcel.writeString(this.f259607c);
            parcel.writeString(this.f259608d);
        }

        public /* synthetic */ SbcConfiguratorArgs(String str, String str2, String str3, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
        }
    }
}
