package com.avito.android.beduin.common.actionhandler.update_navbar_title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.action.BeduinUpdateNavbarTitleAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinUpdateNavbarTitleActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_navbar_title/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin/common/action/BeduinUpdateNavbarTitleAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements c<BeduinUpdateNavbarTitleAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<C3018a> f100501a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f100502b;

    /* compiled from: BeduinUpdateNavbarTitleActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_navbar_title/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.actionhandler.update_navbar_title.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3018a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f100503a;

        public C3018a(@k String str) {
            this.f100503a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3018a) && L.f(this.f100503a, ((C3018a) obj).f100503a);
        }

        public final int hashCode() {
            return this.f100503a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Parameters(title="), this.f100503a, ')');
        }
    }

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<C3018a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100501a = cVar;
        this.f100502b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f100501a.accept(new C3018a(((BeduinUpdateNavbarTitleAction) beduinAction).getTitle()));
    }
}
