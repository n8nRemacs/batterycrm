package com.avito.android.photo_list_view.re23;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishPhotoListAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/f;", "Landroidx/recyclerview/widget/o$b;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC33208b> f218204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC33208b> f218205b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends InterfaceC33208b> list, List<? extends InterfaceC33208b> list2) {
        this.f218204a = list;
        this.f218205b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f218204a.get(i12), this.f218205b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return L.f(this.f218204a.get(i12).getF218068a(), this.f218205b.get(i13).getF218068a());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f218205b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f218204a.size();
    }
}
