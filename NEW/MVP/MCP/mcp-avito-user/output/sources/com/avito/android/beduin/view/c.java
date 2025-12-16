package com.avito.android.beduin.view;

import Ba1.F;
import Ui.InterfaceC15523b;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.deeplink_processor.e;
import com.avito.android.beduin.common.form.actionbus.d;
import com.avito.android.beduin.view.recyclerview.f;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.context.PresentationStyle;
import gj.InterfaceC40691b;
import gj.i;
import gj.j;
import gj.k;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/view/c;", "Lgj/k;", "LUi/b;", "Lcom/avito/android/beduin_models/BeduinAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements k, InterfaceC15523b<BeduinAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f105183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f105184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f105185c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final gj.l f105186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final f f105187e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC40691b f105188f;

    /* compiled from: BeduinViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PresentationStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PresentationStyle presentationStyle = PresentationStyle.f105307b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PresentationStyle presentationStyle2 = PresentationStyle.f105307b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: BeduinViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((i) this.receiver).t0();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.view.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C3141c extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((i) this.receiver).t0();
            return G0.f406611a;
        }
    }

    public c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k ActivityC22955m activityC22955m, @Y61.k i iVar, @l gj.l lVar) {
        this.f105183a = interfaceC22983P;
        this.f105184b = activityC22955m;
        this.f105185c = iVar;
        this.f105186d = lVar;
        this.f105187e = new f(activityC22955m, iVar, lVar);
    }

    @Override // gj.k
    public final void l(@Y61.k InterfaceC40691b interfaceC40691b) {
        PresentationStyle presentationStyle;
        this.f105188f = interfaceC40691b;
        e eVarP = interfaceC40691b.getF103574t();
        j jVarA = interfaceC40691b.a();
        InterfaceC22983P interfaceC22983P = this.f105183a;
        ActivityC22955m activityC22955m = this.f105184b;
        jVarA.a(interfaceC40691b, this.f105186d, this.f105185c, interfaceC22983P, activityC22955m);
        gj.l lVar = this.f105186d;
        if (lVar == null || (presentationStyle = lVar.f396759c) == null) {
            presentationStyle = PresentationStyle.f105307b;
        }
        int iOrdinal = presentationStyle.ordinal();
        i iVar = this.f105185c;
        if (iOrdinal == 0) {
            F f12 = new F(activityC22955m, new b(0, iVar, i.class, "onClose", "onClose()V", 0));
            eVarP.getF103281K().observeForever(f12);
            interfaceC22983P.getLifecycle().a(new com.avito.android.beduin.common.deeplink_processor.a(eVarP, f12));
        } else if (iOrdinal == 1) {
            F f13 = new F(activityC22955m, new C3141c(0, iVar, i.class, "onClose", "onClose()V", 0));
            eVarP.getF103281K().observeForever(f13);
            activityC22955m.getLifecycle().a(new com.avito.android.beduin.common.deeplink_processor.a(eVarP, f13));
        }
        interfaceC40691b.getF103567m().a(activityC22955m);
        interfaceC40691b.getF103568n().a(activityC22955m);
        interfaceC22983P.getLifecycle().a(new d(interfaceC40691b.getF103564j()));
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        f fVar = this.f105187e;
        fVar.f105209d = interfaceC40691b;
        lifecycle.a(new com.avito.android.beduin.view.recyclerview.e(new l0.h(), interfaceC40691b.k(), fVar));
        if (lVar != null ? lVar.f396758b : false) {
            return;
        }
        interfaceC40691b.getF103569o().b(interfaceC22983P.getLifecycle());
        interfaceC40691b.getF103570p().b(interfaceC22983P.getLifecycle());
        Iterator<T> it = interfaceC40691b.getF103565k().getAll().iterator();
        while (it.hasNext()) {
            ((InterfaceC43779a) it.next()).h(d.f.f414161a);
        }
    }

    @Override // Ui.InterfaceC15523b
    public final void o(@Y61.k BeduinAction beduinAction) {
        InterfaceC40691b interfaceC40691b = this.f105188f;
        if (interfaceC40691b != null) {
            interfaceC40691b.o(beduinAction);
        }
    }
}
