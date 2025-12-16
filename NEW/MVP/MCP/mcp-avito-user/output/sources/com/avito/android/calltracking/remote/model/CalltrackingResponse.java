package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalltrackingResponse.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/calltracking/remote/model/CalltrackingResponse;", "Landroid/os/Parcelable;", "", "hasMore", "", ProfileTab.ALL, "missed", "", "Lcom/avito/android/calltracking/remote/model/Call;", "calls", "", "callWarningHeader", "Lcom/avito/android/remote/model/text/AttributedText;", "callWarningText", "<init>", "(ZIILjava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Z", "g", "()Z", "I", "c", "()I", "h", "Ljava/util/List;", "f", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CalltrackingResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<CalltrackingResponse> CREATOR = new a();

    @c(ProfileTab.ALL)
    private final int all;

    @c("callWarningHeader")
    @k
    private final String callWarningHeader;

    @c("callWarningText")
    @k
    private final AttributedText callWarningText;

    @c("calls")
    @k
    private final List<Call> calls;

    @c("hasMore")
    private final boolean hasMore;

    @c("missed")
    private final int missed;

    /* compiled from: CalltrackingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalltrackingResponse> {
        @Override // android.os.Parcelable.Creator
        public final CalltrackingResponse createFromParcel(Parcel parcel) {
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(Call.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CalltrackingResponse(z12, i12, i13, arrayList, parcel.readString(), (AttributedText) parcel.readParcelable(CalltrackingResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CalltrackingResponse[] newArray(int i12) {
            return new CalltrackingResponse[i12];
        }
    }

    public CalltrackingResponse(boolean z12, int i12, int i13, @k List<Call> list, @k String str, @k AttributedText attributedText) {
        this.hasMore = z12;
        this.all = i12;
        this.missed = i13;
        this.calls = list;
        this.callWarningHeader = str;
        this.callWarningText = attributedText;
    }

    public static CalltrackingResponse a(CalltrackingResponse calltrackingResponse, ArrayList arrayList) {
        boolean z12 = calltrackingResponse.hasMore;
        int i12 = calltrackingResponse.all;
        int i13 = calltrackingResponse.missed;
        String str = calltrackingResponse.callWarningHeader;
        AttributedText attributedText = calltrackingResponse.callWarningText;
        calltrackingResponse.getClass();
        return new CalltrackingResponse(z12, i12, i13, arrayList, str, attributedText);
    }

    /* renamed from: c, reason: from getter */
    public final int getAll() {
        return this.all;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCallWarningHeader() {
        return this.callWarningHeader;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getCallWarningText() {
        return this.callWarningText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalltrackingResponse)) {
            return false;
        }
        CalltrackingResponse calltrackingResponse = (CalltrackingResponse) obj;
        return this.hasMore == calltrackingResponse.hasMore && this.all == calltrackingResponse.all && this.missed == calltrackingResponse.missed && L.f(this.calls, calltrackingResponse.calls) && L.f(this.callWarningHeader, calltrackingResponse.callWarningHeader) && L.f(this.callWarningText, calltrackingResponse.callWarningText);
    }

    @k
    public final List<Call> f() {
        return this.calls;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: h, reason: from getter */
    public final int getMissed() {
        return this.missed;
    }

    public final int hashCode() {
        return this.callWarningText.hashCode() + H.d(H.e(r.e(this.missed, r.e(this.all, Boolean.hashCode(this.hasMore) * 31, 31), 31), 31, this.calls), 31, this.callWarningHeader);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalltrackingResponse(hasMore=");
        sb2.append(this.hasMore);
        sb2.append(", all=");
        sb2.append(this.all);
        sb2.append(", missed=");
        sb2.append(this.missed);
        sb2.append(", calls=");
        sb2.append(this.calls);
        sb2.append(", callWarningHeader=");
        sb2.append(this.callWarningHeader);
        sb2.append(", callWarningText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.callWarningText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.hasMore ? 1 : 0);
        parcel.writeInt(this.all);
        parcel.writeInt(this.missed);
        Iterator itJ = C0.j(this.calls, parcel);
        while (itJ.hasNext()) {
            ((Call) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.callWarningHeader);
        parcel.writeParcelable(this.callWarningText, i12);
    }
}
