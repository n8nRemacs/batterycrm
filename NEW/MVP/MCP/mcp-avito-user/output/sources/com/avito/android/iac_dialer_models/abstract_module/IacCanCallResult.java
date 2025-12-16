package com.avito.android.iac_dialer_models.abstract_module;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacCanCallResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "Landroid/os/Parcelable;", "LdL/d;", "<init>", "()V", "Can", "CanNot", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$CanNot;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacCanCallResult implements Parcelable, d {

    /* compiled from: IacCanCallResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;", "callInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;", "getCallInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Can extends IacCanCallResult {

        @k
        public static final Parcelable.Creator<Can> CREATOR = new a();

        @l
        private final DeepLink action;

        @k
        private final IacCallInfo callInfo;

        /* compiled from: IacCanCallResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Can> {
            @Override // android.os.Parcelable.Creator
            public final Can createFromParcel(Parcel parcel) {
                return new Can(IacCallInfo.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(Can.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Can[] newArray(int i12) {
                return new Can[i12];
            }
        }

        public /* synthetic */ Can(IacCallInfo iacCallInfo, DeepLink deepLink, int i12, C42822w c42822w) {
            this(iacCallInfo, (i12 & 2) != 0 ? null : deepLink);
        }

        public static /* synthetic */ Can copy$default(Can can, IacCallInfo iacCallInfo, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacCallInfo = can.callInfo;
            }
            if ((i12 & 2) != 0) {
                deepLink = can.action;
            }
            return can.copy(iacCallInfo, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacCallInfo getCallInfo() {
            return this.callInfo;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }

        @k
        public final Can copy(@k IacCallInfo callInfo, @l DeepLink action) {
            return new Can(callInfo, action);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Can)) {
                return false;
            }
            Can can = (Can) other;
            return L.f(this.callInfo, can.callInfo) && L.f(this.action, can.action);
        }

        @l
        public final DeepLink getAction() {
            return this.action;
        }

        @k
        public final IacCallInfo getCallInfo() {
            return this.callInfo;
        }

        public int hashCode() {
            int iHashCode = this.callInfo.hashCode() * 31;
            DeepLink deepLink = this.action;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Can(callInfo=");
            sb2.append(this.callInfo);
            sb2.append(", action=");
            return com.avito.android.actions_sheet.a.v(sb2, this.action, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.callInfo.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.action, flags);
        }

        public Can(@k IacCallInfo iacCallInfo, @l DeepLink deepLink) {
            super(null);
            this.callInfo = iacCallInfo;
            this.action = deepLink;
        }
    }

    /* compiled from: IacCanCallResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$CanNot;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "", "reason", "Lcom/avito/android/deep_linking/links/DeepLink;", "callbackDeepLink", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$CanNot;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReason", "Lcom/avito/android/deep_linking/links/DeepLink;", "getCallbackDeepLink", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CanNot extends IacCanCallResult {

        @k
        public static final Parcelable.Creator<CanNot> CREATOR = new a();

        @l
        private final DeepLink callbackDeepLink;

        @k
        private final String reason;

        /* compiled from: IacCanCallResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CanNot> {
            @Override // android.os.Parcelable.Creator
            public final CanNot createFromParcel(Parcel parcel) {
                return new CanNot(parcel.readString(), (DeepLink) parcel.readParcelable(CanNot.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CanNot[] newArray(int i12) {
                return new CanNot[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CanNot() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CanNot copy$default(CanNot canNot, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = canNot.reason;
            }
            if ((i12 & 2) != 0) {
                deepLink = canNot.callbackDeepLink;
            }
            return canNot.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getCallbackDeepLink() {
            return this.callbackDeepLink;
        }

        @k
        public final CanNot copy(@k String reason, @l DeepLink callbackDeepLink) {
            return new CanNot(reason, callbackDeepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CanNot)) {
                return false;
            }
            CanNot canNot = (CanNot) other;
            return L.f(this.reason, canNot.reason) && L.f(this.callbackDeepLink, canNot.callbackDeepLink);
        }

        @l
        public final DeepLink getCallbackDeepLink() {
            return this.callbackDeepLink;
        }

        @k
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            DeepLink deepLink = this.callbackDeepLink;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CanNot(reason=");
            sb2.append(this.reason);
            sb2.append(", callbackDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.callbackDeepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.reason);
            parcel.writeParcelable(this.callbackDeepLink, flags);
        }

        public /* synthetic */ CanNot(String str, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : deepLink);
        }

        public CanNot(@k String str, @l DeepLink deepLink) {
            super(null);
            this.reason = str;
            this.callbackDeepLink = deepLink;
        }
    }

    public /* synthetic */ IacCanCallResult(C42822w c42822w) {
        this();
    }

    private IacCanCallResult() {
    }
}
