package com.avito.android.mortgage.landing.list.items.programs.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ProgramsPayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/payload/a;", "", "a", "Lcom/avito/android/mortgage/landing/list/items/programs/payload/a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ProgramsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/programs/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.programs.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5910a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f199919a;

        public C5910a(@k ArrayList arrayList) {
            this.f199919a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5910a) && this.f199919a.equals(((C5910a) obj).f199919a);
        }

        public final int hashCode() {
            return this.f199919a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ProgramsUpdatePayload(items="), this.f199919a, ')');
        }
    }
}
