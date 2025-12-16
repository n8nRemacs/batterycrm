package com.avito.android.authorization.tfa.code_check.screen_builder;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: TfaCodeCheckScreenBuilderForTfa.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f94734l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l0.a aVar) {
        super(1);
        this.f94734l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        if (str.length() > 0) {
            this.f94734l.f406838b = true;
        }
        return G0.f406611a;
    }
}
