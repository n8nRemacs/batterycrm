package com.avito.android.profile_settings_extended.adapter.geo;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.remote.model.extended.common.GeoSchedule;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: ExtendedSettingsGeoConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/c;", "Lcom/avito/android/profile_settings_extended/adapter/geo/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.P f229459a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f229460b;

    @Inject
    public c(@Y61.k com.avito.android.profile_settings_extended.P p12, @Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f229459a = p12;
        this.f229460b = interfaceC35863o4;
    }

    public static String d(int i12) {
        return String.format((i12 / 60) + ":%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12 % 60)}, 1));
    }

    public static TimeInterval e(GeoSchedule.TimeRange timeRange) {
        if (L.f(timeRange.getAllDay(), Boolean.TRUE)) {
            return new TimeInterval(0, 0);
        }
        List<Integer> minutes = timeRange.getMinutes();
        if (minutes != null) {
            return new TimeInterval(minutes.get(0).intValue(), minutes.get(1).intValue());
        }
        return null;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo.a
    @Y61.k
    public final String a(@Y61.l TimeInterval timeInterval) {
        if (timeInterval == null) {
            return "";
        }
        if (timeInterval.f145911d) {
            return this.f229459a.f();
        }
        return d(timeInterval.f145909b) + '-' + d(timeInterval.f145910c);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo.a
    @Y61.k
    public final String b(@Y61.k AddressDaysArray addressDaysArray) {
        boolean z12;
        String strO;
        ArrayList arrayListC = addressDaysArray.c();
        int size = arrayListC.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z12 = true;
                break;
            }
            int iIntValue = ((Number) arrayListC.get(i12)).intValue() + 1;
            i12++;
            if (iIntValue != ((Number) arrayListC.get(i12)).intValue()) {
                z12 = false;
                break;
            }
        }
        com.avito.android.profile_settings_extended.P p12 = this.f229459a;
        if (z12 && arrayListC.size() == 7) {
            strO = p12.p();
        } else if (z12 && arrayListC.size() == 5 && ((Number) C42745f0.E(arrayListC)).intValue() == 0) {
            strO = p12.k();
        } else if (z12 && arrayListC.size() == 2 && ((Number) C42745f0.E(arrayListC)).intValue() == 5) {
            strO = p12.m();
        } else if (!z12 || arrayListC.size() < 3) {
            strO = C42745f0.O(arrayListC, null, null, null, new b(this), 31);
        } else {
            strO = p12.b()[((Number) C42745f0.E(arrayListC)).intValue()] + " – " + p12.b()[((Number) C42745f0.Q(arrayListC)).intValue()];
        }
        if (strO.length() <= 0) {
            return strO;
        }
        return ((Object) C43044a.e(strO.charAt(0))) + strO.substring(1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.avito.android.profile_settings_extended.entity.i, still in use, count: 2, list:
          (r1v0 com.avito.android.profile_settings_extended.entity.i) from 0x025d: MOVE (r25v0 com.avito.android.profile_settings_extended.entity.i) = (r1v0 com.avito.android.profile_settings_extended.entity.i) (LINE:606)
          (r1v0 com.avito.android.profile_settings_extended.entity.i) from 0x005e: PHI (r1v3 com.avito.android.profile_settings_extended.entity.i) = 
          (r1v0 com.avito.android.profile_settings_extended.entity.i)
          (r1v8 com.avito.android.profile_settings_extended.entity.i)
         binds: [B:14:0x004d, B:67:0x022d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // com.avito.android.profile_settings_extended.adapter.geo.a
    @Y61.k
    public final com.avito.android.profile_settings_extended.entity.i c(@Y61.k com.avito.android.remote.model.extended.GeoWidget r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.adapter.geo.c.c(com.avito.android.remote.model.extended.GeoWidget, boolean):com.avito.android.profile_settings_extended.entity.i");
    }
}
