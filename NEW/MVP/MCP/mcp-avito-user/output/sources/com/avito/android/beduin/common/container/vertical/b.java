package com.avito.android.beduin.common.container.vertical;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.alignment.HorizontalAlignment;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.componentsPool.j;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: BeduinVerticalContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/vertical/b;", "Lej/a;", "Lcom/avito/android/beduin/common/container/vertical/BeduinVerticalContainerModel;", "Lcom/avito/android/beduin/common/container/vertical/i;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40112a<BeduinVerticalContainerModel, i> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinVerticalContainerModel f103255e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103256f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Wh.c f103257g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Yh.c f103258h;

    /* compiled from: BeduinVerticalContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/vertical/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f103259a = Collections.singletonList("verticalContainer");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f103260b = BeduinVerticalContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f103260b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f103259a;
        }
    }

    /* compiled from: BeduinVerticalContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.vertical.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3099b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103261a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f103262b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f103263c;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103261a = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f103262b = iArr2;
            int[] iArr3 = new int[LayoutMode.values().length];
            try {
                iArr3[LayoutMode.FILL_HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[LayoutMode.BY_CONTENT_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f103263c = iArr3;
        }
    }

    public b(@k BeduinVerticalContainerModel beduinVerticalContainerModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k Wh.c cVar, @k Yh.c cVar2) {
        this.f103255e = beduinVerticalContainerModel;
        this.f103256f = interfaceC15523b;
        this.f103257g = cVar;
        this.f103258h = cVar2;
    }

    public static final j.c p(b bVar, i iVar) {
        Integer right;
        Integer left;
        Integer all;
        bVar.getClass();
        int i12 = iVar.f103271b.getLayoutParams().width;
        BeduinContainerIndent padding = bVar.f103255e.getPadding();
        if (i12 >= 0) {
            int iB2 = (padding == null || (all = padding.getAll()) == null) ? 0 : y6.b(all.intValue());
            int iB3 = (padding == null || (left = padding.getLeft()) == null) ? iB2 : y6.b(left.intValue());
            if (padding != null && (right = padding.getRight()) != null) {
                iB2 = y6.b(right.intValue());
            }
            i12 = (i12 - iB3) - iB2;
        }
        return new j.c(i12, -2);
    }

    public static VU.d q(Context context, BeduinContainerBackground.Shadows.Shadow shadow) {
        if (shadow == null) {
            return new VU.d(0, 0, 0, 0, 15, null);
        }
        Integer offsetX = shadow.getOffsetX();
        int iB2 = offsetX != null ? y6.b(offsetX.intValue()) : 0;
        Integer offsetY = shadow.getOffsetY();
        int iB3 = offsetY != null ? y6.b(offsetY.intValue()) : 0;
        int iB4 = C48065c.b(context, shadow.getColor(), R.attr.transparentWhite);
        Integer blurRadius = shadow.getBlurRadius();
        return new VU.d(iB2, iB3, iB4, blurRadius != null ? y6.b(blurRadius.intValue()) : 0);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103255e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        com.avito.android.beduin.common.container.vertical.a aVar = new com.avito.android.beduin.common.container.vertical.a(viewGroup.getContext(), null, 0, 6, null);
        aVar.setId(R.id.beduin_vertical_container);
        aVar.setLayoutParams(layoutParams);
        aVar.setOrientation(1);
        I.b(aVar);
        return new i(aVar, this.f103257g);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinVerticalContainerModel beduinVerticalContainerModel = (BeduinVerticalContainerModel) beduinModel;
        if ((beduinVerticalContainerModel.equals(BeduinVerticalContainerModel.copy$default(this.f103255e, null, null, null, null, null, beduinVerticalContainerModel.getChildren(), null, null, null, null, null, null, 4063, null)) ? beduinVerticalContainerModel : null) != null) {
            return this.f103258h.a(this.f103255e.getChildren(), beduinVerticalContainerModel.getChildren());
        }
        return null;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        int i12;
        int i13;
        Integer cornerRadius;
        i iVar = (i) interfaceC40116e;
        BeduinVerticalContainerModel beduinVerticalContainerModel = this.f103255e;
        String f100853b = beduinVerticalContainerModel.getId();
        com.avito.android.beduin.common.container.vertical.a aVar = iVar.f103271b;
        aVar.setTag(f100853b);
        I.c(aVar, beduinVerticalContainerModel.getBackground(), O2.a(beduinVerticalContainerModel.getActions()));
        I.e(aVar, beduinVerticalContainerModel.getPadding());
        J.b(aVar, beduinVerticalContainerModel.getMargin());
        Integer maxWidth = beduinVerticalContainerModel.getMaxWidth();
        aVar.setMaxWidthInPx(maxWidth != null ? Integer.valueOf(y6.b(maxWidth.intValue())) : null);
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        HorizontalAlignment horizontalAlignment = beduinVerticalContainerModel.getHorizontalAlignment();
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.LEFT;
        }
        int i14 = C3099b.f103261a[horizontalAlignment.ordinal()];
        boolean z12 = true;
        if (i14 == 1) {
            i12 = 3;
        } else if (i14 == 2) {
            i12 = 5;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 1;
        }
        VerticalAlignment verticalAlignment = beduinVerticalContainerModel.getVerticalAlignment();
        if (verticalAlignment == null) {
            verticalAlignment = VerticalAlignment.TOP;
        }
        int i15 = C3099b.f103262b[verticalAlignment.ordinal()];
        if (i15 == 1) {
            i13 = 48;
        } else if (i15 == 2) {
            i13 = 80;
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 16;
        }
        LayoutMode layoutMode = beduinVerticalContainerModel.getLayoutMode();
        layoutParams.height = (layoutMode == null ? -1 : C3099b.f103263c[layoutMode.ordinal()]) != 1 ? -2 : -1;
        aVar.setGravity(i12 | i13);
        aVar.setLayoutParams(layoutParams);
        com.avito.android.beduin.common.container.componentsPool.e.c(iVar.f103272c, beduinVerticalContainerModel.getChildren(), new c(this, iVar), new d(this), 8);
        com.avito.android.beduin.common.component.j.a(aVar, beduinVerticalContainerModel.getActions(), this.f103256f);
        BeduinContainerBackground background = beduinVerticalContainerModel.getBackground();
        BeduinContainerBackground.Shadows shadows = background != null ? background.getShadows() : null;
        if ((shadows != null ? shadows.getUpperShadow() : null) == null) {
            if ((shadows != null ? shadows.getBottomShadow() : null) == null) {
                z12 = false;
            }
        }
        aVar.f181408c.h((shadows == null || (cornerRadius = shadows.getCornerRadius()) == null) ? 0.0f : y6.b(cornerRadius.intValue()), q(aVar.getContext(), shadows != null ? shadows.getUpperShadow() : null), q(aVar.getContext(), shadows != null ? shadows.getBottomShadow() : null), z12);
        aVar.requestLayout();
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
            com.avito.android.beduin.common.container.componentsPool.e.a(iVar.f103272c, bVar, new e(this, iVar));
        } else {
            m(iVar);
        }
    }
}
