package com.avito.android.component.user_hat.items;

import com.avito.android.component.user_hat.ProfileStatus;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.remote.model.Image;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: ParticularProfile.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/items/j;", "Lcom/avito/android/component/user_hat/f;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface j extends com.avito.android.component.user_hat.f {

    /* compiled from: ParticularProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void B9(@Y61.k ProfileStatus profileStatus, @Y61.k ProfileType profileType);

    void Jj(@Y61.k String str);

    void Td(boolean z12);

    void l(@Y61.l Image image);
}
