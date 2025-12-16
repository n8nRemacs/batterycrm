package com.avito.android.photo_list_view.blueprints;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.I;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStatePhotoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view/blueprints/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_list_view/blueprints/l;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33210d.a f218145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f218146c;

    /* renamed from: d, reason: collision with root package name */
    public final int f218147d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f218148e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f218149f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Switcher f218150g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f218151h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f218152i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f218153j;

    /* compiled from: MultiStatePhotoItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<ParanjaState.ClickPosition, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f218154l;

        /* compiled from: MultiStatePhotoItemView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.blueprints.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6543a {
            static {
                int[] iArr = new int[ParanjaState.ClickPosition.values().length];
                try {
                    iArr[4] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition = ParanjaState.ClickPosition.f210848b;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition2 = ParanjaState.ClickPosition.f210848b;
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition3 = ParanjaState.ClickPosition.f210848b;
                    iArr[1] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition4 = ParanjaState.ClickPosition.f210848b;
                    iArr[2] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f218154l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(ParanjaState.ClickPosition clickPosition) {
            int iOrdinal = clickPosition.ordinal();
            if (iOrdinal == 0 || iOrdinal == 3 || iOrdinal == 4) {
                this.f218154l.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MultiStatePhotoItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.paranja.h f218155l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.paranja.h hVar) {
            super(0);
            this.f218155l = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f218155l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
            return G0.f406611a;
        }
    }

    public m(@Y61.k View view, @Y61.k C33210d.a aVar) {
        super(view);
        this.f218145b = aVar;
        this.f218146c = view.getResources().getDimensionPixelSize(R.dimen.photo_with_title_padding_top);
        this.f218147d = view.getResources().getDimensionPixelSize(R.dimen.photo_without_title_padding_top);
        View viewFindViewById = view.findViewById(R.id.enhancement_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f218148e = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.enhancement_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f218149f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.switcher);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f218150g = (Switcher) viewFindViewById3;
        this.f218151h = (ComponentContainer) view.findViewById(R.id.photo_param_container);
        View viewFindViewById4 = view.findViewById(R.id.image_list_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f218152i = recyclerView;
        recyclerView.l(new I(view.getContext(), 0, 0, 6, null), -1);
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void B2(@Y61.k s sVar) {
        sVar.A(new z(this.f218152i, sVar, this.f218145b));
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f218151h, charSequence, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void RU(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2) throws Resources.NotFoundException {
        float dimension = this.itemView.getResources().getDimension(R.dimen.onboarding_hole_radius);
        int i12 = -kotlin.math.b.b(this.itemView.getResources().getDimension(R.dimen.onboarding_horizontal_padding));
        com.avito.android.paranja.h hVar = new com.avito.android.paranja.h(this.f218148e);
        b bVar = new b(hVar);
        hVar.setStyle(new com.avito.android.paranja.f(new f.a(i12, i12, 0, 0, 12, null), hVar.getContext().getColor(R.color.overlayBackground), dimension, null, 8, null));
        hVar.setState(new ParanjaState(ParanjaState.State.f210855b, new a(bVar), new com.avito.android.paranja.g(new r.a(null, 1, 0 == true ? 1 : 0), false, null, str, str2, null, null, null, false, 230, null)));
        aVar.invoke();
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void T(@Y61.l CharSequence charSequence) {
        this.f218151h.setSubtitle(charSequence);
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f218153j = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f218153j;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void kX(@Y61.k String str, boolean z12) {
        D6.G(this.f218148e, z12);
        this.f218149f.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void n8(@Y61.k PrintableText printableText) {
        ComponentContainer componentContainer = this.f218151h;
        Object parent = componentContainer.getParent();
        ComponentContainer componentContainer2 = parent instanceof View ? (View) parent : null;
        ComponentContainer componentContainer3 = componentContainer2 == null ? componentContainer : componentContainer2;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, componentContainer3, printableText, null, null, null, f.c.a.b(), 1500, ToastBarPosition.f181046d, null, false, false, null, null, 3726);
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void setTitle(@Y61.l CharSequence charSequence) {
        ComponentContainer componentContainer = this.f218151h;
        componentContainer.setTitle(charSequence);
        componentContainer.setPadding(componentContainer.getPaddingLeft(), (charSequence == null || charSequence.length() == 0) ? this.f218147d : this.f218146c, componentContainer.getPaddingRight(), componentContainer.getPaddingBottom());
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void u(@Y61.l CharSequence charSequence) {
        this.f218151h.q(charSequence);
    }

    @Override // com.avito.android.photo_list_view.blueprints.l
    public final void vX(@Y61.k Y41.l lVar, boolean z12) throws Resources.NotFoundException {
        this.f218150g.setState(new EV.c(lVar, true, z12, false, true));
        this.f218148e.setOnClickListener(new com.avito.android.order.feature.c(this, 19));
    }
}
