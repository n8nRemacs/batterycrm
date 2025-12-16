package com.avito.android.offlinization.beduin;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.BeduinPatternCachingTestGroup;
import com.avito.android.offlinization.beduin.analytics.PatternCacheStartResult;
import com.avito.android.offlinization.beduin.e;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import o40.InterfaceC44578a;
import q40.C47197a;

/* compiled from: BeduinCacheStarter.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/beduin/c;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f208530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f208531b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I1 f208532c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BeduinPatternCachingTestGroup f208533d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44578a f208534e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final v40.b f208535f;

    @Inject
    public c(@Y61.k p pVar, @Y61.k h hVar, @Y61.k I1 i12, @Y61.k BeduinPatternCachingTestGroup beduinPatternCachingTestGroup, @Y61.k InterfaceC44578a interfaceC44578a, @Y61.k v40.b bVar) {
        this.f208530a = pVar;
        this.f208531b = hVar;
        this.f208532c = i12;
        this.f208533d = beduinPatternCachingTestGroup;
        this.f208534e = interfaceC44578a;
        this.f208535f = bVar;
    }

    @Y61.k
    public final e a() {
        I1 i12 = this.f208532c;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[61];
        if (!((Boolean) i12.f67321i0.a().invoke()).booleanValue()) {
            BeduinPatternCachingTestGroup beduinPatternCachingTestGroup = this.f208533d;
            beduinPatternCachingTestGroup.getClass();
            if (beduinPatternCachingTestGroup != BeduinPatternCachingTestGroup.f67784d) {
                e.f208543a.getClass();
                return e.a.f208545b;
            }
        }
        p pVar = this.f208530a;
        boolean z12 = pVar.f208563a.getFreeSpace() - 10485760 >= 10485760 * ((long) 6);
        InterfaceC44578a interfaceC44578a = this.f208534e;
        if (z12) {
            f fVar = (f) this.f208531b.get();
            interfaceC44578a.c(PatternCacheStartResult.f208524c);
            com.avito.android.offlinization.ui.k.a(new b(this), C43175k.G(new a(this, pVar, null)));
            return new C47197a(fVar, this.f208535f);
        }
        e.f208543a.getClass();
        e.a.C6219a c6219a = e.a.f208545b;
        interfaceC44578a.c(PatternCacheStartResult.f208525d);
        return c6219a;
    }
}
