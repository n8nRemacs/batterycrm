package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.remote.model.category_parameters.base.HasTags;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: _Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34098z extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C34098z f241297l = new C34098z();

    public C34098z() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof HasTags);
    }
}
