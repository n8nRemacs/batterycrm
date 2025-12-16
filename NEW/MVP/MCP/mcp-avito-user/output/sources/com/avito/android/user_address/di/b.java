package com.avito.android.user_address.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.user_address.UserAddressActivity;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: UserAddressCommonComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/di/b;", "Lcom/avito/android/user_address/di/e;", "a", "b", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes4.dex */
public interface b extends e {

    /* compiled from: UserAddressCommonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/di/b$a;", "", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: UserAddressCommonComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/di/b$b;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_address.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC9443b {
        @k
        b a(@k c cVar, @h31.b @k UserAddressActivity userAddressActivity, @h31.b @k Resources resources, @h31.b @k @Named("geo_session_id") String str);
    }

    void b(@k UserAddressActivity userAddressActivity);
}
