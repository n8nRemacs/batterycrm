package com.avito.android.blueprint.switcher;

import Hj.C13996a;
import Rh.C15041a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishSwitcherPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/switcher/e;", "Lcom/avito/android/blueprint/switcher/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.b> f105771b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105772c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105773d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105774e;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<com.avito.android.items.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105771b = cVar;
        this.f105772c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105773d = cVar2;
        this.f105774e = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        com.avito.android.items.b bVar = (com.avito.android.items.b) aVar;
        gVar.setText(bVar.f173928c);
        AttributedText attributedText = bVar.f173930e;
        gVar.Fj(attributedText);
        gVar.setChecked(bVar.f173929d);
        gVar.setEnabled(bVar.f173936k);
        BaseListItem.Alignment alignment = bVar.f173940o;
        if (alignment != null) {
            gVar.j9(alignment);
        }
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new C15041a(this, 19));
        }
        gVar.k0(bVar.f173937l);
        gVar.S1(new d(bVar, this));
        String str = bVar.f173933h;
        if (str == null) {
            str = "";
        }
        gVar.a60(new C13996a(str, bVar.f173931f, bVar.f173934i, bVar.f173938m, null, null, null, bVar.f173932g, null, 368, null));
    }

    @Override // com.avito.android.blueprint.switcher.c
    @k
    public final z<com.avito.android.items.b> b() {
        return this.f105772c;
    }

    @Override // com.avito.android.blueprint.switcher.c
    @k
    /* renamed from: v, reason: from getter */
    public final C41981q0 getF105774e() {
        return this.f105774e;
    }
}
