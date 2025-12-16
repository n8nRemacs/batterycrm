package com.avito.android.employee_bug_reporter_impl.data;

import Oy.InterfaceC14750c;
import Oy.InterfaceC14751d;
import Qy.InterfaceC14949a;
import Ry.C15095a;
import com.avito.android.account.E;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: BugReporterDeeplinkRepositoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/i;", "LOy/c;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements InterfaceC14750c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f147274a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14949a> f147275b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<T81.a> f147276c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C15095a f147277d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<InterfaceC14751d> f147278e;

    @Inject
    public i(@Y61.k E e12, @Y61.k h31.e<InterfaceC14949a> eVar, @Y61.k h31.e<T81.a> eVar2, @Y61.k C15095a c15095a) {
        this.f147274a = e12;
        this.f147275b = eVar;
        this.f147276c = eVar2;
        this.f147277d = c15095a;
        InterfaceC14751d.f12735a.getClass();
        this.f147278e = p2.a(InterfaceC14751d.a.f12737b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Oy.InterfaceC14750c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_bug_reporter_impl.data.i.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Oy.InterfaceC14750c
    @Y61.k
    public final InterfaceC43160i<InterfaceC14751d> b() {
        boolean zB2 = this.f147274a.b();
        Z1<InterfaceC14751d> z12 = this.f147278e;
        if (!zB2) {
            z12.setValue(InterfaceC14751d.b.f12738b);
        }
        return C43175k.b(z12);
    }
}
