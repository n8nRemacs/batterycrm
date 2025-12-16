package com.avito.android.advertising.loaders.beduin.wrapper;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialWrapperState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/advertising/loaders/beduin/wrapper/d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/advertising/loaders/beduin/wrapper/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<G, d> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f88182l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final d invoke(G g12) {
        String string = g12.getString("localDataId");
        if (string == null) {
            string = "";
        }
        return new d(string);
    }
}
