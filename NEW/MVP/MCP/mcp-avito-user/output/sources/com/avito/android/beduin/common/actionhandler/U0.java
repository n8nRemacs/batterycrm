package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.action.BeduinSelectComponentAction;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSelectComponentActionHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/U0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinSelectComponentAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class U0 implements InterfaceC15523b<BeduinSelectComponentAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f100135a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f100136b;

    /* compiled from: BeduinSelectComponentActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/U0$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f100137a;

        public a(@Y61.k String str) {
            this.f100137a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f100137a, ((a) obj).f100137a);
        }

        public final int hashCode() {
            return this.f100137a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ModelId(value="), this.f100137a, ')');
        }
    }

    @Inject
    public U0() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100135a = cVar;
        this.f100136b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100135a.accept(new a(((BeduinSelectComponentAction) beduinAction).getModelId()));
    }
}
