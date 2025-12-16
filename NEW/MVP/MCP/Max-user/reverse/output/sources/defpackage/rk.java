package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

/* loaded from: classes2.dex */
public final class rk implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ rk() {
        this.a = 10;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        xj xjVar;
        RecyclerView recyclerView;
        int i = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                sk skVar = (sk) this.b;
                if (((xj) skVar.Y) == null && skVar.c) {
                    xj xjVar2 = new xj((AnimojiTextView) skVar.d);
                    skVar.Y = xjVar2;
                    xjVar2.a();
                }
                xj xjVar3 = (xj) skVar.Y;
                if (xjVar3 != null && xjVar3.c && (xjVar = (xj) skVar.Y) != null) {
                    xjVar.a();
                    break;
                }
                break;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: ", d7j.f(chatsTabWidget.getLifecycleScope())), null);
                    }
                }
                ChatsTabWidget chatsTabWidget2 = (ChatsTabWidget) this.b;
                chatsTabWidget2.E0 = gw0.w(new g56(chatsTabWidget2.D0().x0, new j73(null, (ChatsTabWidget) this.b), 1), ((ChatsTabWidget) this.b).getViewLifecycleScope());
                ChatsTabWidget chatsTabWidget3 = (ChatsTabWidget) this.b;
                int iIntValue = ((Number) chatsTabWidget3.D0().w0.a.getValue()).intValue();
                chatsTabWidget3.B0().e(iIntValue, false);
                chatsTabWidget3.A0().o(iIntValue, 0.0f, true, true, true);
                break;
            case 3:
                ((zd3) this.b).f.i();
                break;
            case 4:
                ja5 ja5Var = (ja5) this.b;
                Drawable drawable = ((ImageView) ja5Var.a).getDrawable();
                ok okVar = drawable instanceof ok ? (ok) drawable : null;
                if (okVar != null) {
                    okVar.c(ja5Var.F0);
                    okVar.start();
                    break;
                }
                break;
            case 5:
                lf5 lf5Var = (lf5) this.b;
                AccessibilityManager accessibilityManager = lf5Var.G0;
                if (lf5Var.H0 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = hfh.a;
                    if (lf5Var.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new a5(lf5Var.H0));
                        break;
                    }
                }
                break;
            case 7:
                ppd ppdVar = (ppd) this.b;
                if (!ppdVar.g && (recyclerView = (RecyclerView) ppdVar.e.get()) != null) {
                    ppdVar.a(recyclerView);
                    break;
                }
                break;
            case 8:
                v3f v3fVar = (v3f) this.b;
                x9f x9fVar = v3fVar.G0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    v3fVar.G0 = gw0.w(new g56(gw0.E(new d53(v3fVar.getModelFlow(), 12), new v78(i, objArr == true ? 1 : 0, i2)), new u3f(v3fVar, null), 1), tfh.b(view));
                    break;
                }
                break;
            case 10:
                x9f x9fVar2 = (x9f) this.b;
                if (x9fVar2 == null || !x9fVar2.isActive()) {
                    TextView textView = view instanceof TextView ? (TextView) view : null;
                    if (textView != null) {
                        this.b = gw0.w(new m36(gw0.d(new g56(new m36(new ihh(textView, null), (hbd) a93.s0.x(textView.getContext()).Y), new jhh(textView, null), 1)), new w41(i, objArr2 == true ? 1 : 0, 5)), tfh.b(view));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                sk skVar = (sk) this.b;
                xj xjVar = (xj) skVar.Y;
                if (xjVar != null) {
                    xjVar.c = true;
                    xj.d.removeCallbacks(xjVar);
                }
                skVar.Y = null;
                break;
            case 1:
                z52 z52Var = (z52) this.b;
                ViewTreeObserver viewTreeObserver = z52Var.H0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        z52Var.H0 = view.getViewTreeObserver();
                    }
                    z52Var.H0.removeGlobalOnLayoutListener(z52Var.s0);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", d7j.f(chatsTabWidget.getLifecycleScope())), null);
                    }
                }
                x9f x9fVar = ((ChatsTabWidget) this.b).E0;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                ((ChatsTabWidget) this.b).E0 = null;
                break;
            case 3:
                ((zd3) this.b).f.l();
                break;
            case 4:
                ((ja5) this.b).F(false);
                break;
            case 5:
                lf5 lf5Var = (lf5) this.b;
                wo4 wo4Var = lf5Var.H0;
                if (wo4Var != null && (accessibilityManager = lf5Var.G0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new a5(wo4Var));
                    break;
                }
                break;
            case 6:
                Handler handler = icb.a;
                icb.b((fcb) ((i40) this.b).h, ecb.d);
                break;
            case 7:
                ppd ppdVar = (ppd) this.b;
                if (!ppdVar.g && (recyclerView = (RecyclerView) ppdVar.e.get()) != null) {
                    ppdVar.b(recyclerView);
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                aaf aafVar = (aaf) this.b;
                ViewTreeObserver viewTreeObserver2 = aafVar.y0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        aafVar.y0 = view.getViewTreeObserver();
                    }
                    aafVar.y0.removeGlobalOnLayoutListener(aafVar.s0);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                x9f x9fVar2 = (x9f) this.b;
                if (x9fVar2 != null) {
                    x9fVar2.cancel((CancellationException) null);
                }
                this.b = null;
                break;
            default:
                Widget widget = (Widget) this.b;
                wqi.c(ari.b(widget), "lifecycle: preAttach invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                widget.finalizeCleanActions(widget);
                break;
        }
    }

    public /* synthetic */ rk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
