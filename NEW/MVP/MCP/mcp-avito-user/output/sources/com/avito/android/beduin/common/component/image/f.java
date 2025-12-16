package com.avito.android.beduin.common.component.image;

import Y61.l;
import android.graphics.drawable.GradientDrawable;
import com.avito.android.image_loader.o;
import kotlin.Metadata;

/* compiled from: BeduinImageComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/image/f;", "Lcom/avito/android/image_loader/o;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f101460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GradientDrawable f101461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageStyle f101462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Size f101463e;

    public f(a aVar, GradientDrawable gradientDrawable, ImageStyle imageStyle, Size size) {
        this.f101460b = aVar;
        this.f101461c = gradientDrawable;
        this.f101462d = imageStyle;
        this.f101463e = size;
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        a aVar = this.f101460b;
        aVar.getOverlay().clear();
        aVar.getOverlay().add(this.f101461c);
        g.a(aVar, this.f101462d, this.f101463e);
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void S2() {
        a aVar = this.f101460b;
        aVar.getOverlay().clear();
        aVar.getOverlay().add(this.f101461c);
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        a aVar = this.f101460b;
        aVar.getOverlay().clear();
        aVar.getOverlay().add(this.f101461c);
    }
}
