package androidx.view.compose;

import Y41.l;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.compose.C23019n;
import androidx.view.compose.C23027v;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.lifecycle.compose.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23018m implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f46752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f46753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f46754e;

    public /* synthetic */ C23018m(InterfaceC22983P interfaceC22983P, l0.h hVar, l lVar, int i12) {
        this.f46751b = i12;
        this.f46754e = interfaceC22983P;
        this.f46752c = hVar;
        this.f46753d = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // androidx.view.InterfaceC22979L
    public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
        switch (this.f46751b) {
            case 0:
                int i12 = C23019n.a.f46758a[event.ordinal()];
                l0.h hVar = this.f46752c;
                if (i12 == 1) {
                    hVar.f406842b = this.f46753d.invoke((C23001C) this.f46754e);
                    return;
                }
                if (i12 != 2) {
                    return;
                }
                InterfaceC22999A interfaceC22999A = (InterfaceC22999A) hVar.f406842b;
                if (interfaceC22999A == null) {
                    hVar.f406842b = null;
                    return;
                } else {
                    interfaceC22999A.a();
                    throw null;
                }
            default:
                int i13 = C23027v.a.f46769a[event.ordinal()];
                l0.h hVar2 = this.f46752c;
                if (i13 == 1) {
                    hVar2.f406842b = this.f46753d.invoke((C23003E) this.f46754e);
                    return;
                }
                if (i13 != 2) {
                    return;
                }
                InterfaceC23004F interfaceC23004F = (InterfaceC23004F) hVar2.f406842b;
                if (interfaceC23004F == null) {
                    hVar2.f406842b = null;
                    return;
                } else {
                    interfaceC23004F.a();
                    throw null;
                }
        }
    }
}
