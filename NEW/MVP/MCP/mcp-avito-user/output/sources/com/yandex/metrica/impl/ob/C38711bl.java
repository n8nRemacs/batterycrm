package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.yandex.metrica.impl.ob.C39107rl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38711bl extends C39107rl {

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public String f380228h;

    /* renamed from: i, reason: collision with root package name */
    public final int f380229i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public Integer f380230j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f380231k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final b f380232l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final Float f380233m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final Float f380234n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public final Float f380235o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public final String f380236p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public final Boolean f380237q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public final Boolean f380238r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public Integer f380239s;

    /* renamed from: com.yandex.metrica.impl.ob.bl$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f380240a;

        static {
            int[] iArr = new int[TextUtils.TruncateAt.values().length];
            f380240a = iArr;
            try {
                iArr[TextUtils.TruncateAt.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f380240a[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f380240a[TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f380240a[TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bl$b */
    public enum b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);


        /* renamed from: a, reason: collision with root package name */
        @j.N
        final String f380248a;

        b(@j.N String str) {
            this.f380248a = str;
        }
    }

    public C38711bl(@j.N String str, @j.N String str2, @j.P C39107rl.b bVar, int i12, boolean z12, @j.N C39107rl.a aVar, @j.N String str3, @j.P Float f12, @j.P Float f13, @j.P Float f14, @j.P String str4, @j.P Boolean bool, @j.P Boolean bool2, boolean z13, int i13, @j.N b bVar2) {
        super(str, str2, null, i12, z12, C39107rl.c.VIEW, aVar);
        this.f380228h = str3;
        this.f380229i = i13;
        this.f380232l = bVar2;
        this.f380231k = z13;
        this.f380233m = f12;
        this.f380234n = f13;
        this.f380235o = f14;
        this.f380236p = str4;
        this.f380237q = bool;
        this.f380238r = bool2;
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    public boolean a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    public String toString() {
        return "TextViewElement{mText='" + this.f380228h + "', mVisibleTextLength=" + this.f380229i + ", mOriginalTextLength=" + this.f380230j + ", mIsVisible=" + this.f380231k + ", mTextShorteningType=" + this.f380232l + ", mSizePx=" + this.f380233m + ", mSizeDp=" + this.f380234n + ", mSizeSp=" + this.f380235o + ", mColor='" + this.f380236p + "', mIsBold=" + this.f380237q + ", mIsItalic=" + this.f380238r + ", mRelativeTextSize=" + this.f380239s + ", mClassName='" + this.f381777a + "', mId='" + this.f381778b + "', mParseFilterReason=" + this.f381779c + ", mDepth=" + this.f381780d + ", mListItem=" + this.f381781e + ", mViewType=" + this.f381782f + ", mClassType=" + this.f381783g + '}';
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    @j.P
    public C39107rl.b a(@j.N Ak ak2) {
        C39107rl.b bVar = this.f381779c;
        return bVar == null ? ak2.a(this.f380228h) : bVar;
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    @j.P
    public JSONArray a(@j.N C38861hl c38861hl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String strSubstring = this.f380228h;
            if (strSubstring.length() > c38861hl.f380744l) {
                this.f380230j = Integer.valueOf(this.f380228h.length());
                strSubstring = this.f380228h.substring(0, c38861hl.f380744l);
            }
            jSONObject.put("t", "TEXT");
            jSONObject.put("vl", strSubstring);
            jSONObject.put("i", a(c38861hl, strSubstring));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    @j.N
    private JSONObject a(@j.N C38861hl c38861hl, @j.N String str) {
        int length;
        JSONObject jSONObject = new JSONObject();
        try {
            if (c38861hl.f380733a) {
                jSONObject.putOpt("sp", this.f380233m).putOpt("sd", this.f380234n).putOpt("ss", this.f380235o);
            }
            if (c38861hl.f380734b) {
                jSONObject.put("rts", this.f380239s);
            }
            if (c38861hl.f380736d) {
                jSONObject.putOpt("c", this.f380236p).putOpt("ib", this.f380237q).putOpt("ii", this.f380238r);
            }
            if (c38861hl.f380735c) {
                jSONObject.put("vtl", this.f380229i).put("iv", this.f380231k).put("tst", this.f380232l.f380248a);
            }
            Integer num = this.f380230j;
            if (num != null) {
                length = num.intValue();
            } else {
                length = this.f380228h.length();
            }
            if (c38861hl.f380739g) {
                jSONObject.put("tl", str.length()).put("otl", length);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
