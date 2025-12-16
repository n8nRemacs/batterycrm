package ta1;

import TZ0.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.camera.core.T;
import androidx.camera.core.z0;
import com.google.android.gms.tasks.Task;
import java.util.List;
import kotlin.G0;
import kotlin.Z;
import ya1.C50207c;

/* renamed from: ta1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48629c implements T.a {

    /* renamed from: b, reason: collision with root package name */
    public final d f439279b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.mlkit.vision.face.internal.a f439280c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f439281d;

    /* renamed from: e, reason: collision with root package name */
    public final C50207c f439282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f439283f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f439284g;

    public C48629c(Context context, d dVar) {
        this.f439279b = dVar;
        e.a aVar = new e.a();
        aVar.f15726d = 2;
        aVar.f15724b = 2;
        aVar.f15727e = 0.01f;
        this.f439280c = TZ0.c.a(aVar.a());
        this.f439282e = new C50207c(context);
    }

    public final void a(z0 z0Var) {
        if (z0Var.f23633c.getImage() == null) {
            z0Var.close();
            return;
        }
        C50207c c50207c = this.f439282e;
        Bitmap bitmapD = c50207c.d(z0Var);
        Rect rect = this.f439281d;
        if (rect == null) {
            rect = null;
        }
        Bitmap bitmapB = c50207c.b(bitmapD, rect);
        com.google.mlkit.vision.face.internal.a aVar = this.f439280c;
        aVar.getClass();
        Task<List<TZ0.a>> taskB = aVar.b(com.google.mlkit.vision.common.a.a(bitmapB));
        taskB.g(new com.my.target.ads.a(new C48627a(this, bitmapB), 29));
        taskB.e(new C48628b(this, z0Var));
        taskB.c(new C48628b(this, z0Var));
    }

    @Override // androidx.camera.core.T.a
    public final void d(z0 z0Var) {
        Object bVar;
        if (this.f439283f || z0Var.f24619h == 0 || z0Var.f24620i == 0) {
            z0Var.close();
            return;
        }
        this.f439283f = true;
        try {
            int i12 = Z.f406624c;
            a(z0Var);
            bVar = G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) != null) {
            this.f439283f = false;
        }
    }
}
