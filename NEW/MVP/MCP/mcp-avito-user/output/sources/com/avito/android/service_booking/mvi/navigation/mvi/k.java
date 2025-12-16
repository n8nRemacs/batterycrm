package com.avito.android.service_booking.mvi.navigation.mvi;

import java.util.Map;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l f274424b;

    public /* synthetic */ k(int i12, Y41.l lVar) {
        this.f274423a = i12;
        this.f274424b = lVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f274423a) {
            case 0:
                return (Map) this.f274424b.invoke(obj);
            default:
                return this.f274424b.invoke(obj);
        }
    }
}
