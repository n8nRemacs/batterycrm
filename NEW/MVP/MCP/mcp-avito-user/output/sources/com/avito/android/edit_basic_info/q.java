package com.avito.android.edit_basic_info;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.edit_basic_info.EditBasicInfoFragment;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ky.InterfaceC43512a;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f146199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f146200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f146201d;

    public q(Input input, o oVar) {
        this.f146200c = input;
        this.f146201d = oVar;
        this.f146199b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f146200c.getDeformattedText();
        if (L.f(deformattedText, this.f146199b)) {
            return;
        }
        ((EditBasicInfoFragment.f) this.f146201d.f146181e).invoke(new InterfaceC43512a.j(deformattedText));
        this.f146199b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
