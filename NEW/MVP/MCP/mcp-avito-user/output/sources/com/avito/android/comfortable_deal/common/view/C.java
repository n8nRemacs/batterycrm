package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class C extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f120624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f120625m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f120626n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f120627o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, String str2, float f12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f120624l = str;
        this.f120625m = str2;
        this.f120626n = f12;
        this.f120627o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        B.c(this.f120624l, this.f120625m, this.f120626n, this.f120627o, a12, iA2);
        return G0.f406611a;
    }
}
