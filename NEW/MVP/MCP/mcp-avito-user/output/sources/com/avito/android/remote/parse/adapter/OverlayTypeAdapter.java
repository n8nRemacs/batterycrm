package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Overlay;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: OverlayTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/OverlayTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/Overlay;", "<init>", "()V", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OverlayTypeAdapter extends RuntimeTypeAdapter<Overlay> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254202a;

    public OverlayTypeAdapter() {
        super(null, "content", null, 5, null);
        this.f254202a = P0.g(new kotlin.Q("label", Overlay.Label.class), new kotlin.Q("compactLabel", Overlay.CompactLabel.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.Overlay>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends Overlay>> getMapping() {
        return this.f254202a;
    }
}
