package com.avito.android.advert.item.beduin.v2.viewed;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ViewedTagState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/advert/item/beduin/v2/viewed/g;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/advert/item/beduin/v2/viewed/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements l<G, g> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f73385l = new h();

    public h() {
        super(1);
    }

    @Override // Y41.l
    public final g invoke(G g12) {
        String string = g12.getString("itemId");
        if (string == null) {
            string = "";
        }
        return new g(string);
    }
}
