package com.avito.android.short_term_rent.soft_booking.dialog;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.g;
import com.avito.android.services_transportation_widget.dialog.h;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsBottomDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/dialog/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: I, reason: collision with root package name */
    @k
    public static final C8444a f282581I = new C8444a(null);

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC42726C f282582E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final InterfaceC42726C f282583F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final InterfaceC42726C f282584G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final InterfaceC42726C f282585H;

    /* compiled from: BadgeDetailsBottomDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/dialog/a$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.soft_booking.dialog.a$a, reason: collision with other inner class name */
    public static final class C8444a {
        public /* synthetic */ C8444a(C42822w c42822w) {
            this();
        }

        public static void a(@k Context context, @k RetroBadgeItemHint retroBadgeItemHint) {
            a aVar = new a(context);
            String str = retroBadgeItemHint.f283051d;
            if (str != null) {
                com.avito.android.image_loader.glide.utils.b.c((ImageView) aVar.f282582E.getValue(), Uri.parse(str));
            }
            I5.a((TextView) aVar.f282583F.getValue(), retroBadgeItemHint.f283052e, false);
            j.a((TextView) aVar.f282584G.getValue(), retroBadgeItemHint.f283050c, null);
            InterfaceC42726C interfaceC42726C = aVar.f282585H;
            com.avito.android.lib.design.button.b.a((Button) interfaceC42726C.getValue(), retroBadgeItemHint.f283049b, false);
            ((Button) interfaceC42726C.getValue()).setOnClickListener(new h(aVar, 2));
            g.a(aVar);
        }

        public C8444a() {
        }
    }

    /* compiled from: BadgeDetailsBottomDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Button> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) a.this.findViewById(R.id.done_button);
        }
    }

    /* compiled from: BadgeDetailsBottomDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TextView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) a.this.findViewById(R.id.badge_description);
        }
    }

    /* compiled from: BadgeDetailsBottomDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ImageView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            return (ImageView) a.this.findViewById(R.id.badge_icon);
        }
    }

    /* compiled from: BadgeDetailsBottomDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) a.this.findViewById(R.id.badge_title);
        }
    }

    public a(@k Context context) {
        super(context, 0, 2, null);
        this.f282582E = C42727D.c(new d());
        this.f282583F = C42727D.c(new e());
        this.f282584G = C42727D.c(new c());
        this.f282585H = C42727D.c(new b());
        D(R.layout.str_badge_details_bottom_dialog, true);
        com.avito.android.lib.design.bottom_sheet.j.a(this, false, true, Integer.valueOf(C35835l0.d(R.attr.blackAlpha8, getContext())));
    }
}
