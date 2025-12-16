package com.avito.android.inline_filters.dialog.location_group.adapter;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.disposables.i;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f171741b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f171742c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f171743d;

    /* compiled from: GroupFilterItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f171744b;

        public a(Y41.a<G0> aVar) {
            this.f171744b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f171744b.invoke();
        }
    }

    /* compiled from: GroupFilterItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f171745b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "GroupFilterItemView clicks error", (Throwable) obj);
        }
    }

    public g(@k View view) {
        super(view);
        this.f171741b = view;
        this.f171742c = new i(0);
        this.f171743d = new com.jakewharton.rxrelay3.c<>();
        view.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 3));
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.f
    public final void I(boolean z12) {
        this.f171741b.setEnabled(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.f
    public final void J6(@l View.OnClickListener onClickListener) {
        View view = this.f171741b;
        if (view instanceof Input) {
            ((Input) view).setRightIconListener(onClickListener);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.f
    public final void a(@k Y41.a<G0> aVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.jakewharton.rxrelay3.c<G0> cVar = this.f171743d;
        cVar.getClass();
        this.f171742c.a(cVar.C0(1000L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new a(aVar), b.f171745b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f171742c.a(null);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.f
    public final void r4(@k String str, boolean z12, boolean z13) {
        View view = this.f171741b;
        if (!(view instanceof Input)) {
            view.setContentDescription(str);
            return;
        }
        if (!z13) {
            Input input = (Input) view;
            Input.t(input, "", false, 6);
            input.setHint(str);
            s7();
            return;
        }
        if (!z12) {
            Input input2 = (Input) view;
            Input.t(input2, "", false, 6);
            input2.setHint(str);
            s7();
            return;
        }
        Input input3 = (Input) view;
        input3.setHint("");
        Input.t(input3, str, false, 6);
        if (view instanceof Input) {
            input3.setRightIcon(C35835l0.h(R.attr.ic_close20, input3.getContext()));
            input3.setRightIconColor(C35835l0.d(R.attr.black, input3.getContext()));
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.f
    public final void s7() {
        View view = this.f171741b;
        if (view instanceof Input) {
            ((Input) view).setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, ((Input) view).getContext()));
            ((Input) view).setRightIconColor(C35835l0.d(R.attr.black, ((Input) view).getContext()));
        }
    }
}
