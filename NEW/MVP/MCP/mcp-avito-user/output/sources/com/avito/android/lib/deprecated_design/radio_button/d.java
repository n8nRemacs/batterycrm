package com.avito.android.lib.deprecated_design.radio_button;

import L91.q;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.imv_similiar_adverts.h;
import com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView;
import com.avito.android.util.A6;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RadioButton.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/radio_button/d;", "Lcom/avito/android/lib/deprecated_design/radio_button/b;", "LMU/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class d implements com.avito.android.lib.deprecated_design.radio_button.b, MU.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f178077a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f178078b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f178079c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RadioButton f178080d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f178081e;

    /* renamed from: f, reason: collision with root package name */
    public int f178082f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.radio_button.a f178083g;

    /* compiled from: RadioButton.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<ViewTreeObserver, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ViewTreeObserver viewTreeObserver) {
            viewTreeObserver.addOnGlobalLayoutListener(d.this.f178083g);
            return G0.f406611a;
        }
    }

    /* compiled from: RadioButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.b();
            return G0.f406611a;
        }
    }

    public d(@k View view) {
        this.f178077a = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178078b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178079c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.radio_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
        }
        RadioButton radioButton = (RadioButton) viewFindViewById3;
        this.f178080d = radioButton;
        View viewFindViewById4 = view.findViewById(R.id.container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f178081e = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f178083g = new com.avito.android.lib.deprecated_design.radio_button.a();
        View viewFindViewById6 = view.findViewById(R.id.lifecycle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView");
        }
        LifecycleView lifecycleView = (LifecycleView) viewFindViewById6;
        lifecycleView.setAttachListener(this);
        view.setOnClickListener(new h(this, 14));
        radioButton.setOnClickListener(new q(6));
        b();
        A6.a(view.getViewTreeObserver(), new a());
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (lifecycleView.isAttachedToWindow()) {
            h2();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.radio_button.b
    public final void a(@Y61.l p<? super com.avito.android.lib.deprecated_design.radio_button.b, ? super Boolean, G0> pVar) {
        this.f178080d.setOnCheckedChangeListener(new c(pVar, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            android.widget.RadioButton r0 = r5.f178080d
            int r1 = r0.getHeight()
            r2 = 1
            if (r1 == 0) goto L20
            android.view.View r1 = r5.f178081e
            int r3 = r1.getHeight()
            if (r3 != 0) goto L12
            goto L20
        L12:
            int r1 = r1.getHeight()
            int r3 = r0.getHeight()
            if (r1 <= r3) goto L1e
            r1 = r2
            goto L21
        L1e:
            r1 = 2
            goto L21
        L20:
            r1 = 0
        L21:
            int r3 = r5.f178082f
            if (r1 == r3) goto L71
            r5.f178082f = r1
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            android.view.View r4 = r5.f178077a
            if (r1 != r2) goto L50
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131167738(0x7f0709fa, float:1.7949758E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.topMargin = r1
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131167737(0x7f0709f9, float:1.7949756E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.bottomMargin = r1
            r1 = 48
            r3.gravity = r1
            goto L6e
        L50:
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131167736(0x7f0709f8, float:1.7949754E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.topMargin = r1
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131167735(0x7f0709f7, float:1.7949752E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.bottomMargin = r1
            r1 = 16
            r3.gravity = r1
        L6e:
            r0.requestLayout()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.deprecated_design.radio_button.d.b():void");
    }

    @Override // com.avito.android.lib.deprecated_design.radio_button.b
    public final void f(@Y61.l String str) {
        I5.a(this.f178079c, str, false);
    }

    @Override // MU.a
    public final void f2() {
        this.f178083g.f178073b = null;
    }

    @Override // MU.a
    public final void h2() {
        this.f178083g.f178073b = new b();
    }

    @Override // com.avito.android.lib.deprecated_design.radio_button.b
    public final void setChecked(boolean z12) {
        this.f178080d.setChecked(z12);
    }

    @Override // com.avito.android.lib.deprecated_design.radio_button.b
    public final void setTitle(@k String str) {
        this.f178078b.setText(str);
    }
}
