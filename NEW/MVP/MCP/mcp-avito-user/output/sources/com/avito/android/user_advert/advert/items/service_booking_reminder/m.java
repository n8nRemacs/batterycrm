package com.avito.android.user_advert.advert.items.service_booking_reminder;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.x;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.items.service_booking_reminder.c;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingReminderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking_reminder/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/service_booking_reminder/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f310174k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310175b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f310176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f310177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f310178e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f310179f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f310180g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f310181h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f310182i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f310183j;

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310184l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f310184l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f310184l.findViewById(R.id.sb_agreement_text);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Button> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310185l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f310185l = view;
        }

        @Override // Y41.a
        public final Button invoke() {
            View viewFindViewById = this.f310185l.findViewById(R.id.sb_reminder_action_button);
            if (viewFindViewById != null) {
                return (Button) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/banner/Banner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Banner> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310186l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f310186l = view;
        }

        @Override // Y41.a
        public final Banner invoke() {
            return (Banner) this.f310186l;
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ImageView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310187l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.f310187l = view;
        }

        @Override // Y41.a
        public final ImageView invoke() {
            View viewFindViewById = this.f310187l.findViewById(R.id.sb_banner_close);
            if (viewFindViewById != null) {
                return (ImageView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310188l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f310188l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f310188l.findViewById(R.id.sb_reminder_description);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310189l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f310189l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f310189l.findViewById(R.id.sb_status);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingReminderView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f310190l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(0);
            this.f310190l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f310190l.findViewById(R.id.sb_subtitle);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public m(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310175b = aVar;
        this.f310176c = view.getContext();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f310177d = C42727D.b(lazyThreadSafetyMode, new c(view));
        this.f310178e = C42727D.b(lazyThreadSafetyMode, new g(view));
        this.f310179f = C42727D.b(lazyThreadSafetyMode, new f(view));
        this.f310180g = C42727D.b(lazyThreadSafetyMode, new e(view));
        this.f310181h = C42727D.b(lazyThreadSafetyMode, new d(view));
        this.f310182i = C42727D.b(lazyThreadSafetyMode, new b(view));
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new a(view));
        this.f310183j = interfaceC42726CB;
        ((TextView) interfaceC42726CB.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.j
    public final void U60(int i12) throws Resources.NotFoundException {
        ((Banner) this.f310177d.getValue()).setAppearance(C35835l0.j(i12, this.f310176c));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.j
    public final void d70(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        I5.a((TextView) this.f310178e.getValue(), str, false);
        I5.a((TextView) this.f310179f.getValue(), str2, false);
        I5.a((TextView) this.f310180g.getValue(), str3, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.j
    public final void j60(@Y61.k c.a aVar, @Y61.k Y41.a<G0> aVar2) throws Resources.NotFoundException {
        ?? r02 = this.f310182i;
        ((Button) r02.getValue()).setAppearance(C35835l0.j(aVar.f310161c, this.f310176c));
        com.avito.android.lib.design.button.b.a((Button) r02.getValue(), aVar.f310159a, false);
        ((Button) r02.getValue()).setOnClickListener(new l(0, aVar2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.j
    public final void mS(@Y61.l Long l12, @Y61.k Y41.a aVar) {
        ?? r02 = this.f310181h;
        D6.G((ImageView) r02.getValue(), l12 != null);
        ((ImageView) r02.getValue()).setOnClickListener(new l(1, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.j
    public final void tu(@Y61.k final Y41.l lVar, @Y61.k AttributedText attributedText) {
        TextView textView = (TextView) this.f310183j.getValue();
        attributedText.setOnUrlClickListener(new x() { // from class: com.avito.android.user_advert.advert.items.service_booking_reminder.k
            @Override // com.avito.android.deep_linking.links.x
            public final boolean X(String str) {
                int i12 = m.f310174k;
                ((e) lVar).invoke(str);
                return true;
            }
        });
        com.avito.android.util.text.j.a(textView, attributedText, this.f310175b);
    }
}
