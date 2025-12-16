package com.avito.android.publish.items.iac_for_pro_enabled;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.items.iac_for_pro_enabled.IacForProEnabledItem;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacForProEnabledItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/f;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<IacForProEnabledItem.b> f236950b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f236951c = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public f() {
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.d
    /* renamed from: J0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF236950b() {
        return this.f236950b;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (IacForProEnabledItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        IacForProEnabledItem iacForProEnabledItem = (IacForProEnabledItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(hVar, iacForProEnabledItem);
        } else if (cVar.f236947a != null) {
            hVar.C7(iacForProEnabledItem.f236934c);
        }
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.d
    public final z j() {
        return this.f236951c;
    }

    public final void k(@k h hVar, @k IacForProEnabledItem iacForProEnabledItem) {
        hVar.hJ(new e(this, iacForProEnabledItem));
        hVar.setTitle(iacForProEnabledItem.f236935d);
        AttributedText attributedText = iacForProEnabledItem.f236936e;
        hVar.r(attributedText);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 10));
        hVar.Ka(iacForProEnabledItem.f236937f);
        hVar.C7(iacForProEnabledItem.f236934c);
    }
}
