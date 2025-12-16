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
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f217627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f217628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217629n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f217630o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217631p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f217632q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f217633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Image image, Image image2, Y41.a aVar, Y41.l lVar, Y41.a aVar2, ViewGroup viewGroup, v vVar, float f12, float f13, float f14, int i12) {
        super(2);
        this.f217627l = image;
        this.f217628m = image2;
        this.f217629n = aVar;
        this.f217630o = lVar;
        this.f217631p = aVar2;
        this.f217632q = viewGroup;
        this.f217633r = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(262217);
        Y41.a<G0> aVar = this.f217629n;
        Y41.l<String, G0> lVar = this.f217630o;
        Y41.a<G0> aVar2 = this.f217631p;
        ViewGroup viewGroup = this.f217632q;
        m.b(this.f217627l, this.f217628m, aVar, lVar, aVar2, viewGroup, a12, iA2);
        return G0.f406611a;
    }
}
