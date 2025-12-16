package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageComparisonSlider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f217577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f217578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f217579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f217580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f12, float f13, int i12, v vVar) {
        super(2);
        this.f217577l = f12;
        this.f217578m = f13;
        this.f217579n = vVar;
        this.f217580o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f217580o | 1);
        m.a(this.f217577l, this.f217578m, this.f217579n, a12, iA2);
        return G0.f406611a;
    }
}
