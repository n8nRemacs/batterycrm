package com.avito.beduin.v2.component.common.lazy;

import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f335684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f335685c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f335684b = i12;
        this.f335685c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f335684b) {
            case 0:
                d dVar = (d) this.f335685c;
                dVar.f335686e.m();
                dVar.f335687f.finalize();
                break;
            default:
                Y41.a<G0> aVar = ((a) this.f335685c).f335680c;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
        }
    }
}
