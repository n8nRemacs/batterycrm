package com.avito.android.lib.beduin_v2.feature.launchclient;

import Y61.k;
import com.avito.android.deep_linking.x;
import dagger.internal.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2DeeplinkLaunchClient_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/launchclient/d;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/b;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f176215d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final cv.e f176216a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dagger.internal.f f176217b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f176218c;

    /* compiled from: BeduinV2DeeplinkLaunchClient_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/launchclient/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k cv.e eVar, @k dagger.internal.f fVar, @k p pVar) {
        this.f176216a = eVar;
        this.f176217b = fVar;
        this.f176218c = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f176216a.get();
        x xVar = (x) this.f176217b.get();
        Map map = (Map) this.f176218c.get();
        f176215d.getClass();
        return new b(aVar, xVar, map);
    }
}
