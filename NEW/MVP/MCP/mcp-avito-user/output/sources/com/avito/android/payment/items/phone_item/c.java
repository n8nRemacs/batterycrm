package com.avito.android.payment.items.phone_item;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputPhoneView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/items/phone_item/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/payment/items/phone_item/f;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f214484b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f214485c;

    public c(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.input_field);
        this.f214484b = input;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        input.setInputType(2);
        input.b(new a(input, this));
    }

    @Override // com.avito.android.payment.items.phone_item.f
    public final void Dl(@l String str, @l String str2) {
        Input input = this.f214484b;
        input.setHint(str);
        Input.t(input, str2, true, 2);
        U3((str2 == null || C5.f318568b.e(str2)) ? false : true);
    }

    @Override // com.avito.android.payment.items.phone_item.f
    public final void U3(boolean z12) {
        int[] iArr;
        if (z12) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f214484b.setState(iArr);
    }

    @Override // com.avito.android.payment.items.phone_item.f
    public final void r0(@k Y41.l<? super String, G0> lVar) {
        this.f214485c = lVar;
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f214486b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f214487c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f214488d;

        public a(Input input, c cVar) {
            this.f214487c = input;
            this.f214488d = cVar;
            this.f214486b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f214487c.getDeformattedText();
            if (L.f(deformattedText, this.f214486b)) {
                return;
            }
            Y41.l<? super String, G0> lVar = this.f214488d.f214485c;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f214486b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
