package com.avito.android.free_delivery.ui.re23.components;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f158902l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f158903m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f158904n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f158905o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, UniversalImage universalImage, v vVar, float f12, int i12) {
        super(2);
        this.f158902l = str;
        this.f158903m = universalImage;
        this.f158904n = vVar;
        this.f158905o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f158905o | 1);
        o.a(this.f158902l, this.f158903m, this.f158904n, a12, iA2);
        return G0.f406611a;
    }
}
