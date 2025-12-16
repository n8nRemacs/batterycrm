package com.avito.android.messenger.widget.chat_list_element;

import Y41.l;
import Y61.k;
import android.os.Handler;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChatListElement.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/g;", "T", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<T> f197515a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<T, G0> f197516b;

    /* renamed from: c, reason: collision with root package name */
    public int f197517c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Handler f197518d = new Handler();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f197519e = new Runnable() { // from class: com.avito.android.messenger.widget.chat_list_element.f
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            g gVar = this.f197514b;
            int i12 = gVar.f197517c;
            List<T> list = gVar.f197515a;
            ((c) gVar.f197516b).invoke(list.get(i12 % list.size()));
            gVar.f197517c++;
            gVar.f197518d.postDelayed(gVar.f197519e, 300L);
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.messenger.widget.chat_list_element.f] */
    public g(@k l lVar, @k List list) {
        this.f197515a = list;
        this.f197516b = lVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No values to animate");
        }
    }
}
