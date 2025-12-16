package com.avito.android.credman;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;

/* compiled from: CredmanSaver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credman/o;", "", "a", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface o {

    /* compiled from: CredmanSaver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/credman/o$a;", "", "a", "b", "Lcom/avito/android/credman/o$a$a;", "Lcom/avito/android/credman/o$a$b;", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: CredmanSaver.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/o$a$a;", "Lcom/avito/android/credman/o$a;", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.credman.o$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3826a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f129102a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Exception f129103b;

            public C3826a(@Y61.l String str, @Y61.k Exception exc) {
                this.f129102a = str;
                this.f129103b = exc;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3826a)) {
                    return false;
                }
                C3826a c3826a = (C3826a) obj;
                return L.f(this.f129102a, c3826a.f129102a) && this.f129103b.equals(c3826a.f129103b);
            }

            public final int hashCode() {
                String str = this.f129102a;
                return this.f129103b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Failure(message=" + this.f129102a + ", throwable=" + this.f129103b + ')';
            }
        }

        /* compiled from: CredmanSaver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credman/o$a$b;", "Lcom/avito/android/credman/o$a;", "<init>", "()V", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f129104a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -26853244;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }
    }

    @Y61.l
    Object a(@Y61.k String str, @Y61.k String str2, @Y61.k ContinuationImpl continuationImpl);
}
