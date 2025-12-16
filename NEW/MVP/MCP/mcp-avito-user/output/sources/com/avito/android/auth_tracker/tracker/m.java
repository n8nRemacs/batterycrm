package com.avito.android.auth_tracker.tracker;

import Wd.InterfaceC15745b;
import android.os.Bundle;
import com.avito.android.remote.InterfaceC34264g;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import retrofit2.y;

/* compiled from: AuthTrackerTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auth_tracker/tracker/m;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f92659a;

    /* compiled from: AuthTrackerTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lkotlin/G0;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f92660b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    @Inject
    public m(@Y61.k j jVar) {
        this.f92659a = jVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        String string = bundle.getString("postAuthId");
        String string2 = bundle.getString("postAuthIdWithHash");
        InterfaceC15745b.a aVar = new InterfaceC15745b.a(string, string2);
        j jVar = this.f92659a;
        InterfaceC34264g interfaceC34264g = jVar.f92657a;
        I<y<G0>> iA2 = interfaceC34264g.a(string);
        h hVar = new h(aVar);
        l41.o oVar = d.f92650b;
        C42022u c42022uK = iA2.r(oVar).u(new com.avito.android.analytics.clickstream.I(5)).k(new e(jVar, hVar));
        l41.o oVar2 = f.f92653b;
        return I.G(c42022uK.r(oVar2), interfaceC34264g.b(string2, "close").r(oVar).u(new com.avito.android.analytics.clickstream.I(5)).k(new e(jVar, new i(aVar))).r(oVar2), g.f92654b).r(a.f92660b).u(new com.avito.android.analytics.clickstream.I(1));
    }
}
