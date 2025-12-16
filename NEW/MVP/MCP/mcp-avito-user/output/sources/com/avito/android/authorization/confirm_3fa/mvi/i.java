package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailList;
import com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import ge.C40667c;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: ConfirmEmailListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f93612a;

    /* renamed from: b, reason: collision with root package name */
    public final q f93613b;

    /* renamed from: c, reason: collision with root package name */
    public final f f93614c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f93615d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f93616e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f93617f;

    public i(d dVar, q qVar, f fVar, Provider provider, Provider provider2, dagger.internal.l lVar) {
        this.f93612a = dVar;
        this.f93613b = qVar;
        this.f93614c = fVar;
        this.f93615d = provider;
        this.f93616e = provider2;
        this.f93617f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f93612a.get();
        this.f93613b.getClass();
        p pVar = new p();
        this.f93614c.getClass();
        e eVar = new e();
        R0 r02 = this.f93615d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f93616e.get();
        ConfirmEmailList confirmEmailList = (ConfirmEmailList) this.f93617f.f393949a;
        C40667c.f396649d.getClass();
        ArrayList<ConfirmEmailList.Email> arrayList = confirmEmailList.f93534b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (ConfirmEmailList.Email email : arrayList) {
            arrayList2.add(new EmailItem(email.f93536c, email.f93535b));
        }
        return new h("ConfirmEmailList", new C40667c(arrayList2, false), new g(bVar, eVar, screenPerformanceTracker, pVar, r02));
    }
}
