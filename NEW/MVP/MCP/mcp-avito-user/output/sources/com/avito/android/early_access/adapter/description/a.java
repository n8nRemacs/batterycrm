package com.avito.android.early_access.adapter.description;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessDescription.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f145128l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f145129m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f145130n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C22602e c22602e, v vVar, int i12) {
        super(2);
        this.f145128l = c22602e;
        this.f145129m = vVar;
        this.f145130n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145130n | 1);
        c.a(this.f145128l, this.f145129m, a12, iA2);
        return G0.f406611a;
    }
}
