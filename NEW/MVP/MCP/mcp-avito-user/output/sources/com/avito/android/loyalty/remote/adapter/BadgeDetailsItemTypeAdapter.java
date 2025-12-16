package com.avito.android.loyalty.remote.adapter;

import Y61.k;
import cX.C27117c;
import cX.InterfaceC27115a;
import cX.d;
import cX.e;
import cX.f;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BadgeDetailsItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/BadgeDetailsItemTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "LcX/a;", "<init>", "()V", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgeDetailsItemTypeAdapter extends RuntimeTypeAdapter<InterfaceC27115a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f183238a;

    public BadgeDetailsItemTypeAdapter() {
        super(null, "args", null, 5, null);
        this.f183238a = P0.g(new Q("collapse", C27117c.class), new Q("text", f.class), new Q(SpacerAttribute.ATTRIBUTE_TYPE, e.class), new Q("image", d.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f183238a;
    }
}
