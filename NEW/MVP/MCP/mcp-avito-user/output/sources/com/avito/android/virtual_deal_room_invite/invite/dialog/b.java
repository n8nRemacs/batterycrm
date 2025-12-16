package com.avito.android.virtual_deal_room_invite.invite.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import iO0.C41327b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeclineDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final C41327b f326995E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Y41.a<G0> f326996F;

    /* compiled from: DeclineDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.accept_button_dialog);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            final b bVar = b.this;
            button.setText(bVar.f326995E.getContinueButton());
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.virtual_deal_room_invite.invite.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i12) {
                        case 0:
                            bVar.f326996F.invoke();
                            break;
                        case 1:
                            bVar.dismiss();
                            break;
                        default:
                            bVar.dismiss();
                            break;
                    }
                }
            });
            View viewFindViewById2 = view2.findViewById(R.id.decline_button_dialog);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button2 = (Button) viewFindViewById2;
            C41327b c41327b = bVar.f326995E;
            button2.setText(c41327b.getRejectButton());
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.virtual_deal_room_invite.invite.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i13) {
                        case 0:
                            bVar.f326996F.invoke();
                            break;
                        case 1:
                            bVar.dismiss();
                            break;
                        default:
                            bVar.dismiss();
                            break;
                    }
                }
            });
            View viewFindViewById3 = view2.findViewById(R.id.description_decline);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(c41327b.getSubtitle());
            View viewFindViewById4 = view2.findViewById(R.id.title_decline);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById4).setText(c41327b.getTitle());
            View viewFindViewById5 = view2.findViewById(R.id.close_icon);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            final int i14 = 2;
            ((ImageView) viewFindViewById5).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.virtual_deal_room_invite.invite.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i14) {
                        case 0:
                            bVar.f326996F.invoke();
                            break;
                        case 1:
                            bVar.dismiss();
                            break;
                        default:
                            bVar.dismiss();
                            break;
                    }
                }
            });
            return G0.f406611a;
        }
    }

    public b(@k Context context, @k C41327b c41327b, @k Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f326995E = c41327b;
        this.f326996F = aVar;
        d.M(this, null, false, true, 7);
        C(R.layout.virtual_deal_room_invite_decline_dialog_layout, new a());
    }
}
