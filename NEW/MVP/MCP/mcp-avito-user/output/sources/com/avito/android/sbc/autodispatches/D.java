package com.avito.android.sbc.autodispatches;

import Po0.C14821e;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.sbc.autodispatcheslist.AutoDispatchListInfo;
import com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TabPagerAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/D;", "Landroidx/viewpager2/adapter/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public Object f258821k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f258821k.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager2.adapter.b, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return ((C14821e) this.f258821k.get(i12)).f13303c;
    }

    @Override // androidx.viewpager2.adapter.b
    public final boolean k(long j12) {
        Iterable iterable = (Iterable) this.f258821k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((C14821e) it.next()).f13303c == j12) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager2.adapter.b
    @Y61.k
    public final Fragment l(int i12) {
        List<String> list;
        SbcAutoDispatchesListFragment.a aVar = SbcAutoDispatchesListFragment.f258990w0;
        boolean z12 = ((C14821e) this.f258821k.get(i12)).f13301a;
        aVar.getClass();
        SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment = new SbcAutoDispatchesListFragment();
        Bundle bundle = new Bundle();
        if (z12) {
            j.f258912a.getClass();
            list = j.f258913b;
        } else {
            j.f258912a.getClass();
            list = j.f258914c;
        }
        bundle.putParcelable("auto_dispatch_list_info", new AutoDispatchListInfo(z12, list));
        sbcAutoDispatchesListFragment.setArguments(bundle);
        return sbcAutoDispatchesListFragment;
    }
}
