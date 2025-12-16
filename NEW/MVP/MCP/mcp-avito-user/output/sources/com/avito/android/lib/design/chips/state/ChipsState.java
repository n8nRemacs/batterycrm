package com.avito.android.lib.design.chips.state;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.chips.h;
import j.U;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/chips/state/ChipsState;", "", "DisplayType", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChipsState {

    /* renamed from: a, reason: collision with root package name */
    public final int f178751a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DisplayType f178752b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f178753c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<h> f178754d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final p<h, Boolean, G0> f178755e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChipsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/state/ChipsState$DisplayType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisplayType {

        /* renamed from: b, reason: collision with root package name */
        public static final DisplayType f178756b;

        /* renamed from: c, reason: collision with root package name */
        public static final DisplayType f178757c;

        /* renamed from: d, reason: collision with root package name */
        public static final DisplayType f178758d;

        /* renamed from: e, reason: collision with root package name */
        public static final DisplayType f178759e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ DisplayType[] f178760f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178761g;

        static {
            DisplayType displayType = new DisplayType("SINGLE_LINE_FIXED", 0);
            f178756b = displayType;
            DisplayType displayType2 = new DisplayType("SINGLE_LINE_STRETCH", 1);
            f178757c = displayType2;
            DisplayType displayType3 = new DisplayType("SINGLE_LINE_SCROLLABLE", 2);
            f178758d = displayType3;
            DisplayType displayType4 = new DisplayType("MULTIPLE_LINES", 3);
            f178759e = displayType4;
            DisplayType[] displayTypeArr = {displayType, displayType2, displayType3, displayType4};
            f178760f = displayTypeArr;
            f178761g = c.a(displayTypeArr);
        }

        public DisplayType() {
            throw null;
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) f178760f.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChipsState(@U int i12, @k DisplayType displayType, @l Y41.l<? super Integer, G0> lVar, @k List<? extends h> list, @l p<? super h, ? super Boolean, G0> pVar) {
        this.f178751a = i12;
        this.f178752b = displayType;
        this.f178753c = lVar;
        this.f178754d = list;
        this.f178755e = pVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipsState)) {
            return false;
        }
        ChipsState chipsState = (ChipsState) obj;
        return this.f178751a == chipsState.f178751a && this.f178752b == chipsState.f178752b && L.f(this.f178753c, chipsState.f178753c) && L.f(this.f178754d, chipsState.f178754d) && L.f(this.f178755e, chipsState.f178755e);
    }

    public final int hashCode() {
        int iHashCode = (this.f178752b.hashCode() + (Integer.hashCode(this.f178751a) * 31)) * 31;
        Y41.l<Integer, G0> lVar = this.f178753c;
        int iE2 = H.e((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f178754d);
        p<h, Boolean, G0> pVar = this.f178755e;
        return iE2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ChipsState(contentInsets=" + this.f178751a + ", displayType=" + this.f178752b + ", onScrollChange=" + this.f178753c + ", data=" + this.f178754d + ", onChange=" + this.f178755e + ')';
    }

    public /* synthetic */ ChipsState(int i12, DisplayType displayType, Y41.l lVar, List list, p pVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, displayType, (i13 & 4) != 0 ? null : lVar, list, (i13 & 16) != 0 ? null : pVar);
    }
}
