package com.avito.android.code_check.code_confirm;

import Jo.InterfaceC14224a;
import Ro.InterfaceC15066a;
import android.view.View;
import androidx.view.C22984Q;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f118694l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CodeConfirmFragment codeConfirmFragment) {
        super(0);
        this.f118694l = codeConfirmFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
        final CodeConfirmFragment codeConfirmFragment = this.f118694l;
        com.avito.android.lib.design.input.n.c(codeConfirmFragment.y5(), new k(codeConfirmFragment));
        final int i12 = 0;
        codeConfirmFragment.z5().setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.code_check.code_confirm.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CodeConfirmFragment codeConfirmFragment2 = codeConfirmFragment;
                switch (i12) {
                    case 0:
                        ((A) codeConfirmFragment2.f118636F0.getValue()).accept(new InterfaceC14224a.C0541a(codeConfirmFragment2.y5().getDeformattedText()));
                        break;
                    default:
                        CodeConfirmFragment.a aVar2 = CodeConfirmFragment.f118629G0;
                        A a12 = (A) codeConfirmFragment2.f118636F0.getValue();
                        com.avito.android.code_check.d dVar = codeConfirmFragment2.f118639u0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        String strA = dVar.G3().a();
                        a12.accept(new InterfaceC15066a.c(strA != null ? To.c.a(strA) : null, null));
                        break;
                }
            }
        });
        final int i13 = 1;
        codeConfirmFragment.A5().setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.code_check.code_confirm.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CodeConfirmFragment codeConfirmFragment2 = codeConfirmFragment;
                switch (i13) {
                    case 0:
                        ((A) codeConfirmFragment2.f118636F0.getValue()).accept(new InterfaceC14224a.C0541a(codeConfirmFragment2.y5().getDeformattedText()));
                        break;
                    default:
                        CodeConfirmFragment.a aVar2 = CodeConfirmFragment.f118629G0;
                        A a12 = (A) codeConfirmFragment2.f118636F0.getValue();
                        com.avito.android.code_check.d dVar = codeConfirmFragment2.f118639u0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        String strA = dVar.G3().a();
                        a12.accept(new InterfaceC15066a.c(strA != null ? To.c.a(strA) : null, null));
                        break;
                }
            }
        });
        C43175k.K(new C43197r1(new l(codeConfirmFragment, null), kotlinx.coroutines.rx3.y.a(com.avito.android.lib.design.input.n.a(codeConfirmFragment.y5(), 6))), C22984Q.a(codeConfirmFragment.getViewLifecycleOwner()));
        return G0.f406611a;
    }
}
