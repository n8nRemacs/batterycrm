package com.avito.android.seller_coach.hints_dialog.vm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HintDialogViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/h;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/seller_coach/hints_dialog/vm/h$a;", "Lcom/avito/android/seller_coach/hints_dialog/vm/h$b;", "Lcom/avito/android/seller_coach/hints_dialog/vm/h$c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h {

    /* compiled from: HintDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/h$a;", "Lcom/avito/android/seller_coach/hints_dialog/vm/h;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f267616a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f267617b;

        public a(@l ApiError apiError, @k String str) {
            super(null);
            this.f267616a = str;
            this.f267617b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f267616a, aVar.f267616a) && L.f(this.f267617b, aVar.f267617b);
        }

        public final int hashCode() {
            int iHashCode = this.f267616a.hashCode() * 31;
            ApiError apiError = this.f267617b;
            return iHashCode + (apiError == null ? 0 : apiError.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f267616a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f267617b, ')');
        }

        public /* synthetic */ a(String str, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, str);
        }
    }

    /* compiled from: HintDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/h$b;", "Lcom/avito/android/seller_coach/hints_dialog/vm/h;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f267618a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final g f267619b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f267620c;

        public b(@k ArrayList arrayList, @l g gVar, boolean z12) {
            super(null);
            this.f267618a = arrayList;
            this.f267619b = gVar;
            this.f267620c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f267618a, bVar.f267618a) && L.f(this.f267619b, bVar.f267619b) && this.f267620c == bVar.f267620c;
        }

        public final int hashCode() {
            int iHashCode = this.f267618a.hashCode() * 31;
            g gVar = this.f267619b;
            return Boolean.hashCode(this.f267620c) + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(hint=");
            sb2.append(this.f267618a);
            sb2.append(", simpleHint=");
            sb2.append(this.f267619b);
            sb2.append(", hasMenu=");
            return r.x(sb2, this.f267620c, ')');
        }
    }

    /* compiled from: HintDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/h$c;", "Lcom/avito/android/seller_coach/hints_dialog/vm/h;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f267621a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ h(C42822w c42822w) {
        this();
    }

    public h() {
    }
}
