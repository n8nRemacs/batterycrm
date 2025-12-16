package com.avito.android.select.bottom_sheet.blueprints.group;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f265089b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f265090c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.select.variant.a> f265091d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f265092e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f265093f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final State f265094g;

    /* compiled from: SelectableGroupItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select.bottom_sheet.blueprints.group.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7915a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.f181147b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k List<com.avito.android.select.variant.a> list, boolean z12, boolean z13, @Y61.k State state) {
        this.f265089b = str;
        this.f265090c = str2;
        this.f265091d = list;
        this.f265092e = z12;
        this.f265093f = z13;
        this.f265094g = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(a aVar, ArrayList arrayList, boolean z12, State state, int i12) {
        String str = aVar.f265089b;
        String str2 = aVar.f265090c;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = aVar.f265091d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            z12 = aVar.f265092e;
        }
        boolean z13 = z12;
        boolean z14 = aVar.f265093f;
        if ((i12 & 32) != 0) {
            state = aVar.f265094g;
        }
        aVar.getClass();
        return new a(str, str2, list2, z13, z14, state);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f265089b, aVar.f265089b) && L.f(this.f265090c, aVar.f265090c) && L.f(this.f265091d, aVar.f265091d) && this.f265092e == aVar.f265092e && this.f265093f == aVar.f265093f && this.f265094g == aVar.f265094g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF262951b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262951b() {
        return this.f265089b;
    }

    public final int hashCode() {
        return this.f265094g.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.e(H.d(this.f265089b.hashCode() * 31, 31, this.f265090c), 31, this.f265091d), 31, this.f265092e), 31, this.f265093f);
    }

    @Y61.k
    public final String toString() {
        return "SelectableGroupItem(stringId=" + this.f265089b + ", title=" + this.f265090c + ", subItems=" + this.f265091d + ", isExpanded=" + this.f265092e + ", areGroupsCollapsible=" + this.f265093f + ", checkboxState=" + this.f265094g + ')';
    }

    public /* synthetic */ a(String str, String str2, List list, boolean z12, boolean z13, State state, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? false : z12, z13, state);
    }
}
