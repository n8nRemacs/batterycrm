package com.avito.android.work_time_sheet.link;

import X41.n;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: WorkTimeSheetDeepLinkModule_ProvideExternalAppLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_time_sheet/link/e;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f331329b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f331330a;

    /* compiled from: WorkTimeSheetDeepLinkModule_ProvideExternalAppLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_time_sheet/link/e$a;", "", "<init>", "()V", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k c cVar) {
        this.f331330a = cVar;
    }

    @n
    @k
    public static final e a(@k c cVar) {
        f331329b.getClass();
        return new e(cVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f331330a;
        f331329b.getClass();
        d.f331328a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WorkTimeSheetDeepLink.class, new h(), new C43834a.b.C11809b(cVar));
    }
}
