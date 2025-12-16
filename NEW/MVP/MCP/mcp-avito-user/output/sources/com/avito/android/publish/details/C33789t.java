package com.avito.android.publish.details;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23503n;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.publish.ActionMode;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.util.A6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import j.InterfaceC42150f;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemDetailsView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/t;", "Lcom/avito/android/publish/details/ItemDetailsView;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33789t implements ItemDetailsView {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f234941a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC33778p> f234942b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ItemDetailsView.b f234943c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f234944d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.dialog.a f234945e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.publish.objects.N0 f234946f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f234947g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f234948h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f234949i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f234950j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.auto_description.k f234951k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f234952l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Dialog f234953m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C33862g0 f234954n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public q f234955o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.view.e f234956p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.imv.c f234957q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f234958r;

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.f234943c.O5();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ItemDetailsView.RightTopButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ItemDetailsView.RightTopButtonStyle rightTopButtonStyle = ItemDetailsView.RightTopButtonStyle.f232948b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ItemDetailsView.RightTopButtonStyle rightTopButtonStyle2 = ItemDetailsView.RightTopButtonStyle.f232948b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/t$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f234961c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f234962d;

        public c(int i12, boolean z12) {
            this.f234961c = i12;
            this.f234962d = z12;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C33789t c33789t = C33789t.this;
            A6.b(c33789t.f234948h.getViewTreeObserver(), this);
            c33789t.e(this.f234961c, this.f234962d);
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/t$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$d */
    public static final class d extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f234964c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f234965d;

        public d(int i12, boolean z12) {
            this.f234964c = i12;
            this.f234965d = z12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            C33789t c33789t = C33789t.this;
            c33789t.f234948h.v0(this);
            LinearLayoutManager linearLayoutManager = c33789t.f234952l;
            int i14 = this.f234964c;
            View viewZ = linearLayoutManager.Z(i14);
            if (viewZ == null) {
                return;
            }
            if (this.f234965d) {
                viewZ.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC33792u(viewZ, c33789t, viewZ, i14));
            } else {
                c33789t.m(viewZ, i14);
            }
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.f234943c.k2(true);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.f234943c.k2(false);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f234968l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.f234943c.k2(false);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$i */
    public /* synthetic */ class i extends kotlin.jvm.internal.H implements Y41.a<kotlin.G0> {
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ((ItemDetailsView.b) this.receiver).j2();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$j */
    public /* synthetic */ class j extends C42801a implements Y41.a<kotlin.G0> {
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ((ItemDetailsView.b) this.receiver).k2(false);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/slots/card_select/item/k$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<k.b, kotlin.G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(k.b bVar) {
            C33789t.this.f234943c.D(bVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;", "bubble", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<BubbleInfo, kotlin.G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(BubbleInfo bubbleInfo) {
            C33789t.this.f234943c.s(bubbleInfo);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.i();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f234974m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Y41.a<kotlin.G0> aVar) {
            super(0);
            this.f234974m = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t.this.i();
            this.f234974m.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f234975l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f234976m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f234977n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f234978o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f234979p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, String str3, String str4, Y41.a<kotlin.G0> aVar) {
            super(2);
            this.f234975l = str;
            this.f234976m = str2;
            this.f234977n = str3;
            this.f234978o = str4;
            this.f234979p = aVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            bVar2.setTitle(this.f234975l);
            bVar2.setButtonsOrientation(1);
            bVar2.setCancelable(true);
            bVar2.setSubtitle(this.f234976m);
            bVar2.L3(this.f234977n, new A(this.f234979p, dialogInterface2));
            bVar2.M3(this.f234978o, new B(dialogInterface2));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.t$p */
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TooltipOptions f234980l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f234981m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C33789t f234982n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(TooltipOptions tooltipOptions, Y41.a<kotlin.G0> aVar, C33789t c33789t) {
            super(1);
            this.f234980l = tooltipOptions;
            this.f234981m = aVar;
            this.f234982n = c33789t;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            String text;
            com.avito.android.lib.design.tooltip.o oVar2 = oVar;
            TooltipOptions tooltipOptions = this.f234980l;
            String text2 = tooltipOptions.getText();
            if (text2 != null) {
                oVar2.b(text2);
            }
            TooltipOptions.Button button = tooltipOptions.getButton();
            if (button != null && (text = button.getText()) != null) {
                oVar2.d(text);
                final Y41.a<kotlin.G0> aVar = this.f234981m;
                final int i12 = 0;
                oVar2.c(new View.OnClickListener() { // from class: com.avito.android.publish.details.C
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                Y41.a aVar2 = (Y41.a) aVar;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                    break;
                                }
                                break;
                            default:
                                C33789t c33789t = (C33789t) aVar;
                                com.avito.android.lib.design.tooltip.k kVar = c33789t.f234958r;
                                if (kVar != null) {
                                    kVar.dismiss();
                                }
                                c33789t.f234958r = null;
                                break;
                        }
                    }
                });
            }
            oVar2.f(true);
            final C33789t c33789t = this.f234982n;
            final int i13 = 1;
            oVar2.e(new View.OnClickListener() { // from class: com.avito.android.publish.details.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            Y41.a aVar2 = (Y41.a) c33789t;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                        default:
                            C33789t c33789t2 = (C33789t) c33789t;
                            com.avito.android.lib.design.tooltip.k kVar = c33789t2.f234958r;
                            if (kVar != null) {
                                kVar.dismiss();
                            }
                            c33789t2.f234958r = null;
                            break;
                    }
                }
            });
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/t$q", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.t$q */
    public static final class q extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f234983b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(Y41.a<kotlin.G0> aVar) {
            this.f234983b = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 1) {
                this.f234983b.invoke();
            }
        }
    }

    public C33789t(@Y61.k ViewGroup viewGroup, @Y61.k Provider<InterfaceC33778p> provider, @Y61.k ItemDetailsView.b bVar, @Y61.k InterfaceC28373a interfaceC28373a, long j12, @Y61.k RecyclerView.Adapter<?> adapter, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.android.lib.deprecated_design.dialog.a aVar2, @Y61.l Boolean bool, boolean z12, @Y61.l com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar, @Y61.l com.avito.android.publish.objects.N0 n02) {
        this.f234941a = viewGroup;
        this.f234942b = provider;
        this.f234943c = bVar;
        this.f234944d = aVar;
        this.f234945e = aVar2;
        this.f234946f = n02;
        Context context = viewGroup.getContext();
        this.f234947g = context;
        View viewFindViewById = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f234948h = recyclerView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, R.id.recycler_view, interfaceC28373a, R.layout.publish_progress_overlay, 0, 16, null);
        this.f234949i = lVar;
        View viewFindViewById3 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f234950j = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, 0, interfaceC28373a, R.layout.publish_progress_overlay_black, C35835l0.d(R.attr.transparentBlack, context), 2, null);
        View viewFindViewById4 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f234951k = new com.avito.android.publish.details.auto_description.k((ViewGroup) viewFindViewById4, R.id.recycler_view, interfaceC28373a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f234952l = linearLayoutManager;
        this.f234954n = new C33862g0(viewGroup.getRootView(), bool);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = j12;
        }
        RecyclerView.j itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f53832f = j12;
        }
        View viewFindViewById5 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        recyclerView.o(new com.avito.android.publish.view.p((FrameLayout) viewFindViewById5));
        if (dVar != null) {
            com.avito.android.publish.slots.images_groups_recommendations.analytics.a aVar3 = new com.avito.android.publish.slots.images_groups_recommendations.analytics.a(recyclerView, dVar);
            recyclerView.o(aVar3);
            recyclerView.m(aVar3);
        }
        if (z12) {
            recyclerView.l(new com.avito.android.blueprints.publish.header.a(recyclerView.getResources()), -1);
        }
        lVar.f231600j = new a();
        recyclerView.setAdapter(adapter);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void C0() {
        this.f234949i.j();
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void W() {
        K2.d(this.f234941a, true);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void a() {
        this.f234949i.k(null);
    }

    public final void b(boolean z12) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f234941a;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.app_bar);
        if (viewGroup3 == null || (viewGroup = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.footer)) == null) {
            return;
        }
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.getRootView();
        C23503n c23503n = new C23503n();
        c23503n.f54670g.add(viewGroup3);
        c23503n.f54670g.add(viewGroup);
        androidx.transition.Q.a(viewGroup4, c23503n);
        if (z12) {
            D6.H(viewGroup3);
            D6.H(viewGroup);
        } else {
            D6.g(viewGroup3);
            D6.w(viewGroup);
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void c(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
        com.avito.android.publish.details.auto_description.k kVar = this.f234951k;
        kVar.k(str2);
        kVar.m(str, lVar);
        b(false);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void d(@Y61.k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
        this.f234944d.c(aVar);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void e(int i12, boolean z12) {
        if (i12 >= 0) {
            LinearLayoutManager linearLayoutManager = this.f234952l;
            if (i12 < linearLayoutManager.o0()) {
                View viewZ = linearLayoutManager.Z(i12);
                if (viewZ != null) {
                    m(viewZ, i12);
                    return;
                }
                RecyclerView recyclerView = this.f234948h;
                if (recyclerView.getChildCount() == 0) {
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new c(i12, z12));
                } else {
                    recyclerView.o(new d(i12, z12));
                    linearLayoutManager.l1(i12);
                }
            }
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void f(@Y61.k ru.avito.component.toolbar.d dVar) {
        this.f234954n.d(dVar);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void g() {
        com.avito.android.publish.view.e eVar = this.f234956p;
        RecyclerView recyclerView = this.f234948h;
        if (eVar != null) {
            recyclerView.v0(eVar);
        }
        if (this.f234956p == null) {
            this.f234956p = new com.avito.android.publish.view.e(new k());
        }
        com.avito.android.publish.view.e eVar2 = this.f234956p;
        if (eVar2 != null) {
            recyclerView.o(eVar2);
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void h() {
        this.f234950j.k(null);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void i() {
        this.f234950j.j();
        Dialog dialog = this.f234953m;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void j(int i12, @Y61.l TooltipOptions tooltipOptions, @Y61.l Y41.a<kotlin.G0> aVar) {
        View viewZ;
        com.avito.android.lib.design.tooltip.k kVar = this.f234958r;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f234958r = null;
        if (tooltipOptions == null || (viewZ = this.f234952l.Z(i12)) == null) {
            return;
        }
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(viewZ.getContext(), 0, 0, 6, null);
        kVar2.f181224j = new r.d(new i.a(new b.a()));
        int i13 = kVar2.f181229o;
        kVar2.f181228n = -1;
        kVar2.f181229o = i13;
        com.avito.android.lib.design.tooltip.p.a(kVar2, new p(tooltipOptions, aVar, this));
        this.f234958r = kVar2.f(viewZ);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void j3(@Y61.k String str) {
        Provider<InterfaceC33778p> provider = this.f234942b;
        if (provider.get() != null) {
            provider.get().j3(str);
            return;
        }
        this.f234943c.Zc(str);
        this.f234941a.post(new RunnableC28882d(25, this, str));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void k(@Y61.k String str) {
        this.f234951k.a(str);
        b(false);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void l() {
        this.f234949i.a("");
    }

    public final void m(View view, int i12) {
        InterfaceC33778p interfaceC33778p = this.f234942b.get();
        int height = interfaceC33778p != null ? interfaceC33778p.getHeight() : 0;
        RecyclerView recyclerView = this.f234948h;
        recyclerView.post(new RunnableC33786s(this, i12, view.getHeight() > recyclerView.getHeight() - height ? (recyclerView.getHeight() - view.getHeight()) - height : 0, 0));
    }

    public final void n(@Y61.k ItemDetailsView.RightTopButtonStyle rightTopButtonStyle) {
        int iOrdinal = rightTopButtonStyle.ordinal();
        C33862g0 c33862g0 = this.f234954n;
        if (iOrdinal == 0) {
            c33862g0.b(new e(), new f());
            return;
        }
        if (iOrdinal == 1) {
            c33862g0.a(ActionMode.f231835e);
            c33862g0.b(new i(0, this.f234943c, ItemDetailsView.b.class, "onDeleteClicked", "onDeleteClicked()V", 0), new j(0, this.f234943c, ItemDetailsView.b.class, "onCancelClicked", "onCancelClicked(Z)V", 0));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            c33862g0.a(ActionMode.f231836f);
            c33862g0.b(g.f234968l, new h());
        }
    }

    public final void o(@InterfaceC42150f int i12) {
        this.f234954n.c(C35835l0.j(i12, this.f234947g));
    }

    public final void p(@Y61.k String str) {
        this.f234954n.f236022a.setNavigationTitle(str);
    }

    public final void q(@Y61.k com.avito.android.publish.imv.a aVar) {
        com.avito.android.publish.imv.c cVar = this.f234957q;
        if (cVar == null) {
            cVar = new com.avito.android.publish.imv.c(this.f234947g);
            this.f234957q = cVar;
            com.avito.android.publish.objects.N0 n02 = this.f234946f;
            if (n02 != null) {
                ShadowFrameLayout shadowFrameLayout = cVar.f236063b;
                n02.f237525d = shadowFrameLayout;
                n02.f237522a.addView(shadowFrameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
                n02.a(shadowFrameLayout, n02.f237523b, n02.f237524c);
            }
        }
        cVar.a(aVar, new l());
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void q1() {
        this.f234951k.j();
        b(true);
    }

    public final void r(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f234953m = this.f234945e.b(str, str2, str4, new m(), str3, new n(aVar));
    }

    public final void s(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Y41.a<kotlin.G0> aVar) {
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(this.f234947g, R.style.Theme_DesignSystem_Re23);
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        o oVar = new o(str, str2, str3, str4, aVar);
        c5284a.getClass();
        com.avito.android.lib.design.modal.a aVarA = a.C5284a.a(dVar, 0, R.style.PublishObjectModelStyle, oVar);
        this.f234953m = aVarA;
        com.avito.android.lib.util.g.a(aVarA);
    }

    public final void t(@Y61.k Y41.a<kotlin.G0> aVar) {
        q qVar = new q(aVar);
        this.f234948h.o(qVar);
        this.f234955o = qVar;
    }

    public final void u() {
        q qVar = this.f234955o;
        if (qVar != null) {
            this.f234948h.v0(qVar);
        }
        this.f234955o = null;
    }

    public /* synthetic */ C33789t(ViewGroup viewGroup, Provider provider, ItemDetailsView.b bVar, InterfaceC28373a interfaceC28373a, long j12, RecyclerView.Adapter adapter, com.avito.konveyor.adapter.a aVar, com.avito.android.lib.deprecated_design.dialog.a aVar2, Boolean bool, boolean z12, com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar, com.avito.android.publish.objects.N0 n02, int i12, C42822w c42822w) {
        this(viewGroup, provider, bVar, interfaceC28373a, (i12 & 16) != 0 ? 500L : j12, adapter, aVar, aVar2, bool, z12, (i12 & 1024) != 0 ? null : dVar, n02);
    }
}
