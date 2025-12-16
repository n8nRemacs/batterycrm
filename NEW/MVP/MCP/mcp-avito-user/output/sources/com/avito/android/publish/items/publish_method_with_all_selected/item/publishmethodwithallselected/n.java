package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C22763c;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.SimpleBadge;
import com.avito.android.remote.model.category_parameters.Link;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import sK0.C48063a;

/* compiled from: PublishMethodWithAllSelectedView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/publish_method_with_all_selected/item/publishmethodwithallselected/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/publish_method_with_all_selected/item/publishmethodwithallselected/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237100b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f237101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f237102d;

    /* compiled from: PublishMethodWithAllSelectedView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$A$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$A$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ParameterElement.A.a, G0> f237103b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super ParameterElement.A.a, G0> lVar) {
            this.f237103b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f237103b.invoke((ParameterElement.A.a) obj);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f237104b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f237105b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super DeepLink, G0> lVar) {
            this.f237105b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f237105b.invoke((DeepLink) obj);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f237106b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public n(@Y61.k View view) {
        super(view);
        this.f237100b = (ViewGroup) view;
        this.f237101c = LayoutInflater.from(view.getContext());
        this.f237102d = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.m
    public final void EU(@Y61.k ParameterElement.A a12, @Y61.k Y41.l<? super ParameterElement.A.a, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) throws Resources.NotFoundException {
        Link link;
        Drawable background;
        ViewGroup viewGroup = this.f237100b;
        viewGroup.removeAllViews();
        for (ParameterElement.A.a aVar : a12.f117186g) {
            View viewInflate = this.f237101c.inflate(R.layout.publish_method_option, viewGroup, false);
            com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.c cVar = new com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.c(viewInflate);
            com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.b bVar = new com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.b(cVar, aVar);
            ViewGroup viewGroup2 = cVar.f237078a;
            D6.a(bVar, viewGroup2);
            cVar.f237080c.setText(aVar.f117188b);
            cVar.f237081d.setChecked(aVar.f117192f);
            androidx.appcompat.view.d dVar = cVar.f237085h;
            UniversalColor universalColor = aVar.f117190d;
            if (universalColor != null && (background = viewGroup2.getBackground()) != null) {
                Drawable drawableMutate = background.mutate();
                drawableMutate.setColorFilter(C22763c.a(C48063a.f437606a.a(dVar, universalColor), BlendModeCompat.f44706c));
                viewGroup2.setBackground(drawableMutate);
            }
            DockingBadge dockingBadge = cVar.f237079b;
            SimpleBadge simpleBadge = aVar.f117189c;
            if (simpleBadge != null) {
                dockingBadge.setText(simpleBadge.getTitle());
                String style = simpleBadge.getStyle();
                DockingBadgeType.Custom custom = new DockingBadgeType.Custom(com.avito.android.lib.util.f.f(dVar, (style == null || style.length() == 0) ? "violetMedium" : simpleBadge.getStyle()));
                DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.Pipka;
                dockingBadge.d(custom, DockingBadgeSize.MEDIUM, dockingBadgeEdgeType, dockingBadgeEdgeType);
                D6.H(dockingBadge);
            } else {
                D6.w(dockingBadge);
            }
            PublishMethodWithAllSelectedValueParameter.OptionDisplayDescription optionDisplayDescription = aVar.f117191e;
            I5.a(cVar.f237082e, optionDisplayDescription != null ? optionDisplayDescription.getText() : null, false);
            I5.a(cVar.f237083f, optionDisplayDescription != null ? optionDisplayDescription.getHint() : null, false);
            DeepLink deeplink = (optionDisplayDescription == null || (link = optionDisplayDescription.getLink()) == null) ? null : link.getDeeplink();
            TextView textView = cVar.f237084g;
            if (deeplink == null || (deeplink instanceof NoMatchLink)) {
                D6.w(textView);
                D6.a(null, textView);
            } else {
                Link link2 = optionDisplayDescription.getLink();
                I5.a(textView, link2 != null ? link2.getText() : null, false);
                D6.a(new com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.a(cVar, deeplink), textView);
            }
            a aVar2 = new a(lVar);
            l41.g<? super Throwable> gVar = b.f237104b;
            com.jakewharton.rxrelay3.c<ParameterElement.A.a> cVar2 = cVar.f237086i;
            cVar2.getClass();
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            io.reactivex.rxjava3.disposables.d dVarV0 = cVar2.v0(aVar2, gVar, interfaceC43543a);
            io.reactivex.rxjava3.disposables.c cVar3 = this.f237102d;
            cVar3.b(dVarV0);
            c cVar4 = new c(lVar2);
            l41.g<? super Throwable> gVar2 = d.f237106b;
            com.jakewharton.rxrelay3.c<DeepLink> cVar5 = cVar.f237087j;
            cVar5.getClass();
            cVar3.b(cVar5.v0(cVar4, gVar2, interfaceC43543a));
            viewGroup.addView(viewInflate);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f237102d.e();
    }
}
