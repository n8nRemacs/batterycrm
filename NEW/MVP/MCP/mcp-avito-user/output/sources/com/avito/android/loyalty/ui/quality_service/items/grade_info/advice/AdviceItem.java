package com.avito.android.loyalty.ui.quality_service.items.grade_info.advice;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: AdviceItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/advice/AdviceItem;", "", "Color", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AdviceItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f183869a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Color f183871c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdviceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/advice/AdviceItem$Color;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        /* renamed from: d, reason: collision with root package name */
        public static final Color f183872d;

        /* renamed from: e, reason: collision with root package name */
        public static final Color f183873e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Color[] f183874f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f183875g;

        /* renamed from: b, reason: collision with root package name */
        public final int f183876b;

        /* renamed from: c, reason: collision with root package name */
        public final int f183877c;

        static {
            Color color = new Color("DEFAULT", 0, R.attr.orange200, R.attr.orange600);
            f183872d = color;
            Color color2 = new Color("RED", 1, R.attr.red400, R.attr.red600);
            f183873e = color2;
            Color[] colorArr = {color, color2};
            f183874f = colorArr;
            f183875g = c.a(colorArr);
        }

        public Color(@InterfaceC42150f String str, @InterfaceC42150f int i12, int i13, int i14) {
            this.f183876b = i13;
            this.f183877c = i14;
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f183874f.clone();
        }
    }

    public AdviceItem(int i12, @k String str, @k Color color) {
        this.f183869a = i12;
        this.f183870b = str;
        this.f183871c = color;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdviceItem)) {
            return false;
        }
        AdviceItem adviceItem = (AdviceItem) obj;
        return this.f183869a == adviceItem.f183869a && this.f183870b.equals(adviceItem.f183870b) && this.f183871c == adviceItem.f183871c && L.f(null, null);
    }

    public final int hashCode() {
        return (this.f183871c.hashCode() + H.d(Integer.hashCode(this.f183869a) * 31, 31, this.f183870b)) * 31;
    }

    @k
    public final String toString() {
        return "AdviceItem(progress=" + this.f183869a + ", text=" + this.f183870b + ", color=" + this.f183871c + ", badge=null)";
    }
}
