package y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42165v;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsItem.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ly10/a;", "", "a", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50036a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f442836a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C12884a> f442837b;

    public C50036a(@k PrintableText printableText, @k List<C12884a> list) {
        this.f442836a = printableText;
        this.f442837b = list;
    }

    public final long a() {
        Object next;
        List<C12884a> list = this.f442837b;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C12884a) next).f442840d) {
                break;
            }
        }
        C12884a c12884a = (C12884a) next;
        if (c12884a != null) {
            return c12884a.f442839c;
        }
        C12884a c12884a2 = (C12884a) C42745f0.G(list);
        if (c12884a2 != null) {
            return c12884a2.f442839c;
        }
        return 0L;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50036a)) {
            return false;
        }
        C50036a c50036a = (C50036a) obj;
        return L.f(this.f442836a, c50036a.f442836a) && L.f(this.f442837b, c50036a.f442837b);
    }

    public final int hashCode() {
        return this.f442837b.hashCode() + (this.f442836a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsItem(title=");
        sb2.append(this.f442836a);
        sb2.append(", chips=");
        return H.p(sb2, this.f442837b, ')');
    }

    /* compiled from: ChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/a$a;", "Lcom/akita/compose/component/chips/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12884a implements InterfaceC27333b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f442838b;

        /* renamed from: c, reason: collision with root package name */
        public final long f442839c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f442840d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f442841e;

        public C12884a(long j12, @k String str, boolean z12, boolean z13) {
            this.f442838b = str;
            this.f442839c = j12;
            this.f442840d = z12;
            this.f442841e = z13;
        }

        public static C12884a a(C12884a c12884a, boolean z12) {
            return new C12884a(c12884a.f442839c, c12884a.f442838b, z12, c12884a.f442841e);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        /* renamed from: c */
        public final Integer getF60871f() {
            return null;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        /* renamed from: d */
        public final Integer getF60870e() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12884a)) {
                return false;
            }
            C12884a c12884a = (C12884a) obj;
            return L.f(this.f442838b, c12884a.f442838b) && this.f442839c == c12884a.f442839c && this.f442840d == c12884a.f442840d && this.f442841e == c12884a.f442841e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF3706b() {
            return this.f442838b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f442841e) + r.i(r.g(this.f442838b.hashCode() * 31, 31, this.f442839c), 31, this.f442840d);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isActive */
        public final boolean getF99070e() {
            return true;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isEnabled, reason: from getter */
        public final boolean getF3709e() {
            return this.f442841e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF3708d() {
            return this.f442840d;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(title=");
            sb2.append(this.f442838b);
            sb2.append(", value=");
            sb2.append(this.f442839c);
            sb2.append(", isSelected=");
            sb2.append(this.f442840d);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f442841e, ')');
        }

        public /* synthetic */ C12884a(String str, long j12, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(j12, str, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13);
        }
    }
}
