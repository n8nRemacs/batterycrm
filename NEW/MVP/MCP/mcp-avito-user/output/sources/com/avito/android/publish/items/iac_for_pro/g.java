package com.avito.android.publish.items.iac_for_pro;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacForProItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/g;", "Lcom/avito/android/publish/items/iac_for_pro/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<IacForProItem.b> f236921b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f236922c = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g() {
    }

    @Override // com.avito.android.publish.items.iac_for_pro.d
    /* renamed from: J0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF236921b() {
        return this.f236921b;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (IacForProItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        IacForProItem iacForProItem = (IacForProItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(iVar, iacForProItem);
        } else if (cVar.f236916a != null) {
            iVar.C7(iacForProItem.f236904c);
        }
    }

    @Override // com.avito.android.publish.items.iac_for_pro.d
    public final z j() {
        return this.f236922c;
    }

    public final void k(@k i iVar, @k IacForProItem iacForProItem) {
        iVar.mH(new e(this, iacForProItem));
        iVar.setTitle(iacForProItem.f236905d);
        iVar.setText(iacForProItem.f236906e);
        iVar.me(iacForProItem.f236907f);
        iVar.C7(iacForProItem.f236904c);
        if (iacForProItem.f236909h) {
            iVar.Ck();
        }
        if (iacForProItem.f236910i) {
            iVar.et(new f(this));
        }
    }
}
