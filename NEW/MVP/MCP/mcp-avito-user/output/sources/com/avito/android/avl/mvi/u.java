package com.avito.android.avl.mvi;

import javax.inject.Inject;
import kotlin.Metadata;
import zg.f;
import zg.g;

/* compiled from: AvlPlayerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avl/mvi/u;", "Lcom/avito/android/arch/mvi/t;", "Lzg/f;", "Lzg/g;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u implements com.avito.android.arch.mvi.t<zg.f, zg.g> {
    @Inject
    public u() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final zg.g b(zg.f fVar) {
        zg.f fVar2 = fVar;
        if (fVar2.equals(f.i.f444154a)) {
            return g.b.f444156a;
        }
        if (fVar2.equals(f.a.f444146a)) {
            return g.a.f444155a;
        }
        if (fVar2.equals(f.g.f444152a)) {
            return g.c.f444157a;
        }
        if (fVar2.equals(f.C12966f.f444151a)) {
            return g.b.f444156a;
        }
        if (fVar2.equals(f.b.f444147a)) {
            return g.d.f444158a;
        }
        return null;
    }
}
