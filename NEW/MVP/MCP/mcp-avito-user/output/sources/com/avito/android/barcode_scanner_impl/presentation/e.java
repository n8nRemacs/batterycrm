package com.avito.android.barcode_scanner_impl.presentation;

import OZ0.b;
import Y41.l;
import Y61.k;
import android.util.Rational;
import android.view.Display;
import androidx.camera.core.C20144v;
import androidx.camera.core.CameraControl;
import androidx.camera.core.InterfaceC20127n;
import androidx.camera.core.InterfaceC20141s;
import androidx.camera.core.O0;
import androidx.camera.core.P0;
import androidx.camera.core.T;
import androidx.camera.core.impl.InterfaceC20088d0;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.n0;
import androidx.camera.core.v0;
import androidx.camera.lifecycle.i;
import androidx.camera.view.PreviewView;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CameraScannerUIUnit.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/e;", "", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PreviewView f99036a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ExecutorService f99037b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BarcodeScannerFragment f99038c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<Boolean, G0> f99039d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<QZ0.a, G0> f99040e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<Throwable, G0> f99041f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public i f99042g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public CameraControl f99043h;

    public e(@k PreviewView previewView, @k ExecutorService executorService, @k BarcodeScannerFragment barcodeScannerFragment, @k l lVar, @k l lVar2, @k l lVar3) {
        this.f99036a = previewView;
        this.f99037b = executorService;
        this.f99038c = barcodeScannerFragment;
        this.f99039d = lVar;
        this.f99040e = lVar2;
        this.f99041f = lVar3;
    }

    public static final void a(final e eVar, int i12) {
        PreviewView previewView = eVar.f99036a;
        Display display = previewView.getDisplay();
        if (display != null) {
            int rotation = display.getRotation();
            try {
                eVar.f99042g = i.c(previewView.getContext()).get();
                v0.a aVar = new v0.a();
                aVar.f(rotation);
                v0 v0VarE = aVar.e();
                n0 n0Var = new T.c().f23659a;
                n0Var.K(Y.f24063G, 0);
                n0Var.K(InterfaceC20088d0.f24094h, Integer.valueOf(rotation));
                Y y12 = new Y(androidx.camera.core.impl.s0.Q(n0Var));
                InterfaceC20088d0.v(y12);
                T t12 = new T(y12);
                C20144v.a aVar2 = new C20144v.a();
                aVar2.a(1);
                LinkedHashSet<InterfaceC20141s> linkedHashSet = aVar2.f24565a;
                C20144v c20144v = new C20144v();
                c20144v.f24564a = linkedHashSet;
                Rational rational = new Rational(previewView.getWidth(), previewView.getHeight());
                P0 p02 = new P0();
                p02.f23647a = 1;
                p02.f23648b = rational;
                p02.f23649c = rotation;
                p02.f23650d = 0;
                O0.a aVar3 = new O0.a();
                aVar3.a(v0VarE);
                aVar3.a(t12);
                aVar3.f23639a = p02;
                O0 o0B = aVar3.b();
                v0VarE.G(previewView.getSurfaceProvider());
                new b.a().f12325a = i12;
                final OZ0.b bVar = new OZ0.b(i12, null, null);
                t12.H(eVar.f99037b, new T.a() { // from class: com.avito.android.barcode_scanner_impl.presentation.b
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
                    @Override // androidx.camera.core.T.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void d(androidx.camera.core.z0 r21) {
                        /*
                            Method dump skipped, instructions count: 441
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_scanner_impl.presentation.b.d(androidx.camera.core.z0):void");
                    }
                });
                i iVar = eVar.f99042g;
                if (iVar != null) {
                    iVar.e();
                }
                i iVar2 = eVar.f99042g;
                if (iVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                InterfaceC20127n interfaceC20127nA = iVar2.a(eVar.f99038c, c20144v, o0B);
                eVar.f99043h = interfaceC20127nA.a();
                eVar.f99039d.invoke(Boolean.valueOf(interfaceC20127nA.getCameraInfo().n()));
            } catch (Throwable th2) {
                eVar.f99041f.invoke(th2);
            }
        }
    }
}
