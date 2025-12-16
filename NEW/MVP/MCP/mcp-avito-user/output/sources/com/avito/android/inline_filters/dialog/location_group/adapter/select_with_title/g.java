package com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.disposables.i;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterItemSelectWithTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/select_with_title/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/select_with_title/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f171771b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f171772c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f171773d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ComponentContainer f171774e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Input f171775f;

    /* compiled from: GroupFilterItemSelectWithTitleView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f171776b;

        public a(Y41.a<G0> aVar) {
            this.f171776b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f171776b.invoke();
        }
    }

    /* compiled from: GroupFilterItemSelectWithTitleView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f171777b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "GroupFilterItemView clicks error", (Throwable) obj);
        }
    }

    public g(@k View view) {
        super(view);
        this.f171771b = view;
        this.f171772c = new i(0);
        this.f171773d = new com.jakewharton.rxrelay3.c<>();
        View viewFindViewById = view.findViewById(R.id.filters_select_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f171774e = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_filter_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f171775f = input;
        input.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 4));
        D6.f(view, (int) view.getContext().getResources().getDimension(R.dimen.inline_filter_recycler_padding_start), 0, (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.inline_filter_dialog_horizontal_padding), 0, 10);
        input.setLeftIcon(C35835l0.h(R.attr.ic_hollowPin16, view.getContext()));
        input.setLeftIconColor(C35835l0.d(R.attr.black, view.getContext()));
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void I(boolean z12) {
        this.f171771b.setEnabled(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void J6(@l View.OnClickListener onClickListener) {
        View view = this.f171771b;
        if (view instanceof Input) {
            ((Input) view).setRightIconListener(onClickListener);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void a(@k Y41.a<G0> aVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.jakewharton.rxrelay3.c<G0> cVar = this.f171773d;
        cVar.getClass();
        this.f171772c.a(cVar.C0(1000L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new a(aVar), b.f171777b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f171772c.a(null);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void r4(@k String str, boolean z12, boolean z13) {
        Input input = this.f171775f;
        if (!z13) {
            Input.t(input, "", false, 6);
            input.setHint(str);
            s7();
        } else {
            if (!z12) {
                Input.t(input, "", false, 6);
                input.setHint(str);
                s7();
                return;
            }
            input.setHint("");
            Input.t(input, str, false, 6);
            View view = this.f171771b;
            if (view instanceof Input) {
                Input input2 = (Input) view;
                input2.setRightIcon(C35835l0.h(R.attr.ic_close20, input2.getContext()));
                input2.setRightIconColor(C35835l0.d(R.attr.black, input2.getContext()));
            }
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void s7() {
        View view = this.f171771b;
        if (view instanceof Input) {
            ((Input) view).setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, ((Input) view).getContext()));
            ((Input) view).setRightIconColor(C35835l0.d(R.attr.black, ((Input) view).getContext()));
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.f
    public final void setTitle(@k String str) {
        this.f171774e.setTitle(str);
    }
}
