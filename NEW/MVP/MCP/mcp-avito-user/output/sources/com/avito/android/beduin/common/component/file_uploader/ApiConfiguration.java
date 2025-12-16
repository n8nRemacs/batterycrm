package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;", "remove", "upload", "<init>", "(Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;)V", "component1", "()Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;", "component2", "copy", "(Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;)Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;", "getRemove", "getUpload", "Config", "HttpMethod", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiConfiguration implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ApiConfiguration> CREATOR = new a();

    @com.google.gson.annotations.c("remove")
    @Y61.k
    private final Config remove;

    @com.google.gson.annotations.c("upload")
    @Y61.k
    private final Config upload;

    /* compiled from: BeduinFileUploaderModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010\u000eR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006,"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;", "Landroid/os/Parcelable;", "", "path", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;", "_method", "errorMessage", "", "params", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;Ljava/lang/String;Ljava/util/Map;)V", "component2", "()Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;", "component1", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPath", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;", "getErrorMessage", "Ljava/util/Map;", "getParams", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Config implements Parcelable {

        @com.google.gson.annotations.c("method")
        @Y61.l
        private final HttpMethod _method;

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String errorMessage;

        @com.google.gson.annotations.c("params")
        @Y61.l
        private final Map<String, String> params;

        @com.google.gson.annotations.c("path")
        @Y61.k
        private final String path;

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        @Y61.k
        public static final Parcelable.Creator<Config> CREATOR = new b();

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$Config$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.file_uploader.ApiConfiguration$Config$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            public Companion() {
            }
        }

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                HttpMethod httpMethodValueOf = parcel.readInt() == 0 ? null : HttpMethod.valueOf(parcel.readString());
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Config(string, httpMethodValueOf, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@Y61.k String str, @Y61.l HttpMethod httpMethod, @Y61.k String str2, @Y61.l Map<String, String> map) {
            this.path = str;
            this._method = httpMethod;
            this.errorMessage = str2;
            this.params = map;
        }

        /* renamed from: component2, reason: from getter */
        private final HttpMethod get_method() {
            return this._method;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, String str, HttpMethod httpMethod, String str2, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.path;
            }
            if ((i12 & 2) != 0) {
                httpMethod = config._method;
            }
            if ((i12 & 4) != 0) {
                str2 = config.errorMessage;
            }
            if ((i12 & 8) != 0) {
                map = config.params;
            }
            return config.copy(str, httpMethod, str2, map);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @Y61.k
        /* renamed from: component3, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Y61.l
        public final Map<String, String> component4() {
            return this.params;
        }

        @Y61.k
        public final Config copy(@Y61.k String path, @Y61.l HttpMethod _method, @Y61.k String errorMessage, @Y61.l Map<String, String> params) {
            return new Config(path, _method, errorMessage, params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.path, config.path) && this._method == config._method && L.f(this.errorMessage, config.errorMessage) && L.f(this.params, config.params);
        }

        @Y61.k
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Y61.l
        public final Map<String, String> getParams() {
            return this.params;
        }

        @Y61.k
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            HttpMethod httpMethod = this._method;
            int iD2 = H.d((iHashCode + (httpMethod == null ? 0 : httpMethod.hashCode())) * 31, 31, this.errorMessage);
            Map<String, String> map = this.params;
            return iD2 + (map != null ? map.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(path=");
            sb2.append(this.path);
            sb2.append(", _method=");
            sb2.append(this._method);
            sb2.append(", errorMessage=");
            sb2.append(this.errorMessage);
            sb2.append(", params=");
            return androidx.appcompat.app.r.w(sb2, this.params, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.path);
            HttpMethod httpMethod = this._method;
            if (httpMethod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(httpMethod.name());
            }
            parcel.writeString(this.errorMessage);
            Map<String, String> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinFileUploaderModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration$HttpMethod;", "", "(Ljava/lang/String;I)V", "POST", "GET", "DELETE", "PUT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HttpMethod {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ HttpMethod[] $VALUES;
        public static final HttpMethod POST = new HttpMethod("POST", 0);
        public static final HttpMethod GET = new HttpMethod("GET", 1);
        public static final HttpMethod DELETE = new HttpMethod("DELETE", 2);
        public static final HttpMethod PUT = new HttpMethod("PUT", 3);

        private static final /* synthetic */ HttpMethod[] $values() {
            return new HttpMethod[]{POST, GET, DELETE, PUT};
        }

        static {
            HttpMethod[] httpMethodArr$values = $values();
            $VALUES = httpMethodArr$values;
            $ENTRIES = kotlin.enums.c.a(httpMethodArr$values);
        }

        private HttpMethod(String str, int i12) {
        }

        @Y61.k
        public static kotlin.enums.a<HttpMethod> getEntries() {
            return $ENTRIES;
        }

        public static HttpMethod valueOf(String str) {
            return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
        }

        public static HttpMethod[] values() {
            return (HttpMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApiConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final ApiConfiguration createFromParcel(Parcel parcel) {
            Parcelable.Creator<Config> creator = Config.CREATOR;
            return new ApiConfiguration(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ApiConfiguration[] newArray(int i12) {
            return new ApiConfiguration[i12];
        }
    }

    public ApiConfiguration(@Y61.k Config config, @Y61.k Config config2) {
        this.remove = config;
        this.upload = config2;
    }

    public static /* synthetic */ ApiConfiguration copy$default(ApiConfiguration apiConfiguration, Config config, Config config2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = apiConfiguration.remove;
        }
        if ((i12 & 2) != 0) {
            config2 = apiConfiguration.upload;
        }
        return apiConfiguration.copy(config, config2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Config getRemove() {
        return this.remove;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final Config getUpload() {
        return this.upload;
    }

    @Y61.k
    public final ApiConfiguration copy(@Y61.k Config remove, @Y61.k Config upload) {
        return new ApiConfiguration(remove, upload);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiConfiguration)) {
            return false;
        }
        ApiConfiguration apiConfiguration = (ApiConfiguration) other;
        return L.f(this.remove, apiConfiguration.remove) && L.f(this.upload, apiConfiguration.upload);
    }

    @Y61.k
    public final Config getRemove() {
        return this.remove;
    }

    @Y61.k
    public final Config getUpload() {
        return this.upload;
    }

    public int hashCode() {
        return this.upload.hashCode() + (this.remove.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        return "ApiConfiguration(remove=" + this.remove + ", upload=" + this.upload + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        this.remove.writeToParcel(parcel, flags);
        this.upload.writeToParcel(parcel, flags);
    }
}
