package com.avito.android.delivery_common;

import kotlin.jvm.internal.l0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f135006c;

    public /* synthetic */ c(l0.h hVar, int i12) {
        this.f135005b = i12;
        this.f135006c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f135005b) {
            case 0:
                this.f135006c.f406842b = null;
                break;
            case 1:
                this.f135006c.f406842b = null;
                break;
            default:
                InterfaceC43268o0 interfaceC43268o0 = (InterfaceC43268o0) this.f135006c.f406842b;
                if (interfaceC43268o0 != null) {
                    interfaceC43268o0.dispose();
                    break;
                }
                break;
        }
    }
}
