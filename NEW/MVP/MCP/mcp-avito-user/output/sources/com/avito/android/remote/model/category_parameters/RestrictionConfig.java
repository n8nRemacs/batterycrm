package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RestrictionConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003&'(B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RestrictionConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;", "request", "", "shouldFinishPublishOnRestrict", "shouldBlockOnError", "<init>", "(Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;ZZ)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;", "component2", "()Z", "component3", "copy", "(Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;ZZ)Lcom/avito/android/remote/model/category_parameters/RestrictionConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;", "getRequest", "Z", "getShouldFinishPublishOnRestrict", "getShouldBlockOnError", "Flow", "HttpMethod", "Request", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RestrictionConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<RestrictionConfig> CREATOR = new Creator();

    @c("request")
    @k
    private final Request request;

    @c("shouldBlockOnError")
    private final boolean shouldBlockOnError;

    @c("shouldFinishPublishOnRestrict")
    private final boolean shouldFinishPublishOnRestrict;

    /* compiled from: RestrictionConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RestrictionConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RestrictionConfig createFromParcel(@k Parcel parcel) {
            return new RestrictionConfig(Request.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RestrictionConfig[] newArray(int i12) {
            return new RestrictionConfig[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionConfig.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;", "", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "ADD", "EDIT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Flow implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;

        @k
        public static final Parcelable.Creator<Flow> CREATOR;

        @k
        private final String type;

        @c("add")
        public static final Flow ADD = new Flow("ADD", 0, "add");

        @c("edit")
        public static final Flow EDIT = new Flow("EDIT", 1, "edit");

        /* compiled from: RestrictionConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Flow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Flow createFromParcel(@k Parcel parcel) {
                return Flow.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Flow[] newArray(int i12) {
                return new Flow[i12];
            }
        }

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{ADD, EDIT};
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = kotlin.enums.c.a(flowArr$values);
            CREATOR = new Creator();
        }

        private Flow(String str, int i12, String str2) {
            this.type = str2;
        }

        @k
        public static a<Flow> getEntries() {
            return $ENTRIES;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "GET", "POST", "PUT", "DELETE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HttpMethod implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HttpMethod[] $VALUES;

        @k
        public static final Parcelable.Creator<HttpMethod> CREATOR;

        @c("get")
        public static final HttpMethod GET = new HttpMethod("GET", 0);

        @c("post")
        public static final HttpMethod POST = new HttpMethod("POST", 1);

        @c("put")
        public static final HttpMethod PUT = new HttpMethod("PUT", 2);

        @c("delete")
        public static final HttpMethod DELETE = new HttpMethod("DELETE", 3);

        /* compiled from: RestrictionConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HttpMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HttpMethod createFromParcel(@k Parcel parcel) {
                return HttpMethod.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HttpMethod[] newArray(int i12) {
                return new HttpMethod[i12];
            }
        }

        private static final /* synthetic */ HttpMethod[] $values() {
            return new HttpMethod[]{GET, POST, PUT, DELETE};
        }

        static {
            HttpMethod[] httpMethodArr$values = $values();
            $VALUES = httpMethodArr$values;
            $ENTRIES = kotlin.enums.c.a(httpMethodArr$values);
            CREATOR = new Creator();
        }

        private HttpMethod(String str, int i12) {
        }

        @k
        public static a<HttpMethod> getEntries() {
            return $ENTRIES;
        }

        public static HttpMethod valueOf(String str) {
            return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
        }

        public static HttpMethod[] values() {
            return (HttpMethod[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public RestrictionConfig(@k Request request, boolean z12, boolean z13) {
        this.request = request;
        this.shouldFinishPublishOnRestrict = z12;
        this.shouldBlockOnError = z13;
    }

    public static /* synthetic */ RestrictionConfig copy$default(RestrictionConfig restrictionConfig, Request request, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            request = restrictionConfig.request;
        }
        if ((i12 & 2) != 0) {
            z12 = restrictionConfig.shouldFinishPublishOnRestrict;
        }
        if ((i12 & 4) != 0) {
            z13 = restrictionConfig.shouldBlockOnError;
        }
        return restrictionConfig.copy(request, z12, z13);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldFinishPublishOnRestrict() {
        return this.shouldFinishPublishOnRestrict;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldBlockOnError() {
        return this.shouldBlockOnError;
    }

    @k
    public final RestrictionConfig copy(@k Request request, boolean shouldFinishPublishOnRestrict, boolean shouldBlockOnError) {
        return new RestrictionConfig(request, shouldFinishPublishOnRestrict, shouldBlockOnError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionConfig)) {
            return false;
        }
        RestrictionConfig restrictionConfig = (RestrictionConfig) other;
        return L.f(this.request, restrictionConfig.request) && this.shouldFinishPublishOnRestrict == restrictionConfig.shouldFinishPublishOnRestrict && this.shouldBlockOnError == restrictionConfig.shouldBlockOnError;
    }

    @k
    public final Request getRequest() {
        return this.request;
    }

    public final boolean getShouldBlockOnError() {
        return this.shouldBlockOnError;
    }

    public final boolean getShouldFinishPublishOnRestrict() {
        return this.shouldFinishPublishOnRestrict;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldBlockOnError) + r.i(this.request.hashCode() * 31, 31, this.shouldFinishPublishOnRestrict);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RestrictionConfig(request=");
        sb2.append(this.request);
        sb2.append(", shouldFinishPublishOnRestrict=");
        sb2.append(this.shouldFinishPublishOnRestrict);
        sb2.append(", shouldBlockOnError=");
        return r.x(sb2, this.shouldBlockOnError, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.request.writeToParcel(parcel, flags);
        parcel.writeInt(this.shouldFinishPublishOnRestrict ? 1 : 0);
        parcel.writeInt(this.shouldBlockOnError ? 1 : 0);
    }

    /* compiled from: RestrictionConfig.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;", "params", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;)Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;", "getParams", "Params", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Request implements Parcelable {

        @k
        public static final Parcelable.Creator<Request> CREATOR = new Creator();

        @c("params")
        @l
        private final Params params;

        @c("type")
        @k
        private final String type;

        /* compiled from: RestrictionConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Request> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Request createFromParcel(@k Parcel parcel) {
                return new Request(parcel.readString(), parcel.readInt() == 0 ? null : Params.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Request[] newArray(int i12) {
                return new Request[i12];
            }
        }

        public Request(@k String str, @l Params params) {
            this.type = str;
            this.params = params;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, Params params, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = request.type;
            }
            if ((i12 & 2) != 0) {
                params = request.params;
            }
            return request.copy(str, params);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Params getParams() {
            return this.params;
        }

        @k
        public final Request copy(@k String type, @l Params params) {
            return new Request(type, params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return L.f(this.type, request.type) && L.f(this.params, request.params);
        }

        @l
        public final Params getParams() {
            return this.params;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Params params = this.params;
            return iHashCode + (params == null ? 0 : params.hashCode());
        }

        @k
        public String toString() {
            return "Request(type=" + this.type + ", params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            Params params = this.params;
            if (params == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                params.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Request(String str, Params params, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : params);
        }

        /* compiled from: RestrictionConfig.kt */
        @d
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;", "Landroid/os/Parcelable;", "", "path", "", "version", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;", "method", "", "params", "type", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;", MessageBody.SystemMessageBody.Platform.FLOW, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;", "component4", "()Ljava/util/Map;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;)Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Request$Params;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPath", "Ljava/lang/Integer;", "getVersion", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$HttpMethod;", "getMethod", "Ljava/util/Map;", "getParams", "getType", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig$Flow;", "getFlow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Params implements Parcelable {

            @k
            public static final Parcelable.Creator<Params> CREATOR = new Creator();

            @c(MessageBody.SystemMessageBody.Platform.FLOW)
            @l
            private final Flow flow;

            @c("method")
            @l
            private final HttpMethod method;

            @c("params")
            @l
            private final Map<String, String> params;

            @c("path")
            @l
            private final String path;

            @c("type")
            @l
            private final String type;

            @c("version")
            @l
            private final Integer version;

            /* compiled from: RestrictionConfig.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Params> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Params createFromParcel(@k Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String string = parcel.readString();
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    HttpMethod httpMethodCreateFromParcel = parcel.readInt() == 0 ? null : HttpMethod.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i12 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(i12);
                        int iA2 = 0;
                        while (iA2 != i12) {
                            iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                        }
                    }
                    return new Params(string, numValueOf, httpMethodCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readInt() != 0 ? Flow.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Params[] newArray(int i12) {
                    return new Params[i12];
                }
            }

            public Params(@l String str, @l Integer num, @l HttpMethod httpMethod, @l Map<String, String> map, @l String str2, @l Flow flow) {
                this.path = str;
                this.version = num;
                this.method = httpMethod;
                this.params = map;
                this.type = str2;
                this.flow = flow;
            }

            public static /* synthetic */ Params copy$default(Params params, String str, Integer num, HttpMethod httpMethod, Map map, String str2, Flow flow, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = params.path;
                }
                if ((i12 & 2) != 0) {
                    num = params.version;
                }
                Integer num2 = num;
                if ((i12 & 4) != 0) {
                    httpMethod = params.method;
                }
                HttpMethod httpMethod2 = httpMethod;
                if ((i12 & 8) != 0) {
                    map = params.params;
                }
                Map map2 = map;
                if ((i12 & 16) != 0) {
                    str2 = params.type;
                }
                String str3 = str2;
                if ((i12 & 32) != 0) {
                    flow = params.flow;
                }
                return params.copy(str, num2, httpMethod2, map2, str3, flow);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getPath() {
                return this.path;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Integer getVersion() {
                return this.version;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final HttpMethod getMethod() {
                return this.method;
            }

            @l
            public final Map<String, String> component4() {
                return this.params;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final Flow getFlow() {
                return this.flow;
            }

            @k
            public final Params copy(@l String path, @l Integer version, @l HttpMethod method, @l Map<String, String> params, @l String type, @l Flow flow) {
                return new Params(path, version, method, params, type, flow);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Params)) {
                    return false;
                }
                Params params = (Params) other;
                return L.f(this.path, params.path) && L.f(this.version, params.version) && this.method == params.method && L.f(this.params, params.params) && L.f(this.type, params.type) && this.flow == params.flow;
            }

            @l
            public final Flow getFlow() {
                return this.flow;
            }

            @l
            public final HttpMethod getMethod() {
                return this.method;
            }

            @l
            public final Map<String, String> getParams() {
                return this.params;
            }

            @l
            public final String getPath() {
                return this.path;
            }

            @l
            public final String getType() {
                return this.type;
            }

            @l
            public final Integer getVersion() {
                return this.version;
            }

            public int hashCode() {
                String str = this.path;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.version;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                HttpMethod httpMethod = this.method;
                int iHashCode3 = (iHashCode2 + (httpMethod == null ? 0 : httpMethod.hashCode())) * 31;
                Map<String, String> map = this.params;
                int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.type;
                int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Flow flow = this.flow;
                return iHashCode5 + (flow != null ? flow.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Params(path=" + this.path + ", version=" + this.version + ", method=" + this.method + ", params=" + this.params + ", type=" + this.type + ", flow=" + this.flow + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.path);
                Integer num = this.version;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                HttpMethod httpMethod = this.method;
                if (httpMethod == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    httpMethod.writeToParcel(parcel, flags);
                }
                Map<String, String> map = this.params;
                if (map == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itH = C0.h(parcel, 1, map);
                    while (itH.hasNext()) {
                        Map.Entry entry = (Map.Entry) itH.next();
                        parcel.writeString((String) entry.getKey());
                        parcel.writeString((String) entry.getValue());
                    }
                }
                parcel.writeString(this.type);
                Flow flow = this.flow;
                if (flow == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    flow.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Params(String str, Integer num, HttpMethod httpMethod, Map map, String str2, Flow flow, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? 1 : num, (i12 & 4) != 0 ? HttpMethod.GET : httpMethod, (i12 & 8) != 0 ? null : map, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : flow);
            }
        }
    }

    public /* synthetic */ RestrictionConfig(Request request, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(request, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
