package com.avito.android.messenger;

import android.os.Parcelable;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.K3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.o0;
import kotlin.text.C43059p;

/* compiled from: TextToChunkConverterFixed.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/s0;", "Lcom/avito/android/messenger/q0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43059p f196941a = new C43059p("[^\\s]+");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43059p f196942b = new C43059p("[[a-zA-Z0-9][\\\\!\"#$%&'\\(\\)\\*\\+,-\\./:;\\<\\=\\>\\?@\\[\\]\\^_`\\{\\|\\}~]]+");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43059p f196943c;

    public s0() {
        K3.f318642a.getClass();
        this.f196943c = new C43059p(K3.f318643b);
    }

    @Override // com.avito.android.messenger.q0
    @Y61.k
    public final ArrayList a(@Y61.k String str) {
        Parcelable link;
        kotlin.sequences.o0 o0Var = new kotlin.sequences.o0(C43059p.c(this.f196941a, str), new r0(str, this, new l0.f()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o0.a aVar = new o0.a(o0Var);
        while (aVar.f410559b.hasNext()) {
            Object next = aVar.next();
            C32571t c32571t = ((C32564s) next).f196940c;
            Object arrayList = linkedHashMap.get(c32571t);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c32571t, arrayList);
            }
            ((List) arrayList).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C32571t c32571t2 = (C32571t) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                link = null;
            } else {
                int i12 = ((C32564s) C42745f0.E(list)).f196938a;
                int i13 = ((C32564s) C42745f0.Q(list)).f196939b;
                link = c32571t2.f197429a ? new MessageBody.Text.Chunk.Link(i12, i13) : new MessageBody.Text.Chunk.Plain(i12, i13);
            }
            if (link != null) {
                arrayList2.add(link);
            }
        }
        return arrayList2;
    }
}
