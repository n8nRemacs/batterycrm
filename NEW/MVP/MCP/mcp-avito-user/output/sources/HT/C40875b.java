package hT;

import Y61.k;
import com.google.gson.Gson;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2SendV1ActionsClient_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LhT/b;", "Ldagger/internal/h;", "LhT/a;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hT.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40875b implements h<C40874a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f397204c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<Gson> f397205a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC49066a> f397206b;

    /* compiled from: BeduinV2SendV1ActionsClient_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhT/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hT.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40875b(@k Provider<Gson> provider, @k Provider<InterfaceC49066a> provider2) {
        this.f397205a = provider;
        this.f397206b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f397205a.get();
        InterfaceC49066a interfaceC49066a = this.f397206b.get();
        f397204c.getClass();
        return new C40874a(gson, interfaceC49066a);
    }
}
