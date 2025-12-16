package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.yandex.mobile.ads.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class rw {

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        EF10(R.font.monetization_ads_internal_font_medium, R.font.monetization_ads_internal_font_bold);


        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f389679f = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f389680a;

        /* renamed from: b, reason: collision with root package name */
        private final int f389681b;

        /* renamed from: c, reason: collision with root package name */
        private final int f389682c;

        /* renamed from: d, reason: collision with root package name */
        private final int f389683d;

        a(int i12, int i13) {
            this.f389680a = i;
            this.f389681b = i;
            this.f389682c = i12;
            this.f389683d = i13;
        }

        public final int a() {
            return this.f389683d;
        }

        public final int b() {
            return this.f389680a;
        }

        public final int c() {
            return this.f389682c;
        }

        public final int d() {
            return this.f389681b;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f389684a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[0] = 1;
            f389684a = iArr;
        }
    }

    @Y61.l
    public static qw a(@Y61.k Context context) throws Resources.NotFoundException {
        Typeface font;
        Typeface font2;
        Typeface font3;
        Typeface font4;
        v11 v11VarA = q21.b().a(context);
        String strH = v11VarA != null ? v11VarA.h() : null;
        if (strH == null) {
            return null;
        }
        try {
            a aVarValueOf = a.valueOf(strH);
            if (b.f389684a[aVarValueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                font = context.getResources().getFont(aVarValueOf.b());
            } catch (Exception unused) {
                font = null;
            }
            try {
                font2 = context.getResources().getFont(aVarValueOf.d());
            } catch (Exception unused2) {
                font2 = null;
            }
            try {
                font3 = context.getResources().getFont(aVarValueOf.c());
            } catch (Exception unused3) {
                font3 = null;
            }
            try {
                font4 = context.getResources().getFont(aVarValueOf.a());
            } catch (Exception unused4) {
                font4 = null;
            }
            return new qw(font, font2, font3, font4);
        } catch (Exception unused5) {
            return null;
        }
    }
}
