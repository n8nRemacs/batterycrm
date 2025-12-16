package com.avito.android.select.auto_early_access_select;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23487e;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.select.p;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;

/* compiled from: AutoEarlyAccessSelectDialogFragment.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoEarlyAccessSelectDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    public String f264984h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final C35968w3 f264985i0;

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f264983k0 = {m0.f406844a.e(new Y(AutoEarlyAccessSelectDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectParams;", 0))};

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f264982j0 = new a(null);

    /* compiled from: AutoEarlyAccessSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectDialogFragment$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoEarlyAccessSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectValue;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<AutoEarlyAccessSelectValue, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AutoEarlyAccessSelectValue autoEarlyAccessSelectValue) {
            AutoEarlyAccessSelectValue autoEarlyAccessSelectValue2 = autoEarlyAccessSelectValue;
            List listSingletonList = Collections.singletonList(autoEarlyAccessSelectValue2.f264994b);
            a aVar = AutoEarlyAccessSelectDialogFragment.f264982j0;
            AutoEarlyAccessSelectDialogFragment autoEarlyAccessSelectDialogFragment = AutoEarlyAccessSelectDialogFragment.this;
            InterfaceC23487e targetFragment = autoEarlyAccessSelectDialogFragment.getTargetFragment();
            p pVar = targetFragment instanceof p ? (p) targetFragment : null;
            if (pVar != null) {
                String str = autoEarlyAccessSelectDialogFragment.f264984h0;
                pVar.j(str != null ? str : null, autoEarlyAccessSelectValue2.f264995c, listSingletonList);
            }
            autoEarlyAccessSelectDialogFragment.dismissAllowingStateLoss();
            return G0.f406611a;
        }
    }

    public AutoEarlyAccessSelectDialogFragment() {
        super(0, 1, null);
        this.f264985i0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        n<Object>[] nVarArr = f264983k0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f264985i0;
        this.f264984h0 = ((AutoEarlyAccessSelectParams) c35968w3.getValue(this, nVar)).f264987b;
        View viewInflate = View.inflate(getContext(), R.layout.auto_early_access_select_sheet_dialog, null);
        d dVar = new d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.setContentView(viewInflate);
        d.M(dVar, null, false, true, 7);
        d.I(dVar, true);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        c cVar = new c(viewInflate);
        final AutoEarlyAccessSelectParams autoEarlyAccessSelectParams = (AutoEarlyAccessSelectParams) c35968w3.getValue(this, nVarArr[0]);
        final b bVar = new b();
        I5.a(cVar.f264999a, autoEarlyAccessSelectParams.f264991f, false);
        j.a(cVar.f265001c, autoEarlyAccessSelectParams.f264989d, null);
        UniversalImage universalImage = autoEarlyAccessSelectParams.f264990e;
        C35949t5.c(cVar.f265000b, com.avito.android.image_loader.b.b(universalImage != null ? universalImage.getImage() : null), null, null, null, 14);
        String f156312c = autoEarlyAccessSelectParams.f264992g.f264994b.getF119974b();
        Button button = cVar.f265002d;
        if (f156312c != null) {
            button.setText(f156312c);
        }
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.select.auto_early_access_select.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.invoke(autoEarlyAccessSelectParams.f264992g);
                        break;
                    default:
                        bVar.invoke(autoEarlyAccessSelectParams.f264993h);
                        break;
                }
            }
        });
        String f156312c2 = autoEarlyAccessSelectParams.f264993h.f264994b.getF119974b();
        Button button2 = cVar.f265003e;
        if (f156312c2 != null) {
            button2.setText(f156312c2);
        }
        final int i13 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.select.auto_early_access_select.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.invoke(autoEarlyAccessSelectParams.f264992g);
                        break;
                    default:
                        bVar.invoke(autoEarlyAccessSelectParams.f264993h);
                        break;
                }
            }
        });
        return dVar;
    }
}
