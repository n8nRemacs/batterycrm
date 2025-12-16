package com.avito.android.work_time_sheet.link;

import X41.n;
import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkTimeSheetDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_time_sheet/link/c;", "Ldagger/internal/h;", "Lcom/avito/android/work_time_sheet/link/b;", "a", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f331326b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f331327a;

    /* compiled from: WorkTimeSheetDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_time_sheet/link/c$a;", "", "<init>", "()V", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k dv.b bVar) {
        this.f331327a = bVar;
    }

    @n
    @k
    public static final c a(@k dv.b bVar) {
        f331326b.getClass();
        return new c(bVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f331327a.get();
        f331326b.getClass();
        return new b(dVar);
    }
}
