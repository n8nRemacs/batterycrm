package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemCheckbox.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f61858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f61859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61860n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f61861o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61862p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z12, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f61858l = z12;
        this.f61859m = sVar;
        this.f61860n = vVar;
        this.f61861o = c22096n;
        this.f61862p = c22096n2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(7);
        s sVar = this.f61859m;
        androidx.compose.ui.v vVar = this.f61860n;
        d.b(this.f61858l, sVar, vVar, this.f61861o, this.f61862p, a12, iA2);
        return G0.f406611a;
    }
}
