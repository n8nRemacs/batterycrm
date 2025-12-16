package com.avito.android.vas_planning.dialog;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f322307l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar) {
        super(1);
        this.f322307l = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        Picker picker = (Picker) view2.findViewById(R.id.picker);
        g gVar = this.f322307l;
        gVar.f322321M = picker;
        gVar.f322322N = (TextView) view2.findViewById(R.id.picker_status);
        com.avito.android.lib.design.bottom_sheet.d.I(gVar, true);
        Picker picker2 = gVar.f322321M;
        if (picker2 == null) {
            picker2 = null;
        }
        ?? r22 = gVar.f322316H;
        Picker.d(picker2, (List) r22.getValue(), null, 14);
        picker2.a(":");
        ?? r32 = gVar.f322317I;
        Picker.d(picker2, (List) r32.getValue(), null, 14);
        picker2.setFirstWheelValue((k) ((List) r22.getValue()).get(gVar.f322318J));
        picker2.setSecondWheelValue((k) ((List) r32.getValue()).get(gVar.f322319K));
        Button button = gVar.f322320L;
        if (button == null) {
            button = null;
        }
        D6.k(button);
        Button button2 = gVar.f322320L;
        if (button2 == null) {
            button2 = null;
        }
        button2.setText(gVar.f322315G);
        f fVar = new f(gVar);
        picker2.setOnScrollStartedCallback(fVar);
        picker2.setOnSecondScrollStartedCallback(fVar);
        picker2.setOnSelection(new e(gVar));
        Button button3 = gVar.f322320L;
        (button3 != null ? button3 : null).setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(gVar, 10));
        return G0.f406611a;
    }
}
