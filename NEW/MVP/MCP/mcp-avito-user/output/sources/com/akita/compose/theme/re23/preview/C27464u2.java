package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MultiselectPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.u2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27464u2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Map<String, Boolean>> f65875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f65876m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27464u2(InterfaceC22204y1<Map<String, Boolean>> interfaceC22204y1, String str) {
        super(0);
        this.f65875l = interfaceC22204y1;
        this.f65876m = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        LinkedHashMap linkedHashMap = C27449r2.f65815a;
        InterfaceC22204y1<Map<String, Boolean>> interfaceC22204y1 = this.f65875l;
        Map<String, Boolean> f42167b = interfaceC22204y1.getF42167b();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(f42167b.size()));
        Iterator it = f42167b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (kotlin.jvm.internal.L.f(str, this.f65876m)) {
                zBooleanValue = false;
            }
            linkedHashMap2.put(key, Boolean.valueOf(zBooleanValue));
        }
        interfaceC22204y1.setValue(linkedHashMap2);
        return kotlin.G0.f406611a;
    }
}
