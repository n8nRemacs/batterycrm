package ru.avito.component.serp.job;

import android.view.View;
import com.avito.android.mnz_common.ui.ActionFloatingFooter;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f430469c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(int i12, Y41.a aVar) {
        this.f430468b = i12;
        this.f430469c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r22 = this.f430469c;
        switch (this.f430468b) {
            case 0:
                r22.invoke();
                break;
            default:
                int i12 = ActionFloatingFooter.f197972f;
                r22.invoke();
                break;
        }
    }
}
