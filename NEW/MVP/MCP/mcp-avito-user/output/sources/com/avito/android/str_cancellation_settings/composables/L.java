package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22066f2;
import com.avito.android.str_cancellation_settings.models.items.DaysOptionChipable;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FreeCancellationDaysChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class L extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f288165l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<DaysOptionChipable> f288166m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DaysOptionChipable, G0> f288167n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f288168o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f288169p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, List list, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f288165l = str;
        this.f288166m = list;
        this.f288167n = lVar;
        this.f288168o = vVar;
        this.f288169p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        N.a(this.f288165l, this.f288166m, this.f288167n, this.f288168o, a12, C22066f2.a(this.f288169p | 1));
        return G0.f406611a;
    }
}
