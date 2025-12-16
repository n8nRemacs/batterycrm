package sY;

import com.avito.android.master_plan.MasterPlanShowLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MasterPlanLinkHandlerModule_ProvideMasterPlanLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: sY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48132b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f437711a;

    public C48132b(d dVar) {
        this.f437711a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f437711a;
        C48131a.f437710a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MasterPlanShowLink.class, new f(), new C43834a.b.C11809b(dVar));
    }
}
