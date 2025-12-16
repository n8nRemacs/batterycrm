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
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f217581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f217582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f217584o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217585p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f217586q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f217587r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Image image, Image image2, Y41.a aVar, Y41.l lVar, Y41.a aVar2, ViewGroup viewGroup, v vVar, float f12, float f13, float f14, int i12) {
        super(2);
        this.f217581l = image;
        this.f217582m = image2;
        this.f217583n = aVar;
        this.f217584o = lVar;
        this.f217585p = aVar2;
        this.f217586q = viewGroup;
        this.f217587r = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(262217);
        Y41.a<G0> aVar = this.f217583n;
        Y41.l<String, G0> lVar = this.f217584o;
        Y41.a<G0> aVar2 = this.f217585p;
        ViewGroup viewGroup = this.f217586q;
        m.b(this.f217581l, this.f217582m, aVar, lVar, aVar2, viewGroup, a12, iA2);
        return G0.f406611a;
    }
}
