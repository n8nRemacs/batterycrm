package com.avito.android.publish;

import com.avito.android.Q1;
import kotlin.Metadata;

/* compiled from: PublishActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.c0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33543c0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232319l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33543c0(PublishActivity publishActivity) {
        super(0);
        this.f232319l = publishActivity;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        final PublishActivity publishActivity = this.f232319l;
        Q1 q12 = publishActivity.f231983t;
        if (q12 == null) {
            q12 = null;
        }
        if (q12.A().invoke().booleanValue()) {
            publishActivity.f231970B.post(new Runnable() { // from class: com.avito.android.publish.a0
                @Override // java.lang.Runnable
                public final void run() {
                    PublishActivity publishActivity2 = publishActivity;
                    com.avito.android.publish.view.result_handler.d dVar = publishActivity2.f231969A;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.a("PublishActivity", new C33541b0(publishActivity2));
                }
            });
        }
        com.avito.android.progress_overlay.l lVar = publishActivity.f231974F;
        if (lVar != null) {
            lVar.j();
        }
        return kotlin.G0.f406611a;
    }
}
