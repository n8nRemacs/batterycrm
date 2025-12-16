package com.avito.android.blueprints.publish.delivery_toggles;

import Hj.C13996a;
import Rh.C15041a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35799g4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliveryTogglesPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/g;", "Lcom/avito/android/blueprints/publish/delivery_toggles/e;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<PublishDeliveryTogglesItem> f106189b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106190c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f106191d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f106192e;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<PublishDeliveryTogglesItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106189b = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106190c = cVar2;
        this.f106191d = new C41981q0(cVar);
        this.f106192e = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((c) eVar, (PublishDeliveryTogglesItem) aVar);
    }

    @Override // com.avito.android.blueprints.publish.delivery_toggles.e
    @k
    public final z<PublishDeliveryTogglesItem> b() {
        return this.f106191d;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        c cVar = (c) eVar;
        PublishDeliveryTogglesItem publishDeliveryTogglesItem = (PublishDeliveryTogglesItem) aVar;
        Object obj = null;
        Object obj2 = null;
        for (Object obj3 : list) {
            if (obj3 instanceof C35799g4) {
                obj2 = obj3;
            }
        }
        if (!(obj2 instanceof C35799g4)) {
            obj2 = null;
        }
        C35799g4 c35799g4 = (C35799g4) obj2;
        if ((c35799g4 != null ? c35799g4.f318886a : null) == null) {
            k(cVar, publishDeliveryTogglesItem);
            return;
        }
        Iterator<T> it = publishDeliveryTogglesItem.f106174c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((DeliveryToggle) next).f106163b, c35799g4.f318886a)) {
                obj = next;
                break;
            }
        }
        cVar.IH((DeliveryToggle) obj);
    }

    public final void k(@k c cVar, @k PublishDeliveryTogglesItem publishDeliveryTogglesItem) {
        cVar.a60(new C13996a("", new ItemWithState.State.Normal(null, 1, null), true, false, null, null, null, null, null, 504, null));
        List<DeliveryToggle> list = publishDeliveryTogglesItem.f106174c;
        cVar.zs(list);
        cVar.yU(new f(publishDeliveryTogglesItem, this));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AttributedText attributedText = ((DeliveryToggle) it.next()).f106166e;
            if (attributedText != null) {
                attributedText.setOnDeepLinkClickListener(new C15041a(this, 20));
            }
        }
    }

    @Override // com.avito.android.blueprints.publish.delivery_toggles.e
    @k
    /* renamed from: v, reason: from getter */
    public final C41981q0 getF106192e() {
        return this.f106192e;
    }
}
