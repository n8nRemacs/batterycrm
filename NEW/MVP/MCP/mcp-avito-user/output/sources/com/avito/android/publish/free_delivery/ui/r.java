package com.avito.android.publish.free_delivery.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f235938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f235939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f235940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12, Image image, String str) {
        super(2);
        this.f235938l = str;
        this.f235939m = image;
        this.f235940n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f235940n | 1);
        e.f(this.f235938l, this.f235939m, a12, iA2);
        return G0.f406611a;
    }
}
