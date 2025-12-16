package com.avito.android.gig_apply.ui.dialogs.item_dialog;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigSlotItemsDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f160008l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f160009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i12) {
        super(2);
        this.f160008l = dVar;
        this.f160009m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f160009m | 1);
        b.b(this.f160008l, a12, iA2);
        return G0.f406611a;
    }
}
