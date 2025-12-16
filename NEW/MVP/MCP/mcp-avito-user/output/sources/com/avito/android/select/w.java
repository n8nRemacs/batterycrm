package com.avito.android.select;

import com.avito.android.select.u;

/* compiled from: SelectViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class w implements u.f {

    /* renamed from: a, reason: collision with root package name */
    public final v f266857a;

    public w(v vVar) {
        this.f266857a = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.select.u.f
    public final u create() {
        v vVar = this.f266857a;
        return new u((com.avito.android.select.mvi.n) vVar.f266832a.get(), (io.reactivex.rxjava3.core.z) vVar.f266833b.get());
    }
}
