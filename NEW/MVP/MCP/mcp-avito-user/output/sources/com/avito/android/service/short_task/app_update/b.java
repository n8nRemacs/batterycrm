package com.avito.android.service.short_task.app_update;

import com.avito.android.util.C;
import kotlin.Metadata;

/* compiled from: AppUpdateInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f274039b;

    public b(e eVar) {
        this.f274039b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        e eVar = this.f274039b;
        String strInvoke = eVar.f274045d.f().invoke();
        C c12 = eVar.f274043b;
        eVar.f274044c.c(new a(strInvoke, String.valueOf(c12.getF125492l())));
        eVar.f274042a.c(c12.getF125492l());
    }
}
