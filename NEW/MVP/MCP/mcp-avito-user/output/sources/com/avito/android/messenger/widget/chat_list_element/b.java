package com.avito.android.messenger.widget.chat_list_element;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.d;
import com.avito.android.image_loader.p;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.TypefaceType;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ChatListElement.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/b;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b implements ChatListElement {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f197486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final androidx.appcompat.view.d f197487c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f197488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f197489e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f197490f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final View f197491g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f197492h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f197493i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f197494j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f197495k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f197496l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final View f197497m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final TextView f197498n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f197499o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f197500p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final TextView f197501q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final ImageView f197502r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final ImageView f197503s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.d f197504t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final g<String> f197505u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final Drawable f197506v;

    /* renamed from: w, reason: collision with root package name */
    public final int f197507w;

    /* compiled from: ChatListElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ChatListElement.LastMessageType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChatListElement.LastMessageType lastMessageType = ChatListElement.LastMessageType.f197466b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ChatListElement.LastMessageType lastMessageType2 = ChatListElement.LastMessageType.f197466b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChatListElement.LastMessageType lastMessageType3 = ChatListElement.LastMessageType.f197466b;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(@k View view) {
        this.f197486b = view;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f197487c = dVar;
        View viewFindViewById = view.findViewById(R.id.item_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f197488d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.system_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f197489e = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.u2u_interlocutor_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f197490f = (SimpleDraweeView) viewFindViewById3;
        this.f197491g = view.findViewById(R.id.item_image_container);
        View viewFindViewById4 = view.findViewById(R.id.avatar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f197492h = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.online_status_indicator);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f197493i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.messenger_tags_badge_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f197494j = (DockingBadgeContainer) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.chat_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197495k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.date);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197496l = (TextView) viewFindViewById8;
        this.f197497m = view.findViewById(R.id.item_block);
        View viewFindViewById9 = view.findViewById(R.id.item_name);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197498n = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.price);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197499o = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.last_message);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197500p = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.is_typing);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197501q = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.chat_list_item_pin_image);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f197502r = (ImageView) viewFindViewById13;
        this.f197503s = (ImageView) view.findViewById(R.id.chat_list_item_unread_badge);
        this.f197504t = new com.avito.android.image_loader.e().a(dVar);
        this.f197505u = new g<>(new c(this), C42745f0.U(dVar.getString(R.string.messenger_typing_indicator_text_1), dVar.getString(R.string.messenger_typing_indicator_text_2), dVar.getString(R.string.messenger_typing_indicator_text_3), dVar.getString(R.string.messenger_typing_indicator_text_4)));
        this.f197506v = dVar.getDrawable(R.drawable.ic_messenger_item_placeholder_72);
        this.f197507w = dVar.getResources().getDimensionPixelSize(R.dimen.messenger_item_image_corners);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void a(boolean z12) throws Resources.NotFoundException {
        View view = this.f197486b;
        Resources resources = view.getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.active_alpha, typedValue, true);
        float f12 = typedValue.getFloat();
        for (View view2 : C42745f0.U(this.f197488d, this.f197492h, this.f197495k, this.f197496l, this.f197498n, this.f197499o, this.f197500p)) {
            if (view2 != null) {
                view2.setAlpha(f12);
            }
        }
        view.setTag(Boolean.valueOf(z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k com.avito.android.messenger.widget.chat_list_element.ChatListElement.LastMessageType r6, @Y61.k HY.q r7) {
        /*
            r5 = this;
            int r6 = r6.ordinal()
            r0 = 0
            r1 = 2
            android.widget.TextView r2 = r5.f197496l
            if (r6 == r1) goto L51
            r1 = 3
            r3 = 2130969153(0x7f040241, float:1.754698E38)
            if (r6 == r1) goto L40
            r1 = 4
            if (r6 == r1) goto L2f
            r1 = 5
            if (r6 == r1) goto L1b
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r0, r0)
            goto L90
        L1b:
            r6 = 2131234290(0x7f080df2, float:1.8084742E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1 = 2130973902(0x7f0414ce, float:1.7556612E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Q r3 = new kotlin.Q
            r3.<init>(r6, r1)
            goto L64
        L2f:
            r6 = 2131234289(0x7f080df1, float:1.808474E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            kotlin.Q r3 = new kotlin.Q
            r3.<init>(r6, r1)
            goto L64
        L40:
            r6 = 2131234292(0x7f080df4, float:1.8084746E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            kotlin.Q r3 = new kotlin.Q
            r3.<init>(r6, r1)
            goto L64
        L51:
            r6 = 2131234291(0x7f080df3, float:1.8084744E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1 = 2130971369(0x7f040ae9, float:1.7551474E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Q r3 = new kotlin.Q
            r3.<init>(r6, r1)
        L64:
            A r6 = r3.f406619b
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            B r1 = r3.f406620c
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.view.View r3 = r5.f197486b
            android.content.Context r4 = r3.getContext()
            int r1 = com.avito.android.util.C35835l0.d(r1, r4)
            android.content.Context r3 = r3.getContext()
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r6)
            if (r6 == 0) goto L8c
            com.avito.android.util.V0.d(r6, r1)
            goto L8d
        L8c:
            r6 = r0
        L8d:
            r2.setCompoundDrawablesWithIntrinsicBounds(r6, r0, r0, r0)
        L90:
            androidx.appcompat.view.d r6 = r5.f197487c
            com.avito.android.printable_text.PrintableText r1 = r7.f7272a
            java.lang.Integer r7 = r7.f7273b
            if (r7 == 0) goto Ld6
            int r7 = r7.intValue()
            android.graphics.drawable.Drawable r7 = r6.getDrawable(r7)
            if (r7 == 0) goto Laf
            int r0 = r7.getIntrinsicWidth()
            int r2 = r7.getIntrinsicHeight()
            r3 = 0
            r7.setBounds(r3, r3, r0, r2)
            r0 = r7
        Laf:
            jX0.a r7 = new jX0.a
            r7.<init>(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.lang.String r2 = "call"
            r3 = 17
            r0.append(r2, r7, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = " "
            r7.<init>(r2)
            java.lang.CharSequence r6 = r1.Y4(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.append(r6)
            goto Lda
        Ld6:
            java.lang.CharSequence r0 = r1.Y4(r6)
        Lda:
            android.widget.TextView r6 = r5.f197500p
            r6.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.widget.chat_list_element.b.b(com.avito.android.messenger.widget.chat_list_element.ChatListElement$LastMessageType, HY.q):void");
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void b0(@l String str) {
        this.f197496l.setText(str);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void c(@k Y41.a<G0> aVar) {
        this.f197486b.setOnClickListener(new com.avito.android.messenger.widget.chat_list_element.a(0, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.avito.android.image_loader.k] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.avito.android.image_loader.k] */
    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void d(@k ChatListElement.c cVar) {
        Uri uriA;
        Uri uriB;
        boolean z12 = cVar instanceof ChatListElement.c.a;
        androidx.appcompat.view.d dVar = this.f197487c;
        int i12 = this.f197507w;
        SimpleDraweeView simpleDraweeView = this.f197490f;
        View view = this.f197491g;
        SimpleDraweeView simpleDraweeView2 = this.f197489e;
        if (z12) {
            Image image = ((ChatListElement.c.a) cVar).f197479a;
            ?? B12 = image != null ? com.avito.android.image_loader.b.b(image) : null;
            D6.w(simpleDraweeView2);
            D6.H(view);
            D6.w(simpleDraweeView);
            C35949t5.c(this.f197488d, B12, this.f197506v, null, d.a.a(this.f197504t, dVar, B12, null, Integer.valueOf(i12), 20), 4);
        } else {
            boolean z13 = cVar instanceof ChatListElement.c.C5817c;
            SimpleDraweeView simpleDraweeView3 = this.f197488d;
            if (z13) {
                Image image2 = ((ChatListElement.c.C5817c) cVar).f197481a;
                p pVar = (image2 == null || (uriB = C35829k2.c(image2, simpleDraweeView2, 1, 16).b()) == null) ? null : new p(uriB);
                simpleDraweeView3.getHierarchy().o(null, 1);
                C35949t5.a(simpleDraweeView3).b();
                D6.H(simpleDraweeView2);
                D6.w(view);
                C35949t5.c(this.f197489e, pVar, null, null, null, 14);
            } else if (cVar instanceof ChatListElement.c.b) {
                Image image3 = ((ChatListElement.c.b) cVar).f197480a;
                ?? B13 = image3 != null ? com.avito.android.image_loader.b.b(image3) : null;
                D6.w(simpleDraweeView2);
                D6.H(view);
                D6.w(simpleDraweeView);
                C35949t5.c(this.f197488d, B13, this.f197506v, null, d.a.a(this.f197504t, dVar, B13, null, Integer.valueOf(i12), 20), 4);
            } else {
                if (!(cVar instanceof ChatListElement.c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatListElement.c.d dVar2 = (ChatListElement.c.d) cVar;
                Image image4 = dVar2.f197482a;
                if (image4 != null) {
                    com.avito.android.image_loader.b.b(image4);
                }
                Image image5 = dVar2.f197483b;
                com.avito.android.image_loader.a aVarB = image5 != null ? com.avito.android.image_loader.b.b(image5) : null;
                simpleDraweeView3.getHierarchy().o(null, 1);
                C35949t5.a(simpleDraweeView3).b();
                D6.w(simpleDraweeView2);
                D6.w(view);
                D6.H(simpleDraweeView);
                C35949t5.c(this.f197490f, aVarB, null, null, null, 14);
                if (aVarB != null && (uriA = aVarB.a(simpleDraweeView)) != null) {
                    string = uriA.toString();
                }
                simpleDraweeView.setTag(string);
            }
        }
        G0 g02 = G0.f406611a;
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void e(boolean z12) {
        D6.G(this.f197493i, z12);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void f(@l com.avito.android.image_loader.a aVar, boolean z12) {
        SimpleDraweeView simpleDraweeView = this.f197492h;
        if (!z12 && aVar == null) {
            simpleDraweeView.setVisibility(8);
        } else {
            simpleDraweeView.setVisibility(0);
            C35949t5.c(simpleDraweeView, aVar, simpleDraweeView.getContext().getDrawable(R.drawable.ic_messenger_avatar_placeholder_32), null, null, 12);
        }
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void g(boolean z12) {
        TextView textView = this.f197501q;
        TextView textView2 = this.f197500p;
        g<String> gVar = this.f197505u;
        if (!z12) {
            gVar.f197518d.removeCallbacks(gVar.f197519e);
            gVar.f197517c = 0;
            textView.setVisibility(4);
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(4);
        textView.setVisibility(0);
        int i12 = gVar.f197517c;
        if (i12 == 0) {
            List<String> list = gVar.f197515a;
            ((c) gVar.f197516b).invoke(list.get(i12 % list.size()));
            gVar.f197517c++;
            gVar.f197518d.postDelayed(gVar.f197519e, 300L);
        }
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void h(@k List<DockingBadgeItem> list) {
        boolean z12 = !list.isEmpty();
        DockingBadgeContainer dockingBadgeContainer = this.f197494j;
        D6.G(dockingBadgeContainer, z12);
        dockingBadgeContainer.setBadgeItems(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void i(boolean z12) {
        Q q12 = z12 ? new Q(Integer.valueOf(R.attr.gray48), TypefaceType.f318744d) : new Q(Integer.valueOf(R.attr.black), TypefaceType.f318743c);
        int iIntValue = ((Number) q12.f406619b).intValue();
        TypefaceType typefaceType = (TypefaceType) q12.f406620c;
        TextView textView = this.f197498n;
        TextView textView2 = this.f197499o;
        TextView textView3 = this.f197500p;
        TextView textView4 = this.f197496l;
        for (TextView textView5 : C42745f0.U(textView, textView2, textView3, textView4)) {
            textView5.setTypeface(C35777d6.a(textView5.getContext(), typefaceType));
        }
        for (TextView textView6 : C42745f0.U(textView3, textView4)) {
            textView6.setTextColor(C35835l0.d(iIntValue, textView6.getContext()));
        }
        textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()));
        D6.G(this.f197503s, !z12);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void j(@l String str, @l String str2, @l String str3) {
        TextView textView = this.f197500p;
        View view = this.f197497m;
        if (((str == null || C43066x.K(str)) && ((str2 == null || C43066x.K(str2)) && str3 == null)) || (str3 != null && C43066x.K(str3))) {
            D6.w(view);
            textView.setLines(2);
            return;
        }
        boolean z12 = str3 == null || C43066x.K(str3);
        TextView textView2 = this.f197498n;
        TextView textView3 = this.f197499o;
        if (!z12) {
            D6.w(textView3);
            textView2.getLayoutParams().width = (int) Math.ceil(textView2.getPaint().measureText(str3 != null ? str3 : ""));
            textView2.setText(str3);
            D6.H(view);
            textView.setLines(1);
            return;
        }
        D6.H(textView3);
        if (str2 == null || C43066x.K(str2)) {
            textView3.setText(str2);
        } else {
            textView3.setText(this.f197486b.getContext().getString(R.string.messenger_item_price_with_separator, str2));
        }
        textView2.getLayoutParams().width = (int) Math.ceil(textView2.getPaint().measureText(str != null ? str : ""));
        textView2.setText(str);
        D6.H(view);
        textView.setLines(1);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void k(@l String str) {
        this.f197495k.setText(str);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void l(boolean z12) {
        D6.G(this.f197502r, z12);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void m(@k View.OnLongClickListener onLongClickListener) {
        this.f197486b.setOnLongClickListener(onLongClickListener);
    }

    @Override // com.avito.android.messenger.widget.chat_list_element.ChatListElement
    public final void n(boolean z12, @k ChatListElement.LastMessageType lastMessageType) {
        this.f197500p.setTag(new ChatListElement.a(z12, lastMessageType));
    }
}
