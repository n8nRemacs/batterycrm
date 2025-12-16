package com.avito.android.gig.shift_list.generated.api.di;

import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.HeaderIconNameTypeAdapterFactory;
import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.HeaderTitleColorTypeAdapterFactory;
import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.TimerDirectionTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ShiftListJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ShiftListJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159465a = new b();
    }

    public static b a() {
        return a.f159465a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.gig.shift_list.generated.api.di.a.f159464a.getClass();
        Set setL0 = C42756l.l0(new r[]{new HeaderIconNameTypeAdapterFactory(), new HeaderTitleColorTypeAdapterFactory(), new TimerDirectionTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
