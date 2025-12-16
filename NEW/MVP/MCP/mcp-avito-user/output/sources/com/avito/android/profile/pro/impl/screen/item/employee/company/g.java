package com.avito.android.profile.pro.impl.screen.item.employee.company;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProEmployeeCompanyView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/company/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/employee/company/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDraweeView f223216b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f223217c;

    public g(@k View view) {
        super(view);
        this.f223216b = (SimpleDraweeView) view.findViewById(R.id.employee_company_avatar);
        this.f223217c = (TextView) view.findViewById(R.id.employee_company_name);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.employee.company.f
    public final void qS(@k ProfileProEmployeeCompanyItem profileProEmployeeCompanyItem) {
        Image image = profileProEmployeeCompanyItem.f223210d;
        SimpleDraweeView simpleDraweeView = this.f223216b;
        if (image != null) {
            simpleDraweeView.setVisibility(0);
            C35949t5.c(simpleDraweeView, n.a(image), null, null, null, 14);
            C29574b.a(simpleDraweeView);
        } else {
            simpleDraweeView.setVisibility(8);
        }
        this.f223217c.setText(profileProEmployeeCompanyItem.f223209c);
    }
}
