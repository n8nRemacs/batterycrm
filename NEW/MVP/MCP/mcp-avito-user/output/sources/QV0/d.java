package Qv0;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShareLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LQv0/d;", "Ldagger/internal/h;", "LQv0/a;", "a", "_avito_share_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements h<C14938a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f14031c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f14032a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C35868p2 f14033b;

    /* compiled from: ShareLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQv0/d$a;", "", "<init>", "()V", "_avito_share_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dv.b bVar, @k C35868p2 c35868p2) {
        this.f14032a = bVar;
        this.f14033b = c35868p2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f14032a.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f14033b.get();
        f14031c.getClass();
        return new C14938a(interfaceC4053a, interfaceC35845m2);
    }
}
