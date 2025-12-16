package androidx.compose.runtime.snapshots;

import android.os.Bundle;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import kotlin.G0;
import kotlin.collections.C42745f0;
import ku0.InterfaceC43499a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.compose.runtime.snapshots.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C22166k implements InterfaceC22163h, androidx.fragment.app.C, RadioGroup.e, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.u, InterfaceC43499a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f38719b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C22166k(int i12, Y41.p pVar) {
        this.f38719b = (kotlin.jvm.internal.N) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.radio.RadioGroup.e
    public void a(ListItemRadio listItemRadio) {
        int i12 = com.avito.android.blueprints.radiogroup.j.f106574h;
        this.f38719b.invoke(listItemRadio.getTag().toString(), Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public void b(Y41.a aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            this.f38719b.invoke(th2);
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC22163h
    public void dispose() {
        kotlin.jvm.internal.N n12 = this.f38719b;
        synchronized (C22176v.f38750c) {
            C22176v.f38755h = C42745f0.c0((Iterable) C22176v.f38755h, n12);
            G0 g02 = G0.f406611a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        this.f38719b.invoke(str, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // ku0.InterfaceC43499a
    public void onClick() {
        int i12 = com.avito.android.service_orders.list.blueprints.management_panels.j.f279324f;
        this.f38719b.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C22166k(Y41.l lVar) {
        this.f38719b = (kotlin.jvm.internal.N) lVar;
    }
}
