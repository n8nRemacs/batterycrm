package qG0;

import Y61.l;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalMapEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqG0/b;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47291b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f429140a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AvitoMapBounds f429141b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AvitoMapPoint f429142c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f429143d;

    public C47291b() {
        this(false, null, null, null, 15, null);
    }

    public C47291b(boolean z12, AvitoMapBounds avitoMapBounds, AvitoMapPoint avitoMapPoint, Float f12, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        avitoMapBounds = (i12 & 2) != 0 ? null : avitoMapBounds;
        avitoMapPoint = (i12 & 4) != 0 ? null : avitoMapPoint;
        f12 = (i12 & 8) != 0 ? null : f12;
        this.f429140a = z12;
        this.f429141b = avitoMapBounds;
        this.f429142c = avitoMapPoint;
        this.f429143d = f12;
    }
}
