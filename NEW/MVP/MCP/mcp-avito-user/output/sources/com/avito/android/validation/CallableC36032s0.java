package com.avito.android.validation;

import com.avito.android.payment.ParametersTree;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.validation.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallableC36032s0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f319417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f319418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f319419d;

    public /* synthetic */ CallableC36032s0(int i12, Object obj, Object obj2) {
        this.f319417b = i12;
        this.f319418c = obj;
        this.f319419d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f319417b) {
            case 0:
                Map map = (Map) this.f319419d;
                Y0 y02 = (Y0) this.f319418c;
                y02.j(new C36040w0(map, y02));
                return kotlin.G0.f406611a;
            default:
                return ((C36022n) this.f319418c).c((ParametersTree) this.f319419d);
        }
    }
}
