package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/input/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/input/g;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f256211b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f256211b = (Input) viewFindViewById;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.g
    public final void g0(@l CharSequence charSequence) {
        Input.t(this.f256211b, charSequence, false, 6);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.g
    public final void m3(@l CharSequence charSequence) {
        this.f256211b.setHint(charSequence);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.g
    public final void tB(@k Y41.l<? super CharSequence, G0> lVar) {
        this.f256211b.b(new a(lVar));
    }

    /* compiled from: InputItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/safedeal/delivery/order_cancellation/details/konveyor/input/h$a", "Landroid/text/TextWatcher;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<CharSequence, G0> f256212b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super CharSequence, G0> lVar) {
            this.f256212b = lVar;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
            this.f256212b.invoke(charSequence);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
