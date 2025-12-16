package com.avito.android.comfortable_deal.submitting.select;

import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.body_condition.h;
import com.avito.android.lib.design.button.Button;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rp.C47701d;

/* compiled from: SubmittingSelectFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<C47701d> f123291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SubmittingSelectFragment f123292m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f123293n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List<C47701d> list, SubmittingSelectFragment submittingSelectFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(1);
        this.f123291l = list;
        this.f123292m = submittingSelectFragment;
        this.f123293n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        View viewFindViewById = view2.findViewById(R.id.call_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f123293n;
        button.setOnClickListener(new h(20, this.f123292m, dVar));
        button.setText(button.getResources().getString(R.string.submitting_select_dialog_button));
        for (C47701d c47701d : this.f123291l) {
            View viewInflate = dVar.getLayoutInflater().inflate(R.layout.numerated_bullet_item, (ViewGroup) view2.findViewById(R.id.root_content), false);
            View viewFindViewById2 = view2.findViewById(R.id.root_content);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            ((LinearLayout) viewFindViewById2).addView(viewInflate);
            View viewFindViewById3 = viewInflate.findViewById(R.id.number);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(String.valueOf(c47701d.f430202d));
            View viewFindViewById4 = viewInflate.findViewById(R.id.title);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById4).setText(c47701d.f430200b);
        }
        return G0.f406611a;
    }
}
