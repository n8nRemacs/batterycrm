package com.avito.android.str_booking.ui.user_info;

import Au.ViewOnClickListenerC13080b;
import Jx0.C14258a;
import KV.a;
import Vx0.AbstractC15725a;
import Y41.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.Rating;
import com.avito.android.str_booking.network.models.sections.UserInfoContent;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingUserInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/user_info/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/user_info/l;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f286188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f286189c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f286190d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f286191e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AppCompatImageView f286192f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AppCompatImageView f286193g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f286194h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f286195i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ImageView f286196j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageView f286197k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f286198l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f286199m;

    /* compiled from: StrBookingUserInfoView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_booking/ui/user_info/m$a;", "", "<init>", "()V", "", "CALL_BUTTON_ID", "Ljava/lang/String;", "CHAT_BUTTON_ID", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view) {
        super(view);
        this.f286188b = view;
        View viewFindViewById = view.findViewById(R.id.str_booking_user_info_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f286189c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_user_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f286190d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.str_booking_user_image_placeholder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286191e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.str_user_active_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        }
        this.f286192f = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.str_user_rating_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        }
        this.f286193g = (AppCompatImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.str_booking_user_name);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286194h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.str_booking_user_feedback);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286195i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.call_icon);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f286196j = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.chat_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f286197k = (ImageView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.guest_profile_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f286198l = (Button) viewFindViewById10;
    }

    @Override // com.avito.android.str_booking.ui.user_info.l
    public final void Kj(@Y61.k c cVar, @Y61.l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        List<Attribute> attributes;
        Rating rating;
        Rating rating2;
        Rating rating3;
        UserInfoContent userInfoContent = cVar.f286179b;
        D6.G(this.f286193g, (userInfoContent == null || (rating3 = userInfoContent.getRating()) == null) ? false : L.f(rating3.getHasFeedback(), Boolean.TRUE));
        AttributedText description = null;
        kotlin.c.c(this.f286195i, (userInfoContent == null || (rating2 = userInfoContent.getRating()) == null) ? null : rating2.getDescription(), rVar, null);
        if (userInfoContent != null && (rating = userInfoContent.getRating()) != null) {
            description = rating.getDescription();
        }
        if (description == null || (attributes = description.getAttributes()) == null) {
            return;
        }
        for (Attribute attribute : attributes) {
            if (attribute instanceof LinkAttribute) {
                this.f286189c.setOnClickListener(new ViewOnClickListenerC13080b(26, rVar, (LinkAttribute) attribute));
                return;
            }
        }
    }

    @Override // com.avito.android.str_booking.ui.user_info.l
    public final void Nt(boolean z12) {
        D6.G(this.f286192f, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.collections.z0] */
    @Override // com.avito.android.str_booking.ui.user_info.l
    public final void RI(@Y61.k c cVar, @Y61.l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar, @Y61.l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar2) {
        ?? arrayList;
        Object next;
        Object next2;
        List<com.avito.android.str_booking.network.models.common.Button> listC;
        List<com.avito.android.str_booking.network.models.common.Button> listC2;
        UserInfoContent userInfoContent = cVar.f286179b;
        com.avito.android.str_booking.network.models.common.Button button = null;
        if (userInfoContent == null || (listC2 = userInfoContent.c()) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listC2) {
                com.avito.android.str_booking.network.models.common.Button button2 = (com.avito.android.str_booking.network.models.common.Button) obj;
                if (button2 != null) {
                    ButtonAction action = button2.getAction();
                    if (L.f(action != null ? action.f285860b : null, "guestProfileButton")) {
                    }
                }
                arrayList.add(obj);
            }
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        Iterable iterable = (Iterable) arrayList;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.avito.android.str_booking.network.models.common.Button button3 = (com.avito.android.str_booking.network.models.common.Button) next;
            if (L.f(button3 != null ? button3.getTitle() : null, "Позвонить")) {
                break;
            }
        }
        com.avito.android.str_booking.network.models.common.Button button4 = (com.avito.android.str_booking.network.models.common.Button) next;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            com.avito.android.str_booking.network.models.common.Button button5 = (com.avito.android.str_booking.network.models.common.Button) next2;
            if (L.f(button5 != null ? button5.getTitle() : null, "Написать")) {
                break;
            }
        }
        com.avito.android.str_booking.network.models.common.Button button6 = (com.avito.android.str_booking.network.models.common.Button) next2;
        ImageView imageView = this.f286196j;
        if (button4 == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
            Function4.a(imageView, button4, rVar);
        }
        ImageView imageView2 = this.f286197k;
        if (button6 == null) {
            D6.w(imageView2);
        } else {
            D6.H(imageView2);
            Function4.a(imageView2, button6, rVar);
        }
        if (userInfoContent != null && (listC = userInfoContent.c()) != null) {
            Iterator it3 = listC.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ?? next3 = it3.next();
                com.avito.android.str_booking.network.models.common.Button button7 = (com.avito.android.str_booking.network.models.common.Button) next3;
                if (button7 != null) {
                    ButtonAction action2 = button7.getAction();
                    if (L.f(action2 != null ? action2.f285860b : null, "guestProfileButton")) {
                        button = next3;
                        break;
                    }
                }
            }
            button = button;
        }
        Button button8 = this.f286198l;
        if (button == null) {
            D6.w(button8);
            return;
        }
        com.avito.android.lib.design.button.b.a(button8, button.getTitle(), false);
        String preset = button.getPreset();
        if (preset == null) {
            preset = "";
        }
        button8.setAppearanceFromAttr(Function4.c(preset));
        Function4.a(button8, button, rVar2);
        D6.H(button8);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // com.avito.android.str_booking.ui.user_info.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vs(@Y61.k com.avito.android.str_booking.ui.user_info.c r7) {
        /*
            r6 = this;
            com.avito.android.str_booking.network.models.sections.UserInfoContent r7 = r7.f286179b
            r0 = 0
            if (r7 == 0) goto La
            com.avito.android.remote.model.UniversalImage r1 = r7.getThemedImage()
            goto Lb
        La:
            r1 = r0
        Lb:
            r2 = 0
            if (r1 != 0) goto L1b
            if (r7 == 0) goto L15
            java.lang.String r1 = r7.getImage()
            goto L16
        L15:
            r1 = r0
        L16:
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 4
            goto L1c
        L1b:
            r1 = r2
        L1c:
            com.avito.android.fresco.SimpleDraweeView r3 = r6.f286190d
            r3.setVisibility(r1)
            if (r7 == 0) goto L5b
            com.avito.android.remote.model.UniversalImage r1 = r7.getThemedImage()
            if (r1 == 0) goto L5b
            android.view.View r4 = r6.f286188b
            com.avito.android.remote.model.Image r1 = com.avito.android.advert.item.delivery_suggests.l.g(r4, r1)
            if (r1 == 0) goto L5b
            com.avito.android.image_loader.ImageRequest$a r4 = new com.avito.android.image_loader.ImageRequest$a
            DM.a r5 = new DM.a
            r5.<init>(r3)
            r4.<init>(r5)
            com.avito.android.image_loader.a r1 = com.avito.android.image_loader.b.b(r1)
            r4.d(r1)
            r1 = 2131231703(0x7f0803d7, float:1.8079495E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.f169485c = r1
            r1 = 1
            r4.f169486d = r1
            r1 = 10
            int r1 = com.avito.android.util.y6.b(r1)
            r4.e(r1)
            r4.c()
            goto L6c
        L5b:
            if (r7 == 0) goto L6c
            java.lang.String r1 = r7.getImage()
            if (r1 == 0) goto L6c
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 == 0) goto L6c
            r3.setImageURI(r1)
        L6c:
            if (r7 == 0) goto L7f
            java.lang.String r1 = r7.getName()
            if (r1 == 0) goto L7f
            java.lang.Character r1 = kotlin.text.C43066x.E(r1)
            if (r1 == 0) goto L7f
            java.lang.String r1 = r1.toString()
            goto L80
        L7f:
            r1 = r0
        L80:
            android.widget.TextView r3 = r6.f286191e
            com.avito.android.util.I5.a(r3, r1, r2)
            if (r7 == 0) goto L8b
            java.lang.String r0 = r7.getName()
        L8b:
            android.widget.TextView r7 = r6.f286194h
            com.avito.android.util.I5.a(r7, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.ui.user_info.m.Vs(com.avito.android.str_booking.ui.user_info.c):void");
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f286199m;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f286199m = null;
    }

    @Override // com.avito.android.str_booking.ui.user_info.l
    public final void qz(@Y61.k Y41.a<G0> aVar) {
        Context context = this.f286198l.getContext();
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(context, 0, 0, 6, null);
        a.C0572a c0572a = KV.a.f9464v;
        int iJ2 = C35835l0.j(R.attr.tooltipDefault, context);
        c0572a.getClass();
        kVar.c(KV.a.a(a.C0572a.b(iJ2, context), C35835l0.g(context).x - (y6.b(28) * 2), 0, 0, 2097150));
        kVar.b(new TooltipState(new r.a(new i.a(new b.a())), true, null, null, context.getString(R.string.str_Booking_guest_profile_tooltip_text), null, null, null, null, null, false, null, this.f286198l, TooltipState.State.f181285b, 3052, null));
        this.f286199m = kVar;
        aVar.invoke();
    }
}
