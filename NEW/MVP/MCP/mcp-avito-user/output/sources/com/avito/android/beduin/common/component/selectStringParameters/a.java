package com.avito.android.beduin.common.component.selectStringParameters;

import android.view.View;
import com.avito.android.beduin.common.form.transforms.StringParametersTransform;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.beduin_shared.model.utils.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f102413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f102414c;

    public /* synthetic */ a(b bVar, int i12) {
        this.f102413b = i12;
        this.f102414c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f102414c;
        switch (this.f102413b) {
            case 0:
                BeduinSelectStringParametersModel beduinSelectStringParametersModel = bVar.f102415e;
                j.a(bVar.f102417g, beduinSelectStringParametersModel.getF102944b(), new StringParametersTransform(null), new TextTransform(""));
                com.avito.android.beduin_shared.model.utils.a.a(bVar.f102416f, beduinSelectStringParametersModel.f102407n);
                break;
            default:
                com.avito.android.beduin_shared.model.utils.a.a(bVar.f102416f, bVar.f102415e.f102411r);
                break;
        }
    }
}
