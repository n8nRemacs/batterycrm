package com.my.tracker.obfuscated;

import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.C37829c;
import com.my.tracker.obfuscated.C37848w;
import com.my.tracker.obfuscated.C37850y;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class G implements com.huawei.hmf.tasks.h, C37848w.c, InterfaceC37839m, InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f365281b;

    public /* synthetic */ G(Object obj) {
        this.f365281b = obj;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC37839m
    public void a(Object obj) {
        ((p1) this.f365281b).b((w1) obj);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        C37850y.b.a((C37850y.c) this.f365281b, task);
    }

    @Override // com.huawei.hmf.tasks.h
    public void onFailure(Exception exc) {
        ((C37829c.d) this.f365281b).a(exc);
    }

    @Override // com.my.tracker.obfuscated.C37848w.c
    public void a(List list) {
        ((c0) this.f365281b).b(list);
    }
}
