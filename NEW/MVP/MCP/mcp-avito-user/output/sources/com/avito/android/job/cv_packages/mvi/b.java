package com.avito.android.job.cv_packages.mvi;

import cQ.InterfaceC27084a;
import com.avito.android.job.cv_packages.mvi.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: CvPackageActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LcQ/a;", "abstractAction", "Lcom/avito/android/job/cv_packages/mvi/a$a;", "invoke", "(LcQ/a;)Lcom/avito/android/job/cv_packages/mvi/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.l<InterfaceC27084a, a.InterfaceC5142a> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f174433l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final a.InterfaceC5142a invoke(InterfaceC27084a interfaceC27084a) {
        InterfaceC27084a interfaceC27084a2 = interfaceC27084a;
        if (interfaceC27084a2 instanceof cQ.c) {
            return a.InterfaceC5142a.C5143a.f174431a;
        }
        if (interfaceC27084a2 instanceof cQ.b) {
            return a.InterfaceC5142a.b.f174432a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
