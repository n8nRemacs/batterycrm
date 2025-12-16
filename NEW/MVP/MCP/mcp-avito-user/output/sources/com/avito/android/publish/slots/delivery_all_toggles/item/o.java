package com.avito.android.publish.slots.delivery_all_toggles.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAllTogglesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/k;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f243506u;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f243508c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f243509d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f243510e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f243511f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f243512g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f243513h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f243514i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f243515j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f243516k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Space f243517l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f243518m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f243519n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f243520o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public String f243521p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f243522q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f243523r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super String, ? super Boolean, G0> f243524s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, Boolean> f243525t;

    /* compiled from: DeliveryAllTogglesItemView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/o$a;", "", "<init>", "()V", "", "", "toggles", "Ljava/util/Set;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f243506u = C42756l.l0(new String[]{"deliveryCourier", "deliveryPvz", "deliveryPostamat", "deliveryDbs", "deliveryDbsCourier"});
    }

    public o(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view);
        this.f243507b = viewGroup;
        this.f243508c = view;
        View viewFindViewById = view.findViewById(R.id.all_toggles_one_button_specific_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f243509d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.all_toggles_banner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f243510e = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.all_toggles_features_label);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243511f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.all_toggles_legal_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243512g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.all_toggles_features_rv);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f243513h = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.all_toggles_enable_delivery_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243514i = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.all_toggles_skip_delivery_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243515j = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.all_toggles_settings_delivery_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243516k = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.all_toggles_spacer);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Space");
        }
        this.f243517l = (Space) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.all_toggles_description_label);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243518m = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.all_toggles_description_text);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243519n = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.all_toggles_more_link_text);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243520o = (TextView) viewFindViewById12;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new q(this));
            return;
        }
        view.post(new m(this));
        viewGroup.post(new n(this));
        B80(this);
    }

    public static final void B80(final o oVar) {
        Button button;
        String next;
        Y41.l<? super String, Boolean> lVar;
        oVar.getClass();
        Iterator<String> it = f243506u.iterator();
        do {
            boolean zHasNext = it.hasNext();
            button = oVar.f243514i;
            if (!zHasNext) {
                String str = oVar.f243522q;
                if (str != null) {
                    button.setText(str);
                }
                final int i12 = 1;
                button.setOnClickListener(new View.OnClickListener(oVar) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o f243503c;

                    {
                        this.f243503c = oVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        o oVar2 = this.f243503c;
                        switch (i12) {
                            case 0:
                                Y41.a<G0> aVar = oVar2.f243523r;
                                if (aVar != null) {
                                    aVar.invoke();
                                    break;
                                }
                                break;
                            default:
                                Set<String> set = o.f243506u;
                                Iterator it2 = oVar2.C80().iterator();
                                while (it2.hasNext()) {
                                    String str2 = (String) it2.next();
                                    Y41.p<? super String, ? super Boolean, G0> pVar = oVar2.f243524s;
                                    if (pVar != null) {
                                        pVar.invoke(str2, Boolean.TRUE);
                                    }
                                }
                                Y41.a<G0> aVar2 = oVar2.f243523r;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            next = it.next();
            lVar = oVar.f243525t;
        } while (!(lVar != null ? L.f(lVar.invoke(next), Boolean.TRUE) : false));
        String str2 = oVar.f243521p;
        if (str2 != null) {
            button.setText(str2);
        }
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(oVar) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f243503c;

            {
                this.f243503c = oVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o oVar2 = this.f243503c;
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = oVar2.f243523r;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Set<String> set = o.f243506u;
                        Iterator it2 = oVar2.C80().iterator();
                        while (it2.hasNext()) {
                            String str22 = (String) it2.next();
                            Y41.p<? super String, ? super Boolean, G0> pVar = oVar2.f243524s;
                            if (pVar != null) {
                                pVar.invoke(str22, Boolean.TRUE);
                            }
                        }
                        Y41.a<G0> aVar2 = oVar2.f243523r;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void D80(SimpleDraweeView simpleDraweeView, UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
    }

    public final ArrayList C80() {
        ArrayList arrayList = new ArrayList();
        Y41.l<? super String, Boolean> lVar = this.f243525t;
        if (lVar != null && lVar.invoke("deliveryCourier") != null) {
            arrayList.add("deliveryCourier");
        }
        Y41.l<? super String, Boolean> lVar2 = this.f243525t;
        if (lVar2 != null && lVar2.invoke("deliveryPvz") != null) {
            arrayList.add("deliveryPvz");
        }
        Y41.l<? super String, Boolean> lVar3 = this.f243525t;
        if (lVar3 != null && lVar3.invoke("deliveryPostamat") != null) {
            arrayList.add("deliveryPostamat");
        }
        return arrayList;
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void GA(boolean z12) {
        TextView textView = this.f243512g;
        if (z12) {
            textView.setText(R.string.delivery_all_toggles_legal_label);
        }
        textView.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void KL(@Y61.l List<s> list) {
        if (list != null) {
            this.f243513h.setAdapter(new d(list));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void MQ(@Y61.l UniversalImage universalImage, boolean z12) {
        int i12 = z12 ? 0 : 8;
        SimpleDraweeView simpleDraweeView = this.f243509d;
        simpleDraweeView.setVisibility(i12);
        int i13 = z12 ? 8 : 0;
        SimpleDraweeView simpleDraweeView2 = this.f243510e;
        simpleDraweeView2.setVisibility(i13);
        if (z12) {
            D80(simpleDraweeView, universalImage);
        } else {
            D80(simpleDraweeView2, universalImage);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void SX(boolean z12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k Y41.l<? super String, G0> lVar) {
        int i12 = !z12 ? 0 : 8;
        TextView textView = this.f243518m;
        textView.setVisibility(i12);
        int i13 = !z12 ? 0 : 8;
        TextView textView2 = this.f243519n;
        textView2.setVisibility(i13);
        int i14 = z12 ? 8 : 0;
        TextView textView3 = this.f243520o;
        textView3.setVisibility(i14);
        if (z12) {
            return;
        }
        textView.setText(str);
        textView2.setText(str2);
        textView3.setText(str3);
        textView3.setOnClickListener(new Tf.b(str4, lVar));
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void bW(@Y61.l com.avito.android.publish.slots.delivery_all_toggles.item.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.p pVar, @Y61.k Y41.l lVar) {
        this.f243524s = pVar;
        this.f243523r = aVar2;
        this.f243525t = lVar;
        this.f243515j.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(1, this, aVar2));
        com.avito.android.advert_core.advert.f fVar = new com.avito.android.advert_core.advert.f(this, aVar, pVar, aVar2, 10);
        Button button = this.f243516k;
        button.setOnClickListener(fVar);
        button.setImageDrawable(C35835l0.h(R.attr.ic_settings24, this.f243508c.getContext()));
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void fJ(@Y61.l String str, @Y61.l String str2) {
        if (str != null) {
            this.f243514i.setText(str);
        }
        if (str2 != null) {
            this.f243515j.setText(str2);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void uE(@Y61.l String str, boolean z12) {
        TextView textView = this.f243511f;
        if (z12) {
            textView.setText(str);
        } else {
            D6.c(this.f243513h, null, 0, null, null, 13);
        }
        textView.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.k
    public final void wU(@Y61.l String str, @Y61.l String str2) {
        this.f243522q = str2;
        this.f243521p = str;
    }
}
