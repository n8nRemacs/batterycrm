package com.avito.android.mortgage_invite.participant.close_dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CloseDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/close_dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final o20.b f206071E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Y41.a<G0> f206072F;

    /* compiled from: CloseDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.close_dialog_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            final b bVar = b.this;
            ((TextView) viewFindViewById).setText(bVar.f206071E.f419317a);
            View viewFindViewById2 = view2.findViewById(R.id.close_dialog_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            o20.b bVar2 = bVar.f206071E;
            ((TextView) viewFindViewById2).setText(bVar2.f419318b);
            View viewFindViewById3 = view2.findViewById(R.id.close_dialog_primary);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById3;
            button.setText(bVar2.f419319c);
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.mortgage_invite.participant.close_dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i12) {
                        case 0:
                            bVar.dismiss();
                            break;
                        default:
                            b bVar3 = bVar;
                            bVar3.f206072F.invoke();
                            bVar3.dismiss();
                            break;
                    }
                }
            });
            View viewFindViewById4 = view2.findViewById(R.id.close_dialog_secondary);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button2 = (Button) viewFindViewById4;
            button2.setText(bVar2.f419320d);
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.mortgage_invite.participant.close_dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i13) {
                        case 0:
                            bVar.dismiss();
                            break;
                        default:
                            b bVar3 = bVar;
                            bVar3.f206072F.invoke();
                            bVar3.dismiss();
                            break;
                    }
                }
            });
            return G0.f406611a;
        }
    }

    public b(@k Context context, @k o20.b bVar, @k Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f206071E = bVar;
        this.f206072F = aVar;
        d.M(this, null, false, true, 7);
        C(R.layout.mortgage_invite_close_dialog_layout, new a());
    }
}
