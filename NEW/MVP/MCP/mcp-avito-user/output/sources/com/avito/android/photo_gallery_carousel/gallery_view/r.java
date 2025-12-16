package com.avito.android.photo_gallery_carousel.gallery_view;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAiDesignHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/r;", "", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public int f217848b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f217850d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f217847a = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f217849c = new ArrayList();

    public final boolean a(int i12) {
        boolean zF2 = L.f(this.f217847a.get(Integer.valueOf(i12)), Boolean.TRUE);
        if (zF2) {
            this.f217848b = i12;
            ArrayList arrayList = this.f217849c;
            if (!arrayList.contains(Integer.valueOf(i12))) {
                Y41.a<G0> aVar = this.f217850d;
                if (aVar != null) {
                    aVar.invoke();
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        return zF2;
    }
}
