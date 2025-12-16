package com.avito.android.soa_stat.profile_settings.view;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.soa_stat.profile_settings.view.a;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SoaStatSettingsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/d;", "Lcom/avito/android/soa_stat/profile_settings/view/a;", "a", "b", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.soa_stat.profile_settings.view.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f284239a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f284240b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f284241c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f284242d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f284243e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f284244f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ListItemSwitcher f284245g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f284246h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l f284247i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f284248j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e2 f284249k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Y41.l<a.InterfaceC8489a, G0> f284250l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public a.c f284251m;

    /* compiled from: SoaStatSettingsView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/d$a;", "", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        d a(@k View view, @k C22977J c22977j);
    }

    /* compiled from: SoaStatSettingsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/soa_stat/profile_settings/view/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<a.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.c f284254l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f284255m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.c cVar, d dVar) {
            super(1);
            this.f284254l = cVar;
            this.f284255m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            a.c cVar2 = this.f284254l;
            boolean z12 = cVar2 instanceof a.c.C8492a;
            d dVar = this.f284255m;
            if (z12) {
                a.c.C8492a c8492a = (a.c.C8492a) cVar2;
                a.c cVar3 = dVar.f284251m;
                a.c.C8492a c8492a2 = cVar3 instanceof a.c.C8492a ? (a.c.C8492a) cVar3 : null;
                if (!L.f(c8492a2 != null ? c8492a2.f284231d : null, c8492a.f284231d)) {
                    com.avito.android.advert.item.delivery_suggests.l.w(c8492a.f284231d, C35949t5.a(dVar.f284242d));
                }
                PrintableText printableText = c8492a2 != null ? c8492a2.f284229b : null;
                PrintableText printableText2 = c8492a.f284229b;
                boolean zF2 = L.f(printableText, printableText2);
                Context context = dVar.f284241c;
                ListItemSwitcher listItemSwitcher = dVar.f284245g;
                if (!zF2) {
                    String strK0 = printableText2.k0(context);
                    dVar.f284243e.setText(strK0);
                    listItemSwitcher.setTitle(strK0);
                }
                AttributedText attributedText = c8492a2 != null ? c8492a2.f284230c : null;
                AttributedText attributedText2 = c8492a.f284230c;
                if (!L.f(attributedText, attributedText2)) {
                    dVar.f284244f.setText(dVar.f284240b.c(context, attributedText2));
                }
                boolean z13 = c8492a.f284232e;
                if (c8492a2 == null || c8492a2.f284232e != z13) {
                    b bVar = dVar.f284248j;
                    bVar.f284252a = false;
                    listItemSwitcher.setChecked(z13);
                    bVar.f284252a = true;
                }
                boolean z14 = c8492a.f284233f;
                if (c8492a2 == null || c8492a2.f284233f != z14) {
                    listItemSwitcher.setEnabled(z14);
                }
                if (c8492a2 == null) {
                    dVar.f284247i.j();
                }
            } else if (cVar2 instanceof a.c.b) {
                if (!(dVar.f284251m instanceof a.c.b)) {
                    dVar.f284247i.a("");
                }
            } else if ((cVar2 instanceof a.c.C8493c) && !(dVar.f284251m instanceof a.c.C8493c)) {
                dVar.f284247i.k(null);
            }
            return G0.f406611a;
        }
    }

    @i31.c
    public d(@k InterfaceC28373a interfaceC28373a, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.util.text.a aVar, @InterfaceC41220a @k View view, @InterfaceC41220a @k C22977J c22977j) {
        this.f284239a = screenPerformanceTracker;
        this.f284240b = aVar;
        this.f284241c = view.getContext();
        this.f284242d = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f284243e = (TextView) view.findViewById(R.id.title);
        this.f284244f = (TextView) view.findViewById(R.id.text);
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view.findViewById(R.id.switcher);
        this.f284245g = listItemSwitcher;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.content_holder);
        this.f284246h = viewGroup;
        l lVar = new l(viewGroup, R.id.content, interfaceC28373a, 0, 0, 24, null);
        this.f284247i = lVar;
        b bVar = new b(new g(this), true);
        this.f284248j = bVar;
        this.f284249k = f2.b(0, 1, null, 5);
        this.f284250l = new f(c22977j, this);
        listItemSwitcher.e(bVar);
        lVar.f231600j = new com.avito.android.soa_stat.profile_settings.view.c(this);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.soa_stat.profile_settings.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((f) this.f284237b.f284250l).invoke(a.InterfaceC8489a.C8490a.f284224a);
            }
        });
        toolbar.setTitle("");
    }

    @Override // com.avito.android.soa_stat.profile_settings.view.a
    public final void a(@k a.b bVar) {
        if (bVar instanceof a.b.C8491a) {
            a.b.C8491a c8491a = (a.b.C8491a) bVar;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            ApiError apiError = c8491a.f284227a;
            Throwable th2 = c8491a.f284228b;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(apiError != null ? z.k(apiError) : z.l(th2));
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, this.f284246h, printableTextF, null, null, null, f.c.a.a(apiError, th2), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
    }

    @Override // com.avito.android.soa_stat.profile_settings.view.a
    public final void b(@k a.c cVar) {
        com.avito.android.analytics.screens.mvi.a.i(cVar, this.f284239a, new c(cVar, this));
        this.f284251m = cVar;
    }

    @Override // com.avito.android.soa_stat.profile_settings.view.a
    @k
    public final InterfaceC43160i<a.InterfaceC8489a> getActions() {
        return C43175k.a(this.f284249k);
    }

    /* compiled from: SoaStatSettingsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/d$b;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ListItemCompoundButton.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f284252a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.l<a.InterfaceC8489a, G0> f284253b;

        public b(@k Y41.l lVar, boolean z12) {
            this.f284252a = z12;
            this.f284253b = lVar;
        }

        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            if (this.f284252a) {
                this.f284253b.invoke(new a.InterfaceC8489a.c(z12));
            }
        }

        public /* synthetic */ b(boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
            this(lVar, (i12 & 1) != 0 ? true : z12);
        }
    }
}
