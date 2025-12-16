package ru.cyberity.cbr.core.data.model;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRException.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wrap", "", "(Ljava/lang/Throwable;)V", "Api", "Network", "Unknown", "Lru/cyberity/cbr/core/data/model/CBRException$Api;", "Lru/cyberity/cbr/core/data/model/CBRException$Network;", "Lru/cyberity/cbr/core/data/model/CBRException$Unknown;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBRException extends Exception {

    /* compiled from: CBRException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRException$Api;", "Lru/cyberity/cbr/core/data/model/CBRException;", "", "description", "", "code", "correlationId", "errorCode", "errorName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "getCorrelationId", "getErrorCode", "getErrorName", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Api extends CBRException {

        @Y61.l
        private final Integer code;

        @Y61.l
        private final String correlationId;

        @Y61.l
        private final String description;

        @Y61.l
        private final Integer errorCode;

        @Y61.l
        private final String errorName;

        public Api(@Y61.l String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l Integer num2, @Y61.l String str3) {
            super(new Exception(str), null);
            this.description = str;
            this.code = num;
            this.correlationId = str2;
            this.errorCode = num2;
            this.errorName = str3;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Api)) {
                return false;
            }
            Api api = (Api) other;
            return L.f(this.description, api.description) && L.f(this.code, api.code) && L.f(this.correlationId, api.correlationId) && L.f(this.errorCode, api.errorCode) && L.f(this.errorName, api.errorName);
        }

        @Y61.l
        public final Integer getCode() {
            return this.code;
        }

        @Y61.l
        public final String getDescription() {
            return this.description;
        }

        @Y61.l
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.code;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.correlationId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.errorCode;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.errorName;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Api(description=");
            sb2.append(this.description);
            sb2.append(", code=");
            sb2.append(this.code);
            sb2.append(", correlationId=");
            sb2.append(this.correlationId);
            sb2.append(", errorCode=");
            sb2.append(this.errorCode);
            sb2.append(", errorName=");
            return C22026a.c(sb2, this.errorName, ')');
        }
    }

    /* compiled from: CBRException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRException$Network;", "Lru/cyberity/cbr/core/data/model/CBRException;", "wrap", "", "(Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Network extends CBRException {
        public Network(@Y61.k Throwable th2) {
            super(th2, null);
        }
    }

    /* compiled from: CBRException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRException$Unknown;", "Lru/cyberity/cbr/core/data/model/CBRException;", "wrap", "", "(Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Unknown extends CBRException {
        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Unknown(@Y61.l Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ Unknown(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    public /* synthetic */ CBRException(Throwable th2, C42822w c42822w) {
        this(th2);
    }

    private CBRException(Throwable th2) {
        super(th2);
    }

    public /* synthetic */ CBRException(Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : th2, null);
    }
}
