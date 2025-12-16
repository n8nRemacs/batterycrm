package com.avito.android.publish.details;

import com.avito.android.remote.model.category_parameters.base.HasTags;
import kotlin.Metadata;

/* compiled from: _Sequences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class W1 extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final W1 f233180l = new W1();

    public W1() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof HasTags);
    }
}
