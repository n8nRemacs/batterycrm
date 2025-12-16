package Av0;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceTransportationCardSelectDiffUtil.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAv0/c;", "Landroidx/recyclerview/widget/o$b;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Av0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13087c extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f677a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f678b;

    public C13087c(@k List<C13088d> list, @k List<C13088d> list2) {
        this.f677a = list;
        this.f678b = list2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f678b.get(i13), this.f677a.get(i12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return ((C13088d) this.f678b.get(i13)).f682d == ((C13088d) this.f677a.get(i12)).f682d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f678b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f677a.size();
    }
}
