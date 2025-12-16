package com.avito.android.extended_profile_personal_link_edit;

import DA.a;
import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditFragment;
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
    @Y61.k
    public String f151468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f151469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PersonalLinkEditFragment f151470d;

    public c(Input input, PersonalLinkEditFragment personalLinkEditFragment) {
        this.f151469c = input;
        this.f151470d = personalLinkEditFragment;
        this.f151468b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f151469c.getDeformattedText();
        if (L.f(deformattedText, this.f151468b)) {
            return;
        }
        PersonalLinkEditFragment.a aVar = PersonalLinkEditFragment.f151444y0;
        this.f151470d.r5().accept(new a.c(deformattedText));
        this.f151468b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
