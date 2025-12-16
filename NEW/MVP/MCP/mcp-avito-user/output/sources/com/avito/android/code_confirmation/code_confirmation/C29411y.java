package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.m0;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29411y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f119644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f119645c;

    public C29411y(f0 f0Var, T t12) {
        this.f119644b = f0Var;
        this.f119645c = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f119644b.b();
        CodeConfirmationActivity codeConfirmationActivity = this.f119645c.f119453n;
        if (codeConfirmationActivity != null) {
            codeConfirmationActivity.a2(m0.b.f119573a);
        }
    }
}
