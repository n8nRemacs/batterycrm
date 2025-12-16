package com.avito.android.publish.slots.image.item;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ImageItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/image/item/b;", "LTV0/b;", "Lcom/avito/android/publish/slots/image/item/e;", "LJO/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<e, JO.e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f244099a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f244100b = new g.a<>(R.layout.publish_image_slot, a.f244098l);

    public b(@k c cVar) {
        this.f244099a = cVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, JO.e> a() {
        return this.f244099a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f244100b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof JO.e;
    }
}
