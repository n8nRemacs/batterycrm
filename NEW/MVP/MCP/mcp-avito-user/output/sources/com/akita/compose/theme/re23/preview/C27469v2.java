package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22204y1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MultiselectPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/multiselect/d;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/multiselect/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27469v2 extends kotlin.jvm.internal.N implements Y41.l<com.akita.compose.component.multiselect.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Map<String, Boolean>> f65892l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27469v2(InterfaceC22204y1<Map<String, Boolean>> interfaceC22204y1) {
        super(1);
        this.f65892l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.akita.compose.component.multiselect.d dVar) {
        com.akita.compose.component.multiselect.d dVar2 = dVar;
        LinkedHashMap linkedHashMap = C27449r2.f65815a;
        InterfaceC22204y1<Map<String, Boolean>> interfaceC22204y1 = this.f65892l;
        for (Map.Entry<String, Boolean> entry : interfaceC22204y1.getF42167b().entrySet()) {
            String key = entry.getKey();
            dVar2.a(key, entry.getValue().booleanValue(), new C27464u2(interfaceC22204y1, key));
        }
        return kotlin.G0.f406611a;
    }
}
