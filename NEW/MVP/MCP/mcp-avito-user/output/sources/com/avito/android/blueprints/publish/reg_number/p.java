package com.avito.android.blueprints.publish.reg_number;

import android.text.TextWatcher;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35798g3;
import com.avito.android.util.C35843m0;
import com.avito.android.validation.A;
import com.avito.android.validation.j1;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ue.C49042c;

/* compiled from: VehicleRegNumberInputItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/reg_number/p;", "Lcom/avito/android/blueprints/publish/reg_number/c;", "Lcom/avito/android/validation/j1;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements c, j1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z<String> f106420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextWatcher f106421c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106422d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f106423e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f106424f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public String f106425g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public String f106426h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public MaskInfo f106427i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f106428j;

    @Inject
    public p(@A.c @Y61.k z<String> zVar, @A.e @Y61.k TextWatcher textWatcher, @Y61.k com.avito.android.util.text.a aVar) {
        this.f106420b = zVar;
        this.f106421c = textWatcher;
        this.f106422d = aVar;
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106423e = cVar;
        this.f106424f = cVar;
        this.f106425g = "";
        this.f106426h = "";
        this.f106428j = P0.g(new Q('A', (char) 1040), new Q('B', (char) 1042), new Q('E', (char) 1045), new Q('K', (char) 1050), new Q('M', (char) 1052), new Q('H', (char) 1053), new Q('O', (char) 1054), new Q('P', (char) 1056), new Q('C', (char) 1057), new Q('T', (char) 1058), new Q('Y', (char) 1059), new Q('X', (char) 1061));
    }

    public final void O(r rVar, ItemWithState.State state, AttributedText attributedText) {
        CharSequence charSequenceC = null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceC = charSequence;
            } else if (attributedText != null) {
                charSequenceC = this.f106422d.c(rVar.getContext(), attributedText);
            }
            rVar.u(charSequenceC);
        } else if (state instanceof ItemWithState.State.Warning) {
            rVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            rVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            rVar.H(null);
        }
        rVar.Ef((state instanceof ItemWithState.State.Warning) || (state instanceof ItemWithState.State.Error));
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((r) eVar, (com.avito.android.items.d) aVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final String V(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        ArrayList arrayList = new ArrayList(upperCase.length());
        for (int i12 = 0; i12 < upperCase.length(); i12++) {
            char cCharAt = upperCase.charAt(i12);
            Character ch2 = (Character) this.f106428j.get(Character.valueOf(cCharAt));
            if (ch2 != null) {
                cCharAt = ch2.charValue();
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return C42745f0.O(arrayList, "", null, null, null, 62);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.c, com.avito.android.validation.j1
    @Y61.k
    public final z<com.avito.android.items.a> b() {
        return this.f106424f;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        List<MaskInfo> masks;
        Boolean enabled;
        r rVar = (r) eVar;
        com.avito.android.items.d dVar = (com.avito.android.items.d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35798g3) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C35798g3)) {
            obj = null;
        }
        C35798g3 c35798g3 = (C35798g3) obj;
        if (c35798g3 == null) {
            k(rVar, dVar);
            return;
        }
        rVar.lH();
        rVar.L10();
        i iVar = new i(dVar, this);
        rVar.aN(new n(this, iVar));
        rVar.ir(new o(this, iVar));
        String str = c35798g3.f318882b;
        String strV = str != null ? V(str) : null;
        boolean zBooleanValue = true;
        if (strV == null) {
            String str2 = this.f106425g;
            if (C43066x.K(str2)) {
                str2 = null;
            }
            rVar.oE(str2);
            String str3 = this.f106426h;
            rVar.D60(C43066x.K(str3) ? null : str3);
        } else if (C43066x.K(strV)) {
            rVar.oE(null);
            rVar.D60(null);
        } else {
            DisplayingOptions f117489n = dVar.getF117489n();
            if (f117489n == null || (masks = f117489n.getMasks()) == null) {
                masks = C42784z0.f406748b;
            }
            String strV2 = V(new C49042c(masks, true, new j(this, rVar)).b(new C35843m0(strV, 0), false).f318924a);
            if (C43066x.h0(strV, strV2, true)) {
                rVar.D60(C43066x.a0(strV, strV2, "", true));
            } else {
                rVar.D60(null);
            }
            rVar.oE(strV2);
        }
        O(rVar, c35798g3.f318881a, dVar.getF173932g());
        DisplayingOptions f117489n2 = dVar.getF117489n();
        if (f117489n2 != null && (enabled = f117489n2.getEnabled()) != null) {
            zBooleanValue = enabled.booleanValue();
        }
        rVar.setEnabled(zBooleanValue);
    }

    public final void k(@Y61.k r rVar, @Y61.k com.avito.android.items.d dVar) {
        List<MaskInfo> masks;
        Boolean enabled;
        CustomPaddings customPaddings;
        CustomPaddings customPaddings2;
        rVar.I60();
        rVar.lH();
        rVar.VC();
        rVar.L10();
        DisplayingOptions f117489n = dVar.getF117489n();
        if (f117489n == null || (masks = f117489n.getMasks()) == null) {
            masks = C42784z0.f406748b;
        }
        boolean zBooleanValue = true;
        C49042c c49042c = new C49042c(masks, true, new g(this, rVar));
        rVar.Ch(new ue.d(c49042c));
        rVar.F10(this.f106421c);
        e eVar = new e(dVar, this);
        rVar.aN(new n(this, eVar));
        rVar.ir(new o(this, eVar));
        String f117481f = dVar.getF117481f();
        Integer bottom = null;
        String strV = f117481f != null ? V(f117481f) : null;
        if (strV == null) {
            String str = this.f106425g;
            if (C43066x.K(str)) {
                str = null;
            }
            rVar.K7(str);
            String str2 = this.f106426h;
            if (C43066x.K(str2)) {
                str2 = null;
            }
            rVar.A10(str2);
        } else {
            String strV2 = V(c49042c.b(new C35843m0(strV, 0), false).f318924a);
            if (C43066x.h0(strV, strV2, true)) {
                rVar.A10(C43066x.a0(strV, strV2, "", true));
            } else {
                rVar.A10(null);
            }
            rVar.K7(strV2);
        }
        rVar.setTitle(dVar.getF117494s() ? "" : dVar.getF117480e());
        DisplayingOptions f117489n2 = dVar.getF117489n();
        Integer top = (f117489n2 == null || (customPaddings2 = f117489n2.getCustomPaddings()) == null) ? null : customPaddings2.getTop();
        DisplayingOptions f117489n3 = dVar.getF117489n();
        if (f117489n3 != null && (customPaddings = f117489n3.getCustomPaddings()) != null) {
            bottom = customPaddings.getBottom();
        }
        rVar.R8(top, bottom);
        rVar.t(new f((y) this.f106420b.d0(new d(0, k.f106413l)).d0(new d(1, l.f106414l)).N(new AJ.b(6, new m(dVar.getF79990c()))).t0(new com.avito.android.api.a(16, new h(rVar)))));
        O(rVar, dVar.getF173931f(), dVar.getF173932g());
        DisplayingOptions f117489n4 = dVar.getF117489n();
        if (f117489n4 != null && (enabled = f117489n4.getEnabled()) != null) {
            zBooleanValue = enabled.booleanValue();
        }
        rVar.setEnabled(zBooleanValue);
    }
}
