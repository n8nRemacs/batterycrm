package Fc1;

import android.view.View;
import android.view.Window;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import javax.inject.Inject;

/* renamed from: Fc1.h6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogC13630h6 extends androidx.appcompat.app.A implements InterfaceC13706q1, V1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V1 f5559g;

    /* renamed from: Fc1.h6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5561m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12) {
            super(2);
            this.f5561m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5561m | 1);
            DialogC13630h6.this.f(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.h6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            DialogC13630h6.super.cancel();
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.h6$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            Window window = DialogC13630h6.this.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView != null) {
                decorView.setY(10000.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.h6$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            DialogC13630h6 dialogC13630h6 = DialogC13630h6.this;
            if (zBooleanValue) {
                Window window = dialogC13630h6.getWindow();
                View decorView = window != null ? window.getDecorView() : null;
                if (decorView != null) {
                    decorView.setY(0.0f);
                }
            } else if (!zBooleanValue) {
                C22096n c22096n = new C22096n(-109459186, new P6(dialogC13630h6), true);
                V1 v12 = dialogC13630h6.f5559g;
                dialogC13630h6.setContentView(v12.h(c22096n));
                v12.b(new C13676m7(dialogC13630h6));
                DialogC13630h6.super.show();
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public DialogC13630h6(@Y61.k L3 l32, @Y61.k V1 v12) {
        super(l32.b(), R.style.FeedbackPopupDialogStyle);
        this.f5559g = v12;
    }

    @Override // Fc1.V1
    @Y61.k
    public final InterfaceC13784z a() {
        return this.f5559g.a();
    }

    @Override // Fc1.V1
    @Y61.k
    public final InterfaceC13753v4 b() {
        return this.f5559g.b();
    }

    @Override // Fc1.V1
    public final void c(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5559g.c(aVar);
    }

    @Override // android.app.Dialog, android.content.DialogInterface, Fc1.InterfaceC13706q1
    public final void cancel() {
        this.f5559g.c(new b());
    }

    @Override // Fc1.V1
    @InterfaceC22132o
    public final void f(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1108645873);
        this.f5559g.f(bE2, 8);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12);
    }

    @Override // Fc1.V1
    @Y61.k
    @InterfaceC22137p
    public final View h(@Y61.k C22096n c22096n) {
        return this.f5559g.h(c22096n);
    }

    @Override // android.app.Dialog, Fc1.InterfaceC13706q1
    public final void hide() {
        this.f5559g.a(new c());
    }

    @Override // android.app.Dialog, Fc1.InterfaceC13706q1
    public final void show() {
        this.f5559g.a(new d());
    }

    @Override // Fc1.InterfaceC13706q1, Fc1.V1
    public final void a(int i12) {
        this.f5559g.a(i12);
    }

    @Override // Fc1.V1
    public final void b(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5559g.b(aVar);
    }

    @Override // Fc1.V1
    public final void a(@Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        this.f5559g.a(lVar);
    }

    @Override // Fc1.V1
    public final void a(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f5559g.a(aVar);
    }
}
