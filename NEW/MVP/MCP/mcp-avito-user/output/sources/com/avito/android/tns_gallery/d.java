package com.avito.android.tns_gallery;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryItemCornerRadiusHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/d;", "Lcom/avito/android/tns_gallery/c;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f301527a;

    @Inject
    public d(@Y61.k r rVar) {
        this.f301527a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.tns_gallery.c
    @Y61.k
    public final float[] a(int i12, int i13) {
        r rVar = this.f301527a;
        Q q12 = i13 == 0 ? new Q(Integer.valueOf(rVar.f301559e), Integer.valueOf(rVar.f301559e)) : i12 == 0 ? new Q(Integer.valueOf(rVar.f301559e), Integer.valueOf(rVar.f301560f)) : i12 == i13 ? new Q(Integer.valueOf(rVar.f301560f), Integer.valueOf(rVar.f301559e)) : new Q(Integer.valueOf(rVar.f301560f), Integer.valueOf(rVar.f301560f));
        Float fValueOf = Float.valueOf(((Number) q12.f406619b).intValue());
        Float fValueOf2 = Float.valueOf(((Number) q12.f406620c).intValue());
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        return new float[]{fFloatValue, fFloatValue, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue, fFloatValue};
    }
}
