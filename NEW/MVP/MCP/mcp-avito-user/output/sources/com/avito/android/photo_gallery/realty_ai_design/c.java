package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageComparisonSlider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f217588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f217589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f217591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217592p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f217593q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f217594r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Image image, Image image2, Y41.a aVar, Y41.l lVar, Y41.a aVar2, ViewGroup viewGroup, v vVar, float f12, float f13, float f14, int i12) {
        super(2);
        this.f217588l = image;
        this.f217589m = image2;
        this.f217590n = aVar;
        this.f217591o = lVar;
        this.f217592p = aVar2;
        this.f217593q = viewGroup;
        this.f217594r = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(262217);
        Y41.a<G0> aVar = this.f217590n;
        Y41.l<String, G0> lVar = this.f217591o;
        Y41.a<G0> aVar2 = this.f217592p;
        ViewGroup viewGroup = this.f217593q;
        m.b(this.f217588l, this.f217589m, aVar, lVar, aVar2, viewGroup, a12, iA2);
        return G0.f406611a;
    }
}
