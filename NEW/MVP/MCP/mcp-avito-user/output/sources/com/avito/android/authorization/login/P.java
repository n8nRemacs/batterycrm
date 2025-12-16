package com.avito.android.authorization.login;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class P implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.a f93989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Input f93990d;

    public /* synthetic */ P(l0.a aVar, Input input, int i12) {
        this.f93988b = i12;
        this.f93989c = aVar;
        this.f93990d = input;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Input input = this.f93990d;
        l0.a aVar = this.f93989c;
        switch (this.f93988b) {
            case 0:
                boolean z12 = !aVar.f406838b;
                aVar.f406838b = z12;
                CE0.a.a(input, z12, null, null);
                break;
            default:
                ProfileRemoveConfirmFragment.a aVar2 = ProfileRemoveConfirmFragment.f223786x0;
                boolean z13 = !aVar.f406838b;
                aVar.f406838b = z13;
                CE0.a.a(input, z13, Integer.valueOf(R.drawable.ic_visibility_20), Integer.valueOf(R.drawable.ic_visibility_off_20));
                break;
        }
    }
}
