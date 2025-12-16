package Uo0;

import Vo0.InterfaceC15701b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUo0/h;", "LVo0/b;", "a", "b", "LUo0/h$a;", "LUo0/h$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h extends InterfaceC15701b {

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/h$a;", "LUo0/h;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16683a;

        public a(boolean z12) {
            this.f16683a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16683a == ((a) obj).f16683a;
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: getId */
        public final int getF16685b() {
            return -1;
        }

        @Override // Uo0.h
        @k
        /* renamed from: getSlug */
        public final String getF16686c() {
            return "customOption";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16683a);
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF16684a() {
            return this.f16683a;
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SbcCustomizePresetChip(isSelected="), this.f16683a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/h$b;", "LUo0/h;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16684a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16685b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f16686c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f16687d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f16688e;

        public b(@k String str, @k String str2, @k String str3, int i12, boolean z12) {
            this.f16684a = z12;
            this.f16685b = i12;
            this.f16686c = str;
            this.f16687d = str2;
            this.f16688e = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16684a == bVar.f16684a && this.f16685b == bVar.f16685b && L.f(this.f16686c, bVar.f16686c) && L.f(this.f16687d, bVar.f16687d) && L.f(this.f16688e, bVar.f16688e);
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: getId, reason: from getter */
        public final int getF16685b() {
            return this.f16685b;
        }

        @Override // Uo0.h
        @k
        /* renamed from: getSlug, reason: from getter */
        public final String getF16686c() {
            return this.f16686c;
        }

        public final int hashCode() {
            return this.f16688e.hashCode() + H.d(H.d(r.e(this.f16685b, Boolean.hashCode(this.f16684a) * 31, 31), 31, this.f16686c), 31, this.f16687d);
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF16684a() {
            return this.f16684a;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbcFastPresetChip(isSelected=");
            sb2.append(this.f16684a);
            sb2.append(", id=");
            sb2.append(this.f16685b);
            sb2.append(", slug=");
            sb2.append(this.f16686c);
            sb2.append(", chipTitle=");
            sb2.append(this.f16687d);
            sb2.append(", chipSubtitle=");
            return C22026a.c(sb2, this.f16688e, ')');
        }
    }

    @k
    /* renamed from: getSlug */
    String getF16686c();
}
