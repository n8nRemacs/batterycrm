package com.avito.android.remote.model;

import X41.f;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertReport.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 %2\u00020\u0001:\u0004%&'(BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/AdvertReport;", "Landroid/os/Parcelable;", "", "title", "header", "number", "status", "date", "Lcom/avito/android/remote/model/text/AttributedText;", "legalInfo", "", "Lcom/avito/android/remote/model/AdvertReport$Result;", "results", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getHeader", "getNumber", "getStatus", "getDate", "Lcom/avito/android/remote/model/text/AttributedText;", "getLegalInfo", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getResults", "()Ljava/util/List;", "Companion", "OkResult", "Result", "WarnResult", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final class AdvertReport implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<AdvertReport> CREATOR;

    @l
    private final String date;

    @l
    private final String header;

    @l
    private final AttributedText legalInfo;

    @l
    private final String number;

    @l
    private final List<Result> results;

    @l
    private final String status;

    @l
    private final String title;

    /* compiled from: AdvertReport.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/AdvertReport$OkResult;", "Lcom/avito/android/remote/model/AdvertReport$Result;", "title", "", "(Ljava/lang/String;)V", "Companion", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkResult extends Result {

        @f
        @k
        public static final Parcelable.Creator<OkResult> CREATOR;

        static {
            AdvertReport$OkResult$Companion$CREATOR$1 advertReport$OkResult$Companion$CREATOR$1 = AdvertReport$OkResult$Companion$CREATOR$1.INSTANCE;
            int i12 = I3.f318630a;
            CREATOR = new H3(advertReport$OkResult$Companion$CREATOR$1);
        }

        public OkResult(@k String str) {
            super(str, null);
        }
    }

    /* compiled from: AdvertReport.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/AdvertReport$Result;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/AdvertReport$OkResult;", "Lcom/avito/android/remote/model/AdvertReport$WarnResult;", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Result implements Parcelable {

        @k
        private final String title;

        public /* synthetic */ Result(String str, C42822w c42822w) {
            this(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel dest, int flags) {
            dest.writeString(this.title);
        }

        private Result(String str) {
            this.title = str;
        }
    }

    /* compiled from: AdvertReport.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/AdvertReport$WarnResult;", "Lcom/avito/android/remote/model/AdvertReport$Result;", "title", "", "(Ljava/lang/String;)V", "Companion", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WarnResult extends Result {

        @f
        @k
        public static final Parcelable.Creator<WarnResult> CREATOR;

        static {
            AdvertReport$WarnResult$Companion$CREATOR$1 advertReport$WarnResult$Companion$CREATOR$1 = AdvertReport$WarnResult$Companion$CREATOR$1.INSTANCE;
            int i12 = I3.f318630a;
            CREATOR = new H3(advertReport$WarnResult$Companion$CREATOR$1);
        }

        public WarnResult(@k String str) {
            super(str, null);
        }
    }

    static {
        AdvertReport$Companion$CREATOR$1 advertReport$Companion$CREATOR$1 = AdvertReport$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(advertReport$Companion$CREATOR$1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertReport(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l AttributedText attributedText, @l List<? extends Result> list) {
        this.title = str;
        this.header = str2;
        this.number = str3;
        this.status = str4;
        this.date = str5;
        this.legalInfo = attributedText;
        this.results = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDate() {
        return this.date;
    }

    @l
    public final String getHeader() {
        return this.header;
    }

    @l
    public final AttributedText getLegalInfo() {
        return this.legalInfo;
    }

    @l
    public final String getNumber() {
        return this.number;
    }

    @l
    public final List<Result> getResults() {
        return this.results;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.header);
        dest.writeString(this.number);
        dest.writeString(this.status);
        dest.writeString(this.date);
        dest.writeParcelable(this.legalInfo, flags);
        J3.e(this.results, dest, 0);
    }
}
