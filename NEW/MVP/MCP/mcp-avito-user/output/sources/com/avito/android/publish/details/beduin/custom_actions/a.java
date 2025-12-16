package com.avito.android.publish.details.beduin.custom_actions;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSetContinuePublishActionHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/publish/details/beduin/custom_actions/BeduinSetContinuePublishAction;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes16.dex */
public final class a implements com.avito.android.beduin_shared.model.action.custom.c<BeduinSetContinuePublishAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BK0.a<C7085a> f233555a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f233556b;

    /* compiled from: BeduinSetContinuePublishActionHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.beduin.custom_actions.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7085a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ContinuePublishAction f233557a;

        public C7085a(@l ContinuePublishAction continuePublishAction) {
            this.f233557a = continuePublishAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7085a) && L.f(this.f233557a, ((C7085a) obj).f233557a);
        }

        public final int hashCode() {
            ContinuePublishAction continuePublishAction = this.f233557a;
            if (continuePublishAction == null) {
                return 0;
            }
            return continuePublishAction.hashCode();
        }

        @k
        public final String toString() {
            return "Parameters(continuePublishAction=" + this.f233557a + ')';
        }
    }

    @Inject
    public a() {
        BK0.a<C7085a> aVar = new BK0.a<>();
        this.f233555a = aVar;
        this.f233556b = new C41981q0(aVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f233555a.onNext(new C7085a(((BeduinSetContinuePublishAction) beduinAction).getAction()));
    }
}
