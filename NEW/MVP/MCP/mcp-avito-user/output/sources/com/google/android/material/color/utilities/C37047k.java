package com.google.android.material.color.utilities;

import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.color.utilities.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37047k implements BiFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f356347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37049m f356348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function f356349d;

    public /* synthetic */ C37047k(Function function, C37049m c37049m, Function function2) {
        this.f356347b = function;
        this.f356348c = c37049m;
        this.f356349d = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Double d12 = (Double) obj;
        Double d13 = (Double) obj2;
        Function function = this.f356347b;
        C37049m c37049m = this.f356348c;
        double dDoubleValue = ((Double) function.apply(c37049m)).doubleValue();
        if (d12.doubleValue() >= 7.0d) {
            dDoubleValue = C37048l.b(d13.doubleValue(), 4.5d);
        } else if (d12.doubleValue() >= 3.0d) {
            dDoubleValue = C37048l.b(d13.doubleValue(), 3.0d);
        } else {
            Function function2 = this.f356349d;
            if (function2 != null && function2.apply(c37049m) != null && ((C37048l) function2.apply(c37049m)).f356351b != null && ((C37048l) function2.apply(c37049m)).f356351b.apply(c37049m) != null) {
                dDoubleValue = C37048l.b(d13.doubleValue(), d12.doubleValue());
            }
        }
        return Double.valueOf(dDoubleValue);
    }
}
