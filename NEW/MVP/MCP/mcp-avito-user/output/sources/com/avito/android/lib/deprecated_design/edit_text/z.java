package com.avito.android.lib.deprecated_design.edit_text;

import android.content.res.Resources;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import ca1.C27140f;
import com.avito.android.R;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MoneyBigInput.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/z;", "Lcom/avito/android/lib/deprecated_design/edit_text/y;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class z implements y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditText f177998b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f177999c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f178000d;

    /* compiled from: MoneyBigInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = z.this.f177999c;
            if (lVar != null) {
                lVar.invoke(z.a(str2).toString());
            }
            return G0.f406611a;
        }
    }

    public z(@Y61.k View view) throws Resources.NotFoundException {
        EditText editText = (EditText) view;
        this.f177998b = editText;
        String string = view.getResources().getString(R.string.money_input_postfix);
        C c12 = new C(string, 0, false, 6, null);
        editText.setMaxLines(1);
        editText.setInputType(2);
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789" + string + (char) 8201));
        editText.setImeOptions(268435462);
        editText.addTextChangedListener(new C31488a(c12, new a()));
        editText.setOnEditorActionListener(new C27140f(this, 6));
    }

    public static StringBuilder a(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.y
    public final void MZ(@Y61.k String str) {
        this.f177998b.setText(str);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.y
    public final void Q(@Y61.k Y41.a<G0> aVar) {
        throw null;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.y
    public final void c70(@Y61.k Y41.l<? super String, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.y
    @Y61.k
    public final StringBuilder cC() {
        return a(this.f177998b.getText());
    }
}
