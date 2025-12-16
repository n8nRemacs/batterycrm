package com.yandex.div.core.view2.errors;

import com.yandex.div.core.InterfaceC37911f;
import kotlin.InterfaceC43072x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements InterfaceC37911f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f369063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f369064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f369065d;

    public /* synthetic */ c(Object obj, InterfaceC43072x interfaceC43072x, int i12) {
        this.f369063b = i12;
        this.f369064c = obj;
        this.f369065d = interfaceC43072x;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f369063b) {
            case 0:
                ((d) this.f369064c).f369066a.remove((Y41.p) this.f369065d);
                break;
            default:
                ((i) this.f369064c).f369075b.remove((Y41.l) this.f369065d);
                break;
        }
    }
}
