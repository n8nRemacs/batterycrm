package sK0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.C35835l0;
import j.InterfaceC42156l;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ColorFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsK0/a;", "", "<init>", "()V", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48063a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C48063a f437606a = new C48063a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f437607b = "attr";

    @l
    @InterfaceC42156l
    public static Integer c(@l Context context, @l String str, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, boolean z12) {
        Integer numValueOf;
        if (str != null && C43066x.q(str, "/", false) && z12) {
            if (context == null) {
                return null;
            }
            try {
                return C48065c.e(context, str);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        if (context != null) {
            Context context2 = (str == null || str.length() == 0) ? null : context;
            if (context2 != null) {
                int identifier = context2.getResources().getIdentifier(str, f437607b, context2.getPackageName());
                Integer numValueOf2 = Integer.valueOf(identifier);
                if (identifier <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    try {
                        numValueOf = Integer.valueOf(C35835l0.d(numValueOf2.intValue(), context));
                    } catch (Resources.NotFoundException unused2) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        return numValueOf;
                    }
                }
            }
        }
        if (context == null) {
            return null;
        }
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            num = num2;
        }
        return num;
    }

    public static /* synthetic */ Integer d(C48063a c48063a, Context context, String str, Integer num, Integer num2) {
        c48063a.getClass();
        return c(context, str, num, num2, false);
    }

    @k
    public static ColorStateList e(@k Context context, @k UniversalColor universalColor) {
        String colorKey = universalColor.getColorKey();
        Color color = universalColor.getColor();
        Integer numValueOf = color != null ? Integer.valueOf(color.getValue()) : null;
        Color colorDark = universalColor.getColorDark();
        if (colorDark == null) {
            colorDark = universalColor.getColor();
        }
        ColorStateList colorStateListF = f(context, colorKey, numValueOf, colorDark != null ? Integer.valueOf(colorDark.getValue()) : null);
        return colorStateListF == null ? ColorStateList.valueOf(16200612) : colorStateListF;
    }

    @l
    public static ColorStateList f(@k Context context, @l String str, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2) {
        ColorStateList colorStateListE;
        Context context2 = !(str == null || str.length() == 0) ? context : null;
        if (context2 != null) {
            int identifier = context2.getResources().getIdentifier(str, f437607b, context2.getPackageName());
            Integer numValueOf = Integer.valueOf(identifier);
            if (identifier <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                try {
                    colorStateListE = C35835l0.e(numValueOf.intValue(), context);
                } catch (Resources.NotFoundException unused) {
                    colorStateListE = null;
                }
                if (colorStateListE != null) {
                    return colorStateListE;
                }
            }
        }
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            num = num2;
        }
        if (num != null) {
            return ColorStateList.valueOf(num.intValue());
        }
        return null;
    }

    @InterfaceC42156l
    @InterfaceC42830m
    public static int g(@l Context context, @k FontParameter.ColorParameter colorParameter) {
        String colorKey = colorParameter.getColorKey();
        Color color = colorParameter.getColor();
        Integer numValueOf = color != null ? Integer.valueOf(color.getValue()) : null;
        Color colorDark = colorParameter.getColorDark();
        if (colorDark == null) {
            colorDark = colorParameter.getColor();
        }
        Integer numC = c(context, colorKey, numValueOf, colorDark != null ? Integer.valueOf(colorDark.getValue()) : null, true);
        if (numC != null) {
            return numC.intValue();
        }
        return 16200612;
    }

    @InterfaceC42156l
    public final int a(@l Context context, @k UniversalColor universalColor) {
        Integer numH = h(context, universalColor);
        if (numH != null) {
            return numH.intValue();
        }
        return 16200612;
    }

    @InterfaceC42156l
    public final int b(@l Context context, @l String str, @l @InterfaceC42156l Integer num) {
        Integer numC = c(context, str, num, num, false);
        if (numC != null) {
            return numC.intValue();
        }
        return 16200612;
    }

    @l
    @InterfaceC42156l
    public final Integer h(@l Context context, @k UniversalColor universalColor) {
        String colorKey = universalColor.getColorKey();
        Color color = universalColor.getColor();
        Integer numValueOf = color != null ? Integer.valueOf(color.getValue()) : null;
        Color colorDark = universalColor.getColorDark();
        if (colorDark == null) {
            colorDark = universalColor.getColor();
        }
        return c(context, colorKey, numValueOf, colorDark != null ? Integer.valueOf(colorDark.getValue()) : null, false);
    }
}
