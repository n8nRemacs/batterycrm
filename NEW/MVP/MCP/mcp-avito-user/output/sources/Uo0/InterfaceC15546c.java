package Uo0;

import Vo0.InterfaceC15701b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUo0/c;", "LVo0/b;", "a", "b", "LUo0/c$a;", "LUo0/c$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15546c extends InterfaceC15701b {

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/c$a;", "LUo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.c$a */
    public static final /* data */ class a implements InterfaceC15546c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16602a;

        public a(boolean z12) {
            this.f16602a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16602a == ((a) obj).f16602a;
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: getId */
        public final int getF16604b() {
            return -1;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16602a);
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF16603a() {
            return this.f16602a;
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CustomPreset(isSelected="), this.f16602a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/c$b;", "LUo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.c$b */
    public static final /* data */ class b implements InterfaceC15546c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16603a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16604b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16605c;

        /* renamed from: d, reason: collision with root package name */
        public final long f16606d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final To0.e f16607e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f16608f;

        public b(boolean z12, int i12, long j12, long j13, @k To0.e eVar, boolean z13) {
            this.f16603a = z12;
            this.f16604b = i12;
            this.f16605c = j12;
            this.f16606d = j13;
            this.f16607e = eVar;
            this.f16608f = z13;
        }

        public static b a(b bVar, boolean z12) {
            int i12 = bVar.f16604b;
            long j12 = bVar.f16605c;
            long j13 = bVar.f16606d;
            To0.e eVar = bVar.f16607e;
            boolean z13 = bVar.f16608f;
            bVar.getClass();
            return new b(z12, i12, j12, j13, eVar, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16603a == bVar.f16603a && this.f16604b == bVar.f16604b && this.f16605c == bVar.f16605c && this.f16606d == bVar.f16606d && L.f(this.f16607e, bVar.f16607e) && this.f16608f == bVar.f16608f;
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: getId, reason: from getter */
        public final int getF16604b() {
            return this.f16604b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16608f) + ((this.f16607e.hashCode() + r.g(r.g(r.e(this.f16604b, Boolean.hashCode(this.f16603a) * 31, 31), 31, this.f16605c), 31, this.f16606d)) * 31);
        }

        @Override // Vo0.InterfaceC15701b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF16603a() {
            return this.f16603a;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeneralPreset(isSelected=");
            sb2.append(this.f16603a);
            sb2.append(", id=");
            sb2.append(this.f16604b);
            sb2.append(", recommendedBudget=");
            sb2.append(this.f16605c);
            sb2.append(", ttlDays=");
            sb2.append(this.f16606d);
            sb2.append(", predictedRecipients=");
            sb2.append(this.f16607e);
            sb2.append(", isRecommended=");
            return r.x(sb2, this.f16608f, ')');
        }
    }
}
