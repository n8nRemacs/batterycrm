package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.C36616a.b;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36669t<A extends C36616a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final C36658n f349208a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Feature[] f349209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349210c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349211d;

    @RX0.a
    public AbstractC36669t(@j.N C36658n<L> c36658n, @j.P Feature[] featureArr, boolean z12, int i12) {
        this.f349208a = c36658n;
        this.f349209b = featureArr;
        this.f349210c = z12;
        this.f349211d = i12;
    }

    @RX0.a
    public abstract void a(@j.N A a12, @j.N C37028k<Void> c37028k);
}
