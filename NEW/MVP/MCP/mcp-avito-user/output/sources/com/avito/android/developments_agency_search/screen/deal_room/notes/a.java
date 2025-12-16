package com.avito.android.developments_agency_search.screen.deal_room.notes;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.crm_candidates.view.dialogs.f;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: EditNoteBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/notes/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends d {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f137798H = 0;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f137799E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Y41.l<String, G0> f137800F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final Y41.a<G0> f137801G;

    /* compiled from: EditNoteBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.notes.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4155a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = (a) this.receiver;
            int i12 = a.f137798H;
            aVar.getClass();
            View viewFindViewById = view2.findViewById(R.id.edit_area);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input = (Input) viewFindViewById;
            Input.t(input, aVar.f137799E, false, 6);
            input.requestFocus();
            View viewFindViewById2 = view2.findViewById(R.id.save_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            ((Button) viewFindViewById2).setOnClickListener(new f(14, input, aVar));
            View viewFindViewById3 = view2.findViewById(R.id.close_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById3).setOnClickListener(new h(aVar, 28));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @l String str, @k Y41.l<? super String, G0> lVar, @k Y41.a<G0> aVar) {
        super(context, R.style.Design_Widget_BottomSheetDialog);
        this.f137799E = str;
        this.f137800F = lVar;
        this.f137801G = aVar;
        C(R.layout.dialog_deal_room_edit_note, new C4155a(1, this, a.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        d.M(this, null, false, true, 7);
    }
}
