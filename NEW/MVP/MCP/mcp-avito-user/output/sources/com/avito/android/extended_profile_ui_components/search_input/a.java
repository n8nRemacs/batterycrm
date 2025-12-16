package com.avito.android.extended_profile_ui_components.search_input;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProfileSearchInputView f153417c;

    public /* synthetic */ a(ProfileSearchInputView profileSearchInputView, int i12) {
        this.f153416b = i12;
        this.f153417c = profileSearchInputView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ProfileSearchInputView profileSearchInputView = this.f153417c;
        switch (this.f153416b) {
            case 0:
                int i12 = ProfileSearchInputView.f153380D;
                profileSearchInputView.b();
                break;
            case 1:
                profileSearchInputView.f153403u.accept(G0.f406611a);
                break;
            case 2:
                profileSearchInputView.f153401s.accept(G0.f406611a);
                break;
            case 3:
                profileSearchInputView.f153402t.accept(G0.f406611a);
                break;
            case 4:
                profileSearchInputView.f153400r.accept(Integer.valueOf(R.id.menu_clarify));
                break;
            case 5:
                profileSearchInputView.f153404v.accept(G0.f406611a);
                profileSearchInputView.b();
                break;
            case 6:
                Input.t(profileSearchInputView.f153390h, "", false, 6);
                break;
            default:
                profileSearchInputView.f153390h.f();
                break;
        }
    }
}
