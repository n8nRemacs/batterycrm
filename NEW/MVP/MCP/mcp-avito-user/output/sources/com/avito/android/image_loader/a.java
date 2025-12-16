package com.avito.android.image_loader;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoPicture.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/a;", "Lcom/avito/android/image_loader/m;", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f169517c;

    public /* synthetic */ a(Image image, Boolean bool, int i12, C42822w c42822w) {
        this(image, (i12 & 2) != 0 ? null : bool);
    }

    @Override // com.avito.android.image_loader.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Image getF169517c() {
        return this.f169517c;
    }

    @Override // com.avito.android.image_loader.m
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (a.class.equals(obj != null ? obj.getClass() : null) && super.equals(obj)) {
            return L.f(this.f169517c, ((a) obj).f169517c);
        }
        return false;
    }

    @Override // com.avito.android.image_loader.m
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Image image = this.f169517c;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }

    public a(@Y61.l Image image, @Y61.l Boolean bool) {
        super(image, bool);
        this.f169517c = image;
    }
}
