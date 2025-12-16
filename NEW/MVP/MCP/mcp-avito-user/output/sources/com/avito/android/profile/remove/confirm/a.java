package com.avito.android.profile.remove.confirm;

import J90.a;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlinx.coroutines.C43259k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223805c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f223804b = i12;
        this.f223805c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f223804b) {
            case 0:
                c cVar = (c) this.f223805c;
                ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = cVar.f223808E;
                if (profileRemoveConfirmDialogParams != null && profileRemoveConfirmDialogParams.f223784e) {
                    Y41.a<G0> aVar = cVar.f223809F;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    cVar.dismiss();
                    break;
                } else {
                    C43259k.d(cVar.f223815L, null, null, new d(cVar, null), 3);
                    break;
                }
                break;
            default:
                ProfileRemoveConfirmFragment profileRemoveConfirmFragment = (ProfileRemoveConfirmFragment) this.f223805c;
                Input input = profileRemoveConfirmFragment.f223794u0;
                if (input == null) {
                    input = null;
                }
                String strValueOf = String.valueOf(input.m53getText());
                if (strValueOf.length() != 0) {
                    ((l) profileRemoveConfirmFragment.f223788o0.getValue()).accept(new a.C0510a(strValueOf));
                    break;
                } else {
                    ComponentContainer componentContainer = profileRemoveConfirmFragment.f223795v0;
                    if (componentContainer == null) {
                        componentContainer = null;
                    }
                    Input input2 = profileRemoveConfirmFragment.f223794u0;
                    ComponentContainer.l(componentContainer, new int[]{(input2 != null ? input2 : null).getId()}, profileRemoveConfirmFragment.getString(R.string.profile_remove_password_empty_field_warning), 4);
                    break;
                }
        }
    }
}
