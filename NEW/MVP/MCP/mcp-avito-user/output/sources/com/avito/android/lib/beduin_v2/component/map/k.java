package com.avito.android.lib.beduin_v2.component.map;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PinDrawable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/k;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/lib/beduin_v2/component/map/k$a;", "Lcom/avito/android/lib/beduin_v2/component/map/k$b;", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class k {

    /* compiled from: PinDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/k$a;", "Lcom/avito/android/lib/beduin_v2/component/map/k;", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Drawable f175859a;

        /* renamed from: b, reason: collision with root package name */
        public final int f175860b;

        /* renamed from: c, reason: collision with root package name */
        public final int f175861c;

        public a(@Y61.k Drawable drawable, @U int i12, @U int i13) {
            super(null);
            this.f175859a = drawable;
            this.f175860b = i12;
            this.f175861c = i13;
        }

        @Override // com.avito.android.lib.beduin_v2.component.map.k
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Drawable getF175862a() {
            return this.f175859a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f175859a, aVar.f175859a) && this.f175860b == aVar.f175860b && this.f175861c == aVar.f175861c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f175861c) + r.e(this.f175860b, this.f175859a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(drawable=");
            sb2.append(this.f175859a);
            sb2.append(", width=");
            sb2.append(this.f175860b);
            sb2.append(", height=");
            return r.t(sb2, this.f175861c, ')');
        }
    }

    /* compiled from: PinDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/k$b;", "Lcom/avito/android/lib/beduin_v2/component/map/k;", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Drawable f175862a;

        public b(@Y61.k Drawable drawable) {
            super(null);
            this.f175862a = drawable;
        }

        @Override // com.avito.android.lib.beduin_v2.component.map.k
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Drawable getF175862a() {
            return this.f175862a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f175862a, ((b) obj).f175862a);
        }

        public final int hashCode() {
            return this.f175862a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Remote(drawable=" + this.f175862a + ')';
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract Drawable getF175862a();

    public k() {
    }
}
