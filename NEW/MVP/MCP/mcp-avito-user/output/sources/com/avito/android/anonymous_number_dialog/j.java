package com.avito.android.anonymous_number_dialog;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30214v6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnonymousNumberDialogHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/j;", "Ldagger/internal/h;", "Lcom/avito/android/anonymous_number_dialog/e;", "a", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<e> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f91290g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f91291a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dv.b f91292b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f91293c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f91294d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dv.b f91295e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f91296f;

    /* compiled from: AnonymousNumberDialogHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/j$a;", "", "<init>", "()V", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k dagger.internal.f fVar, @Y61.k dv.b bVar, @Y61.k h hVar, @Y61.k dagger.internal.f fVar2, @Y61.k dv.b bVar2, @Y61.k C30214v6 c30214v6) {
        this.f91291a = fVar;
        this.f91292b = bVar;
        this.f91293c = hVar;
        this.f91294d = fVar2;
        this.f91295e = bVar2;
        this.f91296f = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f91291a.get();
        a.f fVar = (a.f) this.f91292b.get();
        com.avito.android.anonymous_number_dialog.a aVar = (com.avito.android.anonymous_number_dialog.a) this.f91293c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f91294d.get();
        a.d dVar = (a.d) this.f91295e.get();
        AK0.l lVar = (AK0.l) this.f91296f.get();
        f91290g.getClass();
        return new e(interfaceC28373a, fVar, aVar, aVar2, dVar, lVar);
    }
}
