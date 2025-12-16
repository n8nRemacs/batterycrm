package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinScrollToFirstInvalidModelAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.InterfaceC43779a;

/* compiled from: BeduinScrollToFirstInvalidModelActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/S0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinScrollToFirstInvalidModelAction;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.di.B
/* loaded from: classes11.dex */
public final class S0 implements InterfaceC15523b<BeduinScrollToFirstInvalidModelAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100126a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f100127b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f100128c;

    /* compiled from: BeduinScrollToFirstInvalidModelActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/S0$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f100129a;

        /* renamed from: b, reason: collision with root package name */
        public final int f100130b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f100131c;

        public a(@Y61.k String str, int i12, boolean z12) {
            this.f100129a = str;
            this.f100130b = i12;
            this.f100131c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f100129a, aVar.f100129a) && this.f100130b == aVar.f100130b && this.f100131c == aVar.f100131c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100131c) + androidx.appcompat.app.r.e(this.f100130b, this.f100129a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollParameters(formId=");
            sb2.append(this.f100129a);
            sb2.append(", invalidComponentPosition=");
            sb2.append(this.f100130b);
            sb2.append(", requireFocus=");
            return androidx.appcompat.app.r.x(sb2, this.f100131c, ')');
        }
    }

    @Inject
    public S0(@Y61.k com.avito.android.beduin.common.form.store.b bVar) {
        this.f100126a = bVar;
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100127b = cVar;
        this.f100128c = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinScrollToFirstInvalidModelAction beduinScrollToFirstInvalidModelAction = (BeduinScrollToFirstInvalidModelAction) beduinAction;
        InterfaceC43779a interfaceC43779a = this.f100126a.get(beduinScrollToFirstInvalidModelAction.getFormId());
        if (interfaceC43779a == null) {
            return;
        }
        Iterator it = interfaceC43779a.a().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (!((BeduinModel) it.next()).isValid()) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 <= -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String formId = beduinScrollToFirstInvalidModelAction.getFormId();
            Boolean requireFocus = beduinScrollToFirstInvalidModelAction.getRequireFocus();
            this.f100127b.accept(new a(formId, iIntValue, requireFocus != null ? requireFocus.booleanValue() : false));
        }
    }
}
