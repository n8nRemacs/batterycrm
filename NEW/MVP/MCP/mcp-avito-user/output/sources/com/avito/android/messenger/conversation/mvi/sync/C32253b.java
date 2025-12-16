package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.V2;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: IncompleteMessageBodyLoader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messages", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32253b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f194749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194750c;

    public C32253b(String str, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194749b = str;
        this.f194750c = messengerUserHashInfo;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Found ");
        sb2.append(((List) obj).size());
        sb2.append(" incomplete messages (");
        sb2.append(this.f194749b);
        sb2.append(", ");
        v22.i("IncompleteMessageBodyLoader", C22026a.c(sb2, com.avito.android.messenger.util.i.b(this.f194750c, new kotlin.Q[0]), ')'), null);
    }
}
