package com.avito.android.str_cancellation_settings.mvi;

import Sy0.InterfaceC15270a;
import Vy0.C15729a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrCancellationSettingsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LSy0/a;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState;", "a", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15270a, StrCancellationSettingsInternalAction, StrCancellationSettingsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_cancellation_settings.domain.d f288419a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_cancellation_settings.domain.p f288420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_cancellation_settings.domain.a f288421c;

    /* compiled from: StrCancellationSettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/a$a;", "", "<init>", "()V", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "a", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_cancellation_settings.mvi.a$a, reason: collision with other inner class name */
    public static final class C8671a {

        /* compiled from: StrCancellationSettingsActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/a$a$a;", "", "a", "b", "Lcom/avito/android/str_cancellation_settings/mvi/a$a$a$a;", "Lcom/avito/android/str_cancellation_settings/mvi/a$a$a$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_cancellation_settings.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC8672a {

            /* compiled from: StrCancellationSettingsActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/a$a$a$a;", "Lcom/avito/android/str_cancellation_settings/mvi/a$a$a;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_cancellation_settings.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8673a implements InterfaceC8672a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C8673a f288422a = new C8673a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C8673a);
                }

                public final int hashCode() {
                    return -72565334;
                }

                @Y61.k
                public final String toString() {
                    return "Debounce";
                }
            }

            /* compiled from: StrCancellationSettingsActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/a$a$a$b;", "Lcom/avito/android/str_cancellation_settings/mvi/a$a$a;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_cancellation_settings.mvi.a$a$a$b */
            public static final /* data */ class b implements InterfaceC8672a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f288423a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -553253184;
                }

                @Y61.k
                public final String toString() {
                    return "Default";
                }
            }
        }

        public /* synthetic */ C8671a(C42822w c42822w) {
            this();
        }

        public C8671a() {
        }
    }

    static {
        new C8671a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.str_cancellation_settings.domain.d dVar, @Y61.k com.avito.android.str_cancellation_settings.domain.p pVar, @Y61.k com.avito.android.str_cancellation_settings.domain.a aVar) {
        this.f288419a = dVar;
        this.f288420b = pVar;
        this.f288421c = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new d(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, c.f288428l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<StrCancellationSettingsInternalAction> b(@Y61.k InterfaceC15270a interfaceC15270a, @Y61.k StrCancellationSettingsState strCancellationSettingsState) {
        if (interfaceC15270a instanceof InterfaceC15270a.C1039a) {
            return C43175k.G(new b(strCancellationSettingsState, this, null));
        }
        if (interfaceC15270a instanceof InterfaceC15270a.b) {
            return new C43210w(new StrCancellationSettingsInternalAction.ChangeDiscountInputValue(((InterfaceC15270a.b) interfaceC15270a).f15224a));
        }
        boolean z12 = interfaceC15270a instanceof InterfaceC15270a.c;
        Long l12 = strCancellationSettingsState.f288463c;
        com.avito.android.str_cancellation_settings.domain.a aVar = this.f288421c;
        if (z12) {
            String strValueOf = String.valueOf(l12);
            boolean z13 = ((InterfaceC15270a.c) interfaceC15270a).f15225a;
            aVar.d(strValueOf, z13);
            return new C43210w(new StrCancellationSettingsInternalAction.ChangeDiscountEnabledValue(z13));
        }
        if (interfaceC15270a instanceof InterfaceC15270a.d) {
            return new C43210w(StrCancellationSettingsInternalAction.CloseScreen.f288451b);
        }
        if (interfaceC15270a instanceof InterfaceC15270a.e) {
            String strValueOf2 = String.valueOf(l12);
            int i12 = ((InterfaceC15270a.e) interfaceC15270a).f15227a;
            aVar.a(strValueOf2, String.valueOf(i12));
            return new C43210w(new StrCancellationSettingsInternalAction.ChangeFreeCancellationOptionId(i12));
        }
        if (interfaceC15270a instanceof InterfaceC15270a.f) {
            String strValueOf3 = String.valueOf(l12);
            boolean z14 = ((InterfaceC15270a.f) interfaceC15270a).f15228a;
            aVar.e(strValueOf3, z14);
            return new C43210w(new StrCancellationSettingsInternalAction.ChangeFreeCancellationEnabledValue(z14));
        }
        if (interfaceC15270a instanceof InterfaceC15270a.h) {
            if (l12 == null) {
                return C43175k.w();
            }
            long jLongValue = l12.longValue();
            Date date = strCancellationSettingsState.f288464d;
            String strB = date != null ? C15729a.b(date) : null;
            Date date2 = strCancellationSettingsState.f288465e;
            return this.f288419a.b(jLongValue, strB, date2 != null ? C15729a.b(date2) : null);
        }
        if (!(interfaceC15270a instanceof InterfaceC15270a.i)) {
            if (interfaceC15270a instanceof InterfaceC15270a.g) {
                return new C43210w(new StrCancellationSettingsInternalAction.ChangeKeyboardVisibleValue(((InterfaceC15270a.g) interfaceC15270a).f15229a));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (strCancellationSettingsState.f288472l == StrCancellationSettingsState.LoadingType.f288479f) {
            return C43175k.w();
        }
        aVar.f(String.valueOf(l12));
        return C43175k.w();
    }
}
