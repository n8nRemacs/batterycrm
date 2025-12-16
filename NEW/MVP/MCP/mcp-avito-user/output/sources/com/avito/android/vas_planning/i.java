package com.avito.android.vas_planning;

import com.avito.android.analytics.C28462m;
import com.avito.android.analytics.C28463n;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.vas_planning.model.VasButton;
import com.avito.android.vas_planning.model.VasPlannerState;
import com.avito.android.vas_planning.model.VasPlanningItem;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasPlannerState f322367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f322368m;

    /* compiled from: VasPlanningView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f322369a;

        static {
            int[] iArr = new int[VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.values().length];
            try {
                VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.f322437b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType2 = VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.f322437b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f322369a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VasPlannerState vasPlannerState, o oVar) {
        super(0);
        this.f322367l = vasPlannerState;
        this.f322368m = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        VasPlannerState vasPlannerState = this.f322367l;
        VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = vasPlannerState.f322420d.f322417d;
        int i12 = vasPlanningRadioType == null ? -1 : a.f322369a[vasPlanningRadioType.ordinal()];
        o oVar = this.f322368m;
        if (i12 == 1) {
            VasButton vasButton = vasPlannerState.f322420d;
            if (vasButton.f322416c != null) {
                InterfaceC28373a interfaceC28373a = oVar.f322452g;
                VasPlanningFragmentArgument vasPlanningFragmentArgument = oVar.f322450e;
                interfaceC28373a.c(new C28463n(vasPlanningFragmentArgument.f322195b, vasPlanningFragmentArgument.f322197d));
                oVar.f322448c.q5(vasButton.f322416c);
            }
        } else if (i12 == 2) {
            oVar.f322451f.b6();
            VasPlanningFragmentArgument vasPlanningFragmentArgument2 = oVar.f322450e;
            String str = vasPlanningFragmentArgument2.f322195b;
            ArrayList<VasPlanningItem> arrayList = vasPlannerState.f322418b;
            int i13 = 0;
            if (!arrayList.isEmpty()) {
                for (VasPlanningItem vasPlanningItem : arrayList) {
                    if ((vasPlanningItem instanceof VasPlanningItem.VasPlanningDateTime) && ((VasPlanningItem.VasPlanningDateTime) vasPlanningItem).f322424e != null && (i13 = i13 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            oVar.f322452g.c(new C28462m(str, vasPlanningFragmentArgument2.f322197d, i13));
        }
        return G0.f406611a;
    }
}
