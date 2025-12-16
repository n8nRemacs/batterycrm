package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import androidx.compose.foundation.H;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TypedResult.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "T", "", "()V", "Error", "Success", "Lcom/avito/android/remote/model/TypedResult$Error;", "Lcom/avito/android/remote/model/TypedResult$Success;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TypedResult<T> {

    /* compiled from: TypedResult.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/TypedResult$Error;", "T", "Lcom/avito/android/remote/model/TypedResult;", "error", "Lcom/avito/android/remote/error/ApiError;", "cause", "", "(Lcom/avito/android/remote/error/ApiError;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getError", "()Lcom/avito/android/remote/error/ApiError;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error<T> extends TypedResult<T> {

        @l
        private final transient Throwable cause;

        @k
        private final transient ApiError error;

        public /* synthetic */ Error(ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this(apiError, (i12 & 2) != 0 ? null : th2);
        }

        public static /* synthetic */ Error copy$default(Error error, ApiError apiError, Throwable th2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                apiError = error.error;
            }
            if ((i12 & 2) != 0) {
                th2 = error.cause;
            }
            return error.copy(apiError, th2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final ApiError getError() {
            return this.error;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @k
        public final Error<T> copy(@k ApiError error, @l Throwable cause) {
            return new Error<>(error, cause);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return L.f(this.error, error.error) && L.f(this.cause, error.cause);
        }

        @l
        public final Throwable getCause() {
            return this.cause;
        }

        @k
        public final ApiError getError() {
            return this.error;
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.error);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.cause, ')');
        }

        public Error(@k ApiError apiError, @l Throwable th2) {
            super(null);
            this.error = apiError;
            this.cause = th2;
        }
    }

    /* compiled from: TypedResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/TypedResult$Success;", "T", "Lcom/avito/android/remote/model/TypedResult;", "result", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/avito/android/remote/model/TypedResult$Success;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> extends TypedResult<T> {
        private final transient T result;

        public Success(T t12) {
            super(null);
            this.result = t12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = success.result;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.result;
        }

        @k
        public final Success<T> copy(T result) {
            return new Success<>(result);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && L.f(this.result, ((Success) other).result);
        }

        public final T getResult() {
            return this.result;
        }

        public int hashCode() {
            T t12 = this.result;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @k
        public String toString() {
            return H.n(new StringBuilder("Success(result="), this.result, ')');
        }
    }

    public /* synthetic */ TypedResult(C42822w c42822w) {
        this();
    }

    private TypedResult() {
    }
}
