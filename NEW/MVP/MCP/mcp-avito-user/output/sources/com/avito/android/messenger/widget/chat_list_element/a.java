package com.avito.android.messenger.widget.chat_list_element;

import android.view.View;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f197484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f197485c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(int i12, Y41.a aVar) {
        this.f197484b = i12;
        this.f197485c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f197484b) {
            case 0:
                this.f197485c.invoke();
                break;
            default:
                ?? r12 = this.f197485c;
                if (r12 != 0) {
                    r12.invoke();
                    break;
                }
                break;
        }
    }
}
