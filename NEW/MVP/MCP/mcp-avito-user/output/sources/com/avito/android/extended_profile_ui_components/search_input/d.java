package com.avito.android.extended_profile_ui_components.search_input;

import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ProfileSearchInputView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileSearchInputView f153420b;

    public d(ProfileSearchInputView profileSearchInputView) {
        this.f153420b = profileSearchInputView;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ProfileSearchInputView profileSearchInputView = this.f153420b;
        Input input = profileSearchInputView.f153390h;
        if (input.hasFocus() && charSequence.length() == 0) {
            D6.w(profileSearchInputView.f153395m);
            D6.w(profileSearchInputView.f153394l);
            profileSearchInputView.f();
        }
        int length = charSequence.length();
        ProfileSearchInputView.a aVar = profileSearchInputView.f153384b;
        if (length == 0) {
            input.setLeftIconColor(aVar.f153414a);
        } else {
            input.setLeftIconColor(aVar.f153415b);
        }
    }
}
