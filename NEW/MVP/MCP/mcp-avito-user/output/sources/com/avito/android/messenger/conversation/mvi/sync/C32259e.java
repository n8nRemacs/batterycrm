package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: IncompleteMessageBodyLoader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32259e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f194771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194772c;

    public C32259e(String str, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194771b = str;
        this.f194772c = messengerUserHashInfo;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Failed to load incomplete bodies (");
        sb2.append(this.f194771b);
        sb2.append(", $");
        v22.i("IncompleteMessageBodyLoader", C22026a.c(sb2, com.avito.android.messenger.util.i.b(this.f194772c, new kotlin.Q[0]), ')'), (Throwable) obj);
    }
}
