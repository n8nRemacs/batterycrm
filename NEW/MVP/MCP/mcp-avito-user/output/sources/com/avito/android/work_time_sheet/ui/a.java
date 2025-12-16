package com.avito.android.work_time_sheet.ui;

import PK0.n;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.description_list.parameter_line.item.b;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.work_time_sheet.link.WorkTimeSheetBody;
import com.avito.android.work_time_sheet.link.WorkTimeSheetItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: WorkTimeBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_time_sheet/ui/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f331332G = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final WorkTimeSheetBody f331333E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.description_list.parameter_line.item.b f331334F;

    /* compiled from: WorkTimeBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.work_time_sheet.ui.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10301a extends H implements l<View, G0> {
        public final void f(@k View view) {
            a aVar = (a) this.receiver;
            int i12 = a.f331332G;
            aVar.getClass();
            TextView textView = (TextView) view.findViewById(R.id.work_time_sheet_title);
            Button button = (Button) view.findViewById(R.id.work_time_sheet_button_ok);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.work_time_sheet_items);
            WorkTimeSheetBody workTimeSheetBody = aVar.f331333E;
            textView.setText(workTimeSheetBody.getTitle());
            button.setState(new UU.a(workTimeSheetBody.getAction(), null, false, false, false, new b(aVar), null, null, null, false, 990, null));
            viewGroup.removeAllViews();
            int i13 = 0;
            for (Object obj : workTimeSheetBody.d()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                WorkTimeSheetItem workTimeSheetItem = (WorkTimeSheetItem) obj;
                DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(view.getContext(), null, 0, 0, 14, null);
                descriptionParameterItem.setState(new com.avito.android.lib.design.description_list.parameter_line.item.a(null, workTimeSheetItem.getDay(), workTimeSheetItem.getStatus(), 1, null));
                descriptionParameterItem.setStyle(aVar.f331334F);
                int i15 = c.f331336a;
                descriptionParameterItem.setPaddingRelative(0, i15, 0, i15);
                descriptionParameterItem.setTag("work_time_sheet_item_" + i13);
                viewGroup.addView(descriptionParameterItem);
                i13 = i14;
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    public a(@k Context context, @k WorkTimeSheetBody workTimeSheetBody) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f331333E = workTimeSheetBody;
        com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
        int iJ2 = C35835l0.j(R.attr.textM20, context);
        dVar.getClass();
        n nVarA = com.avito.android.lib.design.text_view.d.a(iJ2, context);
        C35763c0 c35763c0 = null;
        float f12 = 70.0f;
        float f13 = 30.0f;
        C35763c0 c35763c02 = null;
        this.f331334F = new com.avito.android.lib.design.description_list.parameter_line.item.b(f12, f13, new b.C5267b(c35763c0, 0.0f, 0.0f, 0.0f, 0.0f, 22, null), nVarA, nVarA, c35763c02, c35763c0, 0, null, 480, null);
        S(C35835l0.g(context).y);
        d.I(this, true);
        d.M(this, null, false, true, 3);
        C(R.layout.work_time_sheet_content, new C10301a(1, this, a.class, "onInflated", "onInflated(Landroid/view/View;)V", 0));
    }
}
