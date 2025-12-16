package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import ML0.c;
import Y41.p;
import com.akita.compose.component.chips.InterfaceC27333b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditChips.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<c.h> f320883l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f320884m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.l lVar, List list) {
        super(2);
        this.f320883l = list;
        this.f320884m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        int iIntValue = num.intValue();
        List<c.h> list = this.f320883l;
        if (list.get(iIntValue).f10637e) {
            this.f320884m.invoke(list.get(iIntValue).f10633a);
        }
        return G0.f406611a;
    }
}
