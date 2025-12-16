package com.avito.android.lib.design.input;

import android.content.res.TypedArray;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/res/TypedArray;", "Lkotlin/G0;", "invoke", "(Landroid/content/res/TypedArray;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.l<TypedArray, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Input f179408l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Input input) {
        super(1);
        this.f179408l = input;
    }

    @Override // Y41.l
    public final G0 invoke(TypedArray typedArray) {
        TypedArray typedArray2 = typedArray;
        this.f179408l.m(typedArray2.getDimensionPixelSize(46, 0), typedArray2.getDimensionPixelSize(45, 0));
        return G0.f406611a;
    }
}
