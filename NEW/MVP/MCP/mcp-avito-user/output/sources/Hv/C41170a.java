package hv;

import Y61.k;
import androidx.view.C23060r0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.bundle.DeeplinkBundleSaver;
import ev.AbstractC40161a;
import iv.C42114a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BaseDeeplinkHandlerFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhv/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C41170a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.registry.result.a f398292a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeeplinkBundleSaver f398293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42114a f398294c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C23060r0 f398295d;

    public C41170a(@k com.avito.android.deeplink_handler.handler.registry.result.a aVar, @k DeeplinkBundleSaver deeplinkBundleSaver, @k C42114a c42114a, @k C23060r0 c23060r0) {
        this.f398292a = aVar;
        this.f398293b = deeplinkBundleSaver;
        this.f398294c = c42114a;
        this.f398295d = c23060r0;
    }

    public final void a(AbstractC40161a<DeepLink> abstractC40161a, String str, String str2, com.avito.android.deeplink_handler.handler.bundle.a aVar) {
        abstractC40161a.f395445c.f134523a.set(aVar);
        abstractC40161a.f395444b = str2;
        abstractC40161a.f395446d = this.f398295d;
        abstractC40161a.f();
        this.f398294c.f405355a.put(abstractC40161a.f395444b, abstractC40161a);
        this.f398292a.a(abstractC40161a, str);
    }
}
