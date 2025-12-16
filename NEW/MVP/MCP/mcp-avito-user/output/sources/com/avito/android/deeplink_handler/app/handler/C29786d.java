package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.deep_linking.links.LogFirebaseEventLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: AnalyticsDeeplinkHandlerModule_ProvideFirebaseMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/d;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29786d implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f134415b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I f134416a;

    /* compiled from: AnalyticsDeeplinkHandlerModule_ProvideFirebaseMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/d$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29786d(@Y61.k I i12) {
        this.f134416a = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I i12 = this.f134416a;
        f134415b.getClass();
        C29783a.f134410a.getClass();
        return new C43834a(LogFirebaseEventLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LogFirebaseEventLink.class), i12));
    }
}
