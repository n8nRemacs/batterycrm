package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import ML0.c;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<c.h> f320885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f320886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f320887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f320885l = list;
        this.f320886m = lVar;
        this.f320887n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        v vVar = this.f320887n;
        List<c.h> list = this.f320885l;
        g.a(iA2, this.f320886m, a12, vVar, list);
        return G0.f406611a;
    }
}
