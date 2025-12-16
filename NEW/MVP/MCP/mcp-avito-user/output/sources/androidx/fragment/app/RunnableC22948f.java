package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C22949g;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC22948f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46544b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46546d;

    public /* synthetic */ RunnableC22948f(C22949g.c cVar, SpecialEffectsController.Operation operation) {
        this.f46545c = cVar;
        this.f46546d = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f46546d;
        Object obj2 = this.f46545c;
        switch (this.f46544b) {
            case 0:
                int i12 = C22949g.f46547g;
                ((C22949g.c) obj2).a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    ((SpecialEffectsController.Operation) obj).toString();
                    break;
                }
                break;
            default:
                int i13 = C22949g.f46547g;
                O.g((View) obj2, (Rect) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC22948f(O o12, View view, Rect rect) {
        this.f46545c = view;
        this.f46546d = rect;
    }
}
