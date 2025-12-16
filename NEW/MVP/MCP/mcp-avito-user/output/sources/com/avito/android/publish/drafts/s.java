package com.avito.android.publish.drafts;

import arrow.core.X0;
import arrow.core.Y0;
import arrow.core.Z0;
import be0.C25640c;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class s implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f235396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f235397c;

    public /* synthetic */ s(x xVar, int i12) {
        this.f235396b = i12;
        this.f235397c = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f235396b) {
            case 0:
                return Z0.b(this.f235397c.f235417b.a());
            default:
                C25640c c25640c = this.f235397c.f235417b;
                synchronized (c25640c) {
                    Y0.f56266a.getClass();
                    c25640c.f57316c.accept(X0.f56264b);
                    c25640c.f57314a.getF316a().edit().clear().commit();
                }
                return G0.f406611a;
        }
    }
}
