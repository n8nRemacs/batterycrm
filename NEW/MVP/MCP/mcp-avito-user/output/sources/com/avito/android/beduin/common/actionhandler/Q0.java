package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinScrollToComponentAction;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinScrollToComponentActionHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Q0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q0 implements InterfaceC15523b<BeduinScrollToComponentAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f100116a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f100117b;

    /* compiled from: BeduinScrollToComponentActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Q0$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f100118a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f100119b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f100120c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BeduinScrollToComponentAction.ScrollPosition f100121d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f100122e;

        public a(@Y61.l String str, @Y61.k String str2, boolean z12, @Y61.k BeduinScrollToComponentAction.ScrollPosition scrollPosition, boolean z13) {
            this.f100118a = str;
            this.f100119b = str2;
            this.f100120c = z12;
            this.f100121d = scrollPosition;
            this.f100122e = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f100118a, aVar.f100118a) && kotlin.jvm.internal.L.f(this.f100119b, aVar.f100119b) && this.f100120c == aVar.f100120c && this.f100121d == aVar.f100121d && this.f100122e == aVar.f100122e;
        }

        public final int hashCode() {
            String str = this.f100118a;
            return Boolean.hashCode(this.f100122e) + ((this.f100121d.hashCode() + androidx.appcompat.app.r.i(androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f100119b), 31, this.f100120c)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollParameters(targetFormId=");
            sb2.append(this.f100118a);
            sb2.append(", modelId=");
            sb2.append(this.f100119b);
            sb2.append(", isAnimated=");
            sb2.append(this.f100120c);
            sb2.append(", scrollPosition=");
            sb2.append(this.f100121d);
            sb2.append(", requireFocus=");
            return androidx.appcompat.app.r.x(sb2, this.f100122e, ')');
        }
    }

    @Inject
    public Q0() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100116a = cVar;
        this.f100117b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinScrollToComponentAction beduinScrollToComponentAction = (BeduinScrollToComponentAction) beduinAction;
        String targetFormId = beduinScrollToComponentAction.getTargetFormId();
        String modelId = beduinScrollToComponentAction.getModelId();
        Boolean boolIsAnimated = beduinScrollToComponentAction.isAnimated();
        boolean zBooleanValue = boolIsAnimated != null ? boolIsAnimated.booleanValue() : false;
        BeduinScrollToComponentAction.ScrollPosition scrollPosition = beduinScrollToComponentAction.getScrollPosition();
        if (scrollPosition == null) {
            scrollPosition = BeduinScrollToComponentAction.ScrollPosition.BOTTOM;
        }
        BeduinScrollToComponentAction.ScrollPosition scrollPosition2 = scrollPosition;
        Boolean requireFocus = beduinScrollToComponentAction.getRequireFocus();
        this.f100116a.accept(new a(targetFormId, modelId, zBooleanValue, scrollPosition2, requireFocus != null ? requireFocus.booleanValue() : false));
    }
}
