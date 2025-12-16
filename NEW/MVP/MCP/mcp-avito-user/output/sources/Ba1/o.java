package Ba1;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.camera.core.C20056e0;
import androidx.camera.core.C20144v;
import androidx.camera.core.CameraControl;
import androidx.camera.core.InterfaceC20127n;
import androidx.camera.core.InterfaceC20141s;
import androidx.camera.core.M;
import androidx.camera.core.T;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.InterfaceC20088d0;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.s0;
import androidx.camera.core.v0;
import androidx.camera.view.PreviewView;
import androidx.view.InterfaceC22983P;
import com.google.common.util.concurrent.D0;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.l0;
import pc1.b;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1513a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC20127n f1514b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f1515c;

    /* renamed from: d, reason: collision with root package name */
    public C20056e0 f1516d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f1517e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.lifecycle.i f1519g;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f1518f = Executors.newSingleThreadExecutor();

    /* renamed from: h, reason: collision with root package name */
    public final A f1520h = new A();

    /* renamed from: i, reason: collision with root package name */
    public final G f1521i = new G();

    /* renamed from: j, reason: collision with root package name */
    public final m f1522j = new m(this);

    public o(int i12) {
        this.f1513a = i12;
    }

    public final void a() {
        C20056e0 c20056e0 = this.f1516d;
        if (c20056e0 != null) {
            c20056e0.K(this.f1518f, this.f1522j);
        }
    }

    public final void b(PreviewView previewView, MotionEvent motionEvent) {
        CameraControl cameraControlA;
        M m12 = new M(new M.a(previewView.getMeteringPointFactory().b(motionEvent.getX(), motionEvent.getY(), 0.15f)));
        InterfaceC20127n interfaceC20127n = this.f1514b;
        if (interfaceC20127n == null || (cameraControlA = interfaceC20127n.a()) == null) {
            return;
        }
        cameraControlA.g(m12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, androidx.camera.core.T] */
    public final void c(InterfaceC22983P interfaceC22983P, PreviewView previewView, T.a aVar) throws ExecutionException, InterruptedException {
        this.f1517e = androidx.core.content.d.getMainExecutor(previewView.getContext());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        previewView.getDisplay().getRealMetrics(displayMetrics);
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        double dMax = Math.max(i12, i13) / Math.min(i12, i13);
        int i14 = Math.abs(dMax - 1.3333333d) <= Math.abs(dMax - 1.777777d) ? 0 : 1;
        b.C12280b c12280b = pc1.b.f428696a;
        c12280b.b("Screen metrics: " + displayMetrics.widthPixels + " x " + displayMetrics.heightPixels, new Object[0]);
        StringBuilder sb2 = new StringBuilder("Preview aspect ratio: ");
        sb2.append(i14);
        c12280b.b(sb2.toString(), new Object[0]);
        C20144v.a aVar2 = new C20144v.a();
        aVar2.a(this.f1513a);
        LinkedHashSet<InterfaceC20141s> linkedHashSet = aVar2.f24565a;
        C20144v c20144v = new C20144v();
        c20144v.f24564a = linkedHashSet;
        D0<androidx.camera.lifecycle.i> d0C = androidx.camera.lifecycle.i.c(previewView.getContext());
        l0.h hVar = new l0.h();
        if (aVar != null) {
            T.c cVar = new T.c();
            Config.a<Integer> aVar3 = Y.f24063G;
            n0 n0Var = cVar.f23659a;
            n0Var.K(aVar3, 0);
            n0Var.K(InterfaceC20088d0.f24093g, 1);
            n0Var.K(Y.f24068L, Boolean.TRUE);
            Y y12 = new Y(s0.Q(n0Var));
            InterfaceC20088d0.v(y12);
            hVar.f406842b = new T(y12);
            ((T) hVar.f406842b).H(Executors.newSingleThreadExecutor(), aVar);
        }
        androidx.camera.lifecycle.i iVar = d0C.get();
        this.f1519g = iVar;
        if (iVar != null) {
            iVar.e();
        }
        v0.a aVar4 = new v0.a();
        int i15 = i14 == -1 ? 0 : i14;
        Config.a<Integer> aVar5 = InterfaceC20088d0.f24093g;
        aVar4.f24574a.K(aVar5, Integer.valueOf(i15));
        aVar4.f(0);
        this.f1515c = aVar4.e();
        C20056e0.b bVar = new C20056e0.b();
        Integer numValueOf = Integer.valueOf(i14 != -1 ? i14 : 0);
        n0 n0Var2 = bVar.f23736a;
        n0Var2.K(aVar5, numValueOf);
        n0Var2.K(InterfaceC20088d0.f24094h, 0);
        this.f1516d = bVar.e();
        n nVar = new n(this, interfaceC22983P, previewView, c20144v, hVar, 0);
        Executor executor = this.f1517e;
        if (executor == null) {
            executor = null;
        }
        ((androidx.camera.core.impl.utils.futures.d) d0C).N(nVar, executor);
    }
}
