package com.avito.android.beduin.v2.page.impl.deeplinks;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.impl.x;
import com.avito.android.beduin.v2.page.o;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2PageBaseDeepLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/f;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/page/impl/deeplinks/e;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f105113d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f105114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f105115b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dv.b f105116c;

    /* compiled from: BeduinV2PageBaseDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/f$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k dv.b bVar, @Y61.k x xVar, @Y61.k dv.b bVar2) {
        this.f105114a = bVar;
        this.f105115b = xVar;
        this.f105116c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f105114a.get();
        o oVar = (o) this.f105115b.get();
        a.b bVar = (a.b) this.f105116c.get();
        f105113d.getClass();
        return new e(interfaceC4053a, oVar, bVar);
    }
}
