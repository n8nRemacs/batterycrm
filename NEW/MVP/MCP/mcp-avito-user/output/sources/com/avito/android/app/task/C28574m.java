package com.avito.android.app.task;

import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35909m;
import kotlin.Metadata;

/* compiled from: ApplicationStartupTasksExecutorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/app/task/h;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28574m extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28565j f91653l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28559h f91654m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Class<? extends InterfaceC28559h> f91655n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f91656o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28574m(C28565j c28565j, InterfaceC28559h interfaceC28559h, Class<? extends InterfaceC28559h> cls, Y41.l<InterfaceC28559h, ? extends InterfaceC28559h.a> lVar) {
        super(0);
        this.f91653l = c28565j;
        this.f91654m = interfaceC28559h;
        this.f91655n = cls;
        this.f91656o = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        InterfaceC28559h.a c2695a;
        InterfaceC28559h.a aVar;
        ?? r02 = this.f91656o;
        C28565j c28565j = this.f91653l;
        c28565j.getClass();
        V2 v22 = V2.f318762a;
        InterfaceC28559h interfaceC28559h = this.f91654m;
        v22.c("StartupTasksExecutor", "Execute ApplicationStartupTask: ".concat(interfaceC28559h.getClass().getName()), null);
        try {
            aVar = (InterfaceC28559h.a) r02.invoke(interfaceC28559h);
        } catch (Exception e12) {
            if (c28565j.f91627k) {
                c2695a = new InterfaceC28559h.a.b(e12);
            } else {
                c2695a = new InterfaceC28559h.a.C2695a("ApplicationStartupTask " + interfaceC28559h.getClass().getName() + " failed", e12);
            }
            aVar = c2695a;
        }
        c28565j.f91622f.a(this.f91655n);
        if (aVar instanceof InterfaceC28559h.a.c) {
            V2.f318762a.c("StartupTasksExecutor", "StartupTask " + interfaceC28559h.getClass().getName() + " completed", null);
        } else if (aVar instanceof InterfaceC28559h.a.C2695a) {
            V2 v23 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder("StartupTask ");
            sb2.append(interfaceC28559h.getClass().getName());
            sb2.append(" failed: ");
            InterfaceC28559h.a.C2695a c2695a2 = (InterfaceC28559h.a.C2695a) aVar;
            String str = c2695a2.f91603a;
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            String string = sb2.toString();
            Throwable exc = c2695a2.f91604b;
            if (exc == null) {
                exc = new Exception("ApplicationStartupTask failed");
            }
            v23.a("StartupTasksExecutor", string, exc);
        } else if (aVar instanceof InterfaceC28559h.a.b) {
            throw new C35909m("StartupTask " + interfaceC28559h.getClass().getName() + " failed", ((InterfaceC28559h.a.b) aVar).f91605a);
        }
        return kotlin.G0.f406611a;
    }
}
