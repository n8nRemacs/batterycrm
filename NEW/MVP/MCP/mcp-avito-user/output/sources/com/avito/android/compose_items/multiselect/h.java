package com.avito.android.compose_items.multiselect;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.style.C27598v2;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectComposeItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f125412l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f125413m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ParameterElement.v vVar, i iVar) {
        super(2);
        this.f125412l = vVar;
        this.f125413m = iVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD = C20588k2.d(v.f42878y1, 1.0f);
            com.akita.compose.component.multiselect.g gVarB = C27598v2.a().getF66444c();
            ParameterElement.v vVar = this.f125412l;
            String str = vVar.f117554o;
            boolean z12 = !(vVar.f117555p instanceof ItemWithState.State.Normal);
            i iVar = this.f125413m;
            com.akita.compose.component.multiselect.c.a(new d(vVar, iVar), new e(vVar, iVar), gVarB, vVarD, str, vVar.f117553n, z12, new g(vVar, iVar), a13, 3072);
        }
        return G0.f406611a;
    }
}
