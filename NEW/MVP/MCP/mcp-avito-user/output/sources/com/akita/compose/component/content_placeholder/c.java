package com.akita.compose.component.content_placeholder;

import Y41.q;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContentPlaceholder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements q<J, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61093m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f61094n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f61095o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Y41.a<G0> aVar, d dVar, boolean z12) {
        super(3);
        this.f61092l = str;
        this.f61093m = aVar;
        this.f61094n = dVar;
        this.f61095o = z12;
    }

    @Override // Y41.q
    public final G0 invoke(J j12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            d dVar = this.f61094n;
            m.c(this.f61092l, this.f61093m, dVar.f61105i, C20588k2.d(v.f42878y1, 1.0f), null, null, null, this.f61095o, false, null, a13, 3584, 880);
        }
        return G0.f406611a;
    }
}
