package com.avito.android.advert.item.sparePartsCost;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SparePartsCostItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sparePartsCost/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/sparePartsCost/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f80391b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80392c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f80393d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f80394e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f80395f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f80396g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public y f80397h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f80398i;

    /* compiled from: SparePartsCostItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f80399b;

        public a(Y41.a<G0> aVar) {
            this.f80399b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f80399b.invoke();
        }
    }

    /* compiled from: SparePartsCostItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f80400b;

        public b(Y41.a<G0> aVar) {
            this.f80400b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f80400b.invoke();
        }
    }

    public h(@k View view, @k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f80391b = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80392c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80393d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.buttons_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f80394e = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.firstButton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f80395f = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.secondButton);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f80396g = (Button) viewFindViewById5;
    }

    @Override // com.avito.android.advert.item.sparePartsCost.g
    public final void MI(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f80395f;
        com.avito.android.lib.design.button.b.a(button, str, false);
        y yVar = this.f80397h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (aVar != null) {
            this.f80397h = (y) C37722i.a(button).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f80391b.e()).t0(new a(aVar));
        }
        D6.G(this.f80394e, D6.y(button) || D6.y(this.f80396g));
    }

    @Override // com.avito.android.advert.item.sparePartsCost.g
    public final void j(@l String str) {
        I5.a(this.f80393d, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f80397h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        y yVar2 = this.f80398i;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
    }

    @Override // com.avito.android.advert.item.sparePartsCost.g
    public final void setTitle(@k String str) {
        this.f80392c.setText(str);
    }

    @Override // com.avito.android.advert.item.sparePartsCost.g
    public final void uv(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f80396g;
        com.avito.android.lib.design.button.b.a(button, str, false);
        y yVar = this.f80398i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (aVar != null) {
            this.f80398i = (y) C37722i.a(button).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f80391b.e()).t0(new b(aVar));
        }
        D6.G(this.f80394e, D6.y(this.f80395f) || D6.y(button));
    }
}
