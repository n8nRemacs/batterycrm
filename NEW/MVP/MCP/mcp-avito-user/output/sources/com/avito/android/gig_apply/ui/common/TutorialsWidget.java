package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AbstractC22450a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TutorialsWidget.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/TutorialsWidget;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/gig_apply/ui/common/C;", "<set-?>", "j", "Landroidx/compose/runtime/y1;", "getState", "()Lcom/avito/android/gig_apply/ui/common/C;", "setState", "(Lcom/avito/android/gig_apply/ui/common/C;)V", VoiceInfo.STATE, "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TutorialsWidget extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 state;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public N f159917k;

    /* compiled from: TutorialsWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                TutorialsWidget tutorialsWidget = TutorialsWidget.this;
                z.a(tutorialsWidget.getState(), tutorialsWidget.f159917k, a13, 8);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TutorialsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            TutorialsWidget.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: TutorialsWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f159920l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ TutorialsWidget(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C getState() {
        return (C) ((C22082i3) this.state).getF42167b();
    }

    private final void setState(C c12) {
        ((C22082i3) this.state).setValue(c12);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1517152619);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-517077584, new a(), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(@Y61.k C c12, @Y61.k Y41.a<G0> aVar) {
        setState(c12);
        this.f159917k = (N) aVar;
    }

    @X41.j
    public TutorialsWidget(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.state = C22126m3.g(new C(null, null, null, 7, null));
        this.f159917k = c.f159920l;
    }
}
