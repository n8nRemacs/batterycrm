package com.avito.android.component.snackbar;

import Qw0.C14943c;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.component.snackbar.e;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.util.C35835l0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OldAvitoSnackbar.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/snackbar/d;", "", "a", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f125235c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Snackbar f125236a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f125237b;

    /* compiled from: OldAvitoSnackbar.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/component/snackbar/d$a;", "", "<init>", "()V", "", "DEFAULT_SNACKBAR_ACTION_TEXT_COLOR", "I", "DEFAULT_SNACKBAR_BACKGROUND_COLOR", "DEFAULT_SNACKBAR_MAX_LINES", "DEFAULT_SNACKBAR_TEXT_COLOR", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static d a(a aVar, View view, int i12, int i13, e.b bVar, int i14, int i15) {
            e eVar = (i15 & 8) != 0 ? e.a.f125238a : bVar;
            com.avito.android.component.snackbar.a aVar2 = com.avito.android.component.snackbar.a.f125232l;
            int i16 = (i15 & 256) != 0 ? 0 : i14;
            int iD2 = C35835l0.d(R.attr.snackbarTextColor, view.getContext());
            aVar.getClass();
            return b(aVar, view, view.getContext().getString(i12), i13, eVar, null, 2, null, aVar2, i16, iD2, 1024);
        }

        public static d b(a aVar, View view, CharSequence charSequence, int i12, e eVar, String str, int i13, Y41.a aVar2, Y41.a aVar3, int i14, int i15, int i16) {
            if ((i16 & 8) != 0) {
                eVar = e.a.f125238a;
            }
            if ((i16 & 16) != 0) {
                str = null;
            }
            if ((i16 & 32) != 0) {
                i13 = 2;
            }
            if ((i16 & 64) != 0) {
                aVar2 = null;
            }
            if ((i16 & 128) != 0) {
                aVar3 = b.f125233l;
            }
            if ((i16 & 256) != 0) {
                i14 = 0;
            }
            if ((i16 & 512) != 0) {
                i15 = 0;
            }
            aVar.getClass();
            Snackbar snackbarJ = Snackbar.j(view, charSequence, i12);
            TabBarLayout.a aVar4 = TabBarLayout.f180679h;
            Context context = snackbarJ.f357284h;
            aVar4.getClass();
            TabBarLayout tabBarLayoutA = TabBarLayout.a.a(context);
            if (tabBarLayoutA != null) {
                snackbarJ.f(tabBarLayoutA);
            }
            BaseTransientBottomBar.j jVar = snackbarJ.f357285i;
            if (aVar2 != null) {
                if (str == null) {
                    str = "";
                }
                snackbarJ.k(str, new m(27, aVar2));
                ((SnackbarContentLayout) jVar.getChildAt(0)).getActionView().setTextColor(C35835l0.d(R.attr.snackbarActionTextColor, view.getContext()));
            }
            c cVar = new c(aVar3);
            if (snackbarJ.f357297u == null) {
                snackbarJ.f357297u = new ArrayList();
            }
            snackbarJ.f357297u.add(cVar);
            TextView textView = (TextView) jVar.findViewById(com.google.android.material.R.id.snackbar_text);
            textView.setMaxLines(i13);
            Integer numValueOf = Integer.valueOf(i15);
            if (i15 == 0) {
                numValueOf = null;
            }
            textView.setTextColor(numValueOf != null ? numValueOf.intValue() : C35835l0.d(R.attr.snackbarTextColor, view.getContext()));
            Integer numValueOf2 = Integer.valueOf(i14);
            if (i14 == 0) {
                numValueOf2 = null;
            }
            jVar.setBackgroundColor(numValueOf2 != null ? numValueOf2.intValue() : C35835l0.d(R.attr.snackbarBackgroundColor, view.getContext()));
            return new d(snackbarJ, eVar, null);
        }

        public a() {
        }
    }

    public d(Snackbar snackbar, e eVar, C42822w c42822w) {
        this.f125236a = snackbar;
        this.f125237b = eVar;
    }

    public final void a() {
        this.f125236a.b(3);
    }

    public final void b() {
        this.f125236a.l();
        G0 g02 = G0.f406611a;
        C14943c.f14036a.getClass();
        com.avito.android.component.toast.g gVar = com.avito.android.component.toast.g.f125258a;
        String string = h.a(this).getText().toString();
        gVar.getClass();
        com.avito.android.component.toast.g.a(string, this.f125237b);
    }
}
