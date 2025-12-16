package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import HV.a;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastRenderer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHV/a;", "invoke", "()LHV/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.a<HV.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f221254l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar) {
        super(0);
        this.f221254l = aVar;
    }

    @Override // Y41.a
    public final HV.a invoke() {
        a.C0407a c0407a = HV.a.f7100w;
        Context context = this.f221254l.f221239d;
        int iJ2 = C35835l0.j(R.attr.toastBarError, context);
        c0407a.getClass();
        return a.C0407a.b(iJ2, context);
    }
}
