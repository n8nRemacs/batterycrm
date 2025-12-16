package com.avito.android.lib.design.chips.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.chips.x;
import com.avito.android.lib.design.chips.y;
import com.avito.android.lib.design.d;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.p6;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Chips.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0003!\"#B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/Chips;", "Landroidx/recyclerview/widget/RecyclerView;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/chips/state/ChipsState;", "Lcom/avito/android/lib/design/chips/ui/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "newState", "setState", "(Lcom/avito/android/lib/design/chips/state/ChipsState;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/chips/ui/g;)V", "", "Lcom/avito/android/lib/design/chips/h;", "newData", "setData", "(Ljava/util/List;)V", "getStyle", "()Lcom/avito/android/lib/design/chips/ui/g;", "getState", "()Lcom/avito/android/lib/design/chips/state/ChipsState;", VoiceInfo.STATE, "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Chips extends RecyclerView implements InterfaceC46971a, LV.a<ChipsState, g> {

    /* renamed from: K0, reason: collision with root package name */
    public static final /* synthetic */ int f178782K0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public y f178783F0;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public x f178784G0;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public g f178785H0;

    /* renamed from: I0, reason: collision with root package name */
    @l
    public ChipsState f178786I0;

    /* renamed from: J0, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.chips.ui.d f178787J0;

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/Chips$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/Chips$b;", "", "<init>", "()V", "", "CHIPS_MAX_SELECTED_NOT_SPECIFIED", "I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/Chips$c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends RecyclerView.r {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            if (i12 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int iK1 = ((LinearLayoutManager) layoutManager).K1();
                    if (iK1 == -1) {
                        iK1 = 0;
                    }
                    Y41.l<Integer, G0> lVar = Chips.this.getF178786I0().f178753c;
                    if (lVar != null) {
                        lVar.invoke(Integer.valueOf(iK1));
                    }
                }
            }
        }
    }

    /* compiled from: Chips.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[ChipsState.DisplayType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChipsState.DisplayType displayType = ChipsState.DisplayType.f178756b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ChipsState.DisplayType displayType2 = ChipsState.DisplayType.f178756b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChipsState.DisplayType displayType3 = ChipsState.DisplayType.f178756b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new b(null);
    }

    public Chips(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipsMedium);
        this.f178787J0 = new com.avito.android.lib.design.chips.ui.d(this);
        setClipToPadding(false);
        setClipChildren(false);
        o(new c());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.n.f179004y, R.attr.chipsMedium, 0);
        g.f178794f.getClass();
        setStyle(g.b.d(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean M0(RecyclerView recyclerView) {
        p6 p6Var = new p6(recyclerView);
        while (p6Var.hasNext()) {
            View viewFindViewById = ((View) p6Var.next()).findViewById(R.id.chip_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            if (((Button) viewFindViewById).d()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getState, reason: from getter */
    public final ChipsState getF178786I0() {
        return this.f178786I0;
    }

    /* renamed from: getStyle, reason: from getter */
    private final g getF178785H0() {
        return this.f178785H0;
    }

    private final void setData(List<? extends h> newData) {
        ((f) getAdapter()).l(new ArrayList(newData));
    }

    public final void N0(@k h hVar) {
        Iterator it = ((f) getAdapter()).f178730i.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (hVar.V1(it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            A0(i12);
        }
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.lib.design.chips.state.ChipsState r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.chips.ui.Chips.setState(com.avito.android.lib.design.chips.state.ChipsState):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.chips.ui.g r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            com.avito.android.lib.design.chips.ui.g r9 = r7.f178785H0
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            r0.<init>(r8, r9)
            boolean r0 = r0.f181333c
            if (r0 != 0) goto Lc7
            r7.f178785H0 = r8
            r10 = 0
            if (r9 == 0) goto L17
            com.avito.android.lib.design.chips.ui.g$a r0 = r9.f178798d
            goto L18
        L17:
            r0 = r10
        L18:
            com.avito.android.lib.design.chips.ui.g$a r1 = r8.f178798d
            boolean r0 = kotlin.jvm.internal.L.f(r1, r0)
            if (r0 == 0) goto L3c
            if (r9 == 0) goto L25
            com.avito.android.lib.design.chips.ui.g$a r0 = r9.f178797c
            goto L26
        L25:
            r0 = r10
        L26:
            com.avito.android.lib.design.chips.ui.g$a r1 = r8.f178797c
            boolean r0 = kotlin.jvm.internal.L.f(r1, r0)
            if (r0 == 0) goto L3c
            if (r9 == 0) goto L33
            com.avito.android.lib.design.chips.ui.g$a r0 = r9.f178799e
            goto L34
        L33:
            r0 = r10
        L34:
            com.avito.android.lib.design.chips.ui.g$a r1 = r8.f178799e
            boolean r0 = kotlin.jvm.internal.L.f(r1, r0)
            if (r0 != 0) goto L91
        L3c:
            com.avito.android.lib.design.chips.SelectStrategy r12 = com.avito.android.lib.design.chips.SelectStrategy.f178717c
            com.avito.android.lib.design.chips.ui.a r14 = new com.avito.android.lib.design.chips.ui.a
            java.lang.String r5 = "onSelected(IZ)V"
            r6 = 0
            r1 = 2
            java.lang.Class<com.avito.android.lib.design.chips.ui.Chips> r3 = com.avito.android.lib.design.chips.ui.Chips.class
            java.lang.String r4 = "onSelected"
            r0 = r14
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.avito.android.lib.design.chips.ui.b r15 = new com.avito.android.lib.design.chips.ui.b
            java.lang.String r5 = "onUnSelected(IZ)V"
            r6 = 0
            r1 = 2
            java.lang.Class<com.avito.android.lib.design.chips.ui.Chips> r3 = com.avito.android.lib.design.chips.ui.Chips.class
            java.lang.String r4 = "onUnSelected"
            r0 = r15
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.avito.android.lib.design.chips.w r0 = new com.avito.android.lib.design.chips.w
            com.avito.android.lib.design.chips.ui.c r17 = com.avito.android.lib.design.chips.ui.c.f178789l
            r21 = 336(0x150, float:4.71E-43)
            r22 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = -1
            r20 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.avito.android.lib.design.chips.ui.g r1 = r23.getF178785H0()
            com.avito.android.lib.design.chips.ui.f r2 = new com.avito.android.lib.design.chips.ui.f
            r2.<init>(r0, r1)
            com.avito.android.lib.design.chips.state.ChipsState r0 = r7.f178786I0
            if (r0 == 0) goto L8e
            java.util.List<com.avito.android.lib.design.chips.h> r0 = r0.f178754d
            if (r0 == 0) goto L8e
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.l(r1)
        L8e:
            r7.setAdapter(r2)
        L91:
            int r0 = r8.f178795a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r9 == 0) goto La0
            int r1 = r9.f178795a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto La1
        La0:
            r1 = r10
        La1:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbb
            int r0 = r8.f178796b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r9 == 0) goto Lb5
            int r1 = r9.f178796b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        Lb5:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto Lc7
        Lbb:
            com.avito.android.lib.design.chips.state.ChipsState r0 = r7.f178786I0
            if (r0 == 0) goto Lc7
            com.avito.android.lib.design.chips.ui.e r0 = new com.avito.android.lib.design.chips.ui.e
            r0.<init>(r7, r7)
            r7.addOnLayoutChangeListener(r0)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.chips.ui.Chips.setStyle(com.avito.android.lib.design.chips.ui.g):void");
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
    }
}
