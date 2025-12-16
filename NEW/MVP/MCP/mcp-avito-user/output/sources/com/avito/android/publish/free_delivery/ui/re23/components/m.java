package com.avito.android.publish.free_delivery.ui.re23.components;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f235981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f235982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f235983n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f235984o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Image image, v vVar, float f12, int i12) {
        super(2);
        this.f235981l = str;
        this.f235982m = image;
        this.f235983n = vVar;
        this.f235984o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f235984o | 1);
        o.a(this.f235981l, this.f235982m, this.f235983n, a12, iA2);
        return G0.f406611a;
    }
}
