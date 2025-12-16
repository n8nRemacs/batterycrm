package com.avito.android.user_advert.advert;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertAddressFormatter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/b;", "Lcom/avito/android/user_advert/advert/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35376b implements InterfaceC35373a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f308457a;

    @Inject
    public C35376b(@Y61.k Resources resources) {
        this.f308457a = resources;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35373a
    @Y61.k
    public final String a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = true;
        if (!(str == null || str.length() == 0)) {
            sb2.append(str);
        }
        boolean z13 = str2 == null || str2.length() == 0;
        Resources resources = this.f308457a;
        if (!z13) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(resources.getString(R.string.metro_prefix));
            sb2.append(str2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str3);
            sb2.append(resources.getString(R.string.district_suffix));
        }
        if (!(str4 == null || str4.length() == 0)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str4);
        }
        if (str5 != null && str5.length() != 0) {
            z12 = false;
        }
        if (!z12) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str5);
        }
        return sb2.toString();
    }
}
