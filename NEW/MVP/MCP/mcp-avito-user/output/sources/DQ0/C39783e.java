package dq0;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.mvi.entity.ClearActionState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ldq0/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dq0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39783e extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f394134o = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f394135b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ClearActionState f394136c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f394137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f394138e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Set<ParcelableEntity<String>> f394139f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<ParcelableEntity<String>> f394140g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f394141h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f394142i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC39780b f394143j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final InterfaceC19587b f394144k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<com.avito.android.select.variant.a> f394145l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C39779a f394146m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f394147n;

    /* compiled from: SelectState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/e$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39783e(boolean z12, @k ClearActionState clearActionState, @k String str, boolean z13, @k Set<ParcelableEntity<String>> set, @k List<? extends ParcelableEntity<String>> list, @k List<? extends com.avito.conveyor_item.a> list2, @k List<? extends com.avito.conveyor_item.a> list3, @k InterfaceC39780b interfaceC39780b, @l InterfaceC19587b interfaceC19587b, @k List<com.avito.android.select.variant.a> list4, @k C39779a c39779a, @l String str2) {
        this.f394135b = z12;
        this.f394136c = clearActionState;
        this.f394137d = str;
        this.f394138e = z13;
        this.f394139f = set;
        this.f394140g = list;
        this.f394141h = list2;
        this.f394142i = list3;
        this.f394143j = interfaceC39780b;
        this.f394144k = interfaceC19587b;
        this.f394145l = list4;
        this.f394146m = c39779a;
        this.f394147n = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C39783e a(C39783e c39783e, ClearActionState clearActionState, String str, boolean z12, Set set, List list, List list2, List list3, InterfaceC39780b interfaceC39780b, InterfaceC19587b interfaceC19587b, ArrayList arrayList, int i12) {
        boolean z13 = c39783e.f394135b;
        ClearActionState clearActionState2 = (i12 & 2) != 0 ? c39783e.f394136c : clearActionState;
        String str2 = (i12 & 4) != 0 ? c39783e.f394137d : str;
        boolean z14 = (i12 & 8) != 0 ? c39783e.f394138e : z12;
        Set set2 = (i12 & 16) != 0 ? c39783e.f394139f : set;
        List list4 = (i12 & 32) != 0 ? c39783e.f394140g : list;
        List list5 = (i12 & 64) != 0 ? c39783e.f394141h : list2;
        List list6 = (i12 & 128) != 0 ? c39783e.f394142i : list3;
        InterfaceC39780b interfaceC39780b2 = (i12 & 256) != 0 ? c39783e.f394143j : interfaceC39780b;
        InterfaceC19587b interfaceC19587b2 = (i12 & 512) != 0 ? c39783e.f394144k : interfaceC19587b;
        List list7 = (i12 & 1024) != 0 ? c39783e.f394145l : arrayList;
        C39779a c39779a = c39783e.f394146m;
        String str3 = c39783e.f394147n;
        c39783e.getClass();
        return new C39783e(z13, clearActionState2, str2, z14, set2, list4, list5, list6, interfaceC39780b2, interfaceC19587b2, list7, c39779a, str3);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39783e)) {
            return false;
        }
        C39783e c39783e = (C39783e) obj;
        return this.f394135b == c39783e.f394135b && this.f394136c == c39783e.f394136c && L.f(this.f394137d, c39783e.f394137d) && this.f394138e == c39783e.f394138e && L.f(this.f394139f, c39783e.f394139f) && L.f(this.f394140g, c39783e.f394140g) && L.f(this.f394141h, c39783e.f394141h) && L.f(this.f394142i, c39783e.f394142i) && L.f(this.f394143j, c39783e.f394143j) && L.f(this.f394144k, c39783e.f394144k) && L.f(this.f394145l, c39783e.f394145l) && L.f(this.f394146m, c39783e.f394146m) && L.f(this.f394147n, c39783e.f394147n);
    }

    public final int hashCode() {
        int iHashCode = (this.f394143j.hashCode() + H.e(H.e(H.e(m.g(this.f394139f, r.i(H.d((this.f394136c.hashCode() + (Boolean.hashCode(this.f394135b) * 31)) * 31, 31, this.f394137d), 31, this.f394138e), 31), 31, this.f394140g), 31, this.f394141h), 31, this.f394142i)) * 31;
        InterfaceC19587b interfaceC19587b = this.f394144k;
        int iHashCode2 = (this.f394146m.hashCode() + H.e((iHashCode + (interfaceC19587b == null ? 0 : interfaceC19587b.hashCode())) * 31, 31, this.f394145l)) * 31;
        String str = this.f394147n;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectState(isRedesigned=");
        sb2.append(this.f394135b);
        sb2.append(", clearAction=");
        sb2.append(this.f394136c);
        sb2.append(", query=");
        sb2.append(this.f394137d);
        sb2.append(", submitButtonVisible=");
        sb2.append(this.f394138e);
        sb2.append(", selectedItems=");
        sb2.append(this.f394139f);
        sb2.append(", lastData=");
        sb2.append(this.f394140g);
        sb2.append(", items=");
        sb2.append(this.f394141h);
        sb2.append(", oldItems=");
        sb2.append(this.f394142i);
        sb2.append(", contentState=");
        sb2.append(this.f394143j);
        sb2.append(", nextPageDetails=");
        sb2.append(this.f394144k);
        sb2.append(", candyItems=");
        sb2.append(this.f394145l);
        sb2.append(", config=");
        sb2.append(this.f394146m);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f394147n, ')');
    }
}
