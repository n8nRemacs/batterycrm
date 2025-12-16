package hM;

import AK0.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import mM.InterfaceC43981a;

/* compiled from: IacProblemsStorage.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LhM/b;", "LhM/a;", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hM.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40850b implements InterfaceC40849a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f397183a;

    /* compiled from: IacProblemsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LhM/b$a;", "", "<init>", "()V", "", "KEY_IAC_PROBLEM_BANNER_SHOW_TIME", "Ljava/lang/String;", "KEY_LAST_IAC_PROBLEMS_ON_STARTUP", "LAST_MIC_ACCESS_ON_STARTUP", "REGISTERED_CRASH_PREFIX", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hM.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C40850b(@k l lVar) {
        this.f397183a = lVar;
    }

    @Override // hM.InterfaceC40849a
    @k
    public final LinkedHashMap a() {
        InterfaceC43981a.C11826a.f414480a.getClass();
        List<String> list = InterfaceC43981a.C11826a.f414481b;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(obj, Integer.valueOf(this.f397183a.getInt(G.f("IAC_REGISTERED_CRASH_PREFIX_", (String) obj), 0)));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    @Override // hM.InterfaceC40849a
    @Y61.l
    public final Boolean b() {
        l lVar = this.f397183a;
        if (lVar.contains("last_mic_access_on_startup")) {
            return Boolean.valueOf(lVar.c("last_mic_access_on_startup"));
        }
        return null;
    }

    @Override // hM.InterfaceC40849a
    public final long c(@k String str) {
        return this.f397183a.getLong("KEY_IAC_PROBLEM_BANNER_SHOW_TIME.".concat(str), 0L);
    }

    @Override // hM.InterfaceC40849a
    public final int d() {
        String strConcat = "IAC_REGISTERED_CRASH_PREFIX_".concat("CALL_STYLE_NOTIFICATION");
        l lVar = this.f397183a;
        int i12 = lVar.getInt(strConcat, 0) + 1;
        lVar.a(i12, "IAC_REGISTERED_CRASH_PREFIX_".concat("CALL_STYLE_NOTIFICATION"));
        return i12;
    }

    @Override // hM.InterfaceC40849a
    public final void e(long j12, @k String str) {
        this.f397183a.putLong("KEY_IAC_PROBLEM_BANNER_SHOW_TIME.".concat(str), j12);
    }

    @Override // hM.InterfaceC40849a
    public final void f(@Y61.l List<? extends IacProblem> list) {
        List<? extends IacProblem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((IacProblem) it.next()).name());
        }
        this.f397183a.putStringSet("KEY_LAST_IAC_PROBLEMS_ON_STARTUP", C42745f0.P0(arrayList));
    }

    @Override // hM.InterfaceC40849a
    public final void g(@Y61.l Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        l lVar = this.f397183a;
        lVar.putBoolean("last_mic_access_on_startup", zBooleanValue);
        if (G0.f406611a == null) {
            lVar.remove("last_mic_access_on_startup");
        }
    }

    @Override // hM.InterfaceC40849a
    @Y61.l
    public final List<IacProblem> h() {
        IacProblem iacProblemValueOf;
        Set<String> setF = this.f397183a.f("KEY_LAST_IAC_PROBLEMS_ON_STARTUP");
        if (setF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setF.iterator();
        while (it.hasNext()) {
            try {
                iacProblemValueOf = IacProblem.valueOf((String) it.next());
            } catch (Exception unused) {
                iacProblemValueOf = null;
            }
            if (iacProblemValueOf != null) {
                arrayList.add(iacProblemValueOf);
            }
        }
        return C42745f0.M0(arrayList);
    }
}
