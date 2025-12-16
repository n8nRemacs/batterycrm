package com.akita.compose.component.chips;

import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f60973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f60974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f60975n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0 f60976o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f60977p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V1 f60978q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f60979r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(ArrayList arrayList, y yVar, Y41.p pVar, w0 w0Var, androidx.compose.ui.v vVar, V1 v12, C22096n c22096n, int i12) {
        super(2);
        this.f60973l = arrayList;
        this.f60974m = yVar;
        this.f60975n = (N) pVar;
        this.f60976o = w0Var;
        this.f60977p = vVar;
        this.f60978q = v12;
        this.f60979r = c22096n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1794121);
        V1 v12 = this.f60978q;
        ArrayList arrayList = this.f60973l;
        ?? r22 = this.f60975n;
        w0 w0Var = this.f60976o;
        androidx.compose.ui.v vVar = this.f60977p;
        d.d(arrayList, this.f60974m, r22, w0Var, vVar, v12, this.f60979r, a12, iA2);
        return G0.f406611a;
    }
}
