package com.avito.android.toggle_comparison_state.deep_linking;

import Ju.InterfaceC14249c;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.toggle_comparison_state.deep_linking.d;
import com.avito.android.toggle_comparison_state.o;
import com.avito.android.toggle_comparison_state.s;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;

/* compiled from: ToggleComparisonStateConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/a;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes4.dex */
public final class a implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToggleComparisonStateConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/a$a;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.toggle_comparison_state.deep_linking.a$a, reason: collision with other inner class name */
    public static final class EnumC9227a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumC9227a[] f301578b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f301579c;

        static {
            EnumC9227a[] enumC9227aArr = {new EnumC9227a("ADDED", 0), new EnumC9227a("LIMIT_REACHED", 1), new EnumC9227a("REMOVED", 2), new EnumC9227a("ERROR", 3), new EnumC9227a("FAILURE", 4)};
            f301578b = enumC9227aArr;
            f301579c = kotlin.enums.c.a(enumC9227aArr);
        }

        public static EnumC9227a valueOf(String str) {
            return (EnumC9227a) Enum.valueOf(EnumC9227a.class, str);
        }

        public static EnumC9227a[] values() {
            return (EnumC9227a[]) f301578b.clone();
        }
    }

    @Inject
    public a() {
    }

    public static com.avito.beduin.v2.interaction.launch.flow.k[] c(o oVar) {
        t0 t0Var = new t0(2);
        t0Var.a(new com.avito.beduin.v2.interaction.launch.flow.k("comparison_name", oVar.f301624c));
        com.avito.android.toggle_comparison_state.a aVar = oVar.f301622a;
        String str = aVar.f301571d;
        if (str == null) {
            str = "";
        }
        t0Var.b(new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("comparison_alert_url", str), new com.avito.beduin.v2.interaction.launch.flow.k("comparison_alert_title", aVar.f301569b), new com.avito.beduin.v2.interaction.launch.flow.k("comparison_alert_buttonTitle", aVar.f301568a), new com.avito.beduin.v2.interaction.launch.flow.k("comparison_alert_link", aVar.f301570c.getUri().toString())});
        ArrayList<Object> arrayList = t0Var.f406850a;
        return (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[arrayList.size()]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof d.a.b) {
            s sVar = ((d.a.b) bVar).f301586b;
            if (sVar instanceof s.a) {
                t0 t0Var = new t0(2);
                EnumC9227a[] enumC9227aArr = EnumC9227a.f301578b;
                t0Var.a(new com.avito.beduin.v2.interaction.launch.flow.k("result_type", "added"));
                t0Var.b(c(((s.a) sVar).f301632a));
                ArrayList<Object> arrayList = t0Var.f406850a;
                kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[arrayList.size()]);
            } else if (sVar instanceof s.b) {
                t0 t0Var2 = new t0(2);
                EnumC9227a[] enumC9227aArr2 = EnumC9227a.f301578b;
                t0Var2.a(new com.avito.beduin.v2.interaction.launch.flow.k("result_type", "limit_reached"));
                t0Var2.b(c(((s.b) sVar).f301634a));
                ArrayList<Object> arrayList2 = t0Var2.f406850a;
                kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList2.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[arrayList2.size()]);
            } else if (sVar instanceof s.d) {
                EnumC9227a[] enumC9227aArr3 = EnumC9227a.f301578b;
                kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("result_type", AdvertStatus.REMOVED)};
            } else {
                if (!(sVar instanceof s.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC9227a[] enumC9227aArr4 = EnumC9227a.f301578b;
                kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("result_type", "error")};
            }
        } else if (bVar instanceof d.a.C9228a) {
            EnumC9227a[] enumC9227aArr5 = EnumC9227a.f301578b;
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("result_type", "failure")};
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof d.a.b ? ResultStatus.f337439c : bVar instanceof d.a.C9228a ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
