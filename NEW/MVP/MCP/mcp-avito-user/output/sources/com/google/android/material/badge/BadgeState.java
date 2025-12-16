package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.T;
import j.e0;
import j.f0;
import j.m0;
import j.r;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes6.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f355843a;

    /* renamed from: b, reason: collision with root package name */
    public final State f355844b;

    /* renamed from: c, reason: collision with root package name */
    public final float f355845c;

    /* renamed from: d, reason: collision with root package name */
    public final float f355846d;

    /* renamed from: e, reason: collision with root package name */
    public final float f355847e;

    /* renamed from: f, reason: collision with root package name */
    public final float f355848f;

    /* renamed from: g, reason: collision with root package name */
    public final float f355849g;

    /* renamed from: h, reason: collision with root package name */
    public final float f355850h;

    /* renamed from: i, reason: collision with root package name */
    public final float f355851i;

    /* renamed from: j, reason: collision with root package name */
    public final int f355852j;

    /* renamed from: k, reason: collision with root package name */
    public final int f355853k;

    /* renamed from: l, reason: collision with root package name */
    public final int f355854l;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @m0
        public int f355855b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC42156l
        public Integer f355856c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC42156l
        public Integer f355857d;

        /* renamed from: e, reason: collision with root package name */
        @f0
        public Integer f355858e;

        /* renamed from: f, reason: collision with root package name */
        @f0
        public Integer f355859f;

        /* renamed from: g, reason: collision with root package name */
        @f0
        public Integer f355860g;

        /* renamed from: h, reason: collision with root package name */
        @f0
        public Integer f355861h;

        /* renamed from: i, reason: collision with root package name */
        @f0
        public Integer f355862i;

        /* renamed from: m, reason: collision with root package name */
        public Locale f355866m;

        /* renamed from: n, reason: collision with root package name */
        @P
        public CharSequence f355867n;

        /* renamed from: o, reason: collision with root package name */
        @T
        public int f355868o;

        /* renamed from: p, reason: collision with root package name */
        @e0
        public int f355869p;

        /* renamed from: q, reason: collision with root package name */
        public Integer f355870q;

        /* renamed from: s, reason: collision with root package name */
        @r
        public Integer f355872s;

        /* renamed from: t, reason: collision with root package name */
        @r
        public Integer f355873t;

        /* renamed from: u, reason: collision with root package name */
        @r
        public Integer f355874u;

        /* renamed from: v, reason: collision with root package name */
        @r
        public Integer f355875v;

        /* renamed from: w, reason: collision with root package name */
        @r
        public Integer f355876w;

        /* renamed from: x, reason: collision with root package name */
        @r
        public Integer f355877x;

        /* renamed from: j, reason: collision with root package name */
        public int f355863j = 255;

        /* renamed from: k, reason: collision with root package name */
        public int f355864k = -2;

        /* renamed from: l, reason: collision with root package name */
        public int f355865l = -2;

        /* renamed from: r, reason: collision with root package name */
        public Boolean f355871r = Boolean.TRUE;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            @N
            public final State createFromParcel(@N Parcel parcel) {
                State state = new State();
                state.f355863j = 255;
                state.f355864k = -2;
                state.f355865l = -2;
                state.f355871r = Boolean.TRUE;
                state.f355855b = parcel.readInt();
                state.f355856c = (Integer) parcel.readSerializable();
                state.f355857d = (Integer) parcel.readSerializable();
                state.f355858e = (Integer) parcel.readSerializable();
                state.f355859f = (Integer) parcel.readSerializable();
                state.f355860g = (Integer) parcel.readSerializable();
                state.f355861h = (Integer) parcel.readSerializable();
                state.f355862i = (Integer) parcel.readSerializable();
                state.f355863j = parcel.readInt();
                state.f355864k = parcel.readInt();
                state.f355865l = parcel.readInt();
                state.f355867n = parcel.readString();
                state.f355868o = parcel.readInt();
                state.f355870q = (Integer) parcel.readSerializable();
                state.f355872s = (Integer) parcel.readSerializable();
                state.f355873t = (Integer) parcel.readSerializable();
                state.f355874u = (Integer) parcel.readSerializable();
                state.f355875v = (Integer) parcel.readSerializable();
                state.f355876w = (Integer) parcel.readSerializable();
                state.f355877x = (Integer) parcel.readSerializable();
                state.f355871r = (Boolean) parcel.readSerializable();
                state.f355866m = (Locale) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            parcel.writeInt(this.f355855b);
            parcel.writeSerializable(this.f355856c);
            parcel.writeSerializable(this.f355857d);
            parcel.writeSerializable(this.f355858e);
            parcel.writeSerializable(this.f355859f);
            parcel.writeSerializable(this.f355860g);
            parcel.writeSerializable(this.f355861h);
            parcel.writeSerializable(this.f355862i);
            parcel.writeInt(this.f355863j);
            parcel.writeInt(this.f355864k);
            parcel.writeInt(this.f355865l);
            CharSequence charSequence = this.f355867n;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f355868o);
            parcel.writeSerializable(this.f355870q);
            parcel.writeSerializable(this.f355872s);
            parcel.writeSerializable(this.f355873t);
            parcel.writeSerializable(this.f355874u);
            parcel.writeSerializable(this.f355875v);
            parcel.writeSerializable(this.f355876w);
            parcel.writeSerializable(this.f355877x);
            parcel.writeSerializable(this.f355871r);
            parcel.writeSerializable(this.f355866m);
        }
    }

    public BadgeState(Context context, @P State state) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i12 = b.f355879p;
        int i13 = b.f355878o;
        this.f355844b = new State();
        state = state == null ? new State() : state;
        int i14 = state.f355855b;
        boolean z12 = true;
        if (i14 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i14);
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
            } catch (IOException | XmlPullParserException e12) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(androidx.appcompat.app.r.m(i14, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e12);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = G.d(context, attributeSetAsAttributeSet, R.styleable.Badge, i12, styleAttribute == 0 ? i13 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f355845c = typedArrayD.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f355851i = typedArrayD.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f355852j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f355853k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f355846d = typedArrayD.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.f355847e = typedArrayD.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
        this.f355849g = typedArrayD.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f355848f = typedArrayD.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
        this.f355850h = typedArrayD.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f355854l = typedArrayD.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        State state2 = this.f355844b;
        int i15 = state.f355863j;
        state2.f355863j = i15 == -2 ? 255 : i15;
        CharSequence charSequence = state.f355867n;
        state2.f355867n = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f355844b;
        int i16 = state.f355868o;
        state3.f355868o = i16 == 0 ? R.plurals.mtrl_badge_content_description : i16;
        int i17 = state.f355869p;
        state3.f355869p = i17 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i17;
        Boolean bool = state.f355871r;
        if (bool != null && !bool.booleanValue()) {
            z12 = false;
        }
        state3.f355871r = Boolean.valueOf(z12);
        State state4 = this.f355844b;
        int i18 = state.f355865l;
        state4.f355865l = i18 == -2 ? typedArrayD.getInt(R.styleable.Badge_maxCharacterCount, 4) : i18;
        int i19 = state.f355864k;
        if (i19 != -2) {
            this.f355844b.f355864k = i19;
        } else if (typedArrayD.hasValue(R.styleable.Badge_number)) {
            this.f355844b.f355864k = typedArrayD.getInt(R.styleable.Badge_number, 0);
        } else {
            this.f355844b.f355864k = -1;
        }
        State state5 = this.f355844b;
        Integer num = state.f355859f;
        state5.f355859f = Integer.valueOf(num == null ? typedArrayD.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state6 = this.f355844b;
        Integer num2 = state.f355860g;
        state6.f355860g = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        State state7 = this.f355844b;
        Integer num3 = state.f355861h;
        state7.f355861h = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state8 = this.f355844b;
        Integer num4 = state.f355862i;
        state8.f355862i = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        State state9 = this.f355844b;
        Integer num5 = state.f355856c;
        state9.f355856c = Integer.valueOf(num5 == null ? com.google.android.material.resources.c.b(typedArrayD, context, R.styleable.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        State state10 = this.f355844b;
        Integer num6 = state.f355858e;
        state10.f355858e = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.f355857d;
        if (num7 != null) {
            this.f355844b.f355857d = num7;
        } else if (typedArrayD.hasValue(R.styleable.Badge_badgeTextColor)) {
            this.f355844b.f355857d = Integer.valueOf(com.google.android.material.resources.c.b(typedArrayD, context, R.styleable.Badge_badgeTextColor).getDefaultColor());
        } else {
            this.f355844b.f355857d = Integer.valueOf(new com.google.android.material.resources.d(context, this.f355844b.f355858e.intValue()).f356996j.getDefaultColor());
        }
        State state11 = this.f355844b;
        Integer num8 = state.f355870q;
        state11.f355870q = Integer.valueOf(num8 == null ? typedArrayD.getInt(R.styleable.Badge_badgeGravity, 8388661) : num8.intValue());
        State state12 = this.f355844b;
        Integer num9 = state.f355872s;
        state12.f355872s = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : num9.intValue());
        State state13 = this.f355844b;
        Integer num10 = state.f355873t;
        state13.f355873t = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : num10.intValue());
        State state14 = this.f355844b;
        Integer num11 = state.f355874u;
        state14.f355874u = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state14.f355872s.intValue()) : num11.intValue());
        State state15 = this.f355844b;
        Integer num12 = state.f355875v;
        state15.f355875v = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state15.f355873t.intValue()) : num12.intValue());
        State state16 = this.f355844b;
        Integer num13 = state.f355876w;
        state16.f355876w = Integer.valueOf(num13 == null ? 0 : num13.intValue());
        State state17 = this.f355844b;
        Integer num14 = state.f355877x;
        state17.f355877x = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        typedArrayD.recycle();
        Locale locale = state.f355866m;
        if (locale == null) {
            this.f355844b.f355866m = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f355844b.f355866m = locale;
        }
        this.f355843a = state;
    }

    public final boolean a() {
        return this.f355844b.f355864k != -1;
    }
}
