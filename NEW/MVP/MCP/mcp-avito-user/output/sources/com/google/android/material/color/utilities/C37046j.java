package com.google.android.material.color.utilities;

import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.color.utilities.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37046j implements BiFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f356345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37049m f356346c;

    public /* synthetic */ C37046j(Function function, C37049m c37049m) {
        this.f356345b = function;
        this.f356346c = c37049m;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Double d12 = (Double) obj;
        Double d13 = (Double) obj2;
        Function function = this.f356345b;
        if (function != null) {
            C37049m c37049m = this.f356346c;
            if (function.apply(c37049m) != null && ((C37048l) function.apply(c37049m)).f356351b != null && ((C37048l) function.apply(c37049m)).f356351b.apply(c37049m) != null) {
                return Double.valueOf(C37048l.b(d13.doubleValue(), 7.0d));
            }
        }
        return Double.valueOf(C37048l.b(d13.doubleValue(), Math.max(7.0d, d12.doubleValue())));
    }
}
