package com.avito.android.profile_settings_basic.adapter.basic_info;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Handler.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/os/m", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.text_view.a f228641b;

    public p(com.avito.android.lib.design.text_view.a aVar) {
        this.f228641b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f228641b.setEnabled(true);
    }
}
