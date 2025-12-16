package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.C22949g;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC22944b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46530b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C22949g f46531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46533e;

    public /* synthetic */ RunnableC22944b(C22949g c22949g, View view, C22949g.a aVar) {
        this.f46531c = c22949g;
        this.f46532d = view;
        this.f46533e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f46533e;
        Object obj2 = this.f46532d;
        C22949g c22949g = this.f46531c;
        switch (this.f46530b) {
            case 0:
                int i12 = C22949g.f46547g;
                ArrayList arrayList = (ArrayList) obj2;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
                if (arrayList.contains(operation)) {
                    arrayList.remove(operation);
                    c22949g.getClass();
                    operation.f46506a.a(operation.f46508c.mView);
                    break;
                }
                break;
            default:
                c22949g.f46501a.endViewTransition((View) obj2);
                ((C22949g.a) obj).a();
                break;
        }
    }

    public /* synthetic */ RunnableC22944b(ArrayList arrayList, SpecialEffectsController.Operation operation, C22949g c22949g) {
        this.f46532d = arrayList;
        this.f46533e = operation;
        this.f46531c = c22949g;
    }
}
