package com.avito.android.profile_settings_extended;

import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc0.n;

/* compiled from: ExtendedProfileSettingsItemTouchCallback.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/z;", "Landroidx/recyclerview/widget/s$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33512z extends C23427s.d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.n, G0> f230843d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public RecyclerView.C f230844e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public RecyclerView.C f230845f;

    /* JADX WARN: Multi-variable type inference failed */
    public C33512z(@Y61.k Y41.l<? super yc0.n, G0> lVar) {
        this.f230843d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean a(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar = c12 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g ? (com.avito.android.profile_settings_extended.adapter.gallery.image.g) c12 : null;
        String f229443f = gVar != null ? gVar.getF229443f() : null;
        com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar2 = c13 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g ? (com.avito.android.profile_settings_extended.adapter.gallery.image.g) c13 : null;
        return kotlin.jvm.internal.L.f(f229443f, gVar2 != null ? gVar2.getF229443f() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.C23427s.d
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.C b(@Y61.k androidx.recyclerview.widget.RecyclerView.C r6, @Y61.k java.util.ArrayList r7, int r8, int r9) {
        /*
            r5 = this;
            android.view.View r0 = r6.itemView
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            android.view.View r1 = r6.itemView
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r7.next()
            r3 = r2
            androidx.recyclerview.widget.RecyclerView$C r3 = (androidx.recyclerview.widget.RecyclerView.C) r3
            android.view.View r4 = r3.itemView
            float r4 = r4.getY()
            int r4 = (int) r4
            int r4 = r9 - r4
            if (r4 >= 0) goto L30
            int r4 = -r4
            if (r4 >= r0) goto L14
            goto L32
        L30:
            if (r4 >= r0) goto L14
        L32:
            android.view.View r3 = r3.itemView
            float r3 = r3.getX()
            int r3 = (int) r3
            int r3 = r8 - r3
            if (r3 >= 0) goto L41
            int r3 = -r3
            if (r3 >= r1) goto L14
            goto L45
        L41:
            if (r3 >= r1) goto L14
            goto L45
        L44:
            r2 = 0
        L45:
            androidx.recyclerview.widget.RecyclerView$C r2 = (androidx.recyclerview.widget.RecyclerView.C) r2
            if (r2 != 0) goto L4a
            goto L4b
        L4a:
            r6 = r2
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.C33512z.b(androidx.recyclerview.widget.RecyclerView$C, java.util.ArrayList, int, int):androidx.recyclerview.widget.RecyclerView$C");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final void c(@Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.C c12) {
        RecyclerView.C c13;
        String f229444g;
        String f229443f;
        String f229444g2;
        super.c(recyclerView, c12);
        RecyclerView.C c14 = this.f230844e;
        Y41.l<yc0.n, G0> lVar = this.f230843d;
        if (c14 != null && (c13 = this.f230845f) != null && !c14.equals(c13)) {
            boolean z12 = c12 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g;
            com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar = z12 ? (com.avito.android.profile_settings_extended.adapter.gallery.image.g) c12 : null;
            if (gVar == null || (f229444g = gVar.getF229444g()) == null) {
                return;
            }
            com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar2 = z12 ? (com.avito.android.profile_settings_extended.adapter.gallery.image.g) c12 : null;
            if (gVar2 == null || (f229443f = gVar2.getF229443f()) == null) {
                return;
            }
            Object obj = this.f230845f;
            com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar3 = obj instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g ? (com.avito.android.profile_settings_extended.adapter.gallery.image.g) obj : null;
            if (gVar3 == null || (f229444g2 = gVar3.getF229444g()) == null) {
                return;
            }
            n.d dVar = new n.d(f229443f, f229444g, f229444g2);
            C c15 = (C) lVar;
            c15.invoke(dVar);
            try {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(this.f230844e.getBindingAdapterPosition());
                }
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(this.f230845f.getBindingAdapterPosition());
                }
            } catch (Exception e12) {
                V2.f318762a.f(e12);
            }
            c15.invoke(new n.b(f229443f));
        }
        this.f230845f = null;
        this.f230844e = null;
        ((C) lVar).invoke(n.a.f443313a);
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final long f(int i12, @Y61.k RecyclerView recyclerView) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final int g(@Y61.k RecyclerView.C c12) {
        if (c12 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g) {
            return C23427s.d.j(15);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean l(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        this.f230845f = c13;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final void n(@Y61.l RecyclerView.C c12, int i12) {
        super.n(c12, i12);
        if (c12 == 0 || !(c12 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g)) {
            return;
        }
        this.f230844e = c12;
        com.avito.android.profile_settings_extended.adapter.gallery.image.g gVar = (com.avito.android.profile_settings_extended.adapter.gallery.image.g) c12;
        ((C) this.f230843d).invoke(new n.c((int) c12.itemView.getX(), gVar.getF229443f(), gVar.getF229444g(), (int) c12.itemView.getY(), c12.itemView.getWidth(), c12.itemView.getHeight()));
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final void o() {
    }
}
