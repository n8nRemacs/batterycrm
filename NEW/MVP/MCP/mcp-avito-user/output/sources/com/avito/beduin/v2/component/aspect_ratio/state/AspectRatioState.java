package com.avito.beduin.v2.component.aspect_ratio.state;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.F;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AspectRatioState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState;", "Lcom/avito/beduin/v2/engine/component/c;", "Lcom/avito/beduin/v2/engine/component/F;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$a;", "Axis", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AspectRatioState implements InterfaceC36243c, F<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f335518a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f335520c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ET0.b f335521d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f335522e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f335523f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335524g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335525h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f335526i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AspectRatioState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$Axis;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Axis {

        /* renamed from: c, reason: collision with root package name */
        public static final Axis f335527c;

        /* renamed from: d, reason: collision with root package name */
        public static final Axis f335528d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Axis[] f335529e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335530f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335531b;

        static {
            Axis axis = new Axis("X", 0, "x");
            f335527c = axis;
            Axis axis2 = new Axis("Y", 1, "y");
            f335528d = axis2;
            Axis[] axisArr = {axis, axis2};
            f335529e = axisArr;
            f335530f = kotlin.enums.c.a(axisArr);
        }

        public Axis(String str, int i12, String str2) {
            this.f335531b = str2;
        }

        public static Axis valueOf(String str) {
            return (Axis) Enum.valueOf(Axis.class, str);
        }

        public static Axis[] values() {
            return (Axis[]) f335529e.clone();
        }
    }

    /* compiled from: AspectRatioState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$a;", "Lcom/avito/beduin/v2/engine/component/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC36244d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f335532a;

        public a(@Y61.k InterfaceC36249i interfaceC36249i) {
            this.f335532a = interfaceC36249i;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f335532a, ((a) obj).f335532a);
        }

        public final int hashCode() {
            return this.f335532a.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF333915a() {
            return this.f335532a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f335532a + ')';
        }
    }

    /* compiled from: AspectRatioState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f335533a;

        /* renamed from: b, reason: collision with root package name */
        public final int f335534b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Axis f335535c;

        public b(int i12, int i13, @Y61.k Axis axis) {
            this.f335533a = i12;
            this.f335534b = i13;
            this.f335535c = axis;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f335533a == bVar.f335533a && this.f335534b == bVar.f335534b && this.f335535c == bVar.f335535c;
        }

        public final int hashCode() {
            return this.f335535c.hashCode() + androidx.appcompat.app.r.e(this.f335534b, Integer.hashCode(this.f335533a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            return "Ratio(x=" + this.f335533a + ", y=" + this.f335534b + ", mainAxis=" + this.f335535c + ')';
        }
    }

    public AspectRatioState(@Y61.k r rVar, @l Y41.a<G0> aVar, @Y61.k b bVar, @l ET0.b bVar2, @l a aVar2, boolean z12, @l Y41.a<G0> aVar3, @l Y41.a<G0> aVar4, @l String str) {
        this.f335518a = rVar;
        this.f335519b = aVar;
        this.f335520c = bVar;
        this.f335521d = bVar2;
        this.f335522e = aVar2;
        this.f335523f = z12;
        this.f335524g = aVar3;
        this.f335525h = aVar4;
        this.f335526i = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f335524g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f335525h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatioState)) {
            return false;
        }
        AspectRatioState aspectRatioState = (AspectRatioState) obj;
        return L.f(this.f335518a, aspectRatioState.f335518a) && L.f(this.f335519b, aspectRatioState.f335519b) && L.f(this.f335520c, aspectRatioState.f335520c) && L.f(this.f335521d, aspectRatioState.f335521d) && L.f(this.f335522e, aspectRatioState.f335522e) && this.f335523f == aspectRatioState.f335523f && L.f(this.f335524g, aspectRatioState.f335524g) && L.f(this.f335525h, aspectRatioState.f335525h) && L.f(this.f335526i, aspectRatioState.f335526i);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF335051l() {
        return this.f335526i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335048i() {
        return this.f335523f;
    }

    public final int hashCode() {
        int iHashCode = this.f335518a.hashCode() * 31;
        Y41.a<G0> aVar = this.f335519b;
        int iHashCode2 = (this.f335520c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        ET0.b bVar = this.f335521d;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar2 = this.f335522e;
        int i12 = androidx.appcompat.app.r.i((iHashCode3 + (aVar2 == null ? 0 : aVar2.f335532a.hashCode())) * 31, 31, this.f335523f);
        Y41.a<G0> aVar3 = this.f335524g;
        int iHashCode4 = (i12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f335525h;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.f335526i;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AspectRatioState(backgroundColor=");
        sb2.append(this.f335518a);
        sb2.append(", onClick=");
        sb2.append(this.f335519b);
        sb2.append(", ratio=");
        sb2.append(this.f335520c);
        sb2.append(", padding=");
        sb2.append(this.f335521d);
        sb2.append(", child=");
        sb2.append(this.f335522e);
        sb2.append(", visible=");
        sb2.append(this.f335523f);
        sb2.append(", onShow=");
        sb2.append(this.f335524g);
        sb2.append(", onHide=");
        sb2.append(this.f335525h);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335526i, ')');
    }
}
