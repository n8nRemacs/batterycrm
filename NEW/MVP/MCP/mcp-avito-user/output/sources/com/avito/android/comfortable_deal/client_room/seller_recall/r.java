package com.avito.android.comfortable_deal.client_room.seller_recall;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.view.C22977J;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.x;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import ip.InterfaceC42085a;
import java.util.Collections;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.rx3.y;

/* compiled from: SellerRecallView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/r;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f120022a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SellerRecallFragment f120023b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Lifecycle f120024c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22977J f120025d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f120026e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<InterfaceC42085a> f120027f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f120028g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f120029h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BaseSelect f120030i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f120031j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f120032k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<Boolean> f120033l;

    public r(@Y61.k View view, @Y61.k SellerRecallFragment sellerRecallFragment, @Y61.k Lifecycle lifecycle, @Y61.k C22977J c22977j) {
        this.f120022a = view;
        this.f120023b = sellerRecallFragment;
        this.f120024c = lifecycle;
        this.f120025d = c22977j;
        e2 e2VarB = f2.b(0, 0, null, 6);
        this.f120026e = e2VarB;
        this.f120027f = C43175k.a(e2VarB);
        this.f120032k = C42727D.c(new q(this));
        InterfaceC43160i interfaceC43160iD = C43175k.d(new p(this, null));
        Lifecycle.State state = Lifecycle.State.f46682e;
        InterfaceC43160i<Boolean> interfaceC43160iA = C23069w.a(interfaceC43160iD, lifecycle, state);
        this.f120033l = interfaceC43160iA;
        View viewFindViewById = view.findViewById(R.id.submit_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        this.f120029h = input;
        View viewFindViewById4 = view.findViewById(R.id.select_reason);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.BaseSelect");
        }
        BaseSelect baseSelect = (BaseSelect) viewFindViewById4;
        this.f120030i = baseSelect;
        View viewFindViewById5 = view.findViewById(R.id.comment_input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById5;
        this.f120031j = input2;
        View viewFindViewById6 = view.findViewById(R.id.text_disclaimer);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.bottom_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f120028g = (LinearLayout) viewFindViewById7;
        final InterfaceC42085a.e eVar = InterfaceC42085a.e.f405242a;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.client_room.seller_recall.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC42085a interfaceC42085a = eVar;
                r rVar = this.f119962b;
                C43259k.d(rVar.f120025d, null, null, new i(rVar, interfaceC42085a, null), 3);
            }
        });
        final InterfaceC42085a.C11535a c11535a = InterfaceC42085a.C11535a.f405238a;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.client_room.seller_recall.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC42085a interfaceC42085a = c11535a;
                r rVar = this.f119962b;
                C43259k.d(rVar.f120025d, null, null, new i(rVar, interfaceC42085a, null), 3);
            }
        });
        a(input);
        a(input2);
        B0 b0D0 = com.avito.android.lib.design.input.n.f(input).d0(new j(false));
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        C43175k.K(new C43197r1(new n(this, null), C23069w.a(y.a(b0D0.D(oVar)), lifecycle, state)), c22977j);
        C43175k.K(new C43197r1(new o(this, null), C23069w.a(y.a(com.avito.android.lib.design.input.n.f(input2).d0(new j(true)).D(oVar)), lifecycle, state)), c22977j);
        baseSelect.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.client_room.seller_recall.e
            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r49) {
                /*
                    r48 = this;
                    r49.requestFocus()
                    r0 = r48
                    com.avito.android.comfortable_deal.client_room.seller_recall.r r1 = r0.f119960b
                    android.view.View r2 = r1.f120022a
                    android.content.Context r2 = r2.getContext()
                    r3 = 2131956468(0x7f1312f4, float:1.9549493E38)
                    java.lang.String r10 = r2.getString(r3)
                    kotlin.C r2 = r1.f120032k
                    java.lang.Object r2 = r2.getValue()
                    java.util.List r2 = (java.util.List) r2
                    com.avito.android.lib.design.select.BaseSelect r3 = r1.f120030i
                    android.text.Editable r3 = r3.m53getText()
                    r4 = 0
                    if (r3 == 0) goto L34
                    int r5 = r3.length()
                    if (r5 <= 0) goto L2c
                    goto L2d
                L2c:
                    r3 = r4
                L2d:
                    if (r3 == 0) goto L34
                    java.lang.String r3 = r3.toString()
                    goto L35
                L34:
                    r3 = r4
                L35:
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r5 = 10
                    int r5 = kotlin.collections.C42745f0.q(r2, r5)
                    r8.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L46:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L5b
                    java.lang.Object r5 = r2.next()
                    java.lang.String r5 = (java.lang.String) r5
                    com.avito.android.comfortable_deal.client_room.seller_recall.model.ReasonEntity r6 = new com.avito.android.comfortable_deal.client_room.seller_recall.model.ReasonEntity
                    r6.<init>(r5)
                    r8.add(r6)
                    goto L46
                L5b:
                    if (r3 == 0) goto L66
                    com.avito.android.comfortable_deal.client_room.seller_recall.model.ReasonEntity r2 = new com.avito.android.comfortable_deal.client_room.seller_recall.model.ReasonEntity
                    r2.<init>(r3)
                    java.util.List r4 = java.util.Collections.singletonList(r2)
                L66:
                    if (r4 != 0) goto L6c
                    kotlin.collections.z0 r2 = kotlin.collections.C42784z0.f406748b
                    r9 = r2
                    goto L6d
                L6c:
                    r9 = r4
                L6d:
                    com.avito.android.select.Arguments r2 = new com.avito.android.select.Arguments
                    r4 = r2
                    r46 = 255(0xff, float:3.57E-43)
                    r47 = 0
                    r5 = 0
                    java.lang.String r6 = "reason_id"
                    r7 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r31 = 0
                    r32 = 1
                    r33 = 0
                    r34 = 0
                    r35 = 0
                    r36 = 0
                    r37 = 0
                    r38 = 0
                    r39 = 0
                    r40 = 0
                    r41 = 0
                    r42 = 0
                    r43 = 0
                    r44 = 0
                    r45 = -134257851(0xfffffffff7ff6345, float:-1.0359759E34)
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
                    com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallFragment r1 = r1.f120023b
                    com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment r2 = com.avito.android.select.bottom_sheet.c.a(r1, r2)
                    androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()
                    java.lang.String r3 = "reason_tag"
                    r2.show(r1, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.client_room.seller_recall.e.onClick(android.view.View):void");
            }
        });
        input.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.avito.android.comfortable_deal.client_room.seller_recall.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z12) {
                r rVar = this.f119961b;
                rVar.getClass();
                Input.f179303W.getClass();
                rVar.f120029h.setState(Input.f179304a0);
            }
        });
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String string = view.getContext().getString(R.string.recall_seller_disclaimer);
        String string2 = view.getContext().getString(R.string.recall_seller_disclaimer_program);
        String string3 = view.getContext().getString(R.string.recall_seller_disclaimer_program_mask);
        String string4 = view.getContext().getString(R.string.recall_seller_disclaimer_program_url);
        String string5 = view.getContext().getString(R.string.recall_seller_disclaimer_policy);
        String string6 = view.getContext().getString(R.string.recall_seller_disclaimer_policy_mask);
        String string7 = view.getContext().getString(R.string.recall_seller_disclaimer_policy_url);
        FontParameter.UnderlineParameter underlineParameter = FontParameter.UnderlineParameter.INSTANCE;
        AttributedText attributedText = new AttributedText(string, C42745f0.U(new LinkAttribute(string3, string2, string4, Collections.singletonList(underlineParameter)), new LinkAttribute(string6, string5, string7, Collections.singletonList(underlineParameter))), 1);
        attributedText.setOnUrlClickListener(new x() { // from class: com.avito.android.comfortable_deal.client_room.seller_recall.d
            @Override // com.avito.android.deep_linking.links.x
            public final boolean X(String str) {
                r rVar = this.f119950b;
                C43259k.d(rVar.f120025d, null, null, new k(rVar, str, null), 3);
                return true;
            }
        });
        com.avito.android.util.text.j.a(textView, attributedText, null);
        C43175k.K(new C43197r1(new h(this, null), interfaceC43160iA), c22977j);
    }

    public static void b(Input input, CharSequence charSequence, boolean z12) {
        Object deformattedText = z12 ? input.getDeformattedText() : input.m53getText();
        if (charSequence.length() <= 0 || charSequence.equals(deformattedText)) {
            charSequence = null;
        }
        if (charSequence != null) {
            Input.t(input, charSequence, false, 6);
        }
    }

    public final void a(Input input) {
        C43175k.K(new C43197r1(new m(2, this.f120026e, Y1.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), C23069w.a(y.a(com.avito.android.lib.design.input.n.a(input, 6).d0(l.f119973b)), this.f120024c, Lifecycle.State.f46682e)), this.f120025d);
    }
}
