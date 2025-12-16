package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.util.R0;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SelectorCardGroupBottomSheetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/o;", "Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/l;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f106714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f106715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f106716d;

    @Inject
    public o(@Y61.k R0 r02) {
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f106714b = e2VarB;
        this.f106715c = e2VarB;
        this.f106716d = U.a(r02.b());
    }

    @Override // TX.a
    @Y61.k
    /* renamed from: F, reason: from getter */
    public final e2 getF106715c() {
        return this.f106715c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        com.avito.android.blueprints.select.k kVar = (com.avito.android.blueprints.select.k) eVar;
        ParameterElement.F f12 = (ParameterElement.F) aVar;
        ParameterElement.F.a aVar2 = f12.f117290e;
        String str = aVar2.f117293a;
        if (str == null) {
            str = "";
        }
        kVar.setTitle(str);
        Iterator it = f12.f117289d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ParameterElement.F.b) next).f117296c) {
                    break;
                }
            }
        }
        ParameterElement.F.b bVar = (ParameterElement.F.b) next;
        if (bVar != null) {
            kVar.m(bVar.f117297d);
        }
        kVar.o(aVar2.f117294b);
        kVar.a(new n(this, f12));
    }

    @Override // TX.a
    public final void j5() {
        Q0.d(this.f106716d.f411905b);
    }
}
