package com.avito.android.universal_map.map;

import com.avito.android.map_core.beduin.BeduinResetMapAction;
import com.avito.android.universal_map.map.T;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalPointsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/map_core/beduin/BeduinResetMapAction$ResetEntity;", "entities", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f304909b;

    /* compiled from: UniversalPointsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f304910a;

        static {
            int[] iArr = new int[BeduinResetMapAction.ResetEntity.values().length];
            try {
                iArr[BeduinResetMapAction.ResetEntity.TOOLTIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.PINS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.SAVED_LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.FOCUS_ON_REGION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f304910a = iArr;
        }
    }

    public Z(g0 g0Var) {
        this.f304909b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Iterator<T> it = ((List) obj).iterator();
        while (it.hasNext()) {
            int i12 = a.f304910a[((BeduinResetMapAction.ResetEntity) it.next()).ordinal()];
            g0 g0Var = this.f304909b;
            if (i12 == 1) {
                g0Var.f305206i0 = null;
            } else if (i12 == 2) {
                g0Var.f305204g0.setValue(G0.f406611a);
            } else if (i12 == 3) {
                g0Var.getClass();
                C42784z0 c42784z0 = C42784z0.f406748b;
                g0Var.f305194W.postValue(new T.a(new UniversalMapPointsRectResult(c42784z0, c42784z0, null, null, null, null, g0Var.f305214q0), null, true));
                g0Var.f305205h0.postValue(null);
            } else if (i12 == 4) {
                g0Var.f305207j0 = false;
                g0Var.f305208k0 = null;
                g0Var.f305211n0 = false;
            } else if (i12 == 5) {
                g0Var.f305209l0 = null;
                g0Var.f305212o0 = false;
            }
        }
    }
}
