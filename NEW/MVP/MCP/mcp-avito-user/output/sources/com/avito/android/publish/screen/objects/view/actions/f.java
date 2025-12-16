package com.avito.android.publish.screen.objects.view.actions;

import Ge0.InterfaceC13872a;
import He0.C13982a;
import Hf0.InterfaceC13984a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.C33757i;
import com.avito.android.publish.details.InterfaceC33748f;
import com.avito.android.publish.details.r;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObjectBottomView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/f;", "Lcom/avito/android/publish/screen/objects/view/actions/e;", "Lcom/avito/android/publish/details/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e, InterfaceC33748f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f240264a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33757i f240266c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k View view, @Y61.k r rVar, @Y61.k Y41.l<? super InterfaceC13872a, G0> lVar) {
        this.f240264a = view;
        this.f240265b = lVar;
        this.f240266c = new C33757i(view, rVar, new C13982a(lVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        this.f240266c.b();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        this.f240266c.f();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        this.f240266c.g();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f240266c.f234698c;
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        this.f240266c.k();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        this.f240266c.m();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        this.f240266c.o();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f240266c.r(str);
    }
}
