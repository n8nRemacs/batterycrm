package com.avito.android.gig.slot_impl.generated.api.di;

import com.avito.android.gig.slot_impl.generated.api.slot_v_7.RouteDetailTypeTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfoTitleTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfoV2TitleTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotPaymentIconTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotPaymentStatusTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotV7ResponseStateTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotWarningV3PresetTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SupportButtonV4PositionTypeAdapterFactory;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.TimerDirectionTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: SlotScreenJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: SlotScreenJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159476a = new b();
    }

    public static b a() {
        return a.f159476a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.gig.slot_impl.generated.api.di.a.f159475a.getClass();
        Set setL0 = C42756l.l0(new r[]{new RouteDetailTypeTypeAdapterFactory(), new SlotInfoTitleTypeAdapterFactory(), new SlotInfoV2TitleTypeAdapterFactory(), new SlotPaymentIconTypeAdapterFactory(), new SlotPaymentStatusTypeAdapterFactory(), new SlotV7ResponseStateTypeAdapterFactory(), new SlotWarningV3PresetTypeAdapterFactory(), new SupportButtonV4PositionTypeAdapterFactory(), new TimerDirectionTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
