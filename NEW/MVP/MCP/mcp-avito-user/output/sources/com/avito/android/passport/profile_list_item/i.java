package com.avito.android.passport.profile_list_item;

import com.avito.android.component.user_hat.ProfileStatus;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_list_item/i;", "LTV0/e;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface i extends TV0.e {

    /* compiled from: ProfileListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void B9(@Y61.k ProfileStatus profileStatus, @Y61.k ProfileType profileType);

    void D(@Y61.k PrintableText printableText);

    void J(@Y61.k String str);

    void Td(boolean z12);

    void a(@Y61.k Y41.a<G0> aVar);

    void h(@Y61.k String str);

    void kP(boolean z12);

    void l(@Y61.l Image image);
}
