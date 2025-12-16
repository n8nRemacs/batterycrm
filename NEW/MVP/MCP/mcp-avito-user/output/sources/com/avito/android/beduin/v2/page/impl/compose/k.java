package com.avito.android.beduin.v2.page.impl.compose;

import Hi.InterfaceC13994a;
import androidx.compose.runtime.internal.P;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/k;", "", "a", "b", "Lcom/avito/android/beduin/v2/page/impl/compose/k$a;", "Lcom/avito/android/beduin/v2/page/impl/compose/k$b;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface k {

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/k$a;", "Lcom/avito/android/beduin/v2/page/impl/compose/k;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC40047a f104986a;

        public a(@Y61.k InterfaceC40047a interfaceC40047a) {
            this.f104986a = interfaceC40047a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f104986a, ((a) obj).f104986a);
        }

        public final int hashCode() {
            return this.f104986a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Beduin(value=" + this.f104986a + ')';
        }
    }

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/k$b;", "Lcom/avito/android/beduin/v2/page/impl/compose/k;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC13994a f104987a;

        public b(@Y61.k InterfaceC13994a interfaceC13994a) {
            this.f104987a = interfaceC13994a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f104987a, ((b) obj).f104987a);
        }

        public final int hashCode() {
            return this.f104987a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Screen(value=" + this.f104987a + ')';
        }
    }
}
