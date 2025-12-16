package com.avito.android.verification.inn;

import com.akita.compose.component.accordion.s;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InnListPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/inn/a;", "", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: InnListPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/a$a;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.inn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f323872a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f323873b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f323874c;

        public C10030a(@Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.l Integer num) {
            this.f323872a = arrayList;
            this.f323873b = arrayList2;
            this.f323874c = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10030a)) {
                return false;
            }
            C10030a c10030a = (C10030a) obj;
            return this.f323872a.equals(c10030a.f323872a) && this.f323873b.equals(c10030a.f323873b) && L.f(this.f323874c, c10030a.f323874c);
        }

        public final int hashCode() {
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f323873b, this.f323872a.hashCode() * 31, 31);
            Integer num = this.f323874c;
            return iG2 + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListState(allItems=");
            sb2.append(this.f323872a);
            sb2.append(", itemsToRender=");
            sb2.append(this.f323873b);
            sb2.append(", itemIndexToScroll=");
            return s.j(sb2, this.f323874c, ')');
        }
    }

    @Inject
    public a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0183  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.verification.inn.a.C10030a a(@Y61.k java.util.List r13, @Y61.l java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.inn.a.a(java.util.List, java.util.Map):com.avito.android.verification.inn.a$a");
    }

    public static /* synthetic */ C10030a b(a aVar, List list) {
        aVar.getClass();
        return a(list, null);
    }
}
