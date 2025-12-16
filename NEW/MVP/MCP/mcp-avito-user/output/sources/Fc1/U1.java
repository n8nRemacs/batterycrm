package Fc1;

import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13747u7 f5209a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13611f5 f5210b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I4 f5211c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, kotlinx.coroutines.N0> f5212d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f5213e;

    @Inject
    public U1(@Y61.k C13747u7 c13747u7, @Y61.k C13611f5 c13611f5, @Y61.k I4 i42, @Y61.k @Named("StartCampaignJobs") Map<String, kotlinx.coroutines.N0> map, @Y61.k @Named("IO") kotlinx.coroutines.T t12) {
        this.f5209a = c13747u7;
        this.f5210b = c13611f5;
        this.f5211c = i42;
        this.f5212d = map;
        this.f5213e = t12;
    }
}
