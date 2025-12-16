package com.avito.android.social.di;

import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.social.esia.EsiaAuthActivity;
import com.avito.android.util.R0;
import h31.d;
import hD.C40806a;
import kotlin.Metadata;

/* compiled from: EsiaAuthComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/di/g;", "", "a", "b", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: EsiaAuthComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/di/g$a;", "Lcom/avito/android/di/h;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface a extends InterfaceC29971h {
        @Y61.k
        C40806a R();

        @Y61.k
        R0 c();

        @Y61.k
        ProfileApi c7();
    }

    /* compiled from: EsiaAuthComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/di/g$b;", "", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        g a(@Y61.k a aVar);
    }

    void a(@Y61.k EsiaAuthActivity esiaAuthActivity);
}
