package com.avito.android.tariff.cpa.configure_advance.items.advance_info;

import Y41.l;
import Y61.k;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvanceInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/items/advance_info/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/configure_advance/items/advance_info/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f294332b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294333c;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object systemService = i.this.f294332b.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.toggleSoftInput(2, 1);
            }
        }
    }

    public i(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.money_input);
        this.f294332b = input;
        this.f294333c = (TextView) view.findViewById(R.id.tv_error);
        input.setOnLongClickListener(null);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void Hd(@k String str) {
        this.f294332b.setHint(str);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void K(@k l<? super String, G0> lVar) {
        Input input = this.f294332b;
        input.b(new a(input, lVar));
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void h9(boolean z12) {
        TextView textView = this.f294333c;
        if (z12) {
            textView.setTextColor(ColorStateList.valueOf(C35835l0.d(R.attr.gray54, textView.getContext())));
        } else {
            textView.setTextColor(ColorStateList.valueOf(C35835l0.d(R.attr.red600, textView.getContext())));
        }
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void i0() {
        Input input = this.f294332b;
        input.requestFocus();
        input.v();
        b bVar = new b();
        input.postDelayed(bVar, 300L);
        input.addOnAttachStateChangeListener(new c(input, bVar));
        input.q();
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void k6(@k String str) {
        this.f294333c.setText(str);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.advance_info.h
    public final void x6(@k String str) {
        Input.t(this.f294332b, str, false, 6);
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/F6", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f294338b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f294339c;

        public c(View view, b bVar) {
            this.f294338b = view;
            this.f294339c = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
            this.f294338b.removeOnAttachStateChangeListener(this);
            view.removeCallbacks(this.f294339c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f294334b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f294335c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f294336d;

        public a(Input input, l lVar) {
            this.f294335c = input;
            this.f294336d = lVar;
            this.f294334b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f294335c.getDeformattedText();
            if (L.f(deformattedText, this.f294334b)) {
                return;
            }
            this.f294336d.invoke(deformattedText);
            this.f294334b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
