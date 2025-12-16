package com.avito.android.work_profile.generated.api.di;

import com.avito.android.work_profile.generated.api.get_profile_about_v_3.HeaderIconNameTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.HeaderTitleColorTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PaymentItemIconTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PaymentItemStatusTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PersonalItemV3StatusTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.ProfileAboutBlockTypeTypeAdapterFactory;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.TimerDirectionTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: WorkProfileJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class b implements h<Set<r>> {

    /* compiled from: WorkProfileJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f330663a = new b();
    }

    public static b a() {
        return a.f330663a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.work_profile.generated.api.di.a.f330662a.getClass();
        Set setL0 = C42756l.l0(new r[]{new HeaderIconNameTypeAdapterFactory(), new HeaderTitleColorTypeAdapterFactory(), new PaymentItemIconTypeAdapterFactory(), new PaymentItemStatusTypeAdapterFactory(), new PersonalItemV3StatusTypeAdapterFactory(), new ProfileAboutBlockTypeTypeAdapterFactory(), new TimerDirectionTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
