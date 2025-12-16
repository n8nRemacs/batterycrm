package com.avito.android.constructor_advert.ui.serp.constructor;

import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertDimensionProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/t;", "", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f125830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125831b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f125832c;

    public t(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        this.f125830a = i12;
        this.f125831b = i13;
        this.f125832c = viewContext;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f125830a == tVar.f125830a && this.f125831b == tVar.f125831b && this.f125832c == tVar.f125832c;
    }

    public final int hashCode() {
        return this.f125832c.hashCode() + androidx.appcompat.app.r.e(this.f125831b, Integer.hashCode(this.f125830a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "ConstructorGalleryDimensions(width=" + this.f125830a + ", height=" + this.f125831b + ", viewContext=" + this.f125832c + ')';
    }
}
