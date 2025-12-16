package com.avito.beduin.v2.render.android_view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.logger.LogLevel;
import dU0.InterfaceC39628a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/BeduinView;", "Landroid/widget/FrameLayout;", "", "enabled", "Lkotlin/G0;", "setHighlight", "(Z)V", "Landroid/os/Bundle;", "getBeduinInstanceState", "()Landroid/os/Bundle;", "Lcom/avito/beduin/v2/render/android_view/x;", "e", "Lkotlin/C;", "getChild", "()Lcom/avito/beduin/v2/render/android_view/x;", "child", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BeduinView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public E f337912b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public A f337913c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f337914d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C child;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.D f337916f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final B f337917g;

    /* compiled from: BeduinView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/BeduinView$a;", "", "<init>", "()V", "", "BEDUIN_VIEW_STATE_KEY", "Ljava/lang/String;", "SUPER_STATE_KEY", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/component/i;", "component", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/component/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC36249i, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC36249i interfaceC36249i) {
            BeduinView.a(BeduinView.this, interfaceC36249i);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @X41.j
    public BeduinView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static final void a(BeduinView beduinView, InterfaceC36249i interfaceC36249i) {
        View viewA = null;
        if (interfaceC36249i != null) {
            x child = beduinView.getChild();
            com.avito.beduin.v2.theme.k kVar = beduinView.f337914d;
            if (kVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            A a12 = beduinView.f337913c;
            C36336f c36336f = a12 != null ? a12.f337907c : null;
            if (c36336f == null) {
                throw new IllegalStateException("Required value was null.");
            }
            B b12 = beduinView.f337917g;
            Bundle bundle = b12.f337911a;
            b12.f337911a = null;
            viewA = child.a(beduinView, kVar, interfaceC36249i, c36336f, bundle, null);
        }
        FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = beduinView.generateDefaultLayoutParams();
        if (beduinView.getChildCount() > 0) {
            if (kotlin.jvm.internal.L.f(beduinView.getChildAt(0), viewA)) {
                return;
            } else {
                beduinView.removeViewAt(0);
            }
        }
        if (viewA != null) {
            beduinView.addView(viewA, 0, layoutParamsGenerateDefaultLayoutParams);
        }
    }

    private final x getChild() {
        return (x) this.child.getValue();
    }

    public final void b(@Y61.k com.avito.beduin.v2.engine.D d12) {
        this.f337916f = d12;
        E e12 = this.f337912b;
        if (e12 != null) {
            e12.a();
        }
        this.f337912b = new E(this, new C36337g(new b(), d12, this));
    }

    public final void c(@Y61.k InterfaceC39628a interfaceC39628a) {
        y yVar;
        A a12 = this.f337913c;
        if (a12 == null || (yVar = (y) a12.f337907c.f337991a.f337998a.get(interfaceC39628a.getF337716c())) == null) {
            return;
        }
        yVar.a(interfaceC39628a);
    }

    @Y61.k
    public final Bundle getBeduinInstanceState() {
        if (this.f337913c == null) {
            return new Bundle();
        }
        Bundle bundleB = getChild().b();
        if (bundleB == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle(1);
        bundle.putBundle("beduin_view_children_state", bundleB);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.l Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        Parcelable parcelable2 = bundle != null ? bundle.getParcelable("beduin_view_super_state") : null;
        if (bundle != null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":BeduinView", "Set restored state for BeduinView");
            }
            this.f337917g.f337911a = bundle.getBundle("beduin_view_children_state");
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    @Y61.k
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle beduinInstanceState = getBeduinInstanceState();
        beduinInstanceState.putParcelable("beduin_view_super_state", parcelableOnSaveInstanceState);
        return beduinInstanceState;
    }

    public final void setHighlight(boolean enabled) {
        setForeground(enabled ? new ColorDrawable(Color.argb(100, 255, 0, 0)) : null);
    }

    public BeduinView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.child = C42727D.c(new C36334d(this));
        this.f337917g = new B(null, 1, null);
    }
}
