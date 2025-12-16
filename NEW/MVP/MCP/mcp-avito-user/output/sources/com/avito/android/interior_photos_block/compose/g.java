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
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f173030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q<List<Image>, Integer, String, G0> f173031m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f173032n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, q qVar, v vVar, int i12) {
        super(2);
        this.f173030l = list;
        this.f173031m = qVar;
        this.f173032n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        v vVar = this.f173032n;
        e.e(this.f173030l, this.f173031m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
