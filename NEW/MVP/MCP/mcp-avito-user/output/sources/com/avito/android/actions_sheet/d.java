package com.avito.android.actions_sheet;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ActionsSheetLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/actions_sheet/d;", "Ldagger/internal/h;", "Lcom/avito/android/actions_sheet/c;", "a", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f68194d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f68195a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dagger.internal.f f68196b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f68197c;

    /* compiled from: ActionsSheetLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/actions_sheet/d$a;", "", "<init>", "()V", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dagger.internal.f fVar, @k dv.b bVar, @k dv.b bVar2) {
        this.f68195a = bVar;
        this.f68196b = fVar;
        this.f68197c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.f fVar = (a.f) this.f68195a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f68196b.get();
        a.d dVar = (a.d) this.f68197c.get();
        f68194d.getClass();
        return new c(aVar, dVar, fVar);
    }
}
