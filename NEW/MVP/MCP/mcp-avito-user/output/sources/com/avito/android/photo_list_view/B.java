package com.avito.android.photo_list_view;

import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ItemTouchHelperCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/B;", "Landroidx/recyclerview/widget/s$d;", "_avito_photo-drag-n-drop_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B extends C23427s.d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f218063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Integer f218064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f218065f;

    public B(@Y61.k H h12) {
        this.f218063d = h12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean a(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        return ((InterfaceC33207a) c13).isDraggable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C23427s.d
    public final int g(@Y61.k RecyclerView.C c12) {
        if (((InterfaceC33207a) c12).isDraggable()) {
            return C23427s.d.j(15);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean l(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        Integer num = this.f218064e;
        int adapterPosition = c12.getAdapterPosition();
        if (num != null && num.intValue() == adapterPosition) {
            Integer num2 = this.f218065f;
            int adapterPosition2 = c13.getAdapterPosition();
            if (num2 != null && num2.intValue() == adapterPosition2) {
                return true;
            }
        }
        this.f218064e = Integer.valueOf(c12.getAdapterPosition());
        this.f218065f = Integer.valueOf(c13.getAdapterPosition());
        this.f218063d.u(c12.getAdapterPosition(), c13.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final void o() {
        throw new RuntimeException();
    }
}
