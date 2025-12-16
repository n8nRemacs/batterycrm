package com.avito.android.util;

import kotlin.InterfaceC43072x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class U2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f318749c;

    public /* synthetic */ U2(int i12, Y41.a aVar) {
        this.f318748b = i12;
        this.f318749c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC43072x interfaceC43072x = this.f318749c;
        switch (this.f318748b) {
            case 0:
                V2 v22 = V2.f318762a;
                ((Y41.a) interfaceC43072x).invoke();
                break;
            case 1:
                ((Y41.a) interfaceC43072x).invoke();
                break;
            default:
                ((kotlin.jvm.internal.N) interfaceC43072x).invoke();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ U2(Y41.a aVar) {
        this.f318748b = 2;
        this.f318749c = (kotlin.jvm.internal.N) aVar;
    }
}
