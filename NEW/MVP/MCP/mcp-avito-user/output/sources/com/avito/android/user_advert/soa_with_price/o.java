package com.avito.android.user_advert.soa_with_price;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.N2;
import com.avito.android.R;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceResult;
import com.avito.android.user_advert.soa_with_price.j;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.jvm.internal.L;
import l41.InterfaceC43543a;
import ur.InterfaceC49101b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f311937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SoaWithPriceSheetDialogFragment f311938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f311939d;

    public /* synthetic */ o(InterfaceC35551e interfaceC35551e, SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment) {
        this.f311937b = 1;
        this.f311939d = interfaceC35551e;
        this.f311938c = soaWithPriceSheetDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Object obj) {
        String str;
        InterfaceC35551e c35552f;
        switch (this.f311937b) {
            case 0:
                j jVar = (j) obj;
                boolean z12 = jVar instanceof j.b;
                SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment = this.f311938c;
                com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) this.f311939d;
                if (!z12) {
                    if (!(jVar instanceof j.c)) {
                        if (!L.f(jVar, j.a.f311928a)) {
                            if (jVar instanceof j.d) {
                                View currentFocus = dVar.getCurrentFocus();
                                if (currentFocus != null) {
                                    K2.d(currentFocus, true);
                                }
                                String tag = soaWithPriceSheetDialogFragment.getTag();
                                str = tag != null ? tag : "";
                                SoaWithPriceResult.a aVar = SoaWithPriceResult.f311845a2;
                                Bundle bundle = new Bundle(1);
                                String str2 = soaWithPriceSheetDialogFragment.f311862s0;
                                if (str2 == null) {
                                    str2 = null;
                                }
                                j.d dVar2 = (j.d) jVar;
                                CloseReason closeReason = dVar2.f311933a;
                                String str3 = dVar2.f311934b;
                                SoaWithPriceResult.Success success = new SoaWithPriceResult.Success(str2, closeReason, str3);
                                aVar.getClass();
                                bundle.putParcelable("key_soa_with_price_result", success);
                                soaWithPriceSheetDialogFragment.getParentFragmentManager().o0(bundle, str);
                                soaWithPriceSheetDialogFragment.dismiss();
                                ActivityC22955m activityC22955mL1 = soaWithPriceSheetDialogFragment.l1();
                                n nVar = activityC22955mL1 instanceof n ? (n) activityC22955mL1 : null;
                                if (nVar != null) {
                                    nVar.W(dVar2.f311933a, str3);
                                    break;
                                }
                            }
                        } else {
                            View currentFocus2 = dVar.getCurrentFocus();
                            if (currentFocus2 != null) {
                                K2.d(currentFocus2, true);
                            }
                            String tag2 = soaWithPriceSheetDialogFragment.getTag();
                            str = tag2 != null ? tag2 : "";
                            SoaWithPriceResult.a aVar2 = SoaWithPriceResult.f311845a2;
                            Bundle bundle2 = new Bundle(1);
                            String str4 = soaWithPriceSheetDialogFragment.f311862s0;
                            SoaWithPriceResult.Cancel cancel = new SoaWithPriceResult.Cancel(str4 != null ? str4 : null);
                            aVar2.getClass();
                            bundle2.putParcelable("key_soa_with_price_result", cancel);
                            soaWithPriceSheetDialogFragment.getParentFragmentManager().o0(bundle2, str);
                            soaWithPriceSheetDialogFragment.dismiss();
                            break;
                        }
                    } else {
                        N2 n22 = soaWithPriceSheetDialogFragment.f311860q0;
                        if (n22 == null) {
                            n22 = null;
                        }
                        if (n22.v().invoke().booleanValue()) {
                            soaWithPriceSheetDialogFragment.f5(dVar, null, new t(soaWithPriceSheetDialogFragment), new u(soaWithPriceSheetDialogFragment));
                        } else {
                            soaWithPriceSheetDialogFragment.g5(dVar, ((j.c) jVar).f311932b);
                        }
                        String str5 = ((j.c) jVar).f311931a;
                        D d12 = soaWithPriceSheetDialogFragment.f311861r0;
                        if (d12 == null) {
                            d12 = null;
                        }
                        d12.f311835U.removeObservers(soaWithPriceSheetDialogFragment);
                        ViewGroup viewGroup = (ViewGroup) dVar.findViewById(R.id.soa_with_price_sheet);
                        viewGroup.removeAllViews();
                        LayoutInflater layoutInflater = soaWithPriceSheetDialogFragment.getLayoutInflater();
                        N2 n23 = soaWithPriceSheetDialogFragment.f311860q0;
                        if (n23 == null) {
                            n23 = null;
                        }
                        layoutInflater.inflate(n23.v().invoke().booleanValue() ? R.layout.price_input_sheet_content_re23 : R.layout.price_input_sheet_content, viewGroup, true);
                        N2 n24 = soaWithPriceSheetDialogFragment.f311860q0;
                        if (n24 == null) {
                            n24 = null;
                        }
                        if (!n24.v().invoke().booleanValue()) {
                            com.avito.android.lib.design.bottom_sheet.d.M(dVar, str5, true, true, 2);
                        }
                        N2 n25 = soaWithPriceSheetDialogFragment.f311860q0;
                        if (n25 == null) {
                            n25 = null;
                        }
                        if (n25.v().invoke().booleanValue()) {
                            ViewGroup viewGroup2 = (ViewGroup) dVar.findViewById(R.id.soa_with_price_sheet);
                            nt.f fVar = soaWithPriceSheetDialogFragment.f311858o0;
                            if (fVar == null) {
                                fVar = null;
                            }
                            String strG0 = fVar.g0();
                            InterfaceC49101b interfaceC49101b = soaWithPriceSheetDialogFragment.f311859p0;
                            if (interfaceC49101b == null) {
                                interfaceC49101b = null;
                            }
                            c35552f = new g(viewGroup2, strG0, interfaceC49101b.c());
                        } else {
                            c35552f = new C35552f((ViewGroup) dVar.findViewById(R.id.soa_with_price_sheet));
                        }
                        D d13 = soaWithPriceSheetDialogFragment.f311861r0;
                        if (d13 == null) {
                            d13 = null;
                        }
                        d13.f311834T.observe(soaWithPriceSheetDialogFragment, new o(c35552f, soaWithPriceSheetDialogFragment));
                        D d14 = soaWithPriceSheetDialogFragment.f311861r0;
                        if (d14 == null) {
                            d14 = null;
                        }
                        I0 i0J0 = c35552f.getF311922f().j0(d14.f311824J.e());
                        x xVar = new x(d14);
                        l41.g<? super Throwable> gVar = y.f311947b;
                        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                        d14.f311830P.b(i0J0.v0(xVar, gVar, interfaceC43543a));
                        D d15 = soaWithPriceSheetDialogFragment.f311861r0;
                        D d16 = d15 != null ? d15 : null;
                        d16.f311830P.b(c35552f.getF311923g().j0(d16.f311824J.e()).v0(new z(d16), A.f311820b, interfaceC43543a));
                        io.reactivex.rxjava3.internal.observers.y yVar = soaWithPriceSheetDialogFragment.f311863t0;
                        if (yVar != null) {
                            DisposableHelper.a(yVar);
                        }
                        C41981q0 c41981q0B = c35552f.getF311924h();
                        p pVar = new p(soaWithPriceSheetDialogFragment);
                        l41.g<? super Throwable> gVar2 = q.f311941b;
                        c41981q0B.getClass();
                        soaWithPriceSheetDialogFragment.f311863t0 = (io.reactivex.rxjava3.internal.observers.y) c41981q0B.v0(pVar, gVar2, interfaceC43543a);
                        break;
                    }
                } else {
                    N2 n26 = soaWithPriceSheetDialogFragment.f311860q0;
                    if (n26 == null) {
                        n26 = null;
                    }
                    if (n26.v().invoke().booleanValue()) {
                        soaWithPriceSheetDialogFragment.f5(dVar, Integer.valueOf(R.string.choose_reason_sheet_title), new r(soaWithPriceSheetDialogFragment), new s(soaWithPriceSheetDialogFragment));
                    } else {
                        soaWithPriceSheetDialogFragment.g5(dVar, ((j.b) jVar).f311930b);
                    }
                    String str6 = ((j.b) jVar).f311929a;
                    D d17 = soaWithPriceSheetDialogFragment.f311861r0;
                    if (d17 == null) {
                        d17 = null;
                    }
                    d17.f311834T.removeObservers(soaWithPriceSheetDialogFragment);
                    ViewGroup viewGroup3 = (ViewGroup) dVar.findViewById(R.id.soa_with_price_sheet);
                    viewGroup3.removeAllViews();
                    LayoutInflater layoutInflater2 = soaWithPriceSheetDialogFragment.getLayoutInflater();
                    N2 n27 = soaWithPriceSheetDialogFragment.f311860q0;
                    if (n27 == null) {
                        n27 = null;
                    }
                    layoutInflater2.inflate(n27.v().invoke().booleanValue() ? R.layout.close_reasons_sheet_content_re23 : R.layout.close_reasons_sheet_content, viewGroup3, true);
                    ViewGroup viewGroup4 = (ViewGroup) dVar.findViewById(R.id.soa_with_price_sheet);
                    RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter = soaWithPriceSheetDialogFragment.f311852i0;
                    if (adapter == null) {
                        adapter = null;
                    }
                    C35549c c35549c = new C35549c(viewGroup4, adapter);
                    N2 n28 = soaWithPriceSheetDialogFragment.f311860q0;
                    if (n28 == null) {
                        n28 = null;
                    }
                    if (!n28.v().invoke().booleanValue()) {
                        com.avito.android.lib.design.bottom_sheet.d.M(dVar, str6, true, true, 2);
                    }
                    D d18 = soaWithPriceSheetDialogFragment.f311861r0;
                    if (d18 == null) {
                        d18 = null;
                    }
                    d18.f311835U.observe(soaWithPriceSheetDialogFragment, new o(soaWithPriceSheetDialogFragment, c35549c, 2));
                    D d19 = soaWithPriceSheetDialogFragment.f311861r0;
                    if (d19 == null) {
                        d19 = null;
                    }
                    com.avito.android.user_advert.soa_with_price.blueprint.d dVar3 = soaWithPriceSheetDialogFragment.f311853j0;
                    d19.f311829O.b((dVar3 != null ? dVar3 : null).h().j0(d19.f311824J.e()).v0(new B(d19), C.f311822b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    io.reactivex.rxjava3.internal.observers.y yVar2 = soaWithPriceSheetDialogFragment.f311863t0;
                    if (yVar2 != null) {
                        DisposableHelper.a(yVar2);
                        break;
                    }
                }
                break;
            case 1:
                C35550d c35550d = (C35550d) obj;
                SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment2 = this.f311938c;
                com.avito.android.util.text.a aVar3 = soaWithPriceSheetDialogFragment2.f311855l0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                CharSequence charSequenceC = aVar3.c(soaWithPriceSheetDialogFragment2.requireContext(), c35550d.f311883b);
                InterfaceC35551e interfaceC35551e = (InterfaceC35551e) this.f311939d;
                interfaceC35551e.P2(charSequenceC);
                interfaceC35551e.y0(c35550d.f311882a);
                break;
            default:
                UV0.a<? extends TV0.a> aVar4 = (UV0.a) obj;
                com.avito.konveyor.adapter.a aVar5 = this.f311938c.f311851h0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                aVar5.c(aVar4);
                RecyclerView.Adapter adapter2 = ((C35549c) this.f311939d).f311881a.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o(SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment, Object obj, int i12) {
        this.f311937b = i12;
        this.f311938c = soaWithPriceSheetDialogFragment;
        this.f311939d = obj;
    }
}
