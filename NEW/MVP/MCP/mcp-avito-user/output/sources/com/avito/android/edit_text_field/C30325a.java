package com.avito.android.edit_text_field;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_text_field.y;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldViewModeDelegate.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/a;", "Lcom/avito/android/edit_text_field/J;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.edit_text_field.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30325a implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Input f146930a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f146931b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f146932c;

    /* compiled from: EditTextFieldViewModeDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.edit_text_field.a$a, reason: collision with other inner class name */
    public static final class C4274a extends N implements Y41.l<String, G0> {
        public C4274a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            C30325a c30325a = C30325a.this;
            c30325a.f146931b.setEnabled(c30325a.b());
            c30325a.f146932c.invoke(str);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30325a(@Y61.k Input input, @Y61.k Button button, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f146930a = input;
        this.f146931b = button;
        this.f146932c = lVar;
    }

    @Override // com.avito.android.edit_text_field.J
    public final void a() {
        this.f146931b.setText(R.string.extended_profile_settings_change);
        Input input = this.f146930a;
        ((y.b) this.f146932c).invoke(String.valueOf(input.m53getText()));
        com.avito.android.lib.design.input.n.c(input, new C4274a());
        input.setMaxLength(60);
        input.o(input.getContext().getResources().getInteger(R.integer.edit_text_field_max_lines), 1);
    }

    @Override // com.avito.android.edit_text_field.J
    public final boolean b() {
        return String.valueOf(this.f146930a.m53getText()).length() >= 2;
    }
}
