package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class yg0 {
    public final xg0 a;
    public final xg0 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public yg0(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = wg0.y0;
        int i2 = wg0.x0;
        this.b = new xg0();
        xg0 xg0Var = new xg0();
        int i3 = xg0Var.a;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = d7g.d(context, attributeSetAsAttributeSet, z5d.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(z5d.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(dwc.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(dwc.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(z5d.Badge_badgeWithTextRadius, -1);
        this.e = typedArrayD.getDimension(z5d.Badge_badgeWidth, resources.getDimension(dwc.m3_badge_size));
        this.g = typedArrayD.getDimension(z5d.Badge_badgeWithTextWidth, resources.getDimension(dwc.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(z5d.Badge_badgeHeight, resources.getDimension(dwc.m3_badge_size));
        this.h = typedArrayD.getDimension(z5d.Badge_badgeWithTextHeight, resources.getDimension(dwc.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(z5d.Badge_offsetAlignmentMode, 1);
        xg0 xg0Var2 = this.b;
        int i4 = xg0Var.s0;
        xg0Var2.s0 = i4 == -2 ? 255 : i4;
        int i5 = xg0Var.u0;
        if (i5 != -2) {
            xg0Var2.u0 = i5;
        } else if (typedArrayD.hasValue(z5d.Badge_number)) {
            this.b.u0 = typedArrayD.getInt(z5d.Badge_number, 0);
        } else {
            this.b.u0 = -1;
        }
        String str = xg0Var.t0;
        if (str != null) {
            this.b.t0 = str;
        } else if (typedArrayD.hasValue(z5d.Badge_badgeText)) {
            this.b.t0 = typedArrayD.getString(z5d.Badge_badgeText);
        }
        xg0 xg0Var3 = this.b;
        xg0Var3.y0 = xg0Var.y0;
        CharSequence charSequence = xg0Var.z0;
        xg0Var3.z0 = charSequence == null ? context.getString(s2d.mtrl_badge_numberless_content_description) : charSequence;
        xg0 xg0Var4 = this.b;
        int i6 = xg0Var.A0;
        xg0Var4.A0 = i6 == 0 ? i2d.mtrl_badge_content_description : i6;
        int i7 = xg0Var.B0;
        xg0Var4.B0 = i7 == 0 ? s2d.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = xg0Var.D0;
        xg0Var4.D0 = Boolean.valueOf(bool == null || bool.booleanValue());
        xg0 xg0Var5 = this.b;
        int i8 = xg0Var.v0;
        xg0Var5.v0 = i8 == -2 ? typedArrayD.getInt(z5d.Badge_maxCharacterCount, -2) : i8;
        xg0 xg0Var6 = this.b;
        int i9 = xg0Var.w0;
        xg0Var6.w0 = i9 == -2 ? typedArrayD.getInt(z5d.Badge_maxNumber, -2) : i9;
        xg0 xg0Var7 = this.b;
        Integer num = xg0Var.o;
        xg0Var7.o = Integer.valueOf(num == null ? typedArrayD.getResourceId(z5d.Badge_badgeShapeAppearance, m5d.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        xg0 xg0Var8 = this.b;
        Integer num2 = xg0Var.X;
        xg0Var8.X = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(z5d.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        xg0 xg0Var9 = this.b;
        Integer num3 = xg0Var.Y;
        xg0Var9.Y = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(z5d.Badge_badgeWithTextShapeAppearance, m5d.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        xg0 xg0Var10 = this.b;
        Integer num4 = xg0Var.Z;
        xg0Var10.Z = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(z5d.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        xg0 xg0Var11 = this.b;
        Integer num5 = xg0Var.b;
        xg0Var11.b = Integer.valueOf(num5 == null ? gti.c(context, typedArrayD, z5d.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        xg0 xg0Var12 = this.b;
        Integer num6 = xg0Var.d;
        xg0Var12.d = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(z5d.Badge_badgeTextAppearance, m5d.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = xg0Var.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (typedArrayD.hasValue(z5d.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(gti.c(context, typedArrayD, z5d.Badge_badgeTextColor).getDefaultColor());
        } else {
            int iIntValue = this.b.d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, z5d.TextAppearance);
            typedArrayObtainStyledAttributes.getDimension(z5d.TextAppearance_android_textSize, 0.0f);
            ColorStateList colorStateListC = gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColor);
            gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColorHint);
            gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColorLink);
            typedArrayObtainStyledAttributes.getInt(z5d.TextAppearance_android_textStyle, 0);
            typedArrayObtainStyledAttributes.getInt(z5d.TextAppearance_android_typeface, 1);
            int i10 = z5d.TextAppearance_fontFamily;
            i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : z5d.TextAppearance_android_fontFamily;
            typedArrayObtainStyledAttributes.getResourceId(i10, 0);
            typedArrayObtainStyledAttributes.getString(i10);
            typedArrayObtainStyledAttributes.getBoolean(z5d.TextAppearance_textAllCaps, false);
            gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_shadowColor);
            typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowDx, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowDy, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowRadius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, z5d.MaterialTextAppearance);
            typedArrayObtainStyledAttributes2.hasValue(z5d.MaterialTextAppearance_android_letterSpacing);
            typedArrayObtainStyledAttributes2.getFloat(z5d.MaterialTextAppearance_android_letterSpacing, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(colorStateListC.getDefaultColor());
        }
        xg0 xg0Var13 = this.b;
        Integer num8 = xg0Var.C0;
        xg0Var13.C0 = Integer.valueOf(num8 == null ? typedArrayD.getInt(z5d.Badge_badgeGravity, 8388661) : num8.intValue());
        xg0 xg0Var14 = this.b;
        Integer num9 = xg0Var.E0;
        xg0Var14.E0 = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(z5d.Badge_badgeWidePadding, resources.getDimensionPixelSize(dwc.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        xg0 xg0Var15 = this.b;
        Integer num10 = xg0Var.F0;
        xg0Var15.F0 = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(z5d.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(dwc.m3_badge_with_text_vertical_padding)) : num10.intValue());
        xg0 xg0Var16 = this.b;
        Integer num11 = xg0Var.G0;
        xg0Var16.G0 = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(z5d.Badge_horizontalOffset, 0) : num11.intValue());
        xg0 xg0Var17 = this.b;
        Integer num12 = xg0Var.H0;
        xg0Var17.H0 = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(z5d.Badge_verticalOffset, 0) : num12.intValue());
        xg0 xg0Var18 = this.b;
        Integer num13 = xg0Var.I0;
        xg0Var18.I0 = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(z5d.Badge_horizontalOffsetWithText, xg0Var18.G0.intValue()) : num13.intValue());
        xg0 xg0Var19 = this.b;
        Integer num14 = xg0Var.J0;
        xg0Var19.J0 = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(z5d.Badge_verticalOffsetWithText, xg0Var19.H0.intValue()) : num14.intValue());
        xg0 xg0Var20 = this.b;
        Integer num15 = xg0Var.M0;
        xg0Var20.M0 = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(z5d.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        xg0 xg0Var21 = this.b;
        Integer num16 = xg0Var.K0;
        xg0Var21.K0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        xg0 xg0Var22 = this.b;
        Integer num17 = xg0Var.L0;
        xg0Var22.L0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        xg0 xg0Var23 = this.b;
        Boolean bool2 = xg0Var.N0;
        xg0Var23.N0 = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(z5d.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = xg0Var.x0;
        if (locale == null) {
            this.b.x0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.x0 = locale;
        }
        this.a = xg0Var;
    }
}
