package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WheelPicker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f261196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f261197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f261198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f261199o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, String str, Y41.l lVar, v vVar, float f12, float f13, int i12) {
        super(2);
        this.f261196l = arrayList;
        this.f261197m = str;
        this.f261198n = lVar;
        this.f261199o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3081);
        ArrayList arrayList = this.f261196l;
        Y41.l<String, G0> lVar = this.f261198n;
        v vVar = this.f261199o;
        o.a(arrayList, this.f261197m, lVar, vVar, a12, iA2);
        return G0.f406611a;
    }
}
