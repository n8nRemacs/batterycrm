package coil.util;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageLoaderOptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/util/t;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58794a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58795b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58796c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58797d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ExifOrientationPolicy f58798e;

    public t() {
        this(false, false, false, 0, null, 31, null);
    }

    public t(boolean z12, boolean z13, boolean z14, int i12, @Y61.k ExifOrientationPolicy exifOrientationPolicy) {
        this.f58794a = z12;
        this.f58795b = z13;
        this.f58796c = z14;
        this.f58797d = i12;
        this.f58798e = exifOrientationPolicy;
    }

    public /* synthetic */ t(boolean z12, boolean z13, boolean z14, int i12, ExifOrientationPolicy exifOrientationPolicy, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? true : z12, (i13 & 2) != 0 ? true : z13, (i13 & 4) == 0 ? z14 : true, (i13 & 8) != 0 ? 4 : i12, (i13 & 16) != 0 ? ExifOrientationPolicy.f58274b : exifOrientationPolicy);
    }
}
