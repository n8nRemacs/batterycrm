package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinOpenSelectBottomSheetAction;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenSelectBottomSheetActionHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/u0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenSelectBottomSheetAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.u0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28781u0 implements InterfaceC15523b<BeduinOpenSelectBottomSheetAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f100474a;

    /* compiled from: BeduinOpenSelectBottomSheetActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/u0$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.actionhandler.u0$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f100475a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f100476b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<BeduinOpenSelectBottomSheetAction.SelectOption> f100477c;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.k List<BeduinOpenSelectBottomSheetAction.SelectOption> list) {
            this.f100475a = str;
            this.f100476b = str2;
            this.f100477c = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f100475a, aVar.f100475a) && kotlin.jvm.internal.L.f(this.f100476b, aVar.f100476b) && kotlin.jvm.internal.L.f(this.f100477c, aVar.f100477c);
        }

        public final int hashCode() {
            int iHashCode = this.f100475a.hashCode() * 31;
            String str = this.f100476b;
            return this.f100477c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSelectParams(modelId=");
            sb2.append(this.f100475a);
            sb2.append(", title=");
            sb2.append(this.f100476b);
            sb2.append(", options=");
            return androidx.compose.foundation.H.p(sb2, this.f100477c, ')');
        }
    }

    @Inject
    public C28781u0() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100474a = cVar;
        new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinOpenSelectBottomSheetAction beduinOpenSelectBottomSheetAction = (BeduinOpenSelectBottomSheetAction) beduinAction;
        this.f100474a.accept(new a(beduinOpenSelectBottomSheetAction.getModelId(), beduinOpenSelectBottomSheetAction.getTitle(), beduinOpenSelectBottomSheetAction.getOptions()));
    }
}
