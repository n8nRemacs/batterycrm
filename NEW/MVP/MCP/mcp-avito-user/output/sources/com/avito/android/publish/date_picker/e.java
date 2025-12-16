package com.avito.android.publish.date_picker;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: DatePickerSheetDialog.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/date_picker/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "c", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f232489K = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final c f232490E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final Long f232491F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final Long f232492G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final Long f232493H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final Y41.l<Long, G0> f232494I;

    /* renamed from: J, reason: collision with root package name */
    public h f232495J;

    /* compiled from: DatePickerSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            e eVar = (e) this.receiver;
            Long l12 = eVar.f232491F;
            eVar.f232495J = new h(view2, l12 != null ? l12.longValue() : new Date().getTime(), eVar.f232492G, eVar.f232493H);
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            e eVar = (e) this.receiver;
            int i12 = e.f232489K;
            eVar.getClass();
            Button button = (Button) view.findViewById(R.id.main_button);
            button.setText(eVar.f232490E.f232497b.k0(eVar.getContext()));
            button.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(eVar, 9));
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerSheetDialog.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/date_picker/e$c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f232496a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f232497b;

        public c(@k String str, @k PrintableText printableText) {
            this.f232496a = str;
            this.f232497b = printableText;
        }
    }

    public /* synthetic */ e(Context context, c cVar, Long l12, Long l13, Long l14, Y41.l lVar, boolean z12, int i12, C42822w c42822w) {
        this(context, cVar, l12, l13, l14, lVar, (i12 & 64) != 0 ? false : z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k Context context, @k c cVar, @l Long l12, @l Long l13, @l Long l14, @k Y41.l<? super Long, G0> lVar, boolean z12) {
        super(context, 0, 2, null);
        this.f232490E = cVar;
        this.f232491F = l12;
        this.f232492G = l13;
        this.f232493H = l14;
        this.f232494I = lVar;
        B(z12 ? R.layout.date_picker_dialog_re23 : R.layout.date_picker_dialog, R.layout.bottom_sheet_button, new a(1, this, e.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0), new b(1, this, e.class, "setupFooterView", "setupFooterView(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        if (z12) {
            com.avito.android.lib.design.bottom_sheet.d.M(this, cVar.f232496a, false, true, 2);
        } else {
            com.avito.android.lib.design.bottom_sheet.d.M(this, cVar.f232496a, true, false, 10);
        }
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
        this.f178532z = false;
    }
}
