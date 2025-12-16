package com.avito.android.lib.design.modal;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y41.p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.modal.ModalState;
import com.avito.android.util.C35835l0;
import gw.InterfaceC40743a;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import j.f0;
import j.r;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Modal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a;", "Landroid/app/Dialog;", "a", "b", "c", "d", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends Dialog {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C5284a f179704d = new C5284a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f179705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public FrameLayout f179706c;

    /* compiled from: Modal.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/modal/a$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.modal.a$a, reason: collision with other inner class name */
    public static final class C5284a {

        /* compiled from: Modal.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.design.modal.a$a$a, reason: collision with other inner class name */
        public static final class C5285a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a f179707l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5285a(a aVar) {
                super(0);
                this.f179707l = aVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f179707l.dismiss();
                return G0.f406611a;
            }
        }

        /* compiled from: Modal.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.design.modal.a$a$b */
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a f179708l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar) {
                super(0);
                this.f179708l = aVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f179708l.dismiss();
                return G0.f406611a;
            }
        }

        public /* synthetic */ C5284a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.k
        public static a a(@Y61.k Context context, @InterfaceC42150f int i12, @f0 int i13, @Y61.k p pVar) {
            f fVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.n.f178955Z, i12, i13);
            String string = typedArrayObtainStyledAttributes.getString(21);
            if (string == null) {
                string = "";
            }
            String string2 = context.getString(R.string.modal_theme_name_re23);
            a aVar = new a(context, typedArrayObtainStyledAttributes.getResourceId(25, R.style.Modal_Default_Window));
            b bVar = new b(aVar);
            if (string.equals(string2)) {
                i iVar = new i(context, i12, i13);
                iVar.setDismissAction(bVar);
                fVar = iVar;
            } else {
                f fVar2 = new f(context, i12, i13);
                fVar2.setDismissAction(bVar);
                fVar = fVar2;
            }
            aVar.f179706c = fVar;
            aVar.setCancelable(false);
            aVar.setContentView(fVar, new ViewGroup.LayoutParams(-2, -2));
            pVar.invoke(new b(aVar, fVar), aVar);
            typedArrayObtainStyledAttributes.recycle();
            return aVar;
        }

        @Y61.k
        public static a b(@Y61.k Context context, @Y61.k com.avito.android.lib.design.modal.d dVar, @Y61.k p pVar) {
            i iVar = new i(context, 0, 0);
            a aVar = new a(context, dVar.f179721a);
            aVar.f179706c = iVar;
            aVar.setCancelable(false);
            aVar.setContentView(iVar, new ViewGroup.LayoutParams(-2, -2));
            iVar.setDismissAction(new C5285a(aVar));
            iVar.setStyle(dVar);
            pVar.invoke(new c(aVar, iVar), aVar);
            return aVar;
        }

        public static /* synthetic */ a c(C5284a c5284a, Context context, p pVar) {
            c5284a.getClass();
            return a(context, R.attr.modalView, R.style.Modal_Default, pVar);
        }

        public C5284a() {
        }
    }

    /* compiled from: Modal.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Lcom/avito/android/lib/design/modal/a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f179709b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f179710c;

        /* compiled from: Modal.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.design.modal.a$b$a, reason: collision with other inner class name */
        public static final class C5286a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ N f179711l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b f179712m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5286a(Y41.a<G0> aVar, b bVar) {
                super(0);
                this.f179711l = (N) aVar;
                this.f179712m = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // Y41.a
            public final G0 invoke() {
                this.f179711l.invoke();
                this.f179712m.f179709b.dismiss();
                return G0.f406611a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k a aVar, @Y61.k d dVar) {
            this.f179709b = aVar;
            this.f179710c = (FrameLayout) dVar;
            dVar.setOnCloseClicked(new com.avito.android.lib.design.modal.b(this));
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void F3(@f0 int i12, @Y61.k Y41.a aVar, @Y61.k String str) {
            this.f179710c.F3(R.style.Legacy_Button_DangerLarge, aVar, str);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void G3() {
            this.f179710c.G3();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void H3(@Y61.k Y41.a<G0> aVar) {
            this.f179710c.H3(aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void I3(@Y61.k Y41.a aVar) {
            this.f179710c.I3(aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void J3() {
            this.f179710c.J3();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void K3(@Y61.k Y41.l<? super InterfaceC40743a, G0> lVar) {
            this.f179710c.K3(lVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void L3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
            this.f179710c.L3(str, aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void M3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
            this.f179710c.M3(str, aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void N3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
            this.f179710c.N3(str, aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void O3(int i12, @Y61.k Y41.a<G0> aVar) {
            this.f179710c.O3(i12, aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void P3(@Y61.k Y41.a<G0> aVar) {
            this.f179710c.P3(aVar);
            a aVar2 = this.f179709b;
            aVar2.setCancelable(true);
            aVar2.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(10, aVar));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void Q3(@Y61.k String str, @Y61.k View.OnClickListener onClickListener) {
            this.f179710c.Q3(str, onClickListener);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void R3(@Y61.k String str, @Y61.k com.avito.android.order.feature.c cVar) {
            this.f179710c.R3(str, cVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void S3(@r int i12, @r int i13) {
            this.f179710c.S3(i12, i13);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void T3(int i12, @Y61.k Y41.a<G0> aVar) {
            this.f179710c.T3(i12, aVar);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        public final void a(@Y61.k Y41.a<G0> aVar) {
            this.f179710c.setOnCloseClicked(new C5286a(aVar, this));
        }

        public final void b(@Y61.k Y41.l<? super DialogInterface, G0> lVar) {
            this.f179709b.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(lVar));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        @Y61.k
        public final View getTouchOutsideView() {
            return this.f179710c.getTouchOutsideView();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setButtonsOrientation(int i12) {
            this.f179710c.setButtonsOrientation(i12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setCancelable(boolean z12) {
            this.f179710c.setCancelable(z12);
            this.f179709b.setCancelable(z12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setCloseButtonVisible(boolean z12) {
            this.f179710c.setCloseButtonVisible(z12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setCustomView(@Y61.k View view) {
            this.f179710c.setCustomView(view);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setImage(@InterfaceC42165v int i12) {
            this.f179710c.setImage(i12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setOnCloseClicked(@Y61.k Y41.a<G0> aVar) {
            this.f179710c.setOnCloseClicked(aVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setSubtitle(@e0 int i12) {
            this.f179710c.setSubtitle(i12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setTitle(@e0 int i12) {
            this.f179710c.setTitle(i12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setImage(@Y61.l Drawable drawable) {
            this.f179710c.setImage(drawable);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setSubtitle(@Y61.l CharSequence charSequence) {
            this.f179710c.setSubtitle(charSequence);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
        @Override // com.avito.android.lib.design.modal.a.d
        public final void setTitle(@Y61.l String str) {
            this.f179710c.setTitle(str);
        }
    }

    /* compiled from: Modal.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/modal/a$c;", "LLV/a;", "Lcom/avito/android/lib/design/modal/ModalState;", "Lcom/avito/android/lib/design/modal/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements LV.a<ModalState, com.avito.android.lib.design.modal.d> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f179713b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final i f179714c;

        /* compiled from: Modal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.modal.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C5287a {
            static {
                int[] iArr = new int[ModalState.State.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ModalState.State state = ModalState.State.f179697b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* compiled from: Modal.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ModalState f179715l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c f179716m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ModalState modalState, c cVar) {
                super(0);
                this.f179715l = modalState;
                this.f179716m = cVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                Y41.a<G0> aVar = this.f179715l.f179690e;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f179716m.f179713b.dismiss();
                return G0.f406611a;
            }
        }

        public c(@Y61.k a aVar, @Y61.k i iVar) {
            this.f179713b = aVar;
            this.f179714c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@Y61.k com.avito.android.lib.design.modal.ModalState r9) {
            /*
                r8 = this;
                com.avito.android.lib.design.modal.i r0 = r8.f179714c
                com.avito.android.lib.design.modal.ModalState r1 = r0.getState$_design_modules_components()
                com.avito.android.lib.util.c r2 = new com.avito.android.lib.util.c
                r2.<init>(r9, r1)
                boolean r2 = r2.f181333c
                if (r2 != 0) goto L99
                com.avito.android.lib.design.modal.ModalState r2 = r0.getState$_design_modules_components()
                r3 = 0
                if (r2 == 0) goto L24
                if (r1 == 0) goto L1b
                Y41.a<kotlin.G0> r2 = r1.f179690e
                goto L1c
            L1b:
                r2 = r3
            L1c:
                Y41.a<kotlin.G0> r4 = r9.f179690e
                boolean r2 = kotlin.jvm.internal.L.f(r4, r2)
                if (r2 != 0) goto L2c
            L24:
                com.avito.android.lib.design.modal.a$c$b r2 = new com.avito.android.lib.design.modal.a$c$b
                r2.<init>(r9, r8)
                r0.setOnCloseClicked(r2)
            L2c:
                if (r1 == 0) goto L31
                com.avito.android.lib.design.modal.ModalState$State r2 = r1.f179694i
                goto L32
            L31:
                r2 = r3
            L32:
                com.avito.android.lib.util.c r4 = new com.avito.android.lib.util.c
                com.avito.android.lib.design.modal.ModalState$State r5 = r9.f179694i
                r4.<init>(r5, r2)
                com.avito.android.lib.design.modal.a r2 = r8.f179713b
                boolean r4 = r4.f181333c
                if (r4 != 0) goto L52
                if (r5 == 0) goto L52
                int r4 = r5.ordinal()
                if (r4 == 0) goto L4f
                r5 = 1
                if (r4 == r5) goto L4b
                goto L52
            L4b:
                r2.dismiss()
                goto L52
            L4f:
                com.avito.android.lib.util.g.a(r2)
            L52:
                boolean r4 = r9.f179695j
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                if (r1 == 0) goto L61
                boolean r6 = r1.f179695j
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                goto L62
            L61:
                r6 = r3
            L62:
                com.avito.android.lib.util.c r7 = new com.avito.android.lib.util.c
                r7.<init>(r5, r6)
                boolean r5 = r7.f181333c
                if (r5 != 0) goto L6e
                r2.setCancelable(r4)
            L6e:
                if (r1 == 0) goto L73
                Y41.a<kotlin.G0> r1 = r1.f179696k
                goto L74
            L73:
                r1 = r3
            L74:
                com.avito.android.lib.util.c r4 = new com.avito.android.lib.util.c
                Y41.a<kotlin.G0> r5 = r9.f179696k
                r4.<init>(r5, r1)
                boolean r1 = r4.f181333c
                if (r1 != 0) goto L96
                Y41.a r5 = (Y41.a) r5
                if (r5 == 0) goto L90
                com.avito.android.inline_filters.dialog.calendar.b r1 = new com.avito.android.inline_filters.dialog.calendar.b
                r4 = 11
                r1.<init>(r4, r5)
                r2.setOnCancelListener(r1)
                kotlin.G0 r1 = kotlin.G0.f406611a
                goto L91
            L90:
                r1 = r3
            L91:
                if (r1 != 0) goto L96
                r2.setOnCancelListener(r3)
            L96:
                r0.setState(r9)
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.modal.a.c.a(com.avito.android.lib.design.modal.ModalState):void");
        }
    }

    /* compiled from: Modal.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/a$d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: Modal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.modal.a$d$a, reason: collision with other inner class name */
        public static final class C5288a {
        }

        void F3(@f0 int i12, @Y61.k Y41.a aVar, @Y61.k String str);

        void G3();

        void H3(@Y61.k Y41.a<G0> aVar);

        void I3(@Y61.k Y41.a aVar);

        void J3();

        void K3(@Y61.k Y41.l<? super InterfaceC40743a, G0> lVar);

        void L3(@Y61.k String str, @Y61.k Y41.a<G0> aVar);

        void M3(@Y61.k String str, @Y61.k Y41.a<G0> aVar);

        void N3(@Y61.k String str, @Y61.k Y41.a<G0> aVar);

        void O3(int i12, @Y61.k Y41.a<G0> aVar);

        void P3(@Y61.k Y41.a<G0> aVar);

        void Q3(@Y61.k String str, @Y61.k View.OnClickListener onClickListener);

        void R3(@Y61.k String str, @Y61.k com.avito.android.order.feature.c cVar);

        void S3(@r int i12, @r int i13);

        void T3(int i12, @Y61.k Y41.a<G0> aVar);

        @Y61.k
        View getTouchOutsideView();

        void setButtonsOrientation(int i12);

        void setCancelable(boolean z12);

        void setCloseButtonVisible(boolean z12);

        void setCustomView(@Y61.k View view);

        void setImage(@InterfaceC42165v int i12);

        void setImage(@Y61.l Drawable drawable);

        void setOnCloseClicked(@Y61.k Y41.a<G0> aVar);

        void setSubtitle(@e0 int i12);

        void setSubtitle(@Y61.l CharSequence charSequence);

        void setTitle(@e0 int i12);

        void setTitle(@Y61.l String str);
    }

    /* compiled from: Modal.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Long> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() throws Resources.NotFoundException {
            long duration;
            C5284a c5284a = a.f179704d;
            a aVar = a.this;
            TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(C35835l0.j(android.R.attr.windowAnimationStyle, aVar.getContext()), new int[]{android.R.attr.windowEnterAnimation});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            if (resourceId == 0) {
                duration = 0;
            } else {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(aVar.getContext(), resourceId);
                typedArrayObtainStyledAttributes.recycle();
                duration = animationLoadAnimation.getDuration();
            }
            return Long.valueOf(duration);
        }
    }

    public /* synthetic */ a(Context context, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? R.style.Modal_Default_Window : i12);
    }

    public a(@Y61.k Context context, @f0 int i12) {
        super(context, i12);
        this.f179705b = C42727D.c(new e());
    }
}
