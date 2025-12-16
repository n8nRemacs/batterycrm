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
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f173013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f173014m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<Image> f173015n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f173016o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q<List<Image>, Integer, String, G0> f173017p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f173018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f173019r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12, int i13, List list, int i14, q qVar, v vVar, int i15) {
        super(2);
        this.f173013l = i12;
        this.f173014m = i13;
        this.f173015n = list;
        this.f173016o = i14;
        this.f173017p = qVar;
        this.f173018q = vVar;
        this.f173019r = i15;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f173019r | 1);
        v vVar = this.f173018q;
        int i12 = this.f173016o;
        q<List<Image>, Integer, String, G0> qVar = this.f173017p;
        e.b(this.f173013l, this.f173014m, this.f173015n, i12, qVar, vVar, a12, iA2);
        return G0.f406611a;
    }
}
