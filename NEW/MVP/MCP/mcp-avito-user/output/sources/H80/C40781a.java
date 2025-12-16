package h80;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.H;
import com.avito.android.photo_list_view.InterfaceC33207a;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupsItemTouchHelperCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh80/a;", "Landroidx/recyclerview/widget/s$d;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40781a extends C23427s.d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.b f397010d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final H f397011e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Integer f397012f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Integer f397013g;

    public C40781a(@k com.avito.android.photo_list_view_groups.b bVar, @k H h12) {
        this.f397010d = bVar;
        this.f397011e = h12;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean a(@k RecyclerView.C c12, @k RecyclerView.C c13) {
        return c13 instanceof com.avito.android.photo_list_view_groups.view_holders.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final int g(@k RecyclerView.C c12) {
        if (((InterfaceC33207a) c12).isDraggable()) {
            return C23427s.d.j(15);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean i() {
        Iterable iterable = (Iterable) this.f397010d.f218486l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof G) {
                arrayList.add(obj);
            }
        }
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!L.f(((G) it.next()).f218070c, InterfaceC33208b.InterfaceC6540b.a.f218117a)) {
                    z12 = true;
                    break;
                }
            }
        }
        return !z12;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean l(@k RecyclerView.C c12, @k RecyclerView.C c13) {
        int bindingAdapterPosition = c12.getBindingAdapterPosition();
        com.avito.android.photo_list_view_groups.b bVar = this.f397010d;
        Integer numJ = bVar.j(bindingAdapterPosition);
        Integer numJ2 = bVar.j(c13.getBindingAdapterPosition());
        if (numJ == null || numJ2 == null) {
            return false;
        }
        if (L.f(this.f397012f, numJ) && L.f(this.f397013g, numJ2)) {
            return false;
        }
        this.f397012f = numJ;
        this.f397013g = numJ2;
        this.f397011e.u(numJ.intValue(), numJ2.intValue());
        return true;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final void m(@k RecyclerView recyclerView, @k RecyclerView.C c12, @k RecyclerView.C c13, int i12, int i13, int i14) {
        recyclerView.c0();
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final void o() {
    }
}
