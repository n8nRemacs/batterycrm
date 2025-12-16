package com.avito.android.select.bottom_sheet.blueprints.group.diff_util;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectableGroupPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.recycler.data_aware.a {

    /* compiled from: SelectableGroupPayloadCreator.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$a;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$b;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$a;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select.bottom_sheet.blueprints.group.diff_util.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7916a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final State f265099a;

            public C7916a(@k State state) {
                super(null);
                this.f265099a = state;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7916a) && this.f265099a == ((C7916a) obj).f265099a;
            }

            public final int hashCode() {
                return this.f265099a.hashCode();
            }

            @k
            public final String toString() {
                return "CheckboxStatePayload(checkboxState=" + this.f265099a + ')';
            }
        }

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$b;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select.bottom_sheet.blueprints.group.diff_util.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C7917b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f265100a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f265101b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final State f265102c;

            public C7917b(boolean z12, boolean z13, @k State state) {
                super(null);
                this.f265100a = z12;
                this.f265101b = z13;
                this.f265102c = state;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7917b)) {
                    return false;
                }
                C7917b c7917b = (C7917b) obj;
                return this.f265100a == c7917b.f265100a && this.f265101b == c7917b.f265101b && this.f265102c == c7917b.f265102c;
            }

            public final int hashCode() {
                return this.f265102c.hashCode() + r.i(Boolean.hashCode(this.f265100a) * 31, 31, this.f265101b);
            }

            @k
            public final String toString() {
                return "ClearedPayload(isExpand=" + this.f265100a + ", areGroupsCollapsible=" + this.f265101b + ", checkboxState=" + this.f265102c + ')';
            }
        }

        /* compiled from: SelectableGroupPayloadCreator.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a$c;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/diff_util/b$a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f265103a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f265104b;

            public c(boolean z12, boolean z13) {
                super(null);
                this.f265103a = z12;
                this.f265104b = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f265103a == cVar.f265103a && this.f265104b == cVar.f265104b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f265104b) + (Boolean.hashCode(this.f265103a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ExpandedPayload(isExpand=");
                sb2.append(this.f265103a);
                sb2.append(", areGroupsCollapsible=");
                return r.x(sb2, this.f265104b, ')');
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
        com.avito.android.select.bottom_sheet.blueprints.group.a aVar3;
        boolean z12;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF222258b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF222258b()) : null)) {
            return null;
        }
        boolean z13 = aVar instanceof com.avito.android.select.bottom_sheet.blueprints.group.a;
        if (z13 && (aVar2 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a)) {
            com.avito.android.select.bottom_sheet.blueprints.group.a aVar4 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar2;
            boolean z14 = aVar4.f265092e;
            com.avito.android.select.bottom_sheet.blueprints.group.a aVar5 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar;
            if (z14 != aVar5.f265092e) {
                State state2 = aVar5.f265094g;
                State state3 = aVar4.f265094g;
                if (state2 != state3) {
                    return new a.C7917b(z14, aVar4.f265093f, state3);
                }
            }
        }
        if (z13 && (aVar2 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a) && (z12 = (aVar3 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar2).f265092e) != ((com.avito.android.select.bottom_sheet.blueprints.group.a) aVar).f265092e) {
            return new a.c(z12, aVar3.f265093f);
        }
        if (z13 && (aVar2 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a) && (state = ((com.avito.android.select.bottom_sheet.blueprints.group.a) aVar2).f265094g) != ((com.avito.android.select.bottom_sheet.blueprints.group.a) aVar).f265094g) {
            return new a.C7916a(state);
        }
        return null;
    }
}
