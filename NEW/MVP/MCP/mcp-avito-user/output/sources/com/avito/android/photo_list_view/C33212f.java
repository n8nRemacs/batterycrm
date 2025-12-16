package com.avito.android.photo_list_view;

import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImageListAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/f;", "Landroidx/recyclerview/widget/o$b;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33212f extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C33210d f218166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC33208b> f218167b;

    /* JADX WARN: Multi-variable type inference failed */
    public C33212f(C33210d c33210d, List<? extends InterfaceC33208b> list) {
        this.f218166a = c33210d;
        this.f218167b = list;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return kotlin.jvm.internal.L.f(this.f218166a.f218161c.get(i12), this.f218167b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return kotlin.jvm.internal.L.f(this.f218166a.f218161c.get(i12).getF218092a(), this.f218167b.get(i13).getF218092a());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f218167b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f218166a.f218161c.size();
    }
}
