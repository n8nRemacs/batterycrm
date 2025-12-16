package com.avito.android.interior_photos_block.compose;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotos.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f173036l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q<List<Image>, Integer, String, G0> f173037m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f173038n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, q qVar, v vVar, int i12) {
        super(2);
        this.f173036l = list;
        this.f173037m = qVar;
        this.f173038n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        v vVar = this.f173038n;
        e.g(this.f173036l, this.f173037m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
