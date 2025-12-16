package com.avito.android.employee_mode_impl.manager.storage;

import AK0.i;
import AK0.l;
import Y61.k;
import android.app.Application;
import android.content.SharedPreferences;
import cz.C39437b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EmployeeModePreferenceStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/storage/a;", "Lcom/avito/android/employee_mode_impl/manager/storage/c;", "a", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f147554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Application f147555b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f147556c = C42727D.c(new b());

    /* compiled from: EmployeeModePreferenceStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/storage/a$a;", "", "<init>", "()V", "", "MODE_INFO_TYPE_COMPANY", "Ljava/lang/String;", "MODE_INFO_TYPE_PERSONAL", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_mode_impl.manager.storage.a$a, reason: collision with other inner class name */
    public static final class C4308a {
        public /* synthetic */ C4308a(C42822w c42822w) {
            this();
        }

        public C4308a() {
        }
    }

    /* compiled from: EmployeeModePreferenceStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LAK0/l;", "invoke", "()LAK0/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<l> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            a aVar = a.this;
            return aVar.f147554a.a(aVar.f147555b, "accounts_hierarchy_employee_mode");
        }
    }

    static {
        new C4308a(null);
    }

    @Inject
    public a(@k i iVar, @k Application application) {
        this.f147554a = iVar;
        this.f147555b = application;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.employee_mode_impl.manager.storage.c
    public final void a(@k d dVar, @k InterfaceC42452c interfaceC42452c) {
        SharedPreferences.Editor editorEdit = ((l) this.f147556c.getValue()).getF316a().edit();
        boolean z12 = interfaceC42452c instanceof InterfaceC42452c.a.C11597a;
        ?? r22 = dVar.f147566f;
        ?? r32 = dVar.f147565e;
        ?? r42 = dVar.f147564d;
        ?? r52 = dVar.f147563c;
        if (z12) {
            InterfaceC42452c.a.C11597a c11597a = (InterfaceC42452c.a.C11597a) interfaceC42452c;
            editorEdit.putBoolean(dVar.a(), C39437b.a(((InterfaceC42452c.a.C11597a) interfaceC42452c).f405968a)).putString((String) r52.getValue(), "employee_company").putString((String) r42.getValue(), c11597a.f405969b).putString((String) r32.getValue(), c11597a.f405970c).putString((String) r22.getValue(), c11597a.f405971d);
        } else if (interfaceC42452c instanceof InterfaceC42452c.a.b) {
            SharedPreferences.Editor editorPutString = editorEdit.putBoolean(dVar.a(), C39437b.a(((InterfaceC42452c.a.b) interfaceC42452c).f405972a)).putString((String) r52.getValue(), "employee_personal");
            Iterator it = C42745f0.U((String) r42.getValue(), (String) r32.getValue(), (String) r22.getValue()).iterator();
            while (it.hasNext()) {
                editorPutString.remove((String) it.next());
            }
        } else if (interfaceC42452c instanceof InterfaceC42452c.b) {
            Iterator it2 = C42745f0.U(dVar.a(), (String) r52.getValue(), (String) r42.getValue(), (String) r32.getValue(), (String) r22.getValue()).iterator();
            while (it2.hasNext()) {
                editorEdit.remove((String) it2.next());
            }
        }
        editorEdit.apply();
    }

    @Override // com.avito.android.employee_mode_impl.manager.storage.c
    @k
    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : ((l) this.f147556c.getValue()).getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            d.f147560g.getClass();
            String string = C43066x.W(C43066x.W(C43066x.W(C43066x.W(C43066x.T(new StringBuilder(key), "employee_mode_for_"), "_cmp_ss"), "_employee_id"), "_cmp_hash_id"), "_info_type").toString();
            d dVar = (L.f(string, key) || string.length() <= 0) ? null : new d(string);
            if (dVar != null && value != null && !linkedHashMap.containsKey(dVar)) {
                linkedHashMap.put(dVar, d(dVar));
            }
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.employee_mode_impl.manager.storage.c
    public final void c() {
        ((l) this.f147556c.getValue()).getF316a().edit().clear().apply();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.employee_mode_impl.manager.storage.c
    @k
    public final InterfaceC42452c d(@k d dVar) {
        l lVar = (l) this.f147556c.getValue();
        InterfaceC42451b interfaceC42451b = L.f(Boolean.valueOf(lVar.getBoolean(dVar.a(), false)), Boolean.TRUE) ? InterfaceC42451b.C11596b.f405967a : InterfaceC42451b.a.f405966a;
        String string = lVar.getString((String) dVar.f147563c.getValue());
        if (string == null) {
            string = "";
        }
        if (string.equals("employee_personal")) {
            return new InterfaceC42452c.a.b(interfaceC42451b);
        }
        if (!string.equals("employee_company")) {
            return L.f(interfaceC42451b, InterfaceC42451b.C11596b.f405967a) ? new InterfaceC42452c.a.b(interfaceC42451b) : InterfaceC42452c.b.f405973a;
        }
        String string2 = lVar.getString((String) dVar.f147564d.getValue());
        String string3 = lVar.getString((String) dVar.f147565e.getValue());
        String string4 = lVar.getString((String) dVar.f147566f.getValue());
        return (string4 == null || C43066x.K(string4) || string3 == null || C43066x.K(string3) || string2 == null || C43066x.K(string2)) ? new InterfaceC42452c.a.b(interfaceC42451b) : new InterfaceC42452c.a.C11597a(interfaceC42451b, string2, string3, string4);
    }
}
