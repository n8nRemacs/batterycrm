package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class pb6 extends y0f {
    public final Object X;
    public final Object Y;
    public final xm6 Z;
    public final /* synthetic */ int o = 0;

    public pb6(ExecutorService executorService, i62 i62Var, l53 l53Var) {
        super(executorService);
        this.X = executorService;
        this.Y = i62Var;
        this.Z = l53Var;
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 1:
                d2f d2fVar = (d2f) midVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof jc9) {
                            d2fVar.A((t98) this.d.f.get(i), ue3.P(list));
                            break;
                        }
                    }
                }
                r(d2fVar, i);
                break;
            default:
                super.s(midVar, i, list);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                if (i == hyc.oneme_folder_widget_section_view_type) {
                    return new en0(viewGroup.getContext(), (ExecutorService) this.X, (i62) this.Y);
                }
                if (i == hyc.oneme_folder_widget_section_empty_view_type) {
                    return new en0(viewGroup.getContext(), (l53) this.Z);
                }
                throw new IllegalStateException(("Not supported viewType " + i + " for " + pb6.class.getName()).toString());
            default:
                return i == j7b.D ? new d44(viewGroup.getContext(), (r8j) this.X, (ji9) this.Z) : new d44(viewGroup.getContext(), (jx0) this.Y);
        }
    }

    public pb6(ExecutorService executorService, r8j r8jVar, jx0 jx0Var, ji9 ji9Var) {
        super(executorService);
        this.X = r8jVar;
        this.Y = jx0Var;
        this.Z = ji9Var;
    }
}
