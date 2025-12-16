package com.avito.android.advert.item.realty_usp;

import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UspChip.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/q;", "Lcom/avito/android/lib/design/chips/h;", "Lcom/avito/android/advert/item/realty_usp/p;", "<init>", "()V", "a", "b", "Lcom/avito/android/advert/item/realty_usp/q$a;", "Lcom/avito/android/advert/item/realty_usp/q$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class q implements com.avito.android.lib.design.chips.h, p {

    /* compiled from: UspChip.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/q$a;", "Lcom/avito/android/advert/item/realty_usp/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CharSequence f78437b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f78438c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f78439d;

        public a(@Y61.k CharSequence charSequence, @Y61.k String str) {
            super(null);
            this.f78437b = charSequence;
            this.f78438c = str;
            this.f78439d = str;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (obj instanceof a) {
                return L.f(((a) obj).f78437b, this.f78437b);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W, reason: from getter */
        public final CharSequence getF78437b() {
            return this.f78437b;
        }

        @Override // com.avito.android.advert.item.realty_usp.p
        @Y61.k
        public final CharSequence a() {
            return this.f78439d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f78437b, aVar.f78437b) && L.f(this.f78438c, aVar.f78438c);
        }

        public final int hashCode() {
            return this.f78438c.hashCode() + (this.f78437b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Chip(chipTitle=" + ((Object) this.f78437b) + ", rawText=" + ((Object) this.f78438c) + ')';
        }
    }

    /* compiled from: UspChip.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/q$b;", "Lcom/avito/android/advert/item/realty_usp/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f78440b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f78441c;

        public b(@Y61.k String str) {
            super(null);
            this.f78440b = str;
            this.f78441c = str;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (obj instanceof b) {
                return L.f(((b) obj).f78440b, this.f78440b);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF78437b() {
            return this.f78440b;
        }

        @Override // com.avito.android.advert.item.realty_usp.p
        @Y61.k
        public final CharSequence a() {
            return this.f78441c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f78440b, ((b) obj).f78440b);
        }

        public final int hashCode() {
            return this.f78440b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ExpandChip(chipTitle=" + ((Object) this.f78440b) + ')';
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
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
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF302488d() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    public final Integer getIconColor() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean isActive() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF202422g() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    public q() {
    }
}
