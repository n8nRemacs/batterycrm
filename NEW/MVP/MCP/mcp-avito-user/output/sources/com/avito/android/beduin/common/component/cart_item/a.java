package com.avito.android.beduin.common.component.cart_item;

import L91.p;
import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C22832m;
import bi.C25654c;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.component.cart_item.RightIcons;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.util.C35835l0;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCartItemComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/a;", "LWh/a;", "Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel;", "Lcom/avito/android/beduin/common/component/cart_item/g;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC15764a<BeduinCartItemModel, g> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final b f100882j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final List<String> f100883k = Collections.singletonList("cartItem");

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinCartItemModel> f100884l = BeduinCartItemModel.class;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BeduinCartItemModel f100885f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f100886g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25654c f100887h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final lj.e f100888i;

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/a$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.cart_item.a$a, reason: collision with other inner class name */
    public static final class C3028a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final g f100889b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC15523b<BeduinAction> f100890c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BeduinCartItemModel f100891d;

        public C3028a(@Y61.k g gVar, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k BeduinCartItemModel beduinCartItemModel) {
            this.f100889b = gVar;
            this.f100890c = interfaceC15523b;
            this.f100891d = beduinCartItemModel;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onShowPress(@Y61.k MotionEvent motionEvent) {
            float x12 = motionEvent.getX(motionEvent.getActionIndex());
            float y12 = motionEvent.getY(motionEvent.getActionIndex());
            g gVar = this.f100889b;
            gVar.getForeground().setHotspot(x12, y12);
            gVar.setPressed(true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
            com.avito.android.beduin_shared.model.utils.a.a(this.f100890c, this.f100891d.getOnBodyTapActions());
            return true;
        }
    }

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/a$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinCartItemModel> S() {
            return a.f100884l;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return a.f100883k;
        }

        public b() {
        }
    }

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100892a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100893b;

        static {
            int[] iArr = new int[State.values().length];
            try {
                State state = State.f181147b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f100892a = iArr;
            int[] iArr2 = new int[BeduinCartItemModel.State.values().length];
            try {
                iArr2[BeduinCartItemModel.State.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BeduinCartItemModel.State.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BeduinCartItemModel.State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f100893b = iArr2;
        }
    }

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RightIcons.Favorite f100894l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f100895m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RightIcons.Favorite favorite, a aVar) {
            super(0);
            this.f100894l = favorite;
            this.f100895m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            RightIcons.Favorite favorite = this.f100894l;
            boolean zIsFavorite = favorite.getIsFavorite();
            a aVar = this.f100895m;
            if (zIsFavorite) {
                com.avito.android.beduin_shared.model.utils.a.a(aVar.f100886g, favorite.c());
            } else {
                com.avito.android.beduin_shared.model.utils.a.a(aVar.f100886g, favorite.d());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ RightIcons.Default f100897m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RightIcons.Default r22) {
            super(0);
            this.f100897m = r22;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.beduin_shared.model.utils.a.a(a.this.f100886g, this.f100897m.d());
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinCartItemComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            com.avito.android.beduin_shared.model.utils.a.a(aVar.f100886g, aVar.f100885f.getOnMoreButtonTapActions());
            return G0.f406611a;
        }
    }

    public a(@Y61.k BeduinCartItemModel beduinCartItemModel, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k C25654c c25654c, @Y61.k lj.e eVar) {
        this.f100885f = beduinCartItemModel;
        this.f100886g = interfaceC15523b;
        this.f100887h = c25654c;
        this.f100888i = eVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void q(@Y61.k g gVar) {
        gVar.a(this.f395324b, this.f395325c);
        Context applicationContext = gVar.getContext().getApplicationContext();
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f100886g;
        BeduinCartItemModel beduinCartItemModel = this.f100885f;
        C22832m c22832m = new C22832m(applicationContext, new C3028a(gVar, interfaceC15523b, beduinCartItemModel), null);
        gVar.setState(beduinCartItemModel.getState());
        gVar.setImage(beduinCartItemModel.getImage());
        List<BeduinModel> children = beduinCartItemModel.getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        y(children, gVar);
        List<RightIcons> rightIcons = beduinCartItemModel.getRightIcons();
        if (rightIcons == null) {
            rightIcons = C42784z0.f406748b;
        }
        gVar.setRightIcons(rightIcons);
        gVar.setOnCheckboxTapListener(new com.avito.android.beduin.common.component.cart_item.b(this));
        gVar.setOnBodyTouchListener(new p(1, c22832m, gVar));
        z(gVar);
        gVar.setOnMoreButtonTapListener(new f());
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100885f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinCartItemModel beduinCartItemModel = (BeduinCartItemModel) beduinModel;
        if (!L.f(BeduinCartItemModel.copy$default(this.f100885f, null, null, beduinCartItemModel.getState(), null, beduinCartItemModel.getChildren(), null, null, null, beduinCartItemModel.getRightIcons(), 235, null), beduinCartItemModel)) {
            return null;
        }
        l.f100919e.getClass();
        BeduinCartItemModel.State state = beduinCartItemModel.getState();
        BeduinCartItemModel beduinCartItemModel2 = this.f100885f;
        l lVar = new l((BeduinCartItemModel.State) C28805a.a(state, beduinCartItemModel2.getState()), (List) C28805a.a(beduinCartItemModel.getChildren(), beduinCartItemModel2.getChildren()), beduinCartItemModel.getRightIcons());
        if (lVar.f100923d) {
            return null;
        }
        return lVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = new g(viewGroup.getContext(), null, 0, 6, null);
        gVar.setId(R.id.beduin_cart_item);
        gVar.setLayoutParams(layoutParams);
        gVar.setForeground(C35835l0.h(android.R.attr.selectableItemBackground, viewGroup.getContext()));
        gVar.a(this.f395324b, this.f395325c);
        return gVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        Object next;
        g gVar = (g) view;
        if (list.isEmpty()) {
            q(gVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof l) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            BeduinCartItemModel.State state = lVar.f100920a;
            if (state != null) {
                gVar.setState(state);
            }
            List<BeduinModel> list2 = lVar.f100921b;
            if (list2 != null) {
                y(list2, gVar);
            }
            List<RightIcons> list3 = lVar.f100922c;
            if (list3 != null) {
                Iterator<T> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof RightIcons.Favorite) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof RightIcons.Favorite)) {
                    next = null;
                }
                RightIcons.Favorite favorite = (RightIcons.Favorite) next;
                gVar.setFavoriteNewState(favorite != null ? Boolean.valueOf(favorite.getIsFavorite()) : null);
                z(gVar);
            }
            gVar.setOnCheckboxTapListener(new com.avito.android.beduin.common.component.cart_item.b(this));
        }
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f100886g;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f100887h;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF103218f() {
        return this.f100888i;
    }

    public final void y(List<? extends BeduinModel> list, g gVar) {
        List<? extends BeduinModel> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = u((BeduinModel) it.next());
            InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(gVar, new ViewGroup.MarginLayoutParams(-2, -2));
            if (interfaceC40116eI.getF103243b().getId() == -1) {
                interfaceC40116eI.getF103243b().setId(View.generateViewId());
            }
            abstractC40112aU.m(interfaceC40116eI);
            arrayList.add(interfaceC40116eI.getF103243b());
        }
        gVar.setChildrenViews(arrayList);
    }

    public final void z(g gVar) {
        List<RightIcons> rightIcons = this.f100885f.getRightIcons();
        if (rightIcons != null) {
            for (RightIcons rightIcons2 : rightIcons) {
                if (rightIcons2 instanceof RightIcons.Favorite) {
                    gVar.setFavoriteTapActionListener(new d((RightIcons.Favorite) rightIcons2, this));
                } else if (rightIcons2 instanceof RightIcons.Default) {
                    ((ImageView) gVar.f100911h.findViewWithTag("default")).setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(19, new e((RightIcons.Default) rightIcons2)));
                }
            }
        }
    }
}
