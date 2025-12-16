package Fj;

import Y61.k;
import com.avito.android.blocked_ip.deep_linking.e;
import com.avito.android.deep_linking.links.BlockedIpScreenLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: BlockedIpMappingsModule_ProvideBlockedIpScreenLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFj/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_blocked-ip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13807b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f5961b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f5962a;

    /* compiled from: BlockedIpMappingsModule_ProvideBlockedIpScreenLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFj/b$a;", "", "<init>", "()V", "_avito_blocked-ip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fj.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13807b(@k e eVar) {
        this.f5962a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f5962a;
        f5961b.getClass();
        C13806a.f5960a.getClass();
        return new C43834a(BlockedIpScreenLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BlockedIpScreenLink.class), eVar));
    }
}
