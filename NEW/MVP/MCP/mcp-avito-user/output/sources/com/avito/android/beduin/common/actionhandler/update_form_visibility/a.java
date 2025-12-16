package com.avito.android.beduin.common.actionhandler.update_form_visibility;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.action.BeduinUpdateFormVisibilityAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinUpdateFormVisibilityActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_form_visibility/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinUpdateFormVisibilityAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinUpdateFormVisibilityAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<C3016a> f100481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f100482b;

    /* compiled from: BeduinUpdateFormVisibilityActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_form_visibility/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.actionhandler.update_form_visibility.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3016a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f100483a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f100484b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f100485c;

        public C3016a(boolean z12, boolean z13, @k String str) {
            this.f100483a = z12;
            this.f100484b = z13;
            this.f100485c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3016a)) {
                return false;
            }
            C3016a c3016a = (C3016a) obj;
            return this.f100483a == c3016a.f100483a && this.f100484b == c3016a.f100484b && L.f(this.f100485c, c3016a.f100485c);
        }

        public final int hashCode() {
            return this.f100485c.hashCode() + r.i(Boolean.hashCode(this.f100483a) * 31, 31, this.f100484b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Parameters(isVisible=");
            sb2.append(this.f100483a);
            sb2.append(", isAnimated=");
            sb2.append(this.f100484b);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f100485c, ')');
        }
    }

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<C3016a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100481a = cVar;
        this.f100482b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinUpdateFormVisibilityAction beduinUpdateFormVisibilityAction = (BeduinUpdateFormVisibilityAction) beduinAction;
        this.f100481a.accept(new C3016a(beduinUpdateFormVisibilityAction.getVisible(), beduinUpdateFormVisibilityAction.getAnimated(), beduinUpdateFormVisibilityAction.getFormId()));
    }
}
