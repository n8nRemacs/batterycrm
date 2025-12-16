package com.avito.android.beduin.v2.page.impl.deeplinks;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2PageDeepLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/h;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/page/impl/deeplinks/g;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f105118b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f105119a;

    /* compiled from: BeduinV2PageDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/h$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k f fVar) {
        this.f105119a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f105119a.get();
        f105118b.getClass();
        return new g(eVar);
    }
}
