package com.avito.android.mortgage.person_form.mvi.mapper;

import Y41.l;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PersonFormDomainToUiMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLZ/c;", "it", "", "invoke", "(LLZ/c;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<LZ.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f201270l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Set<String> set) {
        super(1);
        this.f201270l = set;
    }

    @Override // Y41.l
    public final Boolean invoke(LZ.c cVar) {
        return Boolean.valueOf(this.f201270l.contains(cVar.f9996b.getId()));
    }
}
