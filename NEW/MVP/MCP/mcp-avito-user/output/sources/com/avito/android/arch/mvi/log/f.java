package com.avito.android.arch.mvi.log;

import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeatureValueType.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/arch/mvi/log/f;", "", "a", "b", "c", "d", "Lcom/avito/android/arch/mvi/log/f$a;", "Lcom/avito/android/arch/mvi/log/f$b;", "Lcom/avito/android/arch/mvi/log/f$c;", "Lcom/avito/android/arch/mvi/log/f$d;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f {

    /* compiled from: FeatureValueType.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/log/f$a;", "Lcom/avito/android/arch/mvi/log/f;", "name", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f91987a;

        private /* synthetic */ a(String str) {
            this.f91987a = str;
        }

        public static final /* synthetic */ a a(String str) {
            return new a(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return L.f(this.f91987a, ((a) obj).f91987a);
            }
            return false;
        }

        @Override // com.avito.android.arch.mvi.log.f
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF91990a() {
            return this.f91987a;
        }

        public final int hashCode() {
            return this.f91987a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("Action(name="), this.f91987a, ')');
        }
    }

    /* compiled from: FeatureValueType.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/log/f$b;", "Lcom/avito/android/arch/mvi/log/f;", "name", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f91988a;

        private /* synthetic */ b(String str) {
            this.f91988a = str;
        }

        public static final /* synthetic */ b a(String str) {
            return new b(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return L.f(this.f91988a, ((b) obj).f91988a);
            }
            return false;
        }

        @Override // com.avito.android.arch.mvi.log.f
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF91990a() {
            return this.f91988a;
        }

        public final int hashCode() {
            return this.f91988a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("Event(name="), this.f91988a, ')');
        }
    }

    /* compiled from: FeatureValueType.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/log/f$c;", "Lcom/avito/android/arch/mvi/log/f;", "name", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f91989a;

        private /* synthetic */ c(String str) {
            this.f91989a = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return L.f(this.f91989a, ((c) obj).f91989a);
            }
            return false;
        }

        @Override // com.avito.android.arch.mvi.log.f
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF91990a() {
            return this.f91989a;
        }

        public final int hashCode() {
            return this.f91989a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("Internal(name="), this.f91989a, ')');
        }
    }

    /* compiled from: FeatureValueType.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/log/f$d;", "Lcom/avito/android/arch/mvi/log/f;", "name", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f91990a;

        private /* synthetic */ d(String str) {
            this.f91990a = str;
        }

        public static final /* synthetic */ d a(String str) {
            return new d(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return L.f(this.f91990a, ((d) obj).f91990a);
            }
            return false;
        }

        @Override // com.avito.android.arch.mvi.log.f
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF91990a() {
            return this.f91990a;
        }

        public final int hashCode() {
            return this.f91990a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("State(name="), this.f91990a, ')');
        }
    }

    @k
    /* renamed from: getName */
    String getF91990a();
}
