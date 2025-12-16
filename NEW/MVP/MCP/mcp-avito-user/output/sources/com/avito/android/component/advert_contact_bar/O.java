package com.avito.android.component.advert_contact_bar;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class O implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f125168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f125169c;

    public O(View view, J j12) {
        this.f125168b = view;
        this.f125169c = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j12 = this.f125169c;
        Y41.l<? super Integer, G0> lVar = j12.f125155r;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(j12.f125153p.getId()));
        }
    }
}
