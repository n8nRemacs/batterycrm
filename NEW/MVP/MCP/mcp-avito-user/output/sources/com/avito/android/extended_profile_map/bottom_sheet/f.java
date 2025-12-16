package com.avito.android.extended_profile_map.bottom_sheet;

import Fc1.D3;
import Y41.l;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_map.bottom_sheet.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import os0.f;

/* compiled from: ExtendedProfileAddressBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/bottom_sheet/f;", "", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f151188a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f151189b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f151190c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f151191d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public TextView f151192e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextView f151193f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f151194g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ImageView f151195h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Button f151196i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public LinearLayout f151197j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public LinearLayout f151198k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public os0.i f151199l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f151200m;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k Context context, @Y61.k Y41.a<G0> aVar, @Y61.k l<? super DeepLink, G0> lVar, @Y61.k Y41.a<G0> aVar2) {
        this.f151188a = context;
        this.f151189b = aVar;
        this.f151190c = lVar;
        this.f151191d = aVar2;
    }

    public static final void a(f fVar) {
        LinearLayout linearLayout = fVar.f151198k;
        boolean zY2 = linearLayout != null ? D6.y(linearLayout) : false;
        ImageView imageView = fVar.f151195h;
        if (imageView != null) {
            if (zY2) {
                ObjectAnimator.ofFloat(imageView, "rotation", 180.0f, 0.0f).start();
            } else {
                ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f).start();
                fVar.f151191d.invoke();
            }
        }
        D6.G(fVar.f151198k, !zY2);
    }

    public final void b() {
        this.f151192e = null;
        this.f151194g = null;
        this.f151195h = null;
        this.f151196i = null;
        this.f151197j = null;
        this.f151198k = null;
        this.f151199l = null;
        this.f151200m = null;
    }

    public final void c(@Y61.k g gVar) {
        String after;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f151200m;
        Context context = this.f151188a;
        if (dVar == null || !dVar.isShowing()) {
            com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
            dVar2.B(R.layout.extended_profile_address_bottom_sheet, R.layout.extended_profile_address_bottom_sheet_footer, new c(this), new d(this), false);
            dVar2.setCancelable(true);
            dVar2.setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 2);
            final int i12 = 0;
            dVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.avito.android.extended_profile_map.bottom_sheet.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f151182c;

                {
                    this.f151182c = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            this.f151182c.f151189b.invoke();
                            break;
                        default:
                            f fVar = this.f151182c;
                            fVar.f151189b.invoke();
                            fVar.b();
                            break;
                    }
                }
            });
            com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
            final int i13 = 1;
            dVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.avito.android.extended_profile_map.bottom_sheet.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f151182c;

                {
                    this.f151182c = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            this.f151182c.f151189b.invoke();
                            break;
                        default:
                            f fVar = this.f151182c;
                            fVar.f151189b.invoke();
                            fVar.b();
                            break;
                    }
                }
            });
            dVar2.R(new e(this));
            dVar2.setOnCancelListener(new D3(this, 6));
            this.f151200m = dVar2;
        }
        TextView textView = this.f151192e;
        if (textView != null) {
            I5.a(textView, gVar.f151201a, false);
        }
        TextView textView2 = this.f151193f;
        if (textView2 != null) {
            I5.a(textView2, gVar.f151202b, false);
        }
        List<GeoReference> list = gVar.f151203c;
        if (list != null) {
            LinearLayout linearLayout = this.f151197j;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            os0.i iVar = this.f151199l;
            if (iVar != null) {
                for (GeoReference geoReference : list) {
                    LinearLayout linearLayout2 = iVar.f422321a;
                    ViewGroup viewGroup = (ViewGroup) iVar.f422322b.inflate(R.layout.advert_details_geo_reference, (ViewGroup) linearLayout2, false);
                    os0.g gVar2 = new os0.g(viewGroup, false, 2, null);
                    List<String> colors = geoReference.getColors();
                    if (colors == null) {
                        colors = C42784z0.f406748b;
                    }
                    String content = geoReference.getContent();
                    AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                    if (afterWithIcon == null || (after = afterWithIcon.getText()) == null) {
                        after = geoReference.getAfter();
                    }
                    AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                    f.a.a(gVar2, colors, content, after, afterWithIcon2 != null ? afterWithIcon2.getIconName() : null, 16);
                    linearLayout2.addView(viewGroup);
                }
            }
        }
        ImageView imageView = this.f151195h;
        g.b bVar = gVar.f151204d;
        D6.G(imageView, bVar != null);
        D6.G(this.f151194g, bVar != null);
        if (bVar != null) {
            int iD2 = C35835l0.d(bVar.f151212a ? R.attr.black : R.attr.red, context);
            TextView textView3 = this.f151194g;
            if (textView3 != null) {
                I5.a(textView3, bVar.f151213b, false);
                textView3.setTextColor(iD2);
            }
            ImageView imageView2 = this.f151195h;
            if (imageView2 != null) {
                imageView2.setColorFilter(iD2);
            }
        }
        D6.w(this.f151198k);
        ImageView imageView3 = this.f151195h;
        if (imageView3 != null) {
            imageView3.setRotation(0.0f);
        }
        LinearLayout linearLayout3 = this.f151198k;
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
        }
        com.avito.android.lib.design.bottom_sheet.d dVar3 = this.f151200m;
        LayoutInflater layoutInflater = dVar3 != null ? dVar3.getLayoutInflater() : null;
        List<g.a> list2 = gVar.f151205e;
        if (list2 != null) {
            for (g.a aVar : list2) {
                View viewInflate = layoutInflater != null ? layoutInflater.inflate(R.layout.extended_profile_address_schedule, (ViewGroup) this.f151198k, false) : null;
                if (viewInflate != null) {
                    View viewFindViewById = viewInflate.findViewById(R.id.extended_address_schedule_day);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    I5.a((TextView) viewFindViewById, aVar.f151209a, false);
                }
                if (viewInflate != null) {
                    View viewFindViewById2 = viewInflate.findViewById(R.id.extended_address_schedule_detail);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView4 = (TextView) viewFindViewById2;
                    I5.a(textView4, C42745f0.O(aVar.f151210b, "\n", null, null, null, 62), false);
                    textView4.setTextColor(C35835l0.d(aVar.f151211c ? R.attr.black : R.attr.gray54, textView4.getContext()));
                }
                LinearLayout linearLayout4 = this.f151198k;
                if (linearLayout4 != null) {
                    linearLayout4.addView(viewInflate);
                }
            }
        }
        Button button = this.f151196i;
        if (button != null) {
            DeeplinkAction deeplinkAction = gVar.f151207g;
            com.avito.android.lib.design.button.b.a(button, deeplinkAction.getTitle(), false);
            D6.G(button, gVar.f151206f);
            boolean z12 = gVar.f151208h;
            button.setLoading(z12);
            button.setEnabled(!z12);
            DeepLink deepLink = deeplinkAction.getDeepLink();
            if (deepLink != null) {
                button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(28, this, deepLink));
            }
        }
        com.avito.android.lib.design.bottom_sheet.d dVar4 = this.f151200m;
        if (dVar4 != null) {
            com.avito.android.lib.util.g.a(dVar4);
        }
    }
}
