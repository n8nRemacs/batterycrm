package com.avito.android.profile.pro.impl.screen.item.employee.mode;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProEmployeeModeButtonView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/mode/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/employee/mode/g;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f223255g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223256b;

    /* renamed from: c, reason: collision with root package name */
    public final View f223257c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223258d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223259e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f223260f;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223256b = aVar;
        this.f223257c = view.findViewById(R.id.item_profile_pro_employee_mode_button_root);
        this.f223258d = (TextView) view.findViewById(R.id.employee_mode_button_text_icon);
        this.f223259e = (TextView) view.findViewById(R.id.employee_mode_button_title);
        this.f223260f = (TextView) view.findViewById(R.id.employee_mode_button_subtitle);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223257c.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.employee.mode.g
    public final void lJ(@k ProfileProEmployeeModeButtonItem profileProEmployeeModeButtonItem, @k Y41.a<G0> aVar) {
        TextView textView = this.f223258d;
        textView.setText(this.f223256b.c(textView.getContext(), profileProEmployeeModeButtonItem.f223244f));
        this.f223259e.setText(profileProEmployeeModeButtonItem.f223242d);
        this.f223260f.setText(profileProEmployeeModeButtonItem.f223243e);
        this.f223257c.setOnClickListener(new com.avito.android.profile.edit.adapter.c(3, aVar));
    }
}
