package Fc1;

import android.content.res.Resources;

/* loaded from: classes9.dex */
public final class M3 implements InterfaceC13583c4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5092a;

    public M3(int i12) {
        this.f5092a = i12;
    }

    @Override // Fc1.InterfaceC13583c4
    public final int a() {
        return this.f5092a;
    }

    @Override // Fc1.InterfaceC13583c4
    public final float b() {
        return this.f5092a * Resources.getSystem().getDisplayMetrics().density;
    }
}
