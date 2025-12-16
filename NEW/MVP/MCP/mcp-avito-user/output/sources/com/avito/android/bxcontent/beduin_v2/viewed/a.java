package com.avito.android.bxcontent.beduin_v2.viewed;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BxViewedTagState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/bxcontent/beduin_v2/viewed/h;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/bxcontent/beduin_v2/viewed/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements l<G, h> {

    /* renamed from: l, reason: collision with root package name */
    public static final a f109544l = new a();

    public a() {
        super(1);
    }

    @Override // Y41.l
    public final h invoke(G g12) {
        String string = g12.getString("itemId");
        if (string == null) {
            string = "";
        }
        return new h(string);
    }
}
