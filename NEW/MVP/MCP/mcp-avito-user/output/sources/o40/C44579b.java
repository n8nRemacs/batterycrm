package o40;

import Y61.k;
import Y61.l;
import com.avito.android.I1;
import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import com.avito.android.offlinization.beduin.analytics.PatternCacheStartResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import o40.InterfaceC44578a;

/* compiled from: BeduinPatternCacheMetrics.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo40/b;", "Lo40/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44579b implements InterfaceC44578a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44578a f419365b;

    @Inject
    public C44579b(@k I1 i12, @k g gVar) {
        InterfaceC44578a interfaceC44578a;
        n<Object> nVar = I1.f67278k0[62];
        if (((Boolean) i12.f67323j0.a().invoke()).booleanValue()) {
            interfaceC44578a = (InterfaceC44578a) gVar.get();
        } else {
            InterfaceC44578a.f419362a.getClass();
            interfaceC44578a = InterfaceC44578a.C12163a.f419364b;
        }
        this.f419365b = interfaceC44578a;
    }

    @Override // o40.InterfaceC44578a
    public final void a(@k String str, @l String str2, @l Long l12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
        this.f419365b.a(str, str2, l12, beduinPatternCacheErrorType);
    }

    @Override // o40.InterfaceC44578a
    public final void b(@k String str, @l String str2, @l String str3, boolean z12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
        this.f419365b.b(str, str2, str3, z12, beduinPatternCacheErrorType);
    }

    @Override // o40.InterfaceC44578a
    public final void c(@k PatternCacheStartResult patternCacheStartResult) {
        this.f419365b.c(patternCacheStartResult);
    }
}
