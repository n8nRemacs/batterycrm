package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f358875a;

    @Override // com.google.android.play.core.splitinstall.testing.u
    public final AbstractC37204f a(final AbstractC37204f abstractC37204f) {
        final int i12 = this.f358875a;
        Callable callable = new Callable() { // from class: com.google.android.play.core.splitinstall.testing.r
            @Override // java.util.concurrent.Callable
            public final Object call() throws SplitInstallException {
                int i13;
                int i14 = C37243a.f358839p;
                AbstractC37204f abstractC37204f2 = abstractC37204f;
                if (abstractC37204f2 != null) {
                    int iH2 = abstractC37204f2.h();
                    int i15 = i12;
                    if (i15 == iH2 && ((i13 = abstractC37204f2.i()) == 1 || i13 == 2 || i13 == 8 || i13 == 9 || i13 == 7)) {
                        return AbstractC37204f.b(i15, 7, abstractC37204f2.c(), abstractC37204f2.a(), abstractC37204f2.j(), abstractC37204f2.f(), abstractC37204f2.e());
                    }
                }
                throw new SplitInstallException(-3);
            }
        };
        int i13 = zzbx.f358805b;
        try {
            return (AbstractC37204f) callable.call();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception e13) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e13);
        }
    }
}
