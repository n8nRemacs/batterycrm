package com.avito.android.developments_agency_search.screen.deal_room.edit_client;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditClientInfoBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "b", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f137529R = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final e f137530E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final String f137531F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final p<e, String, G0> f137532G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Y41.a<G0> f137533H;

    /* renamed from: I, reason: collision with root package name */
    public Input f137534I;

    /* renamed from: J, reason: collision with root package name */
    public Input f137535J;

    /* renamed from: K, reason: collision with root package name */
    public Input f137536K;

    /* renamed from: L, reason: collision with root package name */
    public Input f137537L;

    /* renamed from: M, reason: collision with root package name */
    public Input f137538M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public UU.a f137539N;

    /* renamed from: O, reason: collision with root package name */
    public Button f137540O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f137541P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f137542Q;

    /* compiled from: EditClientInfoBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.edit_client.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4152a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = (a) this.receiver;
            int i12 = a.f137529R;
            aVar.getClass();
            View viewFindViewById = view2.findViewById(R.id.lastName);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input = (Input) viewFindViewById;
            e eVar = aVar.f137530E;
            Input.t(input, eVar.f137555c, false, 6);
            input.b(new com.avito.android.developments_agency_search.screen.deal_room.edit_client.b(input, aVar));
            aVar.f137534I = input;
            View viewFindViewById2 = view2.findViewById(R.id.firstName);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input2 = (Input) viewFindViewById2;
            Input.t(input2, eVar.f137554b, false, 6);
            input2.b(new com.avito.android.developments_agency_search.screen.deal_room.edit_client.c(input2, aVar));
            aVar.f137535J = input2;
            View viewFindViewById3 = view2.findViewById(R.id.middleName);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input3 = (Input) viewFindViewById3;
            Input.t(input3, eVar.f137556d, false, 6);
            aVar.f137536K = input3;
            View viewFindViewById4 = view2.findViewById(R.id.phone_number);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input4 = (Input) viewFindViewById4;
            Input.t(input4, eVar.f137557e, false, 6);
            input4.b(new d(input4, aVar));
            aVar.f137537L = input4;
            View viewFindViewById5 = view2.findViewById(R.id.additional_info);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input5 = (Input) viewFindViewById5;
            Input.t(input5, aVar.f137531F, false, 6);
            aVar.f137538M = input5;
            View viewFindViewById6 = view2.findViewById(R.id.save_button);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById6;
            button.setState(aVar.f137539N);
            aVar.f137540O = button;
            View viewFindViewById7 = view2.findViewById(R.id.close_button);
            if (viewFindViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById7).setOnClickListener(new h(aVar, 27));
            return G0.f406611a;
        }
    }

    /* compiled from: EditClientInfoBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/a$b;", "", "<init>", "()V", "", "PHONE_NUMBER_VALID_LENGTH", "I", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: EditClientInfoBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            String string;
            a aVar = a.this;
            aVar.f137541P = true;
            aVar.V();
            if (!aVar.f137542Q) {
                Input input = aVar.f137534I;
                if (input == null) {
                    input = null;
                }
                String deformattedText = input.getDeformattedText();
                Input input2 = aVar.f137535J;
                if (input2 == null) {
                    input2 = null;
                }
                String deformattedText2 = input2.getDeformattedText();
                Input input3 = aVar.f137536K;
                if (input3 == null) {
                    input3 = null;
                }
                String deformattedText3 = input3.getDeformattedText();
                Input input4 = aVar.f137537L;
                if (input4 == null) {
                    input4 = null;
                }
                Editable editableM53getText = input4.m53getText();
                if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
                    string = "";
                }
                String str = string;
                e eVar = aVar.f137530E;
                e eVar2 = new e(eVar.f137553a, deformattedText2, deformattedText, deformattedText3, str, eVar.f137558f);
                Input input5 = aVar.f137538M;
                aVar.f137532G.invoke(eVar2, (input5 != null ? input5 : null).getDeformattedText());
            }
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k e eVar, @l String str, @k p<? super e, ? super String, G0> pVar, @k Y41.a<G0> aVar) {
        super(context, R.style.Design_Widget_BottomSheetDialog);
        this.f137530E = eVar;
        this.f137531F = str;
        this.f137532G = pVar;
        this.f137533H = aVar;
        this.f137539N = new UU.a(context.getString(R.string.developments_agency_search_deal_room_edit_client_info_save_button), null, false, false, false, new c(), null, null, null, false, 990, null);
        C(R.layout.developments_agency_search_deal_room_edit_client_info_dialog, new C4152a(1, this, a.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        K(true);
        J(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            r4 = this;
            r0 = 0
            r4.f137542Q = r0
            boolean r0 = r4.f137541P
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2a
            com.avito.android.lib.design.input.Input r0 = r4.f137535J
            if (r0 != 0) goto Le
            r0 = r2
        Le:
            java.lang.String r0 = r0.getDeformattedText()
            int r0 = r0.length()
            if (r0 != 0) goto L2a
            r4.f137542Q = r1
            com.avito.android.lib.design.input.Input r0 = r4.f137535J
            if (r0 != 0) goto L1f
            r0 = r2
        L1f:
            com.avito.android.lib.design.input.Input$c r3 = com.avito.android.lib.design.input.Input.f179303W
            r3.getClass()
            int[] r3 = com.avito.android.lib.design.input.Input.f179305b0
            r0.setState(r3)
            goto L39
        L2a:
            com.avito.android.lib.design.input.Input r0 = r4.f137535J
            if (r0 != 0) goto L2f
            r0 = r2
        L2f:
            com.avito.android.lib.design.input.Input$c r3 = com.avito.android.lib.design.input.Input.f179303W
            r3.getClass()
            int[] r3 = com.avito.android.lib.design.input.Input.f179304a0
            r0.setState(r3)
        L39:
            boolean r0 = r4.f137541P
            if (r0 == 0) goto L5e
            com.avito.android.lib.design.input.Input r0 = r4.f137534I
            if (r0 != 0) goto L42
            r0 = r2
        L42:
            java.lang.String r0 = r0.getDeformattedText()
            int r0 = r0.length()
            if (r0 != 0) goto L5e
            r4.f137542Q = r1
            com.avito.android.lib.design.input.Input r0 = r4.f137534I
            if (r0 != 0) goto L53
            r0 = r2
        L53:
            com.avito.android.lib.design.input.Input$c r3 = com.avito.android.lib.design.input.Input.f179303W
            r3.getClass()
            int[] r3 = com.avito.android.lib.design.input.Input.f179305b0
            r0.setState(r3)
            goto L6d
        L5e:
            com.avito.android.lib.design.input.Input r0 = r4.f137534I
            if (r0 != 0) goto L63
            r0 = r2
        L63:
            com.avito.android.lib.design.input.Input$c r3 = com.avito.android.lib.design.input.Input.f179303W
            r3.getClass()
            int[] r3 = com.avito.android.lib.design.input.Input.f179304a0
            r0.setState(r3)
        L6d:
            boolean r0 = r4.f137541P
            if (r0 == 0) goto L9f
            com.avito.android.lib.design.input.Input r0 = r4.f137537L
            if (r0 != 0) goto L76
            r0 = r2
        L76:
            android.text.Editable r0 = r0.m53getText()
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L84
        L82:
            java.lang.String r0 = ""
        L84:
            int r0 = r0.length()
            r3 = 16
            if (r0 == r3) goto L9f
            r4.f137542Q = r1
            com.avito.android.lib.design.input.Input r0 = r4.f137537L
            if (r0 != 0) goto L93
            goto L94
        L93:
            r2 = r0
        L94:
            com.avito.android.lib.design.input.Input$c r0 = com.avito.android.lib.design.input.Input.f179303W
            r0.getClass()
            int[] r0 = com.avito.android.lib.design.input.Input.f179305b0
            r2.setState(r0)
            goto Laf
        L9f:
            com.avito.android.lib.design.input.Input r0 = r4.f137537L
            if (r0 != 0) goto La4
            goto La5
        La4:
            r2 = r0
        La5:
            com.avito.android.lib.design.input.Input$c r0 = com.avito.android.lib.design.input.Input.f179303W
            r0.getClass()
            int[] r0 = com.avito.android.lib.design.input.Input.f179304a0
            r2.setState(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.edit_client.a.V():void");
    }
}
