package com.avito.android.messenger.conversation.mvi.messages.composables;

import com.avito.android.messenger.conversation.T1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Integer, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192200l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends T1> list) {
        super(1);
        this.f192200l = list;
    }

    @Override // Y41.l
    public final Object invoke(Integer num) {
        return this.f192200l.get(num.intValue()).getF189216f();
    }
}
