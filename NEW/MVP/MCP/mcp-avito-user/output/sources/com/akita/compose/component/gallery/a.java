package com.akita.compose.component.gallery;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22374n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f61586l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f61587m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61588n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n f61589o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f61590p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Object obj, androidx.compose.ui.v vVar, InterfaceC22374n interfaceC22374n, int i12) {
        super(2);
        this.f61586l = dVar;
        this.f61587m = obj;
        this.f61588n = vVar;
        this.f61589o = interfaceC22374n;
        this.f61590p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61590p | 1);
        b.a(this.f61586l, this.f61587m, this.f61589o, a12, iA2);
        return G0.f406611a;
    }
}
