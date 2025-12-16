package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.C22096n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WheelPicker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f261193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f261194m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I3<Integer> f261195n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ArrayList arrayList, float f12, I3 i32) {
        super(1);
        this.f261193l = arrayList;
        this.f261194m = f12;
        this.f261195n = i32;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        ArrayList arrayList = this.f261193l;
        m0Var.a(arrayList.size(), null, new h(arrayList), new C22096n(-1091073711, new i(arrayList, this.f261194m, this.f261195n), true));
        return G0.f406611a;
    }
}
