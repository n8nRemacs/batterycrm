package ev;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.C23060r0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.W;
import io.reactivex.rxjava3.subjects.i;
import j.InterfaceC42153i;
import j.k0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: BaseAsyncDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lev/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lcom/avito/android/deeplink_handler/handler/lifecycle/a;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ev.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC40161a<D extends DeepLink> implements com.avito.android.deeplink_handler.handler.lifecycle.a<D> {

    /* renamed from: d, reason: collision with root package name */
    public C23060r0 f395446d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f395444b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.bundle.b f395445c = new com.avito.android.deeplink_handler.handler.bundle.b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final i<C43501a> f395447e = new BK0.a().M0();

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final z<C43501a> V9() {
        return this.f395447e;
    }

    public abstract void a(@l Bundle bundle, @k DeepLink deepLink, @l String str);

    @l
    public final Bundle b() {
        com.avito.android.deeplink_handler.handler.bundle.a aVarD = d();
        if (aVarD != null) {
            return aVarD.f134522c;
        }
        return null;
    }

    @l
    public final D c() {
        com.avito.android.deeplink_handler.handler.bundle.a aVarD = d();
        DeepLink deepLink = aVarD != null ? aVarD.f134520a : null;
        if (deepLink != null) {
            return (D) deepLink;
        }
        return null;
    }

    @l
    public final com.avito.android.deeplink_handler.handler.bundle.a d() {
        return this.f395445c.f134523a.get();
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final W d9() {
        return b.a.b(this);
    }

    @l
    public final String e() {
        com.avito.android.deeplink_handler.handler.bundle.a aVarD = d();
        if (aVarD != null) {
            return aVarD.f134521b;
        }
        return null;
    }

    @InterfaceC42153i
    @k0
    public void i(@k InterfaceC14249c.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k DeepLink... deepLinkArr) {
        com.avito.android.deeplink_handler.handler.bundle.a andSet = this.f395445c.f134523a.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.f395447e.onNext(new C43501a(andSet, aVar));
        for (DeepLink deepLink : deepLinkArr) {
            aVar2.r6(andSet.f134522c, deepLink, andSet.f134521b);
        }
    }

    @InterfaceC42153i
    @k0
    public void j(@k InterfaceC14249c.b bVar) {
        com.avito.android.deeplink_handler.handler.bundle.a andSet = this.f395445c.f134523a.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.f395447e.onNext(new C43501a(andSet, bVar));
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    public final void r6(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        this.f395445c.f134523a.set(new com.avito.android.deeplink_handler.handler.bundle.a(bundle, deepLink, str));
        a(bundle, deepLink, str);
    }

    public void f() {
    }

    public void g() {
    }

    public void nc() {
    }
}
