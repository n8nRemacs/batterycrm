package com.avito.android.str_calendar.seller.warning_dialog.composable;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.str_booking.network.models.common.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FooterButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Button f288067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f288068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f288069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f288070o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Button button, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f288067l = button;
        this.f288068m = (N) aVar;
        this.f288069n = vVar;
        this.f288070o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f288070o | 1);
        ?? r02 = this.f288068m;
        v vVar = this.f288069n;
        c.a(this.f288067l, r02, vVar, a12, iA2);
        return G0.f406611a;
    }
}
