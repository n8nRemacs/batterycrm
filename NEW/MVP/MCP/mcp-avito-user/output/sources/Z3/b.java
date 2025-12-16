package Z3;

import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f19842c;

    public /* synthetic */ b(c cVar, int i12) {
        this.f19841b = i12;
        this.f19842c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19841b) {
            case 0:
                return Boolean.valueOf(this.f19842c.f19843a.getBoolean("request_delivery_dialog_was_showed", false));
            default:
                this.f19842c.f19843a.putBoolean("request_delivery_dialog_was_showed", true);
                return G0.f406611a;
        }
    }
}
