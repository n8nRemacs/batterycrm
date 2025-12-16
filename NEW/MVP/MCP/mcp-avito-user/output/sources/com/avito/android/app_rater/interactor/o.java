package com.avito.android.app_rater.interactor;

import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import kotlin.G0;
import kotlinx.coroutines.channels.I0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o implements InterfaceC37022e, ru.rustore.sdk.core.tasks.d, ru.rustore.sdk.core.tasks.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0 f91827c;

    public /* synthetic */ o(I0 i02, int i12) {
        this.f91826b = i12;
        this.f91827c = i02;
    }

    @Override // ru.rustore.sdk.core.tasks.d
    public void a(Throwable th2) {
        switch (this.f91826b) {
            case 1:
                this.f91827c.h(th2);
                break;
            default:
                this.f91827c.h(th2);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        G0 g02 = G0.f406611a;
        I0 i02 = this.f91827c;
        i02.w(g02);
        i02.h(null);
    }

    @Override // ru.rustore.sdk.core.tasks.e
    public void onSuccess(Object obj) {
        G0 g02 = G0.f406611a;
        I0 i02 = this.f91827c;
        i02.w(g02);
        i02.h(null);
    }
}
