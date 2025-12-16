package ev;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.W;
import io.reactivex.rxjava3.subjects.i;
import java.util.UUID;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: BaseSyncDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lev/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lcom/avito/android/deeplink_handler/handler/b;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ev.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC40162b<D extends DeepLink> implements com.avito.android.deeplink_handler.handler.b<D> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f395448b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i<C43501a> f395449c = new BK0.a().M0();

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final z<C43501a> V9() {
        return this.f395449c;
    }

    @k
    public abstract InterfaceC14249c.b c(@l Bundle bundle, @k DeepLink deepLink, @l String str);

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final W d9() {
        return b.a.b(this);
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    public final void r6(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        this.f395449c.onNext(new C43501a(new com.avito.android.deeplink_handler.handler.bundle.a(bundle, deepLink, str), c(bundle, deepLink, str)));
    }
}
