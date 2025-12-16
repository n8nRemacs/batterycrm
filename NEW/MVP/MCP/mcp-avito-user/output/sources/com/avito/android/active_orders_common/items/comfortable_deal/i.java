package com.avito.android.active_orders_common.items.comfortable_deal;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ComfortableDealItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/i;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f68339i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f68340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f68341c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f68342d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f68343e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Avatar f68344f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f68345g;

    /* renamed from: h, reason: collision with root package name */
    public final Resources f68346h;

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "com/avito/android/image_loader/fresco/m", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Drawable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f68347l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40743a interfaceC40743a) {
            super(1);
            this.f68347l = interfaceC40743a;
        }

        @Override // Y41.l
        public final G0 invoke(Drawable drawable) {
            this.f68347l.setState(State.f135882f);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/image_loader/fresco/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f68348l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC40743a interfaceC40743a) {
            super(0);
            this.f68348l = interfaceC40743a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f68348l.setState(State.f135881e);
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.comfortable_deal_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f68340b = constraintLayout;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68341c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f68342d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68343e = (TextView) viewFindViewById4;
        this.f68344f = (Avatar) view.findViewById(R.id.avatar);
        this.f68345g = (TextView) view.findViewById(R.id.name);
        this.f68346h = constraintLayout.getContext().getResources();
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void KR(boolean z12) {
        ConstraintLayout constraintLayout = this.f68340b;
        RecyclerView.n nVar = (RecyclerView.n) constraintLayout.getLayoutParams();
        if (z12) {
            constraintLayout.setLayoutParams(new RecyclerView.n(-1, ((ViewGroup.MarginLayoutParams) nVar).height));
        } else {
            constraintLayout.setLayoutParams(new RecyclerView.n(((ViewGroup.MarginLayoutParams) nVar).width, ((ViewGroup.MarginLayoutParams) nVar).height));
        }
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void a(@Y61.l Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new Ae0.b(29, aVar));
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void g(@Y61.l AttributedText attributedText) {
        j.a(this.f68343e, attributedText, null);
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void qf(@Y61.l Image image) throws Resources.NotFoundException {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        C35949t5.c(this.f68342d, aVarB, this.f68346h.getDrawable(R.drawable.ic_placeholder_cd, null), ImageRequest.ScaleType.f169474e, null, 8);
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f68341c, str, false);
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.h
    public final void x70(@Y61.l Image image, @Y61.l String str) {
        TextView textView = this.f68345g;
        if (image != null) {
            D6.w(textView);
            Avatar avatar = this.f68344f;
            s.a(avatar, image, true, true, new a(avatar), new b(avatar));
            return;
        }
        boolean z12 = str == null || str.length() == 0;
        Avatar avatar2 = this.f68344f;
        if (z12) {
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            avatar2.setImage(this.f68346h.getDrawable(R.drawable.ic_comfortable_deal, null));
        } else {
            avatar2.setImage(null);
            I5.a(textView, String.valueOf(str != null ? Character.valueOf(C43066x.D(str)) : null), false);
        }
    }
}
