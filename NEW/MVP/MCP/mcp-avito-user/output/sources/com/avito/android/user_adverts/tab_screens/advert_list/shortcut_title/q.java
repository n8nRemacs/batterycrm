package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.util.C35835l0;
import j.e0;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShortcutTitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/q;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/l;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q extends l {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f314800l = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f314801c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f314802d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Checkbox f314803e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f314804f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f314805g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f314806h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super State, G0> f314807i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public o f314808j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f314809k;

    /* compiled from: ShortcutTitleItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/q$a;", "", "<init>", "()V", "", "SHORTCUT_TITLE_ITEM_TOOLTIP_DELAY_MILLIS", "J", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ShortcutTitleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f314810l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f314810l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.j(R.attr.textH50, this.f314810l.getContext()));
        }
    }

    /* compiled from: ShortcutTitleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f314811l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f314811l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.j(R.attr.textM20, this.f314811l.getContext()));
        }
    }

    static {
        new a(null);
    }

    public q(@Y61.k View view) {
        super(view);
        this.f314801c = view.getContext();
        this.f314802d = (TextView) view.findViewById(R.id.user_adverts_shortcut_title_text);
        Checkbox checkbox = (Checkbox) view.findViewById(R.id.user_adverts_shortcut_checkbox);
        this.f314803e = checkbox;
        View viewFindViewById = view.findViewById(R.id.user_adverts_shortcut_checkbox_click_group);
        this.f314804f = viewFindViewById;
        b bVar = new b(view);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f314805g = C42727D.b(lazyThreadSafetyMode, bVar);
        this.f314806h = C42727D.b(lazyThreadSafetyMode, new c(view));
        checkbox.setOnStateChangedListener(new JV.b() { // from class: com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.m
            @Override // JV.b
            public final void b(State state) {
                Y41.l<? super State, G0> lVar = this.f314791b.f314807i;
                if (lVar != null) {
                    ((i) lVar).invoke(state);
                }
            }
        });
        viewFindViewById.setOnClickListener(new n(this, 0));
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void B80() {
        L80();
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void C80(@Y61.l Y41.l<? super State, G0> lVar) {
        this.f314807i = lVar;
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void D80() {
        Y41.l<? super State, G0> lVar = this.f314807i;
        this.f314807i = null;
        this.f314804f.setVisibility(0);
        this.f314803e.setState(new ToggleState(null, false, false, false, ToggleState.ToggleValue.f181170d, 15, null));
        this.f314807i = lVar;
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void E80() {
        Y41.l<? super State, G0> lVar = this.f314807i;
        this.f314807i = null;
        this.f314804f.setVisibility(0);
        this.f314803e.setState(new ToggleState(null, false, false, false, ToggleState.ToggleValue.f181169c, 15, null));
        this.f314807i = lVar;
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void F80() {
        this.f314804f.setVisibility(8);
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void G80() {
        Y41.l<? super State, G0> lVar = this.f314807i;
        this.f314807i = null;
        this.f314804f.setVisibility(0);
        this.f314803e.setState(new ToggleState(null, false, false, false, ToggleState.ToggleValue.f181168b, 15, null));
        this.f314807i = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void H80(@e0 int i12) {
        TextView textView = this.f314802d;
        textView.setText(i12);
        textView.setTextAppearance(((Number) this.f314806h.getValue()).intValue());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void I80(@Y61.k String str) {
        TextView textView = this.f314802d;
        textView.setText(str);
        textView.setTextAppearance(((Number) this.f314805g.getValue()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.o, java.lang.Runnable] */
    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    public final void J80(@e0 int i12, @e0 int i13, @Y61.l @e0 Integer num, @Y61.l final Y41.a aVar) {
        L80();
        Context context = this.f314801c;
        final String string = context.getString(i12);
        final String string2 = context.getString(i13);
        final String string3 = num != null ? context.getString(num.intValue()) : null;
        L80();
        ?? r82 = new Runnable() { // from class: com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.o
            @Override // java.lang.Runnable
            public final void run() {
                int i14 = q.f314800l;
                q qVar = this.f314794b;
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(qVar.itemView.getContext(), 0, 0, 6, null);
                kVar.f181224j = new r.d(new i.c(new b.a()));
                kVar.f181225k = true;
                com.avito.android.lib.design.tooltip.p.a(kVar, new r(string, string2, string3, qVar));
                final Y41.a aVar2 = aVar;
                kVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.p
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        int i15 = q.f314800l;
                        aVar2.invoke();
                    }
                });
                qVar.f314809k = kVar;
                kVar.f(qVar.f314803e);
            }
        };
        this.f314808j = r82;
        this.itemView.postDelayed(r82, 100L);
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l
    @Y61.k
    /* renamed from: K80, reason: from getter */
    public final Checkbox getF314803e() {
        return this.f314803e;
    }

    public final void L80() {
        o oVar = this.f314808j;
        if (oVar != null) {
            this.itemView.removeCallbacks(oVar);
        }
        com.avito.android.lib.design.tooltip.k kVar = this.f314809k;
        if (kVar != null) {
            kVar.setOnDismissListener(null);
        }
        com.avito.android.lib.design.tooltip.k kVar2 = this.f314809k;
        if (kVar2 != null) {
            kVar2.dismiss();
        }
        this.f314809k = null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f314807i = null;
        L80();
    }
}
