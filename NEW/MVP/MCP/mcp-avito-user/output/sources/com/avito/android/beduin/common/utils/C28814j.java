package com.avito.android.beduin.common.utils;

import android.util.LruCache;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.utils.t;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinModel;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import l41.InterfaceC43543a;

/* compiled from: BeduinRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/utils/j;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.utils.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28814j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f103525a = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LruCache<t, Integer> f103526b = new LruCache<>(300);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<RecyclerView, Q<t, io.reactivex.rxjava3.disposables.d>> f103527c = new WeakHashMap<>();

    public final void a(@Y61.k BeduinModel beduinModel, @Y61.k RecyclerView recyclerView, @Y61.k Y41.a<? extends RecyclerView.Adapter<?>> aVar) {
        t.a aVar2 = t.f103544c;
        int measuredWidth = recyclerView.getMeasuredWidth();
        aVar2.getClass();
        y.f103550a.getClass();
        final t tVar = new t(y.c.a(beduinModel), measuredWidth);
        Integer num = this.f103526b.get(tVar);
        WeakHashMap<RecyclerView, Q<t, io.reactivex.rxjava3.disposables.d>> weakHashMap = this.f103527c;
        Q<t, io.reactivex.rxjava3.disposables.d> q12 = weakHashMap.get(recyclerView);
        t tVar2 = q12 != null ? q12.f406619b : null;
        io.reactivex.rxjava3.disposables.d dVar = q12 != null ? q12.f406620c : null;
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = iIntValue;
            return;
        }
        if (L.f(tVar2, tVar)) {
            return;
        }
        if (dVar != null) {
            dVar.dispose();
        }
        weakHashMap.remove(recyclerView);
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        RecyclerView.Adapter<?> adapterInvoke = aVar.invoke();
        if (adapterInvoke != null) {
            final WeakReference weakReference = new WeakReference(recyclerView);
            io.reactivex.rxjava3.disposables.d dVarX = new C42017o(com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(this.f103525a, recyclerView, adapterInvoke, io.reactivex.rxjava3.schedulers.b.f404942b, null, 16), new InterfaceC43543a(this) { // from class: com.avito.android.beduin.common.utils.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C28814j f103519c;

                {
                    this.f103519c = this;
                }

                @Override // l41.InterfaceC43543a
                public final void run() {
                    RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
                    if (recyclerView2 != null) {
                        WeakHashMap<RecyclerView, Q<t, io.reactivex.rxjava3.disposables.d>> weakHashMap2 = this.f103519c.f103527c;
                        Q<t, io.reactivex.rxjava3.disposables.d> q13 = weakHashMap2.get(recyclerView2);
                        if (L.f(q13 != null ? q13.f406619b : null, tVar)) {
                            weakHashMap2.remove(recyclerView2);
                        }
                    }
                }
            }).x(new C28812h(this, tVar, weakReference), C28813i.f103524b);
            RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
            if (recyclerView2 != null) {
                weakHashMap.put(recyclerView2, new Q<>(tVar, dVarX));
            }
        }
    }
}
