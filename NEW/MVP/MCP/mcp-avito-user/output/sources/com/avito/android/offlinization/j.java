package com.avito.android.offlinization;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfflineInfoExtractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/j;", "", "a", "b", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface j {

    /* compiled from: OfflineInfoExtractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/j$a;", "Lcom/avito/android/offlinization/j;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f208587a;

        public a(@Y61.k String str) {
            this.f208587a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f208587a, ((a) obj).f208587a);
        }

        @Override // com.avito.android.offlinization.j
        @Y61.k
        /* renamed from: getValue, reason: from getter */
        public final String getF208588a() {
            return this.f208587a;
        }

        public final int hashCode() {
            return this.f208587a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Regular(value="), this.f208587a, ')');
        }
    }

    /* compiled from: OfflineInfoExtractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/j$b;", "Lcom/avito/android/offlinization/j;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f208588a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f208589b;

        public b(@Y61.k String str, @Y61.k String str2) {
            this.f208588a = str;
            this.f208589b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f208588a, bVar.f208588a) && L.f(this.f208589b, bVar.f208589b);
        }

        @Override // com.avito.android.offlinization.j
        @Y61.k
        /* renamed from: getValue, reason: from getter */
        public final String getF208588a() {
            return this.f208588a;
        }

        public final int hashCode() {
            return this.f208589b.hashCode() + (this.f208588a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WithDefault(value=");
            sb2.append(this.f208588a);
            sb2.append(", defaultValue=");
            return C22026a.c(sb2, this.f208589b, ')');
        }
    }

    @Y61.k
    /* renamed from: getValue */
    String getF208588a();
}
