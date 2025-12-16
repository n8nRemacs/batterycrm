package com.avito.android.iac_calls_history.impl_module.screen.ui.items;

import Y41.l;
import Y41.p;
import android.content.res.Resources;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacCallsHistoryItemUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacCallsHistoryItem f164920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LocalDate f164921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<IacCallsHistoryItem, G0> f164922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f164923o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f164924p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IacCallsHistoryItem iacCallsHistoryItem, LocalDate localDate, l lVar, v vVar, int i12) {
        super(2);
        this.f164920l = iacCallsHistoryItem;
        this.f164921m = localDate;
        this.f164922n = lVar;
        this.f164923o = vVar;
        this.f164924p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Resources.NotFoundException {
        num.intValue();
        int iA2 = C22066f2.a(this.f164924p | 1);
        g.a(this.f164920l, this.f164921m, this.f164922n, a12, iA2);
        return G0.f406611a;
    }
}
