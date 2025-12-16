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
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f173010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q<List<Image>, Integer, String, G0> f173011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f173012n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, q qVar, v vVar, int i12) {
        super(2);
        this.f173010l = list;
        this.f173011m = qVar;
        this.f173012n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        v vVar = this.f173012n;
        e.a(this.f173010l, this.f173011m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
