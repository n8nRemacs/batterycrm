package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.diff_util;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectableGroupPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.recycler.data_aware.a {

    /* compiled from: SelectableGroupPayloadCreator.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$a;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$a;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.diff_util.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9156a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final State f299495a;

            public C9156a(@k State state) {
                super(null);
                this.f299495a = state;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9156a) && this.f299495a == ((C9156a) obj).f299495a;
            }

            public final int hashCode() {
                return this.f299495a.hashCode();
            }

            @k
            public final String toString() {
                return "CheckboxStatePayload(checkboxState=" + this.f299495a + ')';
            }
        }

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.diff_util.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C9157b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f299496a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f299497b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final State f299498c;

            public C9157b(boolean z12, boolean z13, @k State state) {
                super(null);
                this.f299496a = z12;
                this.f299497b = z13;
                this.f299498c = state;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9157b)) {
                    return false;
                }
                C9157b c9157b = (C9157b) obj;
                return this.f299496a == c9157b.f299496a && this.f299497b == c9157b.f299497b && this.f299498c == c9157b.f299498c;
            }

            public final int hashCode() {
                return this.f299498c.hashCode() + r.i(Boolean.hashCode(this.f299496a) * 31, 31, this.f299497b);
            }

            @k
            public final String toString() {
                return "ClearedPayload(isExpand=" + this.f299496a + ", areGroupsCollapsible=" + this.f299497b + ", checkboxState=" + this.f299498c + ')';
            }
        }

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a$c;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/diff_util/b$a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f299499a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f299500b;

            public c(boolean z12, boolean z13) {
                super(null);
                this.f299499a = z12;
                this.f299500b = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f299499a == cVar.f299499a && this.f299500b == cVar.f299500b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f299500b) + (Boolean.hashCode(this.f299499a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ExpandedPayload(isExpand=");
                sb2.append(this.f299499a);
                sb2.append(", areGroupsCollapsible=");
                return r.x(sb2, this.f299500b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        State state;
        d.a aVar3;
        boolean z12;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF222258b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF222258b()) : null)) {
            return null;
        }
        boolean z13 = aVar instanceof d.a;
        if (z13 && (aVar2 instanceof d.a)) {
            d.a aVar4 = (d.a) aVar2;
            boolean z14 = aVar4.f299474p;
            d.a aVar5 = (d.a) aVar;
            if (z14 != aVar5.f299474p) {
                State state2 = aVar5.f299467i;
                State state3 = aVar4.f299467i;
                if (state2 != state3) {
                    return new a.C9157b(z14, aVar4.f299475q, state3);
                }
            }
        }
        if (z13 && (aVar2 instanceof d.a) && (z12 = (aVar3 = (d.a) aVar2).f299474p) != ((d.a) aVar).f299474p) {
            return new a.c(z12, aVar3.f299475q);
        }
        if (z13 && (aVar2 instanceof d.a) && (state = ((d.a) aVar2).f299467i) != ((d.a) aVar).f299467i) {
            return new a.C9156a(state);
        }
        return null;
    }
}
