package com.avito.android.beduin.common.container.layered;

import Ui.InterfaceC15523b;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.alignment.HorizontalAlignment;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.container.componentsPool.j;
import com.avito.android.beduin.common.container.layered.j;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import com.avito.android.util.O2;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinLayeredContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/a;", "Lej/a;", "Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerModel;", "Lcom/avito/android/beduin/common/container/layered/i;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinLayeredContainerModel, i> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f103131i = 0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinLayeredContainerModel f103132e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f103133f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Yh.c f103134g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Wh.c f103135h;

    /* compiled from: BeduinLayeredContainer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/a$a;", "", "<init>", "()V", "", "BACKGROUND_CHILDREN_COUNT", "I", "BACKGROUND_CHILDREN_INDEX", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.layered.a$a, reason: collision with other inner class name */
    public static final class C3093a {
        public /* synthetic */ C3093a(C42822w c42822w) {
            this();
        }

        public C3093a() {
        }
    }

    /* compiled from: BeduinLayeredContainer.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/a$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f103136a = Collections.singletonList("layeredContainer");

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinModel> f103137b = BeduinLayeredContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<? extends BeduinModel> S() {
            return this.f103137b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return this.f103136a;
        }
    }

    /* compiled from: BeduinLayeredContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103138a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f103139b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f103140c;

        static {
            int[] iArr = new int[LayeredContainerLayoutMode.values().length];
            try {
                iArr[LayeredContainerLayoutMode.FILL_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayeredContainerLayoutMode.FILL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayeredContainerLayoutMode.FILL_HEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayeredContainerLayoutMode.BY_CONTENT_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f103138a = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f103139b = iArr2;
            int[] iArr3 = new int[HorizontalAlignment.values().length];
            try {
                iArr3[HorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[HorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[HorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f103140c = iArr3;
        }
    }

    static {
        new C3093a(null);
    }

    public a(@Y61.k BeduinLayeredContainerModel beduinLayeredContainerModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k Yh.c cVar, @Y61.k Wh.c cVar2) {
        this.f103132e = beduinLayeredContainerModel;
        this.f103133f = interfaceC15523b;
        this.f103134g = cVar;
        this.f103135h = cVar2;
    }

    public static final j.b p(a aVar, ForegroundFrameLayout foregroundFrameLayout, int i12, List list) {
        int i13;
        aVar.getClass();
        if (i12 == 0) {
            return new j.b(foregroundFrameLayout.getLayoutParams().width, -2, 0, 4, null);
        }
        int i14 = 1;
        int i15 = i12 - 1;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BeduinLayeredContainerChild beduinLayeredContainerChild = (BeduinLayeredContainerChild) list.get(i15);
        LayeredContainerLayoutMode layoutMode = aVar.f103132e.getLayoutMode();
        int i16 = foregroundFrameLayout.getLayoutParams().width;
        int i17 = j.a.f103152a[layoutMode.ordinal()];
        if (i17 == 1 || i17 == 2) {
            i16 = -2;
        }
        VerticalAlignment verticalAlignment = beduinLayeredContainerChild.getVerticalAlignment();
        if (verticalAlignment == null) {
            verticalAlignment = VerticalAlignment.CENTER;
        }
        HorizontalAlignment horizontalAlignment = beduinLayeredContainerChild.getHorizontalAlignment();
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.CENTER;
        }
        int i18 = c.f103139b[verticalAlignment.ordinal()];
        if (i18 == 1) {
            i13 = 48;
        } else if (i18 == 2) {
            i13 = 80;
        } else {
            if (i18 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 16;
        }
        int i19 = c.f103140c[horizontalAlignment.ordinal()];
        if (i19 == 1) {
            i14 = 3;
        } else if (i19 == 2) {
            i14 = 5;
        } else if (i19 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new j.b(i16, -2, i13 | i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static ArrayList q(BeduinLayeredContainerModel beduinLayeredContainerModel) {
        ?? arrayList;
        List listSingletonList = Collections.singletonList(beduinLayeredContainerModel.getBackgroundChild());
        List<BeduinLayeredContainerChild> foregroundChildren = beduinLayeredContainerModel.getForegroundChildren();
        if (foregroundChildren != null) {
            List<BeduinLayeredContainerChild> list = foregroundChildren;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BeduinLayeredContainerChild) it.next()).getChild());
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return C42745f0.h0(arrayList, listSingletonList);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103132e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ForegroundFrameLayout foregroundFrameLayout = new ForegroundFrameLayout(viewGroup.getContext(), null, 0, 6, null);
        foregroundFrameLayout.setId(R.id.beduin_layered_container);
        foregroundFrameLayout.setLayoutParams(layoutParams);
        I.b(foregroundFrameLayout);
        return new i(foregroundFrameLayout, this.f103135h);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinLayeredContainerModel beduinLayeredContainerModel = (BeduinLayeredContainerModel) beduinModel;
        if ((beduinLayeredContainerModel.equals(BeduinLayeredContainerModel.copy$default(this.f103132e, null, null, null, null, null, null, null, beduinLayeredContainerModel.getBackgroundChild(), beduinLayeredContainerModel.getForegroundChildren(), 127, null)) ? beduinLayeredContainerModel : null) != null) {
            return this.f103134g.a(q(this.f103132e), q(beduinLayeredContainerModel));
        }
        return null;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        i iVar = (i) interfaceC40116e;
        BeduinLayeredContainerModel beduinLayeredContainerModel = this.f103132e;
        String f100853b = beduinLayeredContainerModel.getF102944b();
        ForegroundFrameLayout foregroundFrameLayout = iVar.f103150b;
        foregroundFrameLayout.setTag(f100853b);
        I.c(foregroundFrameLayout, beduinLayeredContainerModel.getBackground(), O2.a(beduinLayeredContainerModel.getActions()));
        J.b(foregroundFrameLayout, beduinLayeredContainerModel.getMargin());
        iVar.f103151c.b(q(beduinLayeredContainerModel), new com.avito.android.beduin.common.container.layered.b(this, foregroundFrameLayout), new com.avito.android.beduin.common.container.layered.c(this), new d(this, foregroundFrameLayout));
        com.avito.android.beduin.common.component.j.a(foregroundFrameLayout, beduinLayeredContainerModel.getActions(), this.f103133f);
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        Object next;
        i iVar = (i) interfaceC40116e;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof Yh.b) {
                    break;
                }
            }
        }
        Yh.b bVar = (Yh.b) (next instanceof Yh.b ? next : null);
        if (bVar != null) {
            com.avito.android.beduin.common.container.componentsPool.e.a(iVar.f103151c, bVar, new e(this, iVar));
        } else {
            m(iVar);
        }
    }
}
