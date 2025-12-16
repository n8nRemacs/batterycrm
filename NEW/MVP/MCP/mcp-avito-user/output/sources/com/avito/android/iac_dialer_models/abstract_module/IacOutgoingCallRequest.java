package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacOutgoingCallRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest;", "Landroid/os/Parcelable;", "<init>", "()V", "NewCall", "Recall", "Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest$NewCall;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest$Recall;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacOutgoingCallRequest implements Parcelable {

    /* compiled from: IacOutgoingCallRequest.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest$NewCall;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewCall extends IacOutgoingCallRequest {

        @k
        public static final Parcelable.Creator<NewCall> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IacCallInfo f166864b;

        /* compiled from: IacOutgoingCallRequest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NewCall> {
            @Override // android.os.Parcelable.Creator
            public final NewCall createFromParcel(Parcel parcel) {
                return new NewCall(IacCallInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NewCall[] newArray(int i12) {
                return new NewCall[i12];
            }
        }

        public NewCall(@k IacCallInfo iacCallInfo) {
            super(null);
            this.f166864b = iacCallInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewCall) && L.f(this.f166864b, ((NewCall) obj).f166864b);
        }

        public final int hashCode() {
            return this.f166864b.hashCode();
        }

        @k
        public final String toString() {
            return "NewCall(callInfo=" + this.f166864b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f166864b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: IacOutgoingCallRequest.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest$Recall;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacOutgoingCallRequest;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Recall extends IacOutgoingCallRequest {

        @k
        public static final Parcelable.Creator<Recall> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f166865b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final IacCallInfo f166866c;

        /* compiled from: IacOutgoingCallRequest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Recall> {
            @Override // android.os.Parcelable.Creator
            public final Recall createFromParcel(Parcel parcel) {
                return new Recall(parcel.readString(), IacCallInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Recall[] newArray(int i12) {
                return new Recall[i12];
            }
        }

        public Recall(@k String str, @k IacCallInfo iacCallInfo) {
            super(null);
            this.f166865b = str;
            this.f166866c = iacCallInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recall)) {
                return false;
            }
            Recall recall = (Recall) obj;
            return L.f(this.f166865b, recall.f166865b) && L.f(this.f166866c, recall.f166866c);
        }

        public final int hashCode() {
            return this.f166866c.hashCode() + (this.f166865b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Recall(prevCallId=" + this.f166865b + ", callInfo=" + this.f166866c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f166865b);
            this.f166866c.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ IacOutgoingCallRequest(C42822w c42822w) {
        this();
    }

    public IacOutgoingCallRequest() {
    }
}
