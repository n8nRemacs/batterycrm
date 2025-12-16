package com.avito.android.beduin.view.recyclerview;

import Y61.k;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import com.avito.android.util.D6;
import gj.InterfaceC40691b;
import gj.i;
import gj.l;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import lj.InterfaceC43779a;

/* compiled from: ScrollHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/view/recyclerview/e;", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<io.reactivex.rxjava3.disposables.d> f105202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z<com.avito.android.beduin_shared.model.action.custom.d> f105203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f105204d;

    /* compiled from: ScrollHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/d;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin_shared/model/action/custom/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f105205b;

        public a(f fVar) {
            this.f105205b = fVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12;
            com.avito.android.beduin.common.form.store.b f103565k;
            InterfaceC43779a interfaceC43779a;
            RecyclerView recyclerViewB0;
            com.avito.android.beduin_shared.model.action.custom.d dVar = (com.avito.android.beduin_shared.model.action.custom.d) obj;
            boolean z12 = dVar instanceof com.avito.android.beduin_shared.model.action.custom.e;
            f fVar = this.f105205b;
            ActivityC22955m activityC22955m = fVar.f105206a;
            l lVar = fVar.f105208c;
            i iVar = fVar.f105207b;
            if (!z12) {
                if (dVar instanceof com.avito.android.beduin_shared.model.action.custom.f) {
                    com.avito.android.beduin_shared.model.action.custom.f fVar2 = (com.avito.android.beduin_shared.model.action.custom.f) dVar;
                    RecyclerView recyclerViewB02 = iVar.B0(fVar2.f105293a);
                    if (recyclerViewB02 == null || (i12 = fVar2.f105294b) == -1) {
                        return;
                    }
                    recyclerViewB02.o(new c(fVar, i12, fVar2));
                    g gVar = new g(activityC22955m, BeduinScrollPosition.f105283f, lVar != null ? lVar.f396760d : null);
                    gVar.f53878a = i12;
                    RecyclerView.m layoutManager = recyclerViewB02.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.x1(gVar);
                        return;
                    }
                    return;
                }
                return;
            }
            com.avito.android.beduin_shared.model.action.custom.e eVar = (com.avito.android.beduin_shared.model.action.custom.e) dVar;
            String strM0 = eVar.f105288a;
            if (strM0 == null) {
                strM0 = iVar.m0();
            }
            InterfaceC40691b interfaceC40691b = fVar.f105209d;
            if (interfaceC40691b == null || (f103565k = interfaceC40691b.getF103565k()) == null || (interfaceC43779a = f103565k.get(strM0)) == null) {
                return;
            }
            Iterator it = interfaceC43779a.a().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (L.f(((BeduinModel) it.next()).getId(), eVar.f105289b)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 == -1 || (recyclerViewB0 = iVar.B0(strM0)) == null) {
                return;
            }
            if (!eVar.f105290c) {
                RecyclerView.m layoutManager2 = recyclerViewB0.getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.l1(i13);
                }
                D6.C(new d(recyclerViewB0, i13, eVar), recyclerViewB0);
                recyclerViewB0.addOnLayoutChangeListener(new com.avito.android.beduin.view.recyclerview.a(fVar, recyclerViewB0, i13, eVar));
                return;
            }
            recyclerViewB0.o(new b(fVar, i13, eVar));
            g gVar2 = new g(activityC22955m, eVar.f105291d, lVar != null ? lVar.f396760d : null);
            gVar2.f53878a = i13;
            RecyclerView.m layoutManager3 = recyclerViewB0.getLayoutManager();
            if (layoutManager3 != null) {
                layoutManager3.x1(gVar2);
            }
        }
    }

    public e(l0.h<io.reactivex.rxjava3.disposables.d> hVar, z<com.avito.android.beduin_shared.model.action.custom.d> zVar, f fVar) {
        this.f105202b = hVar;
        this.f105203c = zVar;
        this.f105204d = fVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@k InterfaceC22983P interfaceC22983P) {
        l0.h<io.reactivex.rxjava3.disposables.d> hVar = this.f105202b;
        io.reactivex.rxjava3.disposables.d dVar = hVar.f406842b;
        if (dVar != null) {
            dVar.dispose();
        }
        hVar.f406842b = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, io.reactivex.rxjava3.disposables.d] */
    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@k InterfaceC22983P interfaceC22983P) {
        this.f105202b.f406842b = this.f105203c.t0(new a(this.f105204d));
    }
}
