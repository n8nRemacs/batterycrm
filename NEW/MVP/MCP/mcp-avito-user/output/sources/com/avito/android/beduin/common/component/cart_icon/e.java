package com.avito.android.beduin.common.component.cart_icon;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.di.B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import mU.C44012a;

/* compiled from: BeduinCartIconViewModel.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_icon/e;", "Lji/a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f100868a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C44012a f100869b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f100870c = new LinkedHashMap();

    /* compiled from: BeduinCartIconViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_icon/e$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f100871a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f100872b;

        public a(@k String str, @k String str2) {
            this.f100871a = str;
            this.f100872b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f100871a, aVar.f100871a) && L.f(this.f100872b, aVar.f100872b);
        }

        public final int hashCode() {
            return this.f100872b.hashCode() + (this.f100871a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModelKey(formId=");
            sb2.append(this.f100871a);
            sb2.append(", modelId=");
            return C22026a.c(sb2, this.f100872b, ')');
        }
    }

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C44012a c44012a) {
        this.f100868a = aVar;
        this.f100869b = c44012a;
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        Iterator it = this.f100870c.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.d) ((Map.Entry) it.next()).getValue()).dispose();
        }
    }
}
