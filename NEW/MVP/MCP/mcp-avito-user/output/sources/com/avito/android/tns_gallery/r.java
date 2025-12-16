package com.avito.android.tns_gallery;

import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TnsGallerySettings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/r;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f301555a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f301556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f301557c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f301558d;

    /* renamed from: e, reason: collision with root package name */
    public final int f301559e;

    /* renamed from: f, reason: collision with root package name */
    public final int f301560f;

    public r() {
        this(null, null, null, null, 0, 0, 63, null);
    }

    public r(Integer num, Integer num2, Integer num3, Integer num4, int i12, int i13, int i14, C42822w c42822w) {
        num = (i14 & 1) != 0 ? null : num;
        num2 = (i14 & 2) != 0 ? null : num2;
        num3 = (i14 & 4) != 0 ? null : num3;
        num4 = (i14 & 8) != 0 ? null : num4;
        i12 = (i14 & 16) != 0 ? y6.b(5) : i12;
        i13 = (i14 & 32) != 0 ? y6.b(5) : i13;
        this.f301555a = num;
        this.f301556b = num2;
        this.f301557c = num3;
        this.f301558d = num4;
        this.f301559e = i12;
        this.f301560f = i13;
    }
}
