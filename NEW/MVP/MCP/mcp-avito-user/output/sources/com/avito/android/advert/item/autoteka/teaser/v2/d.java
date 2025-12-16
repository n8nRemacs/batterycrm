package com.avito.android.advert.item.autoteka.teaser.v2;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.teaser.TeaserError;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/v2/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/autoteka/teaser/v2/a;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements com.avito.android.advert.item.autoteka.teaser.v2.a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f73080r = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f73081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f73082c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f73083d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f73084e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f73085f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f73086g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f73087h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f73088i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f73089j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final LinearLayout f73090k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final TextView f73091l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final LinearLayout f73092m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final DockingBadge f73093n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final View f73094o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f73095p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final TextView f73096q;

    /* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/v2/d$a;", "", "<init>", "()V", "", "MAX_VISIBLE_INSIGHTS", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/v2/d$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f73097b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f73098c;

        static {
            b[] bVarArr = {new b("Result", 0), new b("Error", 1)};
            f73097b = bVarArr;
            f73098c = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f73097b.clone();
        }
    }

    /* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[] bVarArr = b.f73097b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.autoteka.teaser.v2.d$d, reason: collision with other inner class name */
    public static final class C2197d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f73099l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2197d(Y41.a<G0> aVar) {
            super(0);
            this.f73099l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f73099l.invoke();
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public d(@k View view) {
        super(view);
        this.f73081b = view;
        View viewFindViewById = view.findViewById(R.id.autoteka_teaser_v2_result);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73082c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73083d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73084e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.insight_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f73085f = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.more_link);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73086g = viewFindViewById5;
        View viewFindViewById6 = viewFindViewById5.findViewById(R.id.text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73087h = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f73088i = (Button) viewFindViewById7;
        View viewFindViewById8 = viewFindViewById.findViewById(R.id.standalone_link);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73089j = (TextView) viewFindViewById8;
        this.f73090k = (LinearLayout) viewFindViewById.findViewById(R.id.buttonContainer);
        this.f73091l = (TextView) viewFindViewById.findViewById(R.id.discountTitle);
        this.f73092m = (LinearLayout) viewFindViewById.findViewById(R.id.discountContainer);
        this.f73093n = (DockingBadge) viewFindViewById.findViewById(R.id.discountAmount);
        View viewFindViewById9 = view.findViewById(R.id.error_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73094o = viewFindViewById9;
        View viewFindViewById10 = viewFindViewById9.findViewById(R.id.title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73095p = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewFindViewById9.findViewById(R.id.description);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73096q = (TextView) viewFindViewById11;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    @Override // com.avito.android.advert.item.autoteka.teaser.v2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t10(@Y61.l java.lang.String r17, @Y61.k final com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult r18, @Y61.k final Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r19, @Y61.k final Y41.l<? super android.net.Uri, kotlin.G0> r20, @Y61.k Y41.a<kotlin.G0> r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.autoteka.teaser.v2.d.t10(java.lang.String, com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult, Y41.l, Y41.l, Y41.a):void");
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.v2.a
    public final void w9(@k TeaserError teaserError) {
        this.f73095p.setText(teaserError.getTitle());
        this.f73096q.setText(teaserError.getDescription());
        b[] bVarArr = b.f73097b;
        D6.w(this.f73082c);
        D6.H(this.f73094o);
    }
}
