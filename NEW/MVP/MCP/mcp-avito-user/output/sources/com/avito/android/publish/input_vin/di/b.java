package com.avito.android.publish.input_vin.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.publish.di.W;
import com.avito.android.publish.input_vin.mvi.InputVinMviFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: InputVinComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/input_vin/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: InputVinComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_vin/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k c cVar);

        @h31.b
        @k
        a b(@k Resources resources);

        @k
        b build();

        @h31.b
        @k
        a c(@k InputVinMviFragment inputVinMviFragment);

        @h31.b
        @k
        a d(@W int i12);

        @h31.b
        @k
        a e(boolean z12);
    }

    void a(@k InputVinMviFragment inputVinMviFragment);
}
