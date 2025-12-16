package ta1;

import androidx.camera.core.z0;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
/* renamed from: ta1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C48628b implements InterfaceC37023f, InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C48629c f439277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f439278c;

    public /* synthetic */ C48628b(C48629c c48629c, z0 z0Var) {
        this.f439277b = c48629c;
        this.f439278c = z0Var;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        this.f439277b.f439283f = false;
        this.f439278c.close();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        this.f439277b.f439283f = false;
        this.f439278c.close();
    }
}
