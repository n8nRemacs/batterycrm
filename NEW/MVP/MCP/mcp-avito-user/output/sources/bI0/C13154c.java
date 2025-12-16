package Bi0;

import AK0.l;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeConfirmedModule_ProvideRecallMeConfirmedInteractorFactory.java */
@e
@y
@x
/* renamed from: Bi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13154c implements h<com.avito.android.recall_me_core.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C13153b f1633a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1634b;

    /* renamed from: c, reason: collision with root package name */
    public final u f1635c;

    /* renamed from: d, reason: collision with root package name */
    public final u f1636d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1637e;

    public C13154c(C13153b c13153b, u uVar, u uVar2, u uVar3, u uVar4) {
        this.f1633a = c13153b;
        this.f1634b = uVar;
        this.f1635c = uVar2;
        this.f1636d = uVar3;
        this.f1637e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f1633a.get();
        Gson gson = (Gson) this.f1634b.get();
        h31.e eVarB = g.b(this.f1635c);
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f1636d.get();
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) this.f1637e.get();
        C13152a.f1631a.getClass();
        return new com.avito.android.recall_me_core.c(eVarB, interfaceC35745a5, lVar, aVar, gson);
    }
}
