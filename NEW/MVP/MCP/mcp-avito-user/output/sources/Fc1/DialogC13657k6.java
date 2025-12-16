package Fc1;

import Fc1.E3;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* renamed from: Fc1.k6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogC13657k6 extends com.google.android.material.bottomsheet.h implements InterfaceC13706q1, V1, U6 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f5629t = 0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final V1 f5630q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U6 f5631r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5632s;

    /* renamed from: Fc1.k6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5634m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12) {
            super(2);
            this.f5634m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5634m | 1);
            DialogC13657k6.this.f(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.k6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<FrameLayout> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final FrameLayout invoke() {
            return (FrameLayout) DialogC13657k6.this.findViewById(R.id.design_bottom_sheet);
        }
    }

    /* renamed from: Fc1.k6$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            DialogC13657k6.super.cancel();
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.k6$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f5638m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MotionEvent motionEvent) {
            super(0);
            this.f5638m = motionEvent;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(DialogC13657k6.super.dispatchTouchEvent(this.f5638m));
        }
    }

    /* renamed from: Fc1.k6$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorS = DialogC13657k6.this.s();
            bottomSheetBehaviorS.f355973J = false;
            bottomSheetBehaviorS.b(4);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.k6$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            DialogC13657k6 dialogC13657k6 = DialogC13657k6.this;
            if (zBooleanValue) {
                BottomSheetBehavior<FrameLayout> bottomSheetBehaviorS = dialogC13657k6.s();
                bottomSheetBehaviorS.f355973J = true;
                bottomSheetBehaviorS.b(3);
            } else if (!zBooleanValue) {
                C22096n c22096n = new C22096n(1589971684, new T6(dialogC13657k6), true);
                V1 v12 = dialogC13657k6.f5630q;
                dialogC13657k6.setContentView(v12.h(c22096n));
                v12.b(new C13712q7(dialogC13657k6));
                DialogC13657k6.super.show();
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public DialogC13657k6(@Y61.k L3 l32, @Y61.k V1 v12, @Y61.k U6 u62) {
        super(l32.b(), com.avito.android.R.style.FeedbackBottomSheetDialogStyle);
        this.f5630q = v12;
        this.f5631r = u62;
        this.f5632s = C42727D.c(new b());
    }

    @Override // Fc1.V1
    @Y61.k
    public final InterfaceC13784z a() {
        return this.f5630q.a();
    }

    @Override // Fc1.V1
    @Y61.k
    public final InterfaceC13753v4 b() {
        return this.f5630q.b();
    }

    @Override // Fc1.V1
    public final void c(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5630q.c(aVar);
    }

    @Override // com.google.android.material.bottomsheet.h, android.app.Dialog, android.content.DialogInterface, Fc1.InterfaceC13706q1
    public final void cancel() {
        this.f5630q.c(new c());
    }

    @Override // Fc1.U6
    public final boolean d(boolean z12, @Y61.k MotionEvent motionEvent, @Y61.k E3.a aVar) {
        return this.f5631r.d(z12, motionEvent, aVar);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
        return this.f5631r.j(motionEvent, new d(motionEvent));
    }

    @Override // Fc1.U6
    public final void e(@Y61.l FrameLayout frameLayout) {
        this.f5631r.e(frameLayout);
    }

    @Override // Fc1.V1
    @InterfaceC22132o
    public final void f(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(2116658469);
        this.f5630q.f(bE2, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12);
    }

    @Override // Fc1.U6
    public final void g(@Y61.l kotlin.Q<l0.g, androidx.compose.ui.unit.u> q12) {
        this.f5631r.g(q12);
    }

    @Override // Fc1.V1
    @Y61.k
    @InterfaceC22137p
    public final View h(@Y61.k C22096n c22096n) {
        return this.f5630q.h(c22096n);
    }

    @Override // android.app.Dialog, Fc1.InterfaceC13706q1
    public final void hide() {
        this.f5630q.a(new e());
    }

    @Override // Fc1.U6
    public final void i(@Y61.l Window window) {
        this.f5631r.i(window);
    }

    @Override // Fc1.U6
    public final boolean j(@Y61.k MotionEvent motionEvent, @Y61.k d dVar) {
        return this.f5631r.j(motionEvent, dVar);
    }

    @Override // com.google.android.material.bottomsheet.h, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        I0.a(this);
        setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(this, 0));
        FrameLayout frameLayout = (FrameLayout) this.f5632s.getValue();
        U6 u62 = this.f5631r;
        u62.e(frameLayout);
        u62.i(getWindow());
    }

    @Override // android.app.Dialog, Fc1.InterfaceC13706q1
    public final void show() {
        this.f5630q.a(new f());
    }

    @Override // Fc1.InterfaceC13706q1, Fc1.V1
    public final void a(int i12) {
        this.f5630q.a(i12);
    }

    @Override // Fc1.V1
    public final void b(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5630q.b(aVar);
    }

    @Override // Fc1.V1
    public final void a(@Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        this.f5630q.a(lVar);
    }

    @Override // Fc1.V1
    public final void a(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5630q.a(aVar);
    }
}
