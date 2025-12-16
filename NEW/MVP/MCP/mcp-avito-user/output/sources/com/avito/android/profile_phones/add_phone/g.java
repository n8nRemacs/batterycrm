package com.avito.android.profile_phones.add_phone;

import android.text.Editable;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;

/* compiled from: AddPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPhoneFragment f226874b;

    public g(AddPhoneFragment addPhoneFragment) {
        this.f226874b = addPhoneFragment;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String string;
        Input input = this.f226874b.f226807r0;
        if (input == null) {
            input = null;
        }
        Editable editableM53getText = input.m53getText();
        return (editableM53getText == null || (string = editableM53getText.toString()) == null) ? "" : string;
    }
}
