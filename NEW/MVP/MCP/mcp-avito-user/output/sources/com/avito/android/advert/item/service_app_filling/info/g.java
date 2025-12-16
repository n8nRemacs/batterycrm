package com.avito.android.advert.item.service_app_filling.info;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.asynclayoutinflater.view.a;
import com.avito.android.R;
import com.avito.android.util.I5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements a.e, com.avito.android.code_check_public.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f79807b;

    public /* synthetic */ g(String str) {
        this.f79807b = str;
    }

    @Override // androidx.asynclayoutinflater.view.a.e
    public void g(View view, ViewGroup viewGroup) {
        int i12 = h.f79808d;
        I5.a((TextView) view.findViewById(R.id.advantageTitle), this.f79807b, false);
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // com.avito.android.code_check_public.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k0(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "esia-id"
            java.lang.String r1 = r3.f79807b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131957385(0x7f131689, float:1.9551352E38)
            java.lang.String r4 = r4.getString(r0)
            goto L7e
        L13:
            int r0 = r1.hashCode()
            r2 = 3305(0xce9, float:4.631E-42)
            if (r0 == r2) goto L60
            r2 = 3548(0xddc, float:4.972E-42)
            if (r0 == r2) goto L53
            r2 = 3765(0xeb5, float:5.276E-42)
            if (r0 == r2) goto L45
            r2 = 93029210(0x58b835a, float:1.3119748E-35)
            if (r0 == r2) goto L38
            r2 = 112209715(0x6b02f33, float:6.6273195E-35)
            if (r0 == r2) goto L2e
            goto L68
        L2e:
            java.lang.String r0 = "vk-id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            goto L68
        L38:
            java.lang.String r0 = "apple"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L68
        L41:
            r0 = 2131957382(0x7f131686, float:1.9551346E38)
            goto L6f
        L45:
            java.lang.String r0 = "vk"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            goto L68
        L4f:
            r0 = 2131957389(0x7f13168d, float:1.955136E38)
            goto L6f
        L53:
            java.lang.String r0 = "ok"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            r0 = 2131957388(0x7f13168c, float:1.9551359E38)
            goto L6f
        L60:
            java.lang.String r0 = "gp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6c
        L68:
            r0 = 2131957383(0x7f131687, float:1.9551348E38)
            goto L6f
        L6c:
            r0 = 2131957386(0x7f13168a, float:1.9551354E38)
        L6f:
            java.lang.String r0 = r4.getString(r0)
            r1 = 2131957384(0x7f131688, float:1.955135E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = r4.getString(r1, r0)
        L7e:
            com.avito.android.remote.model.text.AttributedText r0 = new com.avito.android.remote.model.text.AttributedText
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.service_app_filling.info.g.k0(android.content.Context):java.lang.Object");
    }
}
