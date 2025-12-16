package com.avito.android.edit_carousel;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import kotlin.Metadata;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselItemTouchCallback.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/h;", "Landroidx/recyclerview/widget/s$d;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends C23427s.d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i f146415d;

    /* compiled from: EditCarouselItemTouchCallback.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/h$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public h(@Y61.k i iVar) {
        this.f146415d = iVar;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean a(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        return c13 instanceof com.avito.android.edit_carousel.adapter.advert.m;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final int g(@Y61.k RecyclerView.C c12) {
        if ((c12 instanceof com.avito.android.edit_carousel.adapter.advert.m) && this.f146415d.getState().getValue().f146489e == EditCarouselState.Mode.f146491b) {
            return C23427s.d.j(3);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final boolean l(@Y61.k RecyclerView.C c12, @Y61.k RecyclerView.C c13) {
        int bindingAdapterPosition = c12.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c13.getBindingAdapterPosition();
        i iVar = this.f146415d;
        iVar.getClass();
        iVar.accept(new InterfaceC48738a.l(bindingAdapterPosition, bindingAdapterPosition2));
        return true;
    }

    @Override // androidx.recyclerview.widget.C23427s.d
    public final void o() {
    }
}
