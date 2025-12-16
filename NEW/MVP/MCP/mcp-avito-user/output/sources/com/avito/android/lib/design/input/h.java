package com.avito.android.lib.design.input;

import android.content.res.TypedArray;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/res/TypedArray;", "Lkotlin/G0;", "invoke", "(Landroid/content/res/TypedArray;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<TypedArray, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Input f179406l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Input input) {
        super(1);
        this.f179406l = input;
    }

    @Override // Y41.l
    public final G0 invoke(TypedArray typedArray) {
        TypedArray typedArray2 = typedArray;
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(19, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(20, 0);
        int dimensionPixelSize3 = typedArray2.getDimensionPixelSize(6, 0);
        int dimensionPixelSize4 = typedArray2.getDimensionPixelSize(7, 0);
        Input input = this.f179406l;
        input.f179330b = dimensionPixelSize;
        input.f179332d = dimensionPixelSize3;
        input.f179331c = dimensionPixelSize2;
        input.f179333e = dimensionPixelSize4;
        input.x();
        Input.e(input, 0, input.f179332d, 0, input.f179333e, 0, 21);
        return G0.f406611a;
    }
}
