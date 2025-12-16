package com.avito.android.progress_info_toast_bar.presenter;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import io.reactivex.rxjava3.core.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressInfoToastBarPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter;", "", "RequestData", "RequestType", "State", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ProgressInfoToastBarPresenter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProgressInfoToastBarPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestType;", "", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequestType {

        /* renamed from: b, reason: collision with root package name */
        public static final RequestType f231550b;

        /* renamed from: c, reason: collision with root package name */
        public static final RequestType f231551c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ RequestType[] f231552d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231553e;

        static {
            RequestType requestType = new RequestType("VACANCY", 0);
            f231550b = requestType;
            RequestType requestType2 = new RequestType("TRUCK", 1);
            f231551c = requestType2;
            RequestType[] requestTypeArr = {requestType, requestType2};
            f231552d = requestTypeArr;
            f231553e = kotlin.enums.c.a(requestTypeArr);
        }

        public RequestType() {
            throw null;
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) f231552d.clone();
        }
    }

    /* compiled from: ProgressInfoToastBarPresenter.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$State;", "Landroid/os/Parcelable;", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State implements Parcelable {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final RequestData f231554b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ProgressInfoToastBarData f231555c;

        /* compiled from: ProgressInfoToastBarPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readInt() == 0 ? null : RequestData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProgressInfoToastBarData.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State(@l RequestData requestData, @l ProgressInfoToastBarData progressInfoToastBarData) {
            this.f231554b = requestData;
            this.f231555c = progressInfoToastBarData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            RequestData requestData = this.f231554b;
            if (requestData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                requestData.writeToParcel(parcel, i12);
            }
            ProgressInfoToastBarData progressInfoToastBarData = this.f231555c;
            if (progressInfoToastBarData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                progressInfoToastBarData.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ProgressInfoToastBarPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@k Bundle bundle);

    void b(@l Bundle bundle);

    void c(@k q qVar);

    @k
    BK0.a d();

    void e(@k State state);

    @k
    State getState();

    void onPause();

    void onResume();

    /* compiled from: ProgressInfoToastBarPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;", "Landroid/os/Parcelable;", "a", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class RequestData implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f231544b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f231545c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f231546d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f231547e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final RequestType f231548f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final ProgressInfoToastBar.InitialFlow f231549g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public static final a f231543h = new a(null);

        @k
        public static final Parcelable.Creator<RequestData> CREATOR = new b();

        /* compiled from: ProgressInfoToastBarPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData$a;", "", "<init>", "()V", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public static RequestData a(a aVar, String str, String str2, String str3) {
                aVar.getClass();
                return new RequestData(str, str2, str3, "", RequestType.f231550b, null);
            }

            public a() {
            }
        }

        /* compiled from: ProgressInfoToastBarPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<RequestData> {
            @Override // android.os.Parcelable.Creator
            public final RequestData createFromParcel(Parcel parcel) {
                return new RequestData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), RequestType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ProgressInfoToastBar.InitialFlow.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final RequestData[] newArray(int i12) {
                return new RequestData[i12];
            }
        }

        public RequestData(@k String str, @k String str2, @l String str3, @k String str4, @k RequestType requestType, @l ProgressInfoToastBar.InitialFlow initialFlow) {
            this.f231544b = str;
            this.f231545c = str2;
            this.f231546d = str3;
            this.f231547e = str4;
            this.f231548f = requestType;
            this.f231549g = initialFlow;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestData)) {
                return false;
            }
            RequestData requestData = (RequestData) obj;
            return L.f(this.f231544b, requestData.f231544b) && L.f(this.f231545c, requestData.f231545c) && L.f(this.f231546d, requestData.f231546d) && L.f(this.f231547e, requestData.f231547e) && this.f231548f == requestData.f231548f && this.f231549g == requestData.f231549g;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f231544b.hashCode() * 31, 31, this.f231545c);
            String str = this.f231546d;
            int iHashCode = (this.f231548f.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f231547e)) * 31;
            ProgressInfoToastBar.InitialFlow initialFlow = this.f231549g;
            return iHashCode + (initialFlow != null ? initialFlow.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "RequestData(itemId=" + this.f231544b + ", itemTitle=" + this.f231545c + ", itemLocationId=" + this.f231546d + ", userId=" + this.f231547e + ", requestType=" + this.f231548f + ", initialFlow=" + this.f231549g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f231544b);
            parcel.writeString(this.f231545c);
            parcel.writeString(this.f231546d);
            parcel.writeString(this.f231547e);
            parcel.writeString(this.f231548f.name());
            ProgressInfoToastBar.InitialFlow initialFlow = this.f231549g;
            if (initialFlow == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                initialFlow.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ RequestData(String str, String str2, String str3, String str4, RequestType requestType, ProgressInfoToastBar.InitialFlow initialFlow, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, requestType, (i12 & 32) != 0 ? null : initialFlow);
        }
    }
}
