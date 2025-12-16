package com.avito.android.seller_coach.all_advices.vm;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AllAdvicesViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/seller_coach/all_advices/vm/a$a;", "Lcom/avito/android/seller_coach/all_advices/vm/a$b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/a$a;", "Lcom/avito/android/seller_coach/all_advices/vm/a;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_coach.all_advices.vm.a$a, reason: collision with other inner class name */
    public static final class C7988a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C7988a f267436a = new C7988a();

        public C7988a() {
            super(null);
        }
    }

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/a$b;", "Lcom/avito/android/seller_coach/all_advices/vm/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f267437a;

        public b(@k String str) {
            super(null);
            this.f267437a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f267437a, ((b) obj).f267437a);
        }

        public final int hashCode() {
            return this.f267437a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenHintDetail(hintId="), this.f267437a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
