package com.google.android.material.color.utilities;

import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.color.utilities.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37045i implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37049m f356344b;

    public /* synthetic */ C37045i(C37049m c37049m, int i12) {
        this.f356343a = i12;
        this.f356344b = c37049m;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C37048l c37048l = (C37048l) obj;
        switch (this.f356343a) {
            case 0:
                return c37048l.f356353d.apply(this.f356344b);
            default:
                return c37048l.f356352c.apply(this.f356344b);
        }
    }
}
