package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class r40 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r40(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    private final void n(View view) {
    }

    private final void o(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tp4 tp4Var;
        int i = this.a;
        Object obj = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                s40 s40Var = (s40) this.b;
                x9f x9fVar = s40Var.Q0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    m40 m40Var = (m40) obj;
                    s40Var.Q0 = gw0.w(new g56(gw0.m(new z41(m40Var.j, m40Var.k, new p40(3, null), 3)), new q40(s40Var, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 1:
                wq0 wq0Var = (wq0) this.b;
                if (wq0Var.c == null) {
                    wq0Var.c = Build.VERSION.SDK_INT >= 31 ? new ulc(1) : new z0g((Context) obj);
                }
                wq0Var.b(wq0Var.b);
                break;
            case 2:
                pj2 pj2Var = (pj2) this.b;
                x9f x9fVar2 = pj2Var.K0;
                if (x9fVar2 == null || !x9fVar2.isActive()) {
                    pj2Var.K0 = gw0.w(new g56((x26) obj, new nj2(pj2Var, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 3:
                pj2 pj2Var2 = (pj2) this.b;
                x9f x9fVar3 = pj2Var2.L0;
                if (x9fVar3 == null || !x9fVar3.isActive()) {
                    pj2Var2.L0 = gw0.w(new g56((mcf) obj, new oj2(pj2Var2, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 4:
                fn2 fn2Var = (fn2) this.b;
                x9f x9fVar4 = fn2Var.J0;
                if (x9fVar4 == null || !x9fVar4.isActive()) {
                    fn2Var.J0 = gw0.w(new g56((x26) obj, new en2(fn2Var, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 5:
                ww5 ww5Var = (ww5) this.b;
                x9f x9fVar5 = ww5Var.G0;
                if (x9fVar5 == null || !x9fVar5.isActive()) {
                    ww5Var.G0 = gw0.w(new g56(((hv5) obj).m, new vw5(ww5Var, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 6:
                e eVar = (e) this.b;
                a aVar = eVar.c;
                eVar.k();
                ViewGroup viewGroup = (ViewGroup) aVar.S0.getParent();
                ((gi6) obj).a.I();
                Object tag = viewGroup.getTag(c0d.special_effects_controller_view_tag);
                if (tag instanceof tp4) {
                    tp4Var = (tp4) tag;
                } else {
                    tp4Var = new tp4(viewGroup);
                    viewGroup.setTag(c0d.special_effects_controller_view_tag, tp4Var);
                }
                tp4Var.h();
                break;
            case 7:
                ((EndlessRecyclerView2) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = hfh.a;
                teh.c((EndlessRecyclerView2) obj);
                break;
            case 8:
                ((wa9) this.b).removeOnAttachStateChangeListener(this);
                wa9 wa9Var = (wa9) obj;
                wa9Var.setPadding(wa9Var.getPaddingLeft(), wa9Var.getPaddingTop(), wa9Var.getPaddingRight(), kti.d((g4i.h(null, wa9Var.getRootWindowInsets()).a.f(2).d > 0 ? 2 : 8) * vw4.d().getDisplayMetrics().density));
                break;
            case 9:
                ((gvf) this.b).removeOnAttachStateChangeListener(this);
                ((gvf) obj).requestApplyInsets();
                break;
            case 11:
                ((AppCompatImageView) this.b).removeOnAttachStateChangeListener(this);
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                appCompatImageView.post(new r98(14, appCompatImageView));
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                pqi.d((ImageView) this.b, ((n9d) obj).I0);
                break;
            case 13:
                x3f x3fVar = (x3f) this.b;
                x9f x9fVar6 = x3fVar.O0;
                if (x9fVar6 == null || !x9fVar6.isActive()) {
                    x3fVar.O0 = gw0.w(new g56(((s3f) obj).d, new w3f(x3fVar, null), 1), tfh.b(view));
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ocg ocgVar = (ocg) this.b;
                if (ocgVar != null) {
                    ocgVar.b((RecyclerView) view);
                }
                this.b = x7j.c((RecyclerView) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                WeakHashMap weakHashMap2 = hfh.a;
                teh.c(view);
                mdf mdfVar = (mdf) obj;
                fo7.a.a(mdfVar);
                Context context = mdfVar.a.getContext();
                sid sidVar = new sid();
                sidVar.a = context.getResources().getConfiguration().orientation;
                ldf ldfVar = new ldf(sidVar, view, 0);
                context.registerComponentCallbacks(ldfVar);
                teh.c(view);
                this.b = ldfVar;
                break;
            case 16:
                ep4 ep4Var = gy4.a;
                ContextScope contextScopeA = d7j.a(MainDispatcherLoader.dispatcher);
                this.b = contextScopeA;
                gw0.w(new g56(new m36(new s1g(view, null), new d53(q1g.d0, 12)), new t1g((i44) obj, view, null), 1), contextScopeA);
                break;
            case 19:
                v6h v6hVar = (v6h) this.b;
                b5h b5hVar = (b5h) obj;
                x38 x38VarB = tfh.b(view);
                x9f x9fVar7 = v6hVar.J0;
                if (x9fVar7 == null || !x9fVar7.isActive()) {
                    v6hVar.J0 = gw0.w(new g56(b5hVar.e, new t6h(v6hVar, b5hVar, null), 1), x38VarB);
                }
                x38 x38VarB2 = tfh.b(view);
                x9f x9fVar8 = v6hVar.I0;
                if (x9fVar8 == null || !x9fVar8.isActive()) {
                    v6hVar.I0 = gw0.w(new g56(b5hVar.d, new s6h(v6hVar, null), 1), x38VarB2);
                }
                v6hVar.t();
                Context context2 = v6hVar.getContext();
                sid sidVar2 = new sid();
                sidVar2.a = context2.getResources().getConfiguration().orientation;
                ldf ldfVar2 = new ldf(sidVar2, v6hVar, i2);
                context2.registerComponentCallbacks(ldfVar2);
                v6hVar.H0 = ldfVar2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                wq0 wq0Var = (wq0) this.b;
                wq0Var.b(false);
                wq0Var.f = false;
                Bitmap bitmap = wq0Var.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                wq0Var.g = null;
                wq0Var.h = null;
                tq0 tq0Var = wq0Var.c;
                if (tq0Var != null) {
                    tq0Var.a();
                }
                wq0Var.c = null;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                l48 l48Var = ((ykb) this.c).a;
                if (l48Var == null) {
                    l48Var = null;
                }
                l48Var.d(k38.ON_DESTROY);
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                pqi.f((ImageView) this.b, ((n9d) this.c).I0);
                break;
            case 13:
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ocg ocgVar = (ocg) this.b;
                if (ocgVar != null) {
                    ocgVar.b((RecyclerView) view);
                }
                this.b = null;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                d9a d9aVar = fo7.a;
                mdf mdfVar = (mdf) this.c;
                d9aVar.g(mdfVar);
                ldf ldfVar = (ldf) this.b;
                if (ldfVar != null) {
                    mdfVar.a.getContext().unregisterComponentCallbacks(ldfVar);
                    break;
                }
                break;
            case 16:
                try {
                    ContextScope contextScope = (ContextScope) this.b;
                    if (contextScope != null) {
                        d7j.c(contextScope, null);
                    }
                    this.b = null;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                b3h b3hVar = (b3h) this.c;
                odh odhVar = (odh) b3hVar.T();
                if (odhVar.d != null && odhVar.getChildCount() > 0) {
                    b3hVar.w();
                    break;
                }
                break;
            case 18:
                ((b6h) this.b).removeOnAttachStateChangeListener(this);
                b6h b6hVar = (b6h) this.c;
                ?? r0 = b6hVar.L0;
                if (r0.e()) {
                    b6hVar.getBitmapPool().b(r0.getValue());
                    break;
                }
                break;
            case 19:
                v6h v6hVar = (v6h) this.b;
                ldf ldfVar2 = v6hVar.H0;
                if (ldfVar2 != null) {
                    v6hVar.getContext().unregisterComponentCallbacks(ldfVar2);
                }
                v6hVar.H0 = null;
                break;
            default:
                wqi.c(ari.b((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                ((p2i) this.c).a = true;
                break;
        }
    }

    public /* synthetic */ r40(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public r40(gi6 gi6Var, e eVar) {
        this.a = 6;
        this.c = gi6Var;
        this.b = eVar;
    }
}
