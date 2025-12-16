package arrow.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Try.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Larrow/core/TryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "PredicateException", "UnsupportedOperationException", "Larrow/core/TryException$PredicateException;", "Larrow/core/TryException$UnsupportedOperationException;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public abstract class TryException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f56261b;

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Larrow/core/TryException$PredicateException;", "Larrow/core/TryException;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class PredicateException extends TryException {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PredicateException)) {
                return false;
            }
            ((PredicateException) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        @Override // arrow.core.TryException, java.lang.Throwable
        @Y61.k
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "PredicateException(message=null)";
        }
    }

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Larrow/core/TryException$UnsupportedOperationException;", "Larrow/core/TryException;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class UnsupportedOperationException extends TryException {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsupportedOperationException)) {
                return false;
            }
            ((UnsupportedOperationException) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        @Override // arrow.core.TryException, java.lang.Throwable
        @Y61.k
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnsupportedOperationException(message=null)";
        }
    }

    public TryException(@Y61.k String str, C42822w c42822w) {
        super(str);
        this.f56261b = str;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public String getMessage() {
        return this.f56261b;
    }
}
