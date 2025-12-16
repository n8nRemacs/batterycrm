package com.avito.android.advert.item.domoteka.conveyor;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.teaser.ReportTeaserInsightListViewImpl;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.remote.model.teaser.TeaserStatus;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDomotekaTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/domoteka/conveyor/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/domoteka/conveyor/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f75273j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f75274b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f75275c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f75276d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f75277e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ReportTeaserInsightListViewImpl f75278f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f75279g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f75280h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public e f75281i;

    /* compiled from: AdvertDetailsDomotekaTeaserView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75282a;

        static {
            int[] iArr = new int[TeaserStatus.values().length];
            try {
                iArr[TeaserStatus.f253941Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeaserStatus.Caution.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TeaserStatus.Locked.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75282a = iArr;
            int[] iArr2 = new int[q.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                q[] qVarArr = q.f75283b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public n(@Y61.k View view) {
        super(view);
        this.f75274b = view;
        View viewFindViewById = view.findViewById(R.id.result_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f75275c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75276d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.sub_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75277e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.insight_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.teaser.ReportTeaserInsightListViewImpl");
        }
        this.f75278f = (ReportTeaserInsightListViewImpl) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f75279g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.error_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f75280h = viewFindViewById6;
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void DW(@Y61.k String str) {
        I5.a(this.f75277e, str, false);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void K40() {
        View view = this.f75274b;
        View viewInflate = View.inflate(view.getContext(), R.layout.domoteka_request_flat_number_bottom_sheet, null);
        Button button = (Button) viewInflate.findViewById(R.id.button_send);
        final com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view.getContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.domoteka.conveyor.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = n.f75273j;
                dVar.dismiss();
                e eVar = this.f75281i;
                if (eVar != null) {
                    j jVar = eVar.f75251a;
                    jVar.f75260c.U0();
                    jVar.f75265h = (AtomicReference) jVar.f75259b.a(eVar.f75252b.f75244f).j0(jVar.f75262e.e()).v0(new h(jVar), i.f75258b, io.reactivex.rxjava3.internal.functions.a.f401993c);
                }
            }
        });
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void R1(@Y61.k String str) {
        this.f75276d.setText(str);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void R70(@Y61.k String str, @Y61.l String str2) {
        Button button = this.f75279g;
        button.setText(str);
        button.setSubtitle("");
        D6.H(button);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void Tm() {
        D6.w(this.f75279g);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void jL() {
        q[] qVarArr = q.f75283b;
        D6.H(this.f75275c);
        D6.w(this.f75280h);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void oJ(@Y61.l e eVar) {
        this.f75281i = eVar;
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.l
    public final void sn(@Y61.k List<? extends TeaserInsightGeneral> list) {
        this.f75278f.b(list, R.layout.advert_details_domoteka_teaser_insight, new o(1, this, n.class, "getInsightIconDrawable", "getInsightIconDrawable(Lcom/avito/android/remote/model/teaser/TeaserInsightGeneral;)Landroid/graphics/drawable/Drawable;", 0));
    }
}
