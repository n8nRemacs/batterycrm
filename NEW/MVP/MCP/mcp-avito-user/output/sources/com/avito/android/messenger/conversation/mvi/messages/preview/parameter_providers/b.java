package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers;

import Y41.l;
import com.avito.android.messenger.conversation.T1;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: MessageListPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/T1;", "channelItem", "invoke", "(Lcom/avito/android/messenger/conversation/T1;)Lcom/avito/android/messenger/conversation/T1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements l<T1, T1> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f193068l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.f fVar) {
        super(1);
        this.f193068l = fVar;
    }

    @Override // Y41.l
    public final T1 invoke(T1 t12) {
        T1 t13 = t12;
        if (!(t13 instanceof T1.d)) {
            return t13;
        }
        T1.d dVar = (T1.d) t13;
        l0.f fVar = this.f193068l;
        int i12 = fVar.f406840b;
        fVar.f406840b = i12 + 1;
        return T1.d.a(dVar, String.valueOf(i12), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7);
    }
}
