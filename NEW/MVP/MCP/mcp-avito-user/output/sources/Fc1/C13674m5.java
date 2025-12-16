package Fc1;

import android.content.res.Resources;

/* renamed from: Fc1.m5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13674m5 implements InterfaceC13583c4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Cb1.c f5675a;

    public C13674m5(@Y61.k Cb1.c cVar) {
        this.f5675a = cVar;
    }

    @Override // Fc1.InterfaceC13583c4
    public final int a() {
        return this.f5675a.f2295a;
    }

    @Override // Fc1.InterfaceC13583c4
    public final float b() {
        return this.f5675a.f2295a * Resources.getSystem().getDisplayMetrics().density;
    }
}
