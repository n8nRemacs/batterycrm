package com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet;

import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.g;
import com.avito.android.publish.details.adapter.edit_category.h;
import com.avito.android.remote.model.category_parameters.ManualScanner;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstructionBottomSheetFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/scanner_v2/scanner_manual_bottom_sheet/b;", "Lcom/avito/android/publish/scanner_v2/scanner_manual_bottom_sheet/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.a {

    /* compiled from: InstructionBottomSheetFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f239426l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f239427m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar, com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f239426l = aVar;
            this.f239427m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f239426l.invoke();
            this.f239427m.dismiss();
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.a
    public final void a(@k Context context, @k ManualScanner manualScanner, @k Y41.a<G0> aVar) {
        View viewInflate = View.inflate(context, R.layout.scanner_instruction_dialog_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.Re23_BottomSheet_Default);
        dVar.setContentView(viewInflate);
        j.b(dVar, true, 4);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        e eVar = new e(dVar);
        a aVar2 = new a(aVar, dVar);
        I5.a(eVar.f239429a, manualScanner.getTitle(), false);
        I5.a(eVar.f239430b, manualScanner.getDescription(), false);
        String againButtonTitle = manualScanner.getAgainButtonTitle();
        Button button = eVar.f239431c;
        com.avito.android.lib.design.button.b.a(button, againButtonTitle, false);
        if (againButtonTitle != null) {
            button.setOnClickListener(new h(21, aVar2));
        } else {
            button.setOnClickListener(null);
        }
        g.a(dVar);
    }
}
