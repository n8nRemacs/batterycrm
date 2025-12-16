package com.avito.android.advert.viewed.persistance;

import androidx.room.O0;
import j.N;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: ViewedAdvertsDao_Impl.java */
/* loaded from: classes10.dex */
class f implements Callable<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f81047b;

    public f(c cVar) {
        this.f81047b = cVar;
    }

    @Override // java.util.concurrent.Callable
    @N
    public final G0 call() {
        c cVar = this.f81047b;
        O0 o02 = cVar.f81038c;
        ViewedAdvertsDb_Impl viewedAdvertsDb_Impl = cVar.f81036a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, 100);
        try {
            viewedAdvertsDb_Impl.c();
            try {
                iVarA.B3();
                viewedAdvertsDb_Impl.s();
                return G0.f406611a;
            } finally {
                viewedAdvertsDb_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
