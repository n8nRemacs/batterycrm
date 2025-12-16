package com.avito.android.credman;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;

/* compiled from: CredmanLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credman/f;", "", "a", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface f {

    /* compiled from: CredmanLoader.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/credman/f$a;", "", "a", "b", "Lcom/avito/android/credman/f$a$a;", "Lcom/avito/android/credman/f$a$b;", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: CredmanLoader.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/f$a$a;", "Lcom/avito/android/credman/f$a;", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.credman.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3825a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f129086a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Exception f129087b;

            public C3825a(@Y61.l String str, @Y61.k Exception exc) {
                this.f129086a = str;
                this.f129087b = exc;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3825a)) {
                    return false;
                }
                C3825a c3825a = (C3825a) obj;
                return L.f(this.f129086a, c3825a.f129086a) && this.f129087b.equals(c3825a.f129087b);
            }

            public final int hashCode() {
                String str = this.f129086a;
                return this.f129087b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Failure(message=" + this.f129086a + ", throwable=" + this.f129087b + ')';
            }
        }

        /* compiled from: CredmanLoader.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/f$a$b;", "Lcom/avito/android/credman/f$a;", "_avito_credman_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f129088a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f129089b;

            public b(@Y61.k String str, @Y61.k String str2) {
                this.f129088a = str;
                this.f129089b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f129088a, bVar.f129088a) && L.f(this.f129089b, bVar.f129089b);
            }

            public final int hashCode() {
                return this.f129089b.hashCode() + (this.f129088a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(login=");
                sb2.append(this.f129088a);
                sb2.append(", pass=");
                return C22026a.c(sb2, this.f129089b, ')');
            }
        }
    }

    @Y61.l
    Object a(@Y61.k Continuation<? super a> continuation);
}
