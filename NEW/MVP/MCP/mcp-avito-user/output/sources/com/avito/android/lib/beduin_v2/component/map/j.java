package com.avito.android.lib.beduin_v2.component.map;

import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RemotePinBitmapFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/j;", "", "a", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Bitmap f175854a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f175855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f175856c;

    /* compiled from: RemotePinBitmapFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/j$a;", "", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f175857a;

        /* renamed from: b, reason: collision with root package name */
        public final float f175858b;

        public a(float f12, float f13) {
            this.f175857a = f12;
            this.f175858b = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f175857a, aVar.f175857a) == 0 && Float.compare(this.f175858b, aVar.f175858b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f175858b) + (Float.hashCode(this.f175857a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Anchor(x=");
            sb2.append(this.f175857a);
            sb2.append(", y=");
            return r.k(')', this.f175858b, sb2);
        }
    }

    public j(@Y61.k Bitmap bitmap, @Y61.k a aVar, @Y61.k a aVar2) {
        this.f175854a = bitmap;
        this.f175855b = aVar;
        this.f175856c = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f175854a, jVar.f175854a) && L.f(this.f175855b, jVar.f175855b) && L.f(this.f175856c, jVar.f175856c);
    }

    public final int hashCode() {
        return this.f175856c.hashCode() + ((this.f175855b.hashCode() + (this.f175854a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PinBitmap(bitmap=" + this.f175854a + ", centerOfPin=" + this.f175855b + ", bottomCenterOfPin=" + this.f175856c + ')';
    }
}
