package com.avito.android.profile_vk_linking.group_management.adapter.group;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/adapter/group/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_vk_linking/group_management/adapter/group/h;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f231110h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f231111b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RadioButton f231112c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f231113d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f231114e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f231115f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f231116g;

    /* compiled from: GroupItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f231117l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f231117l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f231117l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: GroupItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f231118l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(1);
            this.f231118l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f231118l.invoke();
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f231111b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.vk_linking_group_radio);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f231112c = (RadioButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vk_linking_group_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
        this.f231113d = simpleDraweeView;
        View viewFindViewById3 = view.findViewById(R.id.vk_linking_group_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231114e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.vk_linking_group_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231115f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.vk_linking_group_item_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f231116g = viewFindViewById5;
        simpleDraweeView.getHierarchy().q(C35835l0.l(C35835l0.h(R.attr.ic_shop24, view.getContext()), C35835l0.d(R.attr.gray16, view.getContext())), (s.a) s.c.f340135g);
    }

    @Override // com.avito.android.profile_vk_linking.group_management.adapter.group.h
    public final void Dj(@k com.avito.android.profile_vk_linking.group_management.adapter.group.a aVar, @Y61.l Y41.a<G0> aVar2) {
        ViewOnClickListenerC31042l viewOnClickListenerC31042l;
        C35949t5.c(this.f231113d, com.avito.android.image_loader.b.b(aVar.f231097d), null, null, null, 14);
        TextView textView = this.f231114e;
        I5.a(textView, aVar.f231098e, false);
        TextView textView2 = this.f231115f;
        I5.a(textView2, aVar.f231099f, false);
        boolean z12 = aVar.f231100g;
        RadioButton radioButton = this.f231112c;
        radioButton.setChecked(z12);
        ViewOnClickListenerC31042l viewOnClickListenerC31042l2 = null;
        if (aVar2 != null) {
            viewOnClickListenerC31042l = new ViewOnClickListenerC31042l(27, new a(aVar2));
        } else {
            viewOnClickListenerC31042l = null;
        }
        this.f231116g.setOnClickListener(viewOnClickListenerC31042l);
        if (aVar2 != null) {
            viewOnClickListenerC31042l2 = new ViewOnClickListenerC31042l(28, new b(aVar2));
        }
        radioButton.setOnClickListener(viewOnClickListenerC31042l2);
        boolean z13 = aVar.f231101h;
        boolean z14 = !z13;
        SimpleDraweeView simpleDraweeView = this.f231113d;
        Context context = this.f231111b;
        if (z13) {
            simpleDraweeView.setAlpha(0.5f);
            textView.setTextColor(C35835l0.d(R.attr.gray36, context));
            textView2.setTextColor(C35835l0.d(R.attr.gray36, context));
        } else {
            simpleDraweeView.setAlpha(1.0f);
            textView.setTextColor(C35835l0.d(R.attr.black, context));
            textView2.setTextColor(C35835l0.d(R.attr.gray54, context));
        }
        radioButton.setClickable(z14);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f231116g.setOnClickListener(null);
    }
}
