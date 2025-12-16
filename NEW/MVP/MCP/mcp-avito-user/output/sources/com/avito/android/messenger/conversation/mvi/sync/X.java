package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001 \u0004*\r\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\b\u00030\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "", "Lj41/e;", "kotlin.jvm.PlatformType", "messages", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final X<T, R> f194725b = new X<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List listL = C42745f0.l((List) obj);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t12 : listL) {
            if (hashSet.add(((LocalMessage) t12).getLocalId())) {
                arrayList.add(t12);
            }
        }
        return arrayList;
    }
}
