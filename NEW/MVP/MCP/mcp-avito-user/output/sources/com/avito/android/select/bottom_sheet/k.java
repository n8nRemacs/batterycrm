package com.avito.android.select.bottom_sheet;

import android.view.View;
import dq0.C39783e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectBottomSheetMviView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f265316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f265317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C39783e f265318n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, Y41.a<G0> aVar, C39783e c39783e) {
        super(0);
        this.f265316l = gVar;
        this.f265317m = aVar;
        this.f265318n = c39783e;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f265316l;
        View view = gVar.f265291c;
        view.addOnLayoutChangeListener(new j(view, gVar, this.f265318n));
        gVar.f265291c.requestLayout();
        ((h) this.f265317m).invoke();
        return G0.f406611a;
    }
}
