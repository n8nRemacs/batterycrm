package com.avito.android.snippet.video;

import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SnippetVideoState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.p<InterfaceC36241a, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f284028l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LinkedHashMap linkedHashMap) {
        super(2);
        this.f284028l = linkedHashMap;
    }

    @Override // Y41.p
    public final G0 invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (G0) interfaceC36241a.m(iIntValue, new n(this.f284028l), String.valueOf(iIntValue));
    }
}
