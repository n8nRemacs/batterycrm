package com.avito.android.image.enhancement;

import android.net.Uri;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageEnhanceState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/h;", "", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.image.enhancement.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C30977h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f169373a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f169374b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f169375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ImagesEnhancementSlotConfig f169376d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<Uri> f169377e;

    /* JADX WARN: Multi-variable type inference failed */
    public C30977h(boolean z12, boolean z13, boolean z14, @Y61.l ImagesEnhancementSlotConfig imagesEnhancementSlotConfig, @Y61.k Set<? extends Uri> set) {
        this.f169373a = z12;
        this.f169374b = z13;
        this.f169375c = z14;
        this.f169376d = imagesEnhancementSlotConfig;
        this.f169377e = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C30977h a(C30977h c30977h, boolean z12, boolean z13, LinkedHashSet linkedHashSet, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c30977h.f169373a;
        }
        boolean z14 = z12;
        if ((i12 & 2) != 0) {
            z13 = c30977h.f169374b;
        }
        boolean z15 = z13;
        boolean z16 = c30977h.f169375c;
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = c30977h.f169376d;
        Set set = linkedHashSet;
        if ((i12 & 16) != 0) {
            set = c30977h.f169377e;
        }
        c30977h.getClass();
        return new C30977h(z14, z15, z16, imagesEnhancementSlotConfig, set);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30977h)) {
            return false;
        }
        C30977h c30977h = (C30977h) obj;
        return this.f169373a == c30977h.f169373a && this.f169374b == c30977h.f169374b && this.f169375c == c30977h.f169375c && kotlin.jvm.internal.L.f(this.f169376d, c30977h.f169376d) && kotlin.jvm.internal.L.f(this.f169377e, c30977h.f169377e);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(this.f169373a) * 31, 31, this.f169374b), 31, this.f169375c);
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = this.f169376d;
        return this.f169377e.hashCode() + ((i12 + (imagesEnhancementSlotConfig == null ? 0 : imagesEnhancementSlotConfig.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageEnhanceState(showToggle=");
        sb2.append(this.f169373a);
        sb2.append(", isToggleEnabled=");
        sb2.append(this.f169374b);
        sb2.append(", isFeatureEnabled=");
        sb2.append(this.f169375c);
        sb2.append(", config=");
        sb2.append(this.f169376d);
        sb2.append(", disabledSellerTest=");
        return AK.c.u(sb2, this.f169377e, ')');
    }

    public C30977h(boolean z12, boolean z13, boolean z14, ImagesEnhancementSlotConfig imagesEnhancementSlotConfig, Set set, int i12, C42822w c42822w) {
        this(z12, z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? null : imagesEnhancementSlotConfig, (i12 & 16) != 0 ? B0.f406639b : set);
    }
}
