package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.view.View;
import kB.InterfaceC42561a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f154125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f154126c;

    public /* synthetic */ r(Object obj, int i12) {
        this.f154125b = i12;
        this.f154126c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f154126c;
        switch (this.f154125b) {
            case 0:
                int i12 = UniversalWidgetImageUploader.f153997i;
                ((Y41.a) obj).invoke();
                break;
            case 1:
                int i13 = UniversalWidgetImageUploader.f153997i;
                ((Y41.a) obj).invoke();
                break;
            default:
                ((i) obj).f154056b.invoke(InterfaceC42561a.g.f406158a);
                break;
        }
    }
}
