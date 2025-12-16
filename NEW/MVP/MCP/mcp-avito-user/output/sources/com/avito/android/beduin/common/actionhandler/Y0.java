package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.action.BeduinShareAction;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinShareActionHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Y0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinShareAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Y0 implements InterfaceC15523b<BeduinShareAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f100150a;

    /* compiled from: BeduinShareActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Y0$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f100151a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f100152b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f100151a = str;
            this.f100152b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f100151a, aVar.f100151a) && kotlin.jvm.internal.L.f(this.f100152b, aVar.f100152b);
        }

        public final int hashCode() {
            return this.f100152b.hashCode() + (this.f100151a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShareItem(shareText=");
            sb2.append(this.f100151a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f100152b, ')');
        }
    }

    @Inject
    public Y0() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100150a = cVar;
        new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinShareAction beduinShareAction = (BeduinShareAction) beduinAction;
        this.f100150a.accept(new a(beduinShareAction.getShareText(), beduinShareAction.getTitle()));
    }
}
