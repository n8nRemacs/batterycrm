package com.avito.android.component.toast.util;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeToastBarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/toast/util/d;", "Lcom/avito/android/component/toast/util/c;", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f125271a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @l
    public g f125272b;

    @Inject
    public d() {
    }

    @Override // com.avito.android.component.toast.util.c
    public final void a(@k PrintableText printableText, int i12, @l String str, @l Y41.a aVar, @k ToastBarPosition toastBarPosition, @k com.avito.android.component.toast.f fVar) {
        Iterator it = this.f125271a.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2.h()) {
                fVar2.a(printableText, i12, str, aVar, toastBarPosition, fVar);
                return;
            }
        }
        g gVar = this.f125272b;
        if (gVar != null) {
            gVar.a(printableText, i12, str, aVar, toastBarPosition, fVar);
        }
    }

    @Override // com.avito.android.component.toast.util.c
    public final void b(@k g gVar) {
        this.f125272b = gVar;
    }

    @Override // com.avito.android.component.toast.util.c
    public final void c(@k com.avito.android.subscriptions_settings.d dVar) {
        this.f125271a.remove(dVar);
    }

    @Override // com.avito.android.component.toast.util.c
    public final void clear() {
        this.f125272b = null;
        this.f125271a.clear();
    }

    @Override // com.avito.android.component.toast.util.c
    public final void d(@k com.avito.android.subscriptions_settings.a aVar) {
        this.f125271a.add(aVar);
    }
}
