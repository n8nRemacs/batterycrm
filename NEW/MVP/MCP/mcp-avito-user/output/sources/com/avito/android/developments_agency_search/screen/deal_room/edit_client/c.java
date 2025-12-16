package com.avito.android.developments_agency_search.screen.deal_room.edit_client;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f137547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f137548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f137549d;

    public c(Input input, a aVar) {
        this.f137548c = input;
        this.f137549d = aVar;
        this.f137547b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@l Editable editable) {
        String deformattedText = this.f137548c.getDeformattedText();
        if (L.f(deformattedText, this.f137547b)) {
            return;
        }
        int i12 = a.f137529R;
        this.f137549d.V();
        this.f137547b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
