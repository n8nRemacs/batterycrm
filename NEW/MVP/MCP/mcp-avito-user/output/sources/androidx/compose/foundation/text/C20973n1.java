package androidx.compose.foundation.text;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: KeyboardActions.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/n1;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20973n1 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f31742g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C20973n1 f31743h = new C20973n1(null, null, null, null, null, null, 63, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31744a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31746c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31747d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31748e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC20969m1, kotlin.G0> f31749f;

    /* compiled from: KeyboardActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/n1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.n1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C20973n1() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20973n1)) {
            return false;
        }
        C20973n1 c20973n1 = (C20973n1) obj;
        return this.f31744a == c20973n1.f31744a && this.f31745b == c20973n1.f31745b && this.f31746c == c20973n1.f31746c && this.f31747d == c20973n1.f31747d && this.f31748e == c20973n1.f31748e && this.f31749f == c20973n1.f31749f;
    }

    public final int hashCode() {
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar = this.f31744a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar2 = this.f31745b;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar3 = this.f31746c;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar4 = this.f31747d;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar5 = this.f31748e;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        Y41.l<InterfaceC20969m1, kotlin.G0> lVar6 = this.f31749f;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    public C20973n1(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5, Y41.l lVar6, int i12, C42822w c42822w) {
        lVar = (i12 & 1) != 0 ? null : lVar;
        lVar2 = (i12 & 2) != 0 ? null : lVar2;
        lVar3 = (i12 & 4) != 0 ? null : lVar3;
        lVar4 = (i12 & 8) != 0 ? null : lVar4;
        lVar5 = (i12 & 16) != 0 ? null : lVar5;
        lVar6 = (i12 & 32) != 0 ? null : lVar6;
        this.f31744a = lVar;
        this.f31745b = lVar2;
        this.f31746c = lVar3;
        this.f31747d = lVar4;
        this.f31748e = lVar5;
        this.f31749f = lVar6;
    }
}
