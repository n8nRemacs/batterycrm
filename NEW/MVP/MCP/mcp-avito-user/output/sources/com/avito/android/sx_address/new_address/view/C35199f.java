package com.avito.android.sx_address.new_address.view;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: DetailsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/f;", "Lcom/avito/android/sx_address/new_address/view/e;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.view.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35199f implements InterfaceC35198e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f293888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f293889b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f293890c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f293891d;

    /* compiled from: DetailsItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/f$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.view.f$a */
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f293892b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f293893c;

        public a(@Y61.k String str, boolean z12) {
            this.f293892b = str;
            this.f293893c = z12;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            return (obj instanceof a) && L.f(((a) obj).f293892b, this.f293892b);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f293892b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f293892b, aVar.f293892b) && this.f293893c == aVar.f293893c;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0, reason: from getter */
        public final boolean getF293893c() {
            return this.f293893c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f293893c) + (this.f293892b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipableDetail(chipTitle=");
            sb2.append(this.f293892b);
            sb2.append(", isSelectedChip=");
            return androidx.appcompat.app.r.x(sb2, this.f293893c, ')');
        }
    }

    public C35199f(@Y61.k ViewGroup viewGroup) {
        this.f293888a = viewGroup;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f293889b = e2VarB;
        this.f293890c = e2VarB;
        this.f293891d = new LinkedHashMap();
    }
}
