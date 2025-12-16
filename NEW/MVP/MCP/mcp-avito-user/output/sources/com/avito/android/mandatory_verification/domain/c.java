package com.avito.android.mandatory_verification.domain;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: DeleteFileUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/c;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.file_uploader.c f184493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f184494b;

    @Inject
    public c(@Y61.k com.avito.android.mandatory_verification.domain.file_uploader.c cVar, @Y61.k R0 r02) {
        this.f184493a = cVar;
        this.f184494b = r02;
    }

    @Y61.k
    public final C43137a0 a(@Y61.k String str, @Y61.k String str2) {
        return new C43137a0(new b(2, null), C43175k.I(this.f184494b.a(), new a(this.f184493a.a(str, str2))));
    }
}
