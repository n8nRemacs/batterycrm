package GY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsFilterHeaderChip.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGY/a;", "Lcom/avito/android/lib/design/chips/h;", "a", "b", "LGY/a$a;", "LGY/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public final int f6555b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6556c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f6557d;

    /* compiled from: ChannelsFilterHeaderChip.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGY/a$a;", "LGY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GY.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0355a extends a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f6558e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f6559f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6560g;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0355a(String str, boolean z12, int i12, int i13, C42822w c42822w) {
            i12 = (i13 & 4) != 0 ? 1 : i12;
            super(i12, z12, str, null);
            this.f6558e = str;
            this.f6559f = z12;
            this.f6560g = i12;
        }

        @Override // GY.a, com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF278901b() {
            return this.f6558e;
        }

        @Override // GY.a
        @k
        /* renamed from: a, reason: from getter */
        public final String getF178768h() {
            return this.f6558e;
        }

        @Override // GY.a
        /* renamed from: b, reason: from getter */
        public final int getF6555b() {
            return this.f6560g;
        }

        @Override // GY.a
        /* renamed from: c, reason: from getter */
        public final boolean getF6556c() {
            return this.f6559f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0355a)) {
                return false;
            }
            C0355a c0355a = (C0355a) obj;
            return L.f(this.f6558e, c0355a.f6558e) && this.f6559f == c0355a.f6559f && this.f6560g == c0355a.f6560g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6560g) + r.i(this.f6558e.hashCode() * 31, 31, this.f6559f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("All(chipTitle=");
            sb2.append(this.f6558e);
            sb2.append(", isSelected=");
            sb2.append(this.f6559f);
            sb2.append(", id=");
            return r.t(sb2, this.f6560g, ')');
        }
    }

    /* compiled from: ChannelsFilterHeaderChip.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGY/a$b;", "LGY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f6561e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f6562f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6563g;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(String str, boolean z12, int i12, int i13, C42822w c42822w) {
            i12 = (i13 & 4) != 0 ? 2 : i12;
            super(i12, z12, str, null);
            this.f6561e = str;
            this.f6562f = z12;
            this.f6563g = i12;
        }

        @Override // GY.a, com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF278901b() {
            return this.f6561e;
        }

        @Override // GY.a
        @k
        /* renamed from: a, reason: from getter */
        public final String getF178768h() {
            return this.f6561e;
        }

        @Override // GY.a
        /* renamed from: b, reason: from getter */
        public final int getF6555b() {
            return this.f6563g;
        }

        @Override // GY.a
        /* renamed from: c, reason: from getter */
        public final boolean getF6556c() {
            return this.f6562f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f6561e, bVar.f6561e) && this.f6562f == bVar.f6562f && this.f6563g == bVar.f6563g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6563g) + r.i(this.f6561e.hashCode() * 31, 31, this.f6562f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Unread(chipTitle=");
            sb2.append(this.f6561e);
            sb2.append(", isSelected=");
            sb2.append(this.f6562f);
            sb2.append(", id=");
            return r.t(sb2, this.f6563g, ')');
        }
    }

    public a(int i12, boolean z12, String str, C42822w c42822w) {
        this.f6555b = i12;
        this.f6556c = z12;
        this.f6557d = str;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        return (obj instanceof a) && getF6555b() == ((a) obj).getF6555b();
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
    public String getF278901b() {
        return this.f6557d;
    }

    /* renamed from: b, reason: from getter */
    public int getF6555b() {
        return this.f6555b;
    }

    /* renamed from: c, reason: from getter */
    public boolean getF6556c() {
        return this.f6556c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF178766f() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF178769i() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }
}
