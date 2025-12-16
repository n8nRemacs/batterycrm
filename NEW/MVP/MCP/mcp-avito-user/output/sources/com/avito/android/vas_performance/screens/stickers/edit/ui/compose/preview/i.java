package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.preview;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.Image;
import com.avito.android.vas_performance.screens.stickers.edit.ui.compose.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickerEditPreviews.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ML0.a, G0> f320936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<ML0.c> f320937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Y41.l<? super ML0.a, G0> lVar, InterfaceC22204y1<ML0.c> interfaceC22204y1) {
        super(2);
        this.f320936l = lVar;
        this.f320937m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            Image image = l.f320940a;
            q.a(this.f320937m.getF42167b(), l.f320941b, h.f320935l, this.f320936l, l.f320942c, a13, 25032);
        }
        return G0.f406611a;
    }
}
