package com.avito.android.lib.design.point;

import Y41.l;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;

/* compiled from: Point.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Point f180072l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Point point) {
        super(1);
        this.f180072l = point;
    }

    @Override // Y41.l
    public final G0 invoke(Float f12) {
        float fFloatValue = f12.floatValue();
        Point point = this.f180072l;
        point.f180063k = fFloatValue;
        float f13 = point.f180061i;
        float f14 = point.f180060h;
        point.f180055c.setAlpha((int) (s.f(r.c(f13, f14, fFloatValue, f14), f14, f13) * 255));
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        point.postInvalidateOnAnimation();
        return G0.f406611a;
    }
}
