package com.avito.android.select.bottom_sheet.blueprints.chips;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.util.y6;
import dq0.InterfaceC39781c;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableChipsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/chips/d;", "LTV0/d;", "Lcom/avito/android/select/bottom_sheet/blueprints/chips/g;", "Lcom/avito/android/select/bottom_sheet/blueprints/chips/a;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<g, com.avito.android.select.bottom_sheet.blueprints.chips.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f265072b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<InterfaceC39781c, G0> f265073c;

    /* compiled from: CheckableChipsItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/chips/d$a;", "", "<init>", "()V", "", "DEFAULT_STYLE", "Ljava/lang/String;", "", "TOP_MARGIN_BETWEEN_DP", "I", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k Context context, @l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265072b = context;
        this.f265073c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numM;
        g gVar = (g) eVar;
        com.avito.android.select.bottom_sheet.blueprints.chips.a aVar2 = (com.avito.android.select.bottom_sheet.blueprints.chips.a) aVar;
        gVar.sU(aVar2.f265065h, i12 == 0 ? aVar2.f265066i : y6.b(24), aVar2.f265067j);
        gVar.b(aVar2.f265060c);
        String str = aVar2.f265063f;
        if (str == null) {
            str = "medium";
        }
        gVar.g5(str);
        ArrayList<com.avito.android.select.variant.a> arrayList = aVar2.f265061d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (com.avito.android.select.variant.a aVar3 : arrayList) {
            int iHashCode = aVar3.f266834b.hashCode();
            CharSequence charSequenceI = aVar3.f266835c;
            String str2 = aVar3.f266840h;
            if (str2 != null && (numM = com.avito.android.lib.util.f.m(str2)) != null) {
                int iIntValue = numM.intValue();
                FV.a aVar4 = FV.a.f4720a;
                int iB2 = y6.b(5);
                aVar4.getClass();
                charSequenceI = FV.a.i(charSequenceI, this.f265072b, iIntValue, iB2);
            }
            arrayList2.add(new ItemChipable(iHashCode, null, null, null, aVar3.f266842j, null, charSequenceI.toString(), false, false, 430, null));
        }
        gVar.x20(arrayList2, aVar2.f265062e, aVar2.f265064g, new e(aVar2, this));
    }
}
