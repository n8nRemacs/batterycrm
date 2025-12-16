package com.avito.android.beduin.v2.page.impl.compose;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/l;", "", "a", "b", "Lcom/avito/android/beduin/v2/page/impl/compose/l$a;", "Lcom/avito/android/beduin/v2/page/impl/compose/l$b;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface l {

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/l$a;", "Lcom/avito/android/beduin/v2/page/impl/compose/l;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinOneTimeEvent f104988a;

        public a(@Y61.k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f104988a = beduinOneTimeEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f104988a, ((a) obj).f104988a);
        }

        public final int hashCode() {
            return this.f104988a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Beduin(value=" + this.f104988a + ')';
        }
    }

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/l$b;", "Lcom/avito/android/beduin/v2/page/impl/compose/l;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Hi.c f104989a;

        public b(@Y61.k Hi.c cVar) {
            this.f104989a = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f104989a, ((b) obj).f104989a);
        }

        public final int hashCode() {
            return this.f104989a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Screen(value=" + this.f104989a + ')';
        }
    }
}
