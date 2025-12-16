package sK0;

import PK0.n;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.F5;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.f0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m3.d;

/* compiled from: Contexts.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_text-formatters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: sK0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48065c {
    @k
    public static final ColorStateList a(@k Context context, @l UniversalColor universalColor, @InterfaceC42150f int i12) {
        if (universalColor == null) {
            return C35835l0.e(i12, context);
        }
        C48063a.f437606a.getClass();
        return C48063a.e(context, universalColor);
    }

    @InterfaceC42156l
    public static final int b(@k Context context, @l UniversalColor universalColor, int i12) {
        return universalColor != null ? C48063a.f437606a.a(context, universalColor) : i12;
    }

    public static int c(Context context, String str) {
        return C48063a.f437606a.b(context, str, null);
    }

    @InterfaceC42156l
    public static final int d(@k Context context, @l UniversalColor universalColor, @InterfaceC42150f int i12) {
        return universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(i12, context);
    }

    @SuppressLint({"HardcodeStringDetector"})
    @InterfaceC42830m
    @l
    @InterfaceC42156l
    public static final Integer e(@k Context context, @k String str) {
        Integer numA = C43066x.h0(str, "text", false) ? d.a(str) : null;
        if (numA == null) {
            return null;
        }
        int iIntValue = numA.intValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{iIntValue});
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            throw new Resources.NotFoundException(AK.c.k("Resource with name = ", context.getResources().getResourceName(iIntValue), " is not defined"));
        }
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return Integer.valueOf(color);
    }

    @k
    public static final F5 f(@f0 int i12, @k Context context) {
        com.avito.android.lib.design.text_view.d.f180938a.getClass();
        n nVarA = com.avito.android.lib.design.text_view.d.a(i12, context);
        C35763c0 c35763c0 = nVarA.f12988b;
        ColorStateList colorStateListB = c35763c0 != null ? c35763c0.b() : null;
        Integer num = nVarA.f12993g;
        return new F5(nVarA.f12989c, colorStateListB, num != null ? ColorStateList.valueOf(num.intValue()) : null, nVarA.f12987a, nVarA.f12991e, nVarA.f12992f, nVarA.f12995i);
    }

    @InterfaceC42156l
    public static final int g(@l UniversalColor universalColor, @k Context context, @k String str) {
        UniversalColor universalColorUniversalColorOf$default = UniversalColorKt.universalColorOf$default(str, 0, 2, null);
        if (universalColor == null) {
            return C48063a.f437606a.a(context, universalColorUniversalColorOf$default);
        }
        C48063a c48063a = C48063a.f437606a;
        Integer numH = c48063a.h(context, universalColor);
        if (numH == null && (numH = c48063a.h(context, universalColorUniversalColorOf$default)) == null) {
            return 16200612;
        }
        return numH.intValue();
    }
}
