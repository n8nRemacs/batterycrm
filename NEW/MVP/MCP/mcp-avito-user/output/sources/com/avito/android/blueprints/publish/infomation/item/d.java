package com.avito.android.blueprints.publish.infomation.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;

/* compiled from: DisclaimerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/blueprints/publish/infomation/item/d;", "LTV0/d;", "Lcom/avito/android/blueprints/publish/infomation/item/e;", "Lcom/avito/android/blueprints/publish/infomation/item/DisclaimerItem;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<e, DisclaimerItem> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f106329b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f106330c;

    public d() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f106329b = eVar;
        this.f106330c = new C41981q0(eVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        DisclaimerItem disclaimerItem = (DisclaimerItem) aVar;
        eVar2.k(disclaimerItem.f106318d);
        eVar2.l20(disclaimerItem.f106319e);
        UniversalImage universalImage = disclaimerItem.f106320f;
        if (universalImage == null) {
            eVar2.p0();
        } else {
            eVar2.b30(universalImage);
        }
        eVar2.zt(disclaimerItem.f106321g);
        AttributedText attributedText = disclaimerItem.f106317c;
        eVar2.r(attributedText);
        attributedText.linkClicksV3().t0(new com.avito.android.api.a(15, new c(1, this.f106329b, io.reactivex.rxjava3.subjects.e.class, "onNext", "onNext(Ljava/lang/Object;)V", 0)));
        if (universalImage != null) {
            eVar2.RN(disclaimerItem.f106322h);
        }
    }

    @k
    public final z<DeepLink> k() {
        return this.f106330c;
    }
}
