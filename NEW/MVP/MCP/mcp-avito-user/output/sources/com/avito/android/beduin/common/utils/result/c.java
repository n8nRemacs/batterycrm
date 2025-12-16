package com.avito.android.beduin.common.utils.result;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinContainerWithRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<RecyclerView.Adapter<?>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<e> f103537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f103538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f103539n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WeakReference weakReference, ArrayList arrayList, int i12) {
        super(0);
        this.f103537l = weakReference;
        this.f103538m = arrayList;
        this.f103539n = i12;
    }

    @Override // Y41.a
    public final RecyclerView.Adapter<?> invoke() {
        e eVar = this.f103537l.get();
        if (eVar == null) {
            return null;
        }
        return eVar.a(this.f103539n, this.f103538m);
    }
}
