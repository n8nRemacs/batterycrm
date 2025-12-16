package com.yandex.div.core.view2;

import android.graphics.Paint;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: ShadowCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/d0;", "", "<init>", "()V", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d0 f367997a = new d0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Paint f367998b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f367999c = new LinkedHashMap();

    /* compiled from: ShadowCache.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/d0$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final float[] f368000a;

        /* renamed from: b, reason: collision with root package name */
        public final float f368001b;

        public a(@Y61.k float[] fArr, float f12) {
            this.f368000a = fArr;
            this.f368001b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f368001b == aVar.f368001b && Arrays.equals(this.f368000a, aVar.f368000a);
        }

        public final int hashCode() {
            return Float.hashCode(this.f368001b) + (Arrays.hashCode(this.f368000a) * 31);
        }
    }
}
