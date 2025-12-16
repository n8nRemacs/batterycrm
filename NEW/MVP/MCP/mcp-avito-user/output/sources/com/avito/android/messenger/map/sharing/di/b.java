package com.avito.android.messenger.map.sharing.di;

import Y61.k;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.messenger.map.sharing.SharingMapFragment;
import com.avito.android.remote.model.messenger.message.MessageBody;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: SharingMapFragmentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/di/b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SharingMapFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/di/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k SharingMapFragment sharingMapFragment, @h31.b @k SharingMapFragment sharingMapFragment2, @h31.b @k ActivityC22955m activityC22955m, @h31.b @k MessageBody.Location location, @h31.b @k @Named("addressNotFoundTitle") String str, @h31.b @k @Named("addressNotFoundErrorMessage") String str2, @h31.b @k @Named("retryLabel") String str3, @k c cVar);
    }

    void a(@k SharingMapFragment sharingMapFragment);
}
