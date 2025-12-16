package com.avito.android.authorization.tfa.code_check.screen_builder;

import com.avito.android.remote.model.TfaSource;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import re.C47642c;

/* compiled from: TfaCodeCheckScreenBuilderForAntihack.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<com.avito.android.code_check_public.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f94720l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(0);
        this.f94720l = hVar;
    }

    @Override // Y41.a
    public final com.avito.android.code_check_public.a invoke() {
        this.f94720l.f94725d.c(new C47642c(TfaSource.ANTIHACK));
        return null;
    }
}
