package Qv0;

import Y61.k;
import com.avito.android.deep_linking.links.ShareLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ShareLinkHandlerModule_ProvideShareLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LQv0/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_share_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14029b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f14030a;

    /* compiled from: ShareLinkHandlerModule_ProvideShareLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQv0/c$a;", "", "<init>", "()V", "_avito_share_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k d dVar) {
        this.f14030a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f14029b.getClass();
        b.f14028a.getClass();
        return new C43834a(ShareLink.class, null, new C43834a.b.C11809b(this.f14030a));
    }
}
