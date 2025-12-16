package com.avito.android.beduin.common.component.pixel;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.action.BeduinPixelAction;
import com.avito.android.beduin.common.action.BeduinPixelActionScreenPosition;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: BeduinPixelComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/pixel/BeduinPixelModel;", "Lcom/avito/android/beduin/common/component/pixel/f;", "Lcom/avito/android/beduin_shared/common/component/adapter/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinPixelModel, f> implements com.avito.android.beduin_shared.common.component.adapter.g {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102100e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinPixelModel f102101f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f102102g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f102103h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f102104i;

    /* compiled from: BeduinPixelComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.pixel.a$a, reason: collision with other inner class name */
    public static final class C3057a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102105a = Collections.singletonList("pixel");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102106b = BeduinPixelModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102106b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102105a;
        }
    }

    /* compiled from: BeduinPixelComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WeakReference<f> f102107b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f102108c;

        public b(WeakReference<f> weakReference, a aVar) {
            this.f102107b = weakReference;
            this.f102108c = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            f fVar = this.f102107b.get();
            if (fVar == null || !fVar.isAttachedToWindow()) {
                return;
            }
            this.f102108c.v(fVar, false);
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinPixelModel beduinPixelModel, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f102100e = interfaceC15523b;
        this.f102101f = beduinPixelModel;
        this.f102102g = interfaceC35745a5;
        List<PixelActionModel> actions = beduinPixelModel.getActions();
        Object obj = null;
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((PixelActionModel) next).getScreenPosition() != null) {
                    obj = next;
                    break;
                }
            }
            obj = (PixelActionModel) obj;
        }
        this.f102103h = obj != null;
        this.f102104i = true;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102101f;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void c(@k RecyclerView.C c12) {
        View view = c12.itemView;
        f fVar = view instanceof f ? (f) view : null;
        if (fVar == null) {
            return;
        }
        fVar.setTrackingDisposable(null);
        if (this.f102103h) {
            v(fVar, true);
        }
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void d(@k RecyclerView.C c12) {
        View view = c12.itemView;
        f fVar = view instanceof f ? (f) view : null;
        if (fVar == null) {
            return;
        }
        fVar.setTrackingDisposable(null);
        if (this.f102103h) {
            v(fVar, true);
        }
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void e(@k RecyclerView.C c12) {
        u(c12.itemView);
        this.f102100e.o(new BeduinPixelAction(this.f102101f, null, false, 6, null));
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF18008e() {
        return this.f102104i;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext());
        fVar.setId(View.generateViewId());
        layoutParams.width = 1;
        layoutParams.height = 1;
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        f fVar = (f) view;
        if (this.f102103h) {
            D6.l(true, fVar, new com.avito.android.beduin.common.component.pixel.b(this, fVar));
        }
    }

    public final void u(View view) {
        boolean z12 = view instanceof f;
        f fVar = z12 ? (f) view : null;
        if (fVar != null) {
            fVar.setTrackingDisposable(null);
        }
        if (this.f102103h) {
            f fVar2 = z12 ? (f) view : null;
            if (fVar2 == null) {
                return;
            }
            WeakReference weakReference = new WeakReference(fVar2);
            I0 i0J0 = z.a0(0L, 150L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f102102g.e());
            b bVar = new b(weakReference, this);
            final V2 v22 = V2.f318762a;
            fVar2.setTrackingDisposable(i0J0.v0(bVar, new l41.g() { // from class: com.avito.android.beduin.common.component.pixel.a.c
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    public final void v(f fVar, boolean z12) {
        Object parent = fVar.getParent();
        View view = parent instanceof View ? (View) parent : null;
        this.f102100e.o(new BeduinPixelAction(this.f102101f, new BeduinPixelActionScreenPosition(fVar.getTop(), fVar.getBottom(), view != null ? view.getMeasuredHeight() : 0), z12));
    }
}
