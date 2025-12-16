package com.avito.android.bxcontent.mvi.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentPrivateAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/h;", "", "a", "Lcom/avito/android/bxcontent/mvi/entity/h$a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h {

    /* compiled from: BxContentPrivateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/h$a;", "Lcom/avito/android/bxcontent/mvi/entity/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final i f112293a;

        public a(@Y61.k i iVar) {
            this.f112293a = iVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f112293a, ((a) obj).f112293a);
        }

        public final int hashCode() {
            return this.f112293a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdatePrivateState(state=" + this.f112293a + ')';
        }
    }
}
