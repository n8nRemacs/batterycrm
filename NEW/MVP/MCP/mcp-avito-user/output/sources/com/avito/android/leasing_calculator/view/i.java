package com.avito.android.leasing_calculator.view;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LeasingApplicationView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/view/i;", "Lcom/avito/android/leasing_calculator/view/h;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f175148a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f175149b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f175150c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f175151d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f175152e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f175153f;

    /* compiled from: LeasingApplicationView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f175154l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f175154l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f175154l.invoke(str);
            return G0.f406611a;
        }
    }

    /* compiled from: LeasingApplicationView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f175155l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f175155l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f175155l.invoke(str);
            return G0.f406611a;
        }
    }

    public i(@Y61.k View view) {
        this.f175148a = view;
        View viewFindViewById = view.findViewById(R.id.description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f175149b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.inn_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f175150c = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f175151d = (Input) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.agreement);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f175152e = textView;
        View viewFindViewById5 = view.findViewById(R.id.send_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f175153f = (Button) viewFindViewById5;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void a() {
        D6.w(this.f175150c);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void b(boolean z12) {
        this.f175153f.setEnabled(z12);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void c(@Y61.k String str) {
        com.avito.android.component.toast.b.b(this.f175148a, str, 0, null, 0, null, 0, null, null, null, 131070);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void d() {
        D6.w(this.f175151d);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void e(@Y61.l CharSequence charSequence) {
        I5.a(this.f175152e, charSequence, false);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void f(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        Button button = this.f175153f;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(24, aVar));
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void g(@Y61.l Y41.l lVar, @Y61.l String str, @Y61.l String str2) {
        Input input = this.f175150c;
        D6.H(input);
        input.setHint(str);
        Input.t(input, str2, false, 6);
        input.b(new com.avito.android.lib.design.input.s(str2, new a(lVar)));
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void h(@Y61.l Y41.l lVar, @Y61.l String str, @Y61.l String str2) {
        Input input = this.f175151d;
        D6.H(input);
        input.setHint(str);
        Input.t(input, str2, false, 6);
        input.b(new com.avito.android.lib.design.input.s(str2, new b(lVar)));
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void n(@Y61.l String str) {
        I5.a(this.f175149b, str, false);
    }

    @Override // com.avito.android.leasing_calculator.view.h
    public final void setLoading(boolean z12) {
        boolean z13 = !z12;
        this.f175150c.setEnabled(z13);
        this.f175151d.setEnabled(z13);
        Button button = this.f175153f;
        button.setClickable(z13);
        button.setLoading(z12);
    }
}
