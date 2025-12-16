package com.avito.android.photo_list_view_groups;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupsImageListAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/c;", "Landroidx/recyclerview/widget/o$b;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f218540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f218541b;

    public c(ArrayList arrayList, List list) {
        this.f218540a = list;
        this.f218541b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f218540a.get(i12), this.f218541b.get(i13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return L.f(((InterfaceC33208b) this.f218540a.get(i12)).getF218068a(), ((InterfaceC33208b) this.f218541b.get(i13)).getF218068a());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f218541b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f218540a.size();
    }
}
