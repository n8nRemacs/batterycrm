package com.avito.android.profile.edit.di;

import com.avito.android.di.InterfaceC30272y;
import com.avito.android.profile.edit.EditProfileActivity;
import com.avito.android.profile.edit.di.C33319d;
import com.avito.android.util.Kundle;
import com.google.gson.Gson;
import h31.d;
import kotlin.Metadata;

/* compiled from: EditProfileComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/di/b;", "", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* renamed from: com.avito.android.profile.edit.di.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33317b {

    /* compiled from: EditProfileComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/di/b$a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.edit.di.b$a */
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k Gson gson);

        @h31.b
        @Y61.k
        a b(@Y61.k EditProfileActivity editProfileActivity);

        @Y61.k
        InterfaceC33317b build();

        @h31.b
        @Y61.k
        a c(@Y61.l @C33319d.InterfaceC6721d Kundle kundle);

        @h31.b
        @Y61.k
        a d(@C33319d.e @Y61.l Kundle kundle);

        @Y61.k
        a e(@Y61.k InterfaceC33318c interfaceC33318c);

        @h31.b
        @Y61.k
        a f(@Y61.l @C33319d.c Kundle kundle);
    }

    void a(@Y61.k EditProfileActivity editProfileActivity);
}
