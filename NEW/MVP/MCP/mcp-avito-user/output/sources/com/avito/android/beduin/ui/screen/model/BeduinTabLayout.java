package com.avito.android.beduin.ui.screen.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import yi.C50254a;

/* compiled from: BeduinTabLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/screen/model/BeduinTabLayout;", "", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f104409a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Style f104410b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<C50254a> f104411c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinTabLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/model/BeduinTabLayout$Style;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f104412b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Style[] f104413c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f104414d;

        static {
            Style style = new Style("BIG", 0);
            f104412b = style;
            Style[] styleArr = {style};
            f104413c = styleArr;
            f104414d = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f104413c.clone();
        }
    }

    public BeduinTabLayout(int i12, @k Style style, @k List<C50254a> list) {
        this.f104409a = i12;
        this.f104410b = style;
        this.f104411c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinTabLayout)) {
            return false;
        }
        BeduinTabLayout beduinTabLayout = (BeduinTabLayout) obj;
        return this.f104409a == beduinTabLayout.f104409a && this.f104410b == beduinTabLayout.f104410b && L.f(this.f104411c, beduinTabLayout.f104411c);
    }

    public final int hashCode() {
        return this.f104411c.hashCode() + ((this.f104410b.hashCode() + (Integer.hashCode(this.f104409a) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTabLayout(selectedPosition=");
        sb2.append(this.f104409a);
        sb2.append(", style=");
        sb2.append(this.f104410b);
        sb2.append(", tabs=");
        return H.p(sb2, this.f104411c, ')');
    }
}
