package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.unit.h;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013\u0012;\u0010\u001e\u001a7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/f1;", "Landroidx/compose/foundation/layout/Z0;", "", "isHorizontal", "Landroidx/compose/foundation/layout/k$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/k$m;", "verticalArrangement", "Landroidx/compose/ui/unit/h;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/p0;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "itemCount", "maxLines", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/X0;", "overflow", "", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "overflowComposables", "Lkotlin/Function2;", "Lkotlin/S;", "name", "index", "Landroidx/compose/foundation/layout/Y0;", RequestReviewResultKt.INFO_TYPE, "getComposable", "<init>", "(ZLandroidx/compose/foundation/layout/k$e;Landroidx/compose/foundation/layout/k$m;FLandroidx/compose/foundation/layout/p0;FIIILandroidx/compose/foundation/layout/X0;Ljava/util/List;LY41/r;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C20567f1 implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28605a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20585k.e f28606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20585k.m f28607c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28608d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AbstractC20606p0 f28609e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28610f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28612h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28613i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final X0 f28614j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> f28615k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Y41.r<Integer, Y0, androidx.compose.runtime.A, Integer, kotlin.G0> f28616l;

    public C20567f1() {
        throw null;
    }

    public C20567f1(boolean z12, C20585k.e eVar, C20585k.m mVar, float f12, AbstractC20606p0 abstractC20606p0, float f13, int i12, int i13, int i14, X0 x02, List list, Y41.r rVar, C42822w c42822w) {
        this.f28605a = z12;
        this.f28606b = eVar;
        this.f28607c = mVar;
        this.f28608d = f12;
        this.f28609e = abstractC20606p0;
        this.f28610f = f13;
        this.f28611g = i12;
        this.f28612h = i13;
        this.f28613i = i14;
        this.f28614j = x02;
        this.f28615k = list;
        this.f28616l = rVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20567f1)) {
            return false;
        }
        C20567f1 c20567f1 = (C20567f1) obj;
        return this.f28605a == c20567f1.f28605a && kotlin.jvm.internal.L.f(this.f28606b, c20567f1.f28606b) && kotlin.jvm.internal.L.f(this.f28607c, c20567f1.f28607c) && androidx.compose.ui.unit.h.b(this.f28608d, c20567f1.f28608d) && kotlin.jvm.internal.L.f(this.f28609e, c20567f1.f28609e) && androidx.compose.ui.unit.h.b(this.f28610f, c20567f1.f28610f) && this.f28611g == c20567f1.f28611g && this.f28612h == c20567f1.f28612h && this.f28613i == c20567f1.f28613i && kotlin.jvm.internal.L.f(this.f28614j, c20567f1.f28614j) && kotlin.jvm.internal.L.f(this.f28615k, c20567f1.f28615k) && kotlin.jvm.internal.L.f(this.f28616l, c20567f1.f28616l);
    }

    public final int hashCode() {
        int iHashCode = (this.f28607c.hashCode() + ((this.f28606b.hashCode() + (Boolean.hashCode(this.f28605a) * 31)) * 31)) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f28616l.hashCode() + androidx.compose.foundation.H.e((this.f28614j.hashCode() + androidx.appcompat.app.r.e(this.f28613i, androidx.appcompat.app.r.e(this.f28612h, androidx.appcompat.app.r.e(this.f28611g, androidx.appcompat.app.r.d(this.f28610f, (this.f28609e.hashCode() + androidx.appcompat.app.r.d(this.f28608d, iHashCode, 31)) * 31, 31), 31), 31), 31)) * 31, 31, this.f28615k);
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C20585k.m getF28607c() {
        return this.f28607c;
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final C20585k.e getF28606b() {
        return this.f28606b;
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final AbstractC20606p0 getF28609e() {
        return this.f28609e;
    }

    @Override // androidx.compose.foundation.layout.Z0
    /* renamed from: o, reason: from getter */
    public final boolean getF28605a() {
        return this.f28605a;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb2.append(this.f28605a);
        sb2.append(", horizontalArrangement=");
        sb2.append(this.f28606b);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f28607c);
        sb2.append(", mainAxisSpacing=");
        androidx.compose.foundation.H.u(this.f28608d, ", crossAxisAlignment=", sb2);
        sb2.append(this.f28609e);
        sb2.append(", crossAxisArrangementSpacing=");
        androidx.compose.foundation.H.u(this.f28610f, ", itemCount=", sb2);
        sb2.append(this.f28611g);
        sb2.append(", maxLines=");
        sb2.append(this.f28612h);
        sb2.append(", maxItemsInMainAxis=");
        sb2.append(this.f28613i);
        sb2.append(", overflow=");
        sb2.append(this.f28614j);
        sb2.append(", overflowComposables=");
        sb2.append(this.f28615k);
        sb2.append(", getComposable=");
        sb2.append(this.f28616l);
        sb2.append(')');
        return sb2.toString();
    }
}
