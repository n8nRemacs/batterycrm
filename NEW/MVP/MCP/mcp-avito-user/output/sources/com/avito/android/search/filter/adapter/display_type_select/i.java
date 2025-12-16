package com.avito.android.search.filter.adapter.display_type_select;

import Y41.l;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DisplayTypeSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f262211m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ParameterElement.v.b bVar, h hVar) {
        super(1);
        this.f262210l = bVar;
        this.f262211m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Object next;
        String str2 = str;
        ParameterElement.v.b bVar = this.f262210l;
        Iterator<T> it = bVar.f262862t.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Cp0.e) next).f2697b, str2)) {
                break;
            }
        }
        bVar.f262844g = (Cp0.e) next;
        this.f262211m.f262208b.accept(bVar);
        return G0.f406611a;
    }
}
