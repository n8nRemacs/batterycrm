package bT;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2AnalyticsClient_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LbT/c;", "Ldagger/internal/h;", "LbT/a;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bT.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25555c implements h<C25553a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f57075b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57076a;

    /* compiled from: BeduinV2AnalyticsClient_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbT/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bT.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25555c(@k f fVar) {
        this.f57076a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f57076a.get();
        f57075b.getClass();
        return new C25553a(interfaceC28373a);
    }
}
