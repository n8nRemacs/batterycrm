package com.avito.android.screens.bbip.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.screens.bbip.ui.BbipFragment;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import op0.d;
import op0.e;

/* compiled from: BbipFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lop0/e;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lop0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.l<op0.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipFragment f260292l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BbipFragment bbipFragment) {
        super(1);
        this.f260292l = bbipFragment;
    }

    @Override // Y41.l
    public final G0 invoke(op0.e eVar) throws Resources.NotFoundException {
        String strK0;
        Button button;
        String strK02;
        Button button2;
        RecyclerView.Adapter adapter;
        C23424o.e eVar2;
        Button button3;
        op0.e eVar3 = eVar;
        boolean z12 = eVar3 instanceof e.b;
        BbipFragment bbipFragment = this.f260292l;
        if (z12) {
            e.b bVar = (e.b) eVar3;
            boolean z13 = bVar.f420206a;
            BbipFragment.a aVar = BbipFragment.f260259H0;
            Integer num = bVar.f420207b;
            if (num != null) {
                int iIntValue = num.intValue();
                MnzFloatingFooter mnzFloatingFooter = bbipFragment.f260265F0;
                if (mnzFloatingFooter != null && (button3 = (Button) mnzFloatingFooter.findViewById(iIntValue)) != null) {
                    button3.setLoading(true);
                }
            }
            if (z13) {
                com.avito.android.progress_overlay.l lVar = bbipFragment.f260278y0;
                if (lVar != null) {
                    lVar.k(null);
                }
            } else {
                bbipFragment.r5(true);
            }
        } else {
            if (eVar3 instanceof e.c) {
                op0.h hVar = ((e.c) eVar3).f420208a;
                com.avito.konveyor.adapter.a aVar2 = bbipFragment.f260272s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, hVar.f420219a);
                RecyclerView recyclerView = bbipFragment.f260279z0;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (eVar2 = hVar.f420220b) != null) {
                    eVar2.b(adapter);
                }
                Context context = bbipFragment.getContext();
                if (context != null) {
                    Button button4 = bbipFragment.f260261B0;
                    if (button4 != null) {
                        PrintableText printableText = hVar.f420221c;
                        com.avito.android.lib.design.button.b.a(button4, printableText != null ? printableText.k0(context) : null, false);
                    }
                    PrintableText printableText2 = hVar.f420222d;
                    if (printableText2 != null && (strK02 = printableText2.k0(context)) != null && (button2 = bbipFragment.f260262C0) != null) {
                        button2.setText(strK02);
                    }
                    PrintableText printableText3 = hVar.f420223e;
                    if (printableText3 != null && (strK0 = printableText3.k0(context)) != null && (button = bbipFragment.f260263D0) != null) {
                        button.setText(strK0);
                    }
                }
                bbipFragment.r5(false);
                com.avito.android.progress_overlay.l lVar2 = bbipFragment.f260278y0;
                if (lVar2 != null) {
                    lVar2.j();
                }
                ViewGroup viewGroup = bbipFragment.f260264E0;
                com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter2 = hVar.f420224f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(mnzFloatingFooter2 == null ? 0 : 8);
                }
                MnzFloatingFooter mnzFloatingFooter3 = bbipFragment.f260265F0;
                if (mnzFloatingFooter3 != null) {
                    mnzFloatingFooter3.setVisibility(mnzFloatingFooter2 == null ? 8 : 0);
                }
                MnzFloatingFooter mnzFloatingFooter4 = bbipFragment.f260265F0;
                if (mnzFloatingFooter4 != null) {
                    com.avito.android.util.text.a aVar3 = bbipFragment.f260274u0;
                    mnzFloatingFooter4.d(mnzFloatingFooter2, aVar3 != null ? aVar3 : null, new d(bbipFragment), new e(bbipFragment));
                }
            } else if (eVar3 instanceof e.a) {
                op0.d dVar = ((e.a) eVar3).f420205a;
                BbipFragment.a aVar4 = BbipFragment.f260259H0;
                bbipFragment.r5(false);
                if (dVar instanceof d.c) {
                    D6.w(bbipFragment.f260261B0);
                    com.avito.android.progress_overlay.l lVar3 = bbipFragment.f260278y0;
                    if (lVar3 != null) {
                        d.c cVar = (d.c) dVar;
                        String string = cVar.f420203a;
                        if (string == null) {
                            string = bbipFragment.getResources().getString(cVar.f420204b);
                        }
                        lVar3.a(string);
                    }
                } else if (dVar instanceof d.b) {
                    bbipFragment.s5(dVar, false);
                } else if (dVar instanceof d.a) {
                    bbipFragment.s5(dVar, true);
                }
            }
        }
        return G0.f406611a;
    }
}
