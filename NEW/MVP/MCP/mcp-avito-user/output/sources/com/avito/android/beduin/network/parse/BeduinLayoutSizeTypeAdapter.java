package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BeduinLayoutSizeTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinLayoutSizeTypeAdapter;", "Lcom/avito/android/beduin/network/parse/BeduinMapByTypeAdapter;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinLayoutSizeTypeAdapter extends BeduinMapByTypeAdapter<BeduinLayoutSize> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f104042a = P0.g(new Q("wrapContent", BeduinLayoutSize.WrapContent.class), new Q("matchParent", BeduinLayoutSize.MatchParent.class), new Q("fixed", BeduinLayoutSize.Fixed.class));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.beduin.common.component.model.BeduinLayoutSize>>] */
    @Override // com.avito.android.beduin.network.parse.BeduinMapByTypeAdapter
    @k
    public final Map<String, Class<? extends BeduinLayoutSize>> a() {
        return this.f104042a;
    }
}
