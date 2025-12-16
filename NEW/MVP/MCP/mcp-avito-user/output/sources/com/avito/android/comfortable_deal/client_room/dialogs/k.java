package com.avito.android.comfortable_deal.client_room.dialogs;

import Y41.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAgentFaqDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/dialogs/k;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final l<String, G0> f119854E;

    /* compiled from: SelectAgentFaqDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f119856m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.f119856m = context;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.select_agent_rules);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(new com.avito.android.body_condition.h(16, k.this, this.f119856m));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k Context context, @Y61.k l<? super String, G0> lVar) {
        super(context, 0, 2, null);
        this.f119854E = lVar;
        C(R.layout.select_agent_layout, new a(context));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 3);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
    }
}
