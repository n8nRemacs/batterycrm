package com.avito.android.seller_coach.all_advices.vm;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AllAdvicesViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/d;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/seller_coach/all_advices/vm/d$a;", "Lcom/avito/android/seller_coach/all_advices/vm/d$b;", "Lcom/avito/android/seller_coach/all_advices/vm/d$c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/d$a;", "Lcom/avito/android/seller_coach/all_advices/vm/d;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f267457a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f267458b;

        public a(@l ApiError apiError, @k String str) {
            super(null);
            this.f267457a = str;
            this.f267458b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f267457a, aVar.f267457a) && L.f(this.f267458b, aVar.f267458b);
        }

        public final int hashCode() {
            int iHashCode = this.f267457a.hashCode() * 31;
            ApiError apiError = this.f267458b;
            return iHashCode + (apiError == null ? 0 : apiError.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f267457a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f267458b, ')');
        }

        public /* synthetic */ a(String str, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, str);
        }
    }

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/d$b;", "Lcom/avito/android/seller_coach/all_advices/vm/d;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f267459a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267460b;

        public b(@k ArrayList arrayList, @k String str) {
            super(null);
            this.f267459a = arrayList;
            this.f267460b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f267459a, bVar.f267459a) && L.f(this.f267460b, bVar.f267460b);
        }

        public final int hashCode() {
            return this.f267460b.hashCode() + (this.f267459a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(hints=");
            sb2.append(this.f267459a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f267460b, ')');
        }
    }

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/d$c;", "Lcom/avito/android/seller_coach/all_advices/vm/d;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f267461a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1576459554;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
