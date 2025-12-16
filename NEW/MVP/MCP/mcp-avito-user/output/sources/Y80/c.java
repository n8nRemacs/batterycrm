package Y80;

import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import lE.g;

/* compiled from: ItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY80/c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f19344a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f19345b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f19346c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f19347d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<G0> f19348e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f19349f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f19350g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f19351h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f19352i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final l<String, G0> f19353j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final p<String, DeepLink, G0> f19354k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final l<String, G0> f19355l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final l<String, G0> f19356m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Y41.a<G0> f19357n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f19358o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Y41.a<G0> f19359p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Y41.a<G0> f19360q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final g f19361r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final b f19362s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final b f19363t;

    /* compiled from: ItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PositionInfoButton.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInfoButton.Style style = PositionInfoButton.Style.f220427b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PositionInfoBanner.Style.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PositionInfoBanner.Style style2 = PositionInfoBanner.Style.f220420b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [Y80.b] */
    /* JADX WARN: Type inference failed for: r1v19, types: [Y80.b] */
    public c(@k Y41.a<G0> aVar, @k l<? super String, G0> lVar, @k l<? super String, G0> lVar2, @k l<? super String, G0> lVar3, @k Y41.a<G0> aVar2, @k l<? super DeepLink, G0> lVar4, @k l<? super DeepLink, G0> lVar5, @k l<? super DeepLink, G0> lVar6, @k l<? super DeepLink, G0> lVar7, @k l<? super String, G0> lVar8, @k p<? super String, ? super DeepLink, G0> pVar, @k l<? super String, G0> lVar9, @k l<? super String, G0> lVar10, @k Y41.a<G0> aVar3, @k l<? super DeepLink, G0> lVar11, @k Y41.a<G0> aVar4, @k Y41.a<G0> aVar5, @k g gVar) {
        this.f19344a = aVar;
        this.f19345b = lVar;
        this.f19346c = lVar2;
        this.f19347d = lVar3;
        this.f19348e = aVar2;
        this.f19349f = lVar4;
        this.f19350g = lVar5;
        this.f19351h = lVar6;
        this.f19352i = lVar7;
        this.f19353j = lVar8;
        this.f19354k = pVar;
        this.f19355l = lVar9;
        this.f19356m = lVar10;
        this.f19357n = aVar3;
        this.f19358o = lVar11;
        this.f19359p = aVar4;
        this.f19360q = aVar5;
        this.f19361r = gVar;
        final int i12 = 0;
        this.f19362s = new View.OnClickListener(this) { // from class: Y80.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f19343c;

            {
                this.f19343c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f19343c.f19344a.invoke();
                        break;
                    default:
                        this.f19343c.f19348e.invoke();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f19363t = new View.OnClickListener(this) { // from class: Y80.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f19343c;

            {
                this.f19343c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f19343c.f19344a.invoke();
                        break;
                    default:
                        this.f19343c.f19348e.invoke();
                        break;
                }
            }
        };
    }

    public static BannerItem a(PositionInfoBanner positionInfoBanner, boolean z12, l lVar, l lVar2) {
        BannerItem.Style style;
        BannerItem.Button.Style style2;
        String str = positionInfoBanner.f220414a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(positionInfoBanner.f220415b);
        PrintableText printableTextF2 = com.avito.android.printable_text.b.f(positionInfoBanner.f220416c);
        BannerItem.Button button = null;
        l lVar3 = positionInfoBanner.f220417d ? lVar : null;
        PositionInfoButton positionInfoButton = positionInfoBanner.f220418e;
        if (positionInfoButton != null) {
            PrintableText printableTextF3 = com.avito.android.printable_text.b.f(positionInfoButton.f220424a);
            int iOrdinal = positionInfoButton.f220426c.ordinal();
            if (iOrdinal == 0) {
                style2 = BannerItem.Button.Style.f220865b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                style2 = BannerItem.Button.Style.f220866c;
            }
            button = new BannerItem.Button(printableTextF3, style2, lVar2);
        }
        int iOrdinal2 = positionInfoBanner.f220419f.ordinal();
        if (iOrdinal2 == 0) {
            style = BannerItem.Style.f220870c;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            style = BannerItem.Style.f220869b;
        }
        return new BannerItem(str, printableTextF, printableTextF2, button, style, lVar3, z12);
    }

    public static com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder.a c(ApiError apiError, String str, View.OnClickListener onClickListener) {
        boolean z12 = apiError instanceof ApiError.UnknownError;
        PrintableText printableTextC = z12 ? com.avito.android.printable_text.b.c(R.string.position_in_search_stats_unknown_error_title, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.position_in_search_stats_error_title, new Serializable[0]);
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.position_in_search_stats_unknown_error_description, new Serializable[0]);
        if (!z12) {
            printableTextC2 = null;
        }
        return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder.a(str, new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), printableTextC, printableTextC2 == null ? com.avito.android.printable_text.b.f(z.k(apiError)) : printableTextC2, com.avito.android.printable_text.b.c(R.string.position_in_search_stats_error_refresh, new Serializable[0]), onClickListener));
    }

    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c b(X80.a aVar) {
        c.a c6673a;
        String str = aVar.f18653a;
        V80.d dVar = aVar.f18655c;
        String str2 = dVar != null ? dVar.f16945c : null;
        AttributedText attributedText = dVar != null ? dVar.f16944b : null;
        if (aVar.f18654b) {
            c6673a = c.a.b.f220925a;
        } else {
            c6673a = new c.a.C6673a(dVar != null ? dVar.f16943a : null, this.f19352i, this.f19351h, this.f19350g);
        }
        return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c(str, str2, attributedText, c6673a);
    }

    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a d(X80.f fVar) {
        a.InterfaceC6681a c6682a;
        String str = fVar.f18699a;
        PositionInfoPeriod.b bVar = fVar.f18701c;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(bVar.f220444d);
        if (fVar.f18700b) {
            c6682a = a.InterfaceC6681a.b.f221064a;
        } else {
            String str2 = bVar.f220445e;
            c6682a = new a.InterfaceC6681a.C6682a(bVar.f220441a, bVar.f220443c, str2 != null ? com.avito.android.printable_text.b.f(str2) : null);
        }
        return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a(str, printableTextF, bVar.f220442b, c6682a, this.f19349f);
    }
}
